package examen.transportes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adolfo
 */
public class Principal {

    static private List<Entrega> entregas = new ArrayList(100);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        leerFicheroEntrada();
        System.out.println();
        generarListado2();
    }

    private static void leerFicheroEntrada() {
        String cadena;
        FileReader fr = null;
        BufferedReader br = null;
        String ruta = "/home/adolfo/NetBeansProjects/Examen transportes/datos.txt";
        
        try {
            fr = new FileReader(ruta);
        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el fichero de datos en la ruta \"" + ruta + "\"");
            System.exit(0);
        }        
        
        br = new BufferedReader(fr);
        try {
            while ((cadena = br.readLine()) != null) {
                System.out.println(cadena);
                
                String pais = cadena.substring(0, 15);
                Fecha fecha;
                try {
                    fecha = new Fecha(cadena.substring(15, 23));
                } catch (FechaException ex) {
                    System.out.println("Línea con errores en fecha ignorada.");
                    continue;
                }
                String tipo = cadena.substring(23, 38);
                
                int toneladas;
                try {
                    toneladas = Integer.parseInt(cadena.substring(39, 50));
                } catch (NumberFormatException ex) {
                    System.out.println("Línea con errores en peso ignorada.");
                    continue;
                }
                Entrega entrega = new Entrega(pais, fecha, tipo, toneladas);
                entregas.add(entrega);
            }
            br.close();
        } catch (IOException ex) {
            System.out.println("Problemas procesando el fichero de datos");
        } 
    }
    
    private static void generarListado() {
        class Clave {
            String pais;
            int mes;

            public Clave(String pais, int mes) {
                this.pais = pais;
                this.mes = mes;
                
                
            }            

            @Override
            public String toString() {
                return "(" + pais + "," + mes + ")";
            }

            @Override
            public boolean equals(Object o) {
                if (!pais.equals(((Clave) o).pais)) {
                    return false;
                }
                
                if (mes != ((Clave) o).mes) {
                    return false;
                }
                
                return true;
            }

            @Override
            public int hashCode() {
                return 0;
            }
            
            
        }
        
        Map<Clave, Integer> datosListado = new HashMap() {
            
        };
        
        for (Entrega entrega: entregas) {
            Clave clave = new Clave(entrega.getPais(), entrega.getFechaEntrega().getMes());
            if (datosListado.containsKey(clave)) {
                int toneladas = datosListado.get(clave);
                datosListado.replace(clave, toneladas + entrega.getToneladas());
            } else {
                datosListado.put(clave, entrega.getToneladas());
            }
        }
        
        datosListado.forEach((clave, valor) -> {
            System.out.println("País: " + clave.pais + " Mes: " + clave.mes 
                    + " Toneladas: " + valor);
        });
            
    }
    
    private static void generarListado2() {
        entregas.sort(new Comparator<Entrega>() {
            @Override
            public int compare(Entrega t1, Entrega t2) {
                if (t1.getPais().compareTo(t2.getPais()) != 0)
                    return t1.getPais().compareTo(t2.getPais());                                
                
                if (t1.getFechaEntrega().getMes() == t2.getFechaEntrega().getMes())
                    return 0;
                else if (t1.getToneladas() < t2.getToneladas())
                    return +1;
                else 
                    return -1;
            }
        });
        
        List<String> paises = new ArrayList(100);
        for (Entrega entrega: entregas) {
            if (paises.contains(entrega.getPais())) {                
            } else {
                paises.add(entrega.getPais());
            }
        }
    }
}

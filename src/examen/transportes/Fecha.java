package examen.transportes;

/**
 *
 * @author adolfo
 */
public class Fecha {
    private String fechaAaaaMmDd;
    
    public Fecha(String fechaAaaaMmDd) throws FechaException {
        if (fechaAaaaMmDd.length() != 8)
            throw new FechaException("La longitud de la fecha debe ser 8");
        
        int mes = Integer.parseInt(fechaAaaaMmDd.substring(4, 6));
        if (mes < 1 || mes > 12)
            throw new FechaException("El mes de la ficha debe estar comprendido entre 1 y 12");
        
        this.fechaAaaaMmDd = fechaAaaaMmDd;
    }        

    /**
     * Get the value of fechaAaaaMmDd
     *
     * @return the value of fechaAaaaMmDd
     */
    private String getFechaAaaaMmDd() {
        return fechaAaaaMmDd;
    }

    /**
     * Set the value of fechaAaaaMmDd
     *
     * @param fechaAaaaMmDd new value of fechaAaaaMmDd
     */
    private void setFechaAaaaMmDd(String fechaAaaaMmDd) {
        this.fechaAaaaMmDd = fechaAaaaMmDd;
    }

    public int getMes() {
        return Integer.parseInt(fechaAaaaMmDd.substring(4, 6));
    }
}

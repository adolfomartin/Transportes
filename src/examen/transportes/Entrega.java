package examen.transportes;

/**
 *
 * @author adolfo
 */
public class Entrega {
    
    private String pais;    
    private Fecha fechaEntrega;        
    private String tipoEntrega;
    private int toneladas;

    public Entrega(String pais, Fecha fechaEntrega, String tipoEntrega, int toneladas) {
        this.pais = pais;
        this.fechaEntrega = fechaEntrega;
        this.tipoEntrega = tipoEntrega;
        this.toneladas = toneladas;
    }
    
    
    
    /**
     * Get the value of tipoEntrega
     *
     * @return the value of tipoEntrega
     */
    public String getTipoEntrega() {
        return tipoEntrega;
    }

    /**
     * Set the value of tipoEntrega
     *
     * @param tipoEntrega new value of tipoEntrega
     */
    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    /**
     * Get the value of toneladas
     *
     * @return the value of toneladas
     */
    public int getToneladas() {
        return toneladas;
    }

    /**
     * Set the value of toneladas
     *
     * @param toneladas new value of toneladas
     */
    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    /**
     * Get the value of fechaEntrega
     *
     * @return the value of fechaEntrega
     */
    public Fecha getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Set the value of fechaEntrega
     *
     * @param fechaEntrega new value of fechaEntrega
     */
    public void setFechaEntrega(Fecha fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    
    /**
     * Get the value of pais
     *
     * @return the value of pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Set the value of pais
     *
     * @param pais new value of pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

}

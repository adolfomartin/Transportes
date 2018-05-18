/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.transportes;

/**
 *
 * @author adolfo
 */
public class NewClass {
    
    private String string;

    public NewClass(String string) {
        this.string = string;
    }

    public NewClass(String string, String string2) {
        this.string = string;
        this.string2 = string2;
    }
    
    

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }

        private String string2;

    /**
     * Get the value of string2
     *
     * @return the value of string2
     */
    public String getString2() {
        return string2;
    }

    /**
     * Set the value of string2
     *
     * @param string2 new value of string2
     */
    public void setString2(String string2) {
        this.string2 = string2;
    }

}

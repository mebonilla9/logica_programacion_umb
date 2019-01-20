/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.parcialcortedos.negocio.constantes;

/**
 *
 * @author Manuel Ernesto Bonilla <email>mebonilla9@gmail.com</email>
 * <code>1023876679</code>
 */
public enum EInternacionales {

    AME_NTE(12, "América del Norte", 2.0),
    AME_CEN(15, "América Central", 2.2),
    AME_SUR(18, "América del Sur", 4.5),
    EUR(19, "Europa", 3.5),
    ASIA(25, "ASIA", 6),
    AFRICA(26, "África", 6),
    OCEA(29, "Oceania", 5);

    private final int clave;
    private final String zona;
    private final double precio;

    

    private EInternacionales(int clave, String zona, double precio) {
        this.clave = clave;
        this.zona = zona;
        this.precio = precio;
        
    }

    /**
     * @return the clave
     */
    public int getClave() {
        return clave;
    }

    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        StringBuilder zonas = new StringBuilder();
        for (EInternacionales inter : EInternacionales.values()) {
            zonas.append("Zona: ").append(inter.zona).append("\n");
        }

        return zonas.toString();
    }

}

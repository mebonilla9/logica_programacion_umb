/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.tecnologia.modelo.entidades;

/**
 *
 * @author Lord_Nightmare
 */
public class Computador {

    private String serial;
    private String marca;
    private String procesador;
    private String disco;
    private boolean camara;
    private boolean cd;
    private boolean maletin;
    private String memoriaRam;
    private String rutaImagen;

    /**
     * @return the serial
     */
    public String getSerial() {
        return serial;
    }

    /**
     * @param serial the serial to set
     */
    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the disco
     */
    public String getDisco() {
        return disco;
    }

    /**
     * @param disco the disco to set
     */
    public void setDisco(String disco) {
        this.disco = disco;
    }

    /**
     * @return the camara
     */
    public boolean isCamara() {
        return camara;
    }

    /**
     * @param camara the camara to set
     */
    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    /**
     * @return the cd
     */
    public boolean isCd() {
        return cd;
    }

    /**
     * @param cd the cd to set
     */
    public void setCd(boolean cd) {
        this.cd = cd;
    }

    /**
     * @return the maletin
     */
    public boolean isMaletin() {
        return maletin;
    }

    /**
     * @param maletin the maletin to set
     */
    public void setMaletin(boolean maletin) {
        this.maletin = maletin;
    }

    /**
     * @return the memoriaRam
     */
    public String getMemoriaRam() {
        return memoriaRam;
    }

    /**
     * @param memoriaRam the memoriaRam to set
     */
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    /**
     * @return the rutaImagen
     */
    public String getRutaImagen() {
        return rutaImagen;
    }

    /**
     * @param rutaImagen the rutaImagen to set
     */
    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public int homologarMarca() {
        switch (this.marca) {
            case "Apple":
                return 1;
            case "Asus":
                return 2;
            case "Hp":
                return 3;
            case "Lenovo":
                return 4;
            case "Sony":
                return 5;
            default:
                return 0;
        }
    }
    
    public int homologarDisco() {
        switch (this.disco) {
            case "64 GigaBytes":
                return 1;
            case "128 GigaBytes":
                return 2;
            case "256 GigaBytes":
                return 3;
            case "512 GigaBytes":
                return 4;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return this.serial + " - "+this.marca;
    }
    
    

}

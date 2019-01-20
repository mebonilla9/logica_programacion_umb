/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.zoo.persistencia.entidades;

import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Intinerario {

    public long codigo;
    public LocalTime hora;
    public LocalTime duracion;
    public double longitud;
    public int maxVisitantes;
    public List<Zona> zonas;
    public List<Especie> especies;
    public List<GuiaIntinerario> guiasAsignados;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.zoo.persistencia.entidades;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Especie {

    public String nombre;
    public String nombreCientifico;
    public String descripcion;
    public LocalDate fechaAsignacion;
    public List<Habitat> habitats;
    public Zona zona;
    public List<CuidadorEspecie> cuidadoresAsignados;
}

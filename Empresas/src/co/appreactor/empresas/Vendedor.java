/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.empresas;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class Vendedor {

    public String codigo;
    public LocalDate fechaCaptacion;
    public String nombre;
    public String direccion;
    public Vendedor jefe;
    public Empresa empresa;
    public List<Vendedor> subordinados;
}

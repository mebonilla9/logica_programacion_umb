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
public class Empresa {

    public GrupoEmpresarial grupo;
    public LocalDate fechaEntradaGrupo;
    public double facturacionAnual;
    public Pais sedePrincipal;
    public List<Vendedor> vendedores;
    public AreaEmpresa areas;
    public EmpresaPais paises;
    public AsesorEmpresa asesores;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.tecnologia.modelo.archivos;

import co.appreactor.tecnologia.modelo.entidades.Computador;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lord_Nightmare
 */
public class ArchivoUtil {
    
    private final String rutaArchivo = System.getProperty("user.home") + File.separator + "tecnologia" + File.separator + "computadores.json";
    
    public ArchivoUtil() {
        File carpeta = new File(rutaArchivo);
        if (!carpeta.getParentFile().exists()) {
            carpeta.getParentFile().mkdirs();
        }
    }
    
    public List<Computador> leerComputadores() throws IOException {
        List<Computador> listaComputadores = new ArrayList<>();
        BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
        StringBuilder resultado = new StringBuilder();
        while (lector.ready()) {
            resultado.append(lector.readLine());
        }
        Type tipo = new TypeToken<List<Computador>>(){}.getType();
        listaComputadores = new Gson().fromJson(resultado.toString(), tipo);
        return listaComputadores;
    }
    
    public void escribirComputadores(List<Computador> listaComputador) throws IOException{
        BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo));
        escritor.write(new Gson().toJson(listaComputador));
        escritor.flush();
        escritor.close();
    }
    
}

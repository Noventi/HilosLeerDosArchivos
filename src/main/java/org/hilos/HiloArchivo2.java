package org.hilos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class HiloArchivo2 extends Thread {

    private String archivo;
    private String salida;

    

    
    @Override
    public void run (){

        String path = "src/main/resource/"+this.archivo+".txt";
        File ArchivoQueHayQueLeer = new File(path);
        String cadenas;

        try {

            File Archivo = new File(ArchivoQueHayQueLeer.getCanonicalPath());
            
            FileReader leer = new FileReader(Archivo);
            BufferedReader buffer = new BufferedReader(leer);

            while(!"salida".equals(this.salida)){
                while ((cadenas = buffer.readLine())!=null){
                    System.out.println(cadenas);
                }
            }
                        
            buffer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void nombreArchivo(String NombreArchivo){
        this.archivo = NombreArchivo;
    }

    public void setParameter (String PalabraParaSalir){
        this.salida = PalabraParaSalir;
    }



}
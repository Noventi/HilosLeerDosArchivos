package org.hilos;


import java.util.concurrent.TimeUnit;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HiloArchivo2 a = new HiloArchivo2();
        a.nombreArchivo("archivo2");
        a.start();
        HiloArchivo2 b = new HiloArchivo2();
        b.setDaemon(true);
        b.nombreArchivo("archivo1");
        b.start();
        pausa();
        a.setParameter("salida");
        pausa();


    }

    private static void pausa(){
        try{
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

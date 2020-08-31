package test;

import models.Alumno;
import models.Rol;

/**
 *      Segunda Parte - Actividad 4
 *      Integrantes:
 *      
 *      1.- Bustamante Bonfil Melquiades        201748133
 *      2.- Tlahuapa Coraza David               201736875
 *      3.- Yahuitl Rodríguez Jesús Alejandro   201744550
 *      4.- Parraguirre Lagunes Christiam       201758915
 */
class MiHilo extends Thread{
   //Construye un nuevo hilo.
    private Alumno alumno;
    MiHilo(String nombre, Alumno alumno){
        //super se usa para llamar a la versión del constructor de Thread
        super(nombre);
        this.alumno = alumno;
    }
    //Punto de entrada del hilo
    public void run(){
        // Como ExtendThread extiende de Thread, puede llamar directamente 
        // a todos los métodos de Thread, incluido el método getName().
        try {
            Thread.sleep(5);
            System.out.println(this.alumno);
        }catch (InterruptedException exc){
            System.out.println(getName()+ " interrumpido.");
        }
    }

}
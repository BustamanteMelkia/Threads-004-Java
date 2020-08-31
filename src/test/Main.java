/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import models.Alumno;
import models.Rol;

/**
 *
 * @author melquia
 */
public class Main {
        public static void main(String args[]){ 
        
        Alumno alumnos [] = new Alumno[4];
        
        alumnos[0] = new Alumno("Melquiades","Bustamante", "Bonfil","201748133",Rol.LIDER);
        alumnos[1] = new Alumno("David","Tlahuapa", "Coraza  ","201736875",Rol.PROGRAMADOR);
        alumnos[2] = new Alumno("Jesús","Yahuitl", "Rodriguez","201744550",Rol.TESTER);
        alumnos[3] = new Alumno("Cristiam","Parraguirre", "Lagunes","201758915",Rol.DISENIADOR);
        for(Alumno alumno : alumnos)
            new MiHilo("hilo1",alumno).start();
    }
}

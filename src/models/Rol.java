/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author melquia
 */
public enum Rol {
    LIDER("Lider"),
    PROGRAMADOR("Programador"),
    TESTER("Tester"),
    DISENIADOR("Diseñador");
    
    private final String rol;
    private Rol(String rol){
        this.rol = rol;
    }
    
    @Override
    public String toString(){
        return this.rol;
    }
}

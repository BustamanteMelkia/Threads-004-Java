
package models;

/**
 * @author melquia
 */
public class Alumno {
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String matricula;
    private String rol;

    Alumno(){
        this.nombre = "";
        this.apPaterno = "";
        this.apMaterno = "";
        this.matricula = "";
        this.rol = "";
    }
    Alumno(String nombre, String apPaterno, String apMaterno,String matricula, String rol){
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.matricula = matricula;
        this.rol = rol;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getRol() {
        return rol;
    }
    
}

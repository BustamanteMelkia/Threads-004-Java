package models;

/**
 *
 * @author melquia
 */
class MiHilo extends Thread{
   //Construye un nuevo hilo.
    private Alumno alumnos [];
    MiHilo(String nombre, Alumno alumnos []){
        //super se usa para llamar a la versión del constructor de Thread
        super(nombre);
        this.alumnos = alumnos;
    }
    //Punto de entrada del hilo
    public void run(){
        // Como ExtendThread extiende de Thread, puede llamar directamente 
        // a todos los métodos de Thread, incluido el método getName().
        try {
            for (Alumno alumno : alumnos){
                Thread.sleep(5);
                System.out.println(alumno.getNombre()+" "+alumno.getApPaterno()+" "+alumno.getApMaterno()+" \tMatricula: "+alumno.getMatricula()+", \tRol: "+alumno.getRol());
            }
        }catch (InterruptedException exc){
            System.out.println(getName()+ " interrumpido.");
        }
    }
    public static void main(String args[]){ 
        Alumno alumnos [] = new Alumno[4];
        alumnos[0] = new Alumno("Melquiades","Bustamante", "Bonfil","201748133","Lider");
        alumnos[1] = new Alumno("David","Tlahuapa", "Coraza  ","201736875","Programador");
        alumnos[2] = new Alumno("Jesús","Yahuitl", "Rodriguez","201744550","Tester");
        alumnos[3] = new Alumno("Cristiam","Parraguirre", "Lagunes","201758915","Diseñador");
        MiHilo miHilo=new MiHilo("hilo1",alumnos); 
        miHilo.start();
    }
}
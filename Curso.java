package ejemploinsc;

public class Curso
{
    private int idCurso;
    private String nombre;
    private double matricula;
    private static int contador;
    
    private Curso(){
        this.idCurso = ++Curso.contador;    
    }
    
    public Curso(String nombre, double matricula){
        this();
        this.nombre = nombre;
        this.matricula = matricula;
    }
    
    public double getMatricula(){
        return this.matricula;
    }
    
    public String toString(){
        return "el id curso es: "+this.idCurso+
               " el nombre es: "+this.nombre+
               " la matricula es: "+this.matricula;
    }
    

}

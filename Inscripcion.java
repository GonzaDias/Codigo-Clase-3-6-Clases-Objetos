package ejemploinsc;

public class Inscripcion
{
    private int idInscripcion;
    private Curso cursos[];
    private String nombreAlum;
    private int edadAlum;
    private static int contador;
    private int x;
    
    private Inscripcion(){
        this.idInscripcion = this.contador + 1;
        cursos = new Curso[5];
    }
    
    public Inscripcion(String nombreAlum, int edadAlum){
        this();
        this.nombreAlum = nombreAlum;
        this.edadAlum = edadAlum;
    }
    
    public void AgregarCurso(Curso curso){
        this.cursos[x] = curso;
        x++;
    }
    
    public double getTotalAbonar(){
        double total=0;
        for(int i = 0 ; i < x ; i++ ){
            total = this.cursos[i].getMatricula() + total;
        }
        return total;
    }
    
    public void getInscripcion(){
        System.out.println(this.idInscripcion);
        System.out.println(this.nombreAlum);
        System.out.println(this.edadAlum);
        for(int i = 0 ; i < x ; i++ ){
            System.out.println(this.cursos[i]);
        }
        
    }

}


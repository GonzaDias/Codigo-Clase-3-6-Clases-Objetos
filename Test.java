package ejemploinsctest;

import ejemploinsc.*;
public class Test
{
   public static void main(String args[]){
       Curso curso1 = new Curso("peluqueria" , 500);
       Curso curso2 = new Curso("operador PC" , 800);
       Inscripcion insc1 = new Inscripcion("Jose", 28);
       
       insc1.AgregarCurso(curso1);
       insc1.AgregarCurso(curso2);
       System.out.println(insc1.getTotalAbonar());
       
       //System.out.println(curso1);
       //System.out.println(curso2);
    }
}

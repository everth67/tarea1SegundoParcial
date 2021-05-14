
/**
 * Write a description of class CicloDos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CicloDos
{
      public String iniciar(int numero){
      String mensaje = "1,1,1"; 
      int a = 1;
      int b = 1;
      int c = 1;
      int d = 0;
      for(int i = 3; i < numero; i++){
         d = a + b;
         a = b;
         b = c;
         c = d;
         mensaje = mensaje + ","+ d;
      }
      return mensaje;
   }
}

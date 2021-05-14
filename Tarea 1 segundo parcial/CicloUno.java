
/**
 * Write a description of class CicloUno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CicloUno
{
    public String iniciar(int numero){
        String mensaje = "";
        boolean ascendente = true;
        int actu = 1;
        int suma = 0;
        int result = 0;
        for(int i = 0; i < numero; i++){
           if(ascendente){
               result = actu + suma;
               actu = result;
               suma++;
               mensaje = mensaje+","+ result;
               if(suma == 3){
                   ascendente = false;
               }else{
                
               }
           }else{
               result = actu + suma;
               actu = result;
               suma--;
               mensaje = mensaje+","+ result;
               if(suma == 1){
                   ascendente = true;
               }else{
                
               } 
           }
        }
        return mensaje;
    }
}

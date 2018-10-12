/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercero;

/**
 *
 * @author ediso
 */
public class Precio {
     private double euros;

    public double obtener() {
        //se agrega el return 0 para retornar algo
       //return 0;
       return euros;
    }

    public void agregar(double x) {
        //aqui lo defino al metodo
        euros=x;
    }
  
    
//Este metodo public Precio se asocia directamente con p new Precio de la clase principal    
    public Precio(){
        agregar(30.2);
    }
    
//Este es otro constructor, se pueden agregar muchos constructores, cada constructor se asocia con la caracteristica de los constructores que reciben o no parametros ejemplo-> clase precio que recibe parametros y no recibe->
    public Precio(double y){
        agregar(y);
}
}

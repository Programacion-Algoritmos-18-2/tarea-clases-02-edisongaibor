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
public class Principal {
    public static void main(String[] args){
        Precio p;
        p=new Precio();
       // System.out.println(p.euros);
        
        //p.euros=10.1;
        //System.out.println(p.euros);
          
        
        //Parametros Constructores
        Precio n=new Precio(259);
        
        
        
        
            System.out.println(p.obtener());
            System.out.println(n.obtener());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Michelle
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        
        System.out.println(tomar_decisiones("Primera y última decisión"));
        
        System.out.println(tomar_operación("Sumar y restar"));
        
    }
    
    public static String tomar_decisiones(String decision){            
        return decision;
    }
    
    public static String tomar_operación(String operación){            
        return operación;
    }
}

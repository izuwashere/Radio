
package Servicio;

import entidad.circuferencia;
import java.util.Scanner;

//Donde se piden datos y ejecutan metodos.
public class Servicio {
    Scanner leer = new Scanner(System.in);
    
    circuferencia circu = new circuferencia ();
    
    //Se lee el radio.
    public void crearcircuferencia(){
        System.out.println("Inserte el radio");
        circu.setRadio(leer.nextDouble());
    }//Fin void.
    
    //Obtenemos el area
    public void area(){
        double radio =circu.getRadio();
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("El araea del circulo es: " +area);
    }//Fin void
    
    //Obtenemos el perimetro
    public void perimetro(){
        double radio = circu.getRadio();
        double perimetro = 2 *Math.PI * (radio);
        System.out.println("El perimetro del circulo es: " +perimetro);
    }//Fin void
}

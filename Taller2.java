/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package taller2;
  import java.util.Random;
/**
 *
 * @author Oliver
 */
public class Taller2 {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    /*punto1*/
        int num1=-2, num2=3, num3=4;
       
        if (num1>0){
                    System.out.println("el numero "+num1+" es negativo");
        }
        else{
                   System.out.println("el numero "+num1+" es positivo");
        }
        
        
        if (num2>0){
                    System.out.println("el numero "+num2+" es negativo");
        }
        else{
                   System.out.println("el numero "+num2+" es positivo");
        }
        
        if (num3>0){
                    System.out.println("el numero "+num3+" es negativo");
        }
        else{
                   System.out.println("el numero "+num3+" es positivo");
        }
    }
}
       
/*      punto 2
        int num=-2;
        if (num%2==0){
            System.out.println(num + " es par");
        }
        else {
            System.out.println("el numero no"+num+" es par");
        }
}
}*/

/*      punto3 
        int num=70;
        if (num>=60){
            System.out.println("aprobado");
        }
        else {
            System.out.println("reprobado");
        }
    }
}
*/

/*      punto 4
 int edad=65;
        if (edad<=12){
            System.out.println("niño");
        }
        else if(edad>=12 && edad <=17){
            System.out.println("adolecente");
        }
        else if(edad>=18 && edad <=59){
            System.out.println("adulto");
}
        else if(edad>60){
            System.out.println("adulto mayor");
        }
    }
}
*/
/*      punto 5

int lado1=4,lado2=3,lado3=2;
        if (lado1==lado2 && lado2==lado3){
            System.out.println("es equilatero");
        }
        else if(lado1==lado2 && lado3!=lado2){
            System.out.println("isoceles");
        }
        else if(lado2==lado3 && lado3!=lado1){
            System.out.println("eqilatero");
}
        else if(lado1==lado3 && lado2!=lado1){
            System.out.println("isoceles");
  }
        else{System.out.println("escaleno");
        }
    }
}
*/
/*      punto 6
double potencia=0,base=5,exp=-2;
       
       
        if(exp>0){
           
             potencia=Math.pow(base, exp);
             System.out.println("El resultado de la potencia con exponente positivo es "+potencia);
        }
        else if(exp==0){
            potencia=1;
            System.out.println("El resultado de la potencia con exponente cero es "+potencia);
        }
        else if(exp<0){
          potencia=Math.pow(base, exp);
         
            System.out.println("El resultado de la potencia con exponente negativa es "+(1/(potencia)));
        }
    }
}

*/

/*      punto 7
int dia=3;
if (dia==1){
        System.out.println("lunes");
        } else if (dia == 2) {
            System.out.println("martes");
        } else if (dia == 3) {
            System.out.println("miercoles");
        } else if (dia == 4) {
            System.out.println("jueves");
        } else if (dia == 5) {
            System.out.println("viernes");
        } else if (dia == 6) {
            System.out.println("sabado");
        } else if (dia == 7) {
            System.out.println("domingo");
        } else {
            System.out.println("el numero no esta entre 1 y 7");
        }
    }
}

*/

/*
 Random random= new Random();
       int rand= random.nextInt(21);
        
        System.out.println("numero aleatorio "+ rand);
    }
}
*/
/* punto 9
int dado = 1;

       if (dado == 1) {
            System.out.println("La cara opuesta es seis");
       } else if (dado == 2) {
            System.out.println("La cara opuesta es cinco");
       } else if (dado == 3) {
            System.out.println("La cara opuesta es cuatro");
       } else if (dado == 4) {
            System.out.println("La cara opuesta es tres");
       } else if (dado == 5) {
            System.out.println("La cara opuesta es dos");
       } else if (dado == 6) {
            System.out.println("La cara opuesta es uno");
       } else {
            System.out.println("no es una cara del dado");
       }
   }
}
*/

/* punto 10
int num1=-5,num2=-5,num3=18;
double media;
if (num1!=0 && num2 !=0 && num3 !=0){ 
    media=((num1+num2+num3)/3.0);
    System.out.println("la media de "+num1+" + "+num2+" + "+num3+" es "+media);
        }
    }
}
*/
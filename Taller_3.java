/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_3;
import java.util.Random;
import java.util.Scanner;
public class Taller_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
 
//1. Números del 1 al 10
/*      
for (int i=1;i<=10;i++){
    System.out.println("numeros del 1 al 10 numeros "+ i);
        }
    }
}        
*/

//2. Números pares del 1 al 100
/*
    for(int i=1;i<=100;i++){
    if(i%2==0)
    System.out.println("los numeros pares son "+i);
        }    
    }
}
*/

//3. Suma de números de 1 hasta N.
/*
int nun=5,c=0;
for (int i=0;i<=nun;i++){
    c=c+i;
    System.out.println("la suma de 1 hasta "+nun+" es "+c);
        }
    }
}
*/

//4. Tabla de multiplicar
/*
int nun=2,c;
for(int i=1;i<=10;i++){
    c=nun*i;       
    System.out.println("tabla del "+nun+"*"+i+"="+c);
        }  
    }
}
*/

//5. Contar números positivos,negativos y ceros
/*
int pos=0,neg=0,cero=0,nun=0;
 int min = -100;
 int max = 100;
for (int i=1 ;i<=100;i++){
Random random = new Random();
nun = random.nextInt((max - min) + 1) + min;
if(nun>0){
    pos++;
}
else if(nun<0){
    neg++;
}
else{
    cero++;
} 
System.out.println("numeros "+nun);
        }
        System.out.println("catida positivos es "+pos);
        System.out.println("catida negativos es "+neg);
        System.out.println("catida ceros es "+cero);
    }
}
*/

//6. Factorial de un número
/*
       int n = 6,c=1;
        for (int i=1;i<=n;i++){
         c=c*i;
        }
        System.out.printf("el factorial de "+n+" es "+c);
    }
}
*/

//7. Número mayor
/*
int nun,may=0;
for (int i=1 ;i<=5;i++){
Random random = new Random();
nun= random.nextInt(100)+ 1;
if(nun>may){
    may=nun;
    }System.out.println("el numero actual es "+nun+" y el mayor es "+ may);
        }
    }
}
*/

//8. Suma de números
/*
int nun=5,c=0;
    for (int i=1;i<=nun;i++){
        c=c+i;}
        if(nun>0){
         System.out.printf("es positivo la suma de 1 hasta "+nun+" es "+c);
        }else{System.out.printf("no valido");
        }  
    }
}
*/

//9. Cantidad de pares e impares
/*
int nun,par=0,imp=0,spar=0,simp=0;
Random random = new Random();
for (int i=1 ;i<=10;i++){

nun= random.nextInt(100)+ 1;
if(nun%2==0){
    par++;
    spar=spar+nun;
    } else{
        imp++;
        simp=simp+nun;
    }
    System.out.println("numeros "+nun);
        }
System.out.println("hay "+par+" pares y su suma es "+spar);
System.out.println("hay "+imp+" impares y su suma es "+simp);
    }
}
*/

//10. Número mayor y menor
/*
int nun,may=0,men=0;
Random random = new Random();
for (int i=1 ;i<=8;i++){
nun= random.nextInt(100)+ 1;

if (i==1) {
    may=nun;
    men=nun;}
if(nun>may){
    may=nun;
}
if(nun<men){
    men=nun;  
}
System.out.println("numeros "+nun);
}    
        System.out.println("el mayor es "+ may);
        System.out.println("el menor es "+ men);
    }
}
*/

//11. Serie numérica
/*
int nun=15;
        System.out.println("la serie de 1 hasta "+nun+ " es");
    for (int i=1;i<=nun;i++){
         System.out.printf(i+" ");
        }  
    }
}
*/

//12


int nun,pos=0,neg=0,sum=0,may=0,men=0,c=0;
double prom = 0;
Scanner sc = new Scanner(System.in);
for (int i=1;i<=8;i++){
    System.out.print("Ingrese el numero " + i + ": ");
    nun = sc.nextInt();
    if(nun==0){
        break;
    }
    c++;
    sum=sum+nun; 
    if (nun>0){
    pos++;
    }
    if(nun<0){
    neg++;
    }
     if (i == 1) {
        may = nun;
        men = nun;
    }
    if (nun> may) {
        may = nun;
    }
    if (nun < men) {
        men = nun;
        }
    if(c>0){
     prom = (double) sum / c;
    }
}
        System.out.println("la cantidad de positivos es "+pos);
        System.out.println("la cantidad de negativos es "+neg);
        System.out.println("la suma de todos los numeros es "+sum);
        System.out.println("el promedio de todos los numeros es "+prom);
        System.out.println("el menor es "+men);
        System.out.println("el mayor es "+may);
        
    }
}
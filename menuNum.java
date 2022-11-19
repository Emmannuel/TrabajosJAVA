import java.util.Scanner;
public class menuNum {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    double n, opc, x=1, i,  fact=1;
    boolean primo = false;
    System.out.printf("Escribe un numero: ");
    n = leer.nextInt();
    while(x<=4){
      System.out.printf("---Menú de un numero.---\n1.-Comprobar si es un numero primo.\n2.-Factorial\n3.-Tabla de multiplicar.\n4.-Salir.\nElije una opción: ");
      opc = leer.nextDouble();
      System.out.println("------------------------");
      if(opc==1){
        for(int a=2;a<=n/2;a++){
          if(n%a==0){
            primo=true;
          } 
        }
        if(!primo){
            System.out.println("El numero "+n+" es primo.");
        } else {
            System.out.println("El numero "+n+" no es primo.");
        }
      } else if(opc==2){
        for(i=n;i>0;i--){
          fact=fact*i;
        }
        System.out.println("El factorial del número "+n+" es: "+fact);
      } else if(opc==3){
        System.out.println("---Tabla del número "+n+"---");
        for(i=1;i<=10;i++){
          System.out.println(n+" X "+i+" = "+n*i);
        }
      } else if(opc== 4){
        System.out.println("Adiós :) ");
        return ;
      } else {
        System.out.println("Elije una opción válida.");
      }
    }
  }
}
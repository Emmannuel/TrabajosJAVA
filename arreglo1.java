import java.util.Scanner;
public class arreglo1{
   public static void main(String args[]){
      Scanner l = new Scanner(System.in);
      int a[][]=new int[5][5],b[]=new int[5],su[]=new int[5],x,i,p=0,s=0;
      for(x=0;x<5;x++){
         for(i=0;i<5;i++){
            System.out.println("Arreglo A ["+x+"]["+i+"]");
            a[x][i]=l.nextInt();
            su[i]=su[i]+a[x][i];
         }
      }
      for(x=0;x<5;x++){
         if(x==0){
            s=su[x];
         }
         if(su[x]<s){
            s=su[x];
            p=x;
         }
      }
      System.out.println("La Columna es: "+p+". La suma es: "+s);
   }
}
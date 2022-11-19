import java.util.Scanner;
public class arreglo2{
   public static void main(String args[]){
      Scanner l = new Scanner(System.in);
      int a[][]=new int[5][5], b[]=new int[5], x, i;
      for(x=0;x<5;x++){
         for(i=0;i<5;i++){
            System.out.println("Arreglo A ["+x+"]["+i+"]");
            a[x][i]=l.nextInt();
         }
      }
      for(x=1;x<=5;x++){
			for(i=1;i<=5;i++){
				System.out.print(b[x-1][i-1]);
				if(x==i){
					b[x-1] = a[x-1][i-1];
            }
			}
			System.out.println(" ");
		}
		for(x=1;x<=5;x++){
			System.out.println(b[x-1]);
		}  
   }
}
import java.util.Scanner;
public class arreglo3{
	public static void main(String args[]) {
    Scanner l = new Scanner(System.in);
		int a[][]=new int[5][5], lt[]=new int[5], c, f, suma=0;
		for(f=0;f<5;f++){
			for(c=0;c<5;c++){
            System.out.println("Arreglo A ["+f+"]["+c+"]");
				a[f][c]=l.nextInt();
			}
		}
		for(f=0;f<5;f++){
			for(c=0;c<5;c++){
				System.out.print(a[f][c]+" ");
				if(f==c){
					lt[f] = a[f][c];
            } 
		   }
		System.out.println(" ");
      suma=suma+lt[f];
   	}
      System.out.println("La Suma de la diagonal es: "+suma);
	}
}


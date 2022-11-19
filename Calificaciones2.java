import java.util.Scanner;
public final class Calificaciones2{
	public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
	   int[][] productos;
	   double[] neto;
		System.out.print("Introduce el numero de clientes: ");
		int c = leer.nextInt();
		neto = new double[c];
		for (int i=0;i<c;i++){
			System.out.println("Cliente "+(i+1)+".");
         System.out.print("Escribe el numero de productos: ");
         int p = leer.nextInt();
         productos = new int[c][p];
			for (int j=0;j<3;j++){
				System.out.print("Producto #" + (j+1) + ": ");
				productos[i][j] = leer.nextInt();
			}
			neto[i] = s(productos[i], p);
         System.out.println("--------------------");
		}
      for(int x=0;x<c;x++){
      System.out.println("Cliente "+(x+1)+". Neto: "+neto[x]);
      }
    }
    static double s(int []sm, int po){
          int suma=0;
          for(int i=0;i<po;i++){
              suma += sm[i];
          }
          return suma;
    }
}
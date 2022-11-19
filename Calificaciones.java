import java.util.Scanner; 
public final class Calificaciones {
	public static void main(String[] args) {
      Scanner l = new Scanner(System.in);
	   int[][] cal;
	   double[] alum;
      double x,i,j;
		System.out.print("¿Cuantas alumnos introducirá?: ");
		alum = l.nextDouble();
		cal = new int[alum][3];
		alum = new double[alum];
		for (i=0;i<alum; i++){
			System.out.println("Alumno "+i+".");
			for (j=0;j<3;j++){
				System.out.print("Calificacion #" + (j) + ": "); 
            alum[i][j] = l.nextDouble();
			}
         System.out.println("-------------------");
			cal[i] = cali(cal[i]);        
		}
      for(x=0;x<alum;x++){
      System.out.println("Alumno "+x+". Tu promedio es: "+cal[x]);
      }
	}
	static double calculaPromedio(double[] cali){
		int suma = 0;
		for(int i=0;i<3;i++){
		suma += cali[i];
		return suma/3;
      }
	}
}
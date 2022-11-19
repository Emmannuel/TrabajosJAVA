import java.util.Scanner;
public class arreglo{
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int a[] = new int[5], b[] = new int[5], suma[] = new int[5], resta[] = new int[5], multi[] = new int[5], divi[] = new int[5];
    for(int x=0;x<5;x++){
        System.out.printf("Escribe un valor del arreglo A posicion "+x+": ");
        a[x] = leer.nextInt();
        System.out.printf("Escribe un valor del arreglo B posicion "+x+": ");
        b[x] = leer.nextInt();
        suma[x] = a[x]+b[x];
        resta[x] = a[x]-b[x];
        multi[x] = a[x]*b[x];
        divi[x] = a[x]/b[x];
    }
    System.out.println();
    for(int x=0;x<5;x++){
        System.out.printf("Suma "+x+": "+suma[x]+" | Resta "+x+": "+resta[x]+" | Multiplicacion "+x+": "+multi[x]+" | Division "+x+": "+divi[x]+"\n");
    }
    }
}
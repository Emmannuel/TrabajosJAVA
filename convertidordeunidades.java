import java.util.Scanner; 
   class convertidordeunidades{
   //declaracion de variables publicas
      public static int opc,opc1;
      public static double KM,MTS,CMS,i,n; // Variables de las "Unidades de Distancia"
     public static void main(String arg[]){
     
       Scanner leer = new Scanner(System.in);        
         System.out.println("-----CONVERSOR DE UNIDADES-----");
         System.out.println("1) CONVERTIR UNIDADES DE DISTANCIA");
         System.out.println("2) CONVERTIR UNIDADES DE PESO");
         System.out.println("3) CONVERTIR UNIDADES DE TEMPERATURA");
         System.out.println("4) ");
         System.out.println("5) ");
         System.out.println("-----SELECCIONA UNA OPCCION-----");
         opc= leer.nextInt();     
         switch(opc){         
         case 1:       
             System.out.println("-----CONVERSOR DE UNIDADES-----");
             System.out.println("1) CONVERTIR KM A MTS");
             System.out.println("2) CONVERTIR MTS A KMS");
             System.out.println("3) CONVERTIR CMS A MTS");
             System.out.println("4) CONVERTIR MTS A CMS");
             System.out.println("5) IMPRIMIR NUMEROS");
             System.out.println("-----SELECCIONA UNA OPCCION-----");     
             opc1 = leer.nextInt();           
                  switch(opc1){                
                  case 1:
                         System.out.println("Introduce el numero de: KM");
                         KM =  leer.nextInt();
                         MTS = KM*1000;
                         System.out.println("Los metros son: " + MTS + ".");
                         break;             
                  case 2:
                         System.out.println("Introduce el numero de: MTS");
                         MTS =  leer.nextInt();
                         KM = MTS/1000;
                         System.out.println("Los kilometros son: " + KM + ".");
                         break;                      
                  case 3:
                         System.out.println("Introduce el numero de: CMS");
                         CMS = leer.nextInt();
                         MTS = CMS/100;
                         System.out.println("Los metros son: "+ MTS + ".");
                         break;
                  case 4: 
                         System.out.println("Introduce el numero de: MTS");
                         MTS = leer.nextInt();
                         CMS = MTS*100;
                         System.out.println("Los centimetros son: "+ CMS + ".");
                         break;
                  case 5: 
                         System.out.println("Introduce el numero: ");
                         n = leer.nextInt();
                         for(i=1;i<=n;i++){
                              System.out.println( "numero: " + i + "." );
                         }
                         break;
                  default: System.out.println("Elige una opccion valida...");
                }     
         case 2:
             System.out.println("-----CONVERSOR DE UNIDADES-----");
             System.out.println("1) CONVERTIR KM A MTS");
             System.out.println("2) CONVERTIR MTS A KMS");
             System.out.println("3) CONVERTIR CMS A MTS");
             System.out.println("4) CONVERTIR MTS A CMS");
             System.out.println("5) IMPRIMIR NUMEROS");
             System.out.println("-----SELECCIONA UNA OPCCION-----");   
          }       
        } 
     }
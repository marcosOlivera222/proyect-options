import java.util.Scanner;

     public class Main {
         public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma ;
        double resta;
        int multi;
        double  dividir;
        int v1=0 , v2=0,v3=0,v4=0 ;


        System.out.println( "bienvenido ingrese el valor 1");
        v1=entrada.nextInt();


        System.out.println("ingrese el valor2");
             v2=entrada.nextInt();

        System.out.println("ingrese el  valor 3");
             v3=entrada.nextInt();

        System.out.println("ingrese el valor 4");
             v4=entrada.nextInt();
             suma = v1+v2;

             resta = v3-v4;

             multi = v1*v4;
             dividir = v4/v1;

         System.out.println(" el resultado de la suma del valor 1,2 es:"+suma);
             System.out.println(" el resultado de la resta del valor 3,4 es:"+resta);
             System.out.println(" el resultado de la multiplicacion del valor 1,4 es:"+multi);
             System.out.println(" el resultado de la divicion del valor 4,1 es:"+dividir);



         }
}
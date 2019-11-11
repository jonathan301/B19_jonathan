import java.util.Scanner;

public class Foca {
    
        public static void main(String[] args) {
            double per,area;
            
            System.out.println("INGRESE EL NUMERO DE LADOS");
            Scanner numlados= new Scanner (System.in);
            int nl= numlados.nextInt();
            
            System.out.println("LONGITUD");
            Scanner longlados= new Scanner (System.in);
            double ll= longlados.nextDouble();
            
            System.out.println("APOTEMA");
            Scanner apot= new Scanner (System.in);
            double ap= apot.nextDouble();
            
            per=nl*ll;
            System.out.println("PERIMETRO="+per);
            area=(per*ap)/2;
            System.out.println("AREA="+area);
            
            if (nl==6){
                System.out.println("HEXAGONO");
            }
                  
        }


}

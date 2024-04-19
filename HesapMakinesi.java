import java.util.Scanner;

public class HesapMakinesi{

static int bölmeislemi(int a, int b){


      return a/b;

   }



static int çarpmaislemi(int a, int b){


      return a*b;

   }



static int cikarmaislemi(int a, int b){


      return a-b;

   }


   static int toplamaislemi(int a, int b){


      return a+b;

   }



  public static void main(String[] args){

 Scanner giris=new Scanner(System.in);

 
int a;
int b;

 while(true){

 System.out.println("1) Toplama");
 System.out.println("2) Çikarma");
 System.out.println("3) Çarpma");
 System.out.println("4) Bölme");

int secim=giris.nextInt();

 switch(secim){

 case 1: a=giris.nextInt(); b=giris.nextInt(); System.out.println(toplamaislemi(a,b)); break;
 case 2: a=giris.nextInt(); b=giris.nextInt(); System.out.println(cikarmaislemi(a,b)); break;
 case 3: a=giris.nextInt(); b=giris.nextInt(); System.out.println(çarpmaislemi(a,b)); break;
 case 4: a=giris.nextInt(); b=giris.nextInt(); System.out.println(bölmeislemi(a,b)); break;

 default:
 
 System.out.println("Geçersiz değer girdiniz. Tekrar deneyin");
 
 break;

 }

 giris.close();
 }
    




 }


}
import java.io.*;


    public class classlar {

    double Genislik;
    double Uzunluk;

    double Alan()
    {
        return Genislik*Uzunluk;
    }
 
    double cevre()
    {
        return 2*(Genislik+Uzunluk);
    }



 public static void main(String[] args) throws IOException{

 BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
 
 String s;
 Double g,u,a,c;
 classlar dd=new classlar();
 
 System.out.println("\nGENISLIK...\n");
 s=in.readLine();
 g=Double.parseDouble(s);

 System.out.println("\nUZUNLUK...\n");
 s=in.readLine();
 u=Double.parseDouble(s);

 dd.Genislik=g;
 dd.Uzunluk=u;

 a=dd.Alan();
 c=dd.cevre();

 System.out.println("ALAN="+a);
 System.out.println("CEVRE="+c);
 
 }
}
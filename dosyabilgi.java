import java.io.*;  

public class dosyabilgi{
    public static void main(String[] args) throws IOException{
        
    String dosya="dosyabilgi.txt";

        FileWriter yaz1 = new FileWriter(dosya);
        yaz1.write("deneme test 123\n");
        
        yaz1.close();
        
   
        BufferedReader oku = new BufferedReader(new FileReader(dosya));
        String satir;
        

            while((satir=oku.readLine())!=null){
                System.out.println(satir);
            }
        
        oku.close();
        
    }
}   

import java.io.*;

class dosyakopyalama{

void main(String[] args) throws IOException{

    String kaynak="kaynakdosya.txt";
    String hedef="hedefdosya.txt";

    BufferedReader okuyan = new BufferedReader(new FileReader(kaynak)); 
    BufferedWriter yazan=new BufferedWriter(new FileWriter(hedef));
    
    String satir=okuyan.readLine();

    while(satir != null){
        yazan.write(satir);
        yazan.newLine();
    }

    okuyan.close();
    yazan.close();
       
    
    

    

 }
}
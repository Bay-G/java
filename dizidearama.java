import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dizidearama {
    
    public static void main(String[] args) throws IOException{




 BufferedReader oku=new BufferedReader(new InputStreamReader(System.in));
        String msj;

        
        msj=oku.readLine();
        int[] dizi={10,4,2,13,64};
        double ara=Double.parseDouble(msj);
        boolean x=false;

        for(int i=0;i<5;i++){
            if(ara==dizi[i]){
                x=true;
                
               
            }

           
        }

        if(x==true){
            System.out.println("dizi de var");

        }
        else{
            System.out.println("dizi de yok");
        }








    }

}

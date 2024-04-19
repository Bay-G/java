import java.util.*;


class Stackler{





    public static void main(String[] args){

        Scanner giris = new Scanner(System.in);

        Stack<String> stck= new Stack<>();

        // push(): stacke ekleme yapar
        // peek(): en tepedeki elemanı yazdırır
        // pop(): en tepedeki elemanı siler
        // seach(): stack içinde arama yapar ve kaçıncı sırada oludğunu yazar
        // size(): stack içinde kaç eleman olduğunu hesaplar
        String sec;
        

        stck.push("emre");
        stck.push("4");
        stck.push("deneme");
        stck.push("java");

        System.out.println("ilk stack "+stck);
        System.out.println("tepedeki stack "+stck.peek());
        System.out.println("tepedeki silinen eleman "+stck.pop());
        System.out.println("tepedeki stack silinmiş hali "+stck);


        

        System.out.print("aranacak kelimeyi gir: ");

        sec=giris.nextLine();
        System.out.println();
        System.out.println(stck.search(sec));

        while(!stck.isEmpty()){
            System.out.println("Stack dolu");
            stck.pop();
            stck.pop();
            stck.pop();

        }

       

        if(stck.empty()){
            System.out.println("Stack boş");
        }

        giris.close();
    }


}
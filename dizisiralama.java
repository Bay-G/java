public class dizisiralama {

    public static void main(String[] args){

    int[] dizi={1,3,2,5,4};
        
    int tmp=0;

    for(int i=0;i<4;i++){
        for(int j=0;j<4;j++){
            
            if(dizi[j+1]>dizi[j]){

                tmp=dizi[j];
                dizi[j]=dizi[j+1];
                dizi[j+1]=tmp;

            }

        }
    }

    System.out.println("dizi 1");

    for(int i=0;i<5;i++){

        System.out.print(dizi[i]+" ");

    }

    System.out.println("dizi 2");

    for(int i=4;i>=0;i--){

        System.out.print(dizi[i]+" ");

    }
}
}
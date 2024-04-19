class clas{

String isim;

private String sisim="Genckan";

public String getsisim(){
    return sisim;
}

}

class class_erisebilirlik{

    public static void main(String[] args){

        clas nesne=new clas();

        nesne.isim="Emre";

        System.out.println(nesne.isim+" "+nesne.getsisim());
        
    }

}
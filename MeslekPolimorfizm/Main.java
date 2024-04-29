package MeslekPolimorfizm;

public class Main {
    public static void main(String[] args) {

        Meslek doktor = new Meslek("doktor");
        Meslek muhendis = new Meslek("muhendis");

        System.out.println("Meslek tanımları belirtildiği gibidir: ");

        doktor.meslekTanımı();
        muhendis.meslekTanımı();
    }
}


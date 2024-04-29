package MeslekPolimorfizm;

public class Muhendis extends Meslek{

    private String meslekAdi;

    Muhendis(String meslekAdi) {
        super("Mühendis");
    }

    public void meslekTanımı() {
        System.out.println(": Bilimsel ve matematiksel prensipleri kullanarak çeşitli projelerde çalışır.");
    }

}

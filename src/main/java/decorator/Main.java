package decorator;

public class Main {

    public static void main(String[] args) {

        ICar audi = new Audi(1000);
        audi.showPrice();


        // 등급 a3
        ICar a3 = new A3(audi, "A3");
        a3.showPrice();

        // 등급 a4
        ICar a4 = new A4(audi, "A4");
        a4.showPrice();


        // 등급 a5
        ICar a5 = new A5(audi, "A5");
        a5.showPrice();

    }
}

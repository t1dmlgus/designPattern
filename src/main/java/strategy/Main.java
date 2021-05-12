package strategy;

public class Main {

    public static void main(String[] args) {


        Encoder encoder = new Encoder();

        //base64
        Base64Strategy base64Strategy = new Base64Strategy();
        //normal
        NormalStrategy normalStrategy = new NormalStrategy();
        //append
        AppendStrategy appendStrategy = new AppendStrategy();


        String message = "hello world";

        // base64
        encoder.setEncodingStrategy(base64Strategy);
        System.out.println(encoder.getMessage(message));

        // normal
        encoder.setEncodingStrategy(normalStrategy);
        System.out.println(encoder.getMessage(message));


        // append
        encoder.setEncodingStrategy(appendStrategy);
        System.out.println(encoder.getMessage(message));

    }
}

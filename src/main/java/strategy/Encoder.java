package strategy;

public class Encoder {


    private EncodingStrategy encodingStrategy;


    public String getMessage(String message) {
        
        return this.encodingStrategy.encode(message);
    }


    // 전략
    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }
}

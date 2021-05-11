package Adapter;

public class Main {

    public static void main(String[] args) {


        // 1. 헤어드라이기
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);     // 콘센트에 연결
        
        //2. 에어컨
        AirConditioner airConditioner = new AirConditioner();
        Electronic110V adapter = new SocketAdapter(airConditioner);

        connect(adapter);

        // 3. 청소기
        Cleaner cleaner = new Cleaner();
        Electronic110V adapter2 = new SocketAdapter(cleaner);

        connect(adapter2);


    }

    // 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerUp();

    }


}

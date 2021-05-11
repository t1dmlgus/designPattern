package Adapter;

public class SocketAdapter implements Electronic110V{
    // 어뎁터 클래스
    // 110V -> 220v

    public Electronic220V electronic220V;


    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerUp() {

        electronic220V.connect();
    }


}

package singleton;

public class SocketClient {

    //1. 싱글톤은 자기 자신을 객체로 가지고 있는다.
    private static SocketClient socketClient = null;

    //2. private의 생성자를 갖는다.
    private SocketClient() {

    }

    // 3. static 메소드를 통해서 getInstance 메서드를 제공한다.
    // static 메서드 -> 변수도 static
    public static SocketClient getInstance() {

        if (socketClient == null) {
            socketClient = new SocketClient();
        }

        return socketClient;

    }

    public void connect(){

        System.out.println("connect");

    }


}

package Adapter;

public class HairDryer implements Electronic110V {

    @Override
    public void powerUp() {
        System.out.println("헤어드라이기 110v on");
    }
}

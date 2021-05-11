package facade;

public class Reader {

    private String fileName;

    public Reader(String fileName) {
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("READER %s로 연결합니다.", fileName);
        System.out.println("msg = " + msg);
    }
    public void fileRead(){
        String msg = String.format("READER %s의 내용을 읽어옵니다.", fileName);
        System.out.println("msg = " + msg);
    }
    public void fileDisConnect(){
        String msg = String.format("READER %s을 종료합니다..", fileName);
        System.out.println("msg = " + msg);

    }

}

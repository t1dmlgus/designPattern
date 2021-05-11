package facade;

public class Main {

    public static void main(String[] args) {

//        // ftp
//        FTP ftpClient = new FTP("www.naver.com", 22, "/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//
//        // writer
//        Writer writer = new Writer("tt1.tmp");
//        writer.fileConnect();
//        writer.write();
//
//
//        // reader
//        Reader reader = new Reader("tt1.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//
//        // 연결 해제
//        reader.fileDisConnect();
//        writer.fileDisConnect();
//        ftpClient.disConnect();


        // 파사드 패턴
        SftpClient sftpClient = new SftpClient("www.naver02.com", 22, "/home/etc", "tt1.tmp");

        // 연결
        sftpClient.connect();

        // 쓰기
        sftpClient.writer();

        // 읽기
        sftpClient.read();

        // 해제
        sftpClient.disConnect();



    }
}

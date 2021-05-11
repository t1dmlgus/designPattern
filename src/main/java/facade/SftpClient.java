package facade;

public class SftpClient {

    private FTP ftp;
    private Reader reader;
    private Writer writer;


    public SftpClient(FTP ftp, Reader reader, Writer writer) {
        this.ftp = ftp;
        this.reader = reader;
        this.writer = writer;
    }

    // 오버로딩
    public SftpClient(String host, int port, String path, String fileName) {
        this.ftp = new FTP(host, port, path);
        this.reader = new Reader(fileName);
        this.writer = new Writer(fileName);
    }

    // 연결
    public void connect(){
        ftp.connect();
        ftp.moveDirectory();
        writer.fileConnect();
        reader.fileConnect();
    }

    // 해제
    public void disConnect(){
        writer.fileDisConnect();
        reader.fileDisConnect();
        ftp.disConnect();
    }

    // 읽기
    public void read(){
        reader.fileRead();
    }

    // 쓰기
    public void writer(){
        writer.write();
    }

}

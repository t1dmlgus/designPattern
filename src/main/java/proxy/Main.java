package proxy;

public class Main {

    public static void main(String[] args) {
//        Browser chrome = new Browser("www.naver.com");
//        chrome.show();
//        chrome.show();
//        chrome.show();
//        chrome.show();
//        chrome.show();

        IBrowser bro = new BrowserProxy("www.naver2.com");
        bro.show();
        bro.show();
        bro.show();
        bro.show();
        bro.show();

    }
}

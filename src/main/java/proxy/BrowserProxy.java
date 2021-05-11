package proxy;

public class BrowserProxy implements IBrowser{

    private String url;
    private HTML html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public HTML show() {

        if (html == null) {
            this.html = new HTML(url);

            System.out.println("browserProxy loading new html from " + url);
        }
        System.out.println("browserProxy use cache html from " + url);

        return html;
    }
}

package aop;

import proxy.HTML;
import proxy.IBrowser;


public class AopBrowser implements IBrowser {
// aop ->관점지향
    
    private String url;
    private HTML html;

    private Runnable before;
    private Runnable after;


    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public HTML show() {

        before.run();
        if(html == null){

            this.html = new HTML(url);

            System.out.println("AopBrowser html loading from " + url);

            try {

                Thread.sleep(1500);     // 1.5초
            } catch (InterruptedException e) {

                e.printStackTrace();
            }


        }

        after.run();

        System.out.println("AopBrowser use cache html loading from " + url);


        return null;
    }
}

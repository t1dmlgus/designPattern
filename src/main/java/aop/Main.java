package aop;

import proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        // 시간체크 -> 동시성문제

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver3.com",

                ()->{
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                ()->{
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        aopBrowser.show();
        System.out.println("loding time : " +end.get());

        aopBrowser.show();
        System.out.println("loding time : " +end.get());

        aopBrowser.show();
        System.out.println("loding time : " +end.get());


    }
}

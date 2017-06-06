package jp.co.geekduck.camelsample;

import org.apache.camel.spring.Main;

public class Application {
    public static void main(String[] args) throws Exception{
        System.out.println("start Application#main");
        Main main = new Main();
        main.setFileApplicationContextUri("routesConfig/*.xml");
        main.run(args);
    }
}

package jp.co.geekduck.camelsample;

import org.apache.camel.spring.Main;

public class Application {
    public static void main(String[] args) throws Exception{
        System.out.println("start Application#main");
        Main main = new Main();
        // String xmlRootDir = "routesConfig/**/";
        // main.setFileApplicationContextUri(xmlRootDir + "/*.xml");
        String xmlRootDir = "routesConfig/";
        main.setFileApplicationContextUri(xmlRootDir + "/**/*.xml");
        // main.setFileApplicationContextUri(xmlRootDir + "/camel-context.xml");
        // main.setFileWatchDirectory(xmlRootDir + "/bar");
        main.setFileWatchDirectory(xmlRootDir);
        // main.setFileWatchDirectoryRecursively(true);
        main.run(args);
    }
}

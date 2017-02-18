package ex03.pyrmont.test;

import org.apache.catalina.util.StringManager;

/**
 * @author dingjing@youku.com
 * @create 2017/2/18 16:47
 */
public class TestStringManager {
    public static void main(String[] args) {
        StringManager sm = StringManager.getManager("ex03.pyrmont.connector.http");

        System.out.println(sm.getString("httpConnector.alreadyInitialized"));
    }
}
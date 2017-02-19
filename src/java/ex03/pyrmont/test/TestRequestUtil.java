package ex03.pyrmont.test;

import org.apache.catalina.util.ParameterMap;
import org.apache.catalina.util.RequestUtil;

import java.io.UnsupportedEncodingException;

/**
 * @author dingjing@youku.com
 * @create 2017/2/19 15:02
 */
public class TestRequestUtil {
    public static void main(String[] args) {

        ParameterMap map = new ParameterMap();

        String str = "name=dj&msg=%E4%BD%A0%E5%A5%BD";

        try {
            RequestUtil.parseParameters(map, str, "ISO-8859-1");
            System.out.println(map.get("name"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
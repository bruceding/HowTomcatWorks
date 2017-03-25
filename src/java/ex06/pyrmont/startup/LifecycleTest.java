package ex06.pyrmont.startup;

import ex06.pyrmont.core.SimpleLifecycle;
import ex06.pyrmont.core.StartLifecycleListener;
import org.apache.catalina.LifecycleException;

/**
 * @author dingjing@youku.com
 * @create 2017/3/19 14:59
 */
public class LifecycleTest {
    public static void main(String[] args) throws LifecycleException {
        SimpleLifecycle simpleLifecycle = new SimpleLifecycle();
        simpleLifecycle.addLifecycleListener(new StartLifecycleListener());

        simpleLifecycle.start();
    }
}
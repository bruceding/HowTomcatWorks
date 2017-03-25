package ex06.pyrmont.core;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleEvent;
import org.apache.catalina.LifecycleListener;

/**
 * @author dingjing@youku.com
 * @create 2017/3/19 14:54
 */
public class StartLifecycleListener implements LifecycleListener{
    public void lifecycleEvent(LifecycleEvent lifecycleEvent) {

        if (lifecycleEvent.getType() == Lifecycle.START_EVENT) {

            System.out.println("start listener");
        }
    }
}

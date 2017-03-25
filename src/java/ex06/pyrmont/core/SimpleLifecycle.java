package ex06.pyrmont.core;

import org.apache.catalina.Lifecycle;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.LifecycleListener;
import org.apache.catalina.util.LifecycleSupport;

/**
 * @author dingjing@youku.com
 * @create 2017/3/19 14:56
 */
public class SimpleLifecycle implements Lifecycle{

    private LifecycleSupport lifecycle = new LifecycleSupport(this);
    public void addLifecycleListener(LifecycleListener lifecycleListener) {
       lifecycle.addLifecycleListener(lifecycleListener);
    }

    public LifecycleListener[] findLifecycleListeners() {
        return lifecycle.findLifecycleListeners();
    }

    public void removeLifecycleListener(LifecycleListener lifecycleListener) {
        lifecycle.removeLifecycleListener(lifecycleListener);

    }

    public void start() throws LifecycleException {
        lifecycle.fireLifecycleEvent(Lifecycle.START_EVENT, null);
    }

    public void stop() throws LifecycleException {
        lifecycle.fireLifecycleEvent(Lifecycle.STOP_EVENT, null);
    }
}

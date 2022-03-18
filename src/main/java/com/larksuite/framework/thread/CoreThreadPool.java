package com.larksuite.framework.thread;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public class CoreThreadPool {
    public static AbstractC26132a mCoreThreadPoolDep = null;
    public static volatile boolean sAppFront = true;
    protected static volatile Handler sBackgroundHandler = null;
    protected static HandlerThread sBackgroundHandlerThread = null;
    private static volatile CoreThreadPool sCoreThreadPoolInst = null;
    protected static volatile Handler sHighPriorityHandler = null;
    protected static HandlerThread sHighPriorityHandlerThread = null;
    private static boolean sNeedMonitor = true;
    private static boolean sNeedMonitorBackgroundTask = false;
    protected static volatile Handler sNonblockingHandler = null;
    protected static HandlerThread sNonblockingHandlerThread = null;
    private static String sTestSchedulePoolDelayFeatureName = "messenger.corethreadpool.testschdeuledelay";
    private C26155n mCacheThreadPool;
    private C26155n mFixedThreadPool;
    private ScheduledExecutorService mScheduleThreadPool;
    private Executor mUIExecutor = new ExecutorC26133b();

    /* renamed from: com.larksuite.framework.thread.CoreThreadPool$a */
    public interface AbstractC26132a {
        /* renamed from: a */
        void mo93030a(JSONObject jSONObject);

        /* renamed from: a */
        boolean mo93031a(String str);
    }

    public static JSONObject collectCoreThreadPoolMetric() {
        return null;
    }

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str, int i) {
        return C20341a.m74147a() ? C20339a.m74145a(str, i, C20341a.f49621b) : new HandlerThread(str, i);
    }

    public static boolean getNeedBackgroundTaskMonitor() {
        return sNeedMonitorBackgroundTask;
    }

    public static boolean needMonitorTask() {
        return sNeedMonitor;
    }

    public ExecutorService getCachedThreadPool() {
        return this.mCacheThreadPool;
    }

    public ExecutorService getFixedThreadPool() {
        return this.mFixedThreadPool;
    }

    public ScheduledExecutorService getScheduleThreadPool() {
        return this.mScheduleThreadPool;
    }

    public Executor getUIExecutor() {
        return this.mUIExecutor;
    }

    public static boolean getScheduleDelayTestOpen() {
        AbstractC26132a aVar = mCoreThreadPoolDep;
        if (aVar == null) {
            return false;
        }
        return aVar.mo93031a(sTestSchedulePoolDelayFeatureName);
    }

    public static CoreThreadPool getDefault() {
        if (sCoreThreadPoolInst == null) {
            synchronized (CoreThreadPool.class) {
                if (sCoreThreadPoolInst == null) {
                    sCoreThreadPoolInst = new CoreThreadPool("default");
                }
            }
        }
        return sCoreThreadPoolInst;
    }

    public static Handler getBackgroundHandler() {
        if (sBackgroundHandler == null) {
            synchronized (CoreThreadPool.class) {
                if (sBackgroundHandler == null) {
                    HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("lark_background_sub", 10);
                    sBackgroundHandlerThread = new_android_os_HandlerThread_by_knot;
                    new_android_os_HandlerThread_by_knot.start();
                    sBackgroundHandler = new HandlerC26164r(sBackgroundHandlerThread.getLooper(), "lark_background_sub");
                    ((HandlerC26164r) sBackgroundHandler).mo93102a(2000, 1000);
                }
            }
        }
        return sBackgroundHandler;
    }

    public static Handler getNonblockingHandler() {
        if (sNonblockingHandler == null) {
            synchronized (CoreThreadPool.class) {
                if (sNonblockingHandler == null) {
                    HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("lark_nonblocking_sub");
                    sNonblockingHandlerThread = new_android_os_HandlerThread_by_knot;
                    new_android_os_HandlerThread_by_knot.start();
                    sNonblockingHandler = new HandlerC26164r(sNonblockingHandlerThread.getLooper(), "lark_nonblocking_sub");
                    ((HandlerC26164r) sNonblockingHandler).mo93102a(500, 200);
                }
            }
        }
        return sNonblockingHandler;
    }

    public static Handler getSerialTaskHandler() {
        if (sHighPriorityHandler == null) {
            synchronized (CoreThreadPool.class) {
                if (sHighPriorityHandler == null) {
                    HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("lark_sub");
                    sHighPriorityHandlerThread = new_android_os_HandlerThread_by_knot;
                    new_android_os_HandlerThread_by_knot.start();
                    sHighPriorityHandler = new HandlerC26164r(sHighPriorityHandlerThread.getLooper(), "lark_sub");
                    ((HandlerC26164r) sHighPriorityHandler).mo93102a(1000, 500);
                    C26168v.m94670b();
                }
            }
        }
        return sHighPriorityHandler;
    }

    public static void setDenpency(AbstractC26132a aVar) {
        mCoreThreadPoolDep = aVar;
    }

    public static void setNeedMonitor(boolean z) {
        sNeedMonitor = z;
    }

    public static Handler newThreadHandler(String str) {
        return newThreadHandler(str, null);
    }

    public ScheduledExecutorService getSingleScheduledThreadPool(String str) {
        return C26147i.m94623c(str);
    }

    public ExecutorService newSerialCpuDensityThreadPool(String str) {
        return new C26144g(str, 1);
    }

    public ExecutorService newSerialHighPriorityThreadPool(String str) {
        return new C26144g(str, 0);
    }

    public ExecutorService newSerialIODensityThreadPool(String str) {
        return new C26144g(str, 2);
    }

    public static void setAppFrontStats(boolean z) {
        sAppFront = z;
        if (z) {
            C26168v.m94670b();
        } else {
            C26168v.m94671c();
        }
    }

    /* renamed from: com.larksuite.framework.thread.CoreThreadPool$b */
    private static class ExecutorC26133b implements Executor {

        /* renamed from: a */
        private Handler f64524a = new Handler(Looper.getMainLooper());

        public void execute(Runnable runnable) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f64524a.post(runnable);
            }
        }
    }

    private CoreThreadPool(String str) {
        this.mCacheThreadPool = C26140e.d_(str);
        this.mFixedThreadPool = C26138c.c_(str);
        this.mScheduleThreadPool = new C26141f(str, 3, new ThreadFactoryC26153m("lk-schedule"));
        reflectAsyncTaskPool(this.mFixedThreadPool);
    }

    private static void reflectAsyncTaskPool(ExecutorService executorService) {
        try {
            Log.d("CoreThreadPool", "reflectAsyncTaskPool before:" + AsyncTask.THREAD_POOL_EXECUTOR);
            Field declaredField = AsyncTask.class.getDeclaredField("THREAD_POOL_EXECUTOR");
            declaredField.setAccessible(true);
            declaredField.set(null, executorService);
            Log.d("CoreThreadPool", "reflectAsyncTaskPool after:" + AsyncTask.THREAD_POOL_EXECUTOR);
        } catch (Throwable th) {
            Log.e("CoreThreadPool", "reflectAsyncTaskPool", th);
        }
    }

    public static Handler newThreadHandler(String str, Handler.Callback callback) {
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("lk_th_" + str);
        new_android_os_HandlerThread_by_knot.start();
        HandlerC26164r rVar = new HandlerC26164r(new_android_os_HandlerThread_by_knot.getLooper(), callback);
        rVar.mo93102a(2000, 5000);
        return rVar;
    }
}

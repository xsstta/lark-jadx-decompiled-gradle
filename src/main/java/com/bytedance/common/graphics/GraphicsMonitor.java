package com.bytedance.common.graphics;

import android.app.Activity;
import android.util.Log;
import com.bytedance.apm6.p187i.C3336c;
import com.bytedance.apm6.p187i.p191d.AbstractC3338a;
import com.bytedance.apm6.p187i.p191d.AbstractC3340c;
import com.bytedance.apm6.util.C3345a;
import com.bytedance.monitor.collector.C20152k;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class GraphicsMonitor {
    private static ScheduledFuture<?> gpuFuture = null;
    public static double gpuLoadDataOnce = -1.0d;
    private static ScheduledExecutorService gpuScheduleService;
    private static boolean isInit;
    private static boolean isInitGraphicsLoad;
    public static volatile boolean isPause;
    private static AbstractC3338a lifecycleService;
    private static long sCollectInterval;
    public static long sCollectWindow;
    private static int startTime;

    public static native void closeStatistical();

    public static native double getStatisticOnceData();

    public static native void openStatistical();

    private static native boolean startHook();

    public static synchronized double getByteGpu() {
        double d;
        synchronized (GraphicsMonitor.class) {
            d = gpuLoadDataOnce;
        }
        return d;
    }

    public static synchronized boolean isStart() {
        boolean z;
        synchronized (GraphicsMonitor.class) {
            if (startTime > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private static void initGraphicsLoad() {
        isInitGraphicsLoad = true;
        try {
            C20152k.m73539a(C3345a.m13917w());
            startHook();
            gpuScheduleService = Executors.newScheduledThreadPool(0);
        } catch (Throwable unused) {
            isInitGraphicsLoad = false;
        }
    }

    public static synchronized void init() {
        synchronized (GraphicsMonitor.class) {
            if (!isInit) {
                isInit = true;
                sCollectInterval = 15000;
                sCollectWindow = 100;
                AbstractC3338a aVar = (AbstractC3338a) C3336c.m13901a(AbstractC3338a.class);
                lifecycleService = aVar;
                aVar.mo13547a(new AbstractC3340c() {
                    /* class com.bytedance.common.graphics.GraphicsMonitor.C35871 */

                    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                    public void onActivityCreated(Activity activity) {
                    }

                    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                    public void onActivityPause(Activity activity) {
                    }

                    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                    public void onActivityResume(Activity activity) {
                    }

                    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                    public void onActivityStarted(Activity activity) {
                    }

                    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                    public void onBackground(Activity activity) {
                        GraphicsMonitor.isPause = true;
                    }

                    @Override // com.bytedance.apm6.p187i.p191d.AbstractC3340c
                    public void onFront(Activity activity) {
                        GraphicsMonitor.isPause = false;
                    }
                });
                if (lifecycleService.mo13548a()) {
                    isPause = false;
                }
            }
        }
    }

    public static synchronized void start() {
        synchronized (GraphicsMonitor.class) {
            if (isInit) {
                if (!isInitGraphicsLoad) {
                    initGraphicsLoad();
                }
                ScheduledExecutorService scheduledExecutorService = gpuScheduleService;
                if (scheduledExecutorService != null) {
                    int i = startTime + 1;
                    startTime = i;
                    if (i <= 1) {
                        RunnableC35882 r3 = new Runnable() {
                            /* class com.bytedance.common.graphics.GraphicsMonitor.RunnableC35882 */

                            public void run() {
                                try {
                                    if (!GraphicsMonitor.isPause) {
                                        GraphicsMonitor.openStatistical();
                                        Thread.sleep(GraphicsMonitor.sCollectWindow);
                                        GraphicsMonitor.closeStatistical();
                                        GraphicsMonitor.gpuLoadDataOnce = GraphicsMonitor.getStatisticOnceData();
                                    } else {
                                        GraphicsMonitor.gpuLoadDataOnce = -1.0d;
                                    }
                                    Log.i("atrace_gpu", "bytegpu: " + GraphicsMonitor.gpuLoadDataOnce);
                                } catch (Throwable unused) {
                                }
                            }
                        };
                        long j = sCollectInterval;
                        gpuFuture = scheduledExecutorService.scheduleWithFixedDelay(r3, j, j, TimeUnit.MILLISECONDS);
                    }
                }
            }
        }
    }

    public static synchronized void stop() {
        synchronized (GraphicsMonitor.class) {
            if (isInit) {
                int i = startTime - 1;
                startTime = i;
                if (i <= 0) {
                    gpuFuture.cancel(true);
                    gpuLoadDataOnce = -1.0d;
                }
            }
        }
    }
}

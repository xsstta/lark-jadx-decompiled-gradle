package com.bytedance.common.jato;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.common.jato.JatoConfig;
import com.bytedance.common.jato.boost.BoostListener;
import com.bytedance.common.jato.boost.CpuBoostManager;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.boost.MemoryManager;
import com.bytedance.common.jato.boost.PriorityManager;
import com.bytedance.common.jato.dex.VerifierModeSwitch;
import com.bytedance.common.jato.fdio.FDIOCollector;
import com.bytedance.common.jato.fdio.FDIOOperator;
import com.bytedance.common.jato.fdio.FDIOPreloaderManager;
import com.bytedance.common.jato.fdio.launch.FDIOLaunchWrapper;
import com.bytedance.common.jato.gcblocker.GcBlockerManager;
import com.bytedance.common.jato.lock.sp.SharedPreferencesManager;
import com.bytedance.common.jato.scheduler.JatoScheduler;
import com.bytedance.common.jato.shrinker.Shrinker;
import com.bytedance.common.jato.util.ActivityLifeManager;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.ss.ttm.player.MediaPlayer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Jato {
    private static JatoConfig sConfig;
    public static Context sContext;
    private static boolean sInitialized;
    private static ExecutorService sInnerExecutorService;
    private static boolean sIsDebug;
    private static JatoListener sListener;
    public static List<JatoListener> sListenerList;
    private static ExecutorService sWorkExecutorService;

    public static void promoteMainThreadPriority() {
    }

    public static void promoteMainThreadPriority(int i) {
    }

    public static void tryBoostStorage(long j) {
    }

    public static void bindBigCore() {
        CpusetManager.bindBigCore();
    }

    public static void bindLittleCore() {
        CpusetManager.bindLittleCore();
    }

    public static void enableClassVerify() {
        VerifierModeSwitch.enableVerifier();
    }

    public static JatoConfig getConfig() {
        return sConfig;
    }

    public static Context getContext() {
        return sContext;
    }

    public static ExecutorService getWorkExecutorService() {
        return sWorkExecutorService;
    }

    public static boolean isDebug() {
        return sIsDebug;
    }

    public static void releaseBoost() {
        CpuBoostManager.release();
    }

    public static void resetCoreBind() {
        CpusetManager.resetCoreBind();
    }

    public static void resetPriority() {
        PriorityManager.resetPriority();
    }

    public static void resetRenderThread() {
        PriorityManager.resetRenderThread();
    }

    public static void stopOptimizeLaunchLock() {
        SharedPreferencesManager.stopRecord();
    }

    public static void preloadCpusetInfo() {
        CpusetManager.init(getWorkExecutorService());
    }

    public static void shrinkVM() {
        shrinkVM(MediaPlayer.MEDIA_PLAYER_OPTION_APPID, 2048);
    }

    public static void disableClassVerify() {
        VerifierModeSwitch.init(sContext);
        VerifierModeSwitch.disableVerifier();
    }

    public static void optimizeLaunchIO() {
        if (Build.VERSION.SDK_INT > 22) {
            FDIOLaunchWrapper.start();
        }
    }

    public static void preloadBoostInfo() {
        CpuBoostManager.init(sContext, sWorkExecutorService, new BoostListener() {
            /* class com.bytedance.common.jato.Jato.C35913 */

            @Override // com.bytedance.common.jato.boost.BoostListener
            public void onDebug(String str) {
                Jato.getListener().onDebugInfo(str);
            }

            @Override // com.bytedance.common.jato.boost.BoostListener
            public void onError(String str, Throwable th) {
                Jato.getListener().onErrorInfo(str, th);
            }
        });
    }

    public static void stopOptimizeLaunchIO() {
        if (Build.VERSION.SDK_INT > 22) {
            FDIOLaunchWrapper.stop(false);
        }
    }

    public static ExecutorService getInnerExecutorService() {
        if (sInnerExecutorService == null) {
            synchronized (Jato.class) {
                if (sInnerExecutorService == null) {
                    sInnerExecutorService = Executors.newSingleThreadExecutor(new ThreadFactory() {
                        /* class com.bytedance.common.jato.Jato.ThreadFactoryC35968 */

                        public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
                            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
                        }

                        public Thread newThread(Runnable runnable) {
                            return new_insert_after_java_lang_Thread_by_knot(new Thread(runnable, "jato_inner_thread"));
                        }
                    });
                }
            }
        }
        return sInnerExecutorService;
    }

    public static synchronized JatoListener getListener() {
        JatoListener jatoListener;
        synchronized (Jato.class) {
            if (sListener == null) {
                sListener = new JatoListener() {
                    /* class com.bytedance.common.jato.Jato.C35979 */

                    @Override // com.bytedance.common.jato.JatoListener
                    public void onDebugInfo(String str) {
                        if (Jato.isDebug() && Jato.sListenerList != null) {
                            for (JatoListener jatoListener : Jato.sListenerList) {
                                if (jatoListener != null) {
                                    jatoListener.onDebugInfo(str);
                                }
                            }
                        }
                    }

                    @Override // com.bytedance.common.jato.JatoListener
                    public void onErrorInfo(String str, Throwable th) {
                        if (Jato.sListenerList != null) {
                            for (JatoListener jatoListener : Jato.sListenerList) {
                                if (jatoListener != null) {
                                    jatoListener.onErrorInfo(str, th);
                                }
                            }
                        }
                    }
                };
            }
            jatoListener = sListener;
        }
        return jatoListener;
    }

    public static void setPriority(int i) {
        PriorityManager.setPriority(i);
    }

    public static void tryCpuBoost(long j) {
        CpuBoostManager.tryCpuBoost(j);
    }

    public static void tryGpuBoost(long j) {
        CpuBoostManager.tryGpuBoost(j);
    }

    public static void bindBigCore(int i) {
        CpusetManager.bindBigCore(i);
    }

    public static void bindLittleCore(int i) {
        CpusetManager.bindLittleCore(i);
    }

    public static void resetCoreBind(int i) {
        CpusetManager.resetCoreBind(i);
    }

    public static void resetPriority(int i) {
        PriorityManager.resetPriority(i);
    }

    public static void startFDIOCollect(String str) {
        startFDIOCollect(str, false);
    }

    public static boolean tryCpuBoostWithResult(long j) {
        return CpuBoostManager.tryCpuBoost(j);
    }

    public static boolean tryGpuBoostWithResult(long j) {
        return CpuBoostManager.tryGpuBoost(j);
    }

    public static void requestBlockGc(final long j) {
        ExecutorService executorService = sWorkExecutorService;
        if (executorService != null) {
            executorService.execute(new Runnable() {
                /* class com.bytedance.common.jato.Jato.RunnableC35935 */

                public void run() {
                    GcBlockerManager.getInstance().requestBlockGc(j);
                }
            });
        }
    }

    public static void startBlockGc(final String str) {
        ExecutorService executorService = sWorkExecutorService;
        if (executorService != null) {
            executorService.execute(new Runnable() {
                /* class com.bytedance.common.jato.Jato.RunnableC35946 */

                public void run() {
                    GcBlockerManager.getInstance().startBlockGc(str);
                }
            });
        }
    }

    public static void stopBlockGc(final String str) {
        ExecutorService executorService = sWorkExecutorService;
        if (executorService != null) {
            executorService.execute(new Runnable() {
                /* class com.bytedance.common.jato.Jato.RunnableC35957 */

                public void run() {
                    GcBlockerManager.getInstance().stopBlockGc(str);
                }
            });
        }
    }

    public static void initScheduler(final int i) {
        ExecutorService executorService = sWorkExecutorService;
        if (executorService != null && sContext != null) {
            executorService.execute(new Runnable() {
                /* class com.bytedance.common.jato.Jato.RunnableC35891 */

                public void run() {
                    JatoScheduler.getInstance().init(Jato.sContext, i);
                }
            });
        }
    }

    public static void setPriority(int i, int i2) {
        PriorityManager.setPriority(i, i2);
    }

    public static void boostRenderThread(Application application, ExecutorService executorService) {
        boostRenderThread(application, -20, executorService);
    }

    public static void endFDIOOperator(String str, boolean z) {
        FDIOOperator andRemove = FDIOPreloaderManager.getAndRemove(str);
        if (andRemove != null) {
            andRemove.end(z);
        }
    }

    public static void shrinkVM(final int i, final int i2) {
        ExecutorService executorService = sWorkExecutorService;
        if (executorService != null) {
            executorService.execute(new Runnable() {
                /* class com.bytedance.common.jato.Jato.RunnableC35902 */

                public void run() {
                    Shrinker.getInstance().doShrink(i, i2);
                }
            });
        }
    }

    public static void startFDIOCollect(String str, boolean z) {
        FDIOCollector collector = FDIOPreloaderManager.getCollector(str);
        if (collector != null) {
            collector.start(str, false);
            collector.setNoMerge(z);
        }
    }

    public static void startFDIOPreload(String str, boolean z) {
        FDIOOperator preloader = FDIOPreloaderManager.getPreloader(str);
        if (preloader != null) {
            preloader.start(str, z);
        }
    }

    public static void optimizeLaunchLock(Application application, boolean z, boolean z2) {
        SharedPreferencesManager.init(application, z, z2);
    }

    public static void boostRenderThread(Application application, int i, ExecutorService executorService) {
        if (executorService != null && application != null) {
            PriorityManager.promoteRenderThread(application, executorService, i);
        }
    }

    public static void pagePreFault(final int i, final boolean z, final boolean z2) {
        ExecutorService executorService;
        final int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && i2 < 31 && (executorService = sWorkExecutorService) != null) {
            executorService.execute(new Runnable() {
                /* class com.bytedance.common.jato.Jato.RunnableC35924 */

                public void run() {
                    String str = null;
                    try {
                        str = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, "ro.board.platform");
                    } catch (Exception unused) {
                    }
                    if (str != null) {
                        String lowerCase = str.toLowerCase();
                        if (lowerCase.startsWith("kirin9") || lowerCase.startsWith("msm8") || lowerCase.startsWith("sdm8") || lowerCase.startsWith("sm8")) {
                            return;
                        }
                    }
                    MemoryManager.pagePreFault(i2, i, z, z2);
                }
            });
        }
    }

    public static synchronized void init(Context context, boolean z, JatoListener jatoListener, ExecutorService executorService) {
        synchronized (Jato.class) {
            init(context, z, jatoListener, executorService, null);
        }
    }

    public static synchronized void init(Context context, boolean z, JatoListener jatoListener, ExecutorService executorService, HostInfoModel hostInfoModel) {
        synchronized (Jato.class) {
            long currentTimeMillis = System.currentTimeMillis();
            if (sListenerList == null) {
                sListenerList = new LinkedList();
            }
            sListenerList.add(jatoListener);
            if (!sInitialized) {
                sIsDebug = z;
                sWorkExecutorService = executorService;
                sInitialized = true;
                sContext = context;
                sConfig = JatoConfig.Builder.build();
                if (context instanceof Application) {
                    ActivityLifeManager.getInstance().init((Application) context);
                }
                if (hostInfoModel != null) {
                    JatoSdkMonitor.init(context, hostInfoModel);
                    JatoSdkMonitor.monitorInitCost(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }
    }
}

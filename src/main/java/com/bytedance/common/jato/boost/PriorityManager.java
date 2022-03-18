package com.bytedance.common.jato.boost;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Process;
import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.JatoListener;
import com.bytedance.common.jato.boost.ProcTidFetcher;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

public class PriorityManager {
    private static Map<Integer, Integer> curPriorityMap = new ConcurrentHashMap();
    public static volatile boolean isAlreadyPromote = false;
    private static boolean isStartFetchAndPromote = false;
    public static volatile int renderThreadTid = -1;

    public static void resetPriority() {
        try {
            if (curPriorityMap.get(-1) != null) {
                Process.setThreadPriority(0, curPriorityMap.get(-1).intValue());
            }
        } catch (Throwable th) {
            Jato.getListener().onErrorInfo("error when reset priority", th);
        }
    }

    public static synchronized void resetRenderThread() {
        synchronized (PriorityManager.class) {
            if (isAlreadyPromote) {
                if (renderThreadTid != -1) {
                    Jato.resetCoreBind(renderThreadTid);
                    Jato.resetPriority(renderThreadTid);
                    isAlreadyPromote = false;
                }
            }
        }
    }

    public static void setPriority(int i) {
        setPriority(-1, i);
    }

    public static void resetPriority(int i) {
        try {
            if (curPriorityMap.get(Integer.valueOf(i)) != null) {
                Process.setThreadPriority(i, curPriorityMap.get(Integer.valueOf(i)).intValue());
            }
        } catch (Throwable th) {
            Jato.getListener().onErrorInfo("error when reset priority", th);
        }
    }

    public static void setPriority(int i, int i2) {
        int i3;
        try {
            int i4 = 0;
            if (curPriorityMap.get(Integer.valueOf(i)) == null) {
                if (i != -1) {
                    i3 = Process.getThreadPriority(i);
                } else {
                    i3 = Process.getThreadPriority(0);
                }
                i4 = i3;
                curPriorityMap.put(Integer.valueOf(i), Integer.valueOf(i4));
            }
            if (i4 == i2) {
                return;
            }
            if (i != -1) {
                Process.setThreadPriority(i, i2);
            } else {
                Process.setThreadPriority(i2);
            }
        } catch (Throwable th) {
            Jato.getListener().onErrorInfo("error when set priority", th);
        }
    }

    public static synchronized void promoteRenderThread(final Application application, final ExecutorService executorService, final int i) {
        synchronized (PriorityManager.class) {
            if (!isAlreadyPromote && renderThreadTid != -1) {
                isAlreadyPromote = true;
                Jato.bindBigCore(renderThreadTid);
                setPriority(renderThreadTid, i);
            } else if (!isStartFetchAndPromote) {
                isStartFetchAndPromote = true;
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.bytedance.common.jato.boost.PriorityManager.C36061 */

                    public void onActivityDestroyed(Activity activity) {
                    }

                    public void onActivityPaused(Activity activity) {
                    }

                    public void onActivityResumed(Activity activity) {
                    }

                    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public void onActivityStarted(Activity activity) {
                    }

                    public void onActivityStopped(Activity activity) {
                    }

                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        application.unregisterActivityLifecycleCallbacks(this);
                        executorService.execute(new Runnable() {
                            /* class com.bytedance.common.jato.boost.PriorityManager.C36061.RunnableC36071 */

                            public void run() {
                                CpusetManager.preload();
                                ProcTidFetcher.getTid(new ProcTidFetcher.IFetcher() {
                                    /* class com.bytedance.common.jato.boost.PriorityManager.C36061.RunnableC36071.C36081 */

                                    @Override // com.bytedance.common.jato.boost.ProcTidFetcher.IFetcher
                                    public void onError(Throwable th) {
                                        Jato.getListener().onErrorInfo("error when fetch RenderThread tid", th);
                                    }

                                    @Override // com.bytedance.common.jato.boost.ProcTidFetcher.IFetcher
                                    public void onFetch(int i) {
                                        try {
                                            PriorityManager.renderThreadTid = i;
                                            PriorityManager.isAlreadyPromote = true;
                                            Jato.bindBigCore(i);
                                            PriorityManager.setPriority(i, i);
                                            JatoListener listener = Jato.getListener();
                                            listener.onDebugInfo("success promote RenderThread priority to -20: " + i + " " + Process.getThreadPriority(i));
                                        } catch (Throwable th) {
                                            Jato.getListener().onErrorInfo("error when promote RenderThread priority to -20", th);
                                        }
                                    }
                                });
                            }
                        });
                    }
                });
            }
        }
    }
}

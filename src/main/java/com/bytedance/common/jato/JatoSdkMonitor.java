package com.bytedance.common.jato;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;

public class JatoSdkMonitor {
    private static ExecutorService monitorService = Executors.newFixedThreadPool(1, new ThreadFactory() {
        /* class com.bytedance.common.jato.JatoSdkMonitor.ThreadFactoryC35981 */

        public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
            return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
        }

        public Thread newThread(Runnable runnable) {
            Thread new_insert_after_java_lang_Thread_by_knot = new_insert_after_java_lang_Thread_by_knot(new Thread(runnable));
            new_insert_after_java_lang_Thread_by_knot.setName("jato_monitor");
            return new_insert_after_java_lang_Thread_by_knot;
        }
    });
    public static boolean sIsInit;

    public static synchronized ExecutorService getMonitorService() {
        ExecutorService executorService;
        synchronized (JatoSdkMonitor.class) {
            executorService = monitorService;
        }
        return executorService;
    }

    public static synchronized SDKMonitor getSdkMonitor() {
        SDKMonitor instance;
        synchronized (JatoSdkMonitor.class) {
            instance = SDKMonitorUtils.getInstance("2021");
        }
        return instance;
    }

    public static void monitorInitCost(final long j) {
        monitorService.execute(new Runnable() {
            /* class com.bytedance.common.jato.JatoSdkMonitor.RunnableC36013 */

            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("init_cost", j);
                    JatoSdkMonitor.getSdkMonitor().monitorDuration("jato_base", jSONObject, null);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static synchronized void init(final Context context, final HostInfoModel hostInfoModel) {
        synchronized (JatoSdkMonitor.class) {
            monitorService.execute(new Runnable() {
                /* class com.bytedance.common.jato.JatoSdkMonitor.RunnableC35992 */

                public void run() {
                    if (!JatoSdkMonitor.sIsInit && context != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("host_aid", hostInfoModel.getAid());
                            jSONObject.put("update_version_code", hostInfoModel.getUpdateVersionCode());
                            jSONObject.put("app_version", hostInfoModel.getVersionCode());
                            jSONObject.put("package_name", hostInfoModel.getPackageName());
                            jSONObject.put("device_id", hostInfoModel.getDid());
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(hostInfoModel.getConfigUrl());
                            SDKMonitorUtils.setConfigUrl("2021", arrayList);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(hostInfoModel.getCollectUrl());
                            SDKMonitorUtils.setDefaultReportUrl("2021", arrayList2);
                            Context context = context;
                            if (!(context instanceof Application)) {
                                context = context.getApplicationContext();
                            }
                            SDKMonitorUtils.initMonitor(context, "2021", jSONObject, new SDKMonitor.IGetExtendParams() {
                                /* class com.bytedance.common.jato.JatoSdkMonitor.RunnableC35992.C36001 */

                                @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                                public Map<String, String> getCommonParams() {
                                    return null;
                                }

                                @Override // com.bytedance.framwork.core.sdkmonitor.SDKMonitor.IGetExtendParams
                                public String getSessionId() {
                                    return null;
                                }
                            });
                        } catch (Throwable th) {
                            JatoSdkMonitor.sIsInit = true;
                            Log.i("jato", "monitor init success");
                            throw th;
                        }
                        JatoSdkMonitor.sIsInit = true;
                        Log.i("jato", "monitor init success");
                    }
                }
            });
        }
    }
}

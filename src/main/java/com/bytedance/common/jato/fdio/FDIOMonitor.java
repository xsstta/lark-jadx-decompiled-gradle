package com.bytedance.common.jato.fdio;

import com.bytedance.common.jato.Jato;
import com.bytedance.common.jato.JatoSdkMonitor;
import org.json.JSONObject;

public class FDIOMonitor {
    public static void monitorCollectReason(final String str) {
        JatoSdkMonitor.getMonitorService().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.FDIOMonitor.RunnableC36112 */

            public void run() {
                if (!Jato.isDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("collect_reason", str);
                        JatoSdkMonitor.getSdkMonitor().monitorDuration("fdio_monitor_3", jSONObject, null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static void monitorIsCollect(final String str) {
        JatoSdkMonitor.getMonitorService().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.FDIOMonitor.RunnableC36101 */

            public void run() {
                if (!Jato.isDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("collect_or_preload", str);
                        JatoSdkMonitor.getSdkMonitor().monitorDuration("fdio_monitor_3", jSONObject, null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static void monitorMincoreValid(final int i) {
        JatoSdkMonitor.getMonitorService().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.FDIOMonitor.RunnableC36156 */

            public void run() {
                if (!Jato.isDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("is_mincore_valid", i);
                        JatoSdkMonitor.getSdkMonitor().monitorDuration("fdio_monitor_3", jSONObject, null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static void monitorPreloadTime(final int i) {
        JatoSdkMonitor.getMonitorService().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.FDIOMonitor.RunnableC36145 */

            public void run() {
                if (!Jato.isDebug() && i >= 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("preload_time_cost", i);
                        JatoSdkMonitor.getSdkMonitor().monitorDuration("fdio_monitor_3", jSONObject, null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static void monitorCollectPageSize(final int i, final int i2) {
        JatoSdkMonitor.getMonitorService().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.FDIOMonitor.RunnableC36123 */

            public void run() {
                if (!Jato.isDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("collect_sample_page_size", i);
                        jSONObject.put("collect_all_page_size", i2);
                        JatoSdkMonitor.getSdkMonitor().monitorDuration("fdio_monitor_3", jSONObject, null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    public static void monitorPreloadPageSize(final int i, final int i2) {
        JatoSdkMonitor.getMonitorService().execute(new Runnable() {
            /* class com.bytedance.common.jato.fdio.FDIOMonitor.RunnableC36134 */

            public void run() {
                if (!Jato.isDebug()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("preload_sample_page_size", i);
                        jSONObject.put("preload_all_page_size", i2);
                        JatoSdkMonitor.getSdkMonitor().monitorDuration("fdio_monitor_3", jSONObject, null);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }
}

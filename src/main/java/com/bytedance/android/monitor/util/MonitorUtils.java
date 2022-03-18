package com.bytedance.android.monitor.util;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.monitor.HybridMonitor;
import com.google.firebase.messaging.Constants;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\"\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/bytedance/android/monitor/util/MonitorUtils;", "", "()V", "isCustomService", "", "eventType", "", "mapService", "containerType", "biz", "outputFile", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lorg/json/JSONObject;", "com.bytedance.android.livesdk.monitor.base"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.android.monitor.i.f */
public final class MonitorUtils {

    /* renamed from: a */
    public static final MonitorUtils f8441a = new MonitorUtils();

    private MonitorUtils() {
    }

    /* renamed from: a */
    private final boolean m11183a(String str) {
        if (Intrinsics.areEqual("samplecustom", str) || Intrinsics.areEqual("newcustom", str) || Intrinsics.areEqual("custom", str)) {
            return true;
        }
        return false;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m11182a(String str, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "eventType");
        Intrinsics.checkParameterIsNotNull(jSONObject, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (f8441a.m11183a(str)) {
            try {
                String optString = jSONObject.getJSONObject("extra").optString("url", "");
                HybridMonitor instance = HybridMonitor.getInstance();
                Intrinsics.checkExpressionValueIsNotNull(instance, "HybridMonitor.getInstance()");
                File a = C2656d.m11160a(instance.getApplication(), "monitor_data_debug");
                if (a != null && a.exists()) {
                    String queryParameter = Uri.parse(optString).getQueryParameter("bytest_case_id");
                    String absolutePath = new File(a, "custom_with_" + queryParameter).getAbsolutePath();
                    C2656d.m11161a(absolutePath, StringsKt.trimIndent("\n     " + jSONObject + "\n     \n     "), true);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("extra").getJSONObject("nativeBase");
                String string = jSONObject2.getString("navigation_id");
                String optString2 = jSONObject2.optString("url", "");
                HybridMonitor instance2 = HybridMonitor.getInstance();
                Intrinsics.checkExpressionValueIsNotNull(instance2, "HybridMonitor.getInstance()");
                File a2 = C2656d.m11160a(instance2.getApplication(), "monitor_data_debug");
                if (a2 != null && a2.exists()) {
                    String queryParameter2 = Uri.parse(optString2).getQueryParameter("bytest_case_id");
                    String absolutePath2 = new File(a2, string + "_with_" + queryParameter2).getAbsolutePath();
                    C2656d.m11161a(absolutePath2, StringsKt.trimIndent("\n     " + jSONObject + "\n     \n     "), true);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m11181a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "eventType");
        Intrinsics.checkParameterIsNotNull(str2, "containerType");
        if (str3 == null) {
            str3 = "";
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (Intrinsics.areEqual("custom", str)) {
            return "tt" + str3 + "_webview_timing_monitor_custom_service";
        } else if (Intrinsics.areEqual("newcustom", str)) {
            return "bd" + str3 + "_hybrid_monitor_custom_service";
        } else if (Intrinsics.areEqual("samplecustom", str)) {
            return "bd" + str3 + "_hybrid_monitor_custom_sample_service";
        } else {
            return "bd_hybrid_monitor_service_" + str + '_' + str2 + '_' + str3;
        }
    }
}

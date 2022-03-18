package com.bytedance.framwork.core.monitor;

import android.util.Log;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.internal.ApmDelegate;
import org.json.JSONObject;

public class MonitorUtils {
    public static void setIsBackGround(boolean z) {
    }

    public static void setDebugMode() {
        C2785b.m11755c(true);
    }

    public static void monitorDebugReal(String str) {
        Log.e("Deprecated", "nothing to do, implementation code has been removed in version 5+");
    }

    public static boolean getLogTypeSwitch(String str) {
        return ApmDelegate.m12591a().mo12782a(str);
    }

    public static boolean getMetricsTypeSwitch(String str) {
        return ApmDelegate.m12591a().mo12790c(str);
    }

    public static boolean getServiceNameSwitch(String str) {
        return ApmDelegate.m12591a().mo12786b(str);
    }

    public static void monitorCommonLog(String str, JSONObject jSONObject) {
        ApmAgent.monitorCommonLog(str, jSONObject);
    }

    public static void monitorOnCount(String str, String str2) {
        Log.e("Deprecated", "nothing to do, implementation code has been removed in version 5+");
    }

    public static void monitorDebugReal(String str, String str2) {
        Log.e("Deprecated", "nothing to do, implementation code has been removed in version 5+");
    }

    public static void monitorStartTime(String str, float f) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, (double) f);
            monitorPerformance("start", str, jSONObject, null, null);
        } catch (Exception unused) {
        }
    }

    public static void monitorDirectOnTimer(String str, String str2, float f) {
        ApmAgent.monitorDirectOnTimer(str, str2, f);
    }

    public static void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        ApmAgent.monitorDuration(str, jSONObject, jSONObject2);
    }

    public static void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        ApmAgent.monitorStatusRate(str, i, jSONObject);
    }

    public static void monitorUIAction(String str, String str2, JSONObject jSONObject) {
        ApmAgent.monitorUIAction(str, str2, jSONObject);
    }

    public static void monitorCommonLog(String str, JSONObject jSONObject, boolean z) {
        ApmAgent.monitorCommonLog(str, jSONObject, z);
    }

    public static void monitorDirectOnCount(String str, String str2, float f) {
        Log.e("Deprecated", "nothing to do, implementation code has been removed in version 5+");
    }

    public static void monitorOnStore(String str, String str2, float f) {
        Log.e("Deprecated", "nothing to do, implementation code has been removed in version 5+");
    }

    public static void monitorOnTimer(String str, String str2, float f) {
        Log.e("Deprecated", "nothing to do, implementation code has been removed in version 5+");
    }

    public static void monitorOnCount(String str, String str2, float f) {
        Log.e("Deprecated", "nothing to do, implementation code has been removed in version 5+");
    }

    public static void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ApmAgent.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        ApmAgent.monitorStatusAndDuration(str, i, jSONObject, jSONObject2);
    }

    public static void monitorDuration(String str, JSONObject jSONObject, JSONObject jSONObject2, long j) {
        ApmAgent.monitorDuration(str, jSONObject, jSONObject2, j);
    }

    public static void monitorPerformance(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ApmAgent.monitorPerformance(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void monitorPerformance(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        ApmAgent.monitorPerformance(str, str2, jSONObject, jSONObject2, jSONObject3);
    }

    public static void monitorApiError(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        ApmAgent.monitorApiError(j, j2, str, str2, str3, i, jSONObject);
    }

    public static void monitorSLA(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        ApmAgent.monitorSLA(j, j2, str, str2, str3, i, jSONObject);
    }
}

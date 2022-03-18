package com.ss.android.lark.opmonitor.api;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.C48918a;
import com.ss.android.lark.opmonitor.model.OPMonitorHeartBeatMonitorData;
import com.ss.android.lark.opmonitor.process.IOPMonitorHeartBeatIPC;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import ee.android.framework.manis.C68183b;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.opmonitor.api.c */
public class C48905c {
    /* renamed from: a */
    public static void m192683a(Context context, boolean z) {
        if (context == null) {
            Log.m165389i("OPMonitorHeartBeatAPI", "setLarkStatus context is null ");
            return;
        }
        IOPMonitorHeartBeatIPC iOPMonitorHeartBeatIPC = (IOPMonitorHeartBeatIPC) C68183b.m264839a().mo237086a(context.getApplicationContext(), IOPMonitorHeartBeatIPC.class);
        if (iOPMonitorHeartBeatIPC != null) {
            iOPMonitorHeartBeatIPC.setLarkStatus(z);
        } else {
            Log.m165383e("OPMonitorHeartBeatAPI", "setLarkStatus getService == null");
        }
    }

    /* renamed from: a */
    public static void m192682a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Log.m165389i("OPMonitorHeartBeatAPI", "endHeartBeat params context:" + context);
            Log.m165389i("OPMonitorHeartBeatAPI", "endHeartBeat params heartBeatId:" + str);
            return;
        }
        IOPMonitorHeartBeatIPC iOPMonitorHeartBeatIPC = (IOPMonitorHeartBeatIPC) C68183b.m264839a().mo237086a(context.getApplicationContext(), IOPMonitorHeartBeatIPC.class);
        if (iOPMonitorHeartBeatIPC != null) {
            iOPMonitorHeartBeatIPC.endHeartBeat(str);
        } else {
            Log.m165383e("OPMonitorHeartBeatAPI", "endHeartBeat getService == null");
        }
    }

    /* renamed from: a */
    public static void m192681a(Context context, C48918a aVar, AbstractC48904a aVar2) {
        if (aVar == null || context == null || aVar2 == null || aVar.mo170797a() == null || TextUtils.isEmpty(aVar.mo170800b())) {
            Log.m165389i("OPMonitorHeartBeatAPI", "registerHeartBeat params context:" + context);
            Log.m165389i("OPMonitorHeartBeatAPI", "registerHeartBeat params source:" + aVar);
            Log.m165389i("OPMonitorHeartBeatAPI", "registerHeartBeat params listener:" + aVar2);
            return;
        }
        HashMap hashMap = new HashMap();
        OPMonitor a = aVar.mo170797a();
        if (a.getMonitorCode() != null) {
            hashMap.put("monitor_domain", a.getMonitorCode().domain);
            hashMap.put("monitor_code", Integer.valueOf(a.getMonitorCode().code));
            hashMap.put("monitor_id", a.getMonitorCode().ID);
            hashMap.put("monitor_message", a.getMonitorCode().message);
        }
        hashMap.putAll(a.getCommons());
        hashMap.putAll(a.getCategories());
        hashMap.putAll(a.getMetrics());
        OPMonitorHeartBeatMonitorData oPMonitorHeartBeatMonitorData = new OPMonitorHeartBeatMonitorData(aVar.mo170800b(), new JSONObject(hashMap).toString(), 1);
        IOPMonitorHeartBeatIPC iOPMonitorHeartBeatIPC = (IOPMonitorHeartBeatIPC) C68183b.m264839a().mo237086a(context.getApplicationContext(), IOPMonitorHeartBeatIPC.class);
        if (iOPMonitorHeartBeatIPC != null) {
            iOPMonitorHeartBeatIPC.registerHeartBeat(oPMonitorHeartBeatMonitorData, aVar2);
        } else {
            Log.m165383e("OPMonitorHeartBeatAPI", "registerHeartBeat getService == null");
        }
    }
}

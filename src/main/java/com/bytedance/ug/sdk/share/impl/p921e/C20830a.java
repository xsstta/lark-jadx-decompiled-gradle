package com.bytedance.ug.sdk.share.impl.p921e;

import com.bytedance.ug.sdk.share.api.entity.C20817b;
import com.bytedance.ug.sdk.share.impl.p919c.C20826a;
import com.bytedance.ug.sdk.share.impl.p923g.C20840d;
import com.bytedance.ug.sdk.share.impl.p928j.C20854e;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ug.sdk.share.impl.e.a */
public class C20830a {

    /* renamed from: a */
    private static boolean f50998a = false;

    /* renamed from: b */
    private static String f50999b = "1926";

    /* renamed from: a */
    public static void m75866a() {
        if (!f50998a) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("https://mon.snssdk.com/monitor/appmonitor/v2/settings");
            arrayList.add("https://monsetting.toutiao.com/monitor/appmonitor/v2/settings");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("https://mon.snssdk.com/monitor/collect/");
            arrayList2.add("https://mon.toutiao.com/monitor/collect/");
            arrayList2.add("https://mon.toutiaocloud.com/monitor/collect/");
            arrayList2.add("https://mon.toutiaocloud.net/monitor/collect/");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", C20826a.m75837a().mo70301e());
                jSONObject.put("host_aid", C20826a.m75837a().mo70300d());
                jSONObject.put("package_name", C20826a.m75837a().mo70302f());
                jSONObject.put("sdk_version", "2.2.0-rc.8");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C20826a.m75837a().mo70290a(C20840d.m75892a().mo70319b(), f50999b, jSONObject, arrayList, arrayList2);
            if (C20826a.m75837a().mo70307k()) {
                C20854e.m75912a("ShareSdkMonitor Init");
            }
            f50998a = true;
        }
    }

    /* renamed from: a */
    public static void m75867a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        String str2;
        String str3;
        String str4;
        m75866a();
        C20817b bVar = new C20817b();
        bVar.mo70272a(str);
        bVar.mo70271a(i);
        bVar.mo70275c(jSONObject2);
        bVar.mo70273a(jSONObject);
        bVar.mo70274b(jSONObject4);
        bVar.mo70276d(jSONObject3);
        C20826a.m75837a().mo70293a(f50999b, bVar);
        if (C20826a.m75837a().mo70307k()) {
            String str5 = "empty";
            if (jSONObject2 != null) {
                str2 = jSONObject2.toString();
            } else {
                str2 = str5;
            }
            if (jSONObject3 != null) {
                str3 = jSONObject3.toString();
            } else {
                str3 = str5;
            }
            if (jSONObject != null) {
                str4 = jSONObject.toString();
            } else {
                str4 = str5;
            }
            if (jSONObject4 != null) {
                str5 = jSONObject4.toString();
            }
            C20854e.m75913a("ShareSdkMonitor Event:" + str, "status: " + i + ", category: " + str2 + ", metric: " + str3 + ", duration: " + str4 + ", logExtra: " + str5);
        }
    }
}

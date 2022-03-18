package com.bytedance.push.p884f;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.third.PushChannelHelper;
import com.bytedance.push.utils.C20552c;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.message.AppProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.f.h */
public class C20428h {

    /* renamed from: a */
    private static WeakHandler.IHandler f49921a = new WeakHandler.IHandler() {
        /* class com.bytedance.push.p884f.C20428h.C204291 */

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
            C20428h.m74401a(message);
        }
    };

    /* renamed from: b */
    private static Handler f49922b = new WeakHandler(C20424f.m74386a(), f49921a);

    /* renamed from: c */
    private static final Map<Integer, Boolean> f49923c = new ConcurrentHashMap(2);

    /* renamed from: a */
    static void m74395a() {
        C20552c.m74852c("Monitor", "Push Sender Monitor: " + "update sender success");
        m74400a(0, (JSONObject) null, "update sender success");
    }

    /* renamed from: b */
    static void m74403b() {
        C20552c.m74852c("Monitor", "Push switcher monitor：" + "the out-app switcher upload success");
        m74399a(0, "the out-app switcher upload success", (JSONObject) null);
    }

    /* renamed from: c */
    private static void m74406c(int i) {
        f49922b.removeMessages(CommonCode.StatusCode.API_CLIENT_EXPIRED, Integer.valueOf(i));
    }

    /* renamed from: a */
    static void m74396a(int i) {
        Map<Integer, Boolean> map = f49923c;
        synchronized (map) {
            if (map.get(Integer.valueOf(i)) == null) {
                map.put(Integer.valueOf(i), true);
                f49922b.sendMessageDelayed(f49922b.obtainMessage(CommonCode.StatusCode.API_CLIENT_EXPIRED, Integer.valueOf(i)), TimeUnit.MINUTES.toMillis(1));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        m74406c(r4);
        com.bytedance.push.third.PushChannelHelper.inst(com.ss.android.message.AppProvider.getApp()).getSenderNameById(r4);
        com.bytedance.push.utils.C20552c.m74852c("Monitor", "Push Sender Monitor: " + r4 + " register success");
        r0 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.put(com.huawei.updatesdk.service.otaupdate.UpdateKey.STATUS, 0);
        r0.put("pushType", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        r4.printStackTrace();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m74404b(int r4) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p884f.C20428h.m74404b(int):void");
    }

    /* renamed from: a */
    public static void m74401a(Message message) {
        if (message != null && message.what == 1001) {
            String str = PushChannelHelper.inst(AppProvider.getApp()).getSenderNameById(((Integer) message.obj).intValue()) + " register timeout";
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(UpdateKey.STATUS, 108);
                jSONObject.put("pushType", message.obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C20552c.m74850b("Monitor", "Push Sender Monitor:" + str);
            C20424f.m74389a("push_monitor_register_result", jSONObject, null, null);
        }
    }

    /* renamed from: b */
    static void m74405b(int i, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (i == 301) {
            str2 = "network error";
        } else if (i != 302) {
            str2 = "Server return empty response";
        } else {
            str2 = "Server return not success";
        }
        m74399a(i, str2, jSONObject);
        C20552c.m74850b("Monitor", "Push switcher monitor：upload error，reason: " + str2);
    }

    /* renamed from: a */
    static void m74398a(int i, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        switch (i) {
            case 301:
                str2 = "network error";
                break;
            case 302:
                str2 = "server return error";
                break;
            case 303:
                str2 = "server return empty allow_push_list";
                break;
            default:
                str2 = "update_sender api return empty";
                break;
        }
        m74400a(i, jSONObject, str2);
        C20552c.m74850b("Monitor", "Push Sender Monitor: update sender error, reason: " + str2);
    }

    /* renamed from: a */
    static void m74402a(boolean z, String str) {
        if (z) {
            C20552c.m74852c("Monitor", "Push Sender Monitor: get sender success");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UpdateKey.STATUS, ActivityIdentificationData.WALKING);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("sender", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        C20424f.m74389a("push_monitor_register_result", jSONObject, null, jSONObject2);
        C20552c.m74850b("Monitor", "Push Sender Monitor: This device does not support the sender/channel delivered by the server");
    }

    /* renamed from: a */
    private static void m74399a(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(UpdateKey.STATUS, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C20424f.m74389a("outer_switch_upload_result", jSONObject2, null, jSONObject);
    }

    /* renamed from: a */
    private static void m74400a(int i, JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(UpdateKey.STATUS, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C20424f.m74389a("push_monitor_update_sender", jSONObject2, null, jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        m74406c(r3);
        r0 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.put("pushType", r3);
        r0.put(com.huawei.updatesdk.service.otaupdate.UpdateKey.STATUS, r4);
        r0.put("3rd_code", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r4.printStackTrace();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m74397a(int r3, int r4, java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.p884f.C20428h.m74397a(int, int, java.lang.String, java.lang.String):void");
    }
}

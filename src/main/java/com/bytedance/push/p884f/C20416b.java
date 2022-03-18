package com.bytedance.push.p884f;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.push.ThreadPlus;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.C20386c;
import com.bytedance.push.PushSupporter;
import com.bytedance.push.utils.C20552c;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.message.AppProvider;
import com.ss.android.message.p3002a.C59436a;
import com.ss.android.pushmanager.setting.C59971b;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.f.b */
class C20416b {

    /* renamed from: a */
    public static long f49900a;

    /* renamed from: b */
    private static final WeakHandler.IHandler f49901b = new WeakHandler.IHandler() {
        /* class com.bytedance.push.p884f.C20416b.C204171 */

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
            C20416b.m74373a(message);
        }
    };

    /* renamed from: c */
    private static Handler f49902c;

    /* renamed from: d */
    private static final AtomicBoolean f49903d = new AtomicBoolean(false);

    /* renamed from: b */
    private static Handler m74375b() {
        if (f49902c == null) {
            f49902c = new WeakHandler(C20424f.m74386a(), f49901b);
        }
        return f49902c;
    }

    /* renamed from: a */
    static void m74370a() {
        if (f49903d.compareAndSet(false, true)) {
            if (m74375b().hasMessages(2)) {
                m74375b().removeMessages(2);
            }
            m74371a(0, System.currentTimeMillis() - f49900a);
        }
    }

    /* renamed from: a */
    public static void m74373a(Message message) {
        if (message != null) {
            RunnableC204182 r0 = null;
            if (message.what == 2) {
                r0 = new Runnable() {
                    /* class com.bytedance.push.p884f.C20416b.RunnableC204182 */

                    public void run() {
                        if (!PushSupporter.get().getConfiguration().f49803y || !TextUtils.isEmpty(C59971b.m232728b().mo204212h())) {
                            C20416b.m74371a(201, System.currentTimeMillis() - C20416b.f49900a);
                        }
                    }
                };
            }
            if (r0 != null) {
                ThreadPlus.submitRunnable(r0);
            }
        }
    }

    /* renamed from: a */
    static void m74374a(C20386c cVar) {
        if (C59436a.m230732b(AppProvider.getApp())) {
            f49900a = System.currentTimeMillis();
            m74375b().sendEmptyMessageDelayed(2, cVar.f49772C);
        }
    }

    /* renamed from: a */
    public static void m74371a(int i, long j) {
        String str;
        if (i != 201) {
            str = "init success";
        } else {
            str = "not invoke start() method/not invoke start() when 30s passed";
        }
        if (i == 0) {
            C20552c.m74852c("Monitor", "Push init error:" + str);
        } else {
            C20552c.m74850b("Monitor", "Push init error:" + str);
        }
        m74372a(i, j, str);
    }

    /* renamed from: a */
    private static void m74372a(int i, long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UpdateKey.STATUS, i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("delta", j);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        C20424f.m74389a("push_monitor_applog_timeout", jSONObject, jSONObject2, null);
    }
}

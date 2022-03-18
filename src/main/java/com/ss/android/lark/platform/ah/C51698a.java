package com.ss.android.lark.platform.ah;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.platform.p2496p.C51907a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.wschannelnotification.AbstractC59279a;
import com.ss.android.lark.wschannelnotification.C59281b;

/* renamed from: com.ss.android.lark.platform.ah.a */
public class C51698a {

    /* renamed from: a */
    private static volatile C59281b f128579a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.ah.a$a */
    public static class C51700a {

        /* renamed from: a */
        public static final AbstractC59279a f128581a = C51698a.m200477a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C59281b m200478a() {
        if (f128579a == null) {
            synchronized (C51698a.class) {
                if (f128579a == null) {
                    f128579a = new C59281b(C51700a.f128581a);
                }
            }
        }
        return f128579a;
    }

    /* renamed from: a */
    public static AbstractC59279a m200477a(final Context context) {
        return new AbstractC59279a() {
            /* class com.ss.android.lark.platform.ah.C51698a.C516991 */

            @Override // com.ss.android.lark.wschannelnotification.AbstractC59279a
            /* renamed from: a */
            public Context mo177779a() {
                return context;
            }

            @Override // com.ss.android.lark.wschannelnotification.AbstractC59279a
            /* renamed from: b */
            public boolean mo177781b() {
                return C51702c.m200484a().mo201591c();
            }

            @Override // com.ss.android.lark.wschannelnotification.AbstractC59279a
            /* renamed from: a */
            public void mo177780a(Context context, String str, String str2, String str3) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("text", (Object) str2);
                jSONObject.put("title", (Object) str);
                jSONObject.put("extra_str", (Object) str3);
                new JSONObject().put("msg", (Object) jSONObject);
                C51907a.m201314a();
                OfflineNotice offlineNotice = new OfflineNotice(jSONObject, -1);
                C51907a.m201314a().mo169320b().mo169512a(offlineNotice);
                Log.m165389i("WSNotificationModule", "[onReceive]v2: Sid = " + offlineNotice.getMsgSid() + " timestamp = " + offlineNotice.getSendTimeStamp());
            }
        };
    }
}

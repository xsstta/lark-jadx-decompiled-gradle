package com.ss.android.lark.notification.p2387i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.OfflineNotice;
import com.ss.android.lark.notification.env.C48478b;
import com.ss.android.lark.notification.env.C48492c;
import com.ss.android.lark.notification.export.entity.Notice;
import com.ss.android.lark.notification.offline.NotificationClickReceiver;
import com.ss.android.lark.notification.p2382e.C48452e;
import com.ss.android.lark.notification.p2385g.AbstractC48512b;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.lark.notification.i.b */
public class C48538b {

    /* renamed from: a */
    private static volatile Boolean f122131a = false;

    /* renamed from: a */
    public static AbstractC48512b m191361a() {
        return new AbstractC48512b() {
            /* class com.ss.android.lark.notification.p2387i.C48538b.C485391 */

            @Override // com.ss.android.lark.notification.p2385g.AbstractC48512b
            /* renamed from: a */
            public /* synthetic */ void mo169525a(Notice notice) {
                AbstractC48512b.CC.$default$a(this, notice);
            }

            @Override // com.ss.android.lark.notification.p2385g.AbstractC48512b
            /* renamed from: a */
            public void mo169526a(C48541c cVar) {
                C48538b.m191363a(cVar);
            }
        };
    }

    /* renamed from: a */
    private static void m191362a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.ss.android.lark.notification.receiver");
        m191360a(context, new NotificationClickReceiver(), intentFilter);
    }

    /* renamed from: a */
    public static void m191363a(final C48541c cVar) {
        if (C48398a.m190922a().mo169355r()) {
            Log.m165389i("TenantNoticeDispatcher", "switch tenant notice is not enabled");
            return;
        }
        if (!f122131a.booleanValue()) {
            synchronized (f122131a) {
                if (!f122131a.booleanValue()) {
                    C48398a.m190922a().mo169354q();
                    C48478b.m191179a().mo169544b();
                    m191362a(C48398a.m190922a().mo169335a());
                    f122131a = true;
                }
            }
        }
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.notification.p2387i.C48538b.RunnableC485402 */

            public void run() {
                if (!C48492c.m191192a(C48398a.m190922a().mo169335a())) {
                    Log.m165389i("TenantNoticeDispatcher", "Notification is disabled");
                } else {
                    C48538b.m191364b(cVar);
                }
            }
        });
    }

    /* renamed from: b */
    public static void m191364b(C48541c cVar) {
        C48398a.m190922a().mo169335a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("text", (Object) cVar.mo169626b());
        jSONObject.put("title", (Object) cVar.mo169625a());
        jSONObject.put("extra_str", (Object) cVar.mo169627c());
        new JSONObject().put("msg", (Object) jSONObject);
        OfflineNotice offlineNotice = new OfflineNotice(jSONObject, -1);
        C48452e.m191122b().mo169512a(offlineNotice);
        Log.m165389i("TenantNoticeDispatcher", "[onReceive]v2 banner notification: Sid = " + offlineNotice.getMsgSid() + " timestamp = " + offlineNotice.getSendTimeStamp());
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m191360a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}

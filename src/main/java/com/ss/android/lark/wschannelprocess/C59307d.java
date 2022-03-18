package com.ss.android.lark.wschannelprocess;

import android.content.Context;
import android.content.Intent;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.wschannelprocess.WschannelPush;
import com.ss.android.lark.wschannelprocess.p2985a.AbstractC59297a;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.wschannelprocess.d */
public class C59307d {

    /* renamed from: a */
    private static volatile AbstractC59297a f147271a;

    /* renamed from: b */
    public static AbstractC59297a m230286b() {
        return f147271a;
    }

    /* renamed from: c */
    public boolean mo201591c() {
        return C59304c.m230268a().mo201583i();
    }

    /* renamed from: a */
    public void mo201584a() {
        Log.m165389i("WschannelProcessModule", "init");
        if (f147271a == null) {
            Log.m165383e("WschannelProcessModule", "init found sDependency is null");
            return;
        }
        mo201586a(new WschannelPush.AbstractC59293d() {
            /* class com.ss.android.lark.wschannelprocess.C59307d.C593081 */

            @Override // com.ss.android.lark.wschannelprocess.WschannelPush.AbstractC59293d
            /* renamed from: a */
            public void mo201566a(WschannelPush.WebSocketStatus webSocketStatus) {
                boolean z;
                if (webSocketStatus == WschannelPush.WebSocketStatus.SUCCESS) {
                    z = true;
                } else {
                    z = false;
                }
                C59304c.m230268a().mo201573a(z);
            }
        });
        WschannelPush.m230229a().mo201558b();
        m230285a(f147271a.mo177782a(), 2);
    }

    public C59307d(AbstractC59297a aVar) {
        f147271a = aVar;
    }

    /* renamed from: a */
    public void mo201585a(WschannelPush.AbstractC59292c cVar) {
        WschannelPush.m230229a().mo201554a(cVar);
    }

    /* renamed from: a */
    public static void m230284a(Context context) {
        try {
            context.startService(new Intent(context, WschannelLaunchService.class));
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: b */
    public void mo201590b(Context context) {
        context.stopService(new Intent(context, WschannelLaunchService.class));
    }

    /* renamed from: a */
    public void mo201586a(WschannelPush.AbstractC59293d dVar) {
        WschannelPush.m230229a().mo201555a(dVar);
    }

    /* renamed from: a */
    public void mo201589a(boolean z) {
        C59304c.m230268a().mo201577c(z);
    }

    /* renamed from: a */
    public static void m230285a(final Context context, long j) {
        CoreThreadPool.getDefault().getScheduleThreadPool().schedule(new Runnable() {
            /* class com.ss.android.lark.wschannelprocess.C59307d.RunnableC593092 */

            public void run() {
                Log.m165389i("WschannelProcessModule", "start WschannelLaunchService");
                C59307d.m230284a(context);
            }
        }, j, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public void mo201588a(String str, JSONObject jSONObject) {
        C59304c.m230268a().mo201572a(str, jSONObject);
    }

    /* renamed from: a */
    public void mo201587a(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        C59304c.m230268a().mo201571a(str, str2, str3, j, j2, jSONObject);
    }
}

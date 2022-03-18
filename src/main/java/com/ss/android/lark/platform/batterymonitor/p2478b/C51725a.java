package com.ss.android.lark.platform.batterymonitor.p2478b;

import android.content.Context;
import com.ss.android.lark.http.netstate.AbstractC38769a;
import com.ss.android.lark.http.netstate.C38770b;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.p2510z.C52066a;
import com.ss.android.lark.utils.C57765ac;

/* renamed from: com.ss.android.lark.platform.batterymonitor.b.a */
public class C51725a {

    /* renamed from: a */
    private AbstractC38769a f128618a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.batterymonitor.b.a$a */
    public static class C51727a {

        /* renamed from: a */
        public static final C51725a f128619a = new C51725a();
    }

    private C51725a() {
    }

    /* renamed from: a */
    public static C51725a m200572a() {
        return C51727a.f128619a;
    }

    /* renamed from: b */
    public void mo177834b() {
        if (this.f128618a != null) {
            C38770b.m153078a().mo142129b(this.f128618a);
            this.f128618a = null;
        }
    }

    /* renamed from: a */
    private void m200573a(NetworkUtils.NetworkType networkType) {
        C52066a.m201979a().mo201661b().mo201666a(networkType);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m200574b(NetworkUtils.NetworkType networkType) {
        Log.m165389i("BatteryMonitor", "onNetworkStateChange called.");
        m200573a(networkType);
    }

    /* renamed from: a */
    public void mo177833a(Context context) {
        boolean z;
        if (C57765ac.m224188b(context) || C57765ac.m224187a(context) || C57765ac.m224189c(context)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f128618a = new AbstractC38769a() {
                /* class com.ss.android.lark.platform.batterymonitor.p2478b.$$Lambda$a$J4WMzxKyIlwTzldsC8DK0x4ilQ */

                @Override // com.ss.android.lark.http.netstate.AbstractC38769a
                public final void onNetworkStateChange(NetworkUtils.NetworkType networkType) {
                    C51725a.m270896lambda$J4WMzxKyIlwTzldsC8DK0x4ilQ(C51725a.this, networkType);
                }
            };
            C38770b.m153078a().mo142127a(this.f128618a);
        }
    }
}

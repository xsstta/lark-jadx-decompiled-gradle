package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.C14041b;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14037e;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.f */
public class C14026f implements C14037e.AbstractC14040a {

    /* renamed from: a */
    private static final String f36746a = "f";

    /* renamed from: b */
    private C14037e f36747b = new C14037e();

    /* renamed from: c */
    private BroadcastReceiver f36748c = new BroadcastReceiver() {
        /* class com.bytedance.frameworks.baselib.network.http.ok3.impl.C14026f.C140271 */

        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast() && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                C14041b.m56829a().mo51704j();
            }
        }
    };

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14037e.AbstractC14040a
    /* renamed from: b */
    public void mo51627b() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14037e.AbstractC14040a
    /* renamed from: a */
    public void mo51625a() {
        C14041b.m56829a().mo51703i();
    }

    /* renamed from: a */
    public void mo51626a(Context context) {
        m56760b(context);
        m56761c(context);
    }

    /* renamed from: b */
    private void m56760b(Context context) {
        if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            m56759a(context, this.f36748c, intentFilter);
            Logger.m15167d(f36746a, "register network state changed completed");
        }
    }

    /* renamed from: c */
    private void m56761c(Context context) {
        Application application;
        Logger.m15167d(f36746a, "register activity forground and background switch Callback");
        if ((context instanceof Application) && (application = (Application) context) != null) {
            this.f36747b.mo51676a(this);
            application.registerActivityLifecycleCallbacks(this.f36747b);
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m56759a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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

package com.bytedance.ee.bear.connection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.util.ArrayList;
import java.util.List;
import me.ele.lancet.base.annotations.Skip;

public class NetStateChangeReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static NetworkType f14575a = NetworkType.NETWORK_NO;

    /* renamed from: b */
    private List<AbstractC4973a> f14576b = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.connection.NetStateChangeReceiver$a */
    public static class C4972a {

        /* renamed from: a */
        public static final NetStateChangeReceiver f14577a = new NetStateChangeReceiver();
    }

    /* renamed from: a */
    public static NetworkType m20610a() {
        return f14575a;
    }

    /* renamed from: b */
    public static void m20614b(Context context) {
        C13479a.m54772d("NetStateChangeReceiver", "unregisterReceiver()... context = " + context);
        context.unregisterReceiver(C4972a.f14577a);
    }

    /* renamed from: a */
    public static void m20611a(Context context) {
        C13479a.m54772d("NetStateChangeReceiver", "registerReceiver()... context = " + context);
        m20609a(context, C4972a.f14577a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: b */
    public static void m20615b(AbstractC4973a aVar) {
        C13479a.m54772d("NetStateChangeReceiver", "unregisterObserver()... observer = " + aVar);
        if (aVar != null && C4972a.f14577a.f14576b != null) {
            C4972a.f14577a.f14576b.remove(aVar);
        }
    }

    /* renamed from: a */
    public static void m20613a(AbstractC4973a aVar) {
        C13479a.m54772d("NetStateChangeReceiver", "registerObserver()... observer =" + aVar);
        if (aVar != null && !C4972a.f14577a.f14576b.contains(aVar)) {
            C4972a.f14577a.f14576b.add(aVar);
        }
    }

    /* renamed from: a */
    private void m20612a(NetworkType networkType) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("notifyObservers().... netWorkType = ");
        if (networkType == null) {
            str = null;
        } else {
            str = networkType.name();
        }
        sb.append(str);
        sb.append(", observer.size =");
        sb.append(this.f14576b.size());
        C13479a.m54758a("NetStateChangeReceiver", sb.toString());
        if (networkType == NetworkType.NETWORK_NO) {
            for (AbstractC4973a aVar : this.f14576b) {
                C13479a.m54772d("NetStateChangeReceiver", "notifyObservers()1111... observer = " + aVar);
                aVar.mo19669a();
            }
            return;
        }
        for (AbstractC4973a aVar2 : this.f14576b) {
            C13479a.m54772d("NetStateChangeReceiver", "notifyObservers()2222... observer = " + aVar2);
            aVar2.mo19670a(networkType);
        }
    }

    public void onReceive(Context context, Intent intent) {
        C13479a.m54772d("NetStateChangeReceiver", "onReceive()... intent = " + intent);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "com.bytedance.ee.bear.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            NetworkType a = C4974b.m20620a(context);
            f14575a = a;
            m20612a(a);
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m20609a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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

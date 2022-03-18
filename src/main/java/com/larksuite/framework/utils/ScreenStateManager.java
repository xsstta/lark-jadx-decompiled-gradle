package com.larksuite.framework.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import me.ele.lancet.base.annotations.Skip;

public class ScreenStateManager {

    /* renamed from: a */
    private final List<AbstractC26243a> f64828a;

    /* renamed from: b */
    private ScreenBroadcastReceiver f64829b;

    /* renamed from: c */
    private volatile boolean f64830c;

    /* renamed from: com.larksuite.framework.utils.ScreenStateManager$a */
    public interface AbstractC26243a {
        /* renamed from: a */
        void mo93353a();

        /* renamed from: b */
        void mo93354b();
    }

    /* renamed from: com.larksuite.framework.utils.ScreenStateManager$b */
    private static class C26244b {

        /* renamed from: a */
        public static final ScreenStateManager f64832a = new ScreenStateManager();
    }

    /* renamed from: a */
    public static ScreenStateManager m94968a() {
        return C26244b.f64832a;
    }

    private ScreenStateManager() {
        this.f64828a = new CopyOnWriteArrayList();
        this.f64829b = new ScreenBroadcastReceiver();
    }

    public class ScreenBroadcastReceiver extends BroadcastReceiver {
        public ScreenBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Log.m165379d("ScreenBroadcastReceiver", "action = " + action);
            ScreenStateManager.this.mo93350a(action);
        }
    }

    /* renamed from: b */
    private void m94970b(Context context) {
        if (this.f64830c) {
            this.f64830c = false;
            context.unregisterReceiver(this.f64829b);
        }
    }

    /* renamed from: a */
    private void m94969a(Context context) {
        if (!this.f64830c) {
            this.f64830c = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            m94967a(context, this.f64829b, intentFilter);
        }
    }

    /* renamed from: a */
    public void mo93350a(String str) {
        for (AbstractC26243a aVar : this.f64828a) {
            if (aVar != null) {
                if ("android.intent.action.SCREEN_ON".equals(str)) {
                    aVar.mo93353a();
                } else if ("android.intent.action.SCREEN_OFF".equals(str)) {
                    aVar.mo93354b();
                } else {
                    Log.m165379d("ScreenStateManager", "action = " + str);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo93351b(Context context, AbstractC26243a aVar) {
        if (aVar != null) {
            synchronized (this.f64828a) {
                this.f64828a.remove(aVar);
                if (CollectionUtils.isEmpty(this.f64828a)) {
                    m94970b(context);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo93349a(Context context, AbstractC26243a aVar) {
        if (aVar != null) {
            synchronized (this.f64828a) {
                if (!this.f64828a.contains(aVar)) {
                    this.f64828a.add(aVar);
                }
                m94969a(context);
            }
        }
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m94967a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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

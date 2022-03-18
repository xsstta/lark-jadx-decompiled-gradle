package com.bytedance.ee.bear.slide.common.export;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.bytedance.ee.bear.slide.common.export.c */
public class C11404c {

    /* renamed from: a */
    public AbstractC11406a f30644a;

    /* renamed from: b */
    private boolean f30645b = false;

    /* renamed from: c */
    private Context f30646c;

    /* renamed from: d */
    private IntentFilter f30647d;

    /* renamed from: e */
    private BroadcastReceiver f30648e = new BroadcastReceiver() {
        /* class com.bytedance.ee.bear.slide.common.export.C11404c.C114051 */

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_ON".equals(action)) {
                if (C11404c.this.f30644a != null) {
                    C11404c.this.f30644a.mo43666a();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                if (C11404c.this.f30644a != null) {
                    C11404c.this.f30644a.mo43667b();
                }
            } else if ("android.intent.action.USER_PRESENT".equals(action) && C11404c.this.f30644a != null) {
                C11404c.this.f30644a.mo43668c();
            }
        }
    };

    /* renamed from: com.bytedance.ee.bear.slide.common.export.c$a */
    public interface AbstractC11406a {
        /* renamed from: a */
        void mo43666a();

        /* renamed from: b */
        void mo43667b();

        /* renamed from: c */
        void mo43668c();
    }

    /* renamed from: b */
    public void mo43664b() {
        Context context = this.f30646c;
        if (context != null && this.f30645b) {
            this.f30645b = false;
            context.unregisterReceiver(this.f30648e);
        }
    }

    /* renamed from: a */
    public void mo43662a() {
        Context context = this.f30646c;
        if (context != null && !this.f30645b) {
            this.f30645b = true;
            m47362a(context, this.f30648e, this.f30647d);
        }
    }

    /* renamed from: a */
    public void mo43663a(AbstractC11406a aVar) {
        this.f30644a = aVar;
    }

    public C11404c(Context context) {
        this.f30646c = context;
        IntentFilter intentFilter = new IntentFilter();
        this.f30647d = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.f30647d.addAction("android.intent.action.SCREEN_OFF");
        this.f30647d.addAction("android.intent.action.USER_PRESENT");
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m47362a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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

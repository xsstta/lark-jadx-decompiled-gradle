package com.bytedance.ee.bear.basesdk;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.common.C13606d;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import java.util.ArrayList;
import java.util.List;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.bytedance.ee.bear.basesdk.a */
public abstract class AbstractC4344a implements ao {

    /* renamed from: a */
    protected Context f12981a;

    /* renamed from: com.bytedance.ee.bear.basesdk.a$b */
    private interface AbstractC4348b {
        /* renamed from: a */
        void mo16978a(String str);
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.a$d */
    private interface AbstractC4351d {
        /* renamed from: a */
        void mo16980a();
    }

    /* renamed from: com.bytedance.ee.bear.basesdk.a$a */
    private static class C4346a extends BroadcastReceiver {

        /* renamed from: a */
        private final List<AbstractC4348b> f12982a;

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.bear.basesdk.a$a$a */
        public static class C4347a {

            /* renamed from: a */
            public static final C4346a f12983a = new C4346a();
        }

        private C4346a() {
            this.f12982a = new ArrayList();
        }

        /* renamed from: a */
        public static void m17936a(Context context) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
            m17935a(context, C4347a.f12983a, intentFilter);
        }

        /* renamed from: b */
        public static void m17937b(Context context) {
            C13479a.m54772d("TimeZoneChangeReceiver", "unregisterReceiver()... context = " + context);
            context.unregisterReceiver(C4347a.f12983a);
        }

        public void onReceive(Context context, Intent intent) {
            if (TextUtils.equals(intent.getAction(), "android.intent.action.LOCALE_CHANGED")) {
                for (AbstractC4348b bVar : this.f12982a) {
                    bVar.mo16978a(context.getResources().getConfiguration().locale.getLanguage());
                }
            }
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        /* renamed from: a */
        public static Intent m17935a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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

    /* renamed from: com.bytedance.ee.bear.basesdk.a$c */
    private static class C4349c extends BroadcastReceiver {

        /* renamed from: a */
        public List<AbstractC4351d> f12984a;

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.bear.basesdk.a$c$a */
        public static class C4350a {

            /* renamed from: a */
            public static final C4349c f12985a = new C4349c();
        }

        private C4349c() {
            this.f12984a = new ArrayList();
        }

        /* renamed from: b */
        public static void m17941b(Context context) {
            C13479a.m54772d("TimeZoneChangeReceiver", "unregisterReceiver()... context = " + context);
            context.unregisterReceiver(C4350a.f12985a);
        }

        /* renamed from: a */
        public static void m17940a(Context context) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            try {
                m17939a(context, C4350a.f12985a, intentFilter);
            } catch (Exception e) {
                C13606d.m55245a("AbsLocaleServiceImp", e);
            }
        }

        public void onReceive(Context context, Intent intent) {
            for (AbstractC4351d dVar : this.f12984a) {
                dVar.mo16980a();
            }
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        /* renamed from: a */
        public static Intent m17939a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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

    /* renamed from: a */
    public void mo16975a() {
        C4349c.m17941b(this.f12981a);
        C4346a.m17937b(this.f12981a);
    }

    /* renamed from: a */
    public void mo16976a(Application application) {
        Context applicationContext = application.getApplicationContext();
        this.f12981a = applicationContext;
        C4349c.m17940a(applicationContext);
        C4346a.m17936a(this.f12981a);
    }
}

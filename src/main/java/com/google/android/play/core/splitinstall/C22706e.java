package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.p993a.AbstractC22566c;

/* renamed from: com.google.android.play.core.splitinstall.e */
public final class C22706e extends AbstractC22566c<SplitInstallSessionState> {

    /* renamed from: c */
    private static C22706e f56196c;

    /* renamed from: d */
    private final Handler f56197d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final AbstractC22726x f56198e;

    public C22706e(Context context, AbstractC22726x xVar) {
        super(new C22630b("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f56198e = xVar;
    }

    /* renamed from: a */
    public static synchronized C22706e m82631a(Context context) {
        C22706e eVar;
        synchronized (C22706e.class) {
            if (f56196c == null) {
                f56196c = new C22706e(context, EnumC22725w.f56241a);
            }
            eVar = f56196c;
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.p993a.AbstractC22566c
    /* renamed from: a */
    public final void mo78655a(Context context, Intent intent) {
        Bundle a = m82629a(intent, "session_state");
        if (a != null) {
            SplitInstallSessionState a2 = SplitInstallSessionState.m82545a(a);
            this.f55610a.mo78871a("ListenerRegistryBroadcastReceiver.onReceive: %s", a2);
            AbstractC22727y a3 = this.f56198e.mo79066a();
            if (a2.status() == 3 && a3 != null) {
                a3.mo78863a(a2.mo79026c(), new C22704c(this, a2, intent, context));
            } else {
                mo78657a(a2);
            }
        }
    }

    /* renamed from: a */
    public static Bundle m82629a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }
}

package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.google.android.play.core.internal.AbstractC22633by;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.p993a.AbstractC22566c;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.s */
public final class C22609s extends AbstractC22566c<AssetPackState> {

    /* renamed from: c */
    private final bp f55971c;

    /* renamed from: d */
    private final az f55972d;

    /* renamed from: e */
    private final AbstractC22633by<dl> f55973e;

    /* renamed from: f */
    private final aj f55974f;

    /* renamed from: g */
    private final bb f55975g;

    /* renamed from: h */
    private final AbstractC22633by<Executor> f55976h;

    /* renamed from: i */
    private final AbstractC22633by<Executor> f55977i;

    /* renamed from: j */
    private final Handler f55978j = new Handler(Looper.getMainLooper());

    C22609s(Context context, bp bpVar, az azVar, AbstractC22633by<dl> byVar, bb bbVar, aj ajVar, AbstractC22633by<Executor> byVar2, AbstractC22633by<Executor> byVar3) {
        super(new C22630b("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f55971c = bpVar;
        this.f55972d = azVar;
        this.f55973e = byVar;
        this.f55975g = bbVar;
        this.f55974f = ajVar;
        this.f55976h = byVar2;
        this.f55977i = byVar3;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.p993a.AbstractC22566c
    /* renamed from: a */
    public final void mo78655a(Context context, Intent intent) {
        Bundle a = m82177a(intent, "com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (a != null) {
            ArrayList<String> stringArrayList = a.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f55610a.mo78873b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState a2 = AssetPackState.m81924a(a, stringArrayList.get(0), this.f55975g, C22611u.f55987a);
            this.f55610a.mo78871a("ListenerRegistryBroadcastReceiver.onReceive: %s", a2);
            PendingIntent pendingIntent = (PendingIntent) a.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f55974f.mo78735a(pendingIntent);
            }
            this.f55977i.mo78909a().execute(new RunnableC22607q(this, a, a2));
            this.f55976h.mo78909a().execute(new RunnableC22608r(this, a));
            return;
        }
        this.f55610a.mo78873b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo78819a(Bundle bundle) {
        if (this.f55971c.mo78765a(bundle)) {
            this.f55972d.mo78754a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo78820a(Bundle bundle, AssetPackState assetPackState) {
        if (this.f55971c.mo78769b(bundle)) {
            mo78821a(assetPackState);
            this.f55973e.mo78909a().mo78780a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78821a(AssetPackState assetPackState) {
        this.f55978j.post(new RunnableC22606p(this, assetPackState));
    }

    /* renamed from: a */
    public static Bundle m82177a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }
}

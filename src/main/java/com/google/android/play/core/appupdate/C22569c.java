package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.AbstractC22645n;
import com.google.android.play.core.internal.C22622ac;
import com.google.android.play.core.internal.C22630b;

/* renamed from: com.google.android.play.core.appupdate.c */
final class C22569c {

    /* renamed from: b */
    private static final C22630b f55617b = new C22630b("AppUpdateService");

    /* renamed from: c */
    private static final Intent f55618c = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    C22622ac<AbstractC22645n> f55619a;

    /* renamed from: d */
    private final C22570d f55620d;

    /* renamed from: a */
    static /* synthetic */ AbstractC22567a m81900a(C22569c cVar, Bundle bundle, String str) {
        return AbstractC22567a.m81884a(str, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), bundle.getInt("client.version.staleness", -1) != -1 ? Integer.valueOf(bundle.getInt("client.version.staleness")) : null, bundle.getInt("in.app.update.priority", 0), bundle.getLong("bytes.downloaded"), bundle.getLong("total.bytes.to.download"), bundle.getLong("additional.size.required"), cVar.f55620d.mo78676a(), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent"));
    }
}

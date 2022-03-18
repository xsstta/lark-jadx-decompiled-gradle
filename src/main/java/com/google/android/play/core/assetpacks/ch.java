package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.internal.C22630b;

/* access modifiers changed from: package-private */
public final class ch {

    /* renamed from: a */
    private static final C22630b f55853a = new C22630b("PackageStateCache");

    /* renamed from: b */
    private final Context f55854b;

    /* renamed from: c */
    private int f55855c = -1;

    ch(Context context) {
        this.f55854b = context;
    }

    /* renamed from: a */
    public final synchronized int mo78791a() {
        if (this.f55855c == -1) {
            try {
                this.f55855c = this.f55854b.getPackageManager().getPackageInfo(this.f55854b.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f55853a.mo78873b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f55855c;
    }
}

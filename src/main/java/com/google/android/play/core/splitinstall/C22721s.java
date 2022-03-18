package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.C22622ac;
import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.internal.bf;
import com.google.android.play.core.internal.bp;
import com.google.android.play.core.tasks.C22731c;
import com.google.android.play.core.tasks.C22741m;
import com.google.android.play.core.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitinstall.s */
public final class C22721s {

    /* renamed from: b */
    private static final C22630b f56234b = new C22630b("SplitInstallService");

    /* renamed from: c */
    private static final Intent f56235c = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    C22622ac<bp> f56236a;

    /* renamed from: d */
    private final String f56237d;

    public C22721s(Context context) {
        this.f56237d = context.getPackageName();
        if (bf.m82327a(context)) {
            this.f56236a = new C22622ac<>(az.m82612a(context), f56234b, "SplitInstallService", f56235c, C22711j.f56207a);
        }
    }

    /* renamed from: a */
    static /* synthetic */ ArrayList m82649a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    static /* synthetic */ Bundle m82650b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10703);
        return bundle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Collection */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    static /* synthetic */ ArrayList m82651b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        int size = collection.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = new Bundle();
            bundle.putString("language", (String) collection.get(i));
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: d */
    private static <T> Task<T> m82653d() {
        f56234b.mo78873b("onError(%d)", -14);
        return C22731c.m82677a((Exception) new SplitInstallException(-14));
    }

    /* renamed from: a */
    public final Task<List<SplitInstallSessionState>> mo79055a() {
        if (this.f56236a == null) {
            return m82653d();
        }
        f56234b.mo78874c("getSessionStates", new Object[0]);
        C22741m mVar = new C22741m();
        this.f56236a.mo78859a(new C22719q(this, mVar, mVar));
        return mVar.mo79088a();
    }

    /* renamed from: a */
    public final Task<SplitInstallSessionState> mo79056a(int i) {
        if (this.f56236a == null) {
            return m82653d();
        }
        f56234b.mo78874c("getSessionState(%d)", Integer.valueOf(i));
        C22741m mVar = new C22741m();
        this.f56236a.mo78859a(new C22718p(this, mVar, i, mVar));
        return mVar.mo79088a();
    }

    /* renamed from: a */
    public final Task<Integer> mo79057a(Collection<String> collection, Collection<String> collection2) {
        if (this.f56236a == null) {
            return m82653d();
        }
        f56234b.mo78874c("startInstall(%s,%s)", collection, collection2);
        C22741m mVar = new C22741m();
        this.f56236a.mo78859a(new C22712k(this, mVar, collection, collection2, mVar));
        return mVar.mo79088a();
    }

    /* renamed from: a */
    public final Task<Void> mo79058a(List<String> list) {
        if (this.f56236a == null) {
            return m82653d();
        }
        f56234b.mo78874c("deferredUninstall(%s)", list);
        C22741m mVar = new C22741m();
        this.f56236a.mo78859a(new C22713l(this, mVar, list, mVar));
        return mVar.mo79088a();
    }

    /* renamed from: b */
    public final Task<Void> mo79059b(int i) {
        if (this.f56236a == null) {
            return m82653d();
        }
        f56234b.mo78874c("cancelInstall(%d)", Integer.valueOf(i));
        C22741m mVar = new C22741m();
        this.f56236a.mo78859a(new C22720r(this, mVar, i, mVar));
        return mVar.mo79088a();
    }

    /* renamed from: b */
    public final Task<Void> mo79060b(List<String> list) {
        if (this.f56236a == null) {
            return m82653d();
        }
        f56234b.mo78874c("deferredInstall(%s)", list);
        C22741m mVar = new C22741m();
        this.f56236a.mo78859a(new C22714m(this, mVar, list, mVar));
        return mVar.mo79088a();
    }

    /* renamed from: c */
    public final Task<Void> mo79061c(List<String> list) {
        if (this.f56236a == null) {
            return m82653d();
        }
        f56234b.mo78874c("deferredLanguageInstall(%s)", list);
        C22741m mVar = new C22741m();
        this.f56236a.mo78859a(new C22716n(this, mVar, list, mVar));
        return mVar.mo79088a();
    }

    /* renamed from: d */
    public final Task<Void> mo79062d(List<String> list) {
        if (this.f56236a == null) {
            return m82653d();
        }
        f56234b.mo78874c("deferredLanguageUninstall(%s)", list);
        C22741m mVar = new C22741m();
        this.f56236a.mo78859a(new C22717o(this, mVar, list, mVar));
        return mVar.mo79088a();
    }
}

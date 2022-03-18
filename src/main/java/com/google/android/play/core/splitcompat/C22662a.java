package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.play.core.internal.C22624ae;
import com.google.android.play.core.internal.C22625af;
import com.google.android.play.core.internal.C22627ah;
import com.google.android.play.core.internal.bj;
import com.google.android.play.core.splitinstall.EnumC22725w;
import com.google.android.play.core.splitinstall.bb;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitcompat.a */
public class C22662a {

    /* renamed from: a */
    private static final AtomicReference<C22662a> f56076a = new AtomicReference<>(null);

    /* renamed from: b */
    private final C22666e f56077b;

    /* renamed from: c */
    private final Set<String> f56078c = new HashSet();

    /* renamed from: d */
    private final C22663b f56079d;

    private C22662a(Context context) {
        try {
            C22666e eVar = new C22666e(context);
            this.f56077b = eVar;
            this.f56079d = new C22663b(eVar);
        } catch (PackageManager.NameNotFoundException e) {
            throw new bj("Failed to initialize FileStorage", e);
        }
    }

    /* renamed from: a */
    public static boolean m82488a() {
        return f56076a.get() != null;
    }

    /* renamed from: a */
    public static boolean m82489a(Context context) {
        return m82490a(context, false);
    }

    /* renamed from: a */
    private static boolean m82490a(Context context, boolean z) {
        if (!m82493b()) {
            AtomicReference<C22662a> atomicReference = f56076a;
            boolean compareAndSet = atomicReference.compareAndSet(null, new C22662a(context));
            C22662a aVar = atomicReference.get();
            if (compareAndSet) {
                EnumC22725w.f56241a.mo79067a(new C22624ae(context, C22679r.m82538a(), new C22625af(context, aVar.f56077b, new C22627ah(), null), aVar.f56077b, new C22679r()));
                bb.m82618a(new C22675n(aVar));
                C22679r.m82538a().execute(new RunnableC22676o(context));
            }
            try {
                aVar.m82492b(context, z);
                return true;
            } catch (Exception e) {
                Log.e("SplitCompat", "Error installing additional splits", e);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a4 A[SYNTHETIC, Splitter:B:76:0x01a4] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m82492b(android.content.Context r9, boolean r10) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 589
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C22662a.m82492b(android.content.Context, boolean):void");
    }

    /* renamed from: b */
    private static boolean m82493b() {
        return Build.VERSION.SDK_INT < 21;
    }

    /* renamed from: b */
    public static boolean m82494b(Context context) {
        if (m82493b()) {
            return false;
        }
        C22662a aVar = f56076a.get();
        if (aVar != null) {
            return aVar.f56079d.mo78974a(context, aVar.m82495c());
        }
        throw new IllegalStateException("SplitCompat.installActivity can only be called if SplitCompat.install is first called at startup on application context.");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Set<String> m82495c() {
        HashSet hashSet;
        synchronized (this.f56078c) {
            hashSet = new HashSet(this.f56078c);
        }
        return hashSet;
    }

    /* renamed from: c */
    public static boolean m82496c(Context context) {
        return m82490a(context, true);
    }
}

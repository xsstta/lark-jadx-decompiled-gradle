package com.tt.miniapphost.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.host.HostDependManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;

/* renamed from: com.tt.miniapphost.util.b */
public class C67584b {

    /* renamed from: a */
    static C67585a f170413a = new C67585a();

    /* renamed from: b */
    static C67585a f170414b = new C67585a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapphost.util.b$a */
    public static class C67585a {

        /* renamed from: a */
        private volatile WeakReference<AssetManager> f170415a;

        /* renamed from: b */
        private LinkedHashSet<Integer> f170416b = new LinkedHashSet<>();

        C67585a() {
        }

        /* renamed from: a */
        public void mo234782a(Context context, AssetManager assetManager) {
            if (this.f170415a == null || this.f170415a.get() != assetManager) {
                synchronized (this) {
                    if (this.f170415a == null || this.f170415a.get() != assetManager) {
                        this.f170415a = new WeakReference<>(assetManager);
                        int identityHashCode = System.identityHashCode(assetManager);
                        if (!this.f170416b.contains(Integer.valueOf(identityHashCode))) {
                            try {
                                HostDependManager.getInst().doAppBundleSplitInstallAction(context);
                            } catch (Throwable th) {
                                AppBrandLogger.m52829e("DynamicAppAssetsCompat", th);
                            }
                            this.f170416b.add(Integer.valueOf(identityHashCode));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m263042a(Context context) {
        if (context != null) {
            m263043a(context, context.getAssets());
        }
    }

    /* renamed from: a */
    public static void m263043a(Context context, AssetManager assetManager) {
        if (AppbrandUtil.isAppBundleEnable() && context != null && assetManager != null) {
            if (context instanceof Activity) {
                f170413a.mo234782a(context, assetManager);
            } else {
                f170414b.mo234782a(context, assetManager);
            }
        }
    }
}

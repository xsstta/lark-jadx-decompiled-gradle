package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.m */
class C1166m {

    /* renamed from: a */
    private static AtomicBoolean f4294a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.m$a */
    static class C1167a extends C1159g {
        @Override // androidx.lifecycle.C1159g
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // androidx.lifecycle.C1159g
        public void onActivityStopped(Activity activity) {
        }

        C1167a() {
        }

        @Override // androidx.lifecycle.C1159g
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ReportFragment.m5308a(activity);
        }
    }

    /* renamed from: a */
    static void m5397a(Context context) {
        if (!f4294a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1167a());
        }
    }
}

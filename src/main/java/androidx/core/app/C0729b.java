package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* renamed from: androidx.core.app.b */
public class C0729b {
    /* renamed from: a */
    public Bundle mo4236a() {
        return null;
    }

    protected C0729b() {
    }

    /* renamed from: androidx.core.app.b$a */
    private static class C0730a extends C0729b {

        /* renamed from: a */
        private final ActivityOptions f3067a;

        @Override // androidx.core.app.C0729b
        /* renamed from: a */
        public Bundle mo4236a() {
            return this.f3067a.toBundle();
        }

        C0730a(ActivityOptions activityOptions) {
            this.f3067a = activityOptions;
        }
    }

    /* renamed from: a */
    public static C0729b m3580a(Context context, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C0730a(ActivityOptions.makeCustomAnimation(context, i, i2));
        }
        return new C0729b();
    }
}

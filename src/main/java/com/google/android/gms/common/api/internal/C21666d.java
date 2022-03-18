package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.common.api.internal.d */
public class C21666d {

    /* renamed from: a */
    private final Object f52856a;

    public C21666d(Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.f52856a = activity;
    }

    /* renamed from: a */
    public boolean mo73474a() {
        return this.f52856a instanceof FragmentActivity;
    }

    /* renamed from: b */
    public final boolean mo73475b() {
        return this.f52856a instanceof Activity;
    }

    /* renamed from: c */
    public Activity mo73476c() {
        return (Activity) this.f52856a;
    }

    /* renamed from: d */
    public FragmentActivity mo73477d() {
        return (FragmentActivity) this.f52856a;
    }
}

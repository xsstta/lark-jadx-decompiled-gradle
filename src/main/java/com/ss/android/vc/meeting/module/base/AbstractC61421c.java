package com.ss.android.vc.meeting.module.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.vc.meeting.module.base.c */
public abstract class AbstractC61421c extends C61434m {

    /* renamed from: a */
    protected WeakReference<Activity> f154012a;

    /* renamed from: b */
    protected View f154013b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo212878a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo212881a(View view, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.f154013b;
        if (view != null) {
            mo212881a(view, bundle);
        }
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public void mo212880a(Context context) {
        this.f154012a = new WeakReference<>((Activity) context);
        super.mo212880a(context);
    }

    @Override // com.ss.android.vc.meeting.module.base.C61434m
    /* renamed from: a */
    public View mo212879a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo212878a(), viewGroup, false);
        this.f154013b = inflate;
        return inflate;
    }
}

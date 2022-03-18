package com.ss.android.vc.meeting.module.enterprisephone;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.vc.meeting.module.enterprisephone.a */
public abstract class AbstractC61645a extends Fragment {

    /* renamed from: a */
    protected WeakReference<Activity> f154647a;

    /* renamed from: b */
    protected View f154648b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo213537a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo213538a(View view, Bundle bundle);

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.f154648b;
        if (view != null) {
            mo213538a(view, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        this.f154647a = new WeakReference<>((Activity) context);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo213537a(), viewGroup, false);
        this.f154648b = inflate;
        return inflate;
    }
}

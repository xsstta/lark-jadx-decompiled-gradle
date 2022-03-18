package com.bytedance.ee.bear.facade.common.p380a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.facade.common.a.a */
public class C7662a extends C7667e {

    /* renamed from: a */
    protected LayoutInflater f20781a;

    /* renamed from: b */
    protected Context f20782b;

    /* renamed from: c */
    private View f20783c;

    /* renamed from: d */
    private ViewGroup f20784d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30108a(Bundle bundle) {
    }

    /* renamed from: b */
    public Context mo30110b() {
        return this.f20782b;
    }

    /* renamed from: c */
    public View mo30112c() {
        return this.f20783c;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f20783c = null;
        this.f20784d = null;
        this.f20781a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean getUserVisibleHint() {
        try {
            return super.getUserVisibleHint();
        } catch (Exception e) {
            C13479a.m54758a("LazyBaseFragment", "getUserVisibleHint()... e =" + e.toString());
            return true;
        }
    }

    /* renamed from: a */
    public void mo30109a(View view) {
        this.f20783c = view;
    }

    /* renamed from: a */
    public void mo30107a(int i) {
        mo30109a((ViewGroup) this.f20781a.inflate(i, this.f20784d, false));
    }

    /* renamed from: b */
    public View mo30111b(int i) {
        View view = this.f20783c;
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20782b = getActivity().getApplicationContext();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("FragmentManagerImpl_Null_Bug", "FragmentManagerImpl_NULL_Bug");
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20781a = layoutInflater;
        this.f20784d = viewGroup;
        mo30108a(bundle);
        View view = this.f20783c;
        if (view == null) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        return view;
    }
}

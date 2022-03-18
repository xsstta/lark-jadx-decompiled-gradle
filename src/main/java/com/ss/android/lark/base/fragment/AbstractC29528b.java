package com.ss.android.lark.base.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.base.fragment.b */
public abstract class AbstractC29528b extends BaseFragment {

    /* renamed from: L */
    protected ViewGroup f73822L;

    /* renamed from: a */
    private boolean f73823a = true;

    /* renamed from: b */
    private boolean f73824b;

    /* renamed from: c */
    private boolean f73825c;

    /* renamed from: d */
    private boolean f73826d;

    /* renamed from: e */
    private boolean f73827e;

    /* renamed from: f */
    private boolean f73828f;

    /* renamed from: g */
    private LayoutInflater f73829g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo67276a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67279a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo67289c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo67291d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo104653l() {
    }

    /* renamed from: b */
    private boolean mo67285b() {
        return this.f73823a;
    }

    /* renamed from: f */
    private void mo67293f() {
        if (!this.f73826d && this.f73825c) {
            mo67292e();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (!this.f73828f && this.f73826d) {
            mo104653l();
            this.f73826d = false;
            this.f73828f = true;
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (mo67285b() && !this.f73824b) {
            mo67291d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (mo67285b() && !this.f73824b) {
            mo67289c();
        }
    }

    /* renamed from: a */
    private boolean mo67278a() {
        if (!mo67285b() || !this.f73824b || this.f73825c) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void mo67292e() {
        if (this.f73827e) {
            View a = mo67276a(this.f73829g, this.f73822L);
            if (a != null) {
                this.f73822L.addView(a, new FrameLayout.LayoutParams(-1, -1));
                try {
                    this.mBkUnbinder = ButterKnife.bind(this, this.f73822L);
                } catch (Exception unused) {
                    Log.m165383e("LazyLoadFragment", "Error when bind " + this.f73822L + ", maybe contentView not match the annotated view");
                }
                mo67279a(this.f73822L);
                this.f73826d = true;
                return;
            }
            throw new RuntimeException("getContentView can't be null");
        }
    }

    /* renamed from: d */
    public final void mo104652d(boolean z) {
        this.f73823a = z;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        mo67284a(!z);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f73824b = true;
        mo67284a(z);
    }

    /* renamed from: a */
    private void mo67284a(boolean z) {
        if (z) {
            this.f73825c = true;
            mo67293f();
            mo67289c();
            return;
        }
        this.f73825c = false;
        mo67291d();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73829g = layoutInflater;
        this.f73822L = new FrameLayout(getContext());
        this.f73827e = true;
        if (!mo67278a()) {
            mo67292e();
        }
        return this.f73822L;
    }
}

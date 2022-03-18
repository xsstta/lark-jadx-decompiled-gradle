package com.bytedance.ee.bear.facade.common.p380a;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.facade.common.a.b */
public class C7663b extends C7662a {

    /* renamed from: c */
    private Bundle f20785c;

    /* renamed from: d */
    private FrameLayout f20786d;

    /* renamed from: e */
    private boolean f20787e;

    /* renamed from: f */
    private boolean f20788f = true;

    /* renamed from: g */
    private boolean f20789g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30113b(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo30115d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo30116e() {
    }

    /* access modifiers changed from: protected */
    public void x_() {
    }

    /* renamed from: i */
    public boolean mo30119i() {
        return this.f20787e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo30117f() {
        C13479a.m54772d("LazyFragment", "onResumeLazy() called with: ");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo30118g() {
        C13479a.m54772d("LazyFragment", "onPauseLazy() called with: ");
    }

    @Override // com.bytedance.ee.bear.facade.common.p380a.C7662a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f20787e) {
            x_();
        }
        this.f20787e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.f20787e) {
            mo30118g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f20787e) {
            mo30117f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.f20787e && !this.f20789g && super.getUserVisibleHint()) {
            this.f20789g = true;
            mo30115d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.f20787e && this.f20789g && super.getUserVisibleHint()) {
            this.f20789g = false;
            mo30116e();
        }
    }

    public void c_(boolean z) {
        this.f20787e = z;
    }

    @Override // com.bytedance.ee.bear.facade.common.p380a.C7662a
    /* renamed from: a */
    public void mo30107a(int i) {
        if (!this.f20788f || mo30112c() == null || mo30112c().getParent() == null) {
            super.mo30107a(i);
            return;
        }
        this.f20786d.removeAllViews();
        this.f20786d.addView(this.f20781a.inflate(i, (ViewGroup) this.f20786d, false));
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7662a
    /* renamed from: a */
    public final void mo30108a(Bundle bundle) {
        super.mo30108a(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f20788f = arguments.getBoolean("intent_boolean_lazyLoad", this.f20788f);
        }
        if (!this.f20788f) {
            mo30113b(bundle);
            this.f20787e = true;
        } else if (!super.getUserVisibleHint() || this.f20787e) {
            FrameLayout frameLayout = new FrameLayout(mo30110b());
            this.f20786d = frameLayout;
            super.mo30109a(frameLayout);
        } else {
            this.f20785c = bundle;
            mo30113b(bundle);
            this.f20787e = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C13479a.m54772d("LazyFragment", "setUserVisibleHint() called with: isVisibleToUser = [" + z + "]");
        if (z && !this.f20787e && mo30112c() != null) {
            mo30113b(this.f20785c);
            this.f20787e = true;
            mo30117f();
        }
        if (this.f20787e && mo30112c() != null) {
            if (z) {
                this.f20789g = true;
                mo30115d();
                return;
            }
            this.f20789g = false;
            mo30116e();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.p380a.C7662a
    /* renamed from: a */
    public void mo30109a(View view) {
        if (!this.f20788f || mo30112c() == null || mo30112c().getParent() == null) {
            super.mo30109a(view);
            return;
        }
        this.f20786d.removeAllViews();
        this.f20786d.addView(view);
    }
}

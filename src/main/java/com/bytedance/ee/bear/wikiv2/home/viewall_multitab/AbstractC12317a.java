package com.bytedance.ee.bear.wikiv2.home.viewall_multitab;

import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall_multitab.a */
public abstract class AbstractC12317a extends C7667e {

    /* renamed from: a */
    protected boolean f33081a;

    /* renamed from: b */
    protected boolean f33082b;

    /* renamed from: c */
    protected boolean f33083c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo46982a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo46983b() {
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        this.f33082b = false;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean getUserVisibleHint() {
        try {
            return super.getUserVisibleHint();
        } catch (Exception e) {
            C13479a.m54761a("AbsDrivePreviewFragment", e);
            return true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (this.f33083c) {
            mo46983b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getUserVisibleHint()) {
            this.f33081a = true;
            if (this.f33082b && !this.f33083c) {
                this.f33083c = true;
                mo46982a();
                return;
            }
            return;
        }
        this.f33081a = false;
        if (this.f33082b && this.f33083c) {
            this.f33083c = false;
            mo46983b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f33082b = true;
        if (!this.f33083c && this.f33081a) {
            this.f33083c = true;
            mo46982a();
        }
    }
}

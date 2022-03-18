package com.bytedance.ee.bear.middleground.docsdk.v2;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

class ActivityDocSdkImpl extends BaseDocSdk {

    /* renamed from: d */
    private FragmentActivity f25056d;

    /* renamed from: e */
    private final ViewGroup f25057e;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk
    /* renamed from: a */
    public FragmentActivity mo35569a() {
        return this.f25056d;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk
    /* renamed from: b */
    public FragmentManager mo35570b() {
        return this.f25056d.getSupportFragmentManager();
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk
    public void onDestroy() {
        mo35575c();
        super.onDestroy();
    }

    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk
    public void onCreate() {
        super.onCreate();
        mo35573a(this.f25057e);
    }
}

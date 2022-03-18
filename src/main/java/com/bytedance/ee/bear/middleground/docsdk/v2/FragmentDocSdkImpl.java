package com.bytedance.ee.bear.middleground.docsdk.v2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.middleground.docsdk.v2.DocSdkV2;

/* access modifiers changed from: package-private */
public class FragmentDocSdkImpl extends BaseDocSdk implements DocSdkV2.AbstractC9329b {

    /* renamed from: d */
    private final Fragment f25082d;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk
    /* renamed from: a */
    public FragmentActivity mo35569a() {
        return this.f25082d.getActivity();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.middleground.docsdk.v2.BaseDocSdk
    /* renamed from: b */
    public FragmentManager mo35570b() {
        return this.f25082d.getChildFragmentManager();
    }

    FragmentDocSdkImpl(Fragment fragment, DocSdkV2.C9328a aVar) {
        this.f25082d = fragment;
        mo35574a(aVar);
    }
}

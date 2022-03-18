package com.bytedance.ee.bear.imageviewer;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageCommentData;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5186a;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5190e;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;

/* renamed from: com.bytedance.ee.bear.imageviewer.g */
public class C7859g extends C7667e implements AbstractC5179a, AbstractC7666d {

    /* renamed from: a */
    private AbstractC7843b f21228a = new C7846e();

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20671a() {
        this.f21228a.mo20671a();
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: c */
    public String mo20680c() {
        return this.f21228a.mo20680c();
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    public boolean t_() {
        return isAdded();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null) {
            return C13615c.f35773a;
        }
        return super.getContext();
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f21228a.mo30654e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C13479a.m54772d("ImageViewerFragment", "onDestroyView");
        this.f21228a.mo30653d();
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20672a(AbstractC5181a aVar) {
        this.f21228a.mo20672a(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21228a.mo30650a(configuration);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20673a(AbstractC5184b bVar) {
        this.f21228a.mo20673a(bVar);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54772d("ImageViewerFragment", "onCreate");
        this.f21228a.mo30652a(getActivity(), this, this, getArguments());
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20674a(ImageCommentData imageCommentData) {
        this.f21228a.mo20674a(imageCommentData);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20675a(ImageData imageData) {
        this.f21228a.mo20675a(imageData);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20676a(AbstractC5186a aVar) {
        this.f21228a.mo20676a(aVar);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20677a(AbstractC5187b bVar) {
        this.f21228a.mo20677a(bVar);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20678a(AbstractC5188c cVar) {
        this.f21228a.mo20678a(cVar);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20679a(AbstractC5190e eVar) {
        this.f21228a.mo20679a(eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f21228a.mo30651a(view, (ImageData) getArguments().getSerializable("extra_image"));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13479a.m54772d("ImageViewerFragment", "onCreateView");
        return this.f21228a.mo30649a(layoutInflater, viewGroup);
    }
}

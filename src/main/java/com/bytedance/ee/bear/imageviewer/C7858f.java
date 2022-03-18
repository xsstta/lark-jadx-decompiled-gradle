package com.bytedance.ee.bear.imageviewer;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageCommentData;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5186a;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5190e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.imageviewer.f */
public class C7858f extends DialogInterface$OnCancelListenerC1021b implements AbstractC5179a {

    /* renamed from: c */
    private AbstractC7843b f21227c = new C7846e();

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20671a() {
        this.f21227c.mo20671a();
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: c */
    public String mo20680c() {
        return this.f21227c.mo20680c();
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f21227c.mo30654e();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C13479a.m54772d("ImageViewerFragment", "onDestroyView");
        this.f21227c.mo30653d();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        mo5510a(R.style.TransparentBackgroundDialogStyle, 0);
        Dialog v_ = v_();
        if (v_.getWindow() != null) {
            Window window = v_.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.flags |= 8;
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.ImageViewerAnimationDialog);
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20672a(AbstractC5181a aVar) {
        this.f21227c.mo20672a(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21227c.mo30650a(configuration);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20673a(AbstractC5184b bVar) {
        this.f21227c.mo20673a(bVar);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13479a.m54772d("ImageViewerFragment", "onCreate");
        this.f21227c.mo30652a(getActivity(), this, this, getArguments());
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20674a(ImageCommentData imageCommentData) {
        this.f21227c.mo20674a(imageCommentData);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20675a(ImageData imageData) {
        this.f21227c.mo20675a(imageData);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20676a(AbstractC5186a aVar) {
        this.f21227c.mo20676a(aVar);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20677a(AbstractC5187b bVar) {
        this.f21227c.mo20677a(bVar);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20678a(AbstractC5188c cVar) {
        this.f21227c.mo20678a(cVar);
    }

    @Override // com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a
    /* renamed from: a */
    public void mo20679a(AbstractC5190e eVar) {
        this.f21227c.mo20679a(eVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C13479a.m54772d("ImageViewerFragment", "onViewCreated");
        this.f21227c.mo30651a(view, (ImageData) getArguments().getSerializable("extra_image"));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C13479a.m54772d("ImageViewerFragment", "onCreateView");
        return this.f21227c.mo30649a(layoutInflater, viewGroup);
    }
}

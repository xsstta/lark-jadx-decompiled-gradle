package com.bytedance.ee.bear.drive.view.preview.loadingview;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.drive.mimetype.C7094b;
import com.bytedance.ee.bear.drive.mimetype.C7096d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.loadingview.a */
public class C7402a extends AbsLoadingView {

    /* renamed from: d */
    private FileLoadingView f19907d;

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: a */
    public View mo28888a() {
        return this.f19907d;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: b */
    public void mo28890b() {
        this.f19907d.mo28895a(C7096d.m28341a(this.f19887b.mo29494m()));
        this.f19907d.mo28894a();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: a */
    public void mo28889a(int i) {
        this.f19907d.setProgress(i);
    }

    public C7402a(Context context, C7553d dVar, C7094b bVar) {
        super(context, dVar, bVar);
        this.f19907d = new FileLoadingView(context);
    }
}

package com.bytedance.ee.bear.drive.view.preview.loadingview;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.drive.mimetype.C7094b;
import com.bytedance.ee.bear.drive.mimetype.C7096d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;

public class PdfLoadingView extends AbsLoadingView {

    /* renamed from: d */
    private FileLoadingView f19905d = new FileLoadingView(this.f19886a);

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: a */
    public View mo28888a() {
        return this.f19905d;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: b */
    public void mo28890b() {
        this.f19905d.mo28895a(C7096d.m28341a(this.f19887b.mo29494m()));
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: a */
    public void mo28889a(int i) {
        this.f19905d.setProgress(i);
    }

    public PdfLoadingView(Context context, C7553d dVar, C7094b bVar) {
        super(context, dVar, bVar);
    }
}

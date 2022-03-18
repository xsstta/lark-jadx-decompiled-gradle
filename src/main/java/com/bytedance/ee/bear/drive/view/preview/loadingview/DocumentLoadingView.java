package com.bytedance.ee.bear.drive.view.preview.loadingview;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.drive.mimetype.C7094b;
import com.bytedance.ee.bear.drive.mimetype.C7096d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;

public class DocumentLoadingView extends AbsLoadingView {

    /* renamed from: d */
    private FileLoadingView f19893d;

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: a */
    public View mo28888a() {
        return this.f19893d;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: b */
    public void mo28890b() {
        this.f19893d.mo28895a(C7096d.m28341a(this.f19887b.mo29494m()));
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: a */
    public void mo28889a(int i) {
        this.f19893d.setProgress(i);
    }

    public DocumentLoadingView(Context context, C7553d dVar, C7094b bVar) {
        super(context, dVar, bVar);
        this.f19893d = new FileLoadingView(context);
    }
}

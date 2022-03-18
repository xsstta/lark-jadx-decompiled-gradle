package com.bytedance.ee.bear.drive.view.preview.loadingview;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.ee.bear.drive.mimetype.C7094b;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.larksuite.suite.R;

public class ImageLoadingView extends AbsLoadingView {

    /* renamed from: d */
    private FrameLayout f19899d;

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: a */
    public void mo28889a(int i) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: b */
    public void mo28890b() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.loadingview.AbstractC7403b
    /* renamed from: a */
    public View mo28888a() {
        return this.f19899d;
    }

    /* renamed from: a */
    private void m29595a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f19899d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f19899d.setBackgroundColor(context.getResources().getColor(R.color.bg_base));
        ProgressBar progressBar = new ProgressBar(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        this.f19899d.addView(progressBar);
    }

    public ImageLoadingView(Context context, C7553d dVar, C7094b bVar) {
        super(context, dVar, bVar);
        m29595a(context);
    }
}

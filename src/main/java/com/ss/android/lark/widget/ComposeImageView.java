package com.ss.android.lark.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;

public class ComposeImageView extends FrameLayout {

    /* renamed from: a */
    private SubsamplingScaleImageView f143338a;

    /* renamed from: b */
    private ImageView f143339b;

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public ImageView getNormalImageView() {
        return this.f143339b;
    }

    public ComposeImageView(Context context) {
        super(context);
        m226066a(context);
    }

    /* renamed from: a */
    private void m226066a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.__compose_image_view, (ViewGroup) this, true);
        this.f143338a = (SubsamplingScaleImageView) findViewById(R.id.large_image_view);
        this.f143339b = (ImageView) findViewById(R.id.image_view);
        this.f143338a.setVisibility(8);
        this.f143339b.setVisibility(0);
        this.f143338a.setExecutor(CoreThreadPool.getDefault().getCachedThreadPool());
    }

    public ComposeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226066a(context);
    }

    public ComposeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226066a(context);
    }
}

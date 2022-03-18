package com.ss.android.vc.meeting.module.tab3.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.component.ui.loading.LKUILoadingView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

public class PageLoadingView extends FrameLayout {

    /* renamed from: a */
    private LKUILoadingView f160189a;

    /* renamed from: b */
    private View f160190b;

    /* renamed from: a */
    public void mo219452a() {
        LKUILoadingView lKUILoadingView = this.f160189a;
        if (lKUILoadingView != null) {
            lKUILoadingView.clearAnimation();
        }
        setVisibility(8);
    }

    public PageLoadingView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo219453a(int i) {
        setBackgroundColor(C60773o.m236126d(i));
        setVisibility(0);
        LKUILoadingView lKUILoadingView = this.f160189a;
        if (lKUILoadingView != null) {
            lKUILoadingView.playAnimation();
        }
    }

    public PageLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m248511a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.vc_tab_loading_view, this);
        this.f160190b = findViewById(R.id.container);
        this.f160189a = (LKUILoadingView) findViewById(R.id.tab_loading_view);
    }

    public PageLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m248511a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int height = (i4 - i2) - this.f160190b.getHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f160190b.getLayoutParams();
            layoutParams.setMargins(0, (height * 2) / 5, 0, 0);
            this.f160190b.setLayoutParams(layoutParams);
            this.f160190b.setVisibility(0);
        }
    }
}

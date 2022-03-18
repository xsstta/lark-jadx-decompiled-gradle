package com.ss.android.vc.meeting.module.tab.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.component.ui.loading.LKUILoadingView;
import com.larksuite.suite.R;

public class PageLoadingView extends FrameLayout {

    /* renamed from: a */
    private LKUILoadingView f159751a;

    /* renamed from: a */
    public void mo219095a() {
        setVisibility(0);
        this.f159751a.playAnimation();
    }

    /* renamed from: b */
    public void mo219096b() {
        this.f159751a.cancelAnimation();
        setVisibility(8);
    }

    public PageLoadingView(Context context) {
        this(context, null);
    }

    public PageLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m248011a(Context context, AttributeSet attributeSet) {
        this.f159751a = (LKUILoadingView) LayoutInflater.from(context).inflate(R.layout.layout_vc_page_loading_view, (ViewGroup) this, true).findViewById(R.id.tab_loading_view);
    }

    public PageLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m248011a(context, attributeSet);
    }
}

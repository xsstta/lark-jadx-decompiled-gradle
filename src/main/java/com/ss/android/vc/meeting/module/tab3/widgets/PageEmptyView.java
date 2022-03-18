package com.ss.android.vc.meeting.module.tab3.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;

public class PageEmptyView extends FrameLayout {

    /* renamed from: a */
    private View f160185a;

    /* renamed from: a */
    public void mo219443a() {
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo219444b() {
        setVisibility(8);
    }

    public PageEmptyView(Context context) {
        this(context, null);
    }

    public PageEmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m248504a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.vc_tab_list_empty_view, this);
        setBackgroundColor(C60773o.m236126d(R.color.bg_body));
        this.f160185a = findViewById(R.id.container);
    }

    public PageEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m248504a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int height = (i4 - i2) - this.f160185a.getHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f160185a.getLayoutParams();
            layoutParams.setMargins(0, (height * 2) / 5, 0, 0);
            this.f160185a.setLayoutParams(layoutParams);
            this.f160185a.setVisibility(0);
        }
    }
}

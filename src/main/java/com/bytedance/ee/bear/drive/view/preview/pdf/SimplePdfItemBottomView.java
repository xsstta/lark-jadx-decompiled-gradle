package com.bytedance.ee.bear.drive.view.preview.pdf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;

public class SimplePdfItemBottomView extends FrameLayout {

    /* renamed from: a */
    private View f19914a;

    /* renamed from: b */
    private View f19915b;

    /* renamed from: c */
    private View f19916c;

    /* renamed from: a */
    private void m29628a() {
        this.f19914a = LayoutInflater.from(getContext()).inflate(R.layout.drive_simple_pdf_item_bottom_loading, (ViewGroup) this, false);
        this.f19915b = LayoutInflater.from(getContext()).inflate(R.layout.drive_simple_pdf_item_bottom_retry, (ViewGroup) this, false);
        this.f19916c = LayoutInflater.from(getContext()).inflate(R.layout.drive_simple_pdf_item_bottom_see_all, (ViewGroup) this, false);
    }

    public SimplePdfItemBottomView(Context context) {
        super(context);
        m29628a();
    }

    public void setOnRetryClickListener(View.OnClickListener onClickListener) {
        this.f19915b.findViewById(R.id.simple_pdf_bottom_view_retry).setOnClickListener(onClickListener);
    }

    public void setOnSeeAllClickListener(View.OnClickListener onClickListener) {
        this.f19916c.findViewById(R.id.simple_pdf_bottom_view_see_all).setOnClickListener(onClickListener);
    }

    public SimplePdfItemBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29628a();
    }

    public SimplePdfItemBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29628a();
    }
}

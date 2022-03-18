package com.bytedance.ee.bear.widgets.guidewindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

public class GuideView extends FrameLayout {

    /* renamed from: a */
    private ImageView f31985a;

    /* renamed from: b */
    private TextView f31986b;

    /* renamed from: c */
    private ImageView f31987c;

    /* renamed from: d */
    private int f31988d;

    public GuideView(Context context) {
        super(context);
        m49168a(context);
    }

    public void setIndicatorOffsetX(int i) {
        this.f31988d = i;
        requestLayout();
    }

    public void setText(String str) {
        this.f31986b.setText(str);
    }

    /* renamed from: a */
    private void m49168a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.widget_guide_view, (ViewGroup) this, true);
        this.f31985a = (ImageView) findViewById(R.id.indicator);
        this.f31986b = (TextView) findViewById(R.id.guide_text);
        this.f31987c = (ImageView) findViewById(R.id.shadow);
    }

    public GuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49168a(context);
    }

    public GuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49168a(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = this.f31985a.getMeasuredWidth();
        int i5 = this.f31988d;
        int i6 = measuredWidth / 2;
        int i7 = i5 - i6;
        int i8 = i6 + i5;
        if (i7 >= i) {
            i = i7;
        }
        if (i8 <= i3) {
            i3 = i8;
        }
        if (i5 != 0) {
            ImageView imageView = this.f31985a;
            imageView.layout(i, imageView.getTop(), i3, this.f31985a.getBottom());
        }
        int d = C13749l.m55758d(getContext(), 12);
        TextView textView = this.f31986b;
        textView.layout(textView.getLeft(), this.f31985a.getBottom(), this.f31986b.getRight(), this.f31985a.getBottom() + this.f31986b.getHeight());
        this.f31987c.layout(this.f31986b.getLeft(), this.f31986b.getTop() - d, this.f31986b.getRight(), d);
    }
}

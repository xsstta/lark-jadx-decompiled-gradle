package com.bytedance.ee.bear.bitable.pro;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

public class DefaultTagTitleView extends LinearLayout {

    /* renamed from: a */
    private TextView f14146a;

    /* renamed from: b */
    private TextView f14147b;

    /* renamed from: c */
    private CharSequence f14148c;

    /* renamed from: d */
    private float f14149d = ((float) C13749l.m55738a(16));

    /* renamed from: e */
    private int f14150e = C13749l.m55755c(getContext(), R.color.text_title);

    public CharSequence getTitle() {
        return this.f14148c;
    }

    /* renamed from: a */
    private void m19909a() {
        this.f14146a.setText(this.f14148c);
    }

    public void setTitle(CharSequence charSequence) {
        this.f14148c = charSequence;
        m19909a();
    }

    public void setTitleSize(float f) {
        this.f14146a.setTextSize(f);
    }

    public void setTitle(int i) {
        this.f14148c = getResources().getString(i);
        m19909a();
    }

    public void setTitleTextBold(boolean z) {
        this.f14146a.getPaint().setFakeBoldText(z);
    }

    public void setTitleTextColor(int i) {
        this.f14146a.setTextColor(getResources().getColor(i));
    }

    public void setTitleTextSize(int i) {
        this.f14146a.setTextSize(0, getResources().getDimension(i));
    }

    public DefaultTagTitleView(Context context) {
        super(context);
        m19911a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m19910a(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        TextView textView = new TextView(context);
        this.f14146a = textView;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.f14146a.setTextSize(0, this.f14149d);
        this.f14146a.setTextColor(this.f14150e);
        if (!TextUtils.isEmpty(this.f14148c)) {
            this.f14146a.setText(this.f14148c);
        }
        addView(this.f14146a, layoutParams);
    }

    /* renamed from: b */
    private void m19912b(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 48;
        layoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.facade_star_view_margin_left);
        layoutParams.topMargin = 1;
        TextView textView = new TextView(context);
        this.f14147b = textView;
        textView.setPadding(C13749l.m55738a(4), C13749l.m55738a(2), C13749l.m55738a(4), C13749l.m55738a(2));
        this.f14147b.setVisibility(8);
        this.f14147b.setTextSize(12.0f);
        this.f14147b.setGravity(16);
        this.f14147b.setBackground(context.getDrawable(R.drawable.bitable_pro_default_label_bg));
        this.f14147b.setTextColor(C13749l.m55755c(getContext(), R.color.udtoken_tag_neutral_text_normal));
        addView(this.f14147b, layoutParams);
    }

    /* renamed from: a */
    private void m19911a(Context context, AttributeSet attributeSet) {
        m19913b(context, attributeSet);
        setOrientation(0);
        m19910a(context);
        m19912b(context);
    }

    /* renamed from: b */
    private void m19913b(Context context, AttributeSet attributeSet) {
        this.f14150e = getResources().getColor(R.color.text_title);
    }

    /* renamed from: a */
    public void mo18869a(boolean z, int i) {
        int i2;
        TextView textView = this.f14147b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        this.f14147b.setText(i);
    }

    public DefaultTagTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m19911a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            measureChildWithMargins(getChildAt(i4), i, 0, i2, 0);
        }
        if (this.f14147b.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14147b.getLayoutParams();
            i3 = this.f14147b.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f14146a.getLayoutParams();
        int measuredWidth = this.f14146a.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
        int measuredWidth2 = getMeasuredWidth();
        int i5 = measuredWidth2 - i3;
        if (measuredWidth > i5) {
            measuredWidth = i5;
        }
        this.f14146a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f14146a.getMeasuredHeight(), 1073741824));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f14146a.getMeasuredHeight(), 1073741824));
    }

    public DefaultTagTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m19911a(context, attributeSet);
    }
}

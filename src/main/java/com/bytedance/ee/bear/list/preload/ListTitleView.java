package com.bytedance.ee.bear.list.preload;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.SecondTagView;
import com.bytedance.ee.bear.widgets.crosstenant.ExternalView;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

public class ListTitleView extends LinearLayout {

    /* renamed from: a */
    private TextView f23452a;

    /* renamed from: b */
    private ExternalView f23453b;

    /* renamed from: c */
    private SecondTagView f23454c;

    /* renamed from: d */
    private ImageView f23455d;

    /* renamed from: e */
    private CharSequence f23456e;

    /* renamed from: f */
    private float f23457f = ((float) C13749l.m55738a(16));

    /* renamed from: g */
    private int f23458g;

    /* renamed from: h */
    private int f23459h = 1;

    public CharSequence getTitle() {
        return this.f23456e;
    }

    /* renamed from: a */
    private void m36208a() {
        this.f23452a.setText(this.f23456e);
    }

    public boolean getExternalVisible() {
        ExternalView externalView = this.f23453b;
        if (externalView == null || externalView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public boolean getSecondVisible() {
        SecondTagView secondTagView = this.f23454c;
        if (secondTagView == null || secondTagView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public boolean getStarVisible() {
        ImageView imageView = this.f23455d;
        if (imageView == null || imageView.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void setTitle(CharSequence charSequence) {
        this.f23456e = charSequence;
        m36208a();
    }

    public void setTitleColor(int i) {
        this.f23452a.setTextColor(i);
    }

    public void setTitleSize(float f) {
        this.f23452a.setTextSize(f);
    }

    public void setTitle(int i) {
        this.f23456e = getResources().getString(i);
        m36208a();
    }

    public ListTitleView(Context context) {
        super(context);
        m36210a(context, null);
    }

    public void setExternalVisible(boolean z) {
        ExternalView externalView = this.f23453b;
        int i = 0;
        if (externalView != null) {
            if (!z) {
                i = 8;
            }
            externalView.setVisibility(i);
        } else if (z) {
            m36211b(getContext());
            this.f23453b.setVisibility(0);
        }
    }

    public void setSecondVisible(boolean z) {
        SecondTagView secondTagView = this.f23454c;
        int i = 0;
        if (secondTagView != null) {
            if (!z) {
                i = 8;
            }
            secondTagView.setVisibility(i);
        } else if (z) {
            m36213c(getContext());
            this.f23454c.setVisibility(0);
        }
    }

    public void setStarVisible(boolean z) {
        ImageView imageView = this.f23455d;
        int i = 0;
        if (imageView != null) {
            if (!z) {
                i = 8;
            }
            imageView.setVisibility(i);
        } else if (z) {
            m36209a(getContext());
            this.f23455d.setVisibility(0);
        }
    }

    public void setTitleMaxLines(int i) {
        if (i == 1) {
            this.f23452a.setSingleLine(true);
            this.f23452a.setMaxLines(1);
            return;
        }
        this.f23452a.setSingleLine(false);
        this.f23452a.setMaxLines(i);
    }

    /* renamed from: b */
    private void m36211b(Context context) {
        if (this.f23453b == null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.facade_star_view_margin_left);
            ExternalView externalView = new ExternalView(context);
            this.f23453b = externalView;
            externalView.setVisibility(8);
            addView(this.f23453b, layoutParams);
        }
    }

    /* renamed from: c */
    private void m36213c(Context context) {
        if (this.f23454c == null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.facade_star_view_margin_left);
            SecondTagView secondTagView = new SecondTagView(context);
            this.f23454c = secondTagView;
            secondTagView.setVisibility(8);
            addView(this.f23454c, layoutParams);
        }
    }

    /* renamed from: a */
    private void m36209a(Context context) {
        if (this.f23455d == null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            layoutParams.width = getResources().getDimensionPixelSize(R.dimen.facade_star_view_edge);
            layoutParams.height = getResources().getDimensionPixelSize(R.dimen.facade_star_view_edge);
            layoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.facade_star_view_margin_left);
            ImageView imageView = new ImageView(context);
            this.f23455d = imageView;
            imageView.setBackground(getResources().getDrawable(R.drawable.ud_icon_collect_filled));
            C13747j.m55726a((View) this.f23455d, (int) R.color.ud_Y500);
            this.f23455d.setVisibility(8);
            addView(this.f23455d, layoutParams);
        }
    }

    /* renamed from: d */
    private void m36214d(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        TextView textView = new TextView(context);
        this.f23452a = textView;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.f23452a.setGravity(16);
        this.f23452a.setTextSize(0, this.f23457f);
        this.f23452a.setTextColor(this.f23458g);
        if (!TextUtils.isEmpty(this.f23456e)) {
            this.f23452a.setText(this.f23456e);
        }
        if (this.f23459h == 1) {
            this.f23452a.setSingleLine(true);
        } else {
            this.f23452a.setSingleLine(false);
            this.f23452a.setMaxLines(this.f23459h);
        }
        addView(this.f23452a, layoutParams);
    }

    /* renamed from: a */
    private void m36210a(Context context, AttributeSet attributeSet) {
        m36212b(context, attributeSet);
        setOrientation(0);
        setGravity(16);
        m36214d(context);
    }

    public ListTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m36210a(context, attributeSet);
    }

    /* renamed from: b */
    private void m36212b(Context context, AttributeSet attributeSet) {
        this.f23458g = context.getResources().getColor(R.color.text_title);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.titleColor, R.attr.titleMaxLines, R.attr.titleSize, R.attr.titleText});
            this.f23456e = obtainStyledAttributes.getString(3);
            this.f23457f = obtainStyledAttributes.getDimension(2, getResources().getDimension(R.dimen.facade_title_text_size));
            this.f23458g = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.text_title));
            this.f23459h = obtainStyledAttributes.getInt(1, 1);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            measureChildWithMargins(getChildAt(i6), i, 0, i2, 0);
        }
        ImageView imageView = this.f23455d;
        if (imageView == null || imageView.getVisibility() != 0) {
            i3 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f23455d.getLayoutParams();
            i3 = this.f23455d.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        ExternalView externalView = this.f23453b;
        if (externalView == null || externalView.getVisibility() != 0) {
            i4 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f23453b.getLayoutParams();
            i4 = this.f23453b.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
        }
        SecondTagView secondTagView = this.f23454c;
        if (secondTagView != null && secondTagView.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f23454c.getLayoutParams();
            i5 = this.f23454c.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f23452a.getLayoutParams();
        int measuredWidth = this.f23452a.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i7 = ((measuredWidth2 - i4) - i5) - i3;
        if (measuredWidth > i7) {
            measuredWidth = i7;
        }
        this.f23452a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f23452a.getMeasuredHeight(), 1073741824));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public ListTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36210a(context, attributeSet);
    }
}

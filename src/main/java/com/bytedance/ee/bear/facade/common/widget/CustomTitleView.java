package com.bytedance.ee.bear.facade.common.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
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
import com.bytedance.ee.bear.widgets.OwnerTagView;
import com.bytedance.ee.bear.widgets.crosstenant.ExternalView;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;

public class CustomTitleView extends LinearLayout {

    /* renamed from: a */
    public TextView f20834a;

    /* renamed from: b */
    public CharSequence f20835b;

    /* renamed from: c */
    private ExternalView f20836c;

    /* renamed from: d */
    private SecondTagView f20837d;

    /* renamed from: e */
    private OwnerTagView f20838e;

    /* renamed from: f */
    private ImageView f20839f;

    /* renamed from: g */
    private ImageView f20840g;

    /* renamed from: h */
    private ImageView f20841h;

    /* renamed from: i */
    private TextView f20842i;

    /* renamed from: j */
    private float f20843j = ((float) C13749l.m55738a(16));

    /* renamed from: k */
    private int f20844k = C13749l.m55755c(getContext(), R.color.text_title);

    /* renamed from: l */
    private int f20845l = 1;

    /* renamed from: m */
    private String[] f20846m = {"", ".", "..", "..."};

    /* renamed from: n */
    private ValueAnimator f20847n = ValueAnimator.ofInt(0, 4);

    public ImageView getIconView() {
        return this.f20840g;
    }

    public CharSequence getTitle() {
        return this.f20835b;
    }

    public boolean getExternalVisible() {
        if (this.f20836c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean getStarVisible() {
        if (this.f20839f.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public boolean getTitleVisible() {
        if (this.f20834a.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f20847n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: a */
    private void m30864a() {
        this.f20834a.setText(this.f20835b);
        if (this.f20847n.isRunning()) {
            this.f20847n.cancel();
        }
    }

    public void setTipsClickListener(View.OnClickListener onClickListener) {
        this.f20841h.setOnClickListener(onClickListener);
    }

    public void setTitle(CharSequence charSequence) {
        this.f20835b = charSequence;
        m30864a();
    }

    public void setTitleSize(float f) {
        this.f20834a.setTextSize(f);
    }

    public void setExternalTagEnabled(boolean z) {
        if (z) {
            addView(this.f20836c);
        } else {
            removeView(this.f20836c);
        }
    }

    public void setExternalVisible(boolean z) {
        int i;
        ExternalView externalView = this.f20836c;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        externalView.setVisibility(i);
    }

    public void setOwnerTagVisible(boolean z) {
        int i;
        OwnerTagView ownerTagView = this.f20838e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ownerTagView.setVisibility(i);
    }

    public void setSecondTabVisible(boolean z) {
        int i;
        SecondTagView secondTagView = this.f20837d;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        secondTagView.setVisibility(i);
    }

    public void setStarVisible(boolean z) {
        int i;
        ImageView imageView = this.f20839f;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setTipsVisible(boolean z) {
        int i;
        ImageView imageView = this.f20841h;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public void setTitle(int i) {
        this.f20835b = getResources().getString(i);
        m30864a();
    }

    public void setTitleTextBold(boolean z) {
        this.f20834a.getPaint().setFakeBoldText(z);
    }

    public void setTitleTextColor(int i) {
        this.f20834a.setTextColor(getResources().getColor(i));
    }

    public void setTitleTextSize(int i) {
        this.f20834a.setTextSize(0, getResources().getDimension(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m30865a(ValueAnimator valueAnimator) {
        TextView textView = this.f20834a;
        textView.setText(getResources().getString(R.string.Doc_Widget_LoadingWithoutEllipsis) + this.f20846m[((Integer) valueAnimator.getAnimatedValue()).intValue() % this.f20846m.length]);
    }

    /* renamed from: c */
    private void m30871c(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.facade_star_view_margin_left);
        ExternalView externalView = new ExternalView(context);
        this.f20836c = externalView;
        externalView.setVisibility(8);
        addView(this.f20836c, layoutParams);
    }

    /* renamed from: d */
    private void m30872d(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.facade_star_view_margin_left);
        SecondTagView secondTagView = new SecondTagView(context);
        this.f20837d = secondTagView;
        secondTagView.setVisibility(8);
        addView(this.f20837d, layoutParams);
    }

    /* renamed from: e */
    private void m30873e(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.facade_star_view_margin_left);
        OwnerTagView ownerTagView = new OwnerTagView(context);
        this.f20838e = ownerTagView;
        ownerTagView.setVisibility(8);
        addView(this.f20838e, layoutParams);
    }

    /* renamed from: g */
    private void m30875g(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        TextView textView = new TextView(context);
        this.f20842i = textView;
        textView.setPadding(C57582a.m223600a(2), 0, 0, 0);
        this.f20842i.setTextSize(0, this.f20843j);
        this.f20842i.setTextColor(this.f20844k);
        this.f20842i.setVisibility(8);
        addView(this.f20842i, layoutParams);
    }

    public void setTitleVisible(boolean z) {
        int i;
        TextView textView = this.f20834a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (!z || this.f20840g.getDrawable() == null) {
            this.f20840g.setVisibility(8);
        } else {
            this.f20840g.setVisibility(0);
        }
        m30868a(z);
    }

    public CustomTitleView(Context context) {
        super(context);
        m30867a(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m30866a(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.facade_icon_size);
        layoutParams.height = getResources().getDimensionPixelSize(R.dimen.facade_icon_size);
        layoutParams.rightMargin = getResources().getDimensionPixelSize(R.dimen.facade_icon_margin_right);
        ImageView imageView = new ImageView(context);
        this.f20840g = imageView;
        imageView.setVisibility(8);
        addView(this.f20840g, layoutParams);
    }

    /* renamed from: b */
    private void m30869b(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.facade_star_view_edge);
        layoutParams.height = getResources().getDimensionPixelSize(R.dimen.facade_star_view_edge);
        layoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.facade_star_view_margin_left);
        ImageView imageView = new ImageView(context);
        this.f20839f = imageView;
        imageView.setBackground(getResources().getDrawable(R.drawable.ud_icon_collect_filled));
        C13747j.m55726a((View) this.f20839f, (int) R.color.ud_Y500);
        this.f20839f.setVisibility(8);
        addView(this.f20839f, layoutParams);
    }

    /* renamed from: f */
    private void m30874f(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        TextView textView = new TextView(context);
        this.f20834a = textView;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.f20834a.setGravity(16);
        this.f20834a.setTextSize(0, this.f20843j);
        this.f20834a.setTextColor(this.f20844k);
        if (!TextUtils.isEmpty(this.f20835b)) {
            this.f20834a.setText(this.f20835b);
        }
        if (this.f20845l == 1) {
            this.f20834a.setSingleLine(true);
        } else {
            this.f20834a.setSingleLine(false);
            this.f20834a.setMaxLines(this.f20845l);
        }
        addView(this.f20834a, layoutParams);
        this.f20847n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.facade.common.widget.$$Lambda$CustomTitleView$5wkRk7VhfAfBjRIBTLfn0boGAQ */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CustomTitleView.this.m30865a((CustomTitleView) valueAnimator);
            }
        });
        this.f20847n.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.facade.common.widget.CustomTitleView.C77211 */

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationCancel(Animator animator) {
                CustomTitleView.this.f20834a.setText(CustomTitleView.this.f20835b);
            }

            public void onAnimationEnd(Animator animator) {
                CustomTitleView.this.f20834a.setText(CustomTitleView.this.f20835b);
            }
        });
        this.f20847n.setDuration(500L);
        this.f20847n.setRepeatCount(-1);
    }

    /* renamed from: h */
    private void m30876h(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.facade_star_view_edge);
        layoutParams.height = getResources().getDimensionPixelSize(R.dimen.facade_star_view_edge);
        ImageView imageView = new ImageView(context);
        this.f20841h = imageView;
        imageView.setBackground(getResources().getDrawable(R.drawable.ic_icon_tool_guide_nor));
        C13747j.m55726a((View) this.f20841h, (int) R.color.icon_n2);
        this.f20841h.setVisibility(8);
        addView(this.f20841h, layoutParams);
    }

    /* renamed from: a */
    private void m30868a(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20836c.getLayoutParams();
        if (z) {
            marginLayoutParams.leftMargin = getResources().getDimensionPixelSize(R.dimen.facade_star_view_margin_left);
        } else {
            marginLayoutParams.leftMargin = 0;
        }
    }

    public CustomTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30867a(context, attributeSet);
    }

    /* renamed from: a */
    private void m30867a(Context context, AttributeSet attributeSet) {
        m30870b(context, attributeSet);
        setOrientation(0);
        setGravity(16);
        m30866a(context);
        m30874f(context);
        m30875g(context);
        m30871c(context);
        m30872d(context);
        m30869b(context);
        m30876h(context);
        m30873e(context);
    }

    /* renamed from: b */
    private void m30870b(Context context, AttributeSet attributeSet) {
        this.f20844k = getResources().getColor(R.color.text_title);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.titleColor, R.attr.titleMaxLines, R.attr.titleSize, R.attr.titleText});
            this.f20835b = obtainStyledAttributes.getString(3);
            this.f20843j = obtainStyledAttributes.getDimension(2, getResources().getDimension(R.dimen.facade_title_text_size));
            this.f20844k = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.text_title));
            this.f20845l = obtainStyledAttributes.getInt(1, 1);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        super.onMeasure(i, i2);
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            measureChildWithMargins(getChildAt(i9), i, 0, i2, 0);
        }
        if (this.f20840g.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20840g.getLayoutParams();
            i3 = this.f20840g.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        } else {
            i3 = 0;
        }
        if (this.f20839f.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f20839f.getLayoutParams();
            i4 = this.f20839f.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
        } else {
            i4 = 0;
        }
        if (this.f20841h.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f20841h.getLayoutParams();
            i5 = this.f20841h.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin;
        } else {
            i5 = 0;
        }
        if (this.f20836c.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.f20836c.getLayoutParams();
            i6 = this.f20836c.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
        } else {
            i6 = 0;
        }
        if (this.f20837d.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) this.f20837d.getLayoutParams();
            i7 = this.f20837d.getMeasuredWidth() + marginLayoutParams5.leftMargin + marginLayoutParams5.rightMargin;
        } else {
            i7 = 0;
        }
        if (this.f20838e.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) this.f20838e.getLayoutParams();
            i8 = this.f20838e.getMeasuredWidth() + marginLayoutParams6.leftMargin + marginLayoutParams6.rightMargin;
        } else {
            i8 = 0;
        }
        if (this.f20842i.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) this.f20842i.getLayoutParams();
            i8 = this.f20842i.getMeasuredWidth() + marginLayoutParams7.leftMargin + marginLayoutParams7.rightMargin;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) this.f20834a.getLayoutParams();
        int measuredWidth = this.f20834a.getMeasuredWidth() + marginLayoutParams8.leftMargin + marginLayoutParams8.rightMargin;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i10 = ((((((measuredWidth2 - i6) - i7) - i4) - i3) - i5) - i8) - 0;
        if (measuredWidth > i10) {
            measuredWidth = i10;
        }
        this.f20834a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f20834a.getMeasuredHeight(), 1073741824));
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    /* renamed from: a */
    public void mo30199a(boolean z, String str) {
        int i;
        TextView textView = this.f20842i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        this.f20842i.setText(str);
    }

    public CustomTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30867a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo30198a(int i, int i2, int i3, int i4) {
        this.f20834a.setPadding(i, i2, i3, i4);
    }
}

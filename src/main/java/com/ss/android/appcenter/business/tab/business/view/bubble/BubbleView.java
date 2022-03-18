package com.ss.android.appcenter.business.tab.business.view.bubble;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.lark.guide.ui.view.ArrowView;

public class BubbleView extends FrameLayout {

    /* renamed from: a */
    private ArrowView f69738a;

    /* renamed from: b */
    private TextView f69739b;

    /* renamed from: c */
    private int f69740c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101822a(View view) {
    }

    public BubbleView(Context context) {
        this(context, null);
    }

    public void setBubbleText(String str) {
        this.f69739b.setText(str);
    }

    public void setArrowHorizontalOffet(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f69738a.getLayoutParams();
        marginLayoutParams.leftMargin = i - C28209p.m103293a(getContext(), 12.0f);
        this.f69738a.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    private void m101821a(Context context) {
        LayoutInflater.from(context).inflate(R.layout.workplace_bubble_view_layout, (ViewGroup) this, true);
        this.f69739b = (TextView) findViewById(R.id.tv_content);
        this.f69738a = (ArrowView) findViewById(R.id.iv_arrow);
        this.f69740c = C28209p.m103293a(context, 20.0f);
        this.f69739b.setOnClickListener($$Lambda$BubbleView$prHxetuaviboMjkxySi17SyE34.INSTANCE);
    }

    public void setShadowAndAdjustBubbleViewParams(FrameLayout.LayoutParams layoutParams) {
        this.f69738a.setElevation((float) this.f69740c);
        this.f69738a.setAnchorGravity(80);
        this.f69739b.setElevation((float) this.f69740c);
        if (Build.VERSION.SDK_INT >= 28) {
            this.f69739b.setOutlineAmbientShadowColor(ContextCompat.getColor(getContext(), R.color.primary_pri_400));
            this.f69739b.setOutlineSpotShadowColor(ContextCompat.getColor(getContext(), R.color.primary_pri_400));
            this.f69738a.setOutlineAmbientShadowColor(ContextCompat.getColor(getContext(), R.color.primary_pri_400));
            this.f69738a.setOutlineSpotShadowColor(ContextCompat.getColor(getContext(), R.color.primary_pri_400));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f69738a.getLayoutParams();
        marginLayoutParams.topMargin = this.f69740c;
        marginLayoutParams.leftMargin += this.f69740c;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f69739b.getLayoutParams();
        marginLayoutParams2.leftMargin = this.f69740c;
        marginLayoutParams2.rightMargin = this.f69740c;
        marginLayoutParams2.bottomMargin = this.f69740c;
        layoutParams.width += this.f69740c * 2;
        layoutParams.leftMargin -= this.f69740c;
        layoutParams.topMargin -= this.f69740c;
    }

    public BubbleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m101821a(context);
    }
}

package com.lcodecore.tkrefreshlayout.footer;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26376a;
import com.lcodecore.tkrefreshlayout.p1213b.C26395a;

public class LoadingView extends ImageView implements AbstractC26376a {
    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: a */
    public void mo93621a() {
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: a */
    public void mo93623a(float f, float f2, float f3) {
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: b */
    public void mo93624b() {
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: b */
    public void mo93625b(float f, float f2, float f3) {
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    public View getView() {
        return this;
    }

    public LoadingView(Context context) {
        this(context, null);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.lcodecore.tkrefreshlayout.AbstractC26376a
    /* renamed from: a */
    public void mo93622a(float f, float f2) {
        ((AnimationDrawable) getDrawable()).start();
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int a = C26395a.m95593a(context, 34.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        setImageResource(R.drawable.anim_loading_view);
    }
}

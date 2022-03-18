package com.bytedance.ee.bear.wiki.common.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class ExpandButton extends FrameLayout {

    /* renamed from: a */
    private ImageView f32257a;

    /* renamed from: b */
    private TextView f32258b;

    /* renamed from: c */
    private AnimatorSet f32259c = new AnimatorSet();

    /* renamed from: a */
    private void m49484a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.wiki_space_detail_expand_btn, (ViewGroup) this, true);
        this.f32257a = (ImageView) inflate.findViewById(R.id.iv_expand);
        this.f32258b = (TextView) inflate.findViewById(R.id.tv_expand);
    }

    public ExpandButton(Context context) {
        super(context);
        m49484a();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m49485a(ValueAnimator valueAnimator) {
        this.f32257a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f32258b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m49486b(ValueAnimator valueAnimator) {
        this.f32257a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f32258b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: a */
    public void mo45838a(Drawable drawable, String str) {
        this.f32257a.setImageDrawable(drawable);
        this.f32258b.setText(str);
    }

    public ExpandButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49484a();
    }

    public ExpandButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m49484a();
    }

    /* renamed from: a */
    public void mo45839a(final Drawable drawable, final String str, int i) {
        this.f32259c.cancel();
        long j = (long) (i / 2);
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(j);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.wiki.common.widget.$$Lambda$ExpandButton$8CMZTM1nJ4Oy3i8ObaPbx33mq5s */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandButton.lambda$8CMZTM1nJ4Oy3i8ObaPbx33mq5s(ExpandButton.this, valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.wiki.common.widget.ExpandButton.C119341 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ExpandButton.this.mo45838a(drawable, str);
            }
        });
        ValueAnimator duration2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(j);
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.wiki.common.widget.$$Lambda$ExpandButton$eXfBF_9u4E_VV3v41OgM0IJD_w */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandButton.m270019lambda$eXfBF_9u4E_VV3v41OgM0IJD_w(ExpandButton.this, valueAnimator);
            }
        });
        this.f32259c.play(duration2).after(duration);
        this.f32259c.start();
    }
}

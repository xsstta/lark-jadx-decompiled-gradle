package com.bytedance.ee.bear.wikiv2.common.widget;

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
    private ImageView f32887a;

    /* renamed from: b */
    private TextView f32888b;

    /* renamed from: c */
    private AnimatorSet f32889c = new AnimatorSet();

    /* renamed from: a */
    private void m50941a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.wiki_space_detail_expand_btn_v2, (ViewGroup) this, true);
        this.f32887a = (ImageView) inflate.findViewById(R.id.iv_expand);
        this.f32888b = (TextView) inflate.findViewById(R.id.tv_expand);
    }

    public ExpandButton(Context context) {
        super(context);
        m50941a();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m50942a(ValueAnimator valueAnimator) {
        this.f32887a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f32888b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m50943b(ValueAnimator valueAnimator) {
        this.f32887a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f32888b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: a */
    public void mo46767a(Drawable drawable, String str) {
        this.f32887a.setImageDrawable(drawable);
        this.f32888b.setText(str);
    }

    public ExpandButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m50941a();
    }

    public ExpandButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50941a();
    }

    /* renamed from: a */
    public void mo46768a(final Drawable drawable, final String str, int i) {
        this.f32889c.cancel();
        long j = (long) (i / 2);
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED).setDuration(j);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.wikiv2.common.widget.$$Lambda$ExpandButton$0a9PEOwtGqpw70VV2bsHB58Z9E */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandButton.m270104lambda$0a9PEOwtGqpw70VV2bsHB58Z9E(ExpandButton.this, valueAnimator);
            }
        });
        duration.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.wikiv2.common.widget.ExpandButton.C122421 */

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ExpandButton.this.mo46767a(drawable, str);
            }
        });
        ValueAnimator duration2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(j);
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.wikiv2.common.widget.$$Lambda$ExpandButton$bkv4aND_Wd4s9r3H8tTaPUYU */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandButton.m270105lambda$bkv4aND_Wd4s9r3H8tTaPUYU(ExpandButton.this, valueAnimator);
            }
        });
        this.f32889c.play(duration2).after(duration);
        this.f32889c.start();
    }
}

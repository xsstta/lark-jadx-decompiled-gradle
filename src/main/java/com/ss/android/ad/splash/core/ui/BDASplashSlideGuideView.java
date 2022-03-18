package com.ss.android.ad.splash.core.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.ad.splash.utils.C27484l;

public class BDASplashSlideGuideView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f68362a;

    /* renamed from: b */
    private TextView f68363b;

    /* renamed from: c */
    private ImageView f68364c;

    /* renamed from: d */
    private Animator f68365d;

    /* renamed from: e */
    private Animator f68366e;

    /* renamed from: f */
    private AnimatorSet f68367f;

    /* renamed from: g */
    private AnimatorSet f68368g;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo97737a();
    }

    /* renamed from: a */
    public void mo97737a() {
        m99830c();
        this.f68365d.start();
        this.f68366e.start();
        this.f68367f.start();
        this.f68368g.start();
    }

    /* renamed from: b */
    public void mo97738b() {
        Animator animator = this.f68365d;
        if (animator != null) {
            animator.cancel();
            this.f68365d = null;
        }
        Animator animator2 = this.f68366e;
        if (animator2 != null) {
            animator2.cancel();
            this.f68366e = null;
        }
        AnimatorSet animatorSet = this.f68367f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f68367f = null;
        }
        AnimatorSet animatorSet2 = this.f68368g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
            this.f68368g = null;
        }
    }

    /* renamed from: c */
    private void m99830c() {
        this.f68367f = new AnimatorSet();
        this.f68368g = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f68365d = ofFloat;
        ofFloat.setDuration(120L);
        this.f68365d.setInterpolator(new LinearInterpolator());
        this.f68365d.setStartDelay(1000);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, View.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f68366e = ofFloat2;
        ofFloat2.setDuration(120L);
        this.f68366e.setStartDelay(3500);
        this.f68366e.setInterpolator(new LinearInterpolator());
        Interpolator create = PathInterpolatorCompat.create(0.4f, 0.8f, 0.74f, 1.0f);
        float translationY = this.f68364c.getTranslationY();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f68364c, View.TRANSLATION_Y, translationY, ((float) ((int) C27484l.m100391a(getContext(), 80.0f))) + translationY);
        ofFloat3.setInterpolator(create);
        ofFloat3.setDuration(1000L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f68364c, View.ROTATION, 30.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat4.setInterpolator(create);
        ofFloat4.setDuration(1000L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f68364c, View.ALPHA, 1.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat5.setStartDelay(880);
        ofFloat5.setDuration(120L);
        ofFloat5.setInterpolator(new LinearInterpolator());
        this.f68367f.playTogether(ofFloat3, ofFloat4, ofFloat5);
        this.f68367f.setStartDelay(1000);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f68364c, View.TRANSLATION_Y, translationY, translationY + ((float) ((int) C27484l.m100391a(getContext(), 80.0f))));
        ofFloat6.setInterpolator(create);
        ofFloat6.setDuration(1000L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f68364c, View.ROTATION, 30.0f, BitmapDescriptorFactory.HUE_RED);
        ofFloat7.setInterpolator(create);
        ofFloat7.setDuration(1000L);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f68364c, View.ALPHA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat8.setDuration(120L);
        ofFloat8.setInterpolator(new LinearInterpolator());
        this.f68368g.playTogether(ofFloat6, ofFloat7, ofFloat8);
        this.f68368g.setStartDelay(2400);
    }

    /* renamed from: a */
    private void m99828a(Context context) {
        m99829b(context);
    }

    public BDASplashSlideGuideView(Context context) {
        super(context);
        m99828a(context);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            mo97738b();
        }
    }

    /* renamed from: b */
    private void m99829b(Context context) {
        int a = (int) C27484l.m100391a(context, 3.0f);
        TextView textView = new TextView(context);
        this.f68363b = textView;
        textView.setText(R.string.splash_ad_slide_to_see_more);
        this.f68363b.setShadowLayer(3.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, Color.parseColor("#80000000"));
        this.f68363b.setTextColor(-1);
        this.f68363b.setGravity(14);
        this.f68363b.setTextSize(1, 17.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) C27484l.m100391a(context, 24.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.f68363b.setLayoutParams(layoutParams);
        this.f68363b.setId(R.id.splash_slide_hint);
        ImageView imageView = new ImageView(context);
        this.f68362a = imageView;
        imageView.setImageResource(R.drawable.splash_ad_gesture_arrow);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) C27484l.m100391a(context, 23.0f), (int) C27484l.m100391a(context, 132.0f));
        layoutParams2.addRule(2, R.id.splash_slide_hint);
        layoutParams2.bottomMargin = (int) C27484l.m100391a(context, 27.0f);
        layoutParams2.leftMargin = (int) C27484l.m100391a(context, 34.0f);
        layoutParams2.addRule(9);
        this.f68362a.setLayoutParams(layoutParams2);
        this.f68362a.setPadding(a, a, a, a);
        ImageView imageView2 = new ImageView(context);
        this.f68364c = imageView2;
        imageView2.setImageResource(R.drawable.splash_ad_gesture_hand);
        int a2 = (int) C27484l.m100391a(context, 59.0f);
        int a3 = (int) C27484l.m100391a(context, 48.0f);
        this.f68364c.setPivotX((float) (((int) C27484l.m100391a(context, 7.0f)) + a2));
        this.f68364c.setPivotY((float) a3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(a2, a3);
        layoutParams3.addRule(2, R.id.splash_slide_hint);
        layoutParams3.addRule(11);
        layoutParams3.rightMargin = (int) C27484l.m100391a(context, 26.0f);
        layoutParams3.bottomMargin = (int) C27484l.m100391a(context, 96.0f);
        this.f68364c.setLayoutParams(layoutParams3);
        this.f68364c.setPadding(a, a, a, a);
        addView(this.f68363b);
        addView(this.f68362a);
        addView(this.f68364c);
        setAlpha(BitmapDescriptorFactory.HUE_RED);
    }

    public BDASplashSlideGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m99828a(context);
    }

    public BDASplashSlideGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m99828a(context);
    }
}

package com.ss.android.videoshop.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

/* renamed from: com.ss.android.videoshop.widget.b */
public class C64193b {

    /* renamed from: a */
    private boolean f162277a;

    /* renamed from: b */
    private ArrayList<Animator> f162278b;

    /* renamed from: c */
    private float f162279c;

    /* renamed from: d */
    private float f162280d;

    /* renamed from: e */
    private float f162281e;

    /* renamed from: f */
    private float f162282f;

    /* renamed from: g */
    private float f162283g;

    /* renamed from: h */
    private float f162284h;

    /* renamed from: i */
    private int f162285i;

    /* renamed from: j */
    private Animator.AnimatorListener f162286j;

    /* renamed from: k */
    private TimeInterpolator f162287k;

    /* renamed from: d */
    private void m252448d(TextureVideoView textureVideoView) {
    }

    /* renamed from: e */
    private void m252449e(TextureVideoView textureVideoView) {
    }

    /* renamed from: a */
    public boolean mo222579a() {
        return this.f162277a;
    }

    /* renamed from: a */
    public C64193b mo222577a(float f) {
        this.f162279c = f;
        return this;
    }

    /* renamed from: b */
    public C64193b mo222580b(float f) {
        this.f162280d = f;
        return this;
    }

    /* renamed from: a */
    public void mo222578a(TextureVideoView textureVideoView) {
        m252449e(textureVideoView);
        m252447c(textureVideoView);
        try {
            AnimatorSet animatorSet = new AnimatorSet();
            Animator.AnimatorListener animatorListener = this.f162286j;
            if (animatorListener != null) {
                animatorSet.addListener(animatorListener);
            }
            animatorSet.playTogether(this.f162278b);
            animatorSet.setDuration((long) this.f162285i).setInterpolator(this.f162287k);
            animatorSet.start();
        } catch (Exception unused) {
        }
        textureVideoView.mo222537c();
        m252448d(textureVideoView);
    }

    /* renamed from: b */
    public void mo222581b(TextureVideoView textureVideoView) {
        m252449e(textureVideoView);
        textureVideoView.setRotationX(this.f162283g);
        textureVideoView.setRotationY(this.f162284h);
        textureVideoView.setScaleX(this.f162279c);
        textureVideoView.setScaleY(this.f162280d);
        textureVideoView.setTranslationX(this.f162281e);
        textureVideoView.setTranslationY(this.f162282f);
        textureVideoView.mo222537c();
        m252448d(textureVideoView);
    }

    /* renamed from: c */
    private void m252447c(TextureVideoView textureVideoView) {
        this.f162278b.add(ObjectAnimator.ofFloat(textureVideoView, "rotationX", this.f162283g));
        this.f162278b.add(ObjectAnimator.ofFloat(textureVideoView, "rotationY", this.f162284h));
        this.f162278b.add(ObjectAnimator.ofFloat(textureVideoView, "scaleX", this.f162279c));
        this.f162278b.add(ObjectAnimator.ofFloat(textureVideoView, "scaleY", this.f162280d));
        this.f162278b.add(ObjectAnimator.ofFloat(textureVideoView, "translationX", this.f162281e));
        this.f162278b.add(ObjectAnimator.ofFloat(textureVideoView, "translationY", this.f162282f));
    }
}

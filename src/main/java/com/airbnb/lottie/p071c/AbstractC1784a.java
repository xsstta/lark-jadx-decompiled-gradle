package com.airbnb.lottie.p071c;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.airbnb.lottie.c.a */
public abstract class AbstractC1784a extends ValueAnimator {

    /* renamed from: a */
    private final Set<ValueAnimator.AnimatorUpdateListener> f6110a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Set<Animator.AnimatorListener> f6111b = new CopyOnWriteArraySet();

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f6111b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f6110a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9003a() {
        for (Animator.AnimatorListener animatorListener : this.f6111b) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9007b() {
        for (Animator.AnimatorListener animatorListener : this.f6111b) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9009c() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f6110a) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f6111b.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f6110a.add(animatorUpdateListener);
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f6111b.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f6110a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.ValueAnimator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9004a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f6111b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9008b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f6111b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }
}

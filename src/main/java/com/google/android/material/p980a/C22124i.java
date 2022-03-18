package com.google.android.material.p980a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* renamed from: com.google.android.material.a.i */
public class C22124i {

    /* renamed from: a */
    private long f53794a;

    /* renamed from: b */
    private long f53795b = 300;

    /* renamed from: c */
    private TimeInterpolator f53796c;

    /* renamed from: d */
    private int f53797d;

    /* renamed from: e */
    private int f53798e = 1;

    /* renamed from: a */
    public long mo76299a() {
        return this.f53794a;
    }

    /* renamed from: b */
    public long mo76301b() {
        return this.f53795b;
    }

    /* renamed from: d */
    public int mo76303d() {
        return this.f53797d;
    }

    /* renamed from: e */
    public int mo76304e() {
        return this.f53798e;
    }

    /* renamed from: c */
    public TimeInterpolator mo76302c() {
        TimeInterpolator timeInterpolator = this.f53796c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return C22116a.f53780b;
    }

    public int hashCode() {
        return (((((((((int) (mo76299a() ^ (mo76299a() >>> 32))) * 31) + ((int) (mo76301b() ^ (mo76301b() >>> 32)))) * 31) + mo76302c().getClass().hashCode()) * 31) + mo76303d()) * 31) + mo76304e();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + mo76299a() + " duration: " + mo76301b() + " interpolator: " + mo76302c().getClass() + " repeatCount: " + mo76303d() + " repeatMode: " + mo76304e() + "}\n";
    }

    /* renamed from: a */
    static C22124i m79730a(ValueAnimator valueAnimator) {
        C22124i iVar = new C22124i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m79731b(valueAnimator));
        iVar.f53797d = valueAnimator.getRepeatCount();
        iVar.f53798e = valueAnimator.getRepeatMode();
        return iVar;
    }

    /* renamed from: b */
    private static TimeInterpolator m79731b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return C22116a.f53780b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return C22116a.f53781c;
        }
        if (interpolator instanceof DecelerateInterpolator) {
            return C22116a.f53782d;
        }
        return interpolator;
    }

    /* renamed from: a */
    public void mo76300a(Animator animator) {
        animator.setStartDelay(mo76299a());
        animator.setDuration(mo76301b());
        animator.setInterpolator(mo76302c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(mo76303d());
            valueAnimator.setRepeatMode(mo76304e());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22124i)) {
            return false;
        }
        C22124i iVar = (C22124i) obj;
        if (mo76299a() == iVar.mo76299a() && mo76301b() == iVar.mo76301b() && mo76303d() == iVar.mo76303d() && mo76304e() == iVar.mo76304e()) {
            return mo76302c().getClass().equals(iVar.mo76302c().getClass());
        }
        return false;
    }

    public C22124i(long j, long j2) {
        this.f53794a = j;
        this.f53795b = j2;
    }

    public C22124i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f53794a = j;
        this.f53795b = j2;
        this.f53796c = timeInterpolator;
    }
}

package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: androidx.core.widget.i */
public final class C0946i {

    /* renamed from: a */
    OverScroller f3570a;

    /* renamed from: b */
    public int mo4829b() {
        return this.f3570a.getCurrX();
    }

    /* renamed from: c */
    public int mo4830c() {
        return this.f3570a.getCurrY();
    }

    /* renamed from: d */
    public int mo4831d() {
        return this.f3570a.getFinalX();
    }

    /* renamed from: e */
    public int mo4832e() {
        return this.f3570a.getFinalY();
    }

    /* renamed from: f */
    public boolean mo4833f() {
        return this.f3570a.computeScrollOffset();
    }

    /* renamed from: g */
    public void mo4834g() {
        this.f3570a.abortAnimation();
    }

    /* renamed from: a */
    public boolean mo4828a() {
        return this.f3570a.isFinished();
    }

    /* renamed from: a */
    public static C0946i m4562a(Context context, Interpolator interpolator) {
        return new C0946i(context, interpolator);
    }

    C0946i(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.f3570a = overScroller;
    }

    /* renamed from: a */
    public void mo4827a(int i, int i2, int i3, int i4, int i5) {
        this.f3570a.startScroll(i, i2, i3, i4, i5);
    }
}

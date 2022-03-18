package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.h */
public final class C22348h {

    /* renamed from: a */
    ValueAnimator f54752a = null;

    /* renamed from: b */
    private final ArrayList<C22350a> f54753b = new ArrayList<>();

    /* renamed from: c */
    private C22350a f54754c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f54755d = new AnimatorListenerAdapter() {
        /* class com.google.android.material.internal.C22348h.C223491 */

        public void onAnimationEnd(Animator animator) {
            if (C22348h.this.f54752a == animator) {
                C22348h.this.f54752a = null;
            }
        }
    };

    /* renamed from: b */
    private void m80972b() {
        ValueAnimator valueAnimator = this.f54752a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f54752a = null;
        }
    }

    /* renamed from: a */
    public void mo77845a() {
        ValueAnimator valueAnimator = this.f54752a;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f54752a = null;
        }
    }

    /* renamed from: a */
    private void m80971a(C22350a aVar) {
        ValueAnimator valueAnimator = aVar.f54758b;
        this.f54752a = valueAnimator;
        valueAnimator.start();
    }

    /* renamed from: a */
    public void mo77846a(int[] iArr) {
        C22350a aVar;
        int size = this.f54753b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f54753b.get(i);
            if (StateSet.stateSetMatches(aVar.f54757a, iArr)) {
                break;
            }
            i++;
        }
        C22350a aVar2 = this.f54754c;
        if (aVar != aVar2) {
            if (aVar2 != null) {
                m80972b();
            }
            this.f54754c = aVar;
            if (aVar != null) {
                m80971a(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.h$a */
    public static class C22350a {

        /* renamed from: a */
        final int[] f54757a;

        /* renamed from: b */
        final ValueAnimator f54758b;

        C22350a(int[] iArr, ValueAnimator valueAnimator) {
            this.f54757a = iArr;
            this.f54758b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void mo77847a(int[] iArr, ValueAnimator valueAnimator) {
        C22350a aVar = new C22350a(iArr, valueAnimator);
        valueAnimator.addListener(this.f54755d);
        this.f54753b.add(aVar);
    }
}

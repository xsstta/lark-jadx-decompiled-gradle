package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;
import com.larksuite.suite.R;

/* renamed from: androidx.transition.aa */
class C1513aa {

    /* renamed from: androidx.transition.aa$a */
    private static class C1514a extends AnimatorListenerAdapter implements Transition.AbstractC1505d {

        /* renamed from: a */
        private final View f5334a;

        /* renamed from: b */
        private final View f5335b;

        /* renamed from: c */
        private final int f5336c;

        /* renamed from: d */
        private final int f5337d;

        /* renamed from: e */
        private int[] f5338e;

        /* renamed from: f */
        private float f5339f;

        /* renamed from: g */
        private float f5340g;

        /* renamed from: h */
        private final float f5341h;

        /* renamed from: i */
        private final float f5342i;

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: a */
        public void mo7815a(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: c */
        public void mo7817c(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: d */
        public void mo7818d(Transition transition) {
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: e */
        public void mo7931e(Transition transition) {
        }

        public void onAnimationResume(Animator animator) {
            this.f5335b.setTranslationX(this.f5339f);
            this.f5335b.setTranslationY(this.f5340g);
        }

        @Override // androidx.transition.Transition.AbstractC1505d
        /* renamed from: b */
        public void mo7816b(Transition transition) {
            this.f5335b.setTranslationX(this.f5341h);
            this.f5335b.setTranslationY(this.f5342i);
            transition.mo7898b(this);
        }

        public void onAnimationPause(Animator animator) {
            this.f5339f = this.f5335b.getTranslationX();
            this.f5340g = this.f5335b.getTranslationY();
            this.f5335b.setTranslationX(this.f5341h);
            this.f5335b.setTranslationY(this.f5342i);
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f5338e == null) {
                this.f5338e = new int[2];
            }
            this.f5338e[0] = Math.round(((float) this.f5336c) + this.f5335b.getTranslationX());
            this.f5338e[1] = Math.round(((float) this.f5337d) + this.f5335b.getTranslationY());
            this.f5334a.setTag(R.id.transition_position, this.f5338e);
        }

        C1514a(View view, View view2, int i, int i2, float f, float f2) {
            this.f5335b = view;
            this.f5334a = view2;
            this.f5336c = i - Math.round(view.getTranslationX());
            this.f5337d = i2 - Math.round(view.getTranslationY());
            this.f5341h = f;
            this.f5342i = f2;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f5338e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }
    }

    /* renamed from: a */
    static Animator m6959a(View view, C1562y yVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) yVar.f5459b.getTag(R.id.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        C1514a aVar = new C1514a(view, yVar.f5459b, round, round2, translationX, translationY);
        transition.mo7880a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        C1511a.m6957a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}

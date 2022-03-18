package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: androidx.transition.a */
public class C1511a {

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.transition.a$a */
    public interface AbstractC1512a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a */
    static void m6956a(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof AbstractC1512a) {
                    ((AbstractC1512a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    /* renamed from: b */
    static void m6958b(Animator animator) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener instanceof AbstractC1512a) {
                    ((AbstractC1512a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }

    /* renamed from: a */
    static void m6957a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (Build.VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }
}

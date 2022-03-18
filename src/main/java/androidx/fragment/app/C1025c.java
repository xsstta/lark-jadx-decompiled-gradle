package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.C0797c;
import androidx.core.view.View$OnAttachStateChangeListenerC0913o;
import androidx.fragment.app.C1047p;
import com.larksuite.suite.R;

/* access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.c */
public class C1025c {
    /* renamed from: a */
    private static int m4982a(int i, boolean z) {
        if (i == 4097) {
            return z ? R.anim.fragment_open_enter : R.anim.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? R.anim.fragment_fade_enter : R.anim.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? R.anim.fragment_close_enter : R.anim.fragment_close_exit;
    }

    /* renamed from: androidx.fragment.app.c$b */
    private static class RunnableC1031b extends AnimationSet implements Runnable {

        /* renamed from: a */
        private final ViewGroup f3937a;

        /* renamed from: b */
        private final View f3938b;

        /* renamed from: c */
        private boolean f3939c;

        /* renamed from: d */
        private boolean f3940d;

        /* renamed from: e */
        private boolean f3941e = true;

        public void run() {
            if (this.f3939c || !this.f3941e) {
                this.f3937a.endViewTransition(this.f3938b);
                this.f3940d = true;
                return;
            }
            this.f3941e = false;
            this.f3937a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f3941e = true;
            if (this.f3939c) {
                return !this.f3940d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3939c = true;
                View$OnAttachStateChangeListenerC0913o.m4399a(this.f3937a, this);
            }
            return true;
        }

        RunnableC1031b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3937a = viewGroup;
            this.f3938b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3941e = true;
            if (this.f3939c) {
                return !this.f3940d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3939c = true;
                View$OnAttachStateChangeListenerC0913o.m4399a(this.f3937a, this);
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$a */
    public static class C1030a {

        /* renamed from: a */
        public final Animation f3935a;

        /* renamed from: b */
        public final Animator f3936b;

        C1030a(Animator animator) {
            this.f3936b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        C1030a(Animation animation) {
            this.f3935a = animation;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: a */
    static void m4984a(final Fragment fragment, C1030a aVar, final C1047p.AbstractC1054a aVar2) {
        final View view = fragment.mView;
        final ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        final C0797c cVar = new C0797c();
        cVar.mo4385a(new C0797c.AbstractC0798a() {
            /* class androidx.fragment.app.C1025c.C10261 */

            @Override // androidx.core.os.C0797c.AbstractC0798a
            /* renamed from: a */
            public void mo4390a() {
                if (fragment.getAnimatingAway() != null) {
                    View animatingAway = fragment.getAnimatingAway();
                    fragment.setAnimatingAway(null);
                    animatingAway.clearAnimation();
                }
                fragment.setAnimator(null);
            }
        });
        aVar2.mo5394a(fragment, cVar);
        if (aVar.f3935a != null) {
            RunnableC1031b bVar = new RunnableC1031b(aVar.f3935a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            bVar.setAnimationListener(new Animation.AnimationListener() {
                /* class androidx.fragment.app.C1025c.animationAnimation$AnimationListenerC10272 */

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }

                public void onAnimationEnd(Animation animation) {
                    viewGroup.post(new Runnable() {
                        /* class androidx.fragment.app.C1025c.animationAnimation$AnimationListenerC10272.RunnableC10281 */

                        public void run() {
                            if (fragment.getAnimatingAway() != null) {
                                fragment.setAnimatingAway(null);
                                aVar2.mo5395b(fragment, cVar);
                            }
                        }
                    });
                }
            });
            fragment.mView.startAnimation(bVar);
            return;
        }
        Animator animator = aVar.f3936b;
        fragment.setAnimator(aVar.f3936b);
        animator.addListener(new AnimatorListenerAdapter() {
            /* class androidx.fragment.app.C1025c.C10293 */

            public void onAnimationEnd(Animator animator) {
                viewGroup.endViewTransition(view);
                Animator animator2 = fragment.getAnimator();
                fragment.setAnimator(null);
                if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
                    aVar2.mo5395b(fragment, cVar);
                }
            }
        });
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* renamed from: a */
    static C1030a m4983a(Context context, AbstractC1032d dVar, Fragment fragment, boolean z) {
        int a;
        int nextTransition = fragment.getNextTransition();
        int nextAnim = fragment.getNextAnim();
        boolean z2 = false;
        fragment.setNextAnim(0);
        View a2 = dVar.mo5236a(fragment.mContainerId);
        if (!(a2 == null || a2.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
            a2.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        if (fragment.mContainer != null && fragment.mContainer.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, nextAnim);
        if (onCreateAnimation != null) {
            return new C1030a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, nextAnim);
        if (onCreateAnimator != null) {
            return new C1030a(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (loadAnimation != null) {
                        return new C1030a(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                    if (loadAnimator != null) {
                        return new C1030a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, nextAnim);
                        if (loadAnimation2 != null) {
                            return new C1030a(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (nextTransition != 0 && (a = m4982a(nextTransition, z)) >= 0) {
            return new C1030a(AnimationUtils.loadAnimation(context, a));
        }
        return null;
    }
}

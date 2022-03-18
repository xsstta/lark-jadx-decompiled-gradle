package com.bytedance.ee.bear.drive.common;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.ee.bear.drive.common.a */
public class C6883a {

    /* renamed from: com.bytedance.ee.bear.drive.common.a$a  reason: invalid class name */
    private static class animationAnimation$AnimationListenerC6886a implements Animation.AnimationListener {

        /* renamed from: a */
        private Animation.AnimationListener f18663a;

        animationAnimation$AnimationListenerC6886a(Animation.AnimationListener animationListener) {
            this.f18663a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.f18663a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.f18663a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.f18663a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: c */
    public static void m27202c(View view) {
        m27196a(view, 150, (Animation.AnimationListener) null);
    }

    /* renamed from: a */
    public static void m27194a(View view) {
        if (m27205e(view)) {
            m27204d(view);
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    public static void m27200b(View view) {
        m27197a(view, 150, null, 3000);
    }

    /* renamed from: e */
    private static boolean m27205e(View view) {
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static void m27204d(View view) {
        Object tag = view.getTag(view.getId());
        if (tag instanceof Disposable) {
            Disposable disposable = (Disposable) tag;
            if (!disposable.isDisposed()) {
                disposable.dispose();
                C13479a.m54772d("CrossFadeAnimUtil", "detach auto hide disposable. ");
            }
        }
    }

    /* renamed from: f */
    private static boolean m27206f(View view) {
        Animation animation = view.getAnimation();
        if (animation == null || !animation.hasStarted() || animation.hasEnded()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m27196a(View view, int i, Animation.AnimationListener animationListener) {
        if (m27205e(view) && !m27206f(view)) {
            C13479a.m54772d("CrossFadeAnimUtil", "hideWithAnim. ");
            m27204d(view);
            m27203c(view, i, animationListener);
        }
    }

    /* renamed from: b */
    private static void m27201b(final View view, int i, Animation.AnimationListener animationListener) {
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (-view.getHeight()), BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration((long) i);
        translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC6886a(animationListener) {
            /* class com.bytedance.ee.bear.drive.common.C6883a.C68841 */

            @Override // com.bytedance.ee.bear.drive.common.C6883a.animationAnimation$AnimationListenerC6886a
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(0);
                super.onAnimationEnd(animation);
            }
        });
        view.startAnimation(translateAnimation);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m27203c(final View view, int i, Animation.AnimationListener animationListener) {
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (-view.getHeight()));
        translateAnimation.setDuration((long) i);
        translateAnimation.setAnimationListener(new animationAnimation$AnimationListenerC6886a(animationListener) {
            /* class com.bytedance.ee.bear.drive.common.C6883a.C68852 */

            @Override // com.bytedance.ee.bear.drive.common.C6883a.animationAnimation$AnimationListenerC6886a
            public void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
                super.onAnimationEnd(animation);
            }
        });
        view.startAnimation(translateAnimation);
    }

    /* renamed from: a */
    private static void m27195a(View view, int i, int i2) {
        C13479a.m54772d("CrossFadeAnimUtil", "attach auto hide disposable. ");
        m27204d(view);
        view.setTag(view.getId(), AbstractC68307f.m265076a((long) i2, TimeUnit.MILLISECONDS, C11678b.m48480d()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(view, i) {
            /* class com.bytedance.ee.bear.drive.common.$$Lambda$a$rpCkWTxE51HDEMyH8ZoQWK3xpYE */
            public final /* synthetic */ View f$0;
            public final /* synthetic */ int f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                C6883a.m27203c(this.f$0, this.f$1, null);
            }
        }, $$Lambda$a$xh5JCsaAB_dbl5PCnixWILM8PIQ.INSTANCE));
    }

    /* renamed from: a */
    public static void m27197a(View view, int i, Animation.AnimationListener animationListener, int i2) {
        if (!m27205e(view) && !m27206f(view)) {
            C13479a.m54772d("CrossFadeAnimUtil", "showWithAnimAndAutoHide. ");
            m27201b(view, i, animationListener);
            m27195a(view, i, i2 + i);
        }
    }
}

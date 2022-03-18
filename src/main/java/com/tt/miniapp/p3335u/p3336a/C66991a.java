package com.tt.miniapp.p3335u.p3336a;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.C65966d;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.p3335u.C66997b;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.C67527g;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* renamed from: com.tt.miniapp.u.a.a */
public class C66991a {

    /* renamed from: a */
    public C66996c f168924a;

    /* renamed from: b */
    private List<WeakReference<ImageView>> f168925b = new LinkedList();

    /* renamed from: c */
    private Animation f168926c;

    /* renamed from: d */
    private Animation f168927d;

    /* renamed from: e */
    private Animation f168928e;

    /* renamed from: f */
    private Animation.AnimationListener f168929f;

    /* renamed from: g */
    private Animation.AnimationListener f168930g;

    /* renamed from: h */
    private IAppContext f168931h;

    /* renamed from: com.tt.miniapp.u.a.a$a  reason: invalid class name */
    private static abstract class AbstractanimationAnimation$AnimationListenerC66994a implements Animation.AnimationListener {
        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        private AbstractanimationAnimation$AnimationListenerC66994a() {
        }
    }

    /* renamed from: a */
    private String m261102a() {
        C65966d titleBar;
        RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(this.f168931h).getRenderViewManager();
        if (renderViewManager == null) {
            return "white";
        }
        RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
        if (!(currentIRender instanceof AppbrandFragment) || (titleBar = ((AppbrandFragment) currentIRender).getTitleBar()) == null) {
            return "white";
        }
        return titleBar.mo230929a();
    }

    /* renamed from: b */
    private void m261105b() {
        this.f168929f = new AbstractanimationAnimation$AnimationListenerC66994a() {
            /* class com.tt.miniapp.p3335u.p3336a.C66991a.C669921 */

            public void onAnimationEnd(Animation animation) {
                C66991a.this.mo233026a(3);
            }
        };
        this.f168930g = new AbstractanimationAnimation$AnimationListenerC66994a() {
            /* class com.tt.miniapp.p3335u.p3336a.C66991a.C669932 */

            public void onAnimationEnd(Animation animation) {
                C66991a.this.f168924a.mo233039e();
            }
        };
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.4f);
        this.f168926c = alphaAnimation;
        alphaAnimation.setInterpolator(PathInterpolatorCompat.create(0.25f, 0.1f, 0.25f, 1.0f));
        this.f168926c.setDuration(800);
        this.f168926c.setRepeatMode(2);
        this.f168926c.setRepeatCount(1);
        this.f168926c.setAnimationListener(this.f168929f);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, (float) BitmapDescriptorFactory.HUE_RED);
        this.f168927d = alphaAnimation2;
        alphaAnimation2.setInterpolator(PathInterpolatorCompat.create(0.8f, 0.4f, 1.0f, 0.6f));
        this.f168927d.setDuration(800);
        this.f168927d.setFillAfter(true);
        this.f168927d.setAnimationListener(this.f168930g);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation((float) BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f168928e = alphaAnimation3;
        alphaAnimation3.setInterpolator(PathInterpolatorCompat.create(0.2f, 0.6f, BitmapDescriptorFactory.HUE_RED, 0.4f));
        this.f168928e.setDuration(800);
        this.f168928e.setFillAfter(true);
        this.f168928e.setAnimationListener(this.f168929f);
    }

    /* renamed from: b */
    private void m261106b(ImageView imageView) {
        this.f168926c.setAnimationListener(null);
        this.f168927d.setAnimationListener(null);
        this.f168928e.setAnimationListener(null);
        imageView.clearAnimation();
        this.f168926c.setAnimationListener(this.f168929f);
        this.f168928e.setAnimationListener(this.f168929f);
        this.f168927d.setAnimationListener(this.f168930g);
    }

    /* renamed from: b */
    private Drawable m261104b(int i) {
        Drawable drawable;
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        if (12 == i) {
            return ContextCompat.getDrawable(applicationContext, R.drawable.microapp_m_secrecy_location);
        }
        if (13 == i) {
            return ContextCompat.getDrawable(applicationContext, R.drawable.microapp_m_secrecy_microphone);
        }
        C67527g a = C67527g.m262641a();
        boolean isGame = AppbrandContext.getInst().isGame();
        if (TextUtils.equals(m261102a(), "black")) {
            Drawable f = a.mo234492f();
            if (f != null) {
                return f;
            }
        } else {
            if (isGame) {
                drawable = a.mo234497k();
            } else {
                drawable = a.mo234492f();
            }
            if (drawable != null) {
                return drawable;
            }
        }
        return ContextCompat.getDrawable(applicationContext, 2131234656);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo233026a(int i) {
        int i2 = 0;
        AppBrandLogger.m52828d("MenuBtnHelper", "updateState: " + i);
        while (i2 < this.f168925b.size()) {
            ImageView imageView = this.f168925b.get(i2).get();
            if (imageView == null) {
                this.f168925b.remove(i2);
            } else {
                m261103a(imageView, i);
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo233027a(ImageView imageView) {
        int i = 0;
        boolean z = false;
        while (i < this.f168925b.size()) {
            ImageView imageView2 = this.f168925b.get(i).get();
            if (imageView2 == null) {
                this.f168925b.remove(i);
            } else {
                if (Objects.equals(imageView, imageView2)) {
                    z = true;
                }
                i++;
            }
        }
        if (!z) {
            this.f168925b.add(new WeakReference<>(imageView));
            m261103a(imageView, 0);
        }
    }

    C66991a(C66996c cVar, IAppContext iAppContext) {
        this.f168931h = iAppContext;
        this.f168924a = cVar;
        m261105b();
    }

    /* renamed from: a */
    private void m261103a(ImageView imageView, int i) {
        C66997b c = this.f168924a.mo233037c();
        m261106b(imageView);
        if (c == null) {
            imageView.setImageDrawable(m261104b(-1));
            return;
        }
        imageView.setImageDrawable(m261104b(c.f168943a));
        if (2 == i) {
            imageView.startAnimation(this.f168928e);
        } else if (1 == i) {
            imageView.startAnimation(this.f168926c);
        } else if (this.f168924a.mo233038d()) {
            imageView.startAnimation(this.f168927d);
        } else {
            imageView.startAnimation(this.f168926c);
        }
    }
}

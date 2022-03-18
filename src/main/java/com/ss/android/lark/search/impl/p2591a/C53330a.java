package com.ss.android.lark.search.impl.p2591a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.constant.SearchConstants;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.search.impl.a.a */
public class C53330a {

    /* renamed from: a */
    public AbstractC53333a f131827a;

    /* renamed from: b */
    private int f131828b;

    /* renamed from: com.ss.android.lark.search.impl.a.a$a */
    public interface AbstractC53333a {
        /* renamed from: a */
        ImageView mo181964a();

        /* renamed from: b */
        View mo181965b();

        /* renamed from: c */
        View mo181966c();

        /* renamed from: d */
        View mo181967d();

        /* renamed from: e */
        View mo181968e();

        /* renamed from: f */
        Bitmap mo181969f();

        /* renamed from: g */
        int mo181970g();

        /* renamed from: h */
        EditText mo181971h();

        /* renamed from: i */
        Activity mo181972i();

        /* renamed from: j */
        View mo181973j();
    }

    /* renamed from: c */
    private void m206417c() {
        if (this.f131827a.mo181969f() != null) {
            this.f131827a.mo181964a().setImageBitmap(this.f131827a.mo181969f());
        }
    }

    /* renamed from: e */
    private boolean m206420e() {
        if (this.f131828b == 6) {
            return true;
        }
        if (C53258a.m205939a() == null || !C53258a.m205939a().mo181749b()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public int mo181959b() {
        return (DeviceUtils.getScreenWidth(this.f131827a.mo181972i()) - this.f131827a.mo181968e().getMeasuredWidth()) - UIHelper.dp2px(116.0f);
    }

    /* renamed from: d */
    private void m206419d() {
        int g = this.f131827a.mo181970g();
        ImageView a = this.f131827a.mo181964a();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) a.getLayoutParams();
        layoutParams.height = g;
        layoutParams.setMargins(0, -g, 0, 0);
        a.setLayoutParams(layoutParams);
        float f = (float) g;
        this.f131827a.mo181964a().setY(this.f131827a.mo181964a().getY() + f);
        this.f131827a.mo181965b().setY(this.f131827a.mo181965b().getY() + f);
        this.f131827a.mo181966c().setY(this.f131827a.mo181966c().getY() + f);
    }

    /* renamed from: a */
    public int mo181956a() {
        return this.f131827a.mo181968e().getMeasuredWidth() + UIHelper.dp2px(16.0f) + UIHelper.dp2px(8.0f);
    }

    public C53330a(AbstractC53333a aVar) {
        this.f131827a = aVar;
        m206417c();
        m206419d();
    }

    /* renamed from: a */
    public void mo181957a(final Animator.AnimatorListener animatorListener) {
        this.f131827a.mo181965b().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.search.impl.p2591a.C53330a.ViewTreeObserver$OnGlobalLayoutListenerC533311 */

            public void onGlobalLayout() {
                C53330a.this.f131827a.mo181965b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C53330a.this.f131827a.mo181971h().setWidth(C53330a.this.mo181959b());
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) C53330a.this.f131827a.mo181973j().getLayoutParams();
                marginLayoutParams.rightMargin = C53330a.this.mo181956a();
                C53330a.this.f131827a.mo181973j().setLayoutParams(marginLayoutParams);
                C53330a.this.mo181960b(animatorListener);
            }
        });
    }

    /* renamed from: b */
    public void mo181960b(Animator.AnimatorListener animatorListener) {
        m206418c(this.f131827a.mo181964a(), this.f131827a.mo181964a().getY(), this.f131827a.mo181964a().getY() - ((float) this.f131827a.mo181970g()));
        m206418c(this.f131827a.mo181965b(), this.f131827a.mo181965b().getY(), this.f131827a.mo181965b().getY() - ((float) this.f131827a.mo181970g()));
        m206418c(this.f131827a.mo181966c(), this.f131827a.mo181966c().getY(), this.f131827a.mo181966c().getY() - ((float) this.f131827a.mo181970g()));
        mo181958a(this.f131827a.mo181966c(), BitmapDescriptorFactory.HUE_RED, 1.0f, 100);
        m206416b(this.f131827a.mo181967d(), 1.0f, 1.0f - ((((float) (this.f131827a.mo181968e().getMeasuredWidth() + UIHelper.dp2px(10.0f))) * 1.0f) / ((float) this.f131827a.mo181967d().getWidth())));
        m206413a(this.f131827a.mo181968e(), (float) UIHelper.dp2px(-32.0f), (float) UIHelper.dp2px(16.0f));
        if (m206420e()) {
            m206414a(this.f131827a.mo181965b(), BitmapDescriptorFactory.HUE_RED, 1.0f, SearchConstants.f131825a, animatorListener);
        } else {
            m206414a(this.f131827a.mo181968e(), BitmapDescriptorFactory.HUE_RED, 1.0f, SearchConstants.f131825a, animatorListener);
        }
    }

    /* renamed from: c */
    public void mo181961c(Animator.AnimatorListener animatorListener) {
        m206415a(this.f131827a.mo181964a(), this.f131827a.mo181964a().getY(), this.f131827a.mo181964a().getY() + ((float) this.f131827a.mo181970g()), new AnimatorListenerAdapter() {
            /* class com.ss.android.lark.search.impl.p2591a.C53330a.C533322 */

            public void onAnimationEnd(Animator animator) {
                C53330a aVar = C53330a.this;
                aVar.mo181958a(aVar.f131827a.mo181966c(), 1.0f, BitmapDescriptorFactory.HUE_RED, 100);
            }
        });
        m206418c(this.f131827a.mo181965b(), this.f131827a.mo181965b().getY(), this.f131827a.mo181965b().getY() + ((float) this.f131827a.mo181970g()));
        m206418c(this.f131827a.mo181966c(), this.f131827a.mo181966c().getY(), this.f131827a.mo181966c().getY() + ((float) this.f131827a.mo181970g()));
        m206416b(this.f131827a.mo181967d(), 1.0f - ((((float) (this.f131827a.mo181968e().getMeasuredWidth() + UIHelper.dp2px(10.0f))) * 1.0f) / ((float) this.f131827a.mo181967d().getWidth())), 1.0f);
        m206413a(this.f131827a.mo181968e(), (float) UIHelper.dp2px(16.0f), (float) UIHelper.dp2px(-32.0f));
        if (m206420e()) {
            mo181958a(this.f131827a.mo181965b(), 1.0f, BitmapDescriptorFactory.HUE_RED, SearchConstants.f131825a);
            m206414a(this.f131827a.mo181966c(), 1.0f, BitmapDescriptorFactory.HUE_RED, SearchConstants.f131825a, animatorListener);
            return;
        }
        m206414a(this.f131827a.mo181968e(), 1.0f, BitmapDescriptorFactory.HUE_RED, SearchConstants.f131825a, animatorListener);
    }

    /* renamed from: c */
    private void m206418c(View view, float f, float f2) {
        m206415a(view, f, f2, (Animator.AnimatorListener) null);
    }

    /* renamed from: a */
    private void m206413a(View view, float f, float f2) {
        C53334b.m206440d(view, f, f2, SearchConstants.f131825a).start();
    }

    /* renamed from: b */
    private void m206416b(View view, float f, float f2) {
        C53334b.m206439c(view, f, f2, SearchConstants.f131825a).start();
    }

    /* renamed from: a */
    private void m206415a(View view, float f, float f2, Animator.AnimatorListener animatorListener) {
        ValueAnimator a = C53334b.m206437a(view, f, f2, SearchConstants.f131825a);
        if (animatorListener != null) {
            a.addListener(animatorListener);
        }
        a.start();
    }

    /* renamed from: a */
    public void mo181958a(View view, float f, float f2, int i) {
        m206414a(view, f, f2, i, null);
    }

    /* renamed from: a */
    private void m206414a(View view, float f, float f2, int i, Animator.AnimatorListener animatorListener) {
        ValueAnimator b = C53334b.m206438b(view, f, f2, i);
        if (animatorListener != null) {
            b.addListener(animatorListener);
        }
        b.start();
    }
}

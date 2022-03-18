package com.bytedance.ee.bear.search.p536a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ee.util.p718t.C13727b;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.al;
import com.ss.android.lark.ui.p2892a.C57582a;

/* renamed from: com.bytedance.ee.bear.search.a.b */
public class C10792b {

    /* renamed from: a */
    public final AbstractC10797a f28942a;

    /* renamed from: b */
    public boolean f28943b;

    /* renamed from: com.bytedance.ee.bear.search.a.b$a */
    public interface AbstractC10797a {
        /* renamed from: a */
        View mo40878a();

        /* renamed from: b */
        View mo40879b();

        /* renamed from: c */
        View mo40880c();

        /* renamed from: d */
        View mo40881d();

        /* renamed from: e */
        View mo40882e();

        /* renamed from: f */
        int mo40883f();

        /* renamed from: g */
        EditText mo40884g();

        /* renamed from: h */
        View mo40885h();
    }

    /* renamed from: c */
    private void m44799c() {
        Bitmap d = m44801d();
        if (d != null && (this.f28942a.mo40878a() instanceof ImageView)) {
            ((ImageView) this.f28942a.mo40878a()).setImageBitmap(d);
        }
    }

    /* renamed from: d */
    private Bitmap m44801d() {
        Object a = al.m95028a().mo93365a("search_title_bitmap");
        if (a instanceof Bitmap) {
            return (Bitmap) a;
        }
        return null;
    }

    /* renamed from: a */
    public void mo40866a() {
        View h = this.f28942a.mo40885h();
        h.setVisibility(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h.getLayoutParams();
        ValueAnimator d = C13727b.m55686d(h, (float) marginLayoutParams.topMargin, BitmapDescriptorFactory.HUE_RED, LocationRequest.PRIORITY_HD_ACCURACY);
        d.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.search.p536a.C10792b.C107953 */

            public void onAnimationEnd(Animator animator) {
                C10792b.this.f28943b = false;
            }

            public void onAnimationStart(Animator animator) {
                C10792b.this.f28943b = true;
            }
        });
        if (!this.f28943b && marginLayoutParams.topMargin < 0) {
            d.start();
        }
    }

    /* renamed from: b */
    public void mo40870b() {
        final View h = this.f28942a.mo40885h();
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) h.getLayoutParams();
        final int i = marginLayoutParams.topMargin;
        ValueAnimator d = C13727b.m55686d(h, (float) marginLayoutParams.topMargin, (float) (-h.getHeight()), LocationRequest.PRIORITY_HD_ACCURACY);
        d.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.search.p536a.C10792b.C107964 */

            public void onAnimationStart(Animator animator) {
                C10792b.this.f28943b = true;
            }

            public void onAnimationEnd(Animator animator) {
                C10792b.this.f28943b = false;
                h.setVisibility(8);
                marginLayoutParams.topMargin = i;
                h.setLayoutParams(marginLayoutParams);
            }
        });
        if (!this.f28943b && marginLayoutParams.topMargin >= 0) {
            d.start();
        }
    }

    /* renamed from: e */
    private void m44802e() {
        int f = this.f28942a.mo40883f();
        View a = this.f28942a.mo40878a();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) a.getLayoutParams();
        layoutParams.height = f;
        layoutParams.setMargins(0, -f, 0, 0);
        a.setLayoutParams(layoutParams);
        float f2 = (float) f;
        this.f28942a.mo40878a().setY(this.f28942a.mo40878a().getY() + f2);
        this.f28942a.mo40879b().setY(this.f28942a.mo40879b().getY() + f2);
        this.f28942a.mo40880c().setY(this.f28942a.mo40880c().getY() + f2);
    }

    public C10792b(AbstractC10797a aVar) {
        this.f28942a = aVar;
        m44799c();
        m44802e();
    }

    /* renamed from: a */
    public void mo40867a(Animator.AnimatorListener animatorListener) {
        m44798b(this.f28942a.mo40878a(), this.f28942a.mo40878a().getY(), this.f28942a.mo40878a().getY() + ((float) this.f28942a.mo40883f()), LocationRequest.PRIORITY_HD_ACCURACY, new AnimatorListenerAdapter() {
            /* class com.bytedance.ee.bear.search.p536a.C10792b.C107942 */

            public void onAnimationEnd(Animator animator) {
                C10792b bVar = C10792b.this;
                bVar.mo40869a(bVar.f28942a.mo40880c(), 1.0f, BitmapDescriptorFactory.HUE_RED, 100);
            }
        });
        m44800c(this.f28942a.mo40879b(), this.f28942a.mo40879b().getY(), this.f28942a.mo40879b().getY() + ((float) this.f28942a.mo40883f()), LocationRequest.PRIORITY_HD_ACCURACY);
        m44800c(this.f28942a.mo40880c(), this.f28942a.mo40880c().getY(), this.f28942a.mo40880c().getY() + ((float) this.f28942a.mo40883f()), LocationRequest.PRIORITY_HD_ACCURACY);
        m44797b(this.f28942a.mo40881d(), (float) C57582a.m223600a(16), (float) C57582a.m223600a(-32), LocationRequest.PRIORITY_HD_ACCURACY);
        m44796a(this.f28942a.mo40881d(), 1.0f, BitmapDescriptorFactory.HUE_RED, LocationRequest.PRIORITY_HD_ACCURACY, animatorListener);
    }

    /* renamed from: a */
    public void mo40868a(final Animator.AnimatorListener animatorListener, final boolean z) {
        this.f28942a.mo40879b().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.bytedance.ee.bear.search.p536a.C10792b.ViewTreeObserver$OnGlobalLayoutListenerC107931 */

            public void onGlobalLayout() {
                C10792b.this.f28942a.mo40879b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                C10792b.this.f28942a.mo40884g().setWidth(C10792b.this.f28942a.mo40882e().getMeasuredWidth() - C57582a.m223600a(64));
                C10792b.this.mo40871b(animatorListener, z);
            }
        });
    }

    /* renamed from: b */
    public void mo40871b(Animator.AnimatorListener animatorListener, boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = LocationRequest.PRIORITY_HD_ACCURACY;
        } else {
            i = 0;
        }
        if (z) {
            i2 = 100;
        }
        m44800c(this.f28942a.mo40878a(), this.f28942a.mo40878a().getY(), this.f28942a.mo40878a().getY() - ((float) this.f28942a.mo40883f()), i);
        m44800c(this.f28942a.mo40879b(), this.f28942a.mo40879b().getY(), this.f28942a.mo40879b().getY() - ((float) this.f28942a.mo40883f()), i);
        m44800c(this.f28942a.mo40880c(), this.f28942a.mo40880c().getY(), this.f28942a.mo40880c().getY() - ((float) this.f28942a.mo40883f()), i);
        mo40869a(this.f28942a.mo40880c(), BitmapDescriptorFactory.HUE_RED, 1.0f, i2);
        m44797b(this.f28942a.mo40881d(), (float) C57582a.m223600a(-32), (float) C57582a.m223600a(16), i);
        m44796a(this.f28942a.mo40881d(), BitmapDescriptorFactory.HUE_RED, 1.0f, i, animatorListener);
    }

    /* renamed from: b */
    private void m44797b(View view, float f, float f2, int i) {
        C13727b.m55685c(view, f, f2, i).start();
    }

    /* renamed from: c */
    private void m44800c(View view, float f, float f2, int i) {
        m44798b(view, f, f2, i, null);
    }

    /* renamed from: a */
    public void mo40869a(View view, float f, float f2, int i) {
        m44796a(view, f, f2, i, null);
    }

    /* renamed from: a */
    private void m44796a(View view, float f, float f2, int i, Animator.AnimatorListener animatorListener) {
        ValueAnimator b = C13727b.m55681b(view, f, f2, i);
        if (animatorListener != null) {
            b.addListener(animatorListener);
        }
        b.start();
    }

    /* renamed from: b */
    private void m44798b(View view, float f, float f2, int i, Animator.AnimatorListener animatorListener) {
        ValueAnimator a = C13727b.m55677a(view, f, f2, i);
        if (animatorListener != null) {
            a.addListener(animatorListener);
        }
        a.start();
    }
}

package com.bytedance.ee.bear.slide.browse.navbar;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.core.view.C0899e;
import com.bytedance.ee.bear.slide.common.widget.SlideWebViewContainer;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.slide.browse.navbar.a */
public class C11376a {

    /* renamed from: a */
    public WebView f30549a;

    /* renamed from: b */
    public AppBarLayout f30550b;

    /* renamed from: c */
    public SlideWebViewContainer f30551c;

    /* renamed from: d */
    public int f30552d;

    /* renamed from: e */
    public boolean f30553e = true;

    /* renamed from: f */
    private ValueAnimator f30554f;

    /* renamed from: g */
    private final String f30555g = "titleAnimatorMargin";

    /* renamed from: h */
    private final String f30556h = "titleAnimatorPadding";

    /* renamed from: c */
    public void mo43532c() {
        mo43529a(this.f30553e);
    }

    /* renamed from: g */
    private void m47203g() {
        ValueAnimator valueAnimator = this.f30554f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f30554f = null;
        }
    }

    /* renamed from: e */
    public void mo43534e() {
        m47203g();
        this.f30550b.setVisibility(0);
        this.f30551c.setOnTouchListener(null);
    }

    /* renamed from: a */
    public void mo43527a() {
        if (mo43533d()) {
            if (this.f30553e) {
                mo43529a(false);
            } else {
                mo43529a(true);
            }
        }
    }

    /* renamed from: b */
    public void mo43530b() {
        m47202f();
        final C0899e eVar = new C0899e(this.f30549a.getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.slide.browse.navbar.C11376a.C113771 */

            public boolean onSingleTapUp(MotionEvent motionEvent) {
                return false;
            }

            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (C11376a.this.f30552d != 0) {
                    return false;
                }
                float f3 = BitmapDescriptorFactory.HUE_RED;
                if (f2 == BitmapDescriptorFactory.HUE_RED || C11376a.this.f30549a.getScrollY() != 0) {
                    return false;
                }
                float height = (float) C11376a.this.f30550b.getHeight();
                float translationY = C11376a.this.f30550b.getTranslationY();
                float translationY2 = C11376a.this.f30551c.getChildAt(0).getTranslationY();
                float f4 = -f2;
                float f5 = translationY + f4;
                if (f5 >= BitmapDescriptorFactory.HUE_RED || f5 <= (-height)) {
                    if (f5 >= BitmapDescriptorFactory.HUE_RED) {
                        C11376a.this.f30553e = true;
                    } else {
                        float f6 = -height;
                        if (f5 <= f6) {
                            C11376a.this.f30553e = false;
                            f5 = f6;
                        }
                    }
                    f5 = BitmapDescriptorFactory.HUE_RED;
                }
                float f7 = translationY2 + f4;
                if (f7 > BitmapDescriptorFactory.HUE_RED && f7 < height) {
                    f3 = f7;
                } else if (f4 + BitmapDescriptorFactory.HUE_RED > BitmapDescriptorFactory.HUE_RED && f7 >= height) {
                    f3 = height;
                }
                C11376a.this.f30550b.setTranslationY(f5);
                C11376a.this.f30551c.getChildAt(0).setTranslationY(f3);
                if (translationY2 != f3) {
                    return true;
                }
                return false;
            }
        });
        this.f30551c.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.ee.bear.slide.browse.navbar.C11376a.View$OnTouchListenerC113782 */

            /* renamed from: c */
            private int f30560c;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (C11376a.this.f30552d == 1 || C11376a.this.f30552d != 0 || !C11376a.this.mo43533d()) {
                    return false;
                }
                if (eVar.mo4687a(motionEvent)) {
                    return true;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f30560c = C11376a.this.f30549a.getScrollY();
                } else if (action == 1 && C11376a.this.f30553e && this.f30560c != C11376a.this.f30549a.getScrollY() && C11376a.this.f30549a.getScrollY() != 0) {
                    C11376a.this.mo43529a(false);
                }
                return false;
            }
        });
    }

    /* renamed from: d */
    public boolean mo43533d() {
        if (this.f30549a.canScrollVertically(1) || this.f30549a.canScrollVertically(-1) || !m47204h()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m47202f() {
        this.f30550b.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        this.f30551c.getChildAt(0).setTranslationY(this.f30550b.getContext().getResources().getDimension(R.dimen.doc_titlebar_height));
    }

    /* renamed from: h */
    private boolean m47204h() {
        float translationY = this.f30550b.getTranslationY();
        if (((float) this.f30550b.getHeight()) == this.f30551c.getChildAt(0).getTranslationY() && translationY == BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo43528a(int i) {
        this.f30552d = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m47201a(ValueAnimator valueAnimator) {
        this.f30550b.setTranslationY(((Float) valueAnimator.getAnimatedValue("titleAnimatorMargin")).floatValue());
        this.f30551c.getChildAt(0).setTranslationY(((Float) valueAnimator.getAnimatedValue("titleAnimatorPadding")).floatValue());
    }

    /* renamed from: b */
    public void mo43531b(boolean z) {
        float f;
        C13479a.m54764b("SlideNavBarScrollHelper", "showOrHideWithAnimation " + z);
        if (this.f30552d != 1 || !z) {
            this.f30553e = z;
            float height = (float) this.f30550b.getHeight();
            m47203g();
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = -height;
            }
            int i = this.f30552d;
            if ((i == 0 || i == 1) && (!z || this.f30549a.getScrollY() != 0)) {
                height = BitmapDescriptorFactory.HUE_RED;
            }
            this.f30550b.setTranslationY(f);
            this.f30551c.getChildAt(0).setTranslationY(height);
            if (z) {
                this.f30550b.setVisibility(0);
            } else {
                this.f30550b.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public void mo43529a(boolean z) {
        float f;
        PropertyValuesHolder propertyValuesHolder;
        C13479a.m54764b("SlideNavBarScrollHelper", "showOrHideWithAnimation " + z);
        if (this.f30552d != 1 || !z) {
            this.f30553e = z;
            m47203g();
            float height = (float) this.f30550b.getHeight();
            float f2 = BitmapDescriptorFactory.HUE_RED;
            if (z) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = -height;
            }
            if (z && this.f30549a.getScrollY() == 0) {
                f2 = height;
            }
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("titleAnimatorMargin", this.f30550b.getTranslationY(), f);
            int i = this.f30552d;
            if (i == 0 || i == 1) {
                propertyValuesHolder = PropertyValuesHolder.ofFloat("titleAnimatorPadding", this.f30551c.getChildAt(0).getTranslationY(), f2);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofFloat("titleAnimatorPadding", this.f30551c.getChildAt(0).getTranslationY(), height);
            }
            ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(ofFloat, propertyValuesHolder);
            this.f30554f = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration(200L);
            this.f30554f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.ee.bear.slide.browse.navbar.$$Lambda$a$OJzjRp54aKS_N5uog_vbZwRkZX4 */

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C11376a.this.m47201a((C11376a) valueAnimator);
                }
            });
            this.f30554f.start();
        }
    }

    public C11376a(WebView webView, AppBarLayout appBarLayout, SlideWebViewContainer slideWebViewContainer) {
        this.f30549a = webView;
        this.f30550b = appBarLayout;
        this.f30551c = slideWebViewContainer;
    }
}

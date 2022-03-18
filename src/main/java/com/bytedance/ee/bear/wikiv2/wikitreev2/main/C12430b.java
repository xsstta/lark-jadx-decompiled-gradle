package com.bytedance.ee.bear.wikiv2.wikitreev2.main;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wikiv2.searchv2.WikiSearchView2;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.C12430b;
import com.bytedance.ee.bear.wikiv2.wikitreev2.main.WikiCoverCoordinatorLayout;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.b */
public class C12430b {

    /* renamed from: a */
    public final SpaceCoverView f33353a;

    /* renamed from: b */
    public final ViewConfiguration f33354b;

    /* renamed from: c */
    public int f33355c;

    /* renamed from: d */
    private final FragmentActivity f33356d;

    /* renamed from: e */
    private final WikiCoverCoordinatorLayout f33357e;

    /* renamed from: f */
    private final AppBarLayout f33358f;

    /* renamed from: g */
    private final Toolbar f33359g;

    /* renamed from: h */
    private final BaseTitleBar f33360h;

    /* renamed from: i */
    private final WikiSearchView2 f33361i;

    /* renamed from: j */
    private int f33362j;

    /* renamed from: k */
    private final PointF f33363k = new PointF();

    /* renamed from: b */
    public void mo47368b() {
        if (this.f33358f != null && this.f33359g != null) {
            if (this.f33361i.mo47048a() || this.f33359g.getAlpha() > 0.5f) {
                m51706a(true);
            } else {
                m51706a(!this.f33353a.mo47317a());
            }
        }
    }

    /* renamed from: a */
    public void mo47367a() {
        this.f33357e.setOnScrollListener(new WikiCoverCoordinatorLayout.AbstractC12426b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.main.C12430b.C124311 */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.main.WikiCoverCoordinatorLayout.AbstractC12426b
            /* renamed from: a */
            public void mo47340a() {
                CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) C12430b.this.f33353a.getLayoutParams();
                if (layoutParams.height > C12430b.this.f33355c) {
                    ValueAnimator duration = ValueAnimator.ofInt(layoutParams.height, C12430b.this.f33355c).setDuration(200L);
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(layoutParams) {
                        /* class com.bytedance.ee.bear.wikiv2.wikitreev2.main.$$Lambda$b$1$bG2n_uTWQZaUvuDAP5glD_m3rlo */
                        public final /* synthetic */ CollapsingToolbarLayout.LayoutParams f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            C12430b.C124311.lambda$bG2n_uTWQZaUvuDAP5glD_m3rlo(C12430b.C124311.this, this.f$1, valueAnimator);
                        }
                    });
                    duration.setInterpolator(new DecelerateInterpolator());
                    duration.start();
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m51710a(CollapsingToolbarLayout.LayoutParams layoutParams, ValueAnimator valueAnimator) {
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C12430b.this.f33353a.requestLayout();
            }

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.main.WikiCoverCoordinatorLayout.AbstractC12426b
            /* renamed from: a */
            public void mo47341a(float f, float f2) {
                CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) C12430b.this.f33353a.getLayoutParams();
                if (f2 > ((float) C12430b.this.f33354b.getScaledTouchSlop()) || layoutParams.height > C12430b.this.f33355c) {
                    layoutParams.height = (int) (((float) layoutParams.height) + (f2 / 2.0f));
                    if (layoutParams.height < C12430b.this.f33355c) {
                        layoutParams.height = C12430b.this.f33355c;
                    }
                    C12430b.this.f33353a.requestLayout();
                }
            }
        });
        this.f33357e.setInterceptTouchEventListener(new WikiCoverCoordinatorLayout.AbstractC12425a() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.main.$$Lambda$b$MoElKJG6ZNpAOUSazcdFRCLk4Kg */

            @Override // com.bytedance.ee.bear.wikiv2.wikitreev2.main.WikiCoverCoordinatorLayout.AbstractC12425a
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return C12430b.lambda$MoElKJG6ZNpAOUSazcdFRCLk4Kg(C12430b.this, motionEvent);
            }
        });
        this.f33358f.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b() {
            /* class com.bytedance.ee.bear.wikiv2.wikitreev2.main.$$Lambda$b$mnEkWhwDWG4Hyn5Yu7eCYqqGvD8 */

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                C12430b.lambda$mnEkWhwDWG4Hyn5Yu7eCYqqGvD8(C12430b.this, appBarLayout, i);
            }
        });
        C13746i.m55723a(this.f33356d.getWindow());
        this.f33356d.getWindow().setStatusBarColor(0);
        int a = C13746i.m55722a((Context) this.f33356d);
        CollapsingToolbarLayout.LayoutParams layoutParams = (CollapsingToolbarLayout.LayoutParams) this.f33353a.getLayoutParams();
        layoutParams.height = C13749l.m55738a(210) + a;
        this.f33353a.setLayoutParams(layoutParams);
        this.f33355c = layoutParams.height;
        CollapsingToolbarLayout.LayoutParams layoutParams2 = (CollapsingToolbarLayout.LayoutParams) this.f33359g.getLayoutParams();
        layoutParams2.height = this.f33356d.getResources().getDimensionPixelSize(R.dimen.doc_titlebar_height) + a;
        this.f33359g.setPadding(0, a, 0, 0);
        this.f33359g.setLayoutParams(layoutParams2);
        this.f33359g.setTranslationY((float) (-layoutParams2.height));
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f33360h.getLayoutParams();
        layoutParams3.topMargin = a;
        this.f33360h.setLayoutParams(layoutParams3);
        this.f33361i.setPadding(0, a, 0, 0);
    }

    /* renamed from: a */
    private void m51706a(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C11789c.m48865a(this.f33356d, this.f33356d.getResources().getColor(R.color.space_kit_trans, this.f33356d.getTheme()), z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m51707a(MotionEvent motionEvent) {
        float y = motionEvent.getY() - this.f33363k.y;
        float x = motionEvent.getX() - this.f33363k.x;
        if (motionEvent.getAction() == 2 && this.f33362j == 0 && y > ((float) this.f33354b.getScaledTouchSlop()) && y > Math.abs(x)) {
            return true;
        }
        this.f33363k.x = motionEvent.getX();
        this.f33363k.y = motionEvent.getY();
        return false;
    }

    public C12430b(FragmentActivity fragmentActivity, View view) {
        this.f33356d = fragmentActivity;
        this.f33357e = (WikiCoverCoordinatorLayout) view.findViewById(R.id.wiki_coordinator_layout);
        this.f33358f = (AppBarLayout) view.findViewById(R.id.wiki_appbar_layout);
        this.f33359g = (Toolbar) view.findViewById(R.id.wiki_header_toolbar);
        this.f33360h = (BaseTitleBar) view.findViewById(R.id.wiki_fixed_title_bar);
        this.f33353a = (SpaceCoverView) view.findViewById(R.id.wiki_cover_view);
        this.f33361i = (WikiSearchView2) view.findViewById(R.id.wiki_search_view);
        this.f33354b = ViewConfiguration.get(fragmentActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51705a(AppBarLayout appBarLayout, int i) {
        int height = this.f33359g.getHeight() / 2;
        int height2 = this.f33359g.getHeight() + height;
        if (Math.abs(i) < height) {
            if (this.f33359g.getAlpha() > BitmapDescriptorFactory.HUE_RED || this.f33359g.getTranslationY() > ((float) (-this.f33359g.getHeight()))) {
                this.f33359g.setAlpha(BitmapDescriptorFactory.HUE_RED);
                Toolbar toolbar = this.f33359g;
                toolbar.setTranslationY((float) (-toolbar.getHeight()));
                this.f33359g.setVisibility(8);
            }
        } else if (Math.abs(i) <= height2) {
            this.f33359g.setAlpha(((float) (Math.abs(i) - height)) / ((float) this.f33359g.getHeight()));
            this.f33359g.setTranslationY((float) (Math.abs(i) - height2));
            this.f33359g.setVisibility(0);
        } else if (this.f33359g.getAlpha() < 1.0f || this.f33359g.getTranslationY() < BitmapDescriptorFactory.HUE_RED) {
            this.f33359g.setAlpha(1.0f);
            this.f33359g.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            this.f33359g.setVisibility(0);
        }
        mo47368b();
        this.f33362j = Math.abs(i);
    }
}

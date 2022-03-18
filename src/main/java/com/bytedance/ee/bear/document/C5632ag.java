package com.bytedance.ee.bear.document;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Range;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.C4940b;
import com.bytedance.ee.bear.browser.plugin.MenuItem;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.document.p302c.C5686d;
import com.bytedance.ee.bear.document.titlebar.NavigationTitle;
import com.bytedance.ee.bear.facade.common.widget.CustomTitleView;
import com.bytedance.ee.bear.p376e.p377a.AbstractC7588a;
import com.bytedance.ee.bear.rn.RnManager;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13616d;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.document.ag */
public class C5632ag implements TitleBar {

    /* renamed from: c */
    private static final Range<Float> f15949c = new Range<>(Float.valueOf((float) BitmapDescriptorFactory.HUE_RED), Float.valueOf(1.0f));

    /* renamed from: a */
    public AppBarLayout f15950a;

    /* renamed from: b */
    public BaseTitleBar f15951b;

    /* renamed from: d */
    private AbstractC5638a f15952d;

    /* renamed from: e */
    private DocumentMetadata f15953e;

    /* renamed from: f */
    private ValueAnimator f15954f;

    /* renamed from: g */
    private int f15955g;

    /* renamed from: h */
    private CustomTitleView f15956h;

    /* renamed from: i */
    private List<MenuItem> f15957i;

    /* renamed from: j */
    private boolean f15958j;

    /* renamed from: k */
    private List<TitleBar.AbstractC4938a> f15959k = new CopyOnWriteArrayList();

    /* renamed from: l */
    private boolean f15960l = true;

    /* renamed from: m */
    private C4940b f15961m = new C4940b();

    /* renamed from: n */
    private C4940b f15962n = new C4940b();

    /* renamed from: o */
    private boolean f15963o;

    /* renamed from: com.bytedance.ee.bear.document.ag$a */
    public interface AbstractC5638a {
        /* renamed from: a */
        View mo22576a();

        /* renamed from: b */
        AppBarLayout mo22577b();

        /* renamed from: c */
        LifecycleOwner mo22578c();

        /* renamed from: d */
        FragmentActivity mo22579d();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public BaseTitleBar mo19508a() {
        return this.f15951b;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19512a(CharSequence charSequence) {
        this.f15953e.setTitle(charSequence);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19510a(TitleBar.TitleGravity titleGravity) {
        int i = C56375.f15972a[titleGravity.ordinal()];
        if (i == 1) {
            this.f15956h.setGravity(8388611);
            this.f15951b.setIsCenterAlways(false);
        } else if (i == 2) {
            this.f15956h.setGravity(17);
            this.f15951b.setIsCenterAlways(true);
        }
        this.f15951b.mo45087c();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19515a(boolean z) {
        this.f15956h.setTitleVisible(z);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19509a(int i) {
        this.f15956h.setTitleTextColor(i);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19514a(List<MenuItem> list, TitleBar.MenuType menuType) {
        if (menuType == TitleBar.MenuType.Left) {
            this.f15951b.mo45084b();
        } else {
            this.f15951b.mo45073a();
        }
        if (list != null) {
            for (MenuItem menuItem : list) {
                if (menuItem != null && !m22864a(menuItem)) {
                    m22857a(menuItem, menuType);
                }
            }
        }
        this.f15951b.mo45087c();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19513a(List<MenuItem> list) {
        this.f15957i = list;
    }

    /* renamed from: a */
    private boolean m22864a(MenuItem menuItem) {
        List<MenuItem> list = this.f15957i;
        if (list != null && !list.isEmpty()) {
            for (MenuItem menuItem2 : this.f15957i) {
                if (TextUtils.equals(menuItem2.getId(), menuItem.getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public View mo19507a(String str) {
        return this.f15951b.mo45071a(str);
    }

    /* renamed from: a */
    private void m22861a(Boolean bool) {
        if (bool != null) {
            if (bool.booleanValue()) {
                ((an) KoinJavaComponent.m268610a(an.class)).mo16405c().mo238001b(new Consumer() {
                    /* class com.bytedance.ee.bear.document.$$Lambda$ag$ZA2B3Y0Fzi2qmpLxXbBg7judBfc */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C5632ag.lambda$ZA2B3Y0Fzi2qmpLxXbBg7judBfc(C5632ag.this, (AccountService.Account) obj);
                    }
                }, new Consumer() {
                    /* class com.bytedance.ee.bear.document.$$Lambda$ag$97rtetSOIgRFM3CRx6mrVcGYdo */

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C5632ag.m269218lambda$97rtetSOIgRFM3CRx6mrVcGYdo(C5632ag.this, (Throwable) obj);
                    }
                });
            } else {
                this.f15956h.setExternalVisible(false);
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: a */
    public void mo19511a(TitleBar.AbstractC4938a aVar) {
        if (!this.f15959k.contains(aVar)) {
            this.f15959k.add(aVar);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: d */
    public void mo19523d() {
        this.f15951b.invalidate();
    }

    /* renamed from: g */
    private void m22867g() {
        ValueAnimator valueAnimator = this.f15954f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15954f = null;
        }
    }

    /* renamed from: h */
    private int m22868h() {
        return this.f15950a.getResources().getDimensionPixelSize(R.dimen.doc_titlebar_height);
    }

    /* renamed from: com.bytedance.ee.bear.document.ag$5 */
    static /* synthetic */ class C56375 {

        /* renamed from: a */
        static final /* synthetic */ int[] f15972a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.bear.browser.plugin.TitleBar$TitleGravity[] r0 = com.bytedance.ee.bear.browser.plugin.TitleBar.TitleGravity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.document.C5632ag.C56375.f15972a = r0
                com.bytedance.ee.bear.browser.plugin.TitleBar$TitleGravity r1 = com.bytedance.ee.bear.browser.plugin.TitleBar.TitleGravity.Left     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.document.C5632ag.C56375.f15972a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.browser.plugin.TitleBar$TitleGravity r1 = com.bytedance.ee.bear.browser.plugin.TitleBar.TitleGravity.Center     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.C5632ag.C56375.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ boolean m22875m() {
        if (this.f15959k.isEmpty()) {
            return true;
        }
        m22870j();
        m22872k();
        m22874l();
        return true;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: c */
    public C4940b mo19521c() {
        if (this.f15961m.f14501a == 0) {
            this.f15961m.f14501a = C13749l.m55749b(C13746i.m55722a(this.f15950a.getContext()));
            this.f15961m.f14503c = f15949c.getUpper().floatValue();
        }
        return this.f15961m;
    }

    /* renamed from: f */
    public void mo22571f() {
        Fragment findFragmentById = this.f15952d.mo22579d().getSupportFragmentManager().findFragmentById(R.id.documentFragment);
        if (findFragmentById instanceof aj) {
            ((aj) findFragmentById).mo22585j();
        } else {
            C13479a.m54775e("SimpleTitleBar", "scrollToTop FAIL");
        }
    }

    /* renamed from: j */
    private void m22870j() {
        int i;
        if (this.f15950a.getHeight() == 0) {
            this.f15961m.f14503c = f15949c.getLower().floatValue();
            return;
        }
        int[] iArr = new int[2];
        this.f15950a.getLocationOnScreen(iArr);
        int a = iArr[1] + C13749l.m55738a(this.f15961m.f14502b);
        int a2 = C13746i.m55722a(this.f15950a.getContext());
        if (!this.f15958j) {
            a -= a2;
        }
        this.f15961m.f14501a = C13749l.m55749b(a2);
        if (this.f15958j) {
            i = this.f15961m.f14502b + this.f15961m.f14501a;
        } else {
            i = this.f15961m.f14502b;
        }
        this.f15961m.f14503c = ((float) C13749l.m55749b(a)) / ((float) i);
    }

    /* renamed from: k */
    private void m22872k() {
        float f;
        if (this.f15951b.getHeight() == 0) {
            this.f15961m.f14504d = f15949c.getLower().floatValue();
            return;
        }
        int[] iArr = new int[2];
        this.f15951b.getLocationOnScreen(iArr);
        int a = iArr[1] + C13749l.m55738a(50);
        int a2 = C13746i.m55722a(this.f15951b.getContext());
        if (!this.f15958j) {
            a -= a2;
        }
        this.f15961m.f14501a = C13749l.m55749b(a2);
        if (this.f15958j) {
            f = (float) (this.f15961m.f14501a + 50);
        } else {
            f = 50.0f;
        }
        int b = C13749l.m55749b(a);
        if (b <= 0) {
            b = 0;
        }
        this.f15961m.f14504d = ((float) b) / f;
    }

    /* renamed from: l */
    private void m22874l() {
        C4940b bVar = this.f15961m;
        bVar.f14503c = f15949c.clamp(Float.valueOf(bVar.f14503c)).floatValue();
        if (!this.f15961m.equals(this.f15962n)) {
            this.f15962n = new C4940b(this.f15961m);
            for (TitleBar.AbstractC4938a aVar : this.f15959k) {
                aVar.onTitleBarStateChanged(this.f15961m);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo22570e() {
        this.f15950a = this.f15952d.mo22577b();
        m22869i();
        LifecycleOwner c = this.f15952d.mo22578c();
        this.f15953e.getTitleInfo().mo5923a(c, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.$$Lambda$ag$i8D3FeTKaE6TCUQn8P8RdmY9Ms */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C5632ag.m269220lambda$i8D3FeTKaE6TCUQn8P8RdmY9Ms(C5632ag.this, (NavigationTitle) obj);
            }
        });
        LiveData<CharSequence> title = this.f15953e.getTitle();
        CustomTitleView customTitleView = this.f15956h;
        customTitleView.getClass();
        title.mo5923a(c, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.$$Lambda$cvMBlJv4zFtnmv_hm2r_VgOwqTo */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                CustomTitleView.this.setTitle((CharSequence) obj);
            }
        });
        this.f15953e.getShowingIconInfo().mo5923a(c, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.$$Lambda$ag$e8hdyI4phLEzEUA95W0ba6XPmk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C5632ag.m269219lambda$e8hdyI4phLEzEUA95W0ba6XPmk(C5632ag.this, (IconInfo) obj);
            }
        });
        this.f15953e.isExternalUser().mo5923a(c, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.$$Lambda$ag$kMomGbjZ10IGlB4DhryMylSEAE */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C5632ag.m269221lambda$kMomGbjZ10IGlB4DhryMylSEAE(C5632ag.this, (Boolean) obj);
            }
        });
    }

    /* renamed from: i */
    private void m22869i() {
        this.f15955g = Math.round(this.f15950a.getResources().getDimension(R.dimen.doc_titlebar_height));
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f15950a.findViewById(R.id.doc_main_title);
        this.f15951b = baseTitleBar;
        View customTitleView = baseTitleBar.getCustomTitleView();
        if (customTitleView instanceof CustomTitleView) {
            this.f15956h = (CustomTitleView) customTitleView;
        } else {
            CustomTitleView a = C5686d.m23057a(this.f15951b.getContext());
            this.f15956h = a;
            this.f15951b.setCustomTitleView(a);
        }
        this.f15951b.getLayoutParams().height = this.f15955g;
        this.f15951b.requestLayout();
        this.f15951b.setVisibility(0);
        this.f15951b.setDividerVisible(false);
        this.f15951b.setTitle("");
        this.f15951b.mo45073a();
        this.f15951b.mo45074a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6.0f, BitmapDescriptorFactory.HUE_RED);
        this.f15951b.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.document.$$Lambda$ag$RuI8ZXvf2oB2qp46lpNKDfdqPmg */

            public final void onClick(View view) {
                C5632ag.lambda$RuI8ZXvf2oB2qp46lpNKDfdqPmg(C5632ag.this, view);
            }
        });
        this.f15951b.setSupportAutoRemoveBadgePoint(true);
        this.f15951b.setOnTouchListener(new View.OnTouchListener(new GestureDetector(this.f15951b.getContext(), new GestureDetector.SimpleOnGestureListener() {
            /* class com.bytedance.ee.bear.document.C5632ag.C56353 */

            public boolean onDoubleTap(MotionEvent motionEvent) {
                C5632ag.this.mo22571f();
                return super.onDoubleTap(motionEvent);
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (C13616d.m55262a(C5632ag.this.f15951b.getContext())) {
                    ((RnManager) KoinJavaComponent.m268610a(RnManager.class)).mo40260c();
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        }, new Handler(Looper.getMainLooper()))) {
            /* class com.bytedance.ee.bear.document.$$Lambda$ag$ld2QaPiY9xao0C24YhG_jtFqkws */
            public final /* synthetic */ GestureDetector f$0;

            {
                this.f$0 = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C5632ag.lambda$ld2QaPiY9xao0C24YhG_jtFqkws(this.f$0, view, motionEvent);
            }
        });
        final $$Lambda$ag$8HDWvxU5NCurH81cC7LyBX1ByBk r0 = new View.OnLayoutChangeListener() {
            /* class com.bytedance.ee.bear.document.$$Lambda$ag$8HDWvxU5NCurH81cC7LyBX1ByBk */

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C5632ag.lambda$8HDWvxU5NCurH81cC7LyBX1ByBk(C5632ag.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.f15950a.addOnLayoutChangeListener(r0);
        final $$Lambda$ag$tzhdmV3Iab2yxNXcgB9Tu7Ke00o r1 = new ViewTreeObserver.OnPreDrawListener() {
            /* class com.bytedance.ee.bear.document.$$Lambda$ag$tzhdmV3Iab2yxNXcgB9Tu7Ke00o */

            public final boolean onPreDraw() {
                return C5632ag.lambda$tzhdmV3Iab2yxNXcgB9Tu7Ke00o(C5632ag.this);
            }
        };
        this.f15950a.getViewTreeObserver().addOnPreDrawListener(r1);
        this.f15950a.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.bytedance.ee.bear.document.C5632ag.View$OnAttachStateChangeListenerC56364 */

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                C5632ag.this.f15950a.removeOnLayoutChangeListener(r0);
                C5632ag.this.f15950a.getViewTreeObserver().removeOnPreDrawListener(r1);
                C5632ag.this.f15950a.removeOnAttachStateChangeListener(this);
            }
        });
        this.f15951b.mo45087c();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public boolean mo19520b() {
        return this.f15951b.getLeftIconVisibility();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: g */
    public void mo19527g(boolean z) {
        this.f15963o = z;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public void mo19516b(int i) {
        this.f15951b.setActionIconTint(i);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: f */
    public void mo19526f(boolean z) {
        this.f15956h.setExternalTagEnabled(z);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: h */
    public void mo19528h(boolean z) {
        this.f15951b.setRightVisible(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22862a(Throwable th) throws Exception {
        C13479a.m54759a("SimpleTitleBar", "showExternalTag", th);
        this.f15956h.setExternalVisible(false);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public void mo19517b(TitleBar.AbstractC4938a aVar) {
        this.f15959k.remove(aVar);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: e */
    public void mo19525e(boolean z) {
        this.f15951b.setLeftIconVisibility(z);
        this.f15951b.mo45087c();
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: i */
    public void mo19529i(boolean z) {
        float f;
        BaseTitleBar baseTitleBar = this.f15951b;
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = 1.0f;
        }
        baseTitleBar.setAlpha(f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22854a(ValueAnimator valueAnimator) {
        this.f15951b.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f15951b.requestLayout();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m22866b(Boolean bool) {
        if (!this.f15953e.allowCustomTitle()) {
            bool = false;
        }
        m22861a(bool);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22855a(View view) {
        if (C13726a.m55676b(this.f15952d.mo22579d())) {
            this.f15952d.mo22579d().onBackPressed();
        }
    }

    /* renamed from: j */
    private void m22871j(boolean z) {
        int i;
        m22867g();
        if (z) {
            i = this.f15955g;
        } else {
            i = 0;
        }
        ValueAnimator ofInt = ObjectAnimator.ofInt(this.f15951b.getHeight(), i);
        this.f15954f = ofInt;
        ofInt.setDuration(200L);
        this.f15954f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.bytedance.ee.bear.document.$$Lambda$ag$AUOsghd9Y29EhS7nq7iBNauVfNo */

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5632ag.lambda$AUOsghd9Y29EhS7nq7iBNauVfNo(C5632ag.this, valueAnimator);
            }
        });
        this.f15954f.start();
    }

    /* renamed from: k */
    private void m22873k(boolean z) {
        int i;
        m22867g();
        if (z) {
            i = this.f15955g;
        } else {
            i = 0;
        }
        this.f15951b.getLayoutParams().height = i;
        this.f15951b.requestLayout();
        C5686d.m23058a(this.f15952d.mo22579d(), this.f15952d.mo22576a(), z);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public void mo19518b(CharSequence charSequence) {
        if (charSequence != null) {
            this.f15951b.setSubTitle(charSequence.toString());
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: d */
    public void mo19524d(boolean z) {
        if (!this.f15963o) {
            C13479a.m54764b("SimpleTitleBar", "hide animation:" + z);
            this.f15960l = false;
            if (z) {
                m22871j(false);
            } else {
                m22873k(false);
            }
            m22870j();
            m22874l();
        }
    }

    /* renamed from: b */
    private ColorStateList m22865b(List<String> list) {
        if (list == null || list.size() != 4) {
            return null;
        }
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[]{16842913}, new int[0]}, new int[]{Color.parseColor(list.get(1)), Color.parseColor(list.get(2)), Color.parseColor(list.get(3)), Color.parseColor(list.get(0))});
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: c */
    public void mo19522c(boolean z) {
        C13479a.m54764b("SimpleTitleBar", "show animation:" + z);
        this.f15960l = true;
        if (z) {
            m22871j(true);
        } else {
            m22873k(true);
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.TitleBar
    /* renamed from: b */
    public void mo19519b(boolean z) {
        this.f15951b.setDividerVisible(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22858a(AccountService.Account account) throws Exception {
        boolean z;
        CustomTitleView customTitleView = this.f15956h;
        if (account == null || account.mo19681c()) {
            z = false;
        } else {
            z = true;
        }
        customTitleView.setExternalVisible(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22859a(IconInfo iconInfo) {
        ImageView iconView = this.f15956h.getIconView();
        if (!IconInfo.isEmpty(iconInfo)) {
            ((AbstractC7588a) KoinJavaComponent.m268610a(AbstractC7588a.class)).mo29857a(iconInfo.getKey(), iconInfo.getFs_unit(), iconView);
            if (this.f15956h.getTitleVisible()) {
                iconView.setVisibility(0);
            } else {
                iconView.setVisibility(8);
            }
        } else {
            iconView.setImageDrawable(null);
            iconView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m22860a(NavigationTitle navigationTitle) {
        if (navigationTitle == null) {
            C13479a.m54775e("SimpleTitleBar", "update failed, title is null");
            return;
        }
        int displayTitleType = navigationTitle.getDisplayTitleType();
        if (displayTitleType == 1) {
            this.f15956h.setTitle(navigationTitle.getTitle());
            this.f15956h.setTitleTextSize(R.dimen.doc_title_bar_text_size);
            this.f15956h.setTitleTextColor(R.color.text_title);
            this.f15956h.setTitleTextBold(true);
        } else if (displayTitleType != 2) {
            this.f15956h.setTitle(navigationTitle.getTitle());
            this.f15956h.setTitleTextSize(R.dimen.doc_title_bar_text_size);
            this.f15956h.setTitleTextColor(R.color.text_title);
            this.f15956h.setTitleTextBold(true);
        } else {
            this.f15956h.setTitle(navigationTitle.getSubTitle());
            this.f15956h.setTitleTextSize(R.dimen.doc_sub_title_bar_text_size);
            this.f15956h.setTitleTextColor(R.color.text_caption);
            this.f15956h.setTitleTextBold(false);
        }
    }

    public C5632ag(AbstractC5638a aVar, DocumentMetadata qVar) {
        this.f15952d = aVar;
        this.f15953e = qVar;
        mo22570e();
    }

    /* renamed from: a */
    private void m22857a(final MenuItem menuItem, TitleBar.MenuType menuType) {
        CharSequence charSequence;
        BaseTitleBar.C11801b bVar;
        if (menuItem.getText() == null) {
            charSequence = menuItem.getSpannableText();
        } else {
            charSequence = menuItem.getText();
        }
        if (menuItem.getIcon() != null) {
            bVar = new BaseTitleBar.C11803d(menuItem.getIcon()) {
                /* class com.bytedance.ee.bear.document.C5632ag.C56331 */

                @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
                /* renamed from: a */
                public void mo16854a(View view) {
                    super.mo16854a(view);
                    menuItem.onClick(view);
                }
            };
        } else if (!TextUtils.isEmpty(charSequence)) {
            bVar = new BaseTitleBar.C11804e(charSequence, m22865b(menuItem.getCustomColor())) {
                /* class com.bytedance.ee.bear.document.C5632ag.C56342 */

                @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
                /* renamed from: a */
                public void mo16854a(View view) {
                    super.mo16854a(view);
                    menuItem.onClick(view);
                }
            };
        } else {
            bVar = null;
        }
        if (bVar == null) {
            C13479a.m54758a("SimpleTitleBar", "Bad menu:" + menuItem);
            return;
        }
        bVar.mo45147a(menuItem.getId());
        bVar.mo45148a(menuItem.isEnable());
        bVar.mo45146a(menuItem.getBadgeStyle());
        bVar.mo45145a(menuItem.getBadgeNum());
        if ("MESSAGE".equals(menuItem.getId())) {
            C13479a.m54764b("SimpleTitleBar", "badgeNum = " + menuItem.getBadgeNum());
        }
        if (menuType == TitleBar.MenuType.Left) {
            this.f15951b.mo45083b(bVar);
        } else {
            this.f15951b.mo45070a(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m22856a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        if (this.f15960l) {
            ValueAnimator valueAnimator = this.f15954f;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (i9 = i4 - i2) >= m22868h()) {
                this.f15961m.f14502b = C13749l.m55749b(i9);
            }
        }
    }
}

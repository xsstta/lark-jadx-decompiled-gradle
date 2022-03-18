package com.bytedance.ee.bear.bizwidget.banner.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bizwidget.banner.config.C4873a;
import com.bytedance.ee.bear.bizwidget.banner.config.IndicatorConfig;
import com.bytedance.ee.bear.bizwidget.banner.indicator.AbstractC4874a;
import com.bytedance.ee.bear.bizwidget.banner.p272a.AbstractC4866a;
import com.bytedance.ee.bear.bizwidget.banner.util.AbstractC4876a;
import com.bytedance.ee.bear.bizwidget.banner.util.BannerLifecycleObserverAdapter;
import com.bytedance.ee.bear.bizwidget.banner.util.C4877b;
import com.bytedance.ee.bear.bizwidget.banner.util.ScrollSpeedManger;
import com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager;
import com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.CompositePageTransformer;
import com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Objects;

public class Banner<T, BA extends AbstractC4866a> extends FrameLayout implements AbstractC4876a {

    /* renamed from: A */
    private int f14284A;

    /* renamed from: B */
    private float f14285B;

    /* renamed from: C */
    private float f14286C;

    /* renamed from: D */
    private boolean f14287D;

    /* renamed from: E */
    private boolean f14288E;

    /* renamed from: F */
    private Paint f14289F;

    /* renamed from: G */
    private Paint f14290G;

    /* renamed from: H */
    private RecyclerView.AdapterDataObserver f14291H;

    /* renamed from: a */
    public RunnableC4869a f14292a;

    /* renamed from: b */
    public FixPageTransformerViewPager.AbstractC11859d f14293b;

    /* renamed from: c */
    public AbstractC4874a f14294c;

    /* renamed from: d */
    public boolean f14295d;

    /* renamed from: e */
    public boolean f14296e;

    /* renamed from: f */
    public long f14297f;

    /* renamed from: g */
    private ViewPager2 f14298g;

    /* renamed from: h */
    private BA f14299h;

    /* renamed from: i */
    private CompositePageTransformer f14300i;

    /* renamed from: j */
    private Banner<T, BA>.C4870b f14301j;

    /* renamed from: k */
    private int f14302k;

    /* renamed from: l */
    private int f14303l;

    /* renamed from: m */
    private float f14304m;

    /* renamed from: n */
    private int f14305n;

    /* renamed from: o */
    private int f14306o;

    /* renamed from: p */
    private int f14307p;

    /* renamed from: q */
    private int f14308q;

    /* renamed from: r */
    private int f14309r;

    /* renamed from: s */
    private int f14310s;

    /* renamed from: t */
    private int f14311t;

    /* renamed from: u */
    private int f14312u;

    /* renamed from: v */
    private int f14313v;

    /* renamed from: w */
    private int f14314w;

    /* renamed from: x */
    private int f14315x;

    /* renamed from: y */
    private int f14316y;

    /* renamed from: z */
    private int f14317z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public BA getAdapter() {
        return this.f14299h;
    }

    public AbstractC4874a getIndicator() {
        return this.f14294c;
    }

    public int getScrollTime() {
        return this.f14302k;
    }

    public ViewPager2 getViewPager2() {
        return this.f14298g;
    }

    /* renamed from: a */
    public boolean mo19057a() {
        return this.f14295d;
    }

    /* renamed from: a */
    public Banner mo19056a(boolean z) {
        this.f14296e = z;
        return this;
    }

    /* renamed from: a */
    public Banner mo19054a(AbstractC4874a aVar) {
        return mo19055a(aVar, true);
    }

    /* renamed from: a */
    public Banner mo19055a(AbstractC4874a aVar, boolean z) {
        mo19061c();
        aVar.getIndicatorConfig().mo19097a(z);
        this.f14294c = aVar;
        m20048h();
        return this;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo19064d();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo19069e();
    }

    /* renamed from: c */
    public Banner mo19061c() {
        AbstractC4874a aVar = this.f14294c;
        if (aVar != null) {
            removeView(aVar.getIndicatorView());
        }
        return this;
    }

    /* renamed from: d */
    public Banner mo19064d() {
        if (this.f14296e) {
            mo19069e();
            postDelayed(this.f14292a, this.f14297f);
        }
        return this;
    }

    /* renamed from: e */
    public Banner mo19069e() {
        if (this.f14296e) {
            removeCallbacks(this.f14292a);
        }
        return this;
    }

    public int getCurrentItem() {
        return getViewPager2().getCurrentItem();
    }

    public int getRealCount() {
        return getAdapter().mo19042a();
    }

    /* renamed from: i */
    private void m20049i() {
        if (!mo19057a()) {
            mo19056a(false);
        }
        mo19059b(mo19057a() ? 1 : 0);
    }

    /* renamed from: b */
    public Banner mo19058b() {
        if (this.f14294c != null) {
            this.f14294c.mo19118a(getRealCount(), C4877b.m20113a(mo19057a(), getCurrentItem(), getRealCount()));
        }
        return this;
    }

    /* renamed from: f */
    public void mo19072f() {
        if (!(getViewPager2() == null || this.f14301j == null)) {
            getViewPager2().unregisterOnPageChangeCallback(this.f14301j);
            this.f14301j = null;
        }
        mo19069e();
    }

    public IndicatorConfig getIndicatorConfig() {
        if (getIndicator() != null) {
            return getIndicator().getIndicatorConfig();
        }
        return null;
    }

    public int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getItemCount();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bizwidget.banner.banner.Banner$a */
    public static class RunnableC4869a implements Runnable {

        /* renamed from: a */
        private final WeakReference<Banner> f14319a;

        public void run() {
            int itemCount;
            Banner banner = this.f14319a.get();
            if (banner != null && banner.f14296e && (itemCount = banner.getItemCount()) != 0) {
                banner.mo19048a((banner.getCurrentItem() + 1) % itemCount);
                banner.postDelayed(banner.f14292a, banner.f14297f);
            }
        }

        RunnableC4869a(Banner banner) {
            this.f14319a = new WeakReference<>(banner);
        }
    }

    /* renamed from: h */
    private void m20048h() {
        if (this.f14294c != null && getAdapter() != null) {
            if (this.f14294c.getIndicatorConfig().mo19115j()) {
                mo19061c();
                addView(this.f14294c.getIndicatorView());
            }
            m20047g();
            mo19058b();
        }
    }

    /* renamed from: g */
    private void m20047g() {
        int i = this.f14311t;
        if (i != 0) {
            mo19053a(new IndicatorConfig.C4872a(i));
        } else {
            int i2 = this.f14312u;
            if (!(i2 == 0 && this.f14313v == 0 && this.f14314w == 0 && this.f14315x == 0)) {
                mo19053a(new IndicatorConfig.C4872a(i2, this.f14313v, this.f14314w, this.f14315x));
            }
        }
        int i3 = this.f14310s;
        if (i3 > 0) {
            mo19073g(i3);
        }
        int i4 = this.f14309r;
        if (i4 != 1) {
            mo19071f(i4);
        }
        int i5 = this.f14305n;
        if (i5 > 0) {
            mo19082h(i5);
        }
        int i6 = this.f14306o;
        if (i6 > 0) {
            mo19083i(i6);
        }
        int i7 = this.f14316y;
        if (i7 > 0) {
            mo19085k(i7);
        }
        int i8 = this.f14317z;
        if (i8 > 0) {
            mo19084j(i8);
        }
        mo19070e(this.f14307p);
        mo19065d(this.f14308q);
    }

    private void setRecyclerViewPadding(int i) {
        m20040a(i, i);
    }

    /* renamed from: a */
    public Banner mo19050a(long j) {
        this.f14297f = j;
        return this;
    }

    /* renamed from: b */
    public Banner mo19059b(int i) {
        this.f14303l = i;
        return this;
    }

    @Override // com.bytedance.ee.bear.bizwidget.banner.util.AbstractC4876a
    /* renamed from: c */
    public void mo19063c(LifecycleOwner lifecycleOwner) {
        mo19069e();
    }

    @Override // com.bytedance.ee.bear.bizwidget.banner.util.AbstractC4876a
    /* renamed from: d */
    public void mo19066d(LifecycleOwner lifecycleOwner) {
        mo19072f();
    }

    public Banner(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public Banner mo19048a(int i) {
        return mo19049a(i, true);
    }

    @Override // com.bytedance.ee.bear.bizwidget.banner.util.AbstractC4876a
    /* renamed from: b */
    public void mo19060b(LifecycleOwner lifecycleOwner) {
        mo19064d();
    }

    /* renamed from: c */
    public Banner mo19062c(int i) {
        getViewPager2().setOrientation(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.bizwidget.banner.banner.Banner$b */
    public class C4870b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: b */
        private int f14321b = -1;

        /* renamed from: c */
        private boolean f14322c;

        C4870b() {
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            if (this.f14322c) {
                this.f14321b = i;
                int a = C4877b.m20113a(Banner.this.mo19057a(), i, Banner.this.getRealCount());
                if (Banner.this.f14293b != null) {
                    Banner.this.f14293b.mo18470a(a);
                }
                if (Banner.this.f14294c != null) {
                    Banner.this.f14294c.mo18470a(a);
                }
            }
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            if (i == 1 || i == 2) {
                this.f14322c = true;
            } else if (i == 0) {
                this.f14322c = false;
                if (this.f14321b != -1 && Banner.this.f14295d) {
                    int i2 = this.f14321b;
                    if (i2 == 0) {
                        Banner banner = Banner.this;
                        banner.mo19049a(banner.getRealCount(), false);
                    } else if (i2 == Banner.this.getItemCount() - 1) {
                        Banner.this.mo19049a(1, false);
                    }
                }
            }
            if (Banner.this.f14293b != null) {
                Banner.this.f14293b.mo18472b(i);
            }
            if (Banner.this.f14294c != null) {
                Banner.this.f14294c.mo18472b(i);
            }
        }

        @Override // com.bytedance.ee.bear.widgets.viewpager.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            int a = C4877b.m20113a(Banner.this.mo19057a(), i, Banner.this.getRealCount());
            if (Banner.this.f14293b != null) {
                Banner.this.f14293b.mo18471a(a, f, i2);
            }
            if (Banner.this.f14294c != null) {
                Banner.this.f14294c.mo18471a(a, f, i2);
            }
        }
    }

    /* renamed from: g */
    public Banner mo19073g(int i) {
        AbstractC4874a aVar = this.f14294c;
        if (aVar != null) {
            aVar.getIndicatorConfig().mo19103d(i);
        }
        return this;
    }

    /* renamed from: h */
    public Banner mo19082h(int i) {
        AbstractC4874a aVar = this.f14294c;
        if (aVar != null) {
            aVar.getIndicatorConfig().mo19107f(i);
        }
        return this;
    }

    /* renamed from: i */
    public Banner mo19083i(int i) {
        AbstractC4874a aVar = this.f14294c;
        if (aVar != null) {
            aVar.getIndicatorConfig().mo19109g(i);
        }
        return this;
    }

    /* renamed from: j */
    public Banner<T, BA> mo19084j(int i) {
        AbstractC4874a aVar = this.f14294c;
        if (aVar != null) {
            aVar.getIndicatorConfig().mo19113i(i);
        }
        return this;
    }

    /* renamed from: k */
    public Banner<T, BA> mo19085k(int i) {
        AbstractC4874a aVar = this.f14294c;
        if (aVar != null) {
            aVar.getIndicatorConfig().mo19114j(i);
        }
        return this;
    }

    /* renamed from: a */
    public Banner mo19051a(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(new BannerLifecycleObserverAdapter(lifecycleOwner, this));
        }
        return this;
    }

    /* renamed from: d */
    public Banner mo19065d(int i) {
        AbstractC4874a aVar = this.f14294c;
        if (aVar != null) {
            aVar.getIndicatorConfig().mo19101c(i);
        }
        return this;
    }

    /* renamed from: e */
    public Banner mo19070e(int i) {
        AbstractC4874a aVar = this.f14294c;
        if (aVar != null) {
            aVar.getIndicatorConfig().mo19099b(i);
        }
        return this;
    }

    /* renamed from: b */
    private void m20044b(Canvas canvas) {
        int width = getWidth();
        Path path = new Path();
        float f = (float) width;
        path.moveTo(f - this.f14304m, BitmapDescriptorFactory.HUE_RED);
        path.lineTo(f, BitmapDescriptorFactory.HUE_RED);
        path.lineTo(f, this.f14304m);
        float f2 = this.f14304m;
        path.arcTo(new RectF(f - (f2 * 2.0f), BitmapDescriptorFactory.HUE_RED, f, f2 * 2.0f), BitmapDescriptorFactory.HUE_RED, -90.0f);
        path.close();
        canvas.drawPath(path, this.f14289F);
    }

    /* renamed from: c */
    private void m20045c(Canvas canvas) {
        int height = getHeight();
        Path path = new Path();
        float f = (float) height;
        path.moveTo(BitmapDescriptorFactory.HUE_RED, f - this.f14304m);
        path.lineTo(BitmapDescriptorFactory.HUE_RED, f);
        path.lineTo(this.f14304m, f);
        float f2 = this.f14304m;
        path.arcTo(new RectF(BitmapDescriptorFactory.HUE_RED, f - (f2 * 2.0f), f2 * 2.0f, f), 90.0f, 90.0f);
        path.close();
        canvas.drawPath(path, this.f14289F);
    }

    /* renamed from: d */
    private void m20046d(Canvas canvas) {
        int height = getHeight();
        int width = getWidth();
        Path path = new Path();
        float f = (float) width;
        float f2 = (float) height;
        path.moveTo(f - this.f14304m, f2);
        path.lineTo(f, f2);
        path.lineTo(f, f2 - this.f14304m);
        float f3 = this.f14304m;
        path.arcTo(new RectF(f - (f3 * 2.0f), f2 - (f3 * 2.0f), f, f2), BitmapDescriptorFactory.HUE_RED, 90.0f);
        path.close();
        canvas.drawPath(path, this.f14289F);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f14304m > BitmapDescriptorFactory.HUE_RED) {
            canvas.saveLayer(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) canvas.getWidth(), (float) canvas.getHeight()), this.f14290G, 31);
            super.dispatchDraw(canvas);
            m20043a(canvas);
            m20044b(canvas);
            m20045c(canvas);
            m20046d(canvas);
            canvas.restore();
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!getViewPager2().isUserInputEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3 || actionMasked == 4) {
            mo19064d();
        } else if (actionMasked == 0) {
            mo19069e();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: f */
    public Banner mo19071f(int i) {
        AbstractC4874a aVar = this.f14294c;
        if (aVar != null && aVar.getIndicatorConfig().mo19115j()) {
            this.f14294c.getIndicatorConfig().mo19111h(i);
            this.f14294c.getIndicatorView().postInvalidate();
        }
        return this;
    }

    /* renamed from: a */
    private void m20041a(Context context) {
        this.f14284A = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.f14300i = new CompositePageTransformer();
        this.f14301j = new C4870b();
        this.f14292a = new RunnableC4869a(this);
        ViewPager2 viewPager2 = new ViewPager2(context);
        this.f14298g = viewPager2;
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f14298g.setOffscreenPageLimit(1);
        this.f14298g.registerOnPageChangeCallback(this.f14301j);
        this.f14298g.setPageTransformer(this.f14300i);
        ScrollSpeedManger.m20108a(this);
        addView(this.f14298g);
        Paint paint = new Paint();
        this.f14289F = paint;
        paint.setColor(-1);
        this.f14289F.setAntiAlias(true);
        this.f14289F.setStyle(Paint.Style.FILL);
        this.f14289F.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.f14290G = paint2;
        paint2.setXfermode(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 != 3) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.bizwidget.banner.banner.Banner.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    private void m20043a(Canvas canvas) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, this.f14304m);
        path.lineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.lineTo(this.f14304m, BitmapDescriptorFactory.HUE_RED);
        float f = this.f14304m;
        path.arcTo(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f * 2.0f, f * 2.0f), -90.0f, -90.0f);
        path.close();
        canvas.drawPath(path, this.f14289F);
    }

    /* renamed from: a */
    public Banner mo19052a(BA ba) {
        Objects.requireNonNull(ba, "");
        this.f14299h = ba;
        if (!mo19057a()) {
            this.f14299h.mo19045b(0);
        }
        this.f14299h.registerAdapterDataObserver(this.f14291H);
        this.f14298g.setAdapter(ba);
        mo19049a(this.f14303l, false);
        m20048h();
        return this;
    }

    /* renamed from: a */
    public Banner mo19053a(IndicatorConfig.C4872a aVar) {
        AbstractC4874a aVar2 = this.f14294c;
        if (aVar2 != null && aVar2.getIndicatorConfig().mo19115j()) {
            this.f14294c.getIndicatorConfig().mo19096a(aVar);
            this.f14294c.getIndicatorView().requestLayout();
        }
        return this;
    }

    public Banner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public Banner mo19049a(int i, boolean z) {
        getViewPager2().setCurrentItem(i, z);
        return this;
    }

    /* renamed from: a */
    private void m20040a(int i, int i2) {
        RecyclerView recyclerView = (RecyclerView) getViewPager2().getChildAt(0);
        if (getViewPager2().getOrientation() == 1) {
            recyclerView.setPadding(0, i, 0, i2);
        } else {
            recyclerView.setPadding(i, 0, i2, 0);
        }
        recyclerView.setClipToPadding(false);
    }

    /* renamed from: a */
    private void m20042a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.banner_auto_loop, R.attr.banner_indicator_gravity, R.attr.banner_indicator_height, R.attr.banner_indicator_margin, R.attr.banner_indicator_marginBottom, R.attr.banner_indicator_marginLeft, R.attr.banner_indicator_marginRight, R.attr.banner_indicator_marginTop, R.attr.banner_indicator_normal_color, R.attr.banner_indicator_normal_width, R.attr.banner_indicator_radius, R.attr.banner_indicator_selected_color, R.attr.banner_indicator_selected_width, R.attr.banner_indicator_space, R.attr.banner_infinite_loop, R.attr.banner_loop_time, R.attr.banner_orientation, R.attr.banner_radius});
            this.f14304m = (float) obtainStyledAttributes.getDimensionPixelSize(17, 0);
            this.f14297f = (long) obtainStyledAttributes.getInt(15, 3000);
            this.f14296e = obtainStyledAttributes.getBoolean(0, true);
            this.f14295d = obtainStyledAttributes.getBoolean(14, true);
            this.f14305n = obtainStyledAttributes.getDimensionPixelSize(9, C4873a.f14339a);
            this.f14306o = obtainStyledAttributes.getDimensionPixelSize(12, C4873a.f14340b);
            this.f14307p = obtainStyledAttributes.getColor(8, -1996488705);
            this.f14308q = obtainStyledAttributes.getColor(11, -1);
            this.f14309r = obtainStyledAttributes.getInt(1, 1);
            this.f14310s = obtainStyledAttributes.getDimensionPixelSize(13, 0);
            this.f14311t = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f14312u = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f14313v = obtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.f14314w = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.f14315x = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f14316y = obtainStyledAttributes.getDimensionPixelSize(2, C4873a.f14343e);
            this.f14317z = obtainStyledAttributes.getDimensionPixelSize(10, C4873a.f14344f);
            mo19062c(obtainStyledAttributes.getInt(16, 0));
            m20049i();
            obtainStyledAttributes.recycle();
        }
    }

    public Banner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14295d = true;
        this.f14296e = true;
        this.f14297f = 3000;
        this.f14302k = 600;
        this.f14303l = 1;
        this.f14305n = C4873a.f14339a;
        this.f14306o = C4873a.f14340b;
        this.f14307p = -1996488705;
        this.f14308q = -1;
        this.f14309r = 1;
        this.f14316y = C4873a.f14343e;
        this.f14317z = C4873a.f14344f;
        this.f14288E = true;
        this.f14291H = new RecyclerView.AdapterDataObserver() {
            /* class com.bytedance.ee.bear.bizwidget.banner.banner.Banner.C48681 */

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                if (Banner.this.getItemCount() <= 1) {
                    Banner.this.mo19069e();
                } else {
                    Banner.this.mo19064d();
                }
                Banner.this.mo19058b();
            }
        };
        m20041a(context);
        m20042a(context, attributeSet);
    }
}

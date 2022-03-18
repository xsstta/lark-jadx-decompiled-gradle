package com.bytedance.ee.bear.widgets.viewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.ContextCompat;
import androidx.core.view.AbstractC0912n;
import androidx.core.view.C0859a;
import androidx.core.view.C0883ab;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.customview.view.AbsSavedState;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FixPageTransformerViewPager extends ViewGroup {

    /* renamed from: a */
    static final int[] f32035a = {16842931};

    /* renamed from: ai  reason: collision with root package name */
    private static final C11862g f175423ai = new C11862g();

    /* renamed from: e */
    private static final Comparator<C11856a> f32036e = $$Lambda$FixPageTransformerViewPager$6DiVbK8CrSIJNE7aorXdv0FGwEI.INSTANCE;

    /* renamed from: f */
    private static final Interpolator f32037f = $$Lambda$FixPageTransformerViewPager$uu4PIb9aQbClR0O4hphoTJVgz7w.INSTANCE;

    /* renamed from: A */
    private int f32038A = 1;

    /* renamed from: B */
    private boolean f32039B;

    /* renamed from: C */
    private boolean f32040C;

    /* renamed from: D */
    private int f32041D;

    /* renamed from: E */
    private int f32042E;

    /* renamed from: F */
    private int f32043F;

    /* renamed from: G */
    private float f32044G;

    /* renamed from: H */
    private float f32045H;

    /* renamed from: I */
    private float f32046I;

    /* renamed from: J */
    private float f32047J;

    /* renamed from: K */
    private int f32048K = -1;

    /* renamed from: L */
    private VelocityTracker f32049L;

    /* renamed from: M */
    private int f32050M;

    /* renamed from: N */
    private int f32051N;

    /* renamed from: O */
    private int f32052O;

    /* renamed from: P */
    private int f32053P;

    /* renamed from: Q */
    private boolean f32054Q;

    /* renamed from: R */
    private EdgeEffect f32055R;

    /* renamed from: S */
    private EdgeEffect f32056S;

    /* renamed from: T */
    private boolean f32057T = true;

    /* renamed from: U */
    private boolean f32058U = false;

    /* renamed from: V */
    private boolean f32059V;

    /* renamed from: W */
    private int f32060W;
    private List<AbstractC11859d> aa;
    private AbstractC11859d ab;
    private AbstractC11859d ac;
    private List<AbstractC11858c> ad;
    private AbstractC11860e ae;
    private int af;
    private int ag;
    private ArrayList<View> ah;
    private final Runnable aj = new Runnable() {
        /* class com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.RunnableC118531 */

        public void run() {
            FixPageTransformerViewPager.this.setScrollState(0);
            FixPageTransformerViewPager.this.mo45511c();
        }
    };
    private int ak = 0;
    private boolean al = false;

    /* renamed from: b */
    AbstractC11869b f32061b;

    /* renamed from: c */
    int f32062c;

    /* renamed from: d */
    private int f32063d;

    /* renamed from: g */
    private final ArrayList<C11856a> f32064g = new ArrayList<>();

    /* renamed from: h */
    private final C11856a f32065h = new C11856a();

    /* renamed from: i */
    private final Rect f32066i = new Rect();

    /* renamed from: j */
    private int f32067j = -1;

    /* renamed from: k */
    private Parcelable f32068k = null;

    /* renamed from: l */
    private ClassLoader f32069l = null;

    /* renamed from: m */
    private Scroller f32070m;

    /* renamed from: n */
    private boolean f32071n;

    /* renamed from: o */
    private C11861f f32072o;

    /* renamed from: p */
    private int f32073p;

    /* renamed from: q */
    private Drawable f32074q;

    /* renamed from: r */
    private int f32075r;

    /* renamed from: s */
    private int f32076s;

    /* renamed from: t */
    private float f32077t = -3.4028235E38f;

    /* renamed from: u */
    private float f32078u = Float.MAX_VALUE;

    /* renamed from: v */
    private int f32079v;

    /* renamed from: w */
    private int f32080w;

    /* renamed from: x */
    private boolean f32081x;

    /* renamed from: y */
    private boolean f32082y;

    /* renamed from: z */
    private boolean f32083z;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    /* renamed from: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager$c */
    public interface AbstractC11858c {
        /* renamed from: a */
        void mo45558a(FixPageTransformerViewPager fixPageTransformerViewPager, AbstractC11869b bVar, AbstractC11869b bVar2);
    }

    /* renamed from: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager$d */
    public interface AbstractC11859d {
        /* renamed from: a */
        void mo18470a(int i);

        /* renamed from: a */
        void mo18471a(int i, float f, int i2);

        /* renamed from: b */
        void mo18472b(int i);
    }

    /* renamed from: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager$e */
    public interface AbstractC11860e {
        /* renamed from: a */
        void mo18484a(View view, float f);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ float m49238c(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager$a */
    public static class C11856a {

        /* renamed from: a */
        Object f32096a;

        /* renamed from: b */
        int f32097b;

        /* renamed from: c */
        boolean f32098c;

        /* renamed from: d */
        float f32099d;

        /* renamed from: e */
        float f32100e;

        C11856a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager$g */
    public static class C11862g implements Comparator<View> {
        C11862g() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f32087a == layoutParams2.f32087a) {
                return layoutParams.f32091e - layoutParams2.f32091e;
            }
            if (layoutParams.f32087a) {
                return 1;
            }
            return -1;
        }
    }

    public AbstractC11869b getAdapter() {
        return this.f32061b;
    }

    public int getCurrentItem() {
        return this.f32062c;
    }

    public int getOffscreenPageLimit() {
        return this.f32038A;
    }

    public int getPageMargin() {
        return this.f32073p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo45493a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f32070m = new Scroller(context, f32037f);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f32043F = viewConfiguration.getScaledPagingTouchSlop();
        this.f32050M = (int) (400.0f * f);
        this.f32051N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f32055R = new EdgeEffect(context);
        this.f32056S = new EdgeEffect(context);
        this.f32052O = (int) (25.0f * f);
        this.f32053P = (int) (2.0f * f);
        this.f32041D = (int) (f * 16.0f);
        ViewCompat.m4043a(this, new C11857b());
        if (ViewCompat.m4076f(this) == 0) {
            ViewCompat.m4069d((View) this, 1);
        }
        ViewCompat.m4044a(this, new AbstractC0912n() {
            /* class com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.C118542 */

            /* renamed from: b */
            private final Rect f32086b = new Rect();

            @Override // androidx.core.view.AbstractC0912n
            public C0883ab onApplyWindowInsets(View view, C0883ab abVar) {
                C0883ab a = ViewCompat.m4027a(view, abVar);
                if (a.mo4650f()) {
                    return a;
                }
                Rect rect = this.f32086b;
                rect.left = a.mo4642a();
                rect.top = a.mo4644b();
                rect.right = a.mo4646c();
                rect.bottom = a.mo4647d();
                int childCount = FixPageTransformerViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0883ab b = ViewCompat.m4056b(FixPageTransformerViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo4642a(), rect.left);
                    rect.top = Math.min(b.mo4644b(), rect.top);
                    rect.right = Math.min(b.mo4646c(), rect.right);
                    rect.bottom = Math.min(b.mo4647d(), rect.bottom);
                }
                return a.mo4643a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* renamed from: a */
    public void mo45497a(int i, boolean z) {
        this.f32083z = false;
        mo45498a(i, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo45498a(int i, boolean z, boolean z2) {
        mo45499a(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo45499a(int i, boolean z, boolean z2, int i2) {
        AbstractC11869b bVar = this.f32061b;
        boolean z3 = false;
        if (bVar == null || bVar.mo18476a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f32062c != i || this.f32064g.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f32061b.mo18476a()) {
                i = this.f32061b.mo18476a() - 1;
            }
            int i3 = this.f32038A;
            int i4 = this.f32062c;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f32064g.size(); i5++) {
                    this.f32064g.get(i5).f32098c = true;
                }
            }
            if (this.f32062c != i) {
                z3 = true;
            }
            if (this.f32057T) {
                this.f32062c = i;
                if (z3) {
                    m49242e(i);
                }
                requestLayout();
                return;
            }
            mo45494a(i);
            m49230a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    public void mo45500a(AbstractC11859d dVar) {
        if (this.aa == null) {
            this.aa = new ArrayList();
        }
        this.aa.add(dVar);
    }

    /* renamed from: a */
    public void mo45501a(boolean z, AbstractC11860e eVar) {
        mo45502a(z, eVar, 2);
    }

    /* renamed from: a */
    public void mo45502a(boolean z, AbstractC11860e eVar, int i) {
        int i2 = 1;
        boolean z2 = eVar != null;
        boolean z3 = z2 != (this.ae != null);
        this.ae = eVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.ag = i2;
            this.af = i;
        } else {
            this.ag = 0;
        }
        if (z3) {
            mo45511c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo45496a(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f32070m;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f32071n ? this.f32070m.getCurrX() : this.f32070m.getStartX();
            this.f32070m.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int scrollY = getScrollY();
        int i6 = i - i4;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            m49233a(false);
            mo45511c();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float a = f2 + (mo45490a(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i6)) / ((f * this.f32061b.mo45591c(this.f32062c)) + ((float) this.f32073p))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f32071n = false;
        this.f32070m.startScroll(i4, scrollY, i6, i7, min);
        ViewCompat.m4073e(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11856a mo45491a(int i, int i2) {
        C11856a aVar = new C11856a();
        aVar.f32097b = i;
        aVar.f32096a = this.f32061b.mo18478a((ViewGroup) this, i);
        aVar.f32099d = this.f32061b.mo45591c(i);
        if (i2 < 0 || i2 >= this.f32064g.size()) {
            this.f32064g.add(aVar);
        } else {
            this.f32064g.add(i2, aVar);
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r8.f32097b == r17.f32062c) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r8 = null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45494a(int r18) {
        /*
        // Method dump skipped, instructions count: 618
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.mo45494a(int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11856a mo45492a(View view) {
        for (int i = 0; i < this.f32064g.size(); i++) {
            C11856a aVar = this.f32064g.get(i);
            if (this.f32061b.mo18482a(view, aVar.f32096a)) {
                return aVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45495a(int r12, float r13, int r14) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.mo45495a(int, float, int):void");
    }

    /* renamed from: a */
    private void m49233a(boolean z) {
        boolean z2 = this.ak == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f32070m.isFinished()) {
                this.f32070m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f32070m.getCurrX();
                int currY = this.f32070m.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m49241d(currX);
                    }
                }
            }
        }
        this.f32083z = false;
        for (int i = 0; i < this.f32064g.size(); i++) {
            C11856a aVar = this.f32064g.get(i);
            if (aVar.f32098c) {
                aVar.f32098c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            ViewCompat.m4046a(this, this.aj);
        } else {
            this.aj.run();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo45504a(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && mo45504a(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo45503a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo45512c(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo45512c(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo45522f();
                } else {
                    return mo45512c(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo45521e();
            } else {
                return mo45512c(17);
            }
        }
        return false;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f32087a;

        /* renamed from: b */
        public int f32088b;

        /* renamed from: c */
        float f32089c;

        /* renamed from: d */
        boolean f32090d;

        /* renamed from: e */
        int f32091e;

        /* renamed from: f */
        int f32092f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FixPageTransformerViewPager.f32035a);
            this.f32088b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager$f */
    public class C11861f extends DataSetObserver {
        public void onChanged() {
            FixPageTransformerViewPager.this.mo45510b();
        }

        public void onInvalidated() {
            FixPageTransformerViewPager.this.mo45510b();
        }

        C11861f() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo45511c() {
        mo45494a(this.f32062c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32057T = true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: k */
    private void m49248k() {
        this.f32039B = false;
        this.f32040C = false;
        VelocityTracker velocityTracker = this.f32049L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f32049L = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo45521e() {
        int i = this.f32062c;
        if (i <= 0) {
            return false;
        }
        mo45497a(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager$b */
    public class C11857b extends C0859a {
        /* renamed from: b */
        private boolean m49275b() {
            if (FixPageTransformerViewPager.this.f32061b == null || FixPageTransformerViewPager.this.f32061b.mo18476a() <= 1) {
                return false;
            }
            return true;
        }

        C11857b() {
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            super.mo4535a(view, dVar);
            dVar.mo4566b((CharSequence) FixPageTransformerViewPager.class.getName());
            dVar.mo4600k(m49275b());
            if (FixPageTransformerViewPager.this.canScrollHorizontally(1)) {
                dVar.mo4552a(4096);
            }
            if (FixPageTransformerViewPager.this.canScrollHorizontally(-1)) {
                dVar.mo4552a(8192);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: d */
        public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4540d(view, accessibilityEvent);
            accessibilityEvent.setClassName(FixPageTransformerViewPager.class.getName());
            accessibilityEvent.setScrollable(m49275b());
            if (accessibilityEvent.getEventType() == 4096 && FixPageTransformerViewPager.this.f32061b != null) {
                accessibilityEvent.setItemCount(FixPageTransformerViewPager.this.f32061b.mo18476a());
                accessibilityEvent.setFromIndex(FixPageTransformerViewPager.this.f32062c);
                accessibilityEvent.setToIndex(FixPageTransformerViewPager.this.f32062c);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public boolean mo4536a(View view, int i, Bundle bundle) {
            if (super.mo4536a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !FixPageTransformerViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                FixPageTransformerViewPager fixPageTransformerViewPager = FixPageTransformerViewPager.this;
                fixPageTransformerViewPager.setCurrentItem(fixPageTransformerViewPager.f32062c - 1);
                return true;
            } else if (!FixPageTransformerViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                FixPageTransformerViewPager fixPageTransformerViewPager2 = FixPageTransformerViewPager.this;
                fixPageTransformerViewPager2.setCurrentItem(fixPageTransformerViewPager2.f32062c + 1);
                return true;
            }
        }
    }

    /* renamed from: g */
    private void m49244g() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f32087a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f32074q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo45522f() {
        AbstractC11869b bVar = this.f32061b;
        if (bVar == null || this.f32062c >= bVar.mo18476a() - 1) {
            return false;
        }
        mo45497a(this.f32062c + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.aj);
        Scroller scroller = this.f32070m;
        if (scroller != null && !scroller.isFinished()) {
            this.f32070m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f32093a = this.f32062c;
        AbstractC11869b bVar = this.f32061b;
        if (bVar != null) {
            savedState.f32094b = bVar.mo45592e();
        }
        return savedState;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.SavedState.C118551 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f32093a;

        /* renamed from: b */
        Parcelable f32094b;

        /* renamed from: d */
        ClassLoader f32095d;

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f32093a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f32093a);
            parcel.writeParcelable(this.f32094b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f32093a = parcel.readInt();
            this.f32094b = parcel.readParcelable(classLoader);
            this.f32095d = classLoader;
        }
    }

    /* renamed from: h */
    private void m49245h() {
        if (this.ag != 0) {
            ArrayList<View> arrayList = this.ah;
            if (arrayList == null) {
                this.ah = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.ah.add(getChildAt(i));
            }
            Collections.sort(this.ah, f175423ai);
        }
    }

    /* renamed from: i */
    private boolean m49246i() {
        this.f32048K = -1;
        m49248k();
        this.f32055R.onRelease();
        this.f32056S.onRelease();
        if (this.f32055R.isFinished() || this.f32056S.isFinished()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo45516d() {
        int scrollX = getScrollX();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!((LayoutParams) childAt.getLayoutParams()).f32087a) {
                this.ae.mo18484a(childAt, ((float) (childAt.getLeft() - scrollX)) / ((float) getClientWidth()));
            }
        }
    }

    /* renamed from: j */
    private C11856a m49247j() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (clientWidth > 0) {
            f = ((float) getScrollX()) / ((float) clientWidth);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (clientWidth > 0) {
            f2 = ((float) this.f32073p) / ((float) clientWidth);
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        C11856a aVar = null;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f32064g.size()) {
            C11856a aVar2 = this.f32064g.get(i3);
            if (!z && aVar2.f32097b != (i = i2 + 1)) {
                aVar2 = this.f32065h;
                aVar2.f32100e = f3 + f4 + f2;
                aVar2.f32097b = i;
                aVar2.f32099d = this.f32061b.mo45591c(aVar2.f32097b);
                i3--;
            }
            f3 = aVar2.f32100e;
            float f5 = aVar2.f32099d + f3 + f2;
            if (!z && f < f3) {
                return aVar;
            }
            if (f < f5 || i3 == this.f32064g.size() - 1) {
                return aVar2;
            }
            i2 = aVar2.f32097b;
            f4 = aVar2.f32099d;
            i3++;
            aVar = aVar2;
            z = false;
        }
        return aVar;
    }

    public void computeScroll() {
        this.f32071n = true;
        if (this.f32070m.isFinished() || !this.f32070m.computeScrollOffset()) {
            m49233a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f32070m.getCurrX();
        int currY = this.f32070m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m49241d(currX)) {
                this.f32070m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.m4073e(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo45510b() {
        boolean z;
        int a = this.f32061b.mo18476a();
        this.f32063d = a;
        if (this.f32064g.size() >= (this.f32038A * 2) + 1 || this.f32064g.size() >= a) {
            z = false;
        } else {
            z = true;
        }
        int i = this.f32062c;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f32064g.size()) {
            C11856a aVar = this.f32064g.get(i2);
            int a2 = this.f32061b.mo18477a(aVar.f32096a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.f32064g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f32061b.mo45587a((ViewGroup) this);
                        z2 = true;
                    }
                    this.f32061b.mo18479a((ViewGroup) this, aVar.f32097b, aVar.f32096a);
                    if (this.f32062c == aVar.f32097b) {
                        i = Math.max(0, Math.min(this.f32062c, a - 1));
                    }
                } else if (aVar.f32097b != a2) {
                    if (aVar.f32097b == this.f32062c) {
                        i = a2;
                    }
                    aVar.f32097b = a2;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f32061b.mo45590b((ViewGroup) this);
        }
        Collections.sort(this.f32064g, f32036e);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f32087a) {
                    layoutParams.f32089c = BitmapDescriptorFactory.HUE_RED;
                }
            }
            mo45498a(i, false, true);
            requestLayout();
        }
    }

    public void setOnPageChangeListener(AbstractC11859d dVar) {
        this.ab = dVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f32082y != z) {
            this.f32082y = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo45490a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.f32081x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.f32083z = false;
        mo45498a(i, !this.f32057T, false);
    }

    public void setPageMargin(int i) {
        int i2 = this.f32073p;
        this.f32073p = i;
        int width = getWidth();
        m49229a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f32074q) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m49236b(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.af;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    /* renamed from: c */
    private void m49239c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || mo45503a(keyEvent)) {
            return true;
        }
        return false;
    }

    public void setMinimumVelocity(int i) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f32050M = (int) (((float) i) * f);
        this.f32052O = (int) (((double) f) * 5.0d);
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.f32074q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        boolean z;
        if (this.ak != i) {
            this.ak = i;
            if (this.ae != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                m49236b(z);
            }
            m49243f(i);
        }
    }

    /* renamed from: c */
    private static boolean m49240c(View view) {
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m49242e(int i) {
        AbstractC11859d dVar = this.ab;
        if (dVar != null) {
            dVar.mo18470a(i);
        }
        List<AbstractC11859d> list = this.aa;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC11859d dVar2 = this.aa.get(i2);
                if (dVar2 != null) {
                    dVar2.mo18470a(i);
                }
            }
        }
        AbstractC11859d dVar3 = this.ac;
        if (dVar3 != null) {
            dVar3.mo18470a(i);
        }
    }

    /* renamed from: f */
    private void m49243f(int i) {
        AbstractC11859d dVar = this.ab;
        if (dVar != null) {
            dVar.mo18472b(i);
        }
        List<AbstractC11859d> list = this.aa;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC11859d dVar2 = this.aa.get(i2);
                if (dVar2 != null) {
                    dVar2.mo18472b(i);
                }
            }
        }
        AbstractC11859d dVar3 = this.ac;
        if (dVar3 != null) {
            dVar3.mo18472b(i);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C11856a a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = mo45492a(childAt)) != null && a.f32097b == this.f32062c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f32061b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f32077t))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.f32078u))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C11856a a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = mo45492a(childAt)) != null && a.f32097b == this.f32062c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        AbstractC11869b bVar = this.f32061b;
        if (bVar != null) {
            bVar.mo45584a(savedState.f32094b, savedState.f32095d);
            mo45498a(savedState.f32093a, false, true);
            return;
        }
        this.f32067j = savedState.f32093a;
        this.f32068k = savedState.f32094b;
        this.f32069l = savedState.f32095d;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            C13479a.m54775e("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f32038A) {
            this.f32038A = i;
            mo45511c();
        }
    }

    public FixPageTransformerViewPager(Context context) {
        super(context);
        mo45493a();
    }

    /* renamed from: d */
    private boolean m49241d(int i) {
        if (this.f32064g.size() != 0) {
            C11856a j = m49247j();
            int clientWidth = getClientWidth();
            int i2 = this.f32073p;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = j.f32097b;
            float f2 = ((((float) i) / f) - j.f32100e) / (j.f32099d + (((float) i2) / f));
            this.f32059V = false;
            mo45495a(i4, f2, (int) (((float) i3) * f2));
            if (this.f32059V) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f32057T) {
            return false;
        } else {
            this.f32059V = false;
            mo45495a(0, BitmapDescriptorFactory.HUE_RED, 0);
            if (this.f32059V) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11856a mo45508b(int i) {
        for (int i2 = 0; i2 < this.f32064g.size(); i2++) {
            C11856a aVar = this.f32064g.get(i2);
            if (aVar.f32097b == i) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private boolean m49237b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f32044G - f;
        this.f32044G = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f32077t * clientWidth;
        float f4 = this.f32078u * clientWidth;
        boolean z3 = false;
        C11856a aVar = this.f32064g.get(0);
        ArrayList<C11856a> arrayList = this.f32064g;
        C11856a aVar2 = arrayList.get(arrayList.size() - 1);
        if (aVar.f32097b != 0) {
            f3 = aVar.f32100e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (aVar2.f32097b != this.f32061b.mo18476a() - 1) {
            f4 = aVar2.f32100e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f32055R.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f32056S.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f32044G += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m49241d(i);
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo45512c(int r7) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.mo45512c(int):boolean");
    }

    public void draw(Canvas canvas) {
        AbstractC11869b bVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (bVar = this.f32061b) != null && bVar.mo18476a() > 1)) {
            if (!this.f32055R.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f32077t * ((float) width));
                this.f32055R.setSize(height, width);
                z = false | this.f32055R.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f32056S.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f32078u + 1.0f)) * ((float) width2));
                this.f32056S.setSize(height2, width2);
                z |= this.f32056S.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f32055R.finish();
            this.f32056S.finish();
        }
        if (z) {
            ViewCompat.m4073e(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.f32073p > 0 && this.f32074q != null && this.f32064g.size() > 0 && this.f32061b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.f32073p) / f4;
            int i = 0;
            C11856a aVar = this.f32064g.get(0);
            float f6 = aVar.f32100e;
            int size = this.f32064g.size();
            int i2 = aVar.f32097b;
            int i3 = this.f32064g.get(size - 1).f32097b;
            while (i2 < i3) {
                while (i2 > aVar.f32097b && i < size) {
                    i++;
                    aVar = this.f32064g.get(i);
                }
                if (i2 == aVar.f32097b) {
                    f2 = (aVar.f32100e + aVar.f32099d) * f4;
                    f = aVar.f32100e + aVar.f32099d + f5;
                } else {
                    float c = this.f32061b.mo45591c(i2);
                    f = f6 + c + f5;
                    f2 = (f6 + c) * f4;
                }
                if (((float) this.f32073p) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.f32074q.setBounds(Math.round(f2), this.f32075r, Math.round(((float) this.f32073p) + f2), this.f32076s);
                    this.f32074q.draw(canvas);
                } else {
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i2++;
                    f6 = f;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public void setAdapter(AbstractC11869b bVar) {
        AbstractC11869b bVar2 = this.f32061b;
        if (bVar2 != null) {
            bVar2.mo45583a((DataSetObserver) null);
            this.f32061b.mo45587a((ViewGroup) this);
            for (int i = 0; i < this.f32064g.size(); i++) {
                C11856a aVar = this.f32064g.get(i);
                this.f32061b.mo18479a((ViewGroup) this, aVar.f32097b, aVar.f32096a);
            }
            this.f32061b.mo45590b((ViewGroup) this);
            this.f32064g.clear();
            m49244g();
            this.f32062c = 0;
            scrollTo(0, 0);
        }
        AbstractC11869b bVar3 = this.f32061b;
        this.f32061b = bVar;
        this.f32063d = 0;
        if (bVar != null) {
            if (this.f32072o == null) {
                this.f32072o = new C11861f();
            }
            this.f32061b.mo45583a((DataSetObserver) this.f32072o);
            this.f32083z = false;
            boolean z = this.f32057T;
            this.f32057T = true;
            this.f32063d = this.f32061b.mo18476a();
            if (this.f32067j >= 0) {
                this.f32061b.mo45584a(this.f32068k, this.f32069l);
                mo45498a(this.f32067j, false, true);
                this.f32067j = -1;
                this.f32068k = null;
                this.f32069l = null;
            } else if (!z) {
                mo45511c();
            } else {
                requestLayout();
            }
        }
        List<AbstractC11858c> list = this.ad;
        if (!(list == null || list.isEmpty())) {
            int size = this.ad.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.ad.get(i2).mo45558a(this, bVar3, bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11856a mo45509b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo45492a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m49246i();
            return false;
        }
        if (action != 0) {
            if (this.f32039B) {
                return true;
            }
            if (this.f32040C) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f32046I = x;
            this.f32044G = x;
            float y = motionEvent.getY();
            this.f32047J = y;
            this.f32045H = y;
            this.f32048K = motionEvent.getPointerId(0);
            this.f32040C = false;
            this.f32071n = true;
            this.f32070m.computeScrollOffset();
            if (this.ak != 2 || Math.abs(this.f32070m.getFinalX() - this.f32070m.getCurrX()) <= this.f32053P) {
                m49233a(false);
                this.f32039B = false;
            } else {
                this.f32070m.abortAnimation();
                this.f32083z = false;
                mo45511c();
                this.f32039B = true;
                m49239c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f32048K;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.f32044G;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f32047J);
                int i2 = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i2 == 0 || m49234a(this.f32044G, f2) || !mo45504a(this, false, (int) f2, (int) x2, (int) y2)) {
                    int i3 = this.f32043F;
                    if (abs > ((float) i3) && abs * 0.5f > abs2) {
                        this.f32039B = true;
                        m49239c(true);
                        setScrollState(1);
                        float f3 = this.f32046I;
                        float f4 = (float) this.f32043F;
                        if (i2 > 0) {
                            f = f3 + f4;
                        } else {
                            f = f3 - f4;
                        }
                        this.f32044G = f;
                        this.f32045H = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) i3)) {
                        this.f32040C = true;
                    }
                    if (this.f32039B && m49237b(x2)) {
                        ViewCompat.m4073e(this);
                    }
                } else {
                    this.f32044G = x2;
                    this.f32045H = y2;
                    this.f32040C = true;
                    return false;
                }
            }
        } else if (action == 6) {
            m49231a(motionEvent);
        }
        if (this.f32049L == null) {
            this.f32049L = VelocityTracker.obtain();
        }
        this.f32049L.addMovement(motionEvent);
        return this.f32039B;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC11869b bVar;
        float f;
        if (this.f32054Q) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (bVar = this.f32061b) == null || bVar.mo18476a() == 0) {
            return false;
        }
        if (this.f32049L == null) {
            this.f32049L = VelocityTracker.obtain();
        }
        this.f32049L.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f32070m.abortAnimation();
            this.f32083z = false;
            mo45511c();
            float x = motionEvent.getX();
            this.f32046I = x;
            this.f32044G = x;
            float y = motionEvent.getY();
            this.f32047J = y;
            this.f32045H = y;
            this.f32048K = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f32039B) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f32048K);
                    if (findPointerIndex == -1) {
                        z = m49246i();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f32044G);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f32045H);
                        if (abs > ((float) this.f32043F) && abs > abs2) {
                            this.f32039B = true;
                            m49239c(true);
                            float f2 = this.f32046I;
                            if (x2 - f2 > BitmapDescriptorFactory.HUE_RED) {
                                f = f2 + ((float) this.f32043F);
                            } else {
                                f = f2 - ((float) this.f32043F);
                            }
                            this.f32044G = f;
                            this.f32045H = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f32039B) {
                    z = false | m49237b(motionEvent.getX(motionEvent.findPointerIndex(this.f32048K)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f32044G = motionEvent.getX(actionIndex);
                    this.f32048K = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m49231a(motionEvent);
                    this.f32044G = motionEvent.getX(motionEvent.findPointerIndex(this.f32048K));
                }
            } else if (this.f32039B) {
                m49230a(this.f32062c, true, 0, false);
                z = m49246i();
            }
        } else if (this.f32039B) {
            VelocityTracker velocityTracker = this.f32049L;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f32051N);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f32048K);
            this.f32083z = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C11856a j = m49247j();
            float f3 = (float) clientWidth;
            mo45499a(m49226a(j.f32097b, ((((float) scrollX) / f3) - j.f32100e) / (j.f32099d + (((float) this.f32073p) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f32048K)) - this.f32046I)), true, true, xVelocity);
            z = m49246i();
        }
        if (z) {
            ViewCompat.m4073e(this);
        }
        return true;
    }

    /* renamed from: a */
    private void m49231a(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f32048K) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f32044G = motionEvent.getX(i);
            this.f32048K = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f32049L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m49227a(C11856a aVar, C11856a aVar2) {
        return aVar.f32097b - aVar2.f32097b;
    }

    /* renamed from: a */
    private boolean m49234a(float f, float f2) {
        if ((f >= ((float) this.f32042E) || f2 <= BitmapDescriptorFactory.HUE_RED) && (f <= ((float) (getWidth() - this.f32042E)) || f2 >= BitmapDescriptorFactory.HUE_RED)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.ag == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.ah.get(i2).getLayoutParams()).f32092f;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C11856a a;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (a = mo45492a(childAt)) != null && a.f32097b == this.f32062c && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public FixPageTransformerViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo45493a();
    }

    /* renamed from: a */
    private Rect m49228a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.onMeasure(int, int):void");
    }

    /* renamed from: b */
    private void m49235b(int i, float f, int i2) {
        AbstractC11859d dVar = this.ab;
        if (dVar != null) {
            dVar.mo18471a(i, f, i2);
        }
        List<AbstractC11859d> list = this.aa;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC11859d dVar2 = this.aa.get(i3);
                if (dVar2 != null) {
                    dVar2.mo18471a(i, f, i2);
                }
            }
        }
        AbstractC11859d dVar3 = this.ac;
        if (dVar3 != null) {
            dVar3.mo18471a(i, f, i2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f32087a |= m49240c(view);
        if (!this.f32081x) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f32087a) {
            layoutParams2.f32090d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C11856a a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a = mo45492a(childAt)) != null && a.f32097b == this.f32062c) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    /* renamed from: a */
    private void m49232a(C11856a aVar, int i, C11856a aVar2) {
        float f;
        float f2;
        float f3;
        C11856a aVar3;
        C11856a aVar4;
        int a = this.f32061b.mo18476a();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) this.f32073p) / ((float) clientWidth);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (aVar2 != null) {
            int i2 = aVar2.f32097b;
            if (i2 < aVar.f32097b) {
                float f4 = aVar2.f32100e + aVar2.f32099d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= aVar.f32097b && i4 < this.f32064g.size()) {
                    C11856a aVar5 = this.f32064g.get(i4);
                    while (true) {
                        aVar4 = aVar5;
                        if (i3 > aVar4.f32097b && i4 < this.f32064g.size() - 1) {
                            i4++;
                            aVar5 = this.f32064g.get(i4);
                        }
                    }
                    while (i3 < aVar4.f32097b) {
                        f4 += this.f32061b.mo45591c(i3) + f;
                        i3++;
                    }
                    aVar4.f32100e = f4;
                    f4 += aVar4.f32099d + f;
                    i3++;
                }
            } else if (i2 > aVar.f32097b) {
                int size = this.f32064g.size() - 1;
                float f5 = aVar2.f32100e;
                while (true) {
                    i2--;
                    if (i2 < aVar.f32097b || size < 0) {
                        break;
                    }
                    C11856a aVar6 = this.f32064g.get(size);
                    while (true) {
                        aVar3 = aVar6;
                        if (i2 < aVar3.f32097b && size > 0) {
                            size--;
                            aVar6 = this.f32064g.get(size);
                        }
                    }
                    while (i2 > aVar3.f32097b) {
                        f5 -= this.f32061b.mo45591c(i2) + f;
                        i2--;
                    }
                    f5 -= aVar3.f32099d + f;
                    aVar3.f32100e = f5;
                }
            }
        }
        int size2 = this.f32064g.size();
        float f6 = aVar.f32100e;
        int i5 = aVar.f32097b - 1;
        if (aVar.f32097b == 0) {
            f2 = aVar.f32100e;
        } else {
            f2 = -3.4028235E38f;
        }
        this.f32077t = f2;
        int i6 = a - 1;
        if (aVar.f32097b == i6) {
            f3 = (aVar.f32100e + aVar.f32099d) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.f32078u = f3;
        int i7 = i - 1;
        while (i7 >= 0) {
            C11856a aVar7 = this.f32064g.get(i7);
            while (i5 > aVar7.f32097b) {
                f6 -= this.f32061b.mo45591c(i5) + f;
                i5--;
            }
            f6 -= aVar7.f32099d + f;
            aVar7.f32100e = f6;
            if (aVar7.f32097b == 0) {
                this.f32077t = f6;
            }
            i7--;
            i5--;
        }
        float f7 = aVar.f32100e + aVar.f32099d + f;
        int i8 = aVar.f32097b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C11856a aVar8 = this.f32064g.get(i9);
            while (i8 < aVar8.f32097b) {
                f7 += this.f32061b.mo45591c(i8) + f;
                i8++;
            }
            if (aVar8.f32097b == i6) {
                this.f32078u = (aVar8.f32099d + f7) - 1.0f;
            }
            aVar8.f32100e = f7;
            f7 += aVar8.f32099d + f;
            i9++;
            i8++;
        }
        this.f32058U = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f32073p;
            m49229a(i, i3, i5, i5);
        }
    }

    /* renamed from: a */
    private void m49230a(int i, boolean z, int i2, boolean z2) {
        int i3;
        C11856a b = mo45508b(i);
        if (b != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.f32077t, Math.min(b.f32100e, this.f32078u)));
        } else {
            i3 = 0;
        }
        if (z) {
            mo45496a(i3, 0, i2);
            if (z2) {
                m49242e(i);
                return;
            }
            return;
        }
        if (z2) {
            m49242e(i);
        }
        m49233a(false);
        scrollTo(i3, 0);
        m49241d(i3);
    }

    /* renamed from: a */
    private int m49226a(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.f32052O || Math.abs(i2) <= this.f32050M) {
            if (i >= this.f32062c) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f32064g.size() <= 0) {
            return i;
        }
        ArrayList<C11856a> arrayList = this.f32064g;
        return Math.max(this.f32064g.get(0).f32097b, Math.min(i, arrayList.get(arrayList.size() - 1).f32097b));
    }

    /* renamed from: a */
    private void m49229a(int i, int i2, int i3, int i4) {
        float f;
        if (i2 <= 0 || this.f32064g.isEmpty()) {
            C11856a b = mo45508b(this.f32062c);
            if (b != null) {
                f = Math.min(b.f32100e, this.f32078u);
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            int paddingLeft = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                m49233a(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.f32070m.isFinished()) {
            this.f32070m.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.widgets.viewpager.FixPageTransformerViewPager.onLayout(boolean, int, int, int, int):void");
    }
}

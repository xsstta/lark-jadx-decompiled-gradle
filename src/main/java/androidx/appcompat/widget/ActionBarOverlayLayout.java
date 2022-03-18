package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.core.graphics.C0769b;
import androidx.core.view.AbstractC0910l;
import androidx.core.view.C0883ab;
import androidx.core.view.C0911m;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.ViewCompat;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;

public class ActionBarOverlayLayout extends ViewGroup implements AbstractC0458n, NestedScrollingParent, NestedScrollingParent2, AbstractC0910l {

    /* renamed from: e */
    static final int[] f1196e = {R.attr.actionBarSize, 16842841};

    /* renamed from: A */
    private C0883ab f1197A;

    /* renamed from: B */
    private AbstractC0352a f1198B;

    /* renamed from: C */
    private OverScroller f1199C;

    /* renamed from: D */
    private final Runnable f1200D;

    /* renamed from: E */
    private final Runnable f1201E;

    /* renamed from: F */
    private final C0911m f1202F;

    /* renamed from: a */
    ActionBarContainer f1203a;

    /* renamed from: b */
    boolean f1204b;

    /* renamed from: c */
    ViewPropertyAnimator f1205c;

    /* renamed from: d */
    final AnimatorListenerAdapter f1206d;

    /* renamed from: f */
    private int f1207f;

    /* renamed from: g */
    private int f1208g;

    /* renamed from: h */
    private ContentFrameLayout f1209h;

    /* renamed from: i */
    private AbstractC0459o f1210i;

    /* renamed from: j */
    private Drawable f1211j;

    /* renamed from: k */
    private boolean f1212k;

    /* renamed from: l */
    private boolean f1213l;

    /* renamed from: m */
    private boolean f1214m;

    /* renamed from: n */
    private boolean f1215n;

    /* renamed from: o */
    private int f1216o;

    /* renamed from: p */
    private int f1217p;

    /* renamed from: q */
    private final Rect f1218q;

    /* renamed from: r */
    private final Rect f1219r;

    /* renamed from: s */
    private final Rect f1220s;

    /* renamed from: t */
    private final Rect f1221t;

    /* renamed from: u */
    private final Rect f1222u;

    /* renamed from: v */
    private final Rect f1223v;

    /* renamed from: w */
    private final Rect f1224w;

    /* renamed from: x */
    private C0883ab f1225x;

    /* renamed from: y */
    private C0883ab f1226y;

    /* renamed from: z */
    private C0883ab f1227z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    public interface AbstractC0352a {
        /* renamed from: b */
        void mo976b(int i);

        /* renamed from: g */
        void mo977g(boolean z);

        /* renamed from: j */
        void mo982j();

        /* renamed from: k */
        void mo984k();

        /* renamed from: l */
        void mo985l();

        /* renamed from: m */
        void mo986m();
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: a */
    public boolean mo1703a() {
        return this.f1213l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f1202F.mo4707a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1707d();
    }

    /* renamed from: l */
    private void m1516l() {
        mo1707d();
        postDelayed(this.f1200D, 600);
    }

    /* renamed from: m */
    private void m1517m() {
        mo1707d();
        postDelayed(this.f1201E, 600);
    }

    /* renamed from: n */
    private void m1518n() {
        mo1707d();
        this.f1200D.run();
    }

    /* renamed from: o */
    private void m1519o() {
        mo1707d();
        this.f1201E.run();
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    /* renamed from: e */
    public boolean mo1709e() {
        mo1705c();
        return this.f1210i.mo2521h();
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    /* renamed from: f */
    public boolean mo1710f() {
        mo1705c();
        return this.f1210i.mo2522i();
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    /* renamed from: g */
    public boolean mo1712g() {
        mo1705c();
        return this.f1210i.mo2523j();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1203a;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public CharSequence getTitle() {
        mo1705c();
        return this.f1210i.mo2516e();
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    /* renamed from: h */
    public boolean mo1719h() {
        mo1705c();
        return this.f1210i.mo2524k();
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    /* renamed from: i */
    public boolean mo1720i() {
        mo1705c();
        return this.f1210i.mo2525l();
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    /* renamed from: j */
    public void mo1721j() {
        mo1705c();
        this.f1210i.mo2526m();
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    /* renamed from: k */
    public void mo1722k() {
        mo1705c();
        this.f1210i.mo2527n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1707d() {
        removeCallbacks(this.f1200D);
        removeCallbacks(this.f1201E);
        ViewPropertyAnimator viewPropertyAnimator = this.f1205c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1705c() {
        if (this.f1209h == null) {
            this.f1209h = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1203a = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.f1210i = m1512a(findViewById(R.id.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f1214m = z;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: a */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1513a(getContext());
        ViewCompat.m4108w(this);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f1208g = i;
        AbstractC0352a aVar = this.f1198B;
        if (aVar != null) {
            aVar.mo976b(i);
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f1215n) {
            this.f1215n = z;
            if (!z) {
                mo1707d();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo1705c();
        this.f1210i.mo2495a(i);
    }

    public void setLogo(int i) {
        mo1705c();
        this.f1210i.mo2505b(i);
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    public void setWindowCallback(Window.Callback callback) {
        mo1705c();
        this.f1210i.mo2499a(callback);
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    public void setWindowTitle(CharSequence charSequence) {
        mo1705c();
        this.f1210i.mo2502a(charSequence);
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    /* renamed from: a */
    public void mo1700a(int i) {
        mo1705c();
        if (i == 2) {
            this.f1210i.mo2518f();
        } else if (i == 5) {
            this.f1210i.mo2520g();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo1707d();
        this.f1203a.setTranslationY((float) (-Math.max(0, Math.min(i, this.f1203a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(AbstractC0352a aVar) {
        this.f1198B = aVar;
        if (getWindowToken() != null) {
            this.f1198B.mo976b(this.f1208g);
            int i = this.f1217p;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.m4108w(this);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        mo1705c();
        this.f1210i.mo2496a(drawable);
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.f1213l = z;
        if (!z || getContext().getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f1212k = z2;
    }

    /* renamed from: a */
    private AbstractC0459o m1512a(View view) {
        if (view instanceof AbstractC0459o) {
            return (AbstractC0459o) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f1211j != null && !this.f1212k) {
            if (this.f1203a.getVisibility() == 0) {
                i = (int) (((float) this.f1203a.getBottom()) + this.f1203a.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.f1211j.setBounds(0, i, getWidth(), this.f1211j.getIntrinsicHeight() + i);
            this.f1211j.draw(canvas);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        if (this.f1215n && !this.f1204b) {
            if (this.f1216o <= this.f1203a.getHeight()) {
                m1516l();
            } else {
                m1517m();
            }
        }
        AbstractC0352a aVar = this.f1198B;
        if (aVar != null) {
            aVar.mo986m();
        }
    }

    /* renamed from: a */
    private void m1513a(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1196e);
        boolean z2 = false;
        this.f1207f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1211j = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f1212k = z2;
        this.f1199C = new OverScroller(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        mo1705c();
        boolean a = m1515a(this.f1203a, rect, true, true, false, true);
        this.f1221t.set(rect);
        al.m1863a(this, this.f1221t, this.f1218q);
        if (!this.f1222u.equals(this.f1221t)) {
            this.f1222u.set(this.f1221t);
            a = true;
        }
        if (!this.f1219r.equals(this.f1218q)) {
            this.f1219r.set(this.f1218q);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        mo1705c();
        C0883ab a = C0883ab.m4271a(windowInsets);
        boolean a2 = m1515a(this.f1203a, new Rect(a.mo4642a(), a.mo4644b(), a.mo4646c(), a.mo4647d()), true, true, false, true);
        ViewCompat.m4028a(this, a, this.f1218q);
        C0883ab b = a.mo4645b(this.f1218q.left, this.f1218q.top, this.f1218q.right, this.f1218q.bottom);
        this.f1225x = b;
        boolean z = true;
        if (!this.f1226y.equals(b)) {
            this.f1226y = this.f1225x;
            a2 = true;
        }
        if (!this.f1219r.equals(this.f1218q)) {
            this.f1219r.set(this.f1218q);
        } else {
            z = a2;
        }
        if (z) {
            requestLayout();
        }
        return a.mo4655j().mo4651g().mo4654i().mo4660o();
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo1705c();
        int i2 = this.f1217p ^ i;
        this.f1217p = i;
        boolean z2 = false;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & DynamicModule.f58006b) != 0) {
            z2 = true;
        }
        AbstractC0352a aVar = this.f1198B;
        if (aVar != null) {
            aVar.mo977g(!z2);
            if (z || !z2) {
                this.f1198B.mo982j();
            } else {
                this.f1198B.mo984k();
            }
        }
        if ((i2 & DynamicModule.f58006b) != 0 && this.f1198B != null) {
            ViewCompat.m4108w(this);
        }
    }

    /* renamed from: a */
    private boolean m1514a(float f) {
        this.f1199C.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1199C.getFinalY() > this.f1203a.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1218q = new Rect();
        this.f1219r = new Rect();
        this.f1220s = new Rect();
        this.f1221t = new Rect();
        this.f1222u = new Rect();
        this.f1223v = new Rect();
        this.f1224w = new Rect();
        this.f1225x = C0883ab.f3406a;
        this.f1226y = C0883ab.f3406a;
        this.f1227z = C0883ab.f3406a;
        this.f1197A = C0883ab.f3406a;
        this.f1206d = new AnimatorListenerAdapter() {
            /* class androidx.appcompat.widget.ActionBarOverlayLayout.C03491 */

            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.f1205c = null;
                ActionBarOverlayLayout.this.f1204b = false;
            }

            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.f1205c = null;
                ActionBarOverlayLayout.this.f1204b = false;
            }
        };
        this.f1200D = new Runnable() {
            /* class androidx.appcompat.widget.ActionBarOverlayLayout.RunnableC03502 */

            public void run() {
                ActionBarOverlayLayout.this.mo1707d();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f1205c = actionBarOverlayLayout.f1203a.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener(ActionBarOverlayLayout.this.f1206d);
            }
        };
        this.f1201E = new Runnable() {
            /* class androidx.appcompat.widget.ActionBarOverlayLayout.RunnableC03513 */

            public void run() {
                ActionBarOverlayLayout.this.mo1707d();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f1205c = actionBarOverlayLayout.f1203a.animate().translationY((float) (-ActionBarOverlayLayout.this.f1203a.getHeight())).setListener(ActionBarOverlayLayout.this.f1206d);
            }
        };
        m1513a(context);
        this.f1202F = new C0911m(this);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        mo1705c();
        measureChildWithMargins(this.f1203a, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.f1203a.getLayoutParams();
        int max = Math.max(0, this.f1203a.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
        int max2 = Math.max(0, this.f1203a.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1203a.getMeasuredState());
        if ((ViewCompat.m4107v(this) & DynamicModule.f58006b) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i3 = this.f1207f;
            if (this.f1214m && this.f1203a.getTabContainer() != null) {
                i3 += this.f1207f;
            }
        } else {
            i3 = this.f1203a.getVisibility() != 8 ? this.f1203a.getMeasuredHeight() : 0;
        }
        this.f1220s.set(this.f1218q);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1227z = this.f1225x;
        } else {
            this.f1223v.set(this.f1221t);
        }
        if (!this.f1213l && !z) {
            this.f1220s.top += i3;
            this.f1220s.bottom += 0;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f1227z = this.f1227z.mo4645b(0, i3, 0, 0);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f1227z = new C0883ab.C0884a(this.f1227z).mo4661a(C0769b.m3718a(this.f1227z.mo4642a(), this.f1227z.mo4644b() + i3, this.f1227z.mo4646c(), this.f1227z.mo4647d() + 0)).mo4662a();
        } else {
            this.f1223v.top += i3;
            this.f1223v.bottom += 0;
        }
        m1515a(this.f1209h, this.f1220s, true, true, true, true);
        if (Build.VERSION.SDK_INT >= 21 && !this.f1197A.equals(this.f1227z)) {
            C0883ab abVar = this.f1227z;
            this.f1197A = abVar;
            ViewCompat.m4056b(this.f1209h, abVar);
        } else if (Build.VERSION.SDK_INT < 21 && !this.f1224w.equals(this.f1223v)) {
            this.f1224w.set(this.f1223v);
            this.f1209h.mo2063a(this.f1223v);
        }
        measureChildWithMargins(this.f1209h, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f1209h.getLayoutParams();
        int max3 = Math.max(max, this.f1209h.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
        int max4 = Math.max(max2, this.f1209h.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1209h.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // androidx.appcompat.widget.AbstractC0458n
    /* renamed from: a */
    public void mo1701a(Menu menu, AbstractC0337l.AbstractC0338a aVar) {
        mo1705c();
        this.f1210i.mo2497a(menu, aVar);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f1202F.mo4710a(view, view2, i);
        this.f1216o = getActionBarHideOffset();
        mo1707d();
        AbstractC0352a aVar = this.f1198B;
        if (aVar != null) {
            aVar.mo985l();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f1203a.getVisibility() != 0) {
            return false;
        }
        return this.f1215n;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 != 0 || !onStartNestedScroll(view, view2, i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f1215n || !z) {
            return false;
        }
        if (m1514a(f2)) {
            m1519o();
        } else {
            m1518n();
        }
        this.f1204b = true;
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f1216o + i2;
        this.f1216o = i5;
        setActionBarHideOffset(i5);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = layoutParams.leftMargin + paddingLeft;
                int i7 = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    private boolean m1515a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!z || layoutParams.leftMargin == rect.left) {
            z5 = false;
        } else {
            layoutParams.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && layoutParams.topMargin != rect.top) {
            layoutParams.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && layoutParams.rightMargin != rect.right) {
            layoutParams.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || layoutParams.bottomMargin == rect.bottom) {
            return z5;
        }
        layoutParams.bottomMargin = rect.bottom;
        return true;
    }

    @Override // androidx.core.view.AbstractC0910l
    /* renamed from: a */
    public void mo1702a(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }
}

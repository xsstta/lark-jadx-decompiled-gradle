package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.AbstractC0339m;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.view.menu.C0326h;
import androidx.appcompat.widget.LinearLayoutCompat;

public class ActionMenuView extends LinearLayoutCompat implements C0322f.AbstractC0324b, AbstractC0339m {

    /* renamed from: a */
    C0322f.AbstractC0323a f1261a;

    /* renamed from: b */
    AbstractC0364d f1262b;

    /* renamed from: c */
    private C0322f f1263c;

    /* renamed from: d */
    private Context f1264d;

    /* renamed from: e */
    private int f1265e;

    /* renamed from: f */
    private boolean f1266f;

    /* renamed from: g */
    private ActionMenuPresenter f1267g;

    /* renamed from: h */
    private AbstractC0337l.AbstractC0338a f1268h;

    /* renamed from: i */
    private boolean f1269i;

    /* renamed from: j */
    private int f1270j;

    /* renamed from: k */
    private int f1271k;

    /* renamed from: l */
    private int f1272l;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface AbstractC0361a {
        /* renamed from: c */
        boolean mo1217c();

        /* renamed from: d */
        boolean mo1218d();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public interface AbstractC0364d {
        /* renamed from: a */
        boolean mo1814a(MenuItem menuItem);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0362b implements AbstractC0337l.AbstractC0338a {
        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public void mo882a(C0322f fVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public boolean mo883a(C0322f fVar) {
            return false;
        }

        C0362b() {
        }
    }

    /* renamed from: d */
    public C0322f mo1790d() {
        return this.f1263c;
    }

    public int getPopupTheme() {
        return this.f1265e;
    }

    /* renamed from: c */
    public LayoutParams mo1788c() {
        LayoutParams b = generateDefaultLayoutParams();
        b.f1273a = true;
        return b;
    }

    /* renamed from: i */
    public void mo1803i() {
        ActionMenuPresenter actionMenuPresenter = this.f1267g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1768g();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1803i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f1378h = 16;
        return layoutParams;
    }

    /* renamed from: e */
    public boolean mo1792e() {
        ActionMenuPresenter actionMenuPresenter = this.f1267g;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1766e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo1793f() {
        ActionMenuPresenter actionMenuPresenter = this.f1267g;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1767f()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo1794g() {
        ActionMenuPresenter actionMenuPresenter = this.f1267g;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1770i()) {
            return false;
        }
        return true;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1267g.mo1764d();
    }

    /* renamed from: h */
    public boolean mo1802h() {
        ActionMenuPresenter actionMenuPresenter = this.f1267g;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1771j()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo1785a() {
        return this.f1266f;
    }

    public Menu getMenu() {
        if (this.f1263c == null) {
            Context context = getContext();
            C0322f fVar = new C0322f(context);
            this.f1263c = fVar;
            fVar.mo1390a(new C0363c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f1267g = actionMenuPresenter;
            actionMenuPresenter.mo1762b(true);
            ActionMenuPresenter actionMenuPresenter2 = this.f1267g;
            AbstractC0337l.AbstractC0338a aVar = this.f1268h;
            if (aVar == null) {
                aVar = new C0362b();
            }
            actionMenuPresenter2.mo1242a(aVar);
            this.f1263c.mo1393a(this.f1267g, this.f1264d);
            this.f1267g.mo1761a(this);
        }
        return this.f1263c;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0339m
    /* renamed from: a */
    public void mo1265a(C0322f fVar) {
        this.f1263c = fVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setOnMenuItemClickListener(AbstractC0364d dVar) {
        this.f1262b = dVar;
    }

    public void setOverflowReserved(boolean z) {
        this.f1266f = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public class C0363c implements C0322f.AbstractC0323a {
        C0363c() {
        }

        @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
        /* renamed from: a */
        public void mo836a(C0322f fVar) {
            if (ActionMenuView.this.f1261a != null) {
                ActionMenuView.this.f1261a.mo836a(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
        /* renamed from: a */
        public boolean mo839a(C0322f fVar, MenuItem menuItem) {
            if (ActionMenuView.this.f1262b == null || !ActionMenuView.this.f1262b.mo1814a(menuItem)) {
                return false;
            }
            return true;
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1267g.mo1763c(z);
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1267g = actionMenuPresenter;
        actionMenuPresenter.mo1761a(this);
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1273a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1274b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1275c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1276d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1277e;

        /* renamed from: f */
        boolean f1278f;

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1273a = layoutParams.f1273a;
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

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1267g.mo1760a(drawable);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1267g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1243a(false);
            if (this.f1267g.mo1770i()) {
                this.f1267g.mo1767f();
                this.f1267g.mo1766e();
            }
        }
    }

    public void setPopupTheme(int i) {
        if (this.f1265e != i) {
            this.f1265e = i;
            if (i == 0) {
                this.f1264d = getContext();
            } else {
                this.f1264d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        if (layoutParams instanceof LayoutParams) {
            layoutParams2 = new LayoutParams((LayoutParams) layoutParams);
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (layoutParams2.f1378h <= 0) {
            layoutParams2.f1378h = 16;
        }
        return layoutParams2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1786a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof AbstractC0361a)) {
            z = false | ((AbstractC0361a) childAt).mo1218d();
        }
        if (i <= 0 || !(childAt2 instanceof AbstractC0361a)) {
            return z;
        }
        return z | ((AbstractC0361a) childAt2).mo1217c();
    }

    @Override // androidx.appcompat.view.menu.C0322f.AbstractC0324b
    /* renamed from: a */
    public boolean mo1266a(C0326h hVar) {
        return this.f1263c.mo1396a(hVar, 0);
    }

    /* renamed from: a */
    public void mo1784a(AbstractC0337l.AbstractC0338a aVar, C0322f.AbstractC0323a aVar2) {
        this.f1268h = aVar;
        this.f1261a = aVar2;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1271k = (int) (56.0f * f);
        this.f1272l = (int) (f * 4.0f);
        this.f1264d = context;
        this.f1265e = 0;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        boolean z;
        C0322f fVar;
        boolean z2 = this.f1269i;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f1269i = z;
        if (z2 != z) {
            this.f1270j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.f1269i || (fVar = this.f1263c) == null || size == this.f1270j)) {
            this.f1270j = size;
            fVar.mo1412b(true);
        }
        int childCount = getChildCount();
        if (!this.f1269i || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m1579a(i, i2);
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1579a(int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 627
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.m1579a(int, int):void");
    }

    /* renamed from: a */
    static int m1578a(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView == null || !actionMenuItemView.mo1216b()) {
            z = false;
        } else {
            z = true;
        }
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        if (layoutParams.f1273a || !z) {
            z2 = false;
        }
        layoutParams.f1276d = z2;
        layoutParams.f1274b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        if (!this.f1269i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a = al.m1864a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1273a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1786a(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i6 = getPaddingLeft() + layoutParams.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - layoutParams.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + layoutParams.leftMargin) + layoutParams.rightMargin;
                    mo1786a(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f1273a) {
                    int i18 = width - layoutParams2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + layoutParams2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f1273a) {
                int i21 = paddingLeft + layoutParams3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + layoutParams3.rightMargin + max;
            }
        }
    }
}

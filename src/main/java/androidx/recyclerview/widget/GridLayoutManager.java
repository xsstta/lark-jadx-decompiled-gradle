package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.p029a.C0864d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    boolean f4607a;

    /* renamed from: b */
    int f4608b = -1;

    /* renamed from: c */
    int[] f4609c;

    /* renamed from: d */
    View[] f4610d;

    /* renamed from: e */
    final SparseIntArray f4611e = new SparseIntArray();

    /* renamed from: f */
    final SparseIntArray f4612f = new SparseIntArray();

    /* renamed from: g */
    AbstractC1297b f4613g = new C1296a();

    /* renamed from: h */
    final Rect f4614h = new Rect();

    /* renamed from: i */
    private boolean f4615i;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: a */
        int f4616a = -1;

        /* renamed from: b */
        int f4617b;

        /* renamed from: a */
        public int mo6531a() {
            return this.f4616a;
        }

        /* renamed from: b */
        public int mo6532b() {
            return this.f4617b;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: a */
    public AbstractC1297b mo6499a() {
        return this.f4613g;
    }

    /* renamed from: b */
    public int mo6502b() {
        return this.f4608b;
    }

    /* renamed from: a */
    static int[] m5947a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6498a(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.f4609c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f4609c;
        int i3 = this.f4608b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: a */
    public void mo6500a(int i) {
        if (i != this.f4608b) {
            this.f4607a = true;
            if (i >= 1) {
                this.f4608b = i;
                this.f4613g.mo6535a();
                requestLayout();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class AbstractC1297b {

        /* renamed from: a */
        final SparseIntArray f4618a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f4619b = new SparseIntArray();

        /* renamed from: c */
        private boolean f4620c = false;

        /* renamed from: d */
        private boolean f4621d = false;

        /* renamed from: a */
        public abstract int mo6533a(int i);

        /* renamed from: a */
        public void mo6535a() {
            this.f4618a.clear();
        }

        /* renamed from: b */
        public void mo6537b() {
            this.f4619b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo6536b(int i, int i2) {
            if (!this.f4620c) {
                return mo6534a(i, i2);
            }
            int i3 = this.f4618a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo6534a(i, i2);
            this.f4618a.put(i, a);
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo6538c(int i, int i2) {
            if (!this.f4621d) {
                return mo6539d(i, i2);
            }
            int i3 = this.f4619b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo6539d(i, i2);
            this.f4619b.put(i, d);
            return d;
        }

        /* renamed from: a */
        static int m5965a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo6534a(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo6533a(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f4620c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.f4618a
                int r2 = m5965a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.f4618a
                int r3 = r3.get(r2)
                int r4 = r5.mo6533a(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = 0
                r3 = 0
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.mo6533a(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = 0
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b.mo6534a(int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo6539d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f4621d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f4619b
                int r0 = m5965a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f4619b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo6536b(r0, r8)
                int r0 = r6.mo6533a(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.mo6533a(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.mo6533a(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b.mo6539d(int, int):int");
        }
    }

    /* renamed from: c */
    private void mo90403c() {
        this.f4611e.clear();
        this.f4612f.clear();
    }

    /* renamed from: f */
    private void m5955f() {
        View[] viewArr = this.f4610d;
        if (viewArr == null || viewArr.length != this.f4608b) {
            this.f4610d = new View[this.f4608b];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState != null || this.f4607a) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: d */
    private void m5953d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int viewLayoutPosition = layoutParams.getViewLayoutPosition();
            this.f4611e.put(viewLayoutPosition, layoutParams.mo6532b());
            this.f4612f.put(viewLayoutPosition, layoutParams.mo6531a());
        }
    }

    /* renamed from: e */
    private void m5954e() {
        int i;
        int i2;
        if (getOrientation() == 1) {
            i2 = getWidth() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = getHeight() - getPaddingBottom();
            i = getPaddingTop();
        }
        mo90402b(i2 - i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    public void mo6501a(AbstractC1297b bVar) {
        this.f4613g = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.f4607a = false;
    }

    /* renamed from: b */
    private void mo90402b(int i) {
        this.f4609c = m5947a(this.f4609c, this.f4608b, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        if (this.f4615i) {
            return m5949b(state);
        }
        return super.computeHorizontalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        if (this.f4615i) {
            return m5941a(state);
        }
        return super.computeHorizontalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        if (this.f4615i) {
            return m5949b(state);
        }
        return super.computeVerticalScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        if (this.f4615i) {
            return m5941a(state);
        }
        return super.computeVerticalScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f4613g.mo6535a();
        this.f4613g.mo6537b();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    private int m5941a(RecyclerView.State state) {
        if (!(getChildCount() == 0 || state.getItemCount() == 0)) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (!(findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null)) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f4613g.mo6538c(state.getItemCount() - 1, this.f4608b) + 1;
                }
                int b = this.mOrientationHelper.mo7465b(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo7461a(findFirstVisibleChildClosestToStart);
                int c = this.f4613g.mo6538c(getPosition(findFirstVisibleChildClosestToStart), this.f4608b);
                return (int) ((((float) b) / ((float) ((this.f4613g.mo6538c(getPosition(findFirstVisibleChildClosestToEnd), this.f4608b) - c) + 1))) * ((float) (this.f4613g.mo6538c(state.getItemCount() - 1, this.f4608b) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: b */
    private int m5949b(RecyclerView.State state) {
        int i;
        if (!(getChildCount() == 0 || state.getItemCount() == 0)) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
            if (!(findFirstVisibleChildClosestToStart == null || findFirstVisibleChildClosestToEnd == null)) {
                int c = this.f4613g.mo6538c(getPosition(findFirstVisibleChildClosestToStart), this.f4608b);
                int c2 = this.f4613g.mo6538c(getPosition(findFirstVisibleChildClosestToEnd), this.f4608b);
                int min = Math.min(c, c2);
                int max = Math.max(c, c2);
                int c3 = this.f4613g.mo6538c(state.getItemCount() - 1, this.f4608b) + 1;
                if (this.mShouldReverseLayout) {
                    i = Math.max(0, (c3 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!isSmoothScrollbarEnabled) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.mOrientationHelper.mo7465b(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.mo7461a(findFirstVisibleChildClosestToStart))) / ((float) ((this.f4613g.mo6538c(getPosition(findFirstVisibleChildClosestToEnd), this.f4608b) - this.f4613g.mo6538c(getPosition(findFirstVisibleChildClosestToStart), this.f4608b)) + 1)))) + ((float) (this.mOrientationHelper.mo7466c() - this.mOrientationHelper.mo7461a(findFirstVisibleChildClosestToStart))));
            }
        }
        return 0;
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1296a extends AbstractC1297b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
        /* renamed from: a */
        public int mo6533a(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
        /* renamed from: a */
        public int mo6534a(int i, int i2) {
            return i % i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.isPreLayout()) {
            m5953d();
        }
        super.onLayoutChildren(recycler, state);
        mo90403c();
    }

    /* renamed from: a */
    private void m5942a(float f, int i) {
        mo90402b(Math.max(Math.round(f * ((float) this.f4608b)), i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getColumnCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return this.f4608b;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return m5940a(recycler, state, state.getItemCount() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getRowCountForAccessibility(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return this.f4608b;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return m5940a(recycler, state, state.getItemCount() - 1) + 1;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo6500a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.f4613g.mo6535a();
        this.f4613g.mo6537b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.f4613g.mo6535a();
        this.f4613g.mo6537b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m5954e();
        m5955f();
        return super.scrollHorizontallyBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m5954e();
        m5955f();
        return super.scrollVerticallyBy(i, recycler, state);
    }

    /* renamed from: a */
    private int m5940a(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f4613g.mo6538c(i, this.f4608b);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.f4613g.mo6538c(convertPreLayoutPositionToPostLayout, this.f4608b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: b */
    private int m5948b(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f4613g.mo6536b(i, this.f4608b);
        }
        int i2 = this.f4612f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.f4613g.mo6536b(convertPreLayoutPositionToPostLayout, this.f4608b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: c */
    private int m5951c(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.isPreLayout()) {
            return this.f4613g.mo6533a(i);
        }
        int i2 = this.f4611e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.f4613g.mo6533a(convertPreLayoutPositionToPostLayout);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, LinearLayoutManager.C1314c cVar, RecyclerView.LayoutManager.AbstractC1326a aVar) {
        int i = this.f4608b;
        for (int i2 = 0; i2 < this.f4608b && cVar.mo6674a(state) && i > 0; i2++) {
            int i3 = cVar.f4668d;
            aVar.mo7063b(i3, Math.max(0, cVar.f4671g));
            i -= this.f4613g.mo6533a(i3);
            cVar.f4668d += cVar.f4669e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f4609c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            i4 = chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f4609c;
            i3 = chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            i3 = chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f4609c;
            i4 = chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    /* renamed from: a */
    private void m5944a(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int a = mo6498a(layoutParams.f4616a, layoutParams.f4617b);
        if (this.mOrientation == 1) {
            i2 = getChildMeasureSpec(a, i, i5, layoutParams.width, false);
            i3 = getChildMeasureSpec(this.mOrientationHelper.mo7472f(), getHeightMode(), i4, layoutParams.height, true);
        } else {
            int childMeasureSpec = getChildMeasureSpec(a, i, i4, layoutParams.height, false);
            int childMeasureSpec2 = getChildMeasureSpec(this.mOrientationHelper.mo7472f(), getWidthMode(), i5, layoutParams.width, true);
            i3 = childMeasureSpec;
            i2 = childMeasureSpec2;
        }
        m5943a(view, i2, i3, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4613g.mo6535a();
        this.f4613g.mo6537b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4613g.mo6535a();
        this.f4613g.mo6537b();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C1312a aVar, int i) {
        super.onAnchorReady(recycler, state, aVar, i);
        m5954e();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            m5946a(recycler, state, aVar, i);
        }
        m5955f();
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo6500a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, C0864d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, dVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int a = m5940a(recycler, state, layoutParams2.getViewLayoutPosition());
        if (this.mOrientation == 0) {
            dVar.mo4567b(C0864d.C0867c.m4258a(layoutParams2.mo6531a(), layoutParams2.mo6532b(), a, 1, false, false));
        } else {
            dVar.mo4567b(C0864d.C0867c.m4258a(a, 1, layoutParams2.mo6531a(), layoutParams2.mo6532b(), false, false));
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo6500a(getProperties(context, attributeSet, i, i2).f4690b);
    }

    /* renamed from: a */
    private void m5943a(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = shouldReMeasureChild(view, i, i2, layoutParams);
        } else {
            z2 = shouldMeasureChild(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d8, code lost:
        if (r13 == r11) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f8, code lost:
        if (r13 == r8) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0109  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.Recycler r25, androidx.recyclerview.widget.RecyclerView.State r26) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    /* renamed from: a */
    private void m5945a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f4610d[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f4617b = m5951c(recycler, state, getPosition(view));
            layoutParams.f4616a = i4;
            i4 += layoutParams.f4617b;
            i3 += i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void layoutChunk(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19, androidx.recyclerview.widget.LinearLayoutManager.C1314c r20, androidx.recyclerview.widget.LinearLayoutManager.C1313b r21) {
        /*
        // Method dump skipped, instructions count: 564
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* renamed from: a */
    private void m5946a(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C1312a aVar, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int b = m5948b(recycler, state, aVar.f4657b);
        if (z) {
            while (b > 0 && aVar.f4657b > 0) {
                aVar.f4657b--;
                b = m5948b(recycler, state, aVar.f4657b);
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i2 = aVar.f4657b;
        while (i2 < itemCount) {
            int i3 = i2 + 1;
            int b2 = m5948b(recycler, state, i3);
            if (b2 <= b) {
                break;
            }
            i2 = i3;
            b = b2;
        }
        aVar.f4657b = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View findReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3) {
        int i4;
        ensureLayoutState();
        int c = this.mOrientationHelper.mo7466c();
        int d = this.mOrientationHelper.mo7468d();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < i3 && m5948b(recycler, state, position) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.mo7461a(childAt) < d && this.mOrientationHelper.mo7465b(childAt) >= c) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }
}

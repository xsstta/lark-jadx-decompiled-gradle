package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.AbstractC1310e, RecyclerView.SmoothScroller.AbstractC1331b {
    final C1312a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final C1313b mLayoutChunkResult;
    private C1314c mLayoutState;
    int mOrientation;
    AbstractC1401r mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void onAnchorReady(RecyclerView.Recycler recycler, RecyclerView.State state, C1312a aVar, int i) {
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.recyclerview.widget.LinearLayoutManager.SavedState.C13111 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f4653a;

        /* renamed from: b */
        int f4654b;

        /* renamed from: c */
        boolean f4655c;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6657b() {
            this.f4653a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6656a() {
            if (this.f4653a >= 0) {
                return true;
            }
            return false;
        }

        public SavedState(SavedState savedState) {
            this.f4653a = savedState.f4653a;
            this.f4654b = savedState.f4654b;
            this.f4655c = savedState.f4655c;
        }

        SavedState(Parcel parcel) {
            this.f4653a = parcel.readInt();
            this.f4654b = parcel.readInt();
            this.f4655c = parcel.readInt() != 1 ? false : true;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4653a);
            parcel.writeInt(this.f4654b);
            parcel.writeInt(this.f4655c ? 1 : 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C1313b {

        /* renamed from: a */
        public int f4661a;

        /* renamed from: b */
        public boolean f4662b;

        /* renamed from: c */
        public boolean f4663c;

        /* renamed from: d */
        public boolean f4664d;

        protected C1313b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6670a() {
            this.f4661a = 0;
            this.f4662b = false;
            this.f4663c = false;
            this.f4664d = false;
        }
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C1312a {

        /* renamed from: a */
        AbstractC1401r f4656a;

        /* renamed from: b */
        int f4657b;

        /* renamed from: c */
        int f4658c;

        /* renamed from: d */
        boolean f4659d;

        /* renamed from: e */
        boolean f4660e;

        C1312a() {
            mo6664a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6664a() {
            this.f4657b = -1;
            this.f4658c = Integer.MIN_VALUE;
            this.f4659d = false;
            this.f4660e = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6667b() {
            int i;
            if (this.f4659d) {
                i = this.f4656a.mo7468d();
            } else {
                i = this.f4656a.mo7466c();
            }
            this.f4658c = i;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4657b + ", mCoordinate=" + this.f4658c + ", mLayoutFromEnd=" + this.f4659d + ", mValid=" + this.f4660e + '}';
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6666a(View view, RecyclerView.State state) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.isItemRemoved() || layoutParams.getViewLayoutPosition() < 0 || layoutParams.getViewLayoutPosition() >= state.getItemCount()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public void mo6668b(View view, int i) {
            if (this.f4659d) {
                this.f4658c = this.f4656a.mo7465b(view) + this.f4656a.mo7464b();
            } else {
                this.f4658c = this.f4656a.mo7461a(view);
            }
            this.f4657b = i;
        }

        /* renamed from: a */
        public void mo6665a(View view, int i) {
            int b = this.f4656a.mo7464b();
            if (b >= 0) {
                mo6668b(view, i);
                return;
            }
            this.f4657b = i;
            if (this.f4659d) {
                int d = (this.f4656a.mo7468d() - b) - this.f4656a.mo7465b(view);
                this.f4658c = this.f4656a.mo7468d() - d;
                if (d > 0) {
                    int e = this.f4658c - this.f4656a.mo7471e(view);
                    int c = this.f4656a.mo7466c();
                    int min = e - (c + Math.min(this.f4656a.mo7461a(view) - c, 0));
                    if (min < 0) {
                        this.f4658c += Math.min(d, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int a = this.f4656a.mo7461a(view);
            int c2 = a - this.f4656a.mo7466c();
            this.f4658c = a;
            if (c2 > 0) {
                int d2 = (this.f4656a.mo7468d() - Math.min(0, (this.f4656a.mo7468d() - b) - this.f4656a.mo7465b(view))) - (a + this.f4656a.mo7471e(view));
                if (d2 < 0) {
                    this.f4658c -= Math.min(c2, -d2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C1314c {

        /* renamed from: a */
        boolean f4665a = true;

        /* renamed from: b */
        int f4666b;

        /* renamed from: c */
        int f4667c;

        /* renamed from: d */
        int f4668d;

        /* renamed from: e */
        int f4669e;

        /* renamed from: f */
        int f4670f;

        /* renamed from: g */
        int f4671g;

        /* renamed from: h */
        int f4672h;

        /* renamed from: i */
        int f4673i;

        /* renamed from: j */
        boolean f4674j;

        /* renamed from: k */
        int f4675k;

        /* renamed from: l */
        List<RecyclerView.ViewHolder> f4676l;

        /* renamed from: m */
        boolean f4677m;

        C1314c() {
        }

        /* renamed from: a */
        public void mo6672a() {
            mo6673a((View) null);
        }

        /* renamed from: b */
        private View m6025b() {
            int size = this.f4676l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f4676l.get(i).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (!layoutParams.isItemRemoved() && this.f4668d == layoutParams.getViewLayoutPosition()) {
                    mo6673a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6674a(RecyclerView.State state) {
            int i = this.f4668d;
            if (i < 0 || i >= state.getItemCount()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo6671a(RecyclerView.Recycler recycler) {
            if (this.f4676l != null) {
                return m6025b();
            }
            View viewForPosition = recycler.getViewForPosition(this.f4668d);
            this.f4668d += this.f4669e;
            return viewForPosition;
        }

        /* renamed from: a */
        public void mo6673a(View view) {
            View b = mo6675b(view);
            if (b == null) {
                this.f4668d = -1;
            } else {
                this.f4668d = ((RecyclerView.LayoutParams) b.getLayoutParams()).getViewLayoutPosition();
            }
        }

        /* renamed from: b */
        public View mo6675b(View view) {
            int viewLayoutPosition;
            int size = this.f4676l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4676l.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.f4668d) * this.f4669e) >= 0 && viewLayoutPosition < i) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    }
                    i = viewLayoutPosition;
                }
            }
            return view2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        if (this.mOrientation == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        if (this.mOrientation == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public C1314c createLayoutState() {
        return new C1314c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    /* access modifiers changed from: package-private */
    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    /* access modifiers changed from: protected */
    public boolean isLayoutRTL() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        if (this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd) {
            return true;
        }
        return false;
    }

    private View getChildClosestToEnd() {
        int i;
        if (this.mShouldReverseLayout) {
            i = 0;
        } else {
            i = getChildCount() - 1;
        }
        return getChildAt(i);
    }

    private View getChildClosestToStart() {
        int i;
        if (this.mShouldReverseLayout) {
            i = getChildCount() - 1;
        } else {
            i = 0;
        }
        return getChildAt(i);
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    /* access modifiers changed from: package-private */
    public boolean resolveIsInfinite() {
        if (this.mOrientationHelper.mo7475h() == 0 && this.mOrientationHelper.mo7470e() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        if (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) {
            return false;
        }
        return true;
    }

    private void logChildren() {
        Log.d("LinearLayoutManager", "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            Log.d("LinearLayoutManager", "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.mo7461a(childAt));
        }
        Log.d("LinearLayoutManager", "==============");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState2.f4655c = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState2.f4654b = this.mOrientationHelper.mo7468d() - this.mOrientationHelper.mo7465b(childClosestToEnd);
                savedState2.f4653a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState2.f4653a = getPosition(childClosestToStart);
                savedState2.f4654b = this.mOrientationHelper.mo7461a(childClosestToStart) - this.mOrientationHelper.mo7466c();
            }
        } else {
            savedState2.mo6657b();
        }
        return savedState2;
    }

    /* access modifiers changed from: package-private */
    public void validateChildOrder() {
        Log.d("LinearLayoutManager", "validating child count " + getChildCount());
        boolean z = true;
        if (getChildCount() >= 1) {
            int position = getPosition(getChildAt(0));
            int a = this.mOrientationHelper.mo7461a(getChildAt(0));
            if (this.mShouldReverseLayout) {
                for (int i = 1; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int a2 = this.mOrientationHelper.mo7461a(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder sb = new StringBuilder();
                        sb.append("detected invalid position. loc invalid? ");
                        if (a2 >= a) {
                            z = false;
                        }
                        sb.append(z);
                        throw new RuntimeException(sb.toString());
                    } else if (a2 > a) {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            for (int i2 = 1; i2 < getChildCount(); i2++) {
                View childAt2 = getChildAt(i2);
                int position3 = getPosition(childAt2);
                int a3 = this.mOrientationHelper.mo7461a(childAt2);
                if (position3 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    if (a3 >= a) {
                        z = false;
                    }
                    sb2.append(z);
                    throw new RuntimeException(sb2.toString());
                } else if (a3 < a) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private void updateLayoutStateToFillEnd(C1312a aVar) {
        updateLayoutStateToFillEnd(aVar.f4657b, aVar.f4658c);
    }

    private void updateLayoutStateToFillStart(C1312a aVar) {
        updateLayoutStateToFillStart(aVar.f4657b, aVar.f4658c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return computeScrollExtent(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return computeScrollOffset(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return computeScrollRange(state);
    }

    /* access modifiers changed from: protected */
    public int getExtraLayoutSpace(RecyclerView.State state) {
        if (state.hasTargetScrollPosition()) {
            return this.mOrientationHelper.mo7472f();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.mPendingSavedState = (SavedState) parcelable;
            requestLayout();
        }
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        super.onLayoutCompleted(state);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.mo6664a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.mo6657b();
        }
        requestLayout();
    }

    private int computeScrollExtent(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C1408u.m6453a(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C1408u.m6454a(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C1408u.m6455b(state, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.AbstractC1331b
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF((float) i2, BitmapDescriptorFactory.HUE_RED);
        }
        return new PointF(BitmapDescriptorFactory.HUE_RED, (float) i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll(null);
            if (i != this.mOrientation || this.mOrientationHelper == null) {
                AbstractC1401r a = AbstractC1401r.m6391a(this, i);
                this.mOrientationHelper = a;
                this.mAnchorInfo.f4656a = a;
                this.mOrientation = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* access modifiers changed from: package-private */
    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.mOrientation == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.mOrientation == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.mOrientation == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.mOrientation == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.mOrientation != 1 && isLayoutRTL()) {
            return 1;
        } else {
            return -1;
        }
    }

    private View findReferenceChildClosestToEnd(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mShouldReverseLayout) {
            return findFirstReferenceChild(recycler, state);
        }
        return findLastReferenceChild(recycler, state);
    }

    private View findReferenceChildClosestToStart(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mShouldReverseLayout) {
            return findLastReferenceChild(recycler, state);
        }
        return findFirstReferenceChild(recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.onDetachedFromWindow(recyclerView, recycler);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(recycler);
            recycler.clear();
        }
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.mo6657b();
        }
        requestLayout();
    }

    private View findFirstReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return findReferenceChild(recycler, state, 0, getChildCount(), state.getItemCount());
    }

    private View findLastReferenceChild(RecyclerView.Recycler recycler, RecyclerView.State state) {
        return findReferenceChild(recycler, state, getChildCount() - 1, -1, state.getItemCount());
    }

    private void recycleByLayoutState(RecyclerView.Recycler recycler, C1314c cVar) {
        if (cVar.f4665a && !cVar.f4677m) {
            int i = cVar.f4671g;
            int i2 = cVar.f4673i;
            if (cVar.f4670f == -1) {
                recycleViewsFromEnd(recycler, i, i2);
            } else {
                recycleViewsFromStart(recycler, i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(state);
        if (this.mLayoutState.f4670f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    /* access modifiers changed from: package-private */
    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        int i3;
        this.mLayoutState.f4667c = this.mOrientationHelper.mo7468d() - i2;
        C1314c cVar = this.mLayoutState;
        if (this.mShouldReverseLayout) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        cVar.f4669e = i3;
        this.mLayoutState.f4668d = i;
        this.mLayoutState.f4670f = 1;
        this.mLayoutState.f4666b = i2;
        this.mLayoutState.f4671g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        int i3;
        this.mLayoutState.f4667c = i2 - this.mOrientationHelper.mo7466c();
        this.mLayoutState.f4668d = i;
        C1314c cVar = this.mLayoutState;
        if (this.mShouldReverseLayout) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        cVar.f4669e = i3;
        this.mLayoutState.f4670f = -1;
        this.mLayoutState.f4666b = i2;
        this.mLayoutState.f4671g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i, RecyclerView.LayoutManager.AbstractC1326a aVar) {
        int i2;
        boolean z;
        SavedState savedState = this.mPendingSavedState;
        int i3 = -1;
        if (savedState == null || !savedState.mo6656a()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = this.mPendingSavedState.f4655c;
            i2 = this.mPendingSavedState.f4653a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            aVar.mo7063b(i2, 0);
            i2 += i3;
        }
    }

    /* access modifiers changed from: package-private */
    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        char c;
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.mo7461a(getChildAt(i)) < this.mOrientationHelper.mo7466c()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.mo7336a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.mo7336a(i, i2, i4, i3);
    }

    private boolean updateAnchorFromPendingData(RecyclerView.State state, C1312a aVar) {
        int i;
        boolean z;
        int i2;
        boolean z2 = false;
        if (!state.isPreLayout() && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= state.getItemCount()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                aVar.f4657b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.mo6656a()) {
                    aVar.f4659d = this.mPendingSavedState.f4655c;
                    if (aVar.f4659d) {
                        aVar.f4658c = this.mOrientationHelper.mo7468d() - this.mPendingSavedState.f4654b;
                    } else {
                        aVar.f4658c = this.mOrientationHelper.mo7466c() + this.mPendingSavedState.f4654b;
                    }
                    return true;
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition == null) {
                        if (getChildCount() > 0) {
                            if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.mShouldReverseLayout) {
                                z2 = true;
                            }
                            aVar.f4659d = z2;
                        }
                        aVar.mo6667b();
                    } else if (this.mOrientationHelper.mo7471e(findViewByPosition) > this.mOrientationHelper.mo7472f()) {
                        aVar.mo6667b();
                        return true;
                    } else if (this.mOrientationHelper.mo7461a(findViewByPosition) - this.mOrientationHelper.mo7466c() < 0) {
                        aVar.f4658c = this.mOrientationHelper.mo7466c();
                        aVar.f4659d = false;
                        return true;
                    } else if (this.mOrientationHelper.mo7468d() - this.mOrientationHelper.mo7465b(findViewByPosition) < 0) {
                        aVar.f4658c = this.mOrientationHelper.mo7468d();
                        aVar.f4659d = true;
                        return true;
                    } else {
                        if (aVar.f4659d) {
                            i2 = this.mOrientationHelper.mo7465b(findViewByPosition) + this.mOrientationHelper.mo7464b();
                        } else {
                            i2 = this.mOrientationHelper.mo7461a(findViewByPosition);
                        }
                        aVar.f4658c = i2;
                    }
                    return true;
                } else {
                    aVar.f4659d = this.mShouldReverseLayout;
                    if (this.mShouldReverseLayout) {
                        aVar.f4658c = this.mOrientationHelper.mo7468d() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f4658c = this.mOrientationHelper.mo7466c() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View findViewByPosition;
        int i8;
        int i9;
        int i10 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && state.getItemCount() == 0) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.mo6656a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f4653a;
        }
        ensureLayoutState();
        this.mLayoutState.f4665a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        if (!this.mAnchorInfo.f4660e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            this.mAnchorInfo.mo6664a();
            this.mAnchorInfo.f4659d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(recycler, state, this.mAnchorInfo);
            this.mAnchorInfo.f4660e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.mo7461a(focusedChild) >= this.mOrientationHelper.mo7468d() || this.mOrientationHelper.mo7465b(focusedChild) <= this.mOrientationHelper.mo7466c())) {
            this.mAnchorInfo.mo6665a(focusedChild, getPosition(focusedChild));
        }
        C1314c cVar = this.mLayoutState;
        if (cVar.f4675k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        cVar.f4670f = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.mo7466c();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo7474g();
        if (!(!state.isPreLayout() || (i7 = this.mPendingScrollPosition) == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE || (findViewByPosition = findViewByPosition(i7)) == null)) {
            if (this.mShouldReverseLayout) {
                i8 = this.mOrientationHelper.mo7468d() - this.mOrientationHelper.mo7465b(findViewByPosition);
                i9 = this.mPendingScrollPositionOffset;
            } else {
                i9 = this.mOrientationHelper.mo7461a(findViewByPosition) - this.mOrientationHelper.mo7466c();
                i8 = this.mPendingScrollPositionOffset;
            }
            int i11 = i8 - i9;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        if (!this.mAnchorInfo.f4659d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i10 = 1;
        }
        onAnchorReady(recycler, state, this.mAnchorInfo, i10);
        detachAndScrapAttachedViews(recycler);
        this.mLayoutState.f4677m = resolveIsInfinite();
        this.mLayoutState.f4674j = state.isPreLayout();
        this.mLayoutState.f4673i = 0;
        if (this.mAnchorInfo.f4659d) {
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.f4672h = max;
            fill(recycler, this.mLayoutState, state, false);
            i3 = this.mLayoutState.f4666b;
            int i12 = this.mLayoutState.f4668d;
            if (this.mLayoutState.f4667c > 0) {
                max2 += this.mLayoutState.f4667c;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.f4672h = max2;
            this.mLayoutState.f4668d += this.mLayoutState.f4669e;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.f4666b;
            if (this.mLayoutState.f4667c > 0) {
                int i13 = this.mLayoutState.f4667c;
                updateLayoutStateToFillStart(i12, i3);
                this.mLayoutState.f4672h = i13;
                fill(recycler, this.mLayoutState, state, false);
                i3 = this.mLayoutState.f4666b;
            }
        } else {
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            this.mLayoutState.f4672h = max2;
            fill(recycler, this.mLayoutState, state, false);
            i2 = this.mLayoutState.f4666b;
            int i14 = this.mLayoutState.f4668d;
            if (this.mLayoutState.f4667c > 0) {
                max += this.mLayoutState.f4667c;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            this.mLayoutState.f4672h = max;
            this.mLayoutState.f4668d += this.mLayoutState.f4669e;
            fill(recycler, this.mLayoutState, state, false);
            i3 = this.mLayoutState.f4666b;
            if (this.mLayoutState.f4667c > 0) {
                int i15 = this.mLayoutState.f4667c;
                updateLayoutStateToFillEnd(i14, i2);
                this.mLayoutState.f4672h = i15;
                fill(recycler, this.mLayoutState, state, false);
                i2 = this.mLayoutState.f4666b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap = fixLayoutEndGap(i2, recycler, state, true);
                i6 = i3 + fixLayoutEndGap;
                i4 = i2 + fixLayoutEndGap;
                i5 = fixLayoutStartGap(i6, recycler, state, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i3, recycler, state, true);
                i6 = i3 + fixLayoutStartGap;
                i4 = i2 + fixLayoutStartGap;
                i5 = fixLayoutEndGap(i4, recycler, state, false);
            }
            i3 = i6 + i5;
            i2 = i4 + i5;
        }
        layoutForPredictiveAnimations(recycler, state, i3, i2);
        if (!state.isPreLayout()) {
            this.mOrientationHelper.mo7462a();
        } else {
            this.mAnchorInfo.mo6664a();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    private void recycleChildren(RecyclerView.Recycler recycler, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, recycler);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, recycler);
                i--;
            }
        }
    }

    private void updateAnchorInfoForLayout(RecyclerView.Recycler recycler, RecyclerView.State state, C1312a aVar) {
        int i;
        if (!updateAnchorFromPendingData(state, aVar) && !updateAnchorFromChildren(recycler, state, aVar)) {
            aVar.mo6667b();
            if (this.mStackFromEnd) {
                i = state.getItemCount() - 1;
            } else {
                i = 0;
            }
            aVar.f4657b = i;
        }
    }

    /* access modifiers changed from: package-private */
    public void collectPrefetchPositionsForLayoutState(RecyclerView.State state, C1314c cVar, RecyclerView.LayoutManager.AbstractC1326a aVar) {
        int i = cVar.f4668d;
        if (i >= 0 && i < state.getItemCount()) {
            aVar.mo7063b(i, Math.max(0, cVar.f4671g));
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo = new C1312a();
        this.mLayoutChunkResult = new C1313b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    /* access modifiers changed from: package-private */
    public int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f4665a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, state);
        int fill = this.mLayoutState.f4671g + fill(recycler, this.mLayoutState, state, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.mo7463a(-i);
        this.mLayoutState.f4675k = i;
        return i;
    }

    private void recycleViewsFromEnd(RecyclerView.Recycler recycler, int i, int i2) {
        int childCount = getChildCount();
        if (i >= 0) {
            int e = (this.mOrientationHelper.mo7470e() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.mo7461a(childAt) < e || this.mOrientationHelper.mo7469d(childAt) < e) {
                        recycleChildren(recycler, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.mo7461a(childAt2) < e || this.mOrientationHelper.mo7469d(childAt2) < e) {
                    recycleChildren(recycler, i4, i5);
                    return;
                }
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.Recycler recycler, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                int i4 = childCount - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View childAt = getChildAt(i5);
                    if (this.mOrientationHelper.mo7465b(childAt) > i3 || this.mOrientationHelper.mo7467c(childAt) > i3) {
                        recycleChildren(recycler, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (this.mOrientationHelper.mo7465b(childAt2) > i3 || this.mOrientationHelper.mo7467c(childAt2) > i3) {
                    recycleChildren(recycler, 0, i6);
                    return;
                }
            }
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.Recycler recycler, RecyclerView.State state, C1312a aVar) {
        View view;
        int i;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.mo6666a(focusedChild, state)) {
            aVar.mo6665a(focusedChild, getPosition(focusedChild));
            return true;
        } else if (this.mLastStackFromEnd != this.mStackFromEnd) {
            return false;
        } else {
            if (aVar.f4659d) {
                view = findReferenceChildClosestToEnd(recycler, state);
            } else {
                view = findReferenceChildClosestToStart(recycler, state);
            }
            if (view == null) {
                return false;
            }
            aVar.mo6668b(view, getPosition(view));
            if (!state.isPreLayout() && supportsPredictiveItemAnimations()) {
                if (this.mOrientationHelper.mo7461a(view) >= this.mOrientationHelper.mo7468d() || this.mOrientationHelper.mo7465b(view) < this.mOrientationHelper.mo7466c()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f4659d) {
                        i = this.mOrientationHelper.mo7468d();
                    } else {
                        i = this.mOrientationHelper.mo7466c();
                    }
                    aVar.f4658c = i;
                }
            }
            return true;
        }
    }

    private int fixLayoutEndGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int d;
        int d2 = this.mOrientationHelper.mo7468d() - i;
        if (d2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-d2, recycler, state);
        int i3 = i + i2;
        if (!z || (d = this.mOrientationHelper.mo7468d() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo7463a(d);
        return d + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int c;
        int c2 = i - this.mOrientationHelper.mo7466c();
        if (c2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(c2, recycler, state);
        int i3 = i + i2;
        if (!z || (c = i3 - this.mOrientationHelper.mo7466c()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.mo7463a(-c);
        return i2 - c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.AbstractC1326a aVar) {
        int i3;
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            updateLayoutState(i3, Math.abs(i), true, state);
            collectPrefetchPositionsForLayoutState(state, this.mLayoutState, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        int i3;
        ensureLayoutState();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.mo7336a(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.mo7336a(i, i2, i3, i4);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo = new C1312a();
        this.mLayoutChunkResult = new C1313b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.LayoutManager.C1327b properties = getProperties(context, attributeSet, i, i2);
        setOrientation(properties.f4689a);
        setReverseLayout(properties.f4691c);
        setStackFromEnd(properties.f4692d);
    }

    /* access modifiers changed from: package-private */
    public int fill(RecyclerView.Recycler recycler, C1314c cVar, RecyclerView.State state, boolean z) {
        int i = cVar.f4667c;
        if (cVar.f4671g != Integer.MIN_VALUE) {
            if (cVar.f4667c < 0) {
                cVar.f4671g += cVar.f4667c;
            }
            recycleByLayoutState(recycler, cVar);
        }
        int i2 = cVar.f4667c + cVar.f4672h;
        C1313b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f4677m && i2 <= 0) || !cVar.mo6674a(state)) {
                break;
            }
            bVar.mo6670a();
            layoutChunk(recycler, state, cVar, bVar);
            if (!bVar.f4662b) {
                cVar.f4666b += bVar.f4661a * cVar.f4670f;
                if (!bVar.f4663c || cVar.f4676l != null || !state.isPreLayout()) {
                    cVar.f4667c -= bVar.f4661a;
                    i2 -= bVar.f4661a;
                }
                if (cVar.f4671g != Integer.MIN_VALUE) {
                    cVar.f4671g += bVar.f4661a;
                    if (cVar.f4667c < 0) {
                        cVar.f4671g += cVar.f4667c;
                    }
                    recycleByLayoutState(recycler, cVar);
                }
                if (z && bVar.f4664d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f4667c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int convertFocusDirectionToLayoutDirection;
        View view2;
        View view3;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (((float) this.mOrientationHelper.mo7472f()) * 0.33333334f), false, state);
        this.mLayoutState.f4671g = Integer.MIN_VALUE;
        this.mLayoutState.f4665a = false;
        fill(recycler, this.mLayoutState, state, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            view3 = getChildClosestToStart();
        } else {
            view3 = getChildClosestToEnd();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.AbstractC1310e
    public void prepareForDrop(View view, View view2, int i, int i2) {
        char c;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            c = 1;
        } else {
            c = 65535;
        }
        if (this.mShouldReverseLayout) {
            if (c == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7468d() - (this.mOrientationHelper.mo7461a(view2) + this.mOrientationHelper.mo7471e(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7468d() - this.mOrientationHelper.mo7465b(view2));
            }
        } else if (c == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7461a(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo7465b(view2) - this.mOrientationHelper.mo7471e(view));
        }
    }

    private void layoutForPredictiveAnimations(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        boolean z;
        if (state.willRunPredictiveAnimations() && getChildCount() != 0 && !state.isPreLayout() && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> scrapList = recycler.getScrapList();
            int size = scrapList.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.ViewHolder viewHolder = scrapList.get(i5);
                if (!viewHolder.isRemoved()) {
                    char c = 1;
                    if (viewHolder.getLayoutPosition() < position) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.mShouldReverseLayout) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.mOrientationHelper.mo7471e(viewHolder.itemView);
                    } else {
                        i4 += this.mOrientationHelper.mo7471e(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.f4676l = scrapList;
            if (i3 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                this.mLayoutState.f4672h = i3;
                this.mLayoutState.f4667c = 0;
                this.mLayoutState.mo6672a();
                fill(recycler, this.mLayoutState, state, false);
            }
            if (i4 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                this.mLayoutState.f4672h = i4;
                this.mLayoutState.f4667c = 0;
                this.mLayoutState.mo6672a();
                fill(recycler, this.mLayoutState, state, false);
            }
            this.mLayoutState.f4676l = null;
        }
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.State state) {
        int i3;
        int i4;
        this.mLayoutState.f4677m = resolveIsInfinite();
        this.mLayoutState.f4670f = i;
        int[] iArr = this.mReusableIntPair;
        boolean z2 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(state, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i == 1) {
            z2 = true;
        }
        C1314c cVar = this.mLayoutState;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar.f4672h = i3;
        C1314c cVar2 = this.mLayoutState;
        if (!z2) {
            max = max2;
        }
        cVar2.f4673i = max;
        if (z2) {
            this.mLayoutState.f4672h += this.mOrientationHelper.mo7474g();
            View childClosestToEnd = getChildClosestToEnd();
            C1314c cVar3 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i5 = -1;
            }
            cVar3.f4669e = i5;
            this.mLayoutState.f4668d = getPosition(childClosestToEnd) + this.mLayoutState.f4669e;
            this.mLayoutState.f4666b = this.mOrientationHelper.mo7465b(childClosestToEnd);
            i4 = this.mOrientationHelper.mo7465b(childClosestToEnd) - this.mOrientationHelper.mo7468d();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f4672h += this.mOrientationHelper.mo7466c();
            C1314c cVar4 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i5 = -1;
            }
            cVar4.f4669e = i5;
            this.mLayoutState.f4668d = getPosition(childClosestToStart) + this.mLayoutState.f4669e;
            this.mLayoutState.f4666b = this.mOrientationHelper.mo7461a(childClosestToStart);
            i4 = (-this.mOrientationHelper.mo7461a(childClosestToStart)) + this.mOrientationHelper.mo7466c();
        }
        this.mLayoutState.f4667c = i2;
        if (z) {
            this.mLayoutState.f4667c -= i4;
        }
        this.mLayoutState.f4671g = i4;
    }

    /* access modifiers changed from: package-private */
    public void layoutChunk(RecyclerView.Recycler recycler, RecyclerView.State state, C1314c cVar, C1313b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        View a = cVar.mo6671a(recycler);
        if (a == null) {
            bVar.f4662b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) a.getLayoutParams();
        if (cVar.f4676l == null) {
            boolean z3 = this.mShouldReverseLayout;
            if (cVar.f4670f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(a);
            } else {
                addView(a, 0);
            }
        } else {
            boolean z4 = this.mShouldReverseLayout;
            if (cVar.f4670f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                addDisappearingView(a);
            } else {
                addDisappearingView(a, 0);
            }
        }
        measureChildWithMargins(a, 0, 0);
        bVar.f4661a = this.mOrientationHelper.mo7471e(a);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                i5 = getWidth() - getPaddingRight();
                i4 = i5 - this.mOrientationHelper.mo7473f(a);
            } else {
                i4 = getPaddingLeft();
                i5 = this.mOrientationHelper.mo7473f(a) + i4;
            }
            if (cVar.f4670f == -1) {
                int i6 = cVar.f4666b;
                i3 = cVar.f4666b - bVar.f4661a;
                i2 = i5;
                i = i6;
            } else {
                int i7 = cVar.f4666b;
                i = cVar.f4666b + bVar.f4661a;
                i2 = i5;
                i3 = i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.mOrientationHelper.mo7473f(a) + paddingTop;
            if (cVar.f4670f == -1) {
                int i8 = cVar.f4666b;
                i3 = paddingTop;
                i2 = i8;
                i = f;
                i4 = cVar.f4666b - bVar.f4661a;
            } else {
                int i9 = cVar.f4666b;
                i2 = cVar.f4666b + bVar.f4661a;
                i3 = paddingTop;
                i = f;
                i4 = i9;
            }
        }
        layoutDecoratedWithMargins(a, i4, i3, i2, i);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            bVar.f4663c = true;
        }
        bVar.f4664d = a.hasFocusable();
    }

    /* access modifiers changed from: package-private */
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
            if (position >= 0 && position < i3) {
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

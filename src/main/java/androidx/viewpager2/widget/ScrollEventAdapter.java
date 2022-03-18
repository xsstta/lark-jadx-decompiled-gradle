package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* access modifiers changed from: package-private */
public final class ScrollEventAdapter extends RecyclerView.OnScrollListener {
    private int mAdapterState;
    private ViewPager2.AbstractC1603e mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;
    private final LinearLayoutManager mLayoutManager;
    private final RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private C1593a mScrollValues = new C1593a();
    private int mTarget;
    private final ViewPager2 mViewPager;

    /* access modifiers changed from: package-private */
    public void notifyDataSetChangeHappened() {
        this.mDataSetChangeHappened = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ScrollEventAdapter$a */
    public static final class C1593a {

        /* renamed from: a */
        int f5562a;

        /* renamed from: b */
        float f5563b;

        /* renamed from: c */
        int f5564c;

        C1593a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8280a() {
            this.f5562a = -1;
            this.f5563b = BitmapDescriptorFactory.HUE_RED;
            this.f5564c = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public int getScrollState() {
        return this.mScrollState;
    }

    /* access modifiers changed from: package-private */
    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    private int getPosition() {
        return this.mLayoutManager.findFirstVisibleItemPosition();
    }

    /* access modifiers changed from: package-private */
    public boolean isDragging() {
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean isIdle() {
        if (this.mScrollState == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void notifyBeginFakeDrag() {
        this.mAdapterState = 4;
        startDrag(true);
    }

    private boolean isInAnyDraggingState() {
        int i = this.mAdapterState;
        if (i == 1 || i == 4) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public double getRelativeScrollPosition() {
        updateScrollEventValues();
        return ((double) this.mScrollValues.f5562a) + ((double) this.mScrollValues.f5563b);
    }

    private void resetState() {
        this.mAdapterState = 0;
        this.mScrollState = 0;
        this.mScrollValues.mo8280a();
        this.mDragStartPosition = -1;
        this.mTarget = -1;
        this.mDispatchSelected = false;
        this.mScrollHappened = false;
        this.mFakeDragging = false;
        this.mDataSetChangeHappened = false;
    }

    /* access modifiers changed from: package-private */
    public void notifyEndFakeDrag() {
        if (!isDragging() || this.mFakeDragging) {
            this.mFakeDragging = false;
            updateScrollEventValues();
            if (this.mScrollValues.f5564c == 0) {
                if (this.mScrollValues.f5562a != this.mDragStartPosition) {
                    dispatchSelected(this.mScrollValues.f5562a);
                }
                dispatchStateChanged(0);
                resetState();
                return;
            }
            dispatchStateChanged(2);
        }
    }

    private void updateScrollEventValues() {
        boolean z;
        int i;
        float f;
        C1593a aVar = this.mScrollValues;
        aVar.f5562a = this.mLayoutManager.findFirstVisibleItemPosition();
        if (aVar.f5562a == -1) {
            aVar.mo8280a();
            return;
        }
        View findViewByPosition = this.mLayoutManager.findViewByPosition(aVar.f5562a);
        if (findViewByPosition == null) {
            aVar.mo8280a();
            return;
        }
        int leftDecorationWidth = this.mLayoutManager.getLeftDecorationWidth(findViewByPosition);
        int rightDecorationWidth = this.mLayoutManager.getRightDecorationWidth(findViewByPosition);
        int topDecorationHeight = this.mLayoutManager.getTopDecorationHeight(findViewByPosition);
        int bottomDecorationHeight = this.mLayoutManager.getBottomDecorationHeight(findViewByPosition);
        ViewGroup.LayoutParams layoutParams = findViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = findViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = findViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.mLayoutManager.getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = (findViewByPosition.getLeft() - leftDecorationWidth) - this.mRecyclerView.getPaddingLeft();
            if (this.mViewPager.isRtl()) {
                i = -i;
            }
            height = width;
        } else {
            i = (findViewByPosition.getTop() - topDecorationHeight) - this.mRecyclerView.getPaddingTop();
        }
        aVar.f5564c = -i;
        if (aVar.f5564c >= 0) {
            if (height == 0) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = ((float) aVar.f5564c) / ((float) height);
            }
            aVar.f5563b = f;
        } else if (new C1612a(this.mLayoutManager).mo8356a()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f5564c)));
        }
    }

    /* access modifiers changed from: package-private */
    public void setOnPageChangeCallback(ViewPager2.AbstractC1603e eVar) {
        this.mCallback = eVar;
    }

    private void dispatchSelected(int i) {
        ViewPager2.AbstractC1603e eVar = this.mCallback;
        if (eVar != null) {
            eVar.onPageSelected(i);
        }
    }

    ScrollEventAdapter(ViewPager2 viewPager2) {
        this.mViewPager = viewPager2;
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        this.mRecyclerView = recyclerView;
        this.mLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        resetState();
    }

    private void dispatchStateChanged(int i) {
        if ((this.mAdapterState != 3 || this.mScrollState != 0) && this.mScrollState != i) {
            this.mScrollState = i;
            ViewPager2.AbstractC1603e eVar = this.mCallback;
            if (eVar != null) {
                eVar.onPageScrollStateChanged(i);
            }
        }
    }

    private void startDrag(boolean z) {
        int i;
        this.mFakeDragging = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.mAdapterState = i;
        int i2 = this.mTarget;
        if (i2 != -1) {
            this.mDragStartPosition = i2;
            this.mTarget = -1;
        } else if (this.mDragStartPosition == -1) {
            this.mDragStartPosition = getPosition();
        }
        dispatchStateChanged(1);
    }

    /* access modifiers changed from: package-private */
    public void notifyProgrammaticScroll(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.mAdapterState = i2;
        boolean z2 = false;
        this.mFakeDragging = false;
        if (this.mTarget != i) {
            z2 = true;
        }
        this.mTarget = i;
        dispatchStateChanged(2);
        if (z2) {
            dispatchSelected(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        boolean z = true;
        if (!(this.mAdapterState == 1 && this.mScrollState == 1) && i == 1) {
            startDrag(false);
        } else if (!isInAnyDraggingState() || i != 2) {
            if (isInAnyDraggingState() && i == 0) {
                updateScrollEventValues();
                if (!this.mScrollHappened) {
                    if (this.mScrollValues.f5562a != -1) {
                        dispatchScrolled(this.mScrollValues.f5562a, BitmapDescriptorFactory.HUE_RED, 0);
                    }
                } else if (this.mScrollValues.f5564c != 0) {
                    z = false;
                } else if (this.mDragStartPosition != this.mScrollValues.f5562a) {
                    dispatchSelected(this.mScrollValues.f5562a);
                }
                if (z) {
                    dispatchStateChanged(0);
                    resetState();
                }
            }
            if (this.mAdapterState == 2 && i == 0 && this.mDataSetChangeHappened) {
                updateScrollEventValues();
                if (this.mScrollValues.f5564c == 0) {
                    if (this.mTarget != this.mScrollValues.f5562a) {
                        if (this.mScrollValues.f5562a == -1) {
                            i2 = 0;
                        } else {
                            i2 = this.mScrollValues.f5562a;
                        }
                        dispatchSelected(i2);
                    }
                    dispatchStateChanged(0);
                    resetState();
                }
            }
        } else if (this.mScrollHappened) {
            dispatchStateChanged(2);
            this.mDispatchSelected = true;
        }
    }

    private void dispatchScrolled(int i, float f, int i2) {
        ViewPager2.AbstractC1603e eVar = this.mCallback;
        if (eVar != null) {
            eVar.onPageScrolled(i, f, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r5 == r3.mViewPager.isRtl()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ScrollEventAdapter.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

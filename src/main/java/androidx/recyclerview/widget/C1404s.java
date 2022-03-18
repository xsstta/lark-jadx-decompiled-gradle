package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.recyclerview.widget.s */
public class C1404s extends AbstractC1409v {
    private AbstractC1401r mHorizontalHelper;
    private AbstractC1401r mVerticalHelper;

    private AbstractC1401r getHorizontalHelper(RecyclerView.LayoutManager layoutManager) {
        AbstractC1401r rVar = this.mHorizontalHelper;
        if (rVar == null || rVar.f4948a != layoutManager) {
            this.mHorizontalHelper = AbstractC1401r.m6390a(layoutManager);
        }
        return this.mHorizontalHelper;
    }

    private AbstractC1401r getOrientationHelper(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return getVerticalHelper(layoutManager);
        }
        if (layoutManager.canScrollHorizontally()) {
            return getHorizontalHelper(layoutManager);
        }
        return null;
    }

    private AbstractC1401r getVerticalHelper(RecyclerView.LayoutManager layoutManager) {
        AbstractC1401r rVar = this.mVerticalHelper;
        if (rVar == null || rVar.f4948a != layoutManager) {
            this.mVerticalHelper = AbstractC1401r.m6392b(layoutManager);
        }
        return this.mVerticalHelper;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.AbstractC1409v
    public LinearSmoothScroller createSnapScroller(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.AbstractC1331b)) {
            return null;
        }
        return new LinearSmoothScroller(this.mRecyclerView.getContext()) {
            /* class androidx.recyclerview.widget.C1404s.C14051 */

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public int calculateTimeForScrolling(int i) {
                return Math.min(100, super.calculateTimeForScrolling(i));
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
            public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.C1330a aVar) {
                C1404s sVar = C1404s.this;
                int[] calculateDistanceToFinalSnap = sVar.calculateDistanceToFinalSnap(sVar.mRecyclerView.getLayoutManager(), view);
                int i = calculateDistanceToFinalSnap[0];
                int i2 = calculateDistanceToFinalSnap[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    aVar.mo7146a(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        };
    }

    @Override // androidx.recyclerview.widget.AbstractC1409v
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return findCenterView(layoutManager, getVerticalHelper(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return findCenterView(layoutManager, getHorizontalHelper(layoutManager));
        }
        return null;
    }

    private boolean isReverseLayout(RecyclerView.LayoutManager layoutManager) {
        PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.AbstractC1331b) || (computeScrollVectorForPosition = ((RecyclerView.SmoothScroller.AbstractC1331b) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        if (computeScrollVectorForPosition.x < BitmapDescriptorFactory.HUE_RED || computeScrollVectorForPosition.y < BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        return false;
    }

    private View findCenterView(RecyclerView.LayoutManager layoutManager, AbstractC1401r rVar) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int c = rVar.mo7466c() + (rVar.mo7472f() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int abs = Math.abs((rVar.mo7461a(childAt) + (rVar.mo7471e(childAt) / 2)) - c);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.AbstractC1409v
    public int[] calculateDistanceToFinalSnap(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(layoutManager, view, getHorizontalHelper(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = distanceToCenter(layoutManager, view, getVerticalHelper(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    private int distanceToCenter(RecyclerView.LayoutManager layoutManager, View view, AbstractC1401r rVar) {
        return (rVar.mo7461a(view) + (rVar.mo7471e(view) / 2)) - (rVar.mo7466c() + (rVar.mo7472f() / 2));
    }

    private boolean isForwardFling(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        if (layoutManager.canScrollHorizontally()) {
            if (i > 0) {
                return true;
            }
            return false;
        } else if (i2 > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1409v
    public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        AbstractC1401r orientationHelper;
        int i3;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (orientationHelper = getOrientationHelper(layoutManager)) == null) {
            return -1;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int childCount = layoutManager.getChildCount();
        View view = null;
        View view2 = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = layoutManager.getChildAt(i6);
            if (childAt != null) {
                int distanceToCenter = distanceToCenter(layoutManager, childAt, orientationHelper);
                if (distanceToCenter <= 0 && distanceToCenter > i4) {
                    view2 = childAt;
                    i4 = distanceToCenter;
                }
                if (distanceToCenter >= 0 && distanceToCenter < i5) {
                    view = childAt;
                    i5 = distanceToCenter;
                }
            }
        }
        boolean isForwardFling = isForwardFling(layoutManager, i, i2);
        if (isForwardFling && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!(isForwardFling || view2 == null)) {
            return layoutManager.getPosition(view2);
        }
        if (isForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view);
        if (isReverseLayout(layoutManager) == isForwardFling) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = position + i3;
        if (i7 < 0 || i7 >= itemCount) {
            return -1;
        }
        return i7;
    }
}

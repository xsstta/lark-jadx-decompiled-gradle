package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class LinearSmoothScroller extends RecyclerView.SmoothScroller {
    protected final DecelerateInterpolator mDecelerateInterpolator = new DecelerateInterpolator();
    private final DisplayMetrics mDisplayMetrics;
    private boolean mHasCalculatedMillisPerPixel = false;
    protected int mInterimTargetDx = 0;
    protected int mInterimTargetDy = 0;
    protected final LinearInterpolator mLinearInterpolator = new LinearInterpolator();
    private float mMillisPerPixel;
    protected PointF mTargetVector;

    private int clampApplyScroll(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStart() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
        this.mInterimTargetDy = 0;
        this.mInterimTargetDx = 0;
        this.mTargetVector = null;
    }

    private float getSpeedPerPixel() {
        if (!this.mHasCalculatedMillisPerPixel) {
            this.mMillisPerPixel = calculateSpeedPerPixel(this.mDisplayMetrics);
            this.mHasCalculatedMillisPerPixel = true;
        }
        return this.mMillisPerPixel;
    }

    /* access modifiers changed from: protected */
    public int getHorizontalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null || pointF.x == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (this.mTargetVector.x > BitmapDescriptorFactory.HUE_RED) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getVerticalSnapPreference() {
        PointF pointF = this.mTargetVector;
        if (pointF == null || pointF.y == BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (this.mTargetVector.y > BitmapDescriptorFactory.HUE_RED) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public int calculateTimeForDeceleration(int i) {
        return (int) Math.ceil(((double) calculateTimeForScrolling(i)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int calculateTimeForScrolling(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * getSpeedPerPixel()));
    }

    public LinearSmoothScroller(Context context) {
        this.mDisplayMetrics = context.getResources().getDisplayMetrics();
    }

    /* access modifiers changed from: protected */
    public void updateActionForInterimTarget(RecyclerView.SmoothScroller.C1330a aVar) {
        PointF computeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (computeScrollVectorForPosition == null || (computeScrollVectorForPosition.x == BitmapDescriptorFactory.HUE_RED && computeScrollVectorForPosition.y == BitmapDescriptorFactory.HUE_RED)) {
            aVar.mo7145a(getTargetPosition());
            stop();
            return;
        }
        normalize(computeScrollVectorForPosition);
        this.mTargetVector = computeScrollVectorForPosition;
        this.mInterimTargetDx = (int) (computeScrollVectorForPosition.x * 10000.0f);
        this.mInterimTargetDy = (int) (computeScrollVectorForPosition.y * 10000.0f);
        aVar.mo7146a((int) (((float) this.mInterimTargetDx) * 1.2f), (int) (((float) this.mInterimTargetDy) * 1.2f), (int) (((float) calculateTimeForScrolling(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)) * 1.2f), this.mLinearInterpolator);
    }

    public int calculateDxToMakeVisible(View view, int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - layoutParams.leftMargin, layoutManager.getDecoratedRight(view) + layoutParams.rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }

    public int calculateDyToMakeVisible(View view, int i) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - layoutParams.topMargin, layoutManager.getDecoratedBottom(view) + layoutParams.bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.C1330a aVar) {
        int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int calculateTimeForDeceleration = calculateTimeForDeceleration((int) Math.sqrt((double) ((calculateDxToMakeVisible * calculateDxToMakeVisible) + (calculateDyToMakeVisible * calculateDyToMakeVisible))));
        if (calculateTimeForDeceleration > 0) {
            aVar.mo7146a(-calculateDxToMakeVisible, -calculateDyToMakeVisible, calculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.SmoothScroller.C1330a aVar) {
        if (getChildCount() == 0) {
            stop();
            return;
        }
        this.mInterimTargetDx = clampApplyScroll(this.mInterimTargetDx, i);
        int clampApplyScroll = clampApplyScroll(this.mInterimTargetDy, i2);
        this.mInterimTargetDy = clampApplyScroll;
        if (this.mInterimTargetDx == 0 && clampApplyScroll == 0) {
            updateActionForInterimTarget(aVar);
        }
    }

    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }
}

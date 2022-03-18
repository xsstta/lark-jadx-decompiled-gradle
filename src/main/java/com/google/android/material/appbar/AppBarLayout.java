package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0774a;
import androidx.core.p028b.C0745a;
import androidx.core.util.C0843d;
import androidx.core.view.C0883ab;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.AbstractC0873g;
import androidx.core.view.p029a.C0864d;
import androidx.customview.view.AbsSavedState;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.google.android.material.p980a.C22116a;
import com.google.android.material.shape.C22394h;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.AbstractC0701a {
    private static final int DEF_STYLE_RES = 2131887301;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private ValueAnimator elevationOverlayAnimator;
    private boolean haveChildWithInterpolator;
    private C0883ab lastInsets;
    private boolean liftOnScroll;
    private WeakReference<View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List<AbstractC22133a> listeners;
    private int pendingAction;
    private Drawable statusBarForeground;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    /* renamed from: com.google.android.material.appbar.AppBarLayout$a */
    public interface AbstractC22133a<T extends AppBarLayout> {
        void onOffsetChanged(T t, int i);
    }

    /* renamed from: com.google.android.material.appbar.AppBarLayout$b */
    public interface AbstractC22134b extends AbstractC22133a<AppBarLayout> {
    }

    public float getTargetElevation() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* access modifiers changed from: package-private */
    public void resetPendingAction() {
        this.pendingAction = 0;
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        public static abstract class DragCallback extends BaseBehavior.BaseDragCallback<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(BaseBehavior.BaseDragCallback baseDragCallback) {
            super.setDragCallback(baseDragCallback);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.onSaveInstanceState(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.onRestoreInstanceState(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.onLayoutChild(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.onStopNestedScroll(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.onNestedScroll(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a */
        int f53819a = 1;

        /* renamed from: b */
        Interpolator f53820b;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        /* renamed from: a */
        public int mo76391a() {
            return this.f53819a;
        }

        /* renamed from: b */
        public Interpolator mo76393b() {
            return this.f53820b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo76394c() {
            int i = this.f53819a;
            if ((i & 1) != 1 || (i & 10) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public void mo76392a(int i) {
            this.f53819a = i;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator});
            this.f53819a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f53820b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
            return super.isHorizontalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
            return super.isVerticalOffsetEnabled();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean z) {
            super.setHorizontalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean z) {
            super.setVerticalOffsetEnabled(z);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int i) {
            return super.setLeftAndRightOffset(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int i) {
            return super.setTopAndBottomOffset(i);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: b */
        public int mo76397b(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.mo76397b(view);
        }

        /* renamed from: a */
        private static int m79749a(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) appBarLayout.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                return ((BaseBehavior) behavior).getTopBottomOffsetForScrollingSibling();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: a */
        public float mo76395a(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int a = m79749a(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + a > downNestedPreScrollRange) && (i = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) a) / ((float) i)) + 1.0f;
                }
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AppBarLayout mo76398b(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.behavior_overlapTop});
            mo76467a(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        private void m79751b(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.isLiftOnScroll()) {
                    appBarLayout.setLiftedState(appBarLayout.shouldLift(view));
                }
            }
        }

        /* renamed from: a */
        private void m79750a(View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) view2.getLayoutParams()).getBehavior();
            if (behavior instanceof BaseBehavior) {
                ViewCompat.m4087i(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).offsetDelta) + mo76469b()) - mo76471c(view2));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            m79750a(view, view2);
            m79751b(view, view2);
            return false;
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.onLayoutChild(coordinatorLayout, view, i);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                ViewCompat.m4075e((View) coordinatorLayout, C0864d.C0865a.f3381m.mo4623a());
                ViewCompat.m4075e((View) coordinatorLayout, C0864d.C0865a.f3382n.mo4623a());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout a = mo76398b(coordinatorLayout.mo3950c(view));
            if (a != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f53853a;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    a.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }
    }

    public int getLiftOnScrollTargetViewId() {
        return this.liftOnScrollTargetViewId;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.pendingAction;
    }

    public Drawable getStatusBarForeground() {
        return this.statusBarForeground;
    }

    /* access modifiers changed from: package-private */
    public boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    /* access modifiers changed from: protected */
    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private static final int INVALID_POSITION = -1;
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private WeakReference<View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        public int offsetDelta;
        private int offsetToChildIndexOnLayout = -1;
        private boolean offsetToChildIndexOnLayoutIsMinHeight;
        private float offsetToChildIndexOnLayoutPerc;
        private BaseDragCallback onDragCallback;

        public static abstract class BaseDragCallback<T extends AppBarLayout> {
            public abstract boolean canDrag(T t);
        }

        private static boolean checkFlag(int i, int i2) {
            return (i & i2) == i2;
        }

        public BaseBehavior() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int getTopBottomOffsetForScrollingSibling() {
            return getTopAndBottomOffset() + this.offsetDelta;
        }

        /* access modifiers changed from: package-private */
        public boolean isOffsetAnimatorRunning() {
            ValueAnimator valueAnimator = this.offsetAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: protected */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
                /* class com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.C221321 */

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
            int f53816a;

            /* renamed from: b */
            float f53817b;

            /* renamed from: d */
            boolean f53818d;

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z;
                this.f53816a = parcel.readInt();
                this.f53817b = parcel.readFloat();
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f53818d = z;
            }

            @Override // androidx.customview.view.AbsSavedState
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.f53816a);
                parcel.writeFloat(this.f53817b);
                parcel.writeByte(this.f53818d ? (byte) 1 : 0);
            }
        }

        public void setDragCallback(BaseDragCallback baseDragCallback) {
            this.onDragCallback = baseDragCallback;
        }

        /* access modifiers changed from: package-private */
        public int getMaxDragOffset(T t) {
            return -t.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        public int getScrollRangeForDragFling(T t) {
            return t.getTotalScrollRange();
        }

        private View findFirstScrollingChild(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public boolean canDragView(T t) {
            BaseDragCallback baseDragCallback = this.onDragCallback;
            if (baseDragCallback != null) {
                return baseDragCallback.canDrag(t);
            }
            WeakReference<View> weakReference = this.lastNestedScrollingChildRef;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            if (view == null || !view.isShown() || view.canScrollVertically(-1)) {
                return false;
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: package-private */
        public void onFlingFinished(CoordinatorLayout coordinatorLayout, T t) {
            snapToChildIfNeeded(coordinatorLayout, t);
            if (t.isLiftOnScroll()) {
                t.setLiftedState(t.shouldLift(findFirstScrollingChild(coordinatorLayout)));
            }
        }

        private static View getAppBarChildOnOffset(AppBarLayout appBarLayout, int i) {
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int getChildIndexOnOffset(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (checkFlag(layoutParams.mo76391a(), 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private boolean shouldJumpElevationState(CoordinatorLayout coordinatorLayout, T t) {
            List<View> d = coordinatorLayout.mo3954d(t);
            int size = d.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) d.get(i).getLayoutParams()).getBehavior();
                if (behavior instanceof ScrollingViewBehavior) {
                    if (((ScrollingViewBehavior) behavior).mo76470c() != 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }

        private void updateAccessibilityActions(CoordinatorLayout coordinatorLayout, T t) {
            ViewCompat.m4075e((View) coordinatorLayout, C0864d.C0865a.f3381m.mo4623a());
            ViewCompat.m4075e((View) coordinatorLayout, C0864d.C0865a.f3382n.mo4623a());
            View findFirstScrollingChild = findFirstScrollingChild(coordinatorLayout);
            if (findFirstScrollingChild != null && t.getTotalScrollRange() != 0 && (((CoordinatorLayout.LayoutParams) findFirstScrollingChild.getLayoutParams()).getBehavior() instanceof ScrollingViewBehavior)) {
                addAccessibilityScrollActions(coordinatorLayout, t, findFirstScrollingChild);
            }
        }

        private int interpolateOffset(T t, int i) {
            int abs = Math.abs(i);
            int childCount = t.getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i3);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator b = layoutParams.mo76393b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i3++;
                } else if (b != null) {
                    int a = layoutParams.mo76391a();
                    if ((a & 1) != 0) {
                        i2 = 0 + childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                        if ((a & 2) != 0) {
                            i2 -= ViewCompat.m4102q(childAt);
                        }
                    }
                    if (ViewCompat.m4109x(childAt)) {
                        i2 -= t.getTopInset();
                    }
                    if (i2 > 0) {
                        float f = (float) i2;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * b.getInterpolation(((float) (abs - childAt.getTop())) / f)));
                    }
                }
            }
            return i;
        }

        private void snapToChildIfNeeded(CoordinatorLayout coordinatorLayout, T t) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int childIndexOnOffset = getChildIndexOnOffset(t, topBottomOffsetForScrollingSibling);
            if (childIndexOnOffset >= 0) {
                View childAt = t.getChildAt(childIndexOnOffset);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int a = layoutParams.mo76391a();
                if ((a & 17) == 17) {
                    int i = -childAt.getTop();
                    int i2 = -childAt.getBottom();
                    if (childIndexOnOffset == t.getChildCount() - 1) {
                        i2 += t.getTopInset();
                    }
                    if (checkFlag(a, 2)) {
                        i2 += ViewCompat.m4102q(childAt);
                    } else if (checkFlag(a, 5)) {
                        int q = ViewCompat.m4102q(childAt) + i2;
                        if (topBottomOffsetForScrollingSibling < q) {
                            i = q;
                        } else {
                            i2 = q;
                        }
                    }
                    if (checkFlag(a, 32)) {
                        i += layoutParams.topMargin;
                        i2 -= layoutParams.bottomMargin;
                    }
                    if (topBottomOffsetForScrollingSibling < (i2 + i) / 2) {
                        i = i2;
                    }
                    animateOffsetTo(coordinatorLayout, t, C0745a.m3627a(i, -t.getTotalScrollRange(), 0), BitmapDescriptorFactory.HUE_RED);
                }
            }
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable onSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, (View) t);
            int topAndBottomOffset = getTopAndBottomOffset();
            int childCount = t.getChildCount();
            boolean z = false;
            for (int i = 0; i < childCount; i++) {
                View childAt = t.getChildAt(i);
                int bottom = childAt.getBottom() + topAndBottomOffset;
                if (childAt.getTop() + topAndBottomOffset <= 0 && bottom >= 0) {
                    SavedState savedState = new SavedState(onSaveInstanceState);
                    savedState.f53816a = i;
                    if (bottom == ViewCompat.m4102q(childAt) + t.getTopInset()) {
                        z = true;
                    }
                    savedState.f53818d = z;
                    savedState.f53817b = ((float) bottom) / ((float) childAt.getHeight());
                    return savedState;
                }
            }
            return onSaveInstanceState;
        }

        private boolean canScrollChildren(CoordinatorLayout coordinatorLayout, T t, View view) {
            if (!t.hasScrollableChildren() || coordinatorLayout.getHeight() - view.getHeight() > t.getHeight()) {
                return false;
            }
            return true;
        }

        public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                SavedState savedState = (SavedState) parcelable;
                super.onRestoreInstanceState(coordinatorLayout, (View) t, savedState.mo4902a());
                this.offsetToChildIndexOnLayout = savedState.f53816a;
                this.offsetToChildIndexOnLayoutPerc = savedState.f53817b;
                this.offsetToChildIndexOnLayoutIsMinHeight = savedState.f53818d;
                return;
            }
            super.onRestoreInstanceState(coordinatorLayout, (View) t, parcelable);
            this.offsetToChildIndexOnLayout = -1;
        }

        private void addAccessibilityScrollActions(final CoordinatorLayout coordinatorLayout, final T t, final View view) {
            if (getTopBottomOffsetForScrollingSibling() != (-t.getTotalScrollRange()) && view.canScrollVertically(1)) {
                addActionToExpand(coordinatorLayout, t, C0864d.C0865a.f3381m, false);
            }
            if (getTopBottomOffsetForScrollingSibling() == 0) {
                return;
            }
            if (view.canScrollVertically(-1)) {
                final int i = -t.getDownNestedPreScrollRange();
                if (i != 0) {
                    ViewCompat.m4041a(coordinatorLayout, C0864d.C0865a.f3382n, null, new AbstractC0873g() {
                        /* class com.google.android.material.appbar.AppBarLayout.BaseBehavior.C221302 */

                        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.google.android.material.appbar.AppBarLayout$BaseBehavior */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // androidx.core.view.p029a.AbstractC0873g
                        /* renamed from: a */
                        public boolean mo4640a(View view, AbstractC0873g.AbstractC0874a aVar) {
                            BaseBehavior.this.onNestedPreScroll(coordinatorLayout, t, view, 0, i, new int[]{0, 0}, 1);
                            return true;
                        }
                    });
                    return;
                }
                return;
            }
            addActionToExpand(coordinatorLayout, t, C0864d.C0865a.f3382n, true);
        }

        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, T t, int i) {
            boolean z;
            int i2;
            boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, (View) t, i);
            int pendingAction = t.getPendingAction();
            int i3 = this.offsetToChildIndexOnLayout;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.offsetToChildIndexOnLayoutIsMinHeight) {
                    i2 = ViewCompat.m4102q(childAt) + t.getTopInset();
                } else {
                    i2 = Math.round(((float) childAt.getHeight()) * this.offsetToChildIndexOnLayoutPerc);
                }
                setHeaderTopBottomOffset(coordinatorLayout, t, i4 + i2);
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i5 = -t.getUpNestedPreScrollRange();
                    if (z) {
                        animateOffsetTo(coordinatorLayout, t, i5, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        setHeaderTopBottomOffset(coordinatorLayout, t, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z) {
                        animateOffsetTo(coordinatorLayout, t, 0, BitmapDescriptorFactory.HUE_RED);
                    } else {
                        setHeaderTopBottomOffset(coordinatorLayout, t, 0);
                    }
                }
            }
            t.resetPendingAction();
            this.offsetToChildIndexOnLayout = -1;
            setTopAndBottomOffset(C0745a.m3627a(getTopAndBottomOffset(), -t.getTotalScrollRange(), 0));
            updateAppBarLayoutDrawableState(coordinatorLayout, t, getTopAndBottomOffset(), 0, true);
            t.onOffsetChanged(getTopAndBottomOffset());
            updateAccessibilityActions(coordinatorLayout, t);
            return onLayoutChild;
        }

        private void addActionToExpand(CoordinatorLayout coordinatorLayout, final T t, C0864d.C0865a aVar, final boolean z) {
            ViewCompat.m4041a(coordinatorLayout, aVar, null, new AbstractC0873g() {
                /* class com.google.android.material.appbar.AppBarLayout.BaseBehavior.C221313 */

                @Override // androidx.core.view.p029a.AbstractC0873g
                /* renamed from: a */
                public boolean mo4640a(View view, AbstractC0873g.AbstractC0874a aVar) {
                    t.setExpanded(z);
                    return true;
                }
            });
        }

        public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.lastStartedType == 0 || i == 1) {
                snapToChildIfNeeded(coordinatorLayout, t);
                if (t.isLiftOnScroll()) {
                    t.setLiftedState(t.shouldLift(view));
                }
            }
            this.lastNestedScrollingChildRef = new WeakReference<>(view);
        }

        private void animateOffsetTo(CoordinatorLayout coordinatorLayout, T t, int i, float f) {
            int i2;
            int abs = Math.abs(getTopBottomOffsetForScrollingSibling() - i);
            float abs2 = Math.abs(f);
            if (abs2 > BitmapDescriptorFactory.HUE_RED) {
                i2 = Math.round((((float) abs) / abs2) * 1000.0f) * 3;
            } else {
                i2 = (int) (((((float) abs) / ((float) t.getHeight())) + 1.0f) * 150.0f);
            }
            animateOffsetWithDuration(coordinatorLayout, t, i, i2);
        }

        private void animateOffsetWithDuration(final CoordinatorLayout coordinatorLayout, final T t, int i, int i2) {
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            if (topBottomOffsetForScrollingSibling == i) {
                ValueAnimator valueAnimator = this.offsetAnimator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.offsetAnimator.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.offsetAnimator;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.offsetAnimator = valueAnimator3;
                valueAnimator3.setInterpolator(C22116a.f53783e);
                this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.google.android.material.appbar.AppBarLayout.BaseBehavior.C221291 */

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseBehavior.this.setHeaderTopBottomOffset(coordinatorLayout, t, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.offsetAnimator.setDuration((long) Math.min(i2, (int) MAX_OFFSET_ANIMATION_DURATION));
            this.offsetAnimator.setIntValues(topBottomOffsetForScrollingSibling, i);
            this.offsetAnimator.start();
        }

        private void updateAppBarLayoutDrawableState(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View appBarChildOnOffset = getAppBarChildOnOffset(t, i);
            if (appBarChildOnOffset != null) {
                int a = ((LayoutParams) appBarChildOnOffset.getLayoutParams()).mo76391a();
                boolean z2 = false;
                if ((a & 1) != 0) {
                    int q = ViewCompat.m4102q(appBarChildOnOffset);
                    if (i2 <= 0 || (a & 12) == 0 ? !((a & 2) == 0 || (-i) < (appBarChildOnOffset.getBottom() - q) - t.getTopInset()) : (-i) >= (appBarChildOnOffset.getBottom() - q) - t.getTopInset()) {
                        z2 = true;
                    }
                }
                if (t.isLiftOnScroll()) {
                    z2 = t.shouldLift(findFirstScrollingChild(coordinatorLayout));
                }
                boolean liftedState = t.setLiftedState(z2);
                if (z || (liftedState && shouldJumpElevationState(coordinatorLayout, t))) {
                    t.jumpDrawablesToCurrentState();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public int setHeaderTopBottomOffset(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int i4;
            int i5;
            int topBottomOffsetForScrollingSibling = getTopBottomOffsetForScrollingSibling();
            int i6 = 0;
            if (i2 == 0 || topBottomOffsetForScrollingSibling < i2 || topBottomOffsetForScrollingSibling > i3) {
                this.offsetDelta = 0;
            } else {
                int a = C0745a.m3627a(i, i2, i3);
                if (topBottomOffsetForScrollingSibling != a) {
                    if (t.hasChildWithInterpolator()) {
                        i4 = interpolateOffset(t, a);
                    } else {
                        i4 = a;
                    }
                    boolean topAndBottomOffset = setTopAndBottomOffset(i4);
                    i6 = topBottomOffsetForScrollingSibling - a;
                    this.offsetDelta = a - i4;
                    if (!topAndBottomOffset && t.hasChildWithInterpolator()) {
                        coordinatorLayout.mo3947b(t);
                    }
                    t.onOffsetChanged(getTopAndBottomOffset());
                    if (a < topBottomOffsetForScrollingSibling) {
                        i5 = -1;
                    } else {
                        i5 = 1;
                    }
                    updateAppBarLayoutDrawableState(coordinatorLayout, t, a, i5, false);
                }
            }
            updateAccessibilityActions(coordinatorLayout, t);
            return i6;
        }

        public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((CoordinatorLayout.LayoutParams) t.getLayoutParams()).height != -2) {
                return super.onMeasureChild(coordinatorLayout, (View) t, i, i2, i3, i4);
            }
            coordinatorLayout.mo3940a(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
            return true;
        }

        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            boolean z;
            ValueAnimator valueAnimator;
            if ((i & 2) == 0 || (!t.isLiftOnScroll() && !canScrollChildren(coordinatorLayout, t, view))) {
                z = false;
            } else {
                z = true;
            }
            if (z && (valueAnimator = this.offsetAnimator) != null) {
                valueAnimator.cancel();
            }
            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = i2;
            return z;
        }

        public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int i5;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i6 = -t.getTotalScrollRange();
                    i5 = i6;
                    i4 = t.getDownNestedPreScrollRange() + i6;
                } else {
                    i5 = -t.getUpNestedPreScrollRange();
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = scroll(coordinatorLayout, t, i2, i5, i4);
                }
            }
            if (t.isLiftOnScroll()) {
                t.setLiftedState(t.shouldLift(view));
            }
        }

        public void onNestedScroll(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = scroll(coordinatorLayout, t, i4, -t.getDownNestedScrollRange(), 0);
            }
            if (i4 == 0) {
                updateAccessibilityActions(coordinatorLayout, t);
            }
        }
    }

    private void invalidateScrollRanges() {
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0701a
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C22394h.m81147a(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearLiftOnScrollTargetView();
    }

    private void clearLiftOnScrollTargetView() {
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.liftOnScrollTargetView = null;
    }

    private boolean shouldDrawStatusBarForeground() {
        if (this.statusBarForeground == null || getTopInset() <= 0) {
            return false;
        }
        return true;
    }

    private void updateWillNotDraw() {
        setWillNotDraw(!shouldDrawStatusBarForeground());
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        C0883ab abVar = this.lastInsets;
        if (abVar != null) {
            return abVar.mo4644b();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean hasScrollableChildren() {
        if (getTotalScrollRange() != 0) {
            return true;
        }
        return false;
    }

    private boolean hasCollapsibleChild() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).mo76394c()) {
                return true;
            }
        }
        return false;
    }

    private boolean shouldOffsetFirstChild() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8 || ViewCompat.m4109x(childAt)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.statusBarForeground;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.widget.LinearLayout
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i = this.downScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int i4 = layoutParams.f53819a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight;
            if ((i4 & 2) != 0) {
                i3 -= ViewCompat.m4102q(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.downScrollRange = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int q = ViewCompat.m4102q(this);
        if (q == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                q = ViewCompat.m4102q(getChildAt(childCount - 1));
            } else {
                q = 0;
            }
            if (q == 0) {
                return getHeight() / 3;
            }
        }
        return (q * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i;
        int q;
        int i2 = this.downPreScrollRange;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f53819a;
            if ((i4 & 5) == 5) {
                int i5 = layoutParams.topMargin + layoutParams.bottomMargin;
                if ((i4 & 8) != 0) {
                    q = ViewCompat.m4102q(childAt);
                } else if ((i4 & 2) != 0) {
                    q = measuredHeight - ViewCompat.m4102q(childAt);
                } else {
                    i = i5 + measuredHeight;
                    if (childCount == 0 && ViewCompat.m4109x(childAt)) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                }
                i = i5 + q;
                i = Math.min(i, measuredHeight - getTopInset());
                i3 += i;
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.downPreScrollRange = max;
        return max;
    }

    public final int getTotalScrollRange() {
        int i = this.totalScrollRange;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = layoutParams.f53819a;
            if ((i4 & 1) == 0) {
                break;
            }
            i3 += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
            if (i2 == 0 && ViewCompat.m4109x(childAt)) {
                i3 -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                i3 -= ViewCompat.m4102q(childAt);
                break;
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.totalScrollRange = max;
        return max;
    }

    public void addOnOffsetChangedListener(AbstractC22134b bVar) {
        addOnOffsetChangedListener((AbstractC22133a) bVar);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void removeOnOffsetChangedListener(AbstractC22134b bVar) {
        removeOnOffsetChangedListener((AbstractC22133a) bVar);
    }

    public void setLiftOnScroll(boolean z) {
        this.liftOnScroll = z;
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C22394h.m81148a(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, ViewCompat.m4012F(this));
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.liftOnScrollTargetViewId = i;
        clearLiftOnScrollTargetView();
    }

    public boolean setLiftable(boolean z) {
        this.liftableOverride = true;
        return setLiftableState(z);
    }

    public boolean setLifted(boolean z) {
        return setLiftedState(z);
    }

    private boolean setLiftableState(boolean z) {
        if (this.liftable == z) {
            return false;
        }
        this.liftable = z;
        refreshDrawableState();
        return true;
    }

    public void removeOnOffsetChangedListener(AbstractC22133a aVar) {
        List<AbstractC22133a> list = this.listeners;
        if (list != null && aVar != null) {
            list.remove(aVar);
        }
    }

    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C0215a.m655b(getContext(), i));
    }

    public void setTargetElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C22140b.m79794a(this, f);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.statusBarForeground) {
            return true;
        }
        return false;
    }

    public void addOnOffsetChangedListener(AbstractC22133a aVar) {
        if (this.listeners == null) {
            this.listeners = new ArrayList();
        }
        if (aVar != null && !this.listeners.contains(aVar)) {
            this.listeners.add(aVar);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (shouldDrawStatusBarForeground()) {
            int save = canvas.save();
            canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) (-this.currentOffset));
            this.statusBarForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: package-private */
    public C0883ab onWindowInsetChanged(C0883ab abVar) {
        C0883ab abVar2;
        if (ViewCompat.m4109x(this)) {
            abVar2 = abVar;
        } else {
            abVar2 = null;
        }
        if (!C0843d.m3987a(this.lastInsets, abVar2)) {
            this.lastInsets = abVar2;
            updateWillNotDraw();
            requestLayout();
        }
        return abVar;
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldLift(View view) {
        View findLiftOnScrollTargetView = findLiftOnScrollTargetView(view);
        if (findLiftOnScrollTargetView != null) {
            view = findLiftOnScrollTargetView;
        }
        if (view == null || (!view.canScrollVertically(-1) && view.getScrollY() <= 0)) {
            return false;
        }
        return true;
    }

    private View findLiftOnScrollTargetView(View view) {
        int i;
        View view2;
        if (this.liftOnScrollTargetView == null && (i = this.liftOnScrollTargetViewId) != -1) {
            if (view != null) {
                view2 = view.findViewById(i);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.liftOnScrollTargetViewId);
            }
            if (view2 != null) {
                this.liftOnScrollTargetView = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.liftOnScrollTargetView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void onOffsetChanged(int i) {
        this.currentOffset = i;
        if (!willNotDraw()) {
            ViewCompat.m4073e(this);
        }
        List<AbstractC22133a> list = this.listeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC22133a aVar = this.listeners.get(i2);
                if (aVar != null) {
                    aVar.onOffsetChanged(this, i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean setLiftedState(boolean z) {
        if (this.lifted == z) {
            return false;
        }
        this.lifted = z;
        refreshDrawableState();
        if (!this.liftOnScroll || !(getBackground() instanceof MaterialShapeDrawable)) {
            return true;
        }
        startLiftOnScrollElevationOverlayAnimation((MaterialShapeDrawable) getBackground(), z);
        return true;
    }

    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }
        int[] iArr = this.tmpStatesArray;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        boolean z = this.liftable;
        if (z) {
            i2 = R.attr.state_liftable;
        } else {
            i2 = -2130970289;
        }
        iArr[0] = i2;
        if (!z || !this.lifted) {
            i3 = -2130970290;
        } else {
            i3 = R.attr.state_lifted;
        }
        iArr[1] = i3;
        if (z) {
            i4 = R.attr.state_collapsible;
        } else {
            i4 = -2130970287;
        }
        iArr[2] = i4;
        if (!z || !this.lifted) {
            i5 = -2130970286;
        } else {
            i5 = R.attr.state_collapsed;
        }
        iArr[3] = i5;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.statusBarForeground;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.statusBarForeground = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.statusBarForeground.setState(getDrawableState());
                }
                C0774a.m3774b(this.statusBarForeground, ViewCompat.m4082h(this));
                Drawable drawable4 = this.statusBarForeground;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable4.setVisible(z, false);
                this.statusBarForeground.setCallback(this);
            }
            updateWillNotDraw();
            ViewCompat.m4073e(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.widget.LinearLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public void setExpanded(boolean z, boolean z2) {
        setExpanded(z, z2, true);
    }

    public static int INVOKEVIRTUAL_com_google_android_material_appbar_AppBarLayout_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    private void startLiftOnScrollElevationOverlayAnimation(final MaterialShapeDrawable materialShapeDrawable, boolean z) {
        float f;
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        if (z) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = dimension;
        }
        if (!z) {
            dimension = BitmapDescriptorFactory.HUE_RED;
        }
        ValueAnimator valueAnimator = this.elevationOverlayAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
        this.elevationOverlayAnimator = ofFloat;
        ofFloat.setDuration((long) INVOKEVIRTUAL_com_google_android_material_appbar_AppBarLayout_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(getResources(), R.integer.app_bar_elevation_anim_duration));
        this.elevationOverlayAnimator.setInterpolator(C22116a.f53779a);
        this.elevationOverlayAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.google.android.material.appbar.AppBarLayout.C221282 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                materialShapeDrawable.mo77985r(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.elevationOverlayAnimator.start();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && ViewCompat.m4109x(this) && shouldOffsetFirstChild()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C0745a.m3627a(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        invalidateScrollRanges();
    }

    private void setExpanded(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        int i3 = 0;
        if (z2) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        int i4 = i | i2;
        if (z3) {
            i3 = 8;
        }
        this.pendingAction = i4 | i3;
        requestLayout();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppBarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (ViewCompat.m4109x(this) && shouldOffsetFirstChild()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                ViewCompat.m4087i(getChildAt(childCount), topInset);
            }
        }
        invalidateScrollRanges();
        this.haveChildWithInterpolator = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i5).getLayoutParams()).mo76393b() != null) {
                this.haveChildWithInterpolator = true;
                break;
            } else {
                i5++;
            }
        }
        Drawable drawable = this.statusBarForeground;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.liftableOverride) {
            if (!this.liftOnScroll && !hasCollapsibleChild()) {
                z2 = false;
            }
            setLiftableState(z2);
        }
    }
}

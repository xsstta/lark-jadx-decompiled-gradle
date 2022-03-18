package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
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

public class ViewPager extends ViewGroup {
    private static final Comparator<C1576a> COMPARATOR = new Comparator<C1576a>() {
        /* class androidx.viewpager.widget.ViewPager.C15711 */

        /* renamed from: a */
        public int compare(C1576a aVar, C1576a aVar2) {
            return aVar.f5527b - aVar2.f5527b;
        }
    };
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final Interpolator sInterpolator = new Interpolator() {
        /* class androidx.viewpager.widget.ViewPager.animationInterpolatorC15722 */

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private static final C1582g sPositionComparator = new C1582g();
    private int mActivePointerId = -1;
    PagerAdapter mAdapter;
    private List<AbstractC1578c> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new Runnable() {
        /* class androidx.viewpager.widget.ViewPager.RunnableC15733 */

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    };
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C1576a> mItems = new ArrayList<>();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private C1580e mObserver;
    private int mOffscreenPageLimit = 1;
    private OnPageChangeListener mOnPageChangeListener;
    private List<OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private AbstractC1579d mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffect mRightEdge;
    private int mScrollState = 0;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C1576a mTempItem = new C1576a();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    public interface AbstractC1578c {
        /* renamed from: a */
        void mo8153a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    public interface AbstractC1579d {
        /* renamed from: a */
        void mo8241a(View view, float f);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C1581f implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C1576a {

        /* renamed from: a */
        Object f5526a;

        /* renamed from: b */
        int f5527b;

        /* renamed from: c */
        boolean f5528c;

        /* renamed from: d */
        float f5529d;

        /* renamed from: e */
        float f5530e;

        C1576a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public static class C1582g implements Comparator<View> {
        C1582g() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            if (layoutParams.f5517a == layoutParams2.f5517a) {
                return layoutParams.f5521e - layoutParams2.f5521e;
            }
            if (layoutParams.f5517a) {
                return 1;
            }
            return -1;
        }
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f5517a;

        /* renamed from: b */
        public int f5518b;

        /* renamed from: c */
        float f5519c;

        /* renamed from: d */
        boolean f5520d;

        /* renamed from: e */
        int f5521e;

        /* renamed from: f */
        int f5522f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.f5518b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    private class C1580e extends DataSetObserver {
        public void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }

        C1580e() {
        }
    }

    public void clearOnPageChangeListeners() {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    /* access modifiers changed from: package-private */
    public void populate() {
        populate(this.mCurItem);
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* access modifiers changed from: package-private */
    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    public class C1577b extends C0859a {
        /* renamed from: b */
        private boolean m7214b() {
            if (ViewPager.this.mAdapter == null || ViewPager.this.mAdapter.getCount() <= 1) {
                return false;
            }
            return true;
        }

        C1577b() {
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public void mo4535a(View view, C0864d dVar) {
            super.mo4535a(view, dVar);
            dVar.mo4566b((CharSequence) ViewPager.class.getName());
            dVar.mo4600k(m7214b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                dVar.mo4552a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                dVar.mo4552a(8192);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: d */
        public void mo4540d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4540d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m7214b());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.mAdapter != null) {
                accessibilityEvent.setItemCount(ViewPager.this.mAdapter.getCount());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        @Override // androidx.core.view.C0859a
        /* renamed from: a */
        public boolean mo4536a(View view, int i, Bundle bundle) {
            if (super.mo4536a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
                return true;
            }
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f5517a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5523a = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.f5524b = pagerAdapter.saveState();
        }
        return savedState;
    }

    /* access modifiers changed from: package-private */
    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.viewpager.widget.ViewPager.SavedState.C15751 */

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
        int f5523a;

        /* renamed from: b */
        Parcelable f5524b;

        /* renamed from: d */
        ClassLoader f5525d;

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f5523a + "}";
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5523a);
            parcel.writeParcelable(this.f5524b, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f5523a = parcel.readInt();
            this.f5524b = parcel.readParcelable(classLoader);
            this.f5525d = classLoader;
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (this.mLeftEdge.isFinished() || this.mRightEdge.isFinished()) {
            return true;
        }
        return false;
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = BitmapDescriptorFactory.HUE_RED;
        this.mInitialMotionX = BitmapDescriptorFactory.HUE_RED;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    private C1576a infoForCurrentScrollPosition() {
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
            f2 = ((float) this.mPageMargin) / ((float) clientWidth);
        } else {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        C1576a aVar = null;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.mItems.size()) {
            C1576a aVar2 = this.mItems.get(i3);
            if (!z && aVar2.f5527b != (i = i2 + 1)) {
                aVar2 = this.mTempItem;
                aVar2.f5530e = f3 + f4 + f2;
                aVar2.f5527b = i;
                aVar2.f5529d = this.mAdapter.getPageWidth(aVar2.f5527b);
                i3--;
            }
            f3 = aVar2.f5530e;
            float f5 = aVar2.f5529d + f3 + f2;
            if (!z && f < f3) {
                return aVar;
            }
            if (f < f5 || i3 == this.mItems.size() - 1) {
                return aVar2;
            }
            i2 = aVar2.f5527b;
            f4 = aVar2.f5529d;
            i3++;
            aVar = aVar2;
            z = false;
        }
        return aVar;
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.m4073e(this);
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C1576a infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f5527b, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.f5530e) / infoForCurrentScrollPosition.f5529d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* access modifiers changed from: package-private */
    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        ViewCompat.m4043a(this, new C1577b());
        if (ViewCompat.m4076f(this) == 0) {
            ViewCompat.m4069d((View) this, 1);
        }
        ViewCompat.m4044a(this, new AbstractC0912n() {
            /* class androidx.viewpager.widget.ViewPager.C15744 */

            /* renamed from: b */
            private final Rect f5516b = new Rect();

            @Override // androidx.core.view.AbstractC0912n
            public C0883ab onApplyWindowInsets(View view, C0883ab abVar) {
                C0883ab a = ViewCompat.m4027a(view, abVar);
                if (a.mo4650f()) {
                    return a;
                }
                Rect rect = this.f5516b;
                rect.left = a.mo4642a();
                rect.top = a.mo4644b();
                rect.right = a.mo4646c();
                rect.bottom = a.mo4647d();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C0883ab b = ViewCompat.m4056b(ViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo4642a(), rect.left);
                    rect.top = Math.min(b.mo4644b(), rect.top);
                    rect.right = Math.min(b.mo4646c(), rect.right);
                    rect.bottom = Math.min(b.mo4647d(), rect.bottom);
                }
                return a.mo4643a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void dataSetChanged() {
        boolean z;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() >= (this.mOffscreenPageLimit * 2) + 1 || this.mItems.size() >= count) {
            z = false;
        } else {
            z = true;
        }
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C1576a aVar = this.mItems.get(i2);
            int itemPosition = this.mAdapter.getItemPosition(aVar.f5526a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z2 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, aVar.f5527b, aVar.f5526a);
                    if (this.mCurItem == aVar.f5527b) {
                        i = Math.max(0, Math.min(this.mCurItem, count - 1));
                    }
                } else if (aVar.f5527b != itemPosition) {
                    if (aVar.f5527b == this.mCurItem) {
                        i = itemPosition;
                    }
                    aVar.f5527b = itemPosition;
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f5517a) {
                    layoutParams.f5519c = BitmapDescriptorFactory.HUE_RED;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.mOnPageChangeListener = onPageChangeListener;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void removeOnAdapterChangeListener(AbstractC1578c cVar) {
        List<AbstractC1578c> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(cVar);
        }
    }

    public void removeOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    /* access modifiers changed from: package-private */
    public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener onPageChangeListener) {
        OnPageChangeListener onPageChangeListener2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = onPageChangeListener;
        return onPageChangeListener2;
    }

    private static boolean isDecorView(View view) {
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            return true;
        }
        return false;
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mMarginDrawable) {
            return true;
        }
        return false;
    }

    private void enableLayers(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.mPageTransformerLayerType;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    public void addOnAdapterChangeListener(AbstractC1578c cVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(cVar);
    }

    public void addOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(onPageChangeListener);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public C1576a infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    public C1576a infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C1576a aVar = this.mItems.get(i2);
            if (aVar.f5527b == i) {
                return aVar;
            }
        }
        return null;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.mMarginDrawable = drawable;
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
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
                enableLayers(z);
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    private void dispatchOnPageSelected(int i) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i);
        }
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C1576a infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f5527b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.mFirstOffset))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.mLastOffset))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1576a infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f5527b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public C1576a infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C1576a aVar = this.mItems.get(i);
            if (this.mAdapter.isViewFromObject(view, aVar.f5526a)) {
                return aVar;
            }
        }
        return null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f5524b, savedState.f5525d);
            setCurrentItemInternal(savedState.f5523a, false, true);
            return;
        }
        this.mRestoredCurItem = savedState.f5523a;
        this.mRestoredAdapterState = savedState.f5524b;
        this.mRestoredClassLoader = savedState.f5525d;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public ViewPager(Context context) {
        super(context);
        initViewPager();
    }

    private void completeScroll(boolean z) {
        boolean z2;
        if (this.mScrollState == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C1576a aVar = this.mItems.get(i);
            if (aVar.f5528c) {
                aVar.f5528c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            ViewCompat.m4046a(this, this.mEndScrollRunnable);
        } else {
            this.mEndScrollRunnable.run();
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() != 0) {
            C1576a infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = infoForCurrentScrollPosition.f5527b;
            float f2 = ((((float) i) / f) - infoForCurrentScrollPosition.f5530e) / (infoForCurrentScrollPosition.f5529d + (((float) i2) / f));
            this.mCalledSuper = false;
            onPageScrolled(i4, f2, (int) (((float) i3) * f2));
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, BitmapDescriptorFactory.HUE_RED, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                } else {
                    return arrowScroll(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            } else {
                return arrowScroll(17);
            }
        }
        return false;
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C1576a aVar = this.mItems.get(0);
        ArrayList<C1576a> arrayList = this.mItems;
        C1576a aVar2 = arrayList.get(arrayList.size() - 1);
        if (aVar.f5527b != 0) {
            f3 = aVar.f5530e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (aVar2.f5527b != this.mAdapter.getCount() - 1) {
            f4 = aVar2.f5530e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r7) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.mFirstOffset * ((float) width));
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) width2));
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z) {
            ViewCompat.m4073e(this);
        }
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C1576a aVar = this.mItems.get(0);
            ArrayList<C1576a> arrayList = this.mItems;
            C1576a aVar2 = arrayList.get(arrayList.size() - 1);
            if (aVar.f5527b != 0) {
                f2 = aVar.f5530e * clientWidth;
            }
            if (aVar2.f5527b != this.mAdapter.getCount() - 1) {
                f3 = aVar2.f5530e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - ((float) i);
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, BitmapDescriptorFactory.HUE_RED, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.mPageMargin) / f4;
            int i = 0;
            C1576a aVar = this.mItems.get(0);
            float f6 = aVar.f5530e;
            int size = this.mItems.size();
            int i2 = aVar.f5527b;
            int i3 = this.mItems.get(size - 1).f5527b;
            while (i2 < i3) {
                while (i2 > aVar.f5527b && i < size) {
                    i++;
                    aVar = this.mItems.get(i);
                }
                if (i2 == aVar.f5527b) {
                    f2 = (aVar.f5530e + aVar.f5529d) * f4;
                    f = aVar.f5530e + aVar.f5529d + f5;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i2);
                    f = f6 + pageWidth + f5;
                    f2 = (f6 + pageWidth) * f4;
                }
                if (((float) this.mPageMargin) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.mMarginDrawable.setBounds(Math.round(f2), this.mTopPageBounds, Math.round(((float) this.mPageMargin) + f2), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
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

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C1576a aVar = this.mItems.get(i);
                this.mAdapter.destroyItem((ViewGroup) this, aVar.f5527b, aVar.f5526a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new C1580e();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<AbstractC1578c> list = this.mAdapterChangeListeners;
        if (!(list == null || list.isEmpty())) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAdapterChangeListeners.get(i2).mo8153a(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.mLastMotionX;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                int i2 = (f2 > BitmapDescriptorFactory.HUE_RED ? 1 : (f2 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i2 == 0 || isGutterDrag(this.mLastMotionX, f2) || !canScroll(this, false, (int) f2, (int) x2, (int) y2)) {
                    int i3 = this.mTouchSlop;
                    if (abs > ((float) i3) && abs * 0.5f > abs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        float f3 = this.mInitialMotionX;
                        float f4 = (float) this.mTouchSlop;
                        if (i2 > 0) {
                            f = f3 + f4;
                        } else {
                            f = f3 - f4;
                        }
                        this.mLastMotionX = f;
                        this.mLastMotionY = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) i3)) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(x2)) {
                        ViewCompat.m4073e(this);
                    }
                } else {
                    this.mLastMotionX = x2;
                    this.mLastMotionY = y2;
                    this.mIsUnableToDrag = true;
                    return false;
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        float f;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z = resetTouch();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.mLastMotionX);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.mLastMotionY);
                        if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f2 = this.mInitialMotionX;
                            if (x2 - f2 > BitmapDescriptorFactory.HUE_RED) {
                                f = f2 + ((float) this.mTouchSlop);
                            } else {
                                f = f2 - ((float) this.mTouchSlop);
                            }
                            this.mLastMotionX = f;
                            this.mLastMotionY = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                z = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1576a infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f3 = (float) clientWidth;
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f5527b, ((((float) scrollX) / f3) - infoForCurrentScrollPosition.f5530e) / (infoForCurrentScrollPosition.f5529d + (((float) this.mPageMargin) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            z = resetTouch();
        }
        if (z) {
            ViewCompat.m4073e(this);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r8.f5527b == r17.mCurItem) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        r8 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populate(int r18) {
        /*
        // Method dump skipped, instructions count: 618
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageTransformer(boolean z, AbstractC1579d dVar) {
        setPageTransformer(z, dVar, 2);
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    private boolean isGutterDrag(float f, float f2) {
        if ((f >= ((float) this.mGutterSize) || f2 <= BitmapDescriptorFactory.HUE_RED) && (f <= ((float) (getWidth() - this.mGutterSize)) || f2 >= BitmapDescriptorFactory.HUE_RED)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).f5522f;
    }

    /* access modifiers changed from: package-private */
    public C1576a addNewItem(int i, int i2) {
        C1576a aVar = new C1576a();
        aVar.f5527b = i;
        aVar.f5526a = this.mAdapter.instantiateItem((ViewGroup) this, i);
        aVar.f5529d = this.mAdapter.getPageWidth(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(aVar);
        } else {
            this.mItems.add(i2, aVar);
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1576a infoForChild;
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
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f5527b == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
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

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: package-private */
    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        OnPageChangeListener onPageChangeListener = this.mOnPageChangeListener;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
        List<OnPageChangeListener> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = this.mOnPageChangeListeners.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i, f, i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.mInternalPageChangeListener;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f5517a |= isDecorView(view);
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f5517a) {
            layoutParams2.f5520d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void setPageTransformer(boolean z, AbstractC1579d dVar, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 1;
        if (dVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.mPageTransformer != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mPageTransformer = dVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z4) {
            populate();
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1576a infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f5527b == this.mCurItem) {
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    /* access modifiers changed from: package-private */
    public void smoothScrollTo(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.mIsScrollStarted) {
                i4 = this.mScroller.getCurrX();
            } else {
                i4 = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int scrollY = getScrollY();
        int i6 = i - i4;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float distanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i6)) / ((f * this.mAdapter.getPageWidth(this.mCurItem)) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i4, scrollY, i6, i7, min);
        ViewCompat.m4073e(this);
    }

    private void calculatePageOffsets(C1576a aVar, int i, C1576a aVar2) {
        float f;
        float f2;
        float f3;
        C1576a aVar3;
        C1576a aVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = ((float) this.mPageMargin) / ((float) clientWidth);
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        if (aVar2 != null) {
            int i2 = aVar2.f5527b;
            if (i2 < aVar.f5527b) {
                float f4 = aVar2.f5530e + aVar2.f5529d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= aVar.f5527b && i4 < this.mItems.size()) {
                    C1576a aVar5 = this.mItems.get(i4);
                    while (true) {
                        aVar4 = aVar5;
                        if (i3 > aVar4.f5527b && i4 < this.mItems.size() - 1) {
                            i4++;
                            aVar5 = this.mItems.get(i4);
                        }
                    }
                    while (i3 < aVar4.f5527b) {
                        f4 += this.mAdapter.getPageWidth(i3) + f;
                        i3++;
                    }
                    aVar4.f5530e = f4;
                    f4 += aVar4.f5529d + f;
                    i3++;
                }
            } else if (i2 > aVar.f5527b) {
                int size = this.mItems.size() - 1;
                float f5 = aVar2.f5530e;
                while (true) {
                    i2--;
                    if (i2 < aVar.f5527b || size < 0) {
                        break;
                    }
                    C1576a aVar6 = this.mItems.get(size);
                    while (true) {
                        aVar3 = aVar6;
                        if (i2 < aVar3.f5527b && size > 0) {
                            size--;
                            aVar6 = this.mItems.get(size);
                        }
                    }
                    while (i2 > aVar3.f5527b) {
                        f5 -= this.mAdapter.getPageWidth(i2) + f;
                        i2--;
                    }
                    f5 -= aVar3.f5529d + f;
                    aVar3.f5530e = f5;
                }
            }
        }
        int size2 = this.mItems.size();
        float f6 = aVar.f5530e;
        int i5 = aVar.f5527b - 1;
        if (aVar.f5527b == 0) {
            f2 = aVar.f5530e;
        } else {
            f2 = -3.4028235E38f;
        }
        this.mFirstOffset = f2;
        int i6 = count - 1;
        if (aVar.f5527b == i6) {
            f3 = (aVar.f5530e + aVar.f5529d) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.mLastOffset = f3;
        int i7 = i - 1;
        while (i7 >= 0) {
            C1576a aVar7 = this.mItems.get(i7);
            while (i5 > aVar7.f5527b) {
                f6 -= this.mAdapter.getPageWidth(i5) + f;
                i5--;
            }
            f6 -= aVar7.f5529d + f;
            aVar7.f5530e = f6;
            if (aVar7.f5527b == 0) {
                this.mFirstOffset = f6;
            }
            i7--;
            i5--;
        }
        float f7 = aVar.f5530e + aVar.f5529d + f;
        int i8 = aVar.f5527b + 1;
        int i9 = i + 1;
        while (i9 < size2) {
            C1576a aVar8 = this.mItems.get(i9);
            while (i8 < aVar8.f5527b) {
                f7 += this.mAdapter.getPageWidth(i8) + f;
                i8++;
            }
            if (aVar8.f5527b == i6) {
                this.mLastOffset = (aVar8.f5529d + f7) - 1.0f;
            }
            aVar8.f5530e = f7;
            f7 += aVar8.f5529d + f;
            i9++;
            i8++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int i3;
        C1576a infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.mFirstOffset, Math.min(infoForPosition.f5530e, this.mLastOffset)));
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(i3, 0);
        pageScrolled(i3);
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            if (i >= this.mCurItem) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        ArrayList<C1576a> arrayList = this.mItems;
        return Math.max(this.mItems.get(0).f5527b, Math.min(i, arrayList.get(arrayList.size() - 1).f5527b));
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        float f;
        if (i2 <= 0 || this.mItems.isEmpty()) {
            C1576a infoForPosition = infoForPosition(this.mCurItem);
            if (infoForPosition != null) {
                f = Math.min(infoForPosition.f5530e, this.mLastOffset);
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            int paddingLeft = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                completeScroll(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* access modifiers changed from: package-private */
    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.mAdapter;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).f5528c = true;
                }
            }
            if (this.mCurItem != i) {
                z3 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }
}

package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.AbstractC0873g;
import androidx.core.view.p029a.C0864d;
import androidx.recyclerview.widget.C1404s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.AbstractC1592c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ViewPager2 extends ViewGroup {
    static boolean sFeatureEnhancedA11yEnabled = true;
    AbstractC1599a mAccessibilityProvider;
    int mCurrentItem;
    private RecyclerView.AdapterDataObserver mCurrentItemDataSetChangeObserver = new AbstractC1601c() {
        /* class androidx.viewpager2.widget.ViewPager2.C15941 */

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver, androidx.viewpager2.widget.ViewPager2.AbstractC1601c
        public void onChanged() {
            ViewPager2.this.mCurrentItemDirty = true;
            ViewPager2.this.mScrollEventAdapter.notifyDataSetChangeHappened();
        }
    };
    boolean mCurrentItemDirty = false;
    private C1614b mExternalPageChangeCallbacks = new C1614b(3);
    private C1616d mFakeDragger;
    private LinearLayoutManager mLayoutManager;
    private int mOffscreenPageLimit = -1;
    private C1614b mPageChangeEventDispatcher;
    private PageTransformerAdapter mPageTransformerAdapter;
    private C1404s mPagerSnapHelper;
    private Parcelable mPendingAdapterState;
    private int mPendingCurrentItem = -1;
    RecyclerView mRecyclerView;
    private RecyclerView.ItemAnimator mSavedItemAnimator = null;
    private boolean mSavedItemAnimatorPresent = false;
    ScrollEventAdapter mScrollEventAdapter;
    private final Rect mTmpChildRect = new Rect();
    private final Rect mTmpContainerRect = new Rect();
    private boolean mUserInputEnabled = true;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OffscreenPageLimit {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public static abstract class AbstractC1603e {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public interface AbstractC1608g {
        /* renamed from: a */
        void mo8353a(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    private static abstract class AbstractC1601c extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void onChanged();

        private AbstractC1601c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C1604f extends AbstractC1599a {

        /* renamed from: c */
        private final AbstractC0873g f5576c = new AbstractC0873g() {
            /* class androidx.viewpager2.widget.ViewPager2.C1604f.C16051 */

            @Override // androidx.core.view.p029a.AbstractC0873g
            /* renamed from: a */
            public boolean mo4640a(View view, AbstractC0873g.AbstractC0874a aVar) {
                C1604f.this.mo8351c(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        };

        /* renamed from: d */
        private final AbstractC0873g f5577d = new AbstractC0873g() {
            /* class androidx.viewpager2.widget.ViewPager2.C1604f.C16062 */

            @Override // androidx.core.view.p029a.AbstractC0873g
            /* renamed from: a */
            public boolean mo4640a(View view, AbstractC0873g.AbstractC0874a aVar) {
                C1604f.this.mo8351c(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        };

        /* renamed from: e */
        private RecyclerView.AdapterDataObserver f5578e;

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: a */
        public boolean mo8337a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: a */
        public boolean mo8339a(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: c */
        public void mo8344c() {
            mo8352j();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: d */
        public void mo8345d() {
            mo8352j();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: e */
        public void mo8346e() {
            mo8352j();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: g */
        public void mo8348g() {
            mo8352j();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: b */
        public String mo8340b() {
            if (mo8337a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: f */
        public void mo8347f() {
            mo8352j();
            if (Build.VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo8352j() {
            int itemCount;
            int i;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = 16908360;
            ViewCompat.m4075e((View) viewPager2, 16908360);
            ViewCompat.m4075e((View) viewPager2, 16908361);
            ViewCompat.m4075e((View) viewPager2, 16908358);
            ViewCompat.m4075e((View) viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.isUserInputEnabled()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean isRtl = ViewPager2.this.isRtl();
                    if (isRtl) {
                        i = 16908360;
                    } else {
                        i = 16908361;
                    }
                    if (isRtl) {
                        i2 = 16908361;
                    }
                    if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                        ViewCompat.m4041a(viewPager2, new C0864d.C0865a(i, null), null, this.f5576c);
                    }
                    if (ViewPager2.this.mCurrentItem > 0) {
                        ViewCompat.m4041a(viewPager2, new C0864d.C0865a(i2, null), null, this.f5577d);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                    ViewCompat.m4041a(viewPager2, new C0864d.C0865a(16908359, null), null, this.f5576c);
                }
                if (ViewPager2.this.mCurrentItem > 0) {
                    ViewCompat.m4041a(viewPager2, new C0864d.C0865a(16908358, null), null, this.f5577d);
                }
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: b */
        public void mo8341b(RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f5578e);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: a */
        public void mo8332a(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo8340b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo8351c(int i) {
            if (ViewPager2.this.isUserInputEnabled()) {
                ViewPager2.this.setCurrentItemInternal(i, true);
            }
        }

        C1604f() {
            super();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: a */
        public void mo8333a(AccessibilityNodeInfo accessibilityNodeInfo) {
            m7281b(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                m7282c(accessibilityNodeInfo);
            }
        }

        /* renamed from: b */
        private void m7281b(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().getItemCount();
            } else {
                i = ViewPager2.this.getAdapter().getItemCount();
                i2 = 0;
                C0864d.m4171a(accessibilityNodeInfo).mo4559a(C0864d.C0866b.m4257a(i2, i, false, 0));
            }
            i = 0;
            C0864d.m4171a(accessibilityNodeInfo).mo4559a(C0864d.C0866b.m4257a(i2, i, false, 0));
        }

        /* renamed from: c */
        private void m7282c(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.isUserInputEnabled()) {
                if (ViewPager2.this.mCurrentItem > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: a */
        public void mo8335a(RecyclerView.Adapter<?> adapter) {
            mo8352j();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f5578e);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: a */
        public void mo8336a(C1614b bVar, RecyclerView recyclerView) {
            ViewCompat.m4069d((View) recyclerView, 2);
            this.f5578e = new AbstractC1601c() {
                /* class androidx.viewpager2.widget.ViewPager2.C1604f.C16073 */

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver, androidx.viewpager2.widget.ViewPager2.AbstractC1601c
                public void onChanged() {
                    C1604f.this.mo8352j();
                }
            };
            if (ViewCompat.m4076f(ViewPager2.this) == 0) {
                ViewCompat.m4069d((View) ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: b */
        public boolean mo8343b(int i, Bundle bundle) {
            int i2;
            if (mo8339a(i, bundle)) {
                if (i == 8192) {
                    i2 = ViewPager2.this.getCurrentItem() - 1;
                } else {
                    i2 = ViewPager2.this.getCurrentItem() + 1;
                }
                mo8351c(i2);
                return true;
            }
            throw new IllegalStateException();
        }
    }

    public int getCurrentItem() {
        return this.mCurrentItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public boolean isUserInputEnabled() {
        return this.mUserInputEnabled;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public abstract class AbstractC1599a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8332a(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8333a(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8334a(C0864d dVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8335a(RecyclerView.Adapter<?> adapter) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8336a(C1614b bVar, RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8337a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8338a(int i) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo8339a(int i, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8341b(RecyclerView.Adapter<?> adapter) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo8344c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo8345d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo8346e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo8347f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo8348g() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo8349h() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo8340b() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo8350i() {
            throw new IllegalStateException("Not implemented.");
        }

        private AbstractC1599a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo8342b(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo8343b(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public static class RunnableC1611j implements Runnable {

        /* renamed from: a */
        private final int f5584a;

        /* renamed from: b */
        private final RecyclerView f5585b;

        public void run() {
            this.f5585b.smoothScrollToPosition(this.f5584a);
        }

        RunnableC1611j(int i, RecyclerView recyclerView) {
            this.f5584a = i;
            this.f5585b = recyclerView;
        }
    }

    private RecyclerView.AbstractC1336e enforceChildFillListener() {
        return new RecyclerView.AbstractC1336e() {
            /* class androidx.viewpager2.widget.ViewPager2.C15974 */

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1336e
            public void onChildViewDetachedFromWindow(View view) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1336e
            public void onChildViewAttachedToWindow(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                if (layoutParams.width != -1 || layoutParams.height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        };
    }

    public boolean beginFakeDrag() {
        return this.mFakeDragger.mo8365b();
    }

    public boolean endFakeDrag() {
        return this.mFakeDragger.mo8366c();
    }

    public RecyclerView.Adapter getAdapter() {
        return this.mRecyclerView.getAdapter();
    }

    public int getItemDecorationCount() {
        return this.mRecyclerView.getItemDecorationCount();
    }

    public int getOrientation() {
        return this.mLayoutManager.getOrientation();
    }

    public int getScrollState() {
        return this.mScrollEventAdapter.getScrollState();
    }

    public void invalidateItemDecorations() {
        this.mRecyclerView.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.mFakeDragger.mo8363a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C1600b extends AbstractC1599a {
        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: h */
        public boolean mo8349h() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: i */
        public CharSequence mo8350i() {
            if (mo8349h()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        C1600b() {
            super();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: b */
        public boolean mo8342b(int i) {
            if (mo8338a(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: a */
        public void mo8334a(C0864d dVar) {
            if (!ViewPager2.this.isUserInputEnabled()) {
                dVar.mo4569b(C0864d.C0865a.f3382n);
                dVar.mo4569b(C0864d.C0865a.f3381m);
                dVar.mo4600k(false);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1599a
        /* renamed from: a */
        public boolean mo8338a(int i) {
            if ((i == 8192 || i == 4096) && !ViewPager2.this.isUserInputEnabled()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isRtl() {
        if (this.mLayoutManager.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public class C1610i extends RecyclerView {
        @Override // androidx.recyclerview.widget.RecyclerView
        public CharSequence getAccessibilityClassName() {
            if (ViewPager2.this.mAccessibilityProvider.mo8349h()) {
                return ViewPager2.this.mAccessibilityProvider.mo8350i();
            }
            return super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.mCurrentItem);
            accessibilityEvent.setToIndex(ViewPager2.this.mCurrentItem);
            ViewPager2.this.mAccessibilityProvider.mo8332a(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.isUserInputEnabled() || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.isUserInputEnabled() || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }

        C1610i(Context context) {
            super(context);
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (this.mAccessibilityProvider.mo8337a()) {
            return this.mAccessibilityProvider.mo8340b();
        }
        return super.getAccessibilityClassName();
    }

    private void restorePendingState() {
        RecyclerView.Adapter adapter;
        if (this.mPendingCurrentItem != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.mPendingAdapterState;
            if (parcelable != null) {
                if (adapter instanceof AbstractC1592c) {
                    ((AbstractC1592c) adapter).mo8249a(parcelable);
                }
                this.mPendingAdapterState = null;
            }
            int max = Math.max(0, Math.min(this.mPendingCurrentItem, adapter.getItemCount() - 1));
            this.mCurrentItem = max;
            this.mPendingCurrentItem = -1;
            this.mRecyclerView.scrollToPosition(max);
            this.mAccessibilityProvider.mo8344c();
        }
    }

    /* access modifiers changed from: package-private */
    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.mRecyclerView;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5569a = this.mRecyclerView.getId();
        int i = this.mPendingCurrentItem;
        if (i == -1) {
            i = this.mCurrentItem;
        }
        savedState.f5570b = i;
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            savedState.f5571c = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.mRecyclerView.getAdapter();
            if (adapter instanceof AbstractC1592c) {
                savedState.f5571c = ((AbstractC1592c) adapter).mo8256c();
            }
        }
        return savedState;
    }

    public void requestTransform() {
        if (this.mPageTransformerAdapter.getPageTransformer() != null) {
            double relativeScrollPosition = this.mScrollEventAdapter.getRelativeScrollPosition();
            int i = (int) relativeScrollPosition;
            float f = (float) (relativeScrollPosition - ((double) i));
            this.mPageTransformerAdapter.onPageScrolled(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    /* access modifiers changed from: package-private */
    public void snapToPage() {
        View findSnapView = this.mPagerSnapHelper.findSnapView(this.mLayoutManager);
        if (findSnapView != null) {
            int[] calculateDistanceToFinalSnap = this.mPagerSnapHelper.calculateDistanceToFinalSnap(this.mLayoutManager, findSnapView);
            if (calculateDistanceToFinalSnap[0] != 0 || calculateDistanceToFinalSnap[1] != 0) {
                this.mRecyclerView.smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateCurrentItem() {
        C1404s sVar = this.mPagerSnapHelper;
        if (sVar != null) {
            View findSnapView = sVar.findSnapView(this.mLayoutManager);
            if (findSnapView != null) {
                int position = this.mLayoutManager.getPosition(findSnapView);
                if (position != this.mCurrentItem && getScrollState() == 0) {
                    this.mPageChangeEventDispatcher.onPageSelected(position);
                }
                this.mCurrentItemDirty = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.viewpager2.widget.ViewPager2.SavedState.C15981 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (Build.VERSION.SDK_INT >= 24) {
                    return new SavedState(parcel, classLoader);
                }
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f5569a;

        /* renamed from: b */
        int f5570b;

        /* renamed from: c */
        Parcelable f5571c;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            m7253a(parcel, null);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m7253a(parcel, classLoader);
        }

        /* renamed from: a */
        private void m7253a(Parcel parcel, ClassLoader classLoader) {
            this.f5569a = parcel.readInt();
            this.f5570b = parcel.readInt();
            this.f5571c = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5569a);
            parcel.writeInt(this.f5570b);
            parcel.writeParcelable(this.f5571c, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C1609h extends C1404s {
        C1609h() {
        }

        @Override // androidx.recyclerview.widget.AbstractC1409v, androidx.recyclerview.widget.C1404s
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            if (ViewPager2.this.isFakeDragging()) {
                return null;
            }
            return super.findSnapView(layoutManager);
        }
    }

    private void registerCurrentItemDataSetTracker(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    private void unregisterCurrentItemDataSetTracker(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    public void addItemDecoration(RecyclerView.AbstractC1335d dVar) {
        this.mRecyclerView.addItemDecoration(dVar);
    }

    public boolean canScrollHorizontally(int i) {
        return this.mRecyclerView.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.mRecyclerView.canScrollVertically(i);
    }

    public boolean fakeDragBy(float f) {
        return this.mFakeDragger.mo8364a(f);
    }

    public RecyclerView.AbstractC1335d getItemDecorationAt(int i) {
        return this.mRecyclerView.getItemDecorationAt(i);
    }

    public void registerOnPageChangeCallback(AbstractC1603e eVar) {
        this.mExternalPageChangeCallbacks.mo8359a(eVar);
    }

    public void removeItemDecoration(RecyclerView.AbstractC1335d dVar) {
        this.mRecyclerView.removeItemDecoration(dVar);
    }

    public void removeItemDecorationAt(int i) {
        this.mRecyclerView.removeItemDecorationAt(i);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setUserInputEnabled(boolean z) {
        this.mUserInputEnabled = z;
        this.mAccessibilityProvider.mo8347f();
    }

    public void unregisterOnPageChangeCallback(AbstractC1603e eVar) {
        this.mExternalPageChangeCallbacks.mo8360b(eVar);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.mAccessibilityProvider.mo8333a(accessibilityNodeInfo);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.mAccessibilityProvider.mo8348g();
    }

    public void setOrientation(int i) {
        this.mLayoutManager.setOrientation(i);
        this.mAccessibilityProvider.mo8345d();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mPendingCurrentItem = savedState.f5570b;
        this.mPendingAdapterState = savedState.f5571c;
    }

    public void onViewAdded(View view) {
        throw new IllegalStateException(getClass().getSimpleName() + " does not support direct child views");
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.mOffscreenPageLimit = i;
            this.mRecyclerView.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public ViewPager2(Context context) {
        super(context);
        initialize(context, null);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f5569a;
            sparseArray.put(this.mRecyclerView.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        restorePendingState();
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.mRecyclerView.getAdapter();
        this.mAccessibilityProvider.mo8341b(adapter2);
        unregisterCurrentItemDataSetTracker(adapter2);
        this.mRecyclerView.setAdapter(adapter);
        this.mCurrentItem = 0;
        restorePendingState();
        this.mAccessibilityProvider.mo8335a(adapter);
        registerCurrentItemDataSetTracker(adapter);
    }

    public void setPageTransformer(AbstractC1608g gVar) {
        if (gVar != null) {
            if (!this.mSavedItemAnimatorPresent) {
                this.mSavedItemAnimator = this.mRecyclerView.getItemAnimator();
                this.mSavedItemAnimatorPresent = true;
            }
            this.mRecyclerView.setItemAnimator(null);
        } else if (this.mSavedItemAnimatorPresent) {
            this.mRecyclerView.setItemAnimator(this.mSavedItemAnimator);
            this.mSavedItemAnimator = null;
            this.mSavedItemAnimatorPresent = false;
        }
        if (gVar != this.mPageTransformerAdapter.getPageTransformer()) {
            this.mPageTransformerAdapter.setPageTransformer(gVar);
            requestTransform();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C1602d extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        C1602d(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(state, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onInitializeAccessibilityNodeInfo(RecyclerView.Recycler recycler, RecyclerView.State state, C0864d dVar) {
            super.onInitializeAccessibilityNodeInfo(recycler, state, dVar);
            ViewPager2.this.mAccessibilityProvider.mo8334a(dVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public boolean performAccessibilityAction(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
            if (ViewPager2.this.mAccessibilityProvider.mo8338a(i)) {
                return ViewPager2.this.mAccessibilityProvider.mo8342b(i);
            }
            return super.performAccessibilityAction(recycler, state, i, bundle);
        }
    }

    public void addItemDecoration(RecyclerView.AbstractC1335d dVar, int i) {
        this.mRecyclerView.addItemDecoration(dVar, i);
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.mAccessibilityProvider.mo8339a(i, bundle)) {
            return this.mAccessibilityProvider.mo8343b(i, bundle);
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setCurrentItem(int i, boolean z) {
        if (!isFakeDragging()) {
            setCurrentItemInternal(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948});
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, new int[]{16842948}, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChild(this.mRecyclerView, i, i2);
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int measuredState = this.mRecyclerView.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        AbstractC1599a aVar;
        if (sFeatureEnhancedA11yEnabled) {
            aVar = new C1604f();
        } else {
            aVar = new C1600b();
        }
        this.mAccessibilityProvider = aVar;
        C1610i iVar = new C1610i(context);
        this.mRecyclerView = iVar;
        iVar.setId(ViewCompat.m4025a());
        this.mRecyclerView.setDescendantFocusability(131072);
        C1602d dVar = new C1602d(context);
        this.mLayoutManager = dVar;
        this.mRecyclerView.setLayoutManager(dVar);
        this.mRecyclerView.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRecyclerView.addOnChildAttachStateChangeListener(enforceChildFillListener());
        ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
        this.mScrollEventAdapter = scrollEventAdapter;
        this.mFakeDragger = new C1616d(this, scrollEventAdapter, this.mRecyclerView);
        C1609h hVar = new C1609h();
        this.mPagerSnapHelper = hVar;
        hVar.attachToRecyclerView(this.mRecyclerView);
        this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
        C1614b bVar = new C1614b(3);
        this.mPageChangeEventDispatcher = bVar;
        this.mScrollEventAdapter.setOnPageChangeCallback(bVar);
        C15952 r3 = new AbstractC1603e() {
            /* class androidx.viewpager2.widget.ViewPager2.C15952 */

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
            public void onPageScrollStateChanged(int i) {
                if (i == 0) {
                    ViewPager2.this.updateCurrentItem();
                }
            }

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
            public void onPageSelected(int i) {
                if (ViewPager2.this.mCurrentItem != i) {
                    ViewPager2.this.mCurrentItem = i;
                    ViewPager2.this.mAccessibilityProvider.mo8346e();
                }
            }
        };
        C15963 r4 = new AbstractC1603e() {
            /* class androidx.viewpager2.widget.ViewPager2.C15963 */

            @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
            public void onPageSelected(int i) {
                ViewPager2.this.clearFocus();
                if (ViewPager2.this.hasFocus()) {
                    ViewPager2.this.mRecyclerView.requestFocus(2);
                }
            }
        };
        this.mPageChangeEventDispatcher.mo8359a(r3);
        this.mPageChangeEventDispatcher.mo8359a(r4);
        this.mAccessibilityProvider.mo8336a(this.mPageChangeEventDispatcher, this.mRecyclerView);
        this.mPageChangeEventDispatcher.mo8359a(this.mExternalPageChangeCallbacks);
        PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter(this.mLayoutManager);
        this.mPageTransformerAdapter = pageTransformerAdapter;
        this.mPageChangeEventDispatcher.mo8359a(pageTransformerAdapter);
        RecyclerView recyclerView = this.mRecyclerView;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* access modifiers changed from: package-private */
    public void setCurrentItemInternal(int i, boolean z) {
        int i2;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.mPendingCurrentItem != -1) {
                this.mPendingCurrentItem = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min != this.mCurrentItem || !this.mScrollEventAdapter.isIdle()) {
                int i3 = this.mCurrentItem;
                if (min != i3 || !z) {
                    double d = (double) i3;
                    this.mCurrentItem = min;
                    this.mAccessibilityProvider.mo8346e();
                    if (!this.mScrollEventAdapter.isIdle()) {
                        d = this.mScrollEventAdapter.getRelativeScrollPosition();
                    }
                    this.mScrollEventAdapter.notifyProgrammaticScroll(min, z);
                    if (!z) {
                        this.mRecyclerView.scrollToPosition(min);
                        return;
                    }
                    double d2 = (double) min;
                    if (Math.abs(d2 - d) > 3.0d) {
                        RecyclerView recyclerView = this.mRecyclerView;
                        if (d2 > d) {
                            i2 = min - 3;
                        } else {
                            i2 = min + 3;
                        }
                        recyclerView.scrollToPosition(i2);
                        RecyclerView recyclerView2 = this.mRecyclerView;
                        recyclerView2.post(new RunnableC1611j(min, recyclerView2));
                        return;
                    }
                    this.mRecyclerView.smoothScrollToPosition(min);
                }
            }
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        this.mTmpContainerRect.left = getPaddingLeft();
        this.mTmpContainerRect.right = (i3 - i) - getPaddingRight();
        this.mTmpContainerRect.top = getPaddingTop();
        this.mTmpContainerRect.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.mTmpContainerRect, this.mTmpChildRect);
        this.mRecyclerView.layout(this.mTmpChildRect.left, this.mTmpChildRect.top, this.mTmpChildRect.right, this.mTmpChildRect.bottom);
        if (this.mCurrentItemDirty) {
            updateCurrentItem();
        }
    }
}

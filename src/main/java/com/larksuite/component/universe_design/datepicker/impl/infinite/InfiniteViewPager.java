package com.larksuite.component.universe_design.datepicker.impl.infinite;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\t2\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0013J\u0016\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\tR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006-"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfiniteViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "isPageEnabled", "", "()Z", "setPageEnabled", "(Z)V", "mIsNeedNotifyRotateListener", "mIsSmoothScroll", "mListeners", "", "Lcom/larksuite/component/universe_design/datepicker/impl/infinite/OnViewPagerChange;", "mOnSmoothScrollFinishListener", "Lcom/larksuite/component/universe_design/datepicker/impl/infinite/OnSmoothScrollFinishListener;", "mSelectedPosition", "", "<set-?>", "scrollState", "getScrollState", "()I", "addListener", "", "listener", "canScrollHorizontally", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "canScrollVertically", "init", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "onTouchEvent", "setAdapter", "adapter", "Landroidx/viewpager/widget/PagerAdapter;", "setOnSmoothScrollFinishListener", "smoothScrollToPage", "pageIndex", "needNotifyRotateListener", "OnPageChange", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public class InfiniteViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f63238a;

    /* renamed from: b */
    public int f63239b;

    /* renamed from: c */
    public boolean f63240c = true;

    /* renamed from: d */
    public List<OnViewPagerChange> f63241d;

    /* renamed from: e */
    public boolean f63242e;

    /* renamed from: f */
    public OnSmoothScrollFinishListener f63243f;

    /* renamed from: g */
    public int f63244g;

    public final int getScrollState() {
        return this.f63244g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0016"}, d2 = {"Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfiniteViewPager$OnPageChange;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "(Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfiniteViewPager;)V", "isNeedNotifyRotatedListener", "", "()Z", "notifySmoothScrollIfNeed", "", "notifyWillMoveToCenterPageIfNeed", "notifyWillMoveToFollowingPageIfNeed", "adapter", "Lcom/larksuite/component/universe_design/datepicker/impl/infinite/InfinitePagerAdapter;", "notifyWillMoveToPreviousPageIfNeed", "onPageScrollStateChanged", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.datepicker.impl.infinite.InfiniteViewPager$a */
    public final class OnPageChange implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        /* renamed from: a */
        private final boolean m92685a() {
            if (InfiniteViewPager.this.f63241d == null || !InfiniteViewPager.this.f63240c) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        private final void m92686b() {
            if (InfiniteViewPager.this.f63242e && InfiniteViewPager.this.f63243f != null) {
                OnSmoothScrollFinishListener cVar = InfiniteViewPager.this.f63243f;
                if (cVar != null) {
                    cVar.mo90459a();
                }
                InfiniteViewPager.this.f63242e = false;
            }
        }

        /* renamed from: c */
        private final void m92688c() {
            List<OnViewPagerChange> list;
            if (m92685a() && (list = InfiniteViewPager.this.f63241d) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo90454a();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OnPageChange() {
        }

        /* renamed from: a */
        private final void m92684a(InfinitePagerAdapter bVar) {
            View c;
            View c2;
            List<OnViewPagerChange> list;
            if (m92685a() && (c = bVar.mo90545c(1)) != null && (c2 = bVar.mo90545c(2)) != null && (list = InfiniteViewPager.this.f63241d) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo90456a(c, c2);
                }
            }
        }

        /* renamed from: b */
        private final void m92687b(InfinitePagerAdapter bVar) {
            View c;
            View c2;
            List<OnViewPagerChange> list;
            if (m92685a() && (c = bVar.mo90545c(1)) != null && (c2 = bVar.mo90545c(0)) != null && (list = InfiniteViewPager.this.f63241d) != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo90458b(c, c2);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            InfiniteViewPager.this.f63239b = i;
            PagerAdapter adapter = InfiniteViewPager.this.getAdapter();
            if (!(adapter instanceof InfinitePagerAdapter)) {
                adapter = null;
            }
            InfinitePagerAdapter bVar = (InfinitePagerAdapter) adapter;
            if (bVar != null) {
                int i2 = InfiniteViewPager.this.f63239b;
                if (i2 == 0) {
                    m92687b(bVar);
                } else if (i2 != 2) {
                    m92688c();
                    m92686b();
                    InfiniteViewPager.this.f63240c = true;
                } else {
                    m92684a(bVar);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            List<OnViewPagerChange> list;
            List<OnViewPagerChange> list2;
            InfiniteViewPager.this.f63244g = i;
            if (i == 0) {
                int i2 = InfiniteViewPager.this.f63239b;
                int i3 = -999;
                if (i2 == 0) {
                    i3 = 1;
                } else if (i2 != 1 && i2 == 2) {
                    i3 = 0;
                }
                if (m92685a() && (list2 = InfiniteViewPager.this.f63241d) != null) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        it.next().mo90457b(i3);
                    }
                }
                InfinitePagerAdapter bVar = (InfinitePagerAdapter) InfiniteViewPager.this.getAdapter();
                if (i3 != 0) {
                    if (i3 == 1 && bVar != null) {
                        bVar.mo90548h();
                    }
                } else if (bVar != null) {
                    bVar.mo90547g();
                }
                if (m92685a() && (list = InfiniteViewPager.this.f63241d) != null) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo90455a(i3);
                    }
                }
                InfiniteViewPager.this.setCurrentItem(1, false);
            }
        }
    }

    public final void setOnSmoothScrollFinishListener(OnSmoothScrollFinishListener cVar) {
        this.f63243f = cVar;
    }

    public final void setPageEnabled(boolean z) {
        this.f63238a = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteViewPager(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m92681a(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScrollHorizontally(int i) {
        if (!this.f63238a || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    public boolean canScrollVertically(int i) {
        if (!this.f63238a || !super.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        super.setAdapter(pagerAdapter);
        setCurrentItem(1, false);
    }

    /* renamed from: a */
    private final void m92681a(Context context) {
        addOnPageChangeListener(new OnPageChange());
        this.f63238a = true;
        setOverScrollMode(2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if (!this.f63238a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
        if (!this.f63238a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo90536a(OnViewPagerChange dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "listener");
        if (this.f63241d == null) {
            this.f63241d = new ArrayList();
        }
        List<OnViewPagerChange> list = this.f63241d;
        if (list != null) {
            list.add(dVar);
        }
    }

    /* renamed from: a */
    public final void mo90535a(int i, boolean z) {
        this.f63242e = true;
        this.f63240c = z;
        setCurrentItem(i, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfiniteViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m92681a(context);
    }
}

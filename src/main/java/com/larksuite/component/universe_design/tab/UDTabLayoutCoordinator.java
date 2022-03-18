package com.larksuite.component.universe_design.tab;

import android.database.DataSetObserver;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0004\n\r\u0010\u0013\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator;", "", "tabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "(Lcom/larksuite/component/universe_design/tab/UDTabLayout;Landroidx/viewpager/widget/ViewPager;)V", "attached", "", "onTabSelectedListener", "com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$onTabSelectedListener$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$onTabSelectedListener$1;", "onViewPagerPageChangeListener", "com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$onViewPagerPageChangeListener$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$onViewPagerPageChangeListener$1;", "viewPagerAdapterChangeListener", "com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$viewPagerAdapterChangeListener$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$viewPagerAdapterChangeListener$1;", "viewPagerAdapterDataSetObserver", "com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$viewPagerAdapterDataSetObserver$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$viewPagerAdapterDataSetObserver$1;", "attach", "", "detach", "setupPagerAdapter", "setupTabsWithPagerAdapter", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDTabLayoutCoordinator {
    private boolean attached;
    private final C25778a onTabSelectedListener = new C25778a(this);
    private final C25779b onViewPagerPageChangeListener = new C25779b(this);
    public final UDTabLayout tabLayout;
    public final ViewPager viewPager;
    private final C25780c viewPagerAdapterChangeListener = new C25780c(this);
    public final C25781d viewPagerAdapterDataSetObserver = new C25781d(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$viewPagerAdapterDataSetObserver$1", "Landroid/database/DataSetObserver;", "onChanged", "", "onInvalidated", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator$d */
    public static final class C25781d extends DataSetObserver {

        /* renamed from: a */
        final /* synthetic */ UDTabLayoutCoordinator f63617a;

        public void onChanged() {
            this.f63617a.setupTabsWithPagerAdapter();
        }

        public void onInvalidated() {
            this.f63617a.setupTabsWithPagerAdapter();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25781d(UDTabLayoutCoordinator uDTabLayoutCoordinator) {
            this.f63617a = uDTabLayoutCoordinator;
        }
    }

    public final void setupPagerAdapter() {
        PagerAdapter adapter = this.viewPager.getAdapter();
        if (adapter != null) {
            adapter.registerDataSetObserver(this.viewPagerAdapterDataSetObserver);
        }
        setupTabsWithPagerAdapter();
    }

    public final void attach() {
        if (!this.attached) {
            this.attached = true;
            this.viewPager.addOnPageChangeListener(this.onViewPagerPageChangeListener);
            this.tabLayout.addOnTabSelectedListener(this.onTabSelectedListener);
            this.viewPager.addOnAdapterChangeListener(this.viewPagerAdapterChangeListener);
            setupPagerAdapter();
            return;
        }
        throw new IllegalStateException("UDTabLayoutCoordinator is already attached".toString());
    }

    public final void detach() {
        this.viewPager.removeOnPageChangeListener(this.onViewPagerPageChangeListener);
        this.tabLayout.removeOnTabSelectedListener(this.onTabSelectedListener);
        PagerAdapter adapter = this.viewPager.getAdapter();
        if (adapter != null) {
            adapter.unregisterDataSetObserver(this.viewPagerAdapterDataSetObserver);
        }
        this.tabLayout.removeAllTabs();
        this.attached = false;
    }

    public final void setupTabsWithPagerAdapter() {
        this.tabLayout.removeAllTabs();
        PagerAdapter adapter = this.viewPager.getAdapter();
        if (adapter != null) {
            Intrinsics.checkExpressionValueIsNotNull(adapter, "viewPager.adapter ?: return");
            int count = adapter.getCount();
            for (int i = 0; i < count; i++) {
                UDTab newTab = this.tabLayout.newTab();
                newTab.mo91335a(adapter.getPageTitle(i));
                this.tabLayout.addTab(newTab);
            }
            if (count > 0) {
                this.tabLayout.selectTabAt$universe_ui_tab_release(this.viewPager.getCurrentItem(), true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$onTabSelectedListener$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "onTabSelected", "onTabUnselected", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator$a */
    public static final class C25778a implements UDTabLayout.OnTabSelectedListener {

        /* renamed from: a */
        final /* synthetic */ UDTabLayoutCoordinator f63612a;

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: a */
        public void mo53906a(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: b */
        public void mo53907b(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25778a(UDTabLayoutCoordinator uDTabLayoutCoordinator) {
            this.f63612a = uDTabLayoutCoordinator;
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: c */
        public void mo53908c(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            if (this.f63612a.viewPager.getCurrentItem() != bVar.mo91343d()) {
                this.f63612a.viewPager.setCurrentItem(bVar.mo91343d());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J \u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$onViewPagerPageChangeListener$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "previousScrollState", "", "scrollState", "onPageScrollStateChanged", "", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator$b */
    public static final class C25779b implements ViewPager.OnPageChangeListener {

        /* renamed from: a */
        final /* synthetic */ UDTabLayoutCoordinator f63613a;

        /* renamed from: b */
        private int f63614b;

        /* renamed from: c */
        private int f63615c;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25779b(UDTabLayoutCoordinator uDTabLayoutCoordinator) {
            this.f63613a = uDTabLayoutCoordinator;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f63615c = this.f63614b;
            this.f63614b = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            boolean z;
            if (i != this.f63613a.tabLayout.getSelectPosition()) {
                if (this.f63614b == 2 && this.f63615c == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f63613a.tabLayout.selectTabAt$universe_ui_tab_release(i, z);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            int i3 = this.f63614b;
            boolean z2 = true;
            if (i3 != 2) {
                z = true;
            } else {
                z = false;
            }
            if (i3 == 2 && this.f63615c == 0) {
                z2 = false;
            }
            this.f63613a.tabLayout.setScrollPosition$universe_ui_tab_release(i, f, z, z2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator$viewPagerAdapterChangeListener$1", "Landroidx/viewpager/widget/ViewPager$OnAdapterChangeListener;", "onAdapterChanged", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "oldAdapter", "Landroidx/viewpager/widget/PagerAdapter;", "newAdapter", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator$c */
    public static final class C25780c implements ViewPager.AbstractC1578c {

        /* renamed from: a */
        final /* synthetic */ UDTabLayoutCoordinator f63616a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25780c(UDTabLayoutCoordinator uDTabLayoutCoordinator) {
            this.f63616a = uDTabLayoutCoordinator;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1578c
        /* renamed from: a */
        public void mo8153a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            Intrinsics.checkParameterIsNotNull(viewPager, "viewPager");
            if (pagerAdapter != null) {
                pagerAdapter.unregisterDataSetObserver(this.f63616a.viewPagerAdapterDataSetObserver);
            }
            this.f63616a.setupPagerAdapter();
        }
    }

    public UDTabLayoutCoordinator(UDTabLayout uDTabLayout, ViewPager viewPager2) {
        Intrinsics.checkParameterIsNotNull(uDTabLayout, "tabLayout");
        Intrinsics.checkParameterIsNotNull(viewPager2, "viewPager");
        this.tabLayout = uDTabLayout;
        this.viewPager = viewPager2;
    }
}

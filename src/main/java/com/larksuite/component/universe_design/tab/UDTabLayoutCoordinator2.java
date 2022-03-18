package com.larksuite.component.universe_design.tab;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0003\f\u000f\u0012\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2;", "", "tabLayout", "Lcom/larksuite/component/universe_design/tab/UDTabLayout;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "tabConfig", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$UDTabConfiguration;", "(Lcom/larksuite/component/universe_design/tab/UDTabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$UDTabConfiguration;)V", "attached", "", "onPageChangeCallback", "com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$onPageChangeCallback$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$onPageChangeCallback$1;", "onTabSelectedListener", "com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$onTabSelectedListener$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$onTabSelectedListener$1;", "pagerAdapterObserver", "com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$pagerAdapterObserver$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$pagerAdapterObserver$1;", "attach", "", "detach", "setupPagerAdapter", "setupTabsWithPagerAdapter", "UDTabConfiguration", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.tab.d */
public final class UDTabLayoutCoordinator2 {

    /* renamed from: a */
    public final UDTabLayout f63626a;

    /* renamed from: b */
    public final ViewPager2 f63627b;

    /* renamed from: c */
    private boolean f63628c;

    /* renamed from: d */
    private final C25782b f63629d = new C25782b(this);

    /* renamed from: e */
    private final C25783c f63630e = new C25783c(this);

    /* renamed from: f */
    private final C25784d f63631f = new C25784d(this);

    /* renamed from: g */
    private final UDTabConfiguration f63632g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$UDTabConfiguration;", "", "onConfigureTab", "", "position", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.d$a */
    public interface UDTabConfiguration {
        /* renamed from: a */
        void mo91356a(int i, UDTab bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$pagerAdapterObserver$1", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "onChanged", "", "onItemRangeChanged", "positionStart", "", "itemCount", "payload", "", "onItemRangeInserted", "onItemRangeMoved", "fromPosition", "toPosition", "onItemRangeRemoved", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.d$d */
    public static final class C25784d extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        final /* synthetic */ UDTabLayoutCoordinator2 f63637a;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            this.f63637a.mo91355c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25784d(UDTabLayoutCoordinator2 dVar) {
            this.f63637a = dVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            this.f63637a.mo91355c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            this.f63637a.mo91355c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            this.f63637a.mo91355c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            this.f63637a.mo91355c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            this.f63637a.mo91355c();
        }
    }

    /* renamed from: d */
    private final void m93037d() {
        RecyclerView.Adapter adapter = this.f63627b.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f63631f);
        }
        mo91355c();
    }

    /* renamed from: b */
    public final void mo91354b() {
        this.f63626a.removeOnTabSelectedListener(this.f63630e);
        this.f63627b.unregisterOnPageChangeCallback(this.f63629d);
        RecyclerView.Adapter adapter = this.f63627b.getAdapter();
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.f63631f);
        }
        this.f63628c = false;
    }

    /* renamed from: c */
    public final void mo91355c() {
        this.f63626a.removeAllTabs();
        RecyclerView.Adapter adapter = this.f63627b.getAdapter();
        if (adapter != null) {
            Intrinsics.checkExpressionValueIsNotNull(adapter, "viewPager.adapter ?: return");
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                UDTab newTab = this.f63626a.newTab();
                this.f63632g.mo91356a(i, newTab);
                this.f63626a.addTab(newTab);
            }
            if (itemCount > 0) {
                this.f63626a.selectTabAt$universe_ui_tab_release(this.f63627b.getCurrentItem(), true);
            }
        }
    }

    /* renamed from: a */
    public final void mo91353a() {
        if (!(!this.f63628c)) {
            throw new IllegalStateException("UDTabLayoutCoordinator2 is already attached".toString());
        } else if (this.f63627b.getAdapter() != null) {
            this.f63628c = true;
            this.f63626a.addOnTabSelectedListener(this.f63630e);
            this.f63627b.registerOnPageChangeCallback(this.f63629d);
            m93037d();
        } else {
            throw new IllegalStateException("UDTabLayoutCoordinator2 attached before viewPager2 has an adapter".toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J \u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$onPageChangeCallback$1", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "previousScrollState", "", "scrollState", "onPageScrollStateChanged", "", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.d$b */
    public static final class C25782b extends ViewPager2.AbstractC1603e {

        /* renamed from: a */
        final /* synthetic */ UDTabLayoutCoordinator2 f63633a;

        /* renamed from: b */
        private int f63634b;

        /* renamed from: c */
        private int f63635c;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25782b(UDTabLayoutCoordinator2 dVar) {
            this.f63633a = dVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
        public void onPageScrollStateChanged(int i) {
            this.f63635c = this.f63634b;
            this.f63634b = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
        public void onPageSelected(int i) {
            boolean z;
            if (i != this.f63633a.f63626a.getSelectPosition()) {
                if (this.f63634b == 2 && this.f63635c == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f63633a.f63626a.selectTabAt$universe_ui_tab_release(i, z);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1603e
        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            int i3 = this.f63634b;
            boolean z2 = true;
            if (i3 != 2) {
                z = true;
            } else {
                z = false;
            }
            if (i3 == 2 && this.f63635c == 0) {
                z2 = false;
            }
            this.f63633a.f63626a.setScrollPosition$universe_ui_tab_release(i, f, z, z2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/larksuite/component/universe_design/tab/UDTabLayoutCoordinator2$onTabSelectedListener$1", "Lcom/larksuite/component/universe_design/tab/UDTabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/larksuite/component/universe_design/tab/UDTab;", "onTabSelected", "onTabUnselected", "universe-ui-tab_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.tab.d$c */
    public static final class C25783c implements UDTabLayout.OnTabSelectedListener {

        /* renamed from: a */
        final /* synthetic */ UDTabLayoutCoordinator2 f63636a;

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
        C25783c(UDTabLayoutCoordinator2 dVar) {
            this.f63636a = dVar;
        }

        @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
        /* renamed from: c */
        public void mo53908c(UDTab bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "tab");
            if (this.f63636a.f63627b.getCurrentItem() != bVar.mo91343d()) {
                this.f63636a.f63627b.setCurrentItem(bVar.mo91343d());
            }
        }
    }

    public UDTabLayoutCoordinator2(UDTabLayout uDTabLayout, ViewPager2 viewPager2, UDTabConfiguration aVar) {
        Intrinsics.checkParameterIsNotNull(uDTabLayout, "tabLayout");
        Intrinsics.checkParameterIsNotNull(viewPager2, "viewPager");
        Intrinsics.checkParameterIsNotNull(aVar, "tabConfig");
        this.f63626a = uDTabLayout;
        this.f63627b = viewPager2;
        this.f63632g = aVar;
    }
}

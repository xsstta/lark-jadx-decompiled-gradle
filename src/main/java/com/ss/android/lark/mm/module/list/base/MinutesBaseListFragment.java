package com.ss.android.lark.mm.module.list.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.lcodecore.tkrefreshlayout.AbstractC26401f;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.ss.android.lark.mm.base.BaseFragment;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.base.MmActiveStateObservable;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesListResponse;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.module.list.data.MmListRankType;
import com.ss.android.lark.mm.module.list.my.MmListFilterPreference;
import com.ss.android.lark.mm.module.list.widget.MinutesListFooterView;
import com.ss.android.lark.mm.module.list.widget.MmListStickyLayout;
import com.ss.android.lark.mm.module.tab.MmMainTabFragment;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableListTracker;
import com.ss.android.lark.mm.statistics.hitpoint.MmTimedHitPointEvent;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BoldTextView;
import com.ss.android.lark.mm.widget.MmLoadingView;
import com.ss.android.lark.mm.widget.pullrefresh.MmRefreshHeadView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0001UB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010+\u001a\u00020,2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010.2\u0006\u00100\u001a\u00020\u001dH\u0002J\b\u00101\u001a\u00020,H\u0002J\b\u00102\u001a\u00020\u000fH&J\b\u00103\u001a\u00020,H\u0002J\b\u00104\u001a\u00020,H\u0014J\b\u00105\u001a\u00020\u001dH\u0002J&\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\b\u0010>\u001a\u00020,H\u0016J\b\u0010?\u001a\u00020,H&J\u0012\u0010@\u001a\u00020,2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u001a\u0010C\u001a\u00020,2\u0006\u0010D\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010E\u001a\u00020,2\b\u0010F\u001a\u0004\u0018\u000107H\u0016J\u0010\u0010G\u001a\u00020,2\u0006\u0010H\u001a\u00020\u001dH\u0014J\b\u0010I\u001a\u00020,H\u0002J\b\u0010J\u001a\u00020,H\u0002J\u0016\u0010K\u001a\u00020,2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u001dJ\b\u0010O\u001a\u00020,H\u0002J\b\u0010P\u001a\u00020,H\u0002J\u0006\u0010Q\u001a\u00020,J\b\u0010R\u001a\u00020,H\u0002J\b\u0010S\u001a\u00020,H&J\b\u0010T\u001a\u00020,H\u0004R\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u0004\u0018\u00010#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\n **\u0004\u0018\u00010)0)X\u000e¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/ss/android/lark/mm/module/list/base/MinutesBaseListFragment;", "Lcom/ss/android/lark/mm/base/BaseFragment;", "Lcom/ss/android/lark/mm/depend/IMmDepend$IWschannelDependency$NetworkLevelListener;", "repoId", "", "ds", "Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "fragmentManager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;Lcom/ss/android/lark/mm/base/IFragmentManager;)V", "EXPIRE_INTERVAL", "", "adapter", "Lcom/ss/android/lark/mm/module/list/base/MinutesListAdapter;", "aliveEvent", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent;", "getAliveEvent", "()Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent;", "setAliveEvent", "(Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent;)V", "control", "Lcom/ss/android/lark/mm/module/list/control/MmListControl;", "getControl", "()Lcom/ss/android/lark/mm/module/list/control/MmListControl;", "getDs", "()Lcom/ss/android/lark/mm/module/list/control/MmListControl$DataSource;", "getFragmentManager", "()Lcom/ss/android/lark/mm/base/IFragmentManager;", "isInited", "", "isLoadMore", "isRefreshing", "lastRefreshMillis", "", "listFilterPreference", "Lcom/ss/android/lark/mm/module/list/my/MmListFilterPreference;", "getListFilterPreference", "()Lcom/ss/android/lark/mm/module/list/my/MmListFilterPreference;", "getRepoId", "()Ljava/lang/String;", "wschannelDependency", "Lcom/ss/android/lark/mm/depend/IMmDepend$IWschannelDependency;", "kotlin.jvm.PlatformType", "bindList", "", "list", "", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "hasMore", "dismissLoading", "generatePageAliveEvent", "initData", "initView", "isExpired", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFilterList", "onNetworkLevelChanged", "level", "Lcom/ss/android/lark/mm/depend/IMmDepend$IWschannelDependency$MmNetworkLevel;", "onViewCreated", "view", "onViewDetachedFromWindow", "v", "onVisibilityChanged", "visible", "preloadNextPage", "refresh", "renderSortView", "sortType", "Lcom/ss/android/lark/mm/module/list/data/MmListRankType;", "isAsc", "setupFilterView", "setupNetworkTip", "setupRecordVisibility", "setupSwitchTabArea", "setupTitleBar", "showLoading", "Companion", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.base.c */
public abstract class MinutesBaseListFragment extends BaseFragment implements IMmDepend.IWschannelDependency.AbstractC45869a {

    /* renamed from: c */
    public static final Companion f116768c = new Companion(null);

    /* renamed from: a */
    public MinutesListAdapter f116769a;

    /* renamed from: b */
    public MmTimedHitPointEvent f116770b;

    /* renamed from: d */
    private boolean f116771d;

    /* renamed from: e */
    private boolean f116772e;

    /* renamed from: f */
    private boolean f116773f;

    /* renamed from: g */
    private final MmListControl f116774g;

    /* renamed from: h */
    private final MmListFilterPreference f116775h;

    /* renamed from: i */
    private IMmDepend.IWschannelDependency f116776i;

    /* renamed from: j */
    private final int f116777j;

    /* renamed from: k */
    private long f116778k;

    /* renamed from: l */
    private final String f116779l;

    /* renamed from: m */
    private final MmListControl.DataSource f116780m;

    /* renamed from: n */
    private final IFragmentManager f116781n;

    /* renamed from: o */
    private HashMap f116782o;

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f116782o == null) {
            this.f116782o = new HashMap();
        }
        View view = (View) this.f116782o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116782o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f116782o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: i */
    public abstract void mo162880i();

    /* renamed from: j */
    public abstract void mo162881j();

    /* renamed from: k */
    public abstract MmTimedHitPointEvent mo162882k();

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo161170c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$Companion;", "", "()V", "TAG", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final MmListControl mo162938d() {
        return this.f116774g;
    }

    /* renamed from: e */
    public final MmListFilterPreference mo162939e() {
        return this.f116775h;
    }

    /* renamed from: o */
    public final MmListControl.DataSource mo162946o() {
        return this.f116780m;
    }

    /* renamed from: p */
    public final IFragmentManager mo162947p() {
        return this.f116781n;
    }

    /* renamed from: f */
    public final MmTimedHitPointEvent mo162940f() {
        MmTimedHitPointEvent mmTimedHitPointEvent = this.f116770b;
        if (mmTimedHitPointEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aliveEvent");
        }
        return mmTimedHitPointEvent;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onDestroy() {
        super.onDestroy();
        MmListFilterPreference aVar = this.f116775h;
        if (aVar != null) {
            aVar.mo162901g();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$initData$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$e */
    public static final class C46363e extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmListControl $this_apply;
        final /* synthetic */ MinutesBaseListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46363e(MmListControl mmListControl, MinutesBaseListFragment cVar) {
            super(0);
            this.$this_apply = mmListControl;
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            MinutesBaseListFragment.m183541a(this.this$0).mo162961a(this.$this_apply.mo162974a(this.this$0.mo162946o()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$initView$3", "Lcom/ss/android/lark/mm/module/list/widget/MmListStickyLayout$IMmStickNavListener;", "onTopViewCompletelyVisible", "", "isCompletelyVisible", "", "stopScroll", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$k */
    public static final class C46369k implements MmListStickyLayout.AbstractC46464a {

        /* renamed from: a */
        final /* synthetic */ MinutesBaseListFragment f116785a;

        @Override // com.ss.android.lark.mm.module.list.widget.MmListStickyLayout.AbstractC46464a
        /* renamed from: a */
        public void mo162949a() {
            RecyclerView recyclerView = (RecyclerView) this.f116785a.mo161166a(R.id.rvList);
            if (recyclerView != null) {
                recyclerView.stopNestedScroll(1);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46369k(MinutesBaseListFragment cVar) {
            this.f116785a = cVar;
        }

        @Override // com.ss.android.lark.mm.module.list.widget.MmListStickyLayout.AbstractC46464a
        /* renamed from: a */
        public void mo162950a(boolean z) {
            TwinklingRefreshLayout twinklingRefreshLayout = (TwinklingRefreshLayout) this.f116785a.mo161166a(R.id.ptrLayout);
            if (twinklingRefreshLayout != null) {
                twinklingRefreshLayout.setEnableRefresh(z);
            }
        }
    }

    /* renamed from: q */
    private final boolean m183542q() {
        if (System.currentTimeMillis() - this.f116778k > ((long) this.f116777j)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private final void m183543r() {
        IMmDepend.IWschannelDependency iWschannelDependency = this.f116776i;
        Intrinsics.checkExpressionValueIsNotNull(iWschannelDependency, "wschannelDependency");
        mo161212a(iWschannelDependency.mo144566a());
        this.f116776i.mo144568a(this);
    }

    /* renamed from: u */
    private final void m183546u() {
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvList");
        recyclerView.setVisibility(0);
        ((MmLoadingView) mo161166a(R.id.loadingView)).mo165613a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$b */
    public static final class C46360b extends Lambda implements Function0<Unit> {
        final /* synthetic */ MinutesBaseListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46360b(MinutesBaseListFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            ErrorFactory aVar = ErrorFactory.f116755a;
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo161166a(R.id.emptyContainer);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "emptyContainer");
            aVar.mo162921a(frameLayout);
            ((TwinklingRefreshLayout) this.this$0.mo161166a(R.id.ptrLayout)).mo93526e();
            this.this$0.mo162944m();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$initData$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$d */
    public static final class C46362d extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmListControl $this_apply;
        final /* synthetic */ MinutesBaseListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46362d(MmListControl mmListControl, MinutesBaseListFragment cVar) {
            super(0);
            this.$this_apply = mmListControl;
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            MinutesBaseListFragment cVar = this.this$0;
            cVar.mo162937a(this.$this_apply.mo162995d(cVar.mo162946o()), this.$this_apply.mo163003f(this.this$0.mo162946o()));
            MmAppreciableListTracker.f118526a.mo165390d();
            MmAppreciableListTracker.f118526a.mo165391e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$initData$1$5"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$f */
    public static final class C46364f extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmListControl $this_apply;
        final /* synthetic */ MinutesBaseListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46364f(MmListControl mmListControl, MinutesBaseListFragment cVar) {
            super(0);
            this.$this_apply = mmListControl;
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RecyclerView recyclerView = (RecyclerView) this.this$0.mo161166a(R.id.rvList);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvList");
            if (recyclerView.getScrollState() != 1) {
                MinutesBaseListFragment.m183541a(this.this$0).mo162958a(this.$this_apply.mo163004g());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$initData$1$7"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$g */
    public static final class C46365g extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmListControl $this_apply;
        final /* synthetic */ MinutesBaseListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46365g(MmListControl mmListControl, MinutesBaseListFragment cVar) {
            super(0);
            this.$this_apply = mmListControl;
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RecyclerView recyclerView = (RecyclerView) this.this$0.mo161166a(R.id.rvList);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvList");
            if (recyclerView.getScrollState() != 1) {
                MinutesBaseListFragment.m183541a(this.this$0).mo162959a(this.$this_apply.mo162998e(), this.$this_apply.mo163001f());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$initData$1$9"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$h */
    public static final class C46366h extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmListControl $this_apply;
        final /* synthetic */ MinutesBaseListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46366h(MmListControl mmListControl, MinutesBaseListFragment cVar) {
            super(0);
            this.$this_apply = mmListControl;
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            RecyclerView recyclerView = (RecyclerView) this.this$0.mo161166a(R.id.rvList);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvList");
            if (recyclerView.getScrollState() != 1) {
                MinutesBaseListFragment.m183541a(this.this$0).mo162960a(this.$this_apply.mo162994d());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$l */
    public static final class RunnableC46370l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MinutesBaseListFragment f116786a;

        /* renamed from: b */
        final /* synthetic */ IMmDepend.IWschannelDependency.MmNetworkLevel f116787b;

        RunnableC46370l(MinutesBaseListFragment cVar, IMmDepend.IWschannelDependency.MmNetworkLevel mmNetworkLevel) {
            this.f116786a = cVar;
            this.f116787b = mmNetworkLevel;
        }

        public final void run() {
            if (this.f116787b == IMmDepend.IWschannelDependency.MmNetworkLevel.NET_UNAVAILABLE) {
                UDNotice uDNotice = (UDNotice) this.f116786a.mo161166a(R.id.tip);
                if (uDNotice != null) {
                    uDNotice.setVisibility(0);
                    return;
                }
                return;
            }
            UDNotice uDNotice2 = (UDNotice) this.f116786a.mo161166a(R.id.tip);
            if (uDNotice2 != null) {
                uDNotice2.setVisibility(8);
            }
        }
    }

    /* renamed from: s */
    private final void m183544s() {
        if (this.f116780m == MmListControl.DataSource.HomeList) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo161166a(R.id.tabSwitchArea);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "tabSwitchArea");
            constraintLayout.setVisibility(0);
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo161166a(R.id.tabSwitchArea);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "tabSwitchArea");
        constraintLayout2.setVisibility(8);
    }

    /* renamed from: h */
    public final void mo162942h() {
        MmMainTabFragment aVar = null;
        if (this.f116780m == MmListControl.DataSource.TrashList) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof MmMainTabFragment) {
                aVar = parentFragment;
            }
            MmMainTabFragment aVar2 = (MmMainTabFragment) aVar;
            if (aVar2 != null) {
                aVar2.mo162053b(false);
                return;
            }
            return;
        }
        Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 instanceof MmMainTabFragment) {
            aVar = parentFragment2;
        }
        MmMainTabFragment aVar3 = aVar;
        if (aVar3 != null) {
            aVar3.mo162053b(true);
        }
    }

    /* renamed from: m */
    public final void mo162944m() {
        if (this.f116772e) {
            ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).mo93527f();
        } else if (!this.f116771d) {
            this.f116771d = true;
            this.f116778k = System.currentTimeMillis();
            MmListControl b = MmListControl.f116817j.mo163013b(this.f116779l);
            if (b != null) {
                b.mo163005g(this.f116780m);
            }
        }
    }

    /* renamed from: v */
    private final void m183547v() {
        MmListControl b = MmListControl.f116817j.mo163013b(this.f116779l);
        if (b != null) {
            mo161167a().mo237937a(b.mo162973a(this.f116780m, new C46362d(b, this)));
            mo161167a().mo237937a(b.mo162973a(MmListControl.DataSource.Progress, new C46363e(b, this)));
            mo161167a().mo237937a(b.mo162973a(MmListControl.DataSource.Recording, new C46364f(b, this)));
            mo161167a().mo237937a(b.mo162973a(MmListControl.DataSource.Uploading, new C46365g(b, this)));
            mo161167a().mo237937a(b.mo162973a(MmListControl.DataSource.Duration, new C46366h(b, this)));
        }
    }

    /* renamed from: l */
    public final void mo162943l() {
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvList");
        recyclerView.setVisibility(8);
        MmLoadingView mmLoadingView = (MmLoadingView) mo161166a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(mmLoadingView, "loadingView");
        mmLoadingView.setVisibility(0);
        MmLoadingView mmLoadingView2 = (MmLoadingView) mo161166a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(mmLoadingView2, "loadingView");
        String string = mmLoadingView2.getContext().getString(R.string.MMWeb_G_Loading);
        Intrinsics.checkExpressionValueIsNotNull(string, "loadingView.context.getS…R.string.MMWeb_G_Loading)");
        ((MmLoadingView) mo161166a(R.id.loadingView)).mo165614a(string);
    }

    /* renamed from: n */
    public final void mo162945n() {
        C45855f.m181663b("MinutesBaseListFragment", "preloadNextPage");
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvList);
        if (recyclerView != null) {
            recyclerView.stopNestedScroll(1);
        }
        MmListControl b = MmListControl.f116817j.mo163013b(this.f116779l);
        if (b != null && !b.mo163003f(this.f116780m)) {
            return;
        }
        if (this.f116771d) {
            ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).mo93528g();
        } else if (!this.f116772e) {
            this.f116772e = true;
            MmListControl b2 = MmListControl.f116817j.mo163013b(this.f116779l);
            if (b2 != null) {
                b2.mo163007h(this.f116780m);
            }
        }
    }

    /* renamed from: t */
    private final void m183545t() {
        int i = C46373d.f116790c[this.f116780m.ordinal()];
        if (i == 1) {
            BoldTextView boldTextView = (BoldTextView) mo161166a(R.id.filterTitle);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "filterTitle");
            boldTextView.setText(getString(R.string.MMWeb_G_Recent));
        } else if (i == 2) {
            mo162936a(MmListRankType.CREATE_TIME, false);
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo161166a(R.id.filterIcon);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "filterIcon");
            appCompatImageView.setVisibility(8);
            View a = mo161166a(R.id.filterDivider);
            Intrinsics.checkExpressionValueIsNotNull(a, "filterDivider");
            a.setVisibility(8);
        } else if (i != 3) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo161166a(R.id.filterLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "filterLayout");
            constraintLayout.setVisibility(8);
        } else {
            mo162936a(MmListRankType.SHARE_TIME, false);
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo161166a(R.id.filterIcon);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "filterIcon");
            appCompatImageView2.setVisibility(8);
            View a2 = mo161166a(R.id.filterDivider);
            Intrinsics.checkExpressionValueIsNotNull(a2, "filterDivider");
            a2.setVisibility(8);
        }
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) mo161166a(R.id.filterIcon);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView3, "filterIcon");
        C47110e.m186573a(appCompatImageView3, new C46372n(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo162941g() {
        MmRefreshHeadView mmRefreshHeadView = new MmRefreshHeadView(getContext());
        mmRefreshHeadView.setProgressBackgroundColorSchemeResource(R.color.bg_body);
        TwinklingRefreshLayout twinklingRefreshLayout = (TwinklingRefreshLayout) mo161166a(R.id.ptrLayout);
        Intrinsics.checkExpressionValueIsNotNull(twinklingRefreshLayout, "ptrLayout");
        twinklingRefreshLayout.setNestedScrollingEnabled(false);
        ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setHeaderView(mmRefreshHeadView);
        ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setBottomView(new MinutesListFooterView(getContext()));
        ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setHeaderHeight(44.0f);
        ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setEnableOverScroll(false);
        ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setOnRefreshListener(new C46367i(this));
        MinutesBaseListFragment$initView$layoutManager$1 minutesBaseListFragment$initView$layoutManager$1 = new MinutesBaseListFragment$initView$layoutManager$1(this, getContext());
        minutesBaseListFragment$initView$layoutManager$1.setOrientation(1);
        RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvList");
        recyclerView.setLayoutManager(minutesBaseListFragment$initView$layoutManager$1);
        RecyclerView recyclerView2 = (RecyclerView) mo161166a(R.id.rvList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvList");
        RecyclerView.ItemAnimator itemAnimator = recyclerView2.getItemAnimator();
        if (!(itemAnimator instanceof SimpleItemAnimator)) {
            itemAnimator = null;
        }
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) itemAnimator;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
        }
        RecyclerView recyclerView3 = (RecyclerView) mo161166a(R.id.rvList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rvList");
        recyclerView3.setItemAnimator(null);
        this.f116769a = new MinutesListAdapter(this.f116780m, this.f116779l);
        RecyclerView recyclerView4 = (RecyclerView) mo161166a(R.id.rvList);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "rvList");
        MinutesListAdapter eVar = this.f116769a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        recyclerView4.setAdapter(eVar);
        ((RecyclerView) mo161166a(R.id.rvList)).addOnScrollListener(new C46368j(this));
        ((MmListStickyLayout) mo161166a(R.id.rootStickLayout)).setListener(new C46369k(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$initView$1", "Lcom/lcodecore/tkrefreshlayout/RefreshListenerAdapter;", "onLoadMore", "", "refreshLayout", "Lcom/lcodecore/tkrefreshlayout/TwinklingRefreshLayout;", "onRefresh", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$i */
    public static final class C46367i extends AbstractC26401f {

        /* renamed from: a */
        final /* synthetic */ MinutesBaseListFragment f116783a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46367i(MinutesBaseListFragment cVar) {
            this.f116783a = cVar;
        }

        @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
        /* renamed from: a */
        public void mo93516a(TwinklingRefreshLayout twinklingRefreshLayout) {
            Intrinsics.checkParameterIsNotNull(twinklingRefreshLayout, "refreshLayout");
            this.f116783a.mo162944m();
        }

        @Override // com.lcodecore.tkrefreshlayout.AbstractC26401f, com.lcodecore.tkrefreshlayout.AbstractC26400e
        /* renamed from: b */
        public void mo93519b(TwinklingRefreshLayout twinklingRefreshLayout) {
            Intrinsics.checkParameterIsNotNull(twinklingRefreshLayout, "refreshLayout");
            this.f116783a.mo162945n();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$initView$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$j */
    public static final class C46368j extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ MinutesBaseListFragment f116784a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46368j(MinutesBaseListFragment cVar) {
            this.f116784a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                int itemCount = linearLayoutManager.getItemCount();
                if (i2 > 0 && itemCount - findLastCompletelyVisibleItemPosition < MmListControl.f116817j.mo163011a()) {
                    this.f116784a.mo162945n();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$m */
    public static final class C46371m extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MinutesBaseListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46371m(MinutesBaseListFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            this.this$0.mo162880i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$n */
    public static final class C46372n extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MinutesBaseListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46372n(MinutesBaseListFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            this.this$0.mo162880i();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "pos", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.base.c$c */
    public static final class C46361c extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ MinutesBaseListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46361c(MinutesBaseListFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((RecyclerView) this.this$0.mo161166a(R.id.rvList)).scrollToPosition(i);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MinutesListAdapter m183541a(MinutesBaseListFragment cVar) {
        MinutesListAdapter eVar = cVar.f116769a;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return eVar;
    }

    @Override // com.ss.android.lark.mm.depend.IMmDepend.IWschannelDependency.AbstractC45869a
    /* renamed from: a */
    public void mo161212a(IMmDepend.IWschannelDependency.MmNetworkLevel mmNetworkLevel) {
        C26171w.m94675a(new RunnableC46370l(this, mmNetworkLevel));
    }

    @Override // com.ss.android.lark.mm.base.BaseFragment
    public void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        this.f116776i.mo144569b(this);
        mo161167a().dispose();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public void mo161168a(boolean z) {
        if (z && (!this.f116773f || m183542q())) {
            mo162944m();
            mo162943l();
        }
        if (z) {
            MmTimedHitPointEvent mmTimedHitPointEvent = this.f116770b;
            if (mmTimedHitPointEvent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("aliveEvent");
            }
            mmTimedHitPointEvent.mo165403a();
            MmActiveStateObservable.f115698a.mo161186a();
            return;
        }
        MmActiveStateObservable.f115698a.mo161188b();
        MmTimedHitPointEvent mmTimedHitPointEvent2 = this.f116770b;
        if (mmTimedHitPointEvent2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("aliveEvent");
        }
        mmTimedHitPointEvent2.mo165405b();
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        this.f116770b = mo162882k();
        view.setOnClickListener(null);
        mo162941g();
        mo162881j();
        m183545t();
        m183544s();
        mo162942h();
        m183547v();
        m183543r();
    }

    /* renamed from: a */
    public final void mo162936a(MmListRankType mmListRankType, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(mmListRankType, "sortType");
        if (this.f116780m == MmListControl.DataSource.ShareList || this.f116780m == MmListControl.DataSource.MyList) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            BoldTextView boldTextView = (BoldTextView) mo161166a(R.id.filterTitle);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "filterTitle");
            boldTextView.setTextSize(14.0f);
            BoldTextView boldTextView2 = (BoldTextView) mo161166a(R.id.filterTitle);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "filterTitle");
            ((BoldTextView) mo161166a(R.id.filterTitle)).setTypeface(boldTextView2.getTypeface(), 0);
            int i3 = C46373d.f116788a[mmListRankType.ordinal()];
            if (i3 == 1) {
                BoldTextView boldTextView3 = (BoldTextView) mo161166a(R.id.filterTitle);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "filterTitle");
                boldTextView3.setText(getString(R.string.MMWeb_G_SortByShared));
            } else if (i3 == 2) {
                BoldTextView boldTextView4 = (BoldTextView) mo161166a(R.id.filterTitle);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "filterTitle");
                boldTextView4.setText(getString(R.string.MMWeb_G_SortByCreated));
            } else if (i3 == 3) {
                BoldTextView boldTextView5 = (BoldTextView) mo161166a(R.id.filterTitle);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView5, "filterTitle");
                boldTextView5.setText(getString(R.string.MMWeb_G_SortByLastOpened));
            }
            int i4 = C46373d.f116789b[this.f116780m.ordinal()];
            if (i4 == 1 ? mmListRankType != MmListRankType.CREATE_TIME || z : !(i4 == 2 && mmListRankType == MmListRankType.SHARE_TIME && !z)) {
                z3 = false;
            } else {
                z3 = true;
            }
            Context a = C45851c.m181646a();
            if (z3) {
                i = R.color.icon_n2;
            } else {
                i = R.color.primary_pri_500;
            }
            int color = ContextCompat.getColor(a, i);
            Context a2 = C45851c.m181646a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "MmContext.getContext()");
            if (z) {
                i2 = R.drawable.ud_icon_arrow_up_outlined;
            } else {
                i2 = R.drawable.ud_icon_arrow_down_outlined;
            }
            Drawable iconDrawable = UDIconUtils.getIconDrawable(a2, i2, color);
            BoldTextView boldTextView6 = (BoldTextView) mo161166a(R.id.filterTitle);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView6, "filterTitle");
            boldTextView6.setSelected(!z3);
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo161166a(R.id.sortArrow);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "sortArrow");
            appCompatImageView.setVisibility(0);
            ((AppCompatImageView) mo161166a(R.id.sortArrow)).setImageDrawable(iconDrawable);
            BoldTextView boldTextView7 = (BoldTextView) mo161166a(R.id.filterTitle);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView7, "filterTitle");
            C47110e.m186573a(boldTextView7, new C46371m(this));
        }
    }

    /* renamed from: a */
    public final void mo162937a(List<MinutesSummaryData> list, boolean z) {
        boolean z2;
        boolean z3;
        MmListControl b = MmListControl.f116817j.mo163013b(this.f116779l);
        if (b != null) {
            List<MinutesSummaryData> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (list == null) {
                    ErrorFactory aVar = ErrorFactory.f116755a;
                    MmListControl.DataError dataError = MmListControl.DataError.EmptyAndRetry;
                    FrameLayout frameLayout = (FrameLayout) mo161166a(R.id.emptyContainer);
                    Intrinsics.checkExpressionValueIsNotNull(frameLayout, "emptyContainer");
                    aVar.mo162923a(dataError, frameLayout, new C46360b(this));
                } else {
                    int i = C46373d.f116791d[this.f116780m.ordinal()];
                    MmListRankType mmListRankType = null;
                    if (i == 1) {
                        MmListFilterPreference aVar2 = this.f116775h;
                        if (aVar2 != null) {
                            mmListRankType = aVar2.mo162897c();
                        }
                        if (mmListRankType == MmListRankType.CREATE_TIME) {
                            ErrorFactory aVar3 = ErrorFactory.f116755a;
                            MmListControl.DataError dataError2 = MmListControl.DataError.EmptyMyList;
                            FrameLayout frameLayout2 = (FrameLayout) mo161166a(R.id.emptyContainer);
                            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "emptyContainer");
                            ErrorFactory.m183531a(aVar3, dataError2, frameLayout2, null, 4, null);
                        } else {
                            ErrorFactory aVar4 = ErrorFactory.f116755a;
                            MmListControl.DataError dataError3 = MmListControl.DataError.EmptySearch;
                            FrameLayout frameLayout3 = (FrameLayout) mo161166a(R.id.emptyContainer);
                            Intrinsics.checkExpressionValueIsNotNull(frameLayout3, "emptyContainer");
                            ErrorFactory.m183531a(aVar4, dataError3, frameLayout3, null, 4, null);
                        }
                    } else if (i == 2) {
                        ErrorFactory aVar5 = ErrorFactory.f116755a;
                        MmListControl.DataError dataError4 = MmListControl.DataError.EmptyHomeList;
                        FrameLayout frameLayout4 = (FrameLayout) mo161166a(R.id.emptyContainer);
                        Intrinsics.checkExpressionValueIsNotNull(frameLayout4, "emptyContainer");
                        ErrorFactory.m183531a(aVar5, dataError4, frameLayout4, null, 4, null);
                    } else if (i == 3) {
                        MmListFilterPreference aVar6 = this.f116775h;
                        if (aVar6 != null) {
                            mmListRankType = aVar6.mo162899e();
                        }
                        if (mmListRankType == MmListRankType.SHARE_TIME) {
                            ErrorFactory aVar7 = ErrorFactory.f116755a;
                            MmListControl.DataError dataError5 = MmListControl.DataError.EmptyShareList;
                            FrameLayout frameLayout5 = (FrameLayout) mo161166a(R.id.emptyContainer);
                            Intrinsics.checkExpressionValueIsNotNull(frameLayout5, "emptyContainer");
                            ErrorFactory.m183531a(aVar7, dataError5, frameLayout5, null, 4, null);
                        } else {
                            ErrorFactory aVar8 = ErrorFactory.f116755a;
                            MmListControl.DataError dataError6 = MmListControl.DataError.EmptySearch;
                            FrameLayout frameLayout6 = (FrameLayout) mo161166a(R.id.emptyContainer);
                            Intrinsics.checkExpressionValueIsNotNull(frameLayout6, "emptyContainer");
                            ErrorFactory.m183531a(aVar8, dataError6, frameLayout6, null, 4, null);
                        }
                    } else if (i == 4) {
                        ErrorFactory aVar9 = ErrorFactory.f116755a;
                        MmListControl.DataError dataError7 = MmListControl.DataError.EmptyTrashList;
                        FrameLayout frameLayout7 = (FrameLayout) mo161166a(R.id.emptyContainer);
                        Intrinsics.checkExpressionValueIsNotNull(frameLayout7, "emptyContainer");
                        ErrorFactory.m183531a(aVar9, dataError7, frameLayout7, null, 4, null);
                    }
                }
                m183546u();
            } else {
                ErrorFactory aVar10 = ErrorFactory.f116755a;
                FrameLayout frameLayout8 = (FrameLayout) mo161166a(R.id.emptyContainer);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout8, "emptyContainer");
                aVar10.mo162921a(frameLayout8);
            }
            RecyclerView recyclerView = (RecyclerView) mo161166a(R.id.rvList);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvList");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                MinutesListAdapter eVar = this.f116769a;
                if (eVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                }
                MmListControl.DataSource dataSource = this.f116780m;
                eVar.mo162957a(dataSource, list, b.mo162993c(dataSource), findFirstVisibleItemPosition, new C46361c(this));
                MinutesListResponse b2 = b.mo162987b(this.f116780m);
                if (b2 == null || !b2.isFromNetwork()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (this.f116771d && z3) {
                    ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).mo93527f();
                    this.f116771d = false;
                }
                if (this.f116772e) {
                    ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).mo93528g();
                    this.f116772e = false;
                }
                ((TwinklingRefreshLayout) mo161166a(R.id.ptrLayout)).setEnableLoadmore(z);
                if (!this.f116773f || z3) {
                    this.f116773f = true;
                    m183546u();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_base_fragment_list, viewGroup, false);
    }

    public MinutesBaseListFragment(String str, MmListControl.DataSource dataSource, IFragmentManager bVar) {
        MmListFilterPreference aVar;
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(dataSource, "ds");
        Intrinsics.checkParameterIsNotNull(bVar, "fragmentManager");
        this.f116779l = str;
        this.f116780m = dataSource;
        this.f116781n = bVar;
        MmListControl b = MmListControl.f116817j.mo163013b(str);
        this.f116774g = b;
        if (b != null) {
            aVar = b.mo162986b();
        } else {
            aVar = null;
        }
        this.f116775h = aVar;
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        this.f116776i = a.getWschannelDependency();
        this.f116777j = 300000;
    }
}

package com.ss.android.lark.mm.module.list.my;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.base.p2289a.AbstractC45860a;
import com.ss.android.lark.mm.base.p2289a.C45861b;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment;
import com.ss.android.lark.mm.module.list.base.MinutesListActivity;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;
import com.ss.android.lark.mm.module.list.data.MmListRankType;
import com.ss.android.lark.mm.module.list.p2304b.C46343b;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MmTimedHitPointEvent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/mm/module/list/my/MmMyListFragment;", "Lcom/ss/android/lark/mm/module/list/base/MinutesBaseListFragment;", "repoId", "", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/base/IFragmentManager;)V", "listRefreshCallback", "Lcom/ss/android/lark/mm/base/repo/IMmDataCallback;", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "renameCallback", "generatePageAliveEvent", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFilterList", "onViewCreated", "view", "Landroid/view/View;", "setupTitleBar", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.b.c */
public final class MmMyListFragment extends MinutesBaseListFragment {

    /* renamed from: d */
    private final AbstractC45860a<MinutesSummaryData> f116743d = new C46346a(this);

    /* renamed from: e */
    private final AbstractC45860a<MinutesSummaryData> f116744e = new C46348c(this);

    /* renamed from: f */
    private HashMap f116745f;

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f116745f == null) {
            this.f116745f = new HashMap();
        }
        View view = (View) this.f116745f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116745f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f116745f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mm/module/list/my/MmMyListFragment$onFilterList$filterDialog$1", "Lcom/ss/android/lark/mm/module/list/my/MmMyListFilterDialog$IMmMyListFilterDependency;", "getCurrentSortTimeOrder", "", "getCurrentSortType", "Lcom/ss/android/lark/mm/module/list/data/MmListRankType;", "onSortConfirmCallback", "", "lastSortType", "lastSortTimeOrder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.b.c$b */
    public static final class C46347b implements C46343b.AbstractC46344a {

        /* renamed from: a */
        final /* synthetic */ MmMyListFragment f116747a;

        @Override // com.ss.android.lark.mm.module.list.p2304b.C46343b.AbstractC46344a
        /* renamed from: b */
        public boolean mo162908b() {
            MmListFilterPreference e = this.f116747a.mo162939e();
            if (e != null) {
                return e.mo162898d();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.list.p2304b.C46343b.AbstractC46344a
        /* renamed from: a */
        public MmListRankType mo162906a() {
            MmListRankType c;
            MmListFilterPreference e = this.f116747a.mo162939e();
            if (e == null || (c = e.mo162897c()) == null) {
                return MmListRankType.CREATE_TIME;
            }
            return c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46347b(MmMyListFragment cVar) {
            this.f116747a = cVar;
        }

        @Override // com.ss.android.lark.mm.module.list.p2304b.C46343b.AbstractC46344a
        /* renamed from: a */
        public void mo162907a(MmListRankType mmListRankType, boolean z) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(mmListRankType, "lastSortType");
            MmListFilterPreference e = this.f116747a.mo162939e();
            if (e != null) {
                e.mo162891a(mmListRankType);
            }
            MmListFilterPreference e2 = this.f116747a.mo162939e();
            if (e2 != null) {
                e2.mo162893a(z);
            }
            this.f116747a.mo162943l();
            MmListControl d = this.f116747a.mo162938d();
            if (d != null) {
                d.mo163005g(MmListControl.DataSource.MyList);
            }
            this.f116747a.mo162936a(mmListRankType, z);
            C47086i h = C47086i.m186432a().mo165422d("items_filter").mo165423e("vc_minutes_list_view").mo165426h("my_content");
            if (mmListRankType == MmListRankType.CREATE_TIME) {
                str = "created";
            } else {
                str = "opened";
            }
            C47086i a = h.mo165413a("show", str);
            if (z) {
                str2 = "earliest_to_latest";
            } else {
                str2 = "latest_to_earliest";
            }
            C47083e.m186427a("vc_minutes_list_click", a.mo165413a("order", str2).mo165421c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/list/my/MmMyListFragment$setupTitleBar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.b.c$d */
    static final class C46349d extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmMyListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46349d(MmMyListFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45855f.m181664c("MinutesBaseListFragment", "my list on back");
            this.this$0.mo162947p().bj_();
        }
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment
    /* renamed from: j */
    public void mo162881j() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MinutesListActivity)) {
            activity = null;
        }
        MinutesListActivity minutesListActivity = (MinutesListActivity) activity;
        if (minutesListActivity != null) {
            MinutesListActivity.m183514a(minutesListActivity, R.string.MMWeb_G_MyContent, new C46349d(this), 0, null, 12, null);
        }
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onDestroyView() {
        super.onDestroyView();
        C45861b.m181700a().f115692c.mo161178b(this.f116743d);
        C45861b.m181700a().f115693d.mo161178b(this.f116744e);
        MmListControl d = mo162938d();
        if (d != null) {
            d.mo162999e(MmListControl.DataSource.MyList);
        }
        mo161170c();
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment
    /* renamed from: i */
    public void mo162880i() {
        FragmentManager supportFragmentManager;
        C47083e.m186427a("vc_minutes_list_click", C47086i.m186432a().mo165422d("items_filter_button").mo165423e("vc_minutes_list_view").mo165426h("my_content").mo165421c());
        C46343b bVar = new C46343b(new C46347b(this));
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it");
            bVar.mo5511a(supportFragmentManager, "");
        }
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment
    /* renamed from: k */
    public MmTimedHitPointEvent mo162882k() {
        StringBuilder sb = new StringBuilder();
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        IMmDepend.AbstractC45875c domainDepend = a.getDomainDepend();
        Intrinsics.checkExpressionValueIsNotNull(domainDepend, "MmDepend.impl().domainDepend");
        sb.append(domainDepend.mo144617b());
        sb.append("/minutes/me");
        String sb2 = sb.toString();
        MmTimedHitPointEvent mmTimedHitPointEvent = new MmTimedHitPointEvent(mo161169b(), "predefine_page_alive", "duration", null, 8, null);
        mmTimedHitPointEvent.mo165401a("my_content").mo165431m(sb2);
        return mmTimedHitPointEvent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "kotlin.jvm.PlatformType", "onData"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.b.c$a */
    static final class C46346a<T> implements AbstractC45860a<MinutesSummaryData> {

        /* renamed from: a */
        final /* synthetic */ MmMyListFragment f116746a;

        C46346a(MmMyListFragment cVar) {
            this.f116746a = cVar;
        }

        /* renamed from: a */
        public final void mo161173a(MinutesSummaryData minutesSummaryData) {
            MmListControl d = this.f116746a.mo162938d();
            if (d != null) {
                Intrinsics.checkExpressionValueIsNotNull(minutesSummaryData, "it");
                d.mo162991c(minutesSummaryData);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "kotlin.jvm.PlatformType", "onData"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.b.c$c */
    static final class C46348c<T> implements AbstractC45860a<MinutesSummaryData> {

        /* renamed from: a */
        final /* synthetic */ MmMyListFragment f116748a;

        C46348c(MmMyListFragment cVar) {
            this.f116748a = cVar;
        }

        /* renamed from: a */
        public final void mo161173a(MinutesSummaryData minutesSummaryData) {
            MmListControl d = this.f116748a.mo162938d();
            if (d != null) {
                Intrinsics.checkExpressionValueIsNotNull(minutesSummaryData, "it");
                d.mo162996d(minutesSummaryData);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45861b.m181700a().f115692c.mo161174a((AbstractC45860a) this.f116743d);
        C45861b.m181700a().f115693d.mo161174a((AbstractC45860a) this.f116744e);
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        C47083e.m186427a("vc_minutes_list_view", C47086i.m186432a().mo165426h("my_content").mo165421c());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmMyListFragment(String str, IFragmentManager bVar) {
        super(str, MmListControl.DataSource.MyList, bVar);
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
    }
}

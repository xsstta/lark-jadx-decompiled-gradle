package com.ss.android.lark.mm.module.list.shared;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.IFragmentManager;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment;
import com.ss.android.lark.mm.module.list.base.MinutesListActivity;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MmListRankType;
import com.ss.android.lark.mm.module.list.my.MmListFilterPreference;
import com.ss.android.lark.mm.module.list.p2305c.C46374a;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001a\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mm/module/list/shared/MmSharedListFragment;", "Lcom/ss/android/lark/mm/module/list/base/MinutesBaseListFragment;", "repoId", "", "manager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/base/IFragmentManager;)V", "generatePageAliveEvent", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent;", "onDestroyView", "", "onFilterList", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setupTitleBar", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.c.b */
public final class MmSharedListFragment extends MinutesBaseListFragment {

    /* renamed from: d */
    private HashMap f116811d;

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f116811d == null) {
            this.f116811d = new HashMap();
        }
        View view = (View) this.f116811d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116811d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f116811d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mm/module/list/shared/MmSharedListFragment$onFilterList$filterDialog$1", "Lcom/ss/android/lark/mm/module/list/shared/MmSharedListFilterDialog$IMmSharedListFilterDependency;", "getCurrentSortTimeOrder", "", "getCurrentSortType", "Lcom/ss/android/lark/mm/module/list/data/MmListRankType;", "onSortConfirmCallback", "", "lastSortType", "lastSortTimeOrder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.c.b$a */
    public static final class C46377a implements C46374a.AbstractC46375a {

        /* renamed from: a */
        final /* synthetic */ MmSharedListFragment f116812a;

        @Override // com.ss.android.lark.mm.module.list.p2305c.C46374a.AbstractC46375a
        /* renamed from: b */
        public boolean mo162970b() {
            MmListFilterPreference e = this.f116812a.mo162939e();
            if (e != null) {
                return e.mo162900f();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.list.p2305c.C46374a.AbstractC46375a
        /* renamed from: a */
        public MmListRankType mo162968a() {
            MmListRankType e;
            MmListFilterPreference e2 = this.f116812a.mo162939e();
            if (e2 == null || (e = e2.mo162899e()) == null) {
                return MmListRankType.SHARE_TIME;
            }
            return e;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46377a(MmSharedListFragment bVar) {
            this.f116812a = bVar;
        }

        @Override // com.ss.android.lark.mm.module.list.p2305c.C46374a.AbstractC46375a
        /* renamed from: a */
        public void mo162969a(MmListRankType mmListRankType, boolean z) {
            String str;
            String str2;
            Intrinsics.checkParameterIsNotNull(mmListRankType, "lastSortType");
            MmListFilterPreference e = this.f116812a.mo162939e();
            if (e != null) {
                e.mo162895b(mmListRankType);
            }
            MmListFilterPreference e2 = this.f116812a.mo162939e();
            if (e2 != null) {
                e2.mo162896b(z);
            }
            this.f116812a.mo162943l();
            MmListControl d = this.f116812a.mo162938d();
            if (d != null) {
                d.mo163005g(MmListControl.DataSource.ShareList);
            }
            C47086i h = C47086i.m186432a().mo165422d("items_filter").mo165423e("vc_minutes_list_view").mo165426h("shared_with_me");
            if (mmListRankType == MmListRankType.SHARE_TIME) {
                str = "shared";
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
            this.f116812a.mo162936a(mmListRankType, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/lark/mm/module/list/shared/MmSharedListFragment$setupTitleBar$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.c.b$b */
    static final class C46378b extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmSharedListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46378b(MmSharedListFragment bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45855f.m181664c("MinutesBaseListFragment", "share list on back");
            this.this$0.mo162947p().bj_();
        }
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onDestroyView() {
        super.onDestroyView();
        MmListControl d = mo162938d();
        if (d != null) {
            d.mo162999e(MmListControl.DataSource.ShareList);
        }
        mo161170c();
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
            MinutesListActivity.m183514a(minutesListActivity, R.string.MMWeb_G_SharedContent, new C46378b(this), 0, null, 12, null);
        }
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment
    /* renamed from: i */
    public void mo162880i() {
        FragmentManager supportFragmentManager;
        C47083e.m186427a("vc_minutes_list_click", C47086i.m186432a().mo165422d("items_filter_button").mo165423e("vc_minutes_list_view").mo165426h("shared_with_me").mo165421c());
        C46374a aVar = new C46374a(new C46377a(this));
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it");
            aVar.mo5511a(supportFragmentManager, "");
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
        sb.append("/minutes/shared");
        String sb2 = sb.toString();
        MmTimedHitPointEvent mmTimedHitPointEvent = new MmTimedHitPointEvent(mo161169b(), "predefine_page_alive", "duration", null, 8, null);
        mmTimedHitPointEvent.mo165401a("shared_with_me").mo165431m(sb2);
        return mmTimedHitPointEvent;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmSharedListFragment(String str, IFragmentManager bVar) {
        super(str, MmListControl.DataSource.ShareList, bVar);
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        C47083e.m186427a("vc_minutes_list_view", C47086i.m186432a().mo165426h("shared_with_me").mo165421c());
    }
}

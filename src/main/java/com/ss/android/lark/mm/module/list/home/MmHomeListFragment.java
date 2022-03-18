package com.ss.android.lark.mm.module.list.home;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
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
import com.ss.android.lark.mm.module.list.data.MmOwnerType;
import com.ss.android.lark.mm.module.list.my.MmListFilterPreference;
import com.ss.android.lark.mm.module.share.fragment.FragmentType;
import com.ss.android.lark.mm.p2288b.C45851c;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MmTimedHitPointEvent;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u001a\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016R\u000e\u0010\u0007\u001a\u00020\u0003XD¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mm/module/list/home/MmHomeListFragment;", "Lcom/ss/android/lark/mm/module/list/base/MinutesBaseListFragment;", "repoId", "", "fragmentManager", "Lcom/ss/android/lark/mm/base/IFragmentManager;", "(Ljava/lang/String;Lcom/ss/android/lark/mm/base/IFragmentManager;)V", "guideKey", "listRefreshCallback", "Lcom/ss/android/lark/mm/base/repo/IMmDataCallback;", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "renameCallback", "generatePageAliveEvent", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmTimedHitPointEvent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFilterList", "onViewCreated", "view", "Landroid/view/View;", "setupTitleBar", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.a.c */
public final class MmHomeListFragment extends MinutesBaseListFragment {

    /* renamed from: d */
    private final AbstractC45860a<MinutesSummaryData> f116716d = new C46333a(this);

    /* renamed from: e */
    private final AbstractC45860a<MinutesSummaryData> f116717e = new C46337e(this);

    /* renamed from: f */
    private final String f116718f = "vc_minutes_trash_box";

    /* renamed from: g */
    private HashMap f116719g;

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f116719g == null) {
            this.f116719g = new HashMap();
        }
        View view = (View) this.f116719g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116719g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f116719g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.c$f */
    static final class C46338f extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmHomeListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46338f(MmHomeListFragment cVar) {
            super(0);
            this.this$0 = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            C45855f.m181664c("MinutesBaseListFragment", "home list on back");
            this.this$0.mo162947p().bj_();
        }
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onDestroyView() {
        super.onDestroyView();
        C45861b.m181700a().f115692c.mo161178b(this.f116716d);
        C45861b.m181700a().f115693d.mo161178b(this.f116717e);
        MmListFilterPreference e = mo162939e();
        if (e != null) {
            e.mo162892a((MmOwnerType) null);
        }
        MmListControl d = mo162938d();
        if (d != null) {
            d.mo162999e(MmListControl.DataSource.HomeList);
        }
        mo161170c();
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment
    /* renamed from: i */
    public void mo162880i() {
        MmOwnerType mmOwnerType;
        FragmentManager supportFragmentManager;
        C47083e.m186427a("vc_minutes_list_click", C47086i.m186432a().mo165422d("items_filter_button").mo165423e("vc_minutes_list_view").mo165426h("home_page").mo165421c());
        MmListFilterPreference e = mo162939e();
        if (e == null || (mmOwnerType = e.mo162890a()) == null) {
            mmOwnerType = MmOwnerType.OWNED_BY_ANYONE;
        }
        MmHomeFilterDialog aVar = new MmHomeFilterDialog(mmOwnerType);
        aVar.mo162872a(new C46334b(this));
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it");
            aVar.mo5511a(supportFragmentManager, "");
        }
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment
    /* renamed from: j */
    public void mo162881j() {
        FragmentActivity activity = getActivity();
        MinutesListActivity minutesListActivity = null;
        if (!(activity instanceof MinutesListActivity)) {
            activity = null;
        }
        MinutesListActivity minutesListActivity2 = (MinutesListActivity) activity;
        if (minutesListActivity2 != null) {
            minutesListActivity2.mo162913a(R.string.MMWeb_G_MinutesNameShort, new C46338f(this), R.drawable.ud_icon_more_outlined, new C46339g(this));
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 instanceof MinutesListActivity) {
            minutesListActivity = activity2;
        }
        MinutesListActivity minutesListActivity3 = minutesListActivity;
        if (minutesListActivity3 != null) {
            minutesListActivity3.mo162915a(this.f116718f, ResString.f118656a.mo165504a(R.string.MMWeb_M_ViewTrashHere_Onboard_Tooltip));
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
        sb.append("/minutes/home");
        String sb2 = sb.toString();
        MmTimedHitPointEvent mmTimedHitPointEvent = new MmTimedHitPointEvent(mo161169b(), "predefine_page_alive", "duration", null, 8, null);
        mmTimedHitPointEvent.mo165401a("home_page").mo165431m(sb2);
        return mmTimedHitPointEvent;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MmOwnerType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.c$b */
    static final class C46334b extends Lambda implements Function1<MmOwnerType, Unit> {
        final /* synthetic */ MmHomeListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46334b(MmHomeListFragment cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MmOwnerType mmOwnerType) {
            invoke(mmOwnerType);
            return Unit.INSTANCE;
        }

        public final void invoke(MmOwnerType mmOwnerType) {
            boolean z;
            String str;
            Intrinsics.checkParameterIsNotNull(mmOwnerType, "it");
            MmListFilterPreference e = this.this$0.mo162939e();
            if (e != null) {
                e.mo162892a(mmOwnerType);
            }
            this.this$0.mo162943l();
            MmListControl d = this.this$0.mo162938d();
            if (d != null) {
                d.mo163005g(MmListControl.DataSource.HomeList);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.mo161166a(R.id.filterIcon);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "filterIcon");
            if (mmOwnerType != MmOwnerType.OWNED_BY_ANYONE) {
                z = true;
            } else {
                z = false;
            }
            appCompatImageView.setSelected(z);
            C47086i h = C47086i.m186432a().mo165422d("items_filter").mo165423e("vc_minutes_list_view").mo165426h("home_page");
            int i = C46341d.f116722a[mmOwnerType.ordinal()];
            if (i == 1) {
                str = "owned_by_anyone";
            } else if (i == 2) {
                str = "owned_by_me";
            } else if (i == 3) {
                str = "shared_with_me";
            } else {
                throw new NoWhenBranchMatchedException();
            }
            C47083e.m186427a("vc_minutes_list_click", h.mo165413a("filter_type", str).mo165421c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.c$c */
    static final class C46335c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmHomeListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46335c(MmHomeListFragment cVar) {
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
            C47083e.m186427a("vc_minutes_list_click", C47086i.m186432a().mo165422d("my_content").mo165423e("vc_minutes_list_view").mo165421c());
            if (!(this.this$0.getActivity() instanceof MinutesListActivity)) {
                MinutesListActivity.Companion aVar = MinutesListActivity.f116750b;
                Context a = C45851c.m181646a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
                aVar.mo162920a(a, "", 19, "my");
            } else {
                this.this$0.mo162947p().mo161184a(FragmentType.MyList);
            }
            this.this$0.mo162940f().mo165405b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.c$d */
    static final class C46336d extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmHomeListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46336d(MmHomeListFragment cVar) {
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
            C47083e.m186427a("vc_minutes_list_click", C47086i.m186432a().mo165422d("shared_with_me").mo165423e("vc_minutes_list_view").mo165421c());
            if (!(this.this$0.getActivity() instanceof MinutesListActivity)) {
                MinutesListActivity.Companion aVar = MinutesListActivity.f116750b;
                Context a = C45851c.m181646a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
                aVar.mo162920a(a, "", 19, "share");
            } else {
                this.this$0.mo162947p().mo161184a(FragmentType.SharedList);
            }
            this.this$0.mo162940f().mo165405b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.c$g */
    public static final class C46339g extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmHomeListFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46339g(MmHomeListFragment cVar) {
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
            MmListMoreMenu.m183478a(view, new Function0<Unit>(this) {
                /* class com.ss.android.lark.mm.module.list.home.MmHomeListFragment.C46339g.C463401 */
                final /* synthetic */ C46339g this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    if (!(this.this$0.this$0.getActivity() instanceof MinutesListActivity)) {
                        MinutesListActivity.Companion aVar = MinutesListActivity.f116750b;
                        Context a = C45851c.m181646a();
                        Intrinsics.checkExpressionValueIsNotNull(a, "MmContext.getContext()");
                        aVar.mo162920a(a, "", 19, "trash");
                    } else {
                        this.this$0.this$0.mo162947p().mo161184a(FragmentType.TrashList);
                    }
                    this.this$0.this$0.mo162940f().mo165405b();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "kotlin.jvm.PlatformType", "onData"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.c$a */
    static final class C46333a<T> implements AbstractC45860a<MinutesSummaryData> {

        /* renamed from: a */
        final /* synthetic */ MmHomeListFragment f116720a;

        C46333a(MmHomeListFragment cVar) {
            this.f116720a = cVar;
        }

        /* renamed from: a */
        public final void mo161173a(MinutesSummaryData minutesSummaryData) {
            MmListControl d = this.f116720a.mo162938d();
            if (d != null) {
                Intrinsics.checkExpressionValueIsNotNull(minutesSummaryData, "it");
                d.mo162982a(minutesSummaryData);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/list/data/MinutesSummaryData;", "kotlin.jvm.PlatformType", "onData"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.list.a.c$e */
    static final class C46337e<T> implements AbstractC45860a<MinutesSummaryData> {

        /* renamed from: a */
        final /* synthetic */ MmHomeListFragment f116721a;

        C46337e(MmHomeListFragment cVar) {
            this.f116721a = cVar;
        }

        /* renamed from: a */
        public final void mo161173a(MinutesSummaryData minutesSummaryData) {
            MmListControl d = this.f116721a.mo162938d();
            if (d != null) {
                Intrinsics.checkExpressionValueIsNotNull(minutesSummaryData, "it");
                d.mo162988b(minutesSummaryData);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45861b.m181700a().f115692c.mo161174a((AbstractC45860a) this.f116716d);
        C45861b.m181700a().f115693d.mo161174a((AbstractC45860a) this.f116717e);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmHomeListFragment(String str, IFragmentManager bVar) {
        super(str, MmListControl.DataSource.HomeList, bVar);
        Intrinsics.checkParameterIsNotNull(str, "repoId");
        Intrinsics.checkParameterIsNotNull(bVar, "fragmentManager");
    }

    @Override // com.ss.android.lark.mm.module.list.base.MinutesBaseListFragment, androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        C47083e.m186427a("vc_minutes_list_view", C47086i.m186432a().mo165426h("home_page").mo165421c());
        LinearLayout linearLayout = (LinearLayout) mo161166a(R.id.myListTvLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "myListTvLayout");
        C47110e.m186573a(linearLayout, new C46335c(this));
        LinearLayout linearLayout2 = (LinearLayout) mo161166a(R.id.sharedListTvLayout);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "sharedListTvLayout");
        C47110e.m186573a(linearLayout2, new C46336d(this));
    }
}

package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IAttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.utils.StatusBarUtil;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001=B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$J\b\u0010(\u001a\u00020\u001bH\u0016J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u00102\u001a\u00020\u001bH\u0016J\u001a\u00103\u001a\u00020\"2\u0006\u00104\u001a\u00020*2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0014\u00105\u001a\u00020\"2\f\u00106\u001a\b\u0012\u0004\u0012\u00020807J\u000e\u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;J\u0010\u0010<\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0002¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\b\u001e\u0010\u001f¨\u0006>"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "attendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "fragmentAction", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment$OnAttendeeFragmentAction;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment$OnAttendeeFragmentAction;)V", "detailAttendeeView", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeView;", "detailAttendeeViewModel", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeViewModel;", "getDetailAttendeeViewModel", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeViewModel;", "detailAttendeeViewModel$delegate", "Lkotlin/Lazy;", "mAttendeeFragmentData", "getMAttendeeFragmentData", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "setMAttendeeFragmentData", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;)V", "mFragmentAction", "getMFragmentAction", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment$OnAttendeeFragmentAction;", "setMFragmentAction", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment$OnAttendeeFragmentAction;)V", "mIsFromLocalRecover", "", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "getViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider;", "viewModelProvider$delegate", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "hideFragment", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onHiddenChanged", "hidden", "onViewCreated", "view", "refreshAttendeeListView", "attendeeData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "showAttendeeNumbers", "attendeeNumbers", "", "showFragment", "OnAttendeeFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a */
public final class AttendeeFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public IAttendeeFragmentData f79243a;

    /* renamed from: b */
    public OnAttendeeFragmentAction f79244b;

    /* renamed from: e */
    private DetailAttendeeView f79245e;

    /* renamed from: f */
    private boolean f79246f;

    /* renamed from: g */
    private final Lazy f79247g = LazyKt.lazy(new C31301c(this));

    /* renamed from: h */
    private final Lazy f79248h = LazyKt.lazy(new C31300b(this));

    /* renamed from: i */
    private HashMap f79249i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment$OnAttendeeFragmentAction;", "", "onFragmentBackPressed", "", "onOpenProfilePageClicked", "attendeeCalendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a$a */
    public interface OnAttendeeFragmentAction {
        /* renamed from: a */
        void mo113727a();

        /* renamed from: a */
        void mo113728a(String str);
    }

    /* renamed from: f */
    private final DetailAttendeeViewModel m117632f() {
        return (DetailAttendeeViewModel) this.f79248h.getValue();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f79249i == null) {
            this.f79249i = new HashMap();
        }
        View view = (View) this.f79249i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f79249i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f79249i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: d */
    public final C1144ai mo113726d() {
        return (C1144ai) this.f79247g.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a$b */
    static final class C31300b extends Lambda implements Function0<DetailAttendeeViewModel> {
        final /* synthetic */ AttendeeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31300b(AttendeeFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DetailAttendeeViewModel invoke() {
            return (DetailAttendeeViewModel) this.this$0.mo113726d().mo6005a(DetailAttendeeViewModel.class);
        }
    }

    /* renamed from: b */
    public final IAttendeeFragmentData mo113723b() {
        IAttendeeFragmentData aVar = this.f79243a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
        }
        return aVar;
    }

    /* renamed from: c */
    public final OnAttendeeFragmentAction mo113725c() {
        OnAttendeeFragmentAction aVar = this.f79244b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentAction");
        }
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.a$c */
    static final class C31301c extends Lambda implements Function0<C1144ai> {
        final /* synthetic */ AttendeeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31301c(AttendeeFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1144ai invoke() {
            return new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.AttendeeFragment.C31301c.C313021 */

                /* renamed from: a */
                final /* synthetic */ C31301c f79250a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f79250a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    return new DetailAttendeeViewModel(this.f79250a.this$0.mo113723b());
                }
            });
        }
    }

    public AttendeeFragment() {
        AppreciableHitPoint.f83321a.mo118674D();
        this.f79246f = true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        DetailAttendeeView bVar;
        FrameLayout frameLayout = (FrameLayout) mo109250a(R.id.groupMemberFrameLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "groupMemberFrameLayout");
        if (frameLayout.getVisibility() == 0 && (bVar = this.f79245e) != null && bVar.mo113750b()) {
            DetailAttendeeView bVar2 = this.f79245e;
            if (bVar2 != null) {
                bVar2.mo113753e();
            }
            return true;
        }
        OnAttendeeFragmentAction aVar = this.f79244b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentAction");
        }
        aVar.mo113727a();
        return false;
    }

    /* renamed from: a */
    public final void mo113721a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "attendeeNumbers");
        DetailAttendeeView bVar = this.f79245e;
        if (bVar != null) {
            bVar.mo113749a(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            AppreciableHitPoint.f83321a.mo118674D();
        }
    }

    /* renamed from: a */
    public final void mo113722a(ArrayList<IBodyData.IAttendeeDetailData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendeeData");
        m117632f().refreshData(arrayList);
    }

    /* renamed from: b */
    public final void mo113724b(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo113719a(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    public AttendeeFragment(IAttendeeFragmentData aVar, OnAttendeeFragmentAction aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "attendeeFragmentData");
        Intrinsics.checkParameterIsNotNull(aVar2, "fragmentAction");
        AppreciableHitPoint.f83321a.mo118674D();
        this.f79246f = false;
        this.f79243a = aVar;
        this.f79244b = aVar2;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f79246f) {
            FrameLayout frameLayout = (FrameLayout) mo109250a(R.id.activityRoot);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "activityRoot");
            DetailAttendeeView bVar = new DetailAttendeeView(frameLayout, this, mo113726d());
            bVar.mo113751c();
            this.f79245e = bVar;
            m117632f().create();
            View a = mo109250a(R.id.virtualStatusBar);
            Intrinsics.checkExpressionValueIsNotNull(a, "virtualStatusBar");
            a.getLayoutParams().height = StatusBarUtil.getStatusBarHeight(getContext());
        }
    }

    /* renamed from: a */
    public final void mo113720a(Fragment fragment, int i) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_detail_attendees, viewGroup, false);
    }
}

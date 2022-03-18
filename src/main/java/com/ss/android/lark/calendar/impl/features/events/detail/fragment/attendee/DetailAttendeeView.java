package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.helper.AttendeeHelper;
import com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupAttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.helper.GroupFragmentHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter.DetailAttendeeAdapter;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter.IDetailAttendeeVH;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.AttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.IAttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.helper.DetailAttendeeHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001 \u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u00020\u001dH\u0002J\r\u0010\u001f\u001a\u00020 H\u0002¢\u0006\u0002\u0010!J\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0#J\u0006\u0010'\u001a\u00020\u001dJ\b\u0010(\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001dH\u0002J\b\u0010*\u001a\u00020\u001dH\u0002J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\u001dH\u0002J\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u000201J\u0010\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020$H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00064"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeView;", "", "rootView", "Landroid/view/View;", "fragment", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment;", "viewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "(Landroid/view/View;Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment;Landroidx/lifecycle/ViewModelProvider;)V", "getFragment", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/AttendeeFragment;", "isGroupFragmentShow", "", "()Z", "setGroupFragmentShow", "(Z)V", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/DetailAttendeeAdapter;", "mGroupFragment", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment;", "getRootView", "()Landroid/view/View;", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeViewModel;", "getViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider;", "create", "", "endMemberLoaderMore", "getGroupAttendeeFragmentAction", "com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeView$getGroupAttendeeFragmentAction$1", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeView$getGroupAttendeeFragmentAction$1;", "getIAttendeeData", "", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "attendees", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "hideGroupAttendeeFragment", "initAttendeeRecycleView", "initLivaData", "initMemberLoadPtrView", "initTitleView", "initView", "loadMoreThreshold", "", "showAttendeeNumbers", "attendeeNumbers", "", "showGroupFragment", "attendee", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b */
public final class DetailAttendeeView {

    /* renamed from: a */
    public DetailAttendeeAdapter f79267a;

    /* renamed from: b */
    private GroupAttendeeFragment f79268b;

    /* renamed from: c */
    private boolean f79269c;

    /* renamed from: d */
    private final View f79270d;

    /* renamed from: e */
    private final AttendeeFragment f79271e;

    /* renamed from: f */
    private final C1144ai f79272f;

    /* renamed from: b */
    public final boolean mo113750b() {
        return this.f79269c;
    }

    /* renamed from: g */
    public final View mo113755g() {
        return this.f79270d;
    }

    /* renamed from: h */
    public final AttendeeFragment mo113756h() {
        return this.f79271e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeView$getGroupAttendeeFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$GroupAttendeeFragmentAction;", "getAttendeeData", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;", "attendees", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "isShowTopMargin", "", "onFragmentBackPressed", "", "onOpenProfilePageClicked", "attendeeCalendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b$a */
    public static final class C31309a implements GroupAttendeeFragment.GroupAttendeeFragmentAction {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeView f79273a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment.GroupAttendeeFragmentAction
        /* renamed from: b */
        public boolean mo113159b() {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment.GroupAttendeeFragmentAction
        /* renamed from: a */
        public void mo113157a() {
            this.f79273a.mo113753e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31309a(DetailAttendeeView bVar) {
            this.f79273a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment.GroupAttendeeFragmentAction
        /* renamed from: a */
        public void mo113158a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "attendeeCalendarId");
            this.f79273a.mo113756h().mo113725c().mo113728a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment.GroupAttendeeFragmentAction
        /* renamed from: a */
        public List<IAttendeeMemberData> mo113156a(List<CalendarEventAttendee> list) {
            Intrinsics.checkParameterIsNotNull(list, "attendees");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = this.f79273a.mo113747a(list).iterator();
            while (it.hasNext()) {
                arrayList.add(GroupFragmentHelper.f78884a.mo113141a(it.next()));
            }
            return arrayList;
        }
    }

    /* renamed from: l */
    private final C31309a m117677l() {
        return new C31309a(this);
    }

    /* renamed from: c */
    public final void mo113751c() {
        m117675j();
        m117674i();
    }

    /* renamed from: j */
    private final void m117675j() {
        m117676k();
        m117678m();
        m117679n();
    }

    /* renamed from: a */
    public final DetailAttendeeViewModel mo113746a() {
        AbstractC1142af a = this.f79272f.mo6005a(DetailAttendeeViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "viewModelProvider.get(De…deeViewModel::class.java)");
        return (DetailAttendeeViewModel) a;
    }

    /* renamed from: d */
    public final void mo113752d() {
        ((LKUIPtrClassicFrameLayout) this.f79270d.findViewById(R.id.attendeePtrLayout)).refreshComplete();
    }

    /* renamed from: e */
    public final void mo113753e() {
        this.f79271e.mo113724b(this.f79268b);
        this.f79269c = false;
    }

    /* renamed from: f */
    public final int mo113754f() {
        DetailAttendeeAdapter dVar = this.f79267a;
        if (dVar != null) {
            return dVar.getItemCount() - 5;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: k */
    private final void m117676k() {
        ((CommonTitleBar) this.f79270d.findViewById(R.id.attendeeTitleBar)).setLeftClickListener(new C31317i(this));
    }

    /* renamed from: m */
    private final void m117678m() {
        this.f79267a = new DetailAttendeeAdapter(new C31310b(this));
        RecyclerView recyclerView = (RecyclerView) this.f79270d.findViewById(R.id.attendeeRecycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setFocusableInTouchMode(false);
        recyclerView.setAdapter(this.f79267a);
    }

    /* renamed from: i */
    private final void m117674i() {
        mo113746a().getMAttendeeLiveData().mo5923a(this.f79271e, new C31311c(this));
        mo113746a().getLoadIndividualErrShow().mo5923a(this.f79271e, new C31312d(this));
        mo113746a().getEndAttendeeLoadMoreLiveData().mo5923a(this.f79271e, new C31313e(this));
        mo113746a().getShowNotInGroupTipDialogLiveData().mo5923a(this.f79271e, new C31314f(this));
    }

    /* renamed from: n */
    private final void m117679n() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f79270d.getContext());
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) this.f79270d.findViewById(R.id.attendeePtrLayout);
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        lKUIPtrClassicFrameLayout.setFooterView(chatWindowPtrLoadingHeader);
        lKUIPtrClassicFrameLayout.addPtrUIHandler(chatWindowPtrLoadingHeader);
        lKUIPtrClassicFrameLayout.setForceBackWhenComplete(true);
        lKUIPtrClassicFrameLayout.disableWhenHorizontalMove(true);
        ((LKUIPtrClassicFrameLayout) this.f79270d.findViewById(R.id.attendeePtrLayout)).setPtrHandler(new C31315g(this));
        ((RecyclerView) this.f79270d.findViewById(R.id.attendeeRecycleView)).addOnScrollListener(new C31316h(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeView$initAttendeeRecycleView$1", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/adapter/IDetailAttendeeVH;", "onAttendeeItemClicked", "", "attendee", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "onGroupItemClicked", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/AttendeeViewData;", "onOpenProfilePageClicked", "attendeeCalendarId", "", "onShowGroupMemberFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b$b */
    public static final class C31310b implements IDetailAttendeeVH {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeView f79274a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31310b(DetailAttendeeView bVar) {
            this.f79274a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter.IDetailAttendeeVH
        /* renamed from: a */
        public void mo113742a(AttendeeViewData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "attendee");
            this.f79274a.mo113746a().onGroupItemClicked(bVar);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter.IDetailAttendeeVH
        /* renamed from: a */
        public void mo113744a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "attendeeCalendarId");
            this.f79274a.mo113756h().mo113725c().mo113728a(str);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter.IDetailAttendeeVH
        /* renamed from: b */
        public void mo113745b(IBodyData.IAttendeeDetailData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "attendee");
            this.f79274a.mo113756h().mo113725c().mo113728a(bVar.mo113378d());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.adapter.IDetailAttendeeVH
        /* renamed from: a */
        public void mo113743a(IBodyData.IAttendeeDetailData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "attendee");
            FrameLayout frameLayout = (FrameLayout) this.f79274a.mo113755g().findViewById(R.id.groupMemberFrameLayout);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "rootView.groupMemberFrameLayout");
            frameLayout.setVisibility(0);
            this.f79274a.mo113748a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b$e */
    public static final class C31313e<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeView f79277a;

        C31313e(DetailAttendeeView bVar) {
            this.f79277a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            this.f79277a.mo113752d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeView$initMemberLoadPtrView$2", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b$g */
    public static final class C31315g extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeView f79279a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "header");
            return false;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31315g(DetailAttendeeView bVar) {
            this.f79279a = bVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f79279a.mo113746a().loadIndividualAttendee();
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f79279a.mo113746a().checkCanDoLoadMore()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeView$initMemberLoadPtrView$3", "Lcom/ss/android/lark/widget/recyclerview/RecyclerViewScrollDetector;", "onScrollPassed", "", "scrolledStartIndex", "", "scrolledEndIndex", "onScrollStop", "startIndex", "endIndex", "onScrollToBottom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b$h */
    public static final class C31316h extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeView f79280a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31316h(DetailAttendeeView bVar) {
            this.f79280a = bVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
            if (i2 >= this.f79280a.mo113754f() && this.f79280a.mo113746a().checkCanDoLoadMore()) {
                this.f79280a.mo113746a().loadIndividualAttendee();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeView$initTitleView$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b$i */
    public static final class C31317i extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeView f79281a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31317i(DetailAttendeeView bVar) {
            this.f79281a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f79281a.mo113756h().mo113714e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/IAttendeeViewData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b$c */
    public static final class C31311c<T> implements AbstractC1178x<ArrayList<IAttendeeViewData>> {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeView f79275a;

        C31311c(DetailAttendeeView bVar) {
            this.f79275a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(ArrayList<IAttendeeViewData> arrayList) {
            DetailAttendeeAdapter dVar = this.f79275a.f79267a;
            if (dVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(arrayList, "it");
                dVar.mo113737a(arrayList);
            }
            this.f79275a.mo113752d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b$d */
    public static final class C31312d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeView f79276a;

        C31312d(DetailAttendeeView bVar) {
            this.f79276a = bVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            LKUIToast.show(this.f79276a.mo113755g().getContext(), (int) R.string.Calendar_Edit_LoadFailed);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.b$f */
    public static final class C31314f<T> implements AbstractC1178x<Object> {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeView f79278a;

        C31314f(DetailAttendeeView bVar) {
            this.f79278a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1178x
        public final void onChanged(Object obj) {
            AttendeeHelper aVar = AttendeeHelper.f78609a;
            Context context = this.f79278a.mo113755g().getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "rootView.context");
            aVar.mo112726a(context);
        }
    }

    /* renamed from: a */
    public final void mo113749a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "attendeeNumbers");
        TextView textView = (TextView) this.f79270d.findViewById(R.id.attendeeNumbersTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.attendeeNumbersTV");
        textView.setText(str);
    }

    /* renamed from: a */
    public final void mo113748a(IBodyData.IAttendeeDetailData bVar) {
        GroupAttendeeFragmentData groupFragmentData = mo113746a().getGroupFragmentData(bVar.mo113391q());
        if (groupFragmentData != null) {
            GroupAttendeeFragment bVar2 = this.f79268b;
            if (bVar2 != null) {
                bVar2.mo113149a(groupFragmentData);
                this.f79271e.mo113719a(this.f79268b);
            } else {
                GroupAttendeeFragment bVar3 = new GroupAttendeeFragment(groupFragmentData, m117677l());
                this.f79268b = bVar3;
                this.f79271e.mo113720a(bVar3, R.id.groupMemberFrameLayout);
            }
            this.f79269c = true;
        }
    }

    /* renamed from: a */
    public final List<IBodyData.IAttendeeDetailData> mo113747a(List<CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(list, "attendees");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(DetailAttendeeHelper.f79071a.mo113374a(it.next(), this.f79271e.mo113723b().mo113614a(), this.f79271e.mo113723b().mo113615b(), this.f79271e.mo113723b().mo113616c()));
        }
        return arrayList;
    }

    public DetailAttendeeView(View view, AttendeeFragment aVar, C1144ai aiVar) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aVar, "fragment");
        Intrinsics.checkParameterIsNotNull(aiVar, "viewModelProvider");
        this.f79270d = view;
        this.f79271e = aVar;
        this.f79272f = aiVar;
    }
}

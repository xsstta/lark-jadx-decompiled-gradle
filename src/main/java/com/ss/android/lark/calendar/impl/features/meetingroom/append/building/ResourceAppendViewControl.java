package com.ss.android.lark.calendar.impl.features.meetingroom.append.building;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.meetingroom.IBuildingContract;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.ResourceAppendFragment;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceDisplayAdapter;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.BuildingViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.ChosenMeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BaseModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.BuildingModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.LoadMoreModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.model.MeetingRoomModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.BuildingResourceViewData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceDisplayStatus;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendBuildingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.BuildingAppendSearchView;
import com.ss.android.lark.calendar.impl.p1436a.C30067a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.an;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/ResourceAppendViewControl;", "", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;", "resourceAppendViewModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingViewModel;", "resourceAppendFragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "(Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingViewModel;Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;)V", "getBinding", "()Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;", "mMultiSelectLoading", "Lcom/ss/android/lark/calendar/impl/features/calendarview/widget/RequestLoadingDialog;", "getResourceAppendFragment", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "getResourceAppendViewModel", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingViewModel;", "setResourceAppendViewModel", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/AppendBuildingViewModel;)V", "hideChangeToMultipleLoading", "", "initAppendLiveData", "initBuildingViewPager", "initSearchAppendView", "refreshBuildingResource", "selectModel", "", "buildingResourceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/BuildingResourceViewData;", "refreshMultiSelectAllContainer", "refreshSearchView", "searchDisplayData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus$SearchResultDisplayStatus;", "showChangeToMultipleLoading", "showChangeToMultipleLoadingErr", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d */
public final class ResourceAppendViewControl {

    /* renamed from: a */
    public static final Companion f81752a = new Companion(null);

    /* renamed from: b */
    private RequestLoadingDialog f81753b;

    /* renamed from: c */
    private final C30067a f81754c;

    /* renamed from: d */
    private AppendBuildingViewModel f81755d;

    /* renamed from: e */
    private final ResourceAppendFragment f81756e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/building/ResourceAppendViewControl$Companion;", "", "()V", "PAGE_ALL", "", "PAGE_VALID", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final C30067a mo116696d() {
        return this.f81754c;
    }

    /* renamed from: e */
    public final AppendBuildingViewModel mo116697e() {
        return this.f81755d;
    }

    /* renamed from: f */
    public final ResourceAppendFragment mo116698f() {
        return this.f81756e;
    }

    /* renamed from: b */
    public final void mo116694b() {
        RequestLoadingDialog requestLoadingDialog = this.f81753b;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.dismiss();
        }
    }

    /* renamed from: c */
    public final void mo116695c() {
        RequestLoadingDialog requestLoadingDialog = this.f81753b;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112592c(R.string.Calendar_Common_FailedToLoad);
        }
    }

    /* renamed from: h */
    private final void m121690h() {
        this.f81754c.f74925q.mo116974a(new C31988i(this), new C31987h(this));
    }

    /* renamed from: g */
    private final void m121689g() {
        this.f81755d.getResourceDisplayStatus().mo5923a(this.f81756e.getViewLifecycleOwner(), new C31981b(this));
        this.f81755d.getChangeMultiLoadingLiveData().mo5923a(this.f81756e, new C31982c(this));
        this.f81755d.getToastLiveData().mo5923a(this.f81756e, new C31983d(this));
    }

    /* renamed from: i */
    private final void m121691i() {
        this.f81754c.f74909a.mo116961a(this.f81755d.isShowChosenAttendee());
        this.f81754c.f74909a.mo116959a(new C31984e(this), new C31986g(this), new C31985f(this));
    }

    /* renamed from: a */
    public final void mo116691a() {
        RequestLoadingDialog requestLoadingDialog = this.f81753b;
        if (requestLoadingDialog != null) {
            requestLoadingDialog.mo112585a(R.string.Calendar_Edit_MoreMeetingRooms);
            return;
        }
        FragmentActivity activity = this.f81756e.getActivity();
        if (activity != null) {
            RequestLoadingDialog requestLoadingDialog2 = new RequestLoadingDialog(activity);
            requestLoadingDialog2.mo112585a(R.string.Calendar_Edit_MoreMeetingRooms);
            this.f81753b = requestLoadingDialog2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/building/ResourceAppendViewControl$initBuildingViewPager$buildingAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/BuildingViewHolder$IActionListener;", "onItemClick", "", "buildingModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BuildingModel;", "isValidPage", "", "onMultiSelectExpandIconClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$e */
    public static final class C31984e implements BuildingViewHolder.IActionListener {

        /* renamed from: a */
        final /* synthetic */ ResourceAppendViewControl f81760a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31984e(ResourceAppendViewControl dVar) {
            this.f81760a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.BuildingViewHolder.IActionListener
        /* renamed from: a */
        public void mo116702a(BuildingModel aVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(aVar, "buildingModel");
            this.f81760a.mo116697e().onCalendarBuildingClicked(aVar);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.BuildingViewHolder.IActionListener
        /* renamed from: b */
        public void mo116703b(BuildingModel aVar, boolean z) {
            Intrinsics.checkParameterIsNotNull(aVar, "buildingModel");
            this.f81760a.mo116697e().onMultipleSelectExpandIconClicked(aVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/building/ResourceAppendViewControl$initBuildingViewPager$deleteResourceAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/ChosenMeetingRoomViewHolder$IChosenResourceAction;", "onDeleteIconClicked", "", "deleteResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$f */
    public static final class C31985f implements ChosenMeetingRoomViewHolder.IChosenResourceAction {

        /* renamed from: a */
        final /* synthetic */ ResourceAppendViewControl f81761a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31985f(ResourceAppendViewControl dVar) {
            this.f81761a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.ChosenMeetingRoomViewHolder.IChosenResourceAction
        /* renamed from: a */
        public void mo116704a(CalendarEventAttendee calendarEventAttendee) {
            Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "deleteResource");
            this.f81761a.mo116697e().onDeleteChosenResource(calendarEventAttendee);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/building/ResourceAppendViewControl$initBuildingViewPager$meetingRoomAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "onClickInfoIcon", "", "resourceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "onSelectMeetingRoom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$g */
    public static final class C31986g implements MeetingRoomViewHolder.IActionListener {

        /* renamed from: a */
        final /* synthetic */ ResourceAppendViewControl f81762a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31986g(ResourceAppendViewControl dVar) {
            this.f81762a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder.IActionListener
        /* renamed from: a */
        public void mo116705a(MeetingRoomModel meetingRoomModel) {
            Intrinsics.checkParameterIsNotNull(meetingRoomModel, "resourceData");
            this.f81762a.mo116697e().onMeetingRoomClicked(meetingRoomModel);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder.IActionListener
        /* renamed from: b */
        public void mo116706b(MeetingRoomModel meetingRoomModel) {
            Intrinsics.checkParameterIsNotNull(meetingRoomModel, "resourceData");
            ResourceAppendFragment f = this.f81762a.mo116698f();
            String str = meetingRoomModel.mo116770g().mo116888b().calendar_id;
            if (str == null) {
                str = "";
            }
            f.mo116911a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/building/ResourceAppendViewControl$initSearchAppendView$baseActionListener$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/ResourceDisplayAdapter$IBaseActionListener;", "onItemClicked", "", "model", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/BaseModel;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$h */
    public static final class C31987h implements ResourceDisplayAdapter.IBaseActionListener {

        /* renamed from: a */
        final /* synthetic */ ResourceAppendViewControl f81763a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31987h(ResourceAppendViewControl dVar) {
            this.f81763a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.ResourceDisplayAdapter.IBaseActionListener
        /* renamed from: a */
        public void mo116707a(BaseModel baseModel) {
            Intrinsics.checkParameterIsNotNull(baseModel, "model");
            if (baseModel instanceof LoadMoreModel) {
                this.f81763a.mo116697e().onSearchLoadMoreClicked();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/building/ResourceAppendViewControl$initSearchAppendView$meetingRoomAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/holder/MeetingRoomViewHolder$IActionListener;", "onClickInfoIcon", "", "resourceData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/adapter/model/MeetingRoomModel;", "onSelectMeetingRoom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$i */
    public static final class C31988i implements MeetingRoomViewHolder.IActionListener {

        /* renamed from: a */
        final /* synthetic */ ResourceAppendViewControl f81764a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31988i(ResourceAppendViewControl dVar) {
            this.f81764a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder.IActionListener
        /* renamed from: a */
        public void mo116705a(MeetingRoomModel meetingRoomModel) {
            Intrinsics.checkParameterIsNotNull(meetingRoomModel, "resourceData");
            this.f81764a.mo116697e().onMeetingRoomClicked(meetingRoomModel);
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.append.adapter.holder.MeetingRoomViewHolder.IActionListener
        /* renamed from: b */
        public void mo116706b(MeetingRoomModel meetingRoomModel) {
            Intrinsics.checkParameterIsNotNull(meetingRoomModel, "resourceData");
            ResourceAppendFragment f = this.f81764a.mo116698f();
            String str = meetingRoomModel.mo116770g().mo116888b().calendar_id;
            if (str == null) {
                str = "";
            }
            f.mo116911a(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$j */
    public static final class View$OnClickListenerC31989j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ResourceAppendViewControl f81765a;

        /* renamed from: b */
        final /* synthetic */ IBuildingContract.SelectState f81766b;

        View$OnClickListenerC31989j(ResourceAppendViewControl dVar, IBuildingContract.SelectState selectState) {
            this.f81765a = dVar;
            this.f81766b = selectState;
        }

        public final void onClick(View view) {
            this.f81765a.mo116697e().onSelectAllClicked(this.f81766b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "toastStr", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$d */
    public static final class C31983d<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ ResourceAppendViewControl f81759a;

        C31983d(ResourceAppendViewControl dVar) {
            this.f81759a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            Context context = this.f81759a.mo116698f().getContext();
            if (context != null) {
                Intrinsics.checkExpressionValueIsNotNull(context, "it");
                Intrinsics.checkExpressionValueIsNotNull(str, "toastStr");
                UDToast.show(context, str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$b */
    public static final class C31981b<T> implements AbstractC1178x<ResourceDisplayStatus> {

        /* renamed from: a */
        final /* synthetic */ ResourceAppendViewControl f81757a;

        C31981b(ResourceAppendViewControl dVar) {
            this.f81757a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(ResourceDisplayStatus dVar) {
            if (dVar instanceof ResourceDisplayStatus.BuildingDisplayStatus) {
                AppendBuildingView appendBuildingView = this.f81757a.mo116696d().f74909a;
                Intrinsics.checkExpressionValueIsNotNull(appendBuildingView, "binding.appendBuildingView");
                an.m125213a((View) appendBuildingView, true);
                ResourceDisplayStatus.BuildingDisplayStatus aVar = (ResourceDisplayStatus.BuildingDisplayStatus) dVar;
                this.f81757a.mo116692a(aVar.mo116896a(), aVar.mo116898c());
            } else if (dVar instanceof ResourceDisplayStatus.SearchResultDisplayStatus) {
                this.f81757a.mo116693a((ResourceDisplayStatus.SearchResultDisplayStatus) dVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a.d$c */
    public static final class C31982c<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ ResourceAppendViewControl f81758a;

        C31982c(ResourceAppendViewControl dVar) {
            this.f81758a = dVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            if (num != null && num.intValue() == 1) {
                this.f81758a.mo116691a();
            } else if (num != null && num.intValue() == 3) {
                this.f81758a.mo116694b();
            } else if (num != null && num.intValue() == 2) {
                this.f81758a.mo116695c();
            }
        }
    }

    /* renamed from: a */
    public final void mo116693a(ResourceDisplayStatus.SearchResultDisplayStatus eVar) {
        BuildingAppendSearchView buildingAppendSearchView = this.f81754c.f74925q;
        Intrinsics.checkExpressionValueIsNotNull(buildingAppendSearchView, "binding.searchRoomsResultView");
        an.m125213a((View) buildingAppendSearchView, true);
        RelativeLayout relativeLayout = this.f81754c.f74927s;
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "binding.selectAllContainer");
        an.m125213a((View) relativeLayout, false);
        this.f81754c.f74925q.mo116975a(eVar.mo116903a(), eVar.mo116904b());
    }

    /* renamed from: b */
    private final void m121688b(int i, BuildingResourceViewData cVar) {
        if (i != 1) {
            RelativeLayout relativeLayout = this.f81754c.f74927s;
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "binding.selectAllContainer");
            an.m125213a((View) relativeLayout, false);
            return;
        }
        IBuildingContract.SelectState c = cVar.mo116895c();
        RelativeLayout relativeLayout2 = this.f81754c.f74927s;
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "binding.selectAllContainer");
        an.m125213a((View) relativeLayout2, true);
        this.f81754c.f74926r.mo115963a(c);
        this.f81754c.f74926r.setOnClickListener(new View$OnClickListenerC31989j(this, c));
    }

    /* renamed from: a */
    public final void mo116692a(int i, BuildingResourceViewData cVar) {
        AppendBuildingView appendBuildingView = this.f81754c.f74909a;
        Intrinsics.checkExpressionValueIsNotNull(appendBuildingView, "binding.appendBuildingView");
        an.m125213a((View) appendBuildingView, true);
        this.f81754c.f74909a.mo116960a(cVar.mo116893a(), cVar.mo116894b());
        m121688b(i, cVar);
    }

    public ResourceAppendViewControl(C30067a aVar, AppendBuildingViewModel bVar, ResourceAppendFragment eVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "binding");
        Intrinsics.checkParameterIsNotNull(bVar, "resourceAppendViewModel");
        Intrinsics.checkParameterIsNotNull(eVar, "resourceAppendFragment");
        this.f81754c = aVar;
        this.f81755d = bVar;
        this.f81756e = eVar;
        m121691i();
        m121690h();
        m121689g();
    }
}

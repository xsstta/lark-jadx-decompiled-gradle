package com.ss.android.lark.calendar.impl.features.meetingroom.append;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.lark.pb.calendar.v1.SchemaExtraData;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.SearchBar;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.EquipmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.building.AppendBuildingViewModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.AppendResourceData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.EventData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceDisplayStatus;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.multilevel.MultiLevelViewModel;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendBuildingView;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.AppendResourceTitleBar;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.widget.BuildingAppendSearchView;
import com.ss.android.lark.calendar.impl.features.meetingroom.base.extension.C32066d;
import com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.p1436a.C30067a;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.an;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J \u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/AppendFragmentViewControl;", "", "baseAppendViewModel", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/BaseAppendViewModel;", "fragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "binding", "Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/BaseAppendViewModel;Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;)V", "getBaseAppendViewModel", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/BaseAppendViewModel;", "getBinding", "()Lcom/ss/android/lark/calendar/impl/databinding/FragmentAppendMeetingRoomLayoutBinding;", "getFragment", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/ResourceAppendFragment;", "mMeetingRoomFormFragment", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment;", "checkShowFormFragment", "", "selectResource", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "handleBackPress", "hideLoading", "", "hideResourceFormFragment", "initFilterView", "initLiveData", "initSearchBar", "initTitleBar", "initView", "refreshTitleBar", "resourceDisplayStatus", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "showLoadErrView", "showLoadingView", "startShowResourceFormFragment", "calendarId", "", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a */
public final class AppendFragmentViewControl {

    /* renamed from: a */
    private MeetingRoomFormFragment f81715a;

    /* renamed from: b */
    private final BaseAppendViewModel f81716b;

    /* renamed from: c */
    private final ResourceAppendFragment f81717c;

    /* renamed from: d */
    private final C30067a f81718d;

    /* renamed from: f */
    public final BaseAppendViewModel mo116627f() {
        return this.f81716b;
    }

    /* renamed from: g */
    public final ResourceAppendFragment mo116628g() {
        return this.f81717c;
    }

    /* renamed from: h */
    public final C30067a mo116629h() {
        return this.f81718d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/AppendFragmentViewControl$startShowResourceFormFragment$meetingRoomFormFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/form/MeetingRoomFormFragment$MeetingRoomFormFragmentAction;", "editNewResourceCustomization", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "resourceCustomization", "Lcom/bytedance/lark/pb/calendar/v1/SchemaExtraData$ResourceCustomization;", "oldAppendResource", "onCompletePressed", "", "calendarId", "", "onFragmentBackPressed", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a$g */
    public static final class C31967g implements MeetingRoomFormFragment.MeetingRoomFormFragmentAction {

        /* renamed from: a */
        final /* synthetic */ AppendFragmentViewControl f81724a;

        /* renamed from: b */
        final /* synthetic */ AppendResourceData f81725b;

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment.MeetingRoomFormFragmentAction
        /* renamed from: a */
        public void mo114392a() {
            this.f81724a.mo116620a();
        }

        C31967g(AppendFragmentViewControl aVar, AppendResourceData aVar2) {
            this.f81724a = aVar;
            this.f81725b = aVar2;
        }

        /* renamed from: a */
        private final AppendResourceData m121649a(SchemaExtraData.ResourceCustomization resourceCustomization, AppendResourceData aVar) {
            return new AppendResourceData(C32066d.m121952a(aVar.mo116888b(), resourceCustomization), aVar.mo116889c());
        }

        @Override // com.ss.android.lark.calendar.impl.features.meetingroom.form.MeetingRoomFormFragment.MeetingRoomFormFragmentAction
        /* renamed from: a */
        public void mo114393a(String str, SchemaExtraData.ResourceCustomization resourceCustomization) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(resourceCustomization, "resourceCustomization");
            this.f81724a.mo116620a();
            this.f81724a.mo116628g().mo116912a(CollectionsKt.listOf(m121649a(resourceCustomization, this.f81725b)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/AppendFragmentViewControl$showLoadErrView$1$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a$f */
    public static final class C31966f implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ AppendFragmentViewControl f81723a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            this.f81723a.mo116627f().onLoadErrTryAgainClicked();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
            this.f81723a.mo116628g().mo113714e();
        }

        C31966f(AppendFragmentViewControl aVar) {
            this.f81723a = aVar;
        }
    }

    /* renamed from: j */
    private final void m121628j() {
        m121631m();
        m121629k();
        m121630l();
    }

    /* renamed from: a */
    public final void mo116620a() {
        this.f81717c.mo116908a(this.f81715a);
        this.f81715a = null;
    }

    /* renamed from: e */
    public final boolean mo116626e() {
        if (this.f81715a == null) {
            return false;
        }
        mo116620a();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/AppendFragmentViewControl$initFilterView$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/MeetingRoomSearchFilters$OnSearchFilterListener;", "onCapacityChanged", "", "selectedCapacity", "", "onEquipmentsChanged", "selectedEquipments", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/EquipmentData;", "onResetStatusChanged", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a$a */
    public static final class C31961a implements MeetingRoomSearchFilters.OnSearchFilterListener {

        /* renamed from: a */
        final /* synthetic */ AppendFragmentViewControl f81719a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
        /* renamed from: a */
        public void mo110574a() {
            this.f81719a.mo116627f().onFilterChanged(0, CollectionsKt.emptyList());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31961a(AppendFragmentViewControl aVar) {
            this.f81719a = aVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
        /* renamed from: a */
        public void mo110575a(int i) {
            this.f81719a.mo116627f().onFilterChanged(Integer.valueOf(i), null);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.MeetingRoomSearchFilters.OnSearchFilterListener
        /* renamed from: a */
        public void mo110576a(List<EquipmentData> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectedEquipments");
            this.f81719a.mo116627f().onFilterChanged(null, list);
        }
    }

    /* renamed from: l */
    private final void m121630l() {
        C31964d dVar = new C31964d(this);
        SearchBar searchBar = this.f81718d.f74923o;
        searchBar.setHint(R.string.Calendar_EventSearch_SearchRoom);
        searchBar.mo112603a(dVar);
        searchBar.setEditTextImeOptions(6);
    }

    /* renamed from: m */
    private final void m121631m() {
        this.f81718d.f74911c.setActionListener(new C31965e(this));
        if (this.f81716b instanceof MultiLevelViewModel) {
            this.f81718d.f74911c.mo116964a(0);
        }
    }

    /* renamed from: b */
    public final void mo116623b() {
        CalendarLoadingView calendarLoadingView = this.f81718d.f74913e;
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "binding.calendarLoadingView");
        calendarLoadingView.setVisibility(0);
        this.f81718d.f74913e.mo116402a();
    }

    /* renamed from: c */
    public final void mo116624c() {
        CalendarLoadingView calendarLoadingView = this.f81718d.f74913e;
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "binding.calendarLoadingView");
        calendarLoadingView.setVisibility(8);
        this.f81718d.f74913e.mo116404b();
    }

    /* renamed from: d */
    public final void mo116625d() {
        CalendarLoadingView calendarLoadingView = this.f81718d.f74913e;
        calendarLoadingView.setVisibility(0);
        calendarLoadingView.mo116405c();
        calendarLoadingView.setErrorText(C32634ae.m125182b(R.string.Calendar_Common_FailToLoad3));
        calendarLoadingView.setOnLoadingViewClickedListener(new C31966f(this));
    }

    /* renamed from: i */
    private final void m121627i() {
        this.f81716b.getResourceDisplayStatus().mo5923a(this.f81717c.getViewLifecycleOwner(), new C31962b(this));
        this.f81716b.getFinishWithResourceLiveData().mo5923a(this.f81717c.getViewLifecycleOwner(), new C31963c(this));
    }

    /* renamed from: k */
    private final void m121629k() {
        boolean z;
        EventData eventData;
        if (!this.f81716b.isDisableApprovalMeetingRoom()) {
            this.f81718d.f74919k.setFilterSource("search_meeting");
        } else {
            MeetingRoomSearchFilters meetingRoomSearchFilters = this.f81718d.f74919k;
            ResourceAppendFragmentData resourceAppendData = this.f81716b.getResourceAppendData();
            if (resourceAppendData == null || (eventData = resourceAppendData.getEventData()) == null) {
                z = false;
            } else {
                z = eventData.isEditEvent();
            }
            meetingRoomSearchFilters.setIsEditEvent(z);
        }
        this.f81718d.f74919k.setFilterListener(new C31961a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/meetingroom/append/AppendFragmentViewControl$initSearchBar$searchInputTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a$d */
    public static final class C31964d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ AppendFragmentViewControl f81722a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31964d(AppendFragmentViewControl aVar) {
            this.f81722a = aVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            BaseAppendViewModel f = this.f81722a.mo116627f();
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            f.onSearchKeyWordChanged(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/widget/AppendResourceTitleBar$TitleBarAction;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a$e */
    public static final class C31965e extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ AppendFragmentViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31965e(AppendFragmentViewControl aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            BaseAppendViewModel f = this.this$0.mo116627f();
            if (i == 0) {
                this.this$0.mo116628g().mo113714e();
            } else if (i == 1) {
                if (!(f instanceof AppendBuildingViewModel)) {
                    f = null;
                }
                AppendBuildingViewModel bVar = (AppendBuildingViewModel) f;
                if (bVar != null) {
                    bVar.onChangeSelectModel(1);
                }
            } else if (i == 2) {
                if (!(f instanceof AppendBuildingViewModel)) {
                    f = null;
                }
                AppendBuildingViewModel bVar2 = (AppendBuildingViewModel) f;
                if (bVar2 != null) {
                    bVar2.onChangeSelectModel(0);
                }
            } else if (i == 3) {
                if (f instanceof AppendBuildingViewModel) {
                    ((AppendBuildingViewModel) f).onConfirmMultipleSelectClicked();
                } else if (f instanceof MultiLevelViewModel) {
                    ((MultiLevelViewModel) f).onConfirmSelectClicked();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/AppendResourceData;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a$c */
    public static final class C31963c<T> implements AbstractC1178x<Pair<? extends Boolean, ? extends List<? extends AppendResourceData>>> {

        /* renamed from: a */
        final /* synthetic */ AppendFragmentViewControl f81721a;

        C31963c(AppendFragmentViewControl aVar) {
            this.f81721a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Pair<Boolean, ? extends List<AppendResourceData>> pair) {
            if (!pair.getFirst().booleanValue() || ((List) pair.getSecond()).size() != 1 || !this.f81721a.mo116622a((AppendResourceData) ((List) pair.getSecond()).get(0))) {
                this.f81721a.mo116628g().mo116912a((List) pair.getSecond());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceDisplayStatus;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.append.a$b */
    public static final class C31962b<T> implements AbstractC1178x<ResourceDisplayStatus> {

        /* renamed from: a */
        final /* synthetic */ AppendFragmentViewControl f81720a;

        C31962b(AppendFragmentViewControl aVar) {
            this.f81720a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(ResourceDisplayStatus dVar) {
            if (dVar instanceof ResourceDisplayStatus.LoadingStatusData) {
                this.f81720a.mo116623b();
            } else if (dVar instanceof ResourceDisplayStatus.LoadErrStatusData) {
                this.f81720a.mo116625d();
            } else if (dVar instanceof ResourceDisplayStatus.BuildingDisplayStatus) {
                AppendBuildingView appendBuildingView = this.f81720a.mo116629h().f74909a;
                Intrinsics.checkExpressionValueIsNotNull(appendBuildingView, "binding.appendBuildingView");
                an.m125213a((View) appendBuildingView, true);
                MultiLevelView multiLevelView = this.f81720a.mo116629h().f74921m;
                Intrinsics.checkExpressionValueIsNotNull(multiLevelView, "binding.multiLevelView");
                an.m125213a((View) multiLevelView, false);
                BuildingAppendSearchView buildingAppendSearchView = this.f81720a.mo116629h().f74925q;
                Intrinsics.checkExpressionValueIsNotNull(buildingAppendSearchView, "binding.searchRoomsResultView");
                an.m125213a((View) buildingAppendSearchView, false);
                this.f81720a.mo116624c();
            } else if (dVar instanceof ResourceDisplayStatus.MultiLevelDisplayStatus) {
                this.f81720a.mo116624c();
            } else if (dVar instanceof ResourceDisplayStatus.SearchResultDisplayStatus) {
                this.f81720a.mo116624c();
            }
            this.f81720a.mo116621a(dVar);
        }
    }

    /* renamed from: a */
    public final void mo116621a(ResourceDisplayStatus dVar) {
        AppendResourceTitleBar appendResourceTitleBar = this.f81718d.f74911c;
        if (dVar instanceof ResourceDisplayStatus.SearchResultDisplayStatus) {
            appendResourceTitleBar.mo116963a();
        } else if (dVar instanceof ResourceDisplayStatus.MultiLevelDisplayStatus) {
            appendResourceTitleBar.mo116964a(((ResourceDisplayStatus.MultiLevelDisplayStatus) dVar).mo116901c());
        } else if (dVar instanceof ResourceDisplayStatus.BuildingDisplayStatus) {
            ResourceDisplayStatus.BuildingDisplayStatus aVar = (ResourceDisplayStatus.BuildingDisplayStatus) dVar;
            if (aVar.mo116896a() == 1) {
                appendResourceTitleBar.mo116966b(aVar.mo116897b());
            } else {
                appendResourceTitleBar.mo116965a(this.f81716b.isShowMultiSelect());
            }
        } else {
            appendResourceTitleBar.mo116965a(false);
        }
    }

    /* renamed from: a */
    public final boolean mo116622a(AppendResourceData aVar) {
        SchemaExtraData.ResourceCustomization a = C32066d.m121953a(aVar.mo116888b());
        if (a == null) {
            return false;
        }
        String str = aVar.mo116888b().calendar_id;
        if (str == null) {
            str = "";
        }
        m121626a(str, a, aVar);
        GeneralHitPoint.f83331a.mo118716C("choose_meeting_room");
        return true;
    }

    public AppendFragmentViewControl(BaseAppendViewModel bVar, ResourceAppendFragment eVar, C30067a aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "baseAppendViewModel");
        Intrinsics.checkParameterIsNotNull(eVar, "fragment");
        Intrinsics.checkParameterIsNotNull(aVar, "binding");
        this.f81716b = bVar;
        this.f81717c = eVar;
        this.f81718d = aVar;
        m121628j();
        m121627i();
    }

    /* renamed from: a */
    private final void m121626a(String str, SchemaExtraData.ResourceCustomization resourceCustomization, AppendResourceData aVar) {
        C31967g gVar = new C31967g(this, aVar);
        MeetingRoomFormFragment aVar2 = this.f81715a;
        if (aVar2 != null) {
            aVar2.mo117034a(str, resourceCustomization, gVar);
        } else {
            this.f81715a = new MeetingRoomFormFragment(str, resourceCustomization, gVar);
        }
        FrameLayout frameLayout = this.f81718d.f74914f;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "binding.childFragmentContainer");
        an.m125213a((View) frameLayout, true);
        FrameLayout frameLayout2 = this.f81718d.f74914f;
        Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "binding.childFragmentContainer");
        this.f81717c.mo116909a(this.f81715a, frameLayout2.getId());
    }
}

package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.MeetingRoomFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.MeetingRoomAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.CalendarPerfMonitor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.SchemaHelper;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32628d;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0017\u0018\u00002\u00020\u0001:\u00019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\r\u0010\u001f\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001dH\u0002J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0002J\b\u0010$\u001a\u00020\u001dH\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020\u0014H\u0016J&\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u000e\u00101\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u00102\u001a\u00020\u001d2\f\u00103\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\b\u00106\u001a\u00020\u001dH\u0002J\b\u00107\u001a\u00020\u001dH\u0002J\b\u00108\u001a\u00020\u001dH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bXD¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$MeetingRoomFragmentAction;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$MeetingRoomFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/MeetingRoomFragmentData;)V", "mAllMeetingRoomAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter;", "mCalendarService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarInternalService;", "getMCalendarService$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarInternalService;", "setMCalendarService$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/rustadapter/service/ICalendarInternalService;)V", "mFragmentAction", "mFragmentData", "mFreeMeetingRoomAdapter", "mIsApprovalMeetingRoomDisable", "", "mIsFromLocalRecover", "mMeetingAdapterListener", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$getMeetingRoomAdapterListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$getMeetingRoomAdapterListener$1;", "mShowUsableBoardroom", "mTag", "", "clearHistoryData", "", "dismissLoadingPanel", "getMeetingRoomAdapterListener", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$getMeetingRoomAdapterListener$1;", "initListener", "initSwitchView", "initTitleBar", "initView", "loadBoardroomByBuildingId", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshData", "setData", "calendarResources", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "showEmptyDataTip", "showErrorTipPanel", "showLoadingAnimation", "MeetingRoomFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b */
public final class ChooseMeetingRoomFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public final String f80400a = "ChooseMeetingRoomFragment";

    /* renamed from: b */
    public MeetingRoomAdapter f80401b;

    /* renamed from: e */
    public MeetingRoomAdapter f80402e;

    /* renamed from: f */
    public MeetingRoomFragmentData f80403f;

    /* renamed from: g */
    public MeetingRoomFragmentAction f80404g;

    /* renamed from: h */
    public boolean f80405h;

    /* renamed from: i */
    public boolean f80406i;

    /* renamed from: j */
    private boolean f80407j;

    /* renamed from: k */
    private C31644b f80408k = m119638m();

    /* renamed from: l */
    private AbstractC32595g f80409l;

    /* renamed from: m */
    private HashMap f80410m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$MeetingRoomFragmentAction;", "", "onBackPressed", "", "isShowUsableBoardroom", "", "onMeetingRoomInfoClicked", "resourceCalendarId", "", "onSavePressed", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b$a */
    public interface MeetingRoomFragmentAction {
        /* renamed from: a */
        void mo114379a(EventMeetingRoomData eventMeetingRoomData);

        /* renamed from: a */
        void mo114380a(String str);

        /* renamed from: a */
        void mo114381a(boolean z);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80410m == null) {
            this.f80410m = new HashMap();
        }
        View view = (View) this.f80410m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80410m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80410m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$initListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/widget/CalendarLoadingView$OnLoadingViewClickedListener;", "onTitleBarBackPressed", "", "onTryAgainClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b$c */
    public static final class C31645c implements CalendarLoadingView.AbstractC31882a {

        /* renamed from: a */
        final /* synthetic */ ChooseMeetingRoomFragment f80412a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: a */
        public void mo110519a() {
            this.f80412a.mo115286b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.CalendarLoadingView.AbstractC31882a
        /* renamed from: b */
        public void mo110520b() {
            this.f80412a.mo113714e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31645c(ChooseMeetingRoomFragment bVar) {
            this.f80412a = bVar;
        }
    }

    /* renamed from: m */
    private final C31644b m119638m() {
        return new C31644b(this);
    }

    /* renamed from: g */
    private final void m119632g() {
        m119633h();
        m119634i();
        m119635j();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        MeetingRoomFragmentAction aVar = this.f80404g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentAction");
        }
        aVar.mo114381a(this.f80405h);
        return true;
    }

    public ChooseMeetingRoomFragment() {
        C32583e a = C32583e.m124816a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarService.getInstance()");
        this.f80409l = a;
        this.f80407j = true;
    }

    /* renamed from: l */
    private final void m119637l() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo109250a(R.id.calendar_loading_view);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "calendar_loading_view");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo109250a(R.id.calendar_loading_view)).mo116402a();
    }

    /* renamed from: c */
    public final void mo115287c() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo109250a(R.id.calendar_loading_view);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "calendar_loading_view");
        calendarLoadingView.setVisibility(8);
        ((CalendarLoadingView) mo109250a(R.id.calendar_loading_view)).mo116404b();
    }

    /* renamed from: h */
    private final void m119633h() {
        ((CommonTitleBar) mo109250a(R.id.boardroom_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.boardroom_title_bar)).setLeftClickListener(new C31648f(this));
        ((CommonTitleBar) mo109250a(R.id.boardroom_title_bar)).setLeftImageResource(R.drawable.ud_icon_left_outlined);
    }

    /* renamed from: i */
    private final void m119634i() {
        ((CalendarLoadingView) mo109250a(R.id.calendar_loading_view)).setOnLoadingViewClickedListener(new C31645c(this));
        ListView listView = (ListView) mo109250a(R.id.lv_boardroom);
        Intrinsics.checkExpressionValueIsNotNull(listView, "lv_boardroom");
        listView.setOnItemClickListener(new C31646d(this));
    }

    /* renamed from: k */
    private final void m119636k() {
        MeetingRoomAdapter eVar = this.f80401b;
        if (eVar != null && this.f80402e != null) {
            if (eVar != null) {
                eVar.mo115237a();
            }
            MeetingRoomAdapter eVar2 = this.f80402e;
            if (eVar2 != null) {
                eVar2.mo115237a();
            }
            if (this.f80405h) {
                MeetingRoomAdapter eVar3 = this.f80402e;
                if (eVar3 != null) {
                    eVar3.notifyDataSetChanged();
                    return;
                }
                return;
            }
            MeetingRoomAdapter eVar4 = this.f80401b;
            if (eVar4 != null) {
                eVar4.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: d */
    public final void mo115288d() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo109250a(R.id.calendar_loading_view);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "calendar_loading_view");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo109250a(R.id.calendar_loading_view)).mo116405c();
        ((CalendarLoadingView) mo109250a(R.id.calendar_loading_view)).setErrorText(getResources().getString(R.string.Calendar_Common_FailToLoad3));
    }

    /* renamed from: f */
    public final void mo115289f() {
        CalendarLoadingView calendarLoadingView = (CalendarLoadingView) mo109250a(R.id.calendar_loading_view);
        Intrinsics.checkExpressionValueIsNotNull(calendarLoadingView, "calendar_loading_view");
        calendarLoadingView.setVisibility(0);
        ((CalendarLoadingView) mo109250a(R.id.calendar_loading_view)).mo116405c();
        ((CalendarLoadingView) mo109250a(R.id.calendar_loading_view)).setErrorText(getResources().getString(R.string.Calendar_Edit_NoRoomsAvailable));
    }

    /* renamed from: j */
    private final void m119635j() {
        MeetingRoomFragmentData meetingRoomFragmentData = this.f80403f;
        if (meetingRoomFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        if (meetingRoomFragmentData.isShowUsableContainer()) {
            RelativeLayout relativeLayout = (RelativeLayout) mo109250a(R.id.switch_view_usable_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "switch_view_usable_container");
            relativeLayout.setVisibility(0);
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) mo109250a(R.id.switch_view_usable_container);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "switch_view_usable_container");
            relativeLayout2.setVisibility(8);
        }
        MeetingRoomFragmentData meetingRoomFragmentData2 = this.f80403f;
        if (meetingRoomFragmentData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        this.f80405h = meetingRoomFragmentData2.isShowUsableMeetingRoom();
        ((UDSwitch) mo109250a(R.id.switch_view_usable_boardroom)).setCheckedIgnoreEvent(this.f80405h);
        ((UDSwitch) mo109250a(R.id.switch_view_usable_boardroom)).setOnCheckedChangeListener(new C31647e(this));
    }

    /* renamed from: b */
    public final void mo115286b() {
        UIGetDataCallback uIGetDataCallback;
        m119637l();
        String l = Long.toString(new Date().getTime());
        C31649g gVar = new C31649g(this, l, "getMeetingRoomsInBuilding");
        String str = this.f80400a;
        String[] strArr = new String[8];
        strArr[0] = "start_time";
        StringBuilder sb = new StringBuilder();
        MeetingRoomFragmentData meetingRoomFragmentData = this.f80403f;
        if (meetingRoomFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        sb.append(String.valueOf(meetingRoomFragmentData.getStartTime()));
        sb.append("");
        strArr[1] = sb.toString();
        strArr[2] = "end_time";
        StringBuilder sb2 = new StringBuilder();
        MeetingRoomFragmentData meetingRoomFragmentData2 = this.f80403f;
        if (meetingRoomFragmentData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        sb2.append(String.valueOf(meetingRoomFragmentData2.getEndTime()));
        sb2.append("");
        strArr[3] = sb2.toString();
        strArr[4] = "building_ids";
        MeetingRoomFragmentData meetingRoomFragmentData3 = this.f80403f;
        if (meetingRoomFragmentData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        strArr[5] = meetingRoomFragmentData3.getChosenBuilding().getId().toString();
        strArr[6] = "rrule";
        MeetingRoomFragmentData meetingRoomFragmentData4 = this.f80403f;
        if (meetingRoomFragmentData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        strArr[7] = meetingRoomFragmentData4.getRRule();
        Log.m165389i(str, C32673y.m125376b(l, "getMeetingRoomsInBuilding", strArr));
        CallbackManager callbackManager = this.mCallbackManager;
        if (callbackManager != null) {
            uIGetDataCallback = callbackManager.wrapAndAddGetDataCallback(gVar);
        } else {
            uIGetDataCallback = null;
        }
        AbstractC32595g gVar2 = this.f80409l;
        MeetingRoomFragmentData meetingRoomFragmentData5 = this.f80403f;
        if (meetingRoomFragmentData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        long startTime = meetingRoomFragmentData5.getStartTime();
        MeetingRoomFragmentData meetingRoomFragmentData6 = this.f80403f;
        if (meetingRoomFragmentData6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        long endTime = meetingRoomFragmentData6.getEndTime();
        String[] strArr2 = new String[1];
        MeetingRoomFragmentData meetingRoomFragmentData7 = this.f80403f;
        if (meetingRoomFragmentData7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        strArr2[0] = meetingRoomFragmentData7.getChosenBuilding().getId();
        List<String> asList = Arrays.asList(strArr2);
        MeetingRoomFragmentData meetingRoomFragmentData8 = this.f80403f;
        if (meetingRoomFragmentData8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        gVar2.mo119033a(startTime, endTime, asList, meetingRoomFragmentData8.getRRule(), false, null, uIGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$getMeetingRoomAdapterListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/MeetingRoomAdapter$IMeetingRoomListener;", "onMeetingRoomInfoClicked", "", "calendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b$b */
    public static final class C31644b implements MeetingRoomAdapter.IMeetingRoomListener {

        /* renamed from: a */
        final /* synthetic */ ChooseMeetingRoomFragment f80411a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31644b(ChooseMeetingRoomFragment bVar) {
            this.f80411a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.MeetingRoomAdapter.IMeetingRoomListener
        /* renamed from: a */
        public void mo115261a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            ChooseMeetingRoomFragment.m119631b(this.f80411a).mo114380a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$initListener$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingOnItemClickListener;", "doOnItemClick", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b$d */
    public static final class C31646d extends AbstractC32628d {

        /* renamed from: a */
        final /* synthetic */ ChooseMeetingRoomFragment f80413a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31646d(ChooseMeetingRoomFragment bVar) {
            this.f80413a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32628d
        /* renamed from: a */
        public void mo115154a(AdapterView<?> adapterView, View view, int i, long j) {
            CalendarResource calendarResource;
            Intrinsics.checkParameterIsNotNull(adapterView, "parent");
            Intrinsics.checkParameterIsNotNull(view, "view");
            ListView listView = (ListView) this.f80413a.mo109250a(R.id.lv_boardroom);
            Intrinsics.checkExpressionValueIsNotNull(listView, "lv_boardroom");
            MeetingRoomAdapter eVar = (MeetingRoomAdapter) listView.getAdapter();
            if (eVar != null) {
                calendarResource = eVar.getItem(i);
            } else {
                calendarResource = null;
            }
            if (calendarResource == null) {
                return;
            }
            if (!this.f80413a.f80406i || !SchemaHelper.f83746a.mo120312a(calendarResource.getResourceSchema())) {
                EventMeetingRoomData eventMeetingRoomData = new EventMeetingRoomData();
                eventMeetingRoomData.setMCalendarBuildingName$calendar_impl_release(ChooseMeetingRoomFragment.m119630a(this.f80413a).getChosenBuilding().getName());
                eventMeetingRoomData.setCalendarResource(calendarResource);
                eventMeetingRoomData.setMCalendarId$calendar_impl_release(calendarResource.getCalendarId());
                eventMeetingRoomData.buildDisPlayText();
                ChooseMeetingRoomFragment.m119631b(this.f80413a).mo114379a(eventMeetingRoomData);
                return;
            }
            LKUIToast.show(this.f80413a.getContext(), C32634ae.m125182b(R.string.Calendar_Approval_ExplainNo));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b$f */
    public static final class C31648f extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseMeetingRoomFragment f80415a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31648f(ChooseMeetingRoomFragment bVar) {
            this.f80415a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80415a.mo113714e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ MeetingRoomFragmentData m119630a(ChooseMeetingRoomFragment bVar) {
        MeetingRoomFragmentData meetingRoomFragmentData = bVar.f80403f;
        if (meetingRoomFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        return meetingRoomFragmentData;
    }

    /* renamed from: b */
    public static final /* synthetic */ MeetingRoomFragmentAction m119631b(ChooseMeetingRoomFragment bVar) {
        MeetingRoomFragmentAction aVar = bVar.f80404g;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentAction");
        }
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseMeetingRoomFragment$loadBoardroomByBuildingId$dataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "resources", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b$g */
    public static final class C31649g implements IGetDataCallback<Map<String, ? extends CalendarResource>> {

        /* renamed from: a */
        final /* synthetic */ ChooseMeetingRoomFragment f80416a;

        /* renamed from: b */
        final /* synthetic */ String f80417b;

        /* renamed from: c */
        final /* synthetic */ String f80418c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            CalendarPerfMonitor.m124417b("key_view_rooms_in_building");
            Log.m165383e(this.f80416a.f80400a, C32673y.m125370a(this.f80417b, this.f80418c, errorResult));
            this.f80416a.mo115288d();
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarResource> map) {
            String str;
            if (map == null) {
                str = "null";
            } else {
                str = String.valueOf(map.size()) + "";
            }
            Log.m165389i(this.f80416a.f80400a, C32673y.m125373a(this.f80417b, this.f80418c, "resources_size", str));
            this.f80416a.mo115287c();
            if (map == null || !(!map.isEmpty())) {
                this.f80416a.mo115289f();
                return;
            }
            ArrayList arrayList = new ArrayList(map.values());
            CollectionsKt.sortWith(arrayList, C31650a.f80419a);
            this.f80416a.mo115285a(arrayList);
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b$g$a */
        public static final class C31650a<T> implements Comparator<CalendarResource> {

            /* renamed from: a */
            public static final C31650a f80419a = new C31650a();

            C31650a() {
            }

            /* renamed from: a */
            public final int compare(CalendarResource calendarResource, CalendarResource calendarResource2) {
                Intrinsics.checkExpressionValueIsNotNull(calendarResource2, "o2");
                int weight = calendarResource2.getWeight();
                Intrinsics.checkExpressionValueIsNotNull(calendarResource, "o1");
                return weight - calendarResource.getWeight();
            }
        }

        C31649g(ChooseMeetingRoomFragment bVar, String str, String str2) {
            this.f80416a = bVar;
            this.f80417b = str;
            this.f80418c = str2;
        }
    }

    /* renamed from: a */
    public final void mo115284a(MeetingRoomFragmentData meetingRoomFragmentData) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(meetingRoomFragmentData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        m119636k();
        mo115287c();
        this.f80403f = meetingRoomFragmentData;
        if (meetingRoomFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        this.f80405h = meetingRoomFragmentData.isShowUsableMeetingRoom();
        ((UDSwitch) mo109250a(R.id.switch_view_usable_boardroom)).setCheckedIgnoreEvent(this.f80405h);
        MeetingRoomFragmentData meetingRoomFragmentData2 = this.f80403f;
        if (meetingRoomFragmentData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        if (meetingRoomFragmentData2.getRRule().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f80406i = z;
        mo115286b();
    }

    /* renamed from: a */
    public final void mo115285a(List<? extends CalendarResource> list) {
        MeetingRoomAdapter eVar;
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CalendarResource calendarResource : list) {
            arrayList.add(calendarResource);
            if ((!SchemaHelper.f83746a.mo120312a(calendarResource.getResourceSchema()) || !this.f80406i) && calendarResource.getStatus() == CalendarResource.Status.FREE) {
                arrayList2.add(calendarResource);
            }
        }
        MeetingRoomFragmentData meetingRoomFragmentData = this.f80403f;
        if (meetingRoomFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        this.f80401b = new MeetingRoomAdapter(meetingRoomFragmentData.getChosenBuilding(), arrayList, context, this.f80408k);
        MeetingRoomFragmentData meetingRoomFragmentData2 = this.f80403f;
        if (meetingRoomFragmentData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        Context context2 = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context2, "mContext");
        this.f80402e = new MeetingRoomAdapter(meetingRoomFragmentData2.getChosenBuilding(), arrayList2, context2, this.f80408k);
        MeetingRoomAdapter eVar2 = this.f80401b;
        if (eVar2 != null) {
            MeetingRoomFragmentData meetingRoomFragmentData3 = this.f80403f;
            if (meetingRoomFragmentData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
            }
            if (meetingRoomFragmentData3.getRRule().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            eVar2.mo115238a(z);
        }
        ListView listView = (ListView) mo109250a(R.id.lv_boardroom);
        Intrinsics.checkExpressionValueIsNotNull(listView, "lv_boardroom");
        if (this.f80405h) {
            eVar = this.f80402e;
        } else {
            eVar = this.f80401b;
        }
        listView.setAdapter((ListAdapter) eVar);
        CalendarPerfMonitor.m124413a("key_view_rooms_in_building");
        if (this.f80405h && CollectionUtils.isEmpty(arrayList2)) {
            mo115289f();
        } else if (!this.f80405h && CollectionUtils.isEmpty(arrayList)) {
            mo115289f();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80407j) {
            m119632g();
            mo115286b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.b$e */
    public static final class C31647e implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ChooseMeetingRoomFragment f80414a;

        C31647e(ChooseMeetingRoomFragment bVar) {
            this.f80414a = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MeetingRoomAdapter eVar;
            MeetingRoomAdapter eVar2;
            if (z) {
                this.f80414a.f80405h = true;
                ListView listView = (ListView) this.f80414a.mo109250a(R.id.lv_boardroom);
                Intrinsics.checkExpressionValueIsNotNull(listView, "lv_boardroom");
                listView.setAdapter((ListAdapter) this.f80414a.f80402e);
                if (this.f80414a.f80402e == null || ((eVar2 = this.f80414a.f80402e) != null && eVar2.getCount() == 0)) {
                    this.f80414a.mo115289f();
                } else {
                    this.f80414a.mo115287c();
                }
            } else {
                this.f80414a.f80405h = false;
                ListView listView2 = (ListView) this.f80414a.mo109250a(R.id.lv_boardroom);
                Intrinsics.checkExpressionValueIsNotNull(listView2, "lv_boardroom");
                listView2.setAdapter((ListAdapter) this.f80414a.f80401b);
                if (this.f80414a.f80401b == null || ((eVar = this.f80414a.f80401b) != null && eVar.getCount() == 0)) {
                    this.f80414a.mo115289f();
                } else {
                    this.f80414a.mo115287c();
                }
            }
        }
    }

    public ChooseMeetingRoomFragment(MeetingRoomFragmentAction aVar, MeetingRoomFragmentData meetingRoomFragmentData) {
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        Intrinsics.checkParameterIsNotNull(meetingRoomFragmentData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C32583e a = C32583e.m124816a();
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarService.getInstance()");
        this.f80409l = a;
        this.f80404g = aVar;
        this.f80403f = meetingRoomFragmentData;
        boolean z = false;
        this.f80407j = false;
        if (meetingRoomFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragmentData");
        }
        this.f80406i = meetingRoomFragmentData.getRRule().length() > 0 ? true : z;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_boardroom, viewGroup, false);
    }
}

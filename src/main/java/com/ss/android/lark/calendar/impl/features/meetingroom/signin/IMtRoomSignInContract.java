package com.ss.android.lark.calendar.impl.features.meetingroom.signin;

import android.os.Bundle;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.calendar.v1.InstanceCheckInInfo;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.InactiveReason;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MeetingRoomSignInState;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.TimeRange;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.GetResourceCheckInInfoResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceInfo;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract;", "", "()V", "IMtRoomSignInModeApi", "IMtRoomSignInViewApi", "IViewAction", "IViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.a */
public final class IMtRoomSignInContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\n\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH&J\b\u0010\u001f\u001a\u00020 H&J\b\u0010!\u001a\u00020\"H&J\b\u0010#\u001a\u00020\"H&J\b\u0010$\u001a\u00020\"H&J\b\u0010%\u001a\u00020&H&J\b\u0010'\u001a\u00020&H&J\b\u0010(\u001a\u00020\"H&J\n\u0010)\u001a\u0004\u0018\u00010\u001eH&J\b\u0010*\u001a\u00020+H&J\b\u0010,\u001a\u00020+H&J\b\u0010-\u001a\u00020+H&J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H&J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204H&J\b\u00105\u001a\u00020/H&R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u0004\u0018\u00010\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014¨\u00066"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IMtRoomSignInModeApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewData;", "currentSignInState", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "getCurrentSignInState", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "setCurrentSignInState", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;)V", "inactiveReason", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;", "getInactiveReason", "()Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;", "setInactiveReason", "(Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;)V", "nextInstanceInfo", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;", "getNextInstanceInfo", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;", "setNextInstanceInfo", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/InstanceInfo;)V", "processingInstance", "getProcessingInstance", "setProcessingInstance", "signInInstanceInfo", "getSignInInstanceInfo", "setSignInInstanceInfo", "getCalendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "getCalendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "getIdleBlockTimeRange", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/TimeRange;", "getMtRoomCalendarId", "", "getMtRoomResourceId", "getMtRoomToken", "getNextRefreshResourceSecond", "", "getOriginalServerTimestamp", "getQrCodeUrl", "getResource", "isFirstActive", "", "isQRCodeInactive", "isSignInInstanceStarted", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "setResourceCheckInInfo", "response", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/GetResourceCheckInInfoResponse;", "updateSignInState", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.a$a */
    public interface IMtRoomSignInModeApi extends IModelCalendar<IViewData> {
        /* renamed from: a */
        MeetingRoomSignInState mo117343a();

        /* renamed from: a */
        void mo117344a(Bundle bundle);

        /* renamed from: a */
        void mo117345a(GetResourceCheckInInfoResponse jVar);

        /* renamed from: b */
        InstanceInfo mo117346b();

        /* renamed from: c */
        InstanceInfo mo117347c();

        /* renamed from: d */
        InstanceInfo mo117348d();

        /* renamed from: e */
        InactiveReason mo117349e();

        /* renamed from: g */
        String mo117350g();

        /* renamed from: h */
        String mo117351h();

        /* renamed from: i */
        String mo117352i();

        /* renamed from: j */
        void mo117353j();

        /* renamed from: k */
        long mo117354k();

        /* renamed from: l */
        boolean mo117355l();

        /* renamed from: m */
        boolean mo117356m();

        /* renamed from: n */
        String mo117357n();

        /* renamed from: o */
        CalendarResource mo117358o();

        /* renamed from: p */
        CalendarBuilding mo117359p();

        /* renamed from: q */
        TimeRange mo117360q();

        /* renamed from: r */
        boolean mo117361r();

        /* renamed from: s */
        long mo117362s();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IMtRoomSignInViewApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewAction;", "hideLoading", "", "refreshAllView", "showFirstActiveToast", "showLoadError", "errText", "", "showLoading", "showSignInErrorToast", "showSignInSuccessToast", "stopCountDown", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.a$b */
    public interface IMtRoomSignInViewApi extends IViewCalender<IViewData, IViewAction> {
        /* renamed from: a */
        void mo117363a();

        /* renamed from: a */
        void mo117364a(String str);

        /* renamed from: b */
        void mo117365b();

        /* renamed from: c */
        void mo117366c();

        /* renamed from: d */
        void mo117367d();

        /* renamed from: e */
        void mo117368e();

        /* renamed from: f */
        void mo117369f();

        /* renamed from: g */
        void mo117370g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onAvatarClicked", "", BottomDialog.f17198f, "", "onBlockTvClicked", "onBookContainerClicked", "onCountDownViewFinished", "onLoadAgainViewClicked", "onResourceInfoContainerClicked", "onSignInTvClicked", "onTitleBarBackClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.a$c */
    public interface IViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo117371a();

        /* renamed from: a */
        void mo117372a(String str);

        /* renamed from: b */
        void mo117373b();

        /* renamed from: c */
        void mo117374c();

        /* renamed from: d */
        void mo117375d();

        /* renamed from: e */
        void mo117376e();

        /* renamed from: f */
        void mo117377f();

        /* renamed from: g */
        void mo117378g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH&J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&J\b\u0010\u0013\u001a\u00020\u0003H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0017H&J\b\u0010\u0019\u001a\u00020\u0017H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000fH&J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\u001d\u001a\u00020\u0003H&J\b\u0010\u001e\u001a\u00020\u0005H&J\b\u0010\u001f\u001a\u00020\u0005H&J\b\u0010 \u001a\u00020\u0005H&J\b\u0010!\u001a\u00020\u0005H&J\b\u0010\"\u001a\u00020\u0005H&¨\u0006#"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/IMtRoomSignInContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getBuildingName", "", "getCanUserBlockResource", "", "getCurInstanceOrganizer", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "getCurInstanceTime", "getCurrentSignInState", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/MeetingRoomSignInState;", "getIdleTimeString", "getInactiveContact", "", "getInactiveReason", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/signin/data/InactiveReason;", "getMeetingRoomName", "getNextInstanceCheckInType", "Lcom/bytedance/lark/pb/calendar/v1/InstanceCheckInInfo$CheckInType;", "getNextInstanceInactiveReason", "getNextInstanceOrganizer", "getNextInstanceTimeString", "getRemainingSignInSecond", "", "getResourceCheckInAfterSecond", "getResourceCheckInBeforeSecond", "getResourceInactiveReasonString", "inactiveReason", "getSignInInstanceOrganizer", "getSignInInstanceTime", "hasNextInstance", "isNextInstanceInactive", "isQrCheckInEnable", "isResourcePermanentlyDisabled", "isSignInInstanceStarted", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.a$d */
    public interface IViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        MeetingRoomSignInState mo117379a();

        /* renamed from: a */
        String mo117380a(InactiveReason inactiveReason);

        /* renamed from: b */
        String mo117381b();

        /* renamed from: c */
        String mo117382c();

        /* renamed from: d */
        String mo117383d();

        /* renamed from: e */
        CalendarEventCreator mo117384e();

        /* renamed from: f */
        String mo117385f();

        /* renamed from: g */
        CalendarEventCreator mo117386g();

        /* renamed from: h */
        String mo117387h();

        /* renamed from: i */
        CalendarEventCreator mo117388i();

        /* renamed from: j */
        InstanceCheckInInfo.CheckInType mo117389j();

        /* renamed from: k */
        boolean mo117390k();

        /* renamed from: l */
        boolean mo117391l();

        /* renamed from: m */
        String mo117392m();

        /* renamed from: n */
        InactiveReason mo117393n();

        /* renamed from: o */
        boolean mo117394o();

        /* renamed from: p */
        boolean mo117395p();

        /* renamed from: q */
        long mo117396q();

        /* renamed from: r */
        long mo117397r();

        /* renamed from: s */
        boolean mo117398s();

        /* renamed from: t */
        boolean mo117399t();

        /* renamed from: u */
        long mo117400u();

        /* renamed from: v */
        List<CalendarEventCreator> mo117401v();

        /* renamed from: w */
        String mo117402w();
    }
}

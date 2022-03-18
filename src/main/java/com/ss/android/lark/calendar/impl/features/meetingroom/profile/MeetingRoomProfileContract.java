package com.ss.android.lark.calendar.impl.features.meetingroom.profile;

import android.os.Bundle;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.bytedance.lark.pb.calendar.v1.MeetingRoomStatus;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.data.MeetingRoomProfileBaseData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.StatusInformation;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract;", "", "()V", "IMeetingRoomModelApi", "IMeetingRoomViewAction", "IMeetingRoomViewApi", "IMeetingRoomViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.b */
public final class MeetingRoomProfileContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomModelApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewData;", "getMeetingRoomBaseData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/data/MeetingRoomProfileBaseData;", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "updateStatusInformation", "statusInformation", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/StatusInformation;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.b$a */
    public interface IMeetingRoomModelApi extends IModelCalendar<IMeetingRoomViewData> {
        /* renamed from: a */
        MeetingRoomProfileBaseData mo117267a();

        /* renamed from: a */
        void mo117268a(Bundle bundle);

        /* renamed from: a */
        void mo117269a(StatusInformation zVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onLoadAgainViewClicked", "", "onSubscriberClicked", BottomDialog.f17198f, "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.b$b */
    public interface IMeetingRoomViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo117270a();

        /* renamed from: a */
        void mo117271a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewData;", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewAction;", "hideLoading", "", "refreshAllView", "showLoadError", "showLoading", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.b$c */
    public interface IMeetingRoomViewApi extends IViewCalender<IMeetingRoomViewData, IMeetingRoomViewAction> {
        /* renamed from: a */
        void mo117272a();

        /* renamed from: b */
        void mo117273b();

        /* renamed from: c */
        void mo117274c();

        /* renamed from: d */
        void mo117275d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/meetingroom/profile/MeetingRoomProfileContract$IMeetingRoomViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getBlockedEventTimeText", "", "getBuildingName", "getCanNotReserveReason", "getCapacity", "", "getDescription", "getEquipments", "getEventBlocker", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "getEventCreator", "getMeetingRoomImageUrl", "getMeetingRoomName", "getMeetingRoomRuleText", "getMeetingRoomState", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomStatus;", "isShowStateInfo", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.b$d */
    public interface IMeetingRoomViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        String mo117276a();

        /* renamed from: b */
        String mo117277b();

        /* renamed from: c */
        long mo117278c();

        /* renamed from: d */
        String mo117279d();

        /* renamed from: e */
        String mo117280e();

        /* renamed from: f */
        String mo117281f();

        /* renamed from: g */
        String mo117282g();

        /* renamed from: h */
        MeetingRoomStatus mo117283h();

        /* renamed from: i */
        String mo117284i();

        /* renamed from: j */
        String mo117285j();

        /* renamed from: k */
        boolean mo117286k();

        /* renamed from: l */
        CalendarEventCreator mo117287l();

        /* renamed from: m */
        CalendarEventCreator mo117288m();
    }
}

package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.mail.impl.widget.time.CalendarDate;
import com.ss.android.lark.mail.impl.widget.time.TimeData;
import com.ss.android.lark.mail.impl.widget.time.mvp.IModelCalendar;
import com.ss.android.lark.mail.impl.widget.time.mvp.IViewCalender;
import java.util.TimeZone;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract;", "", "()V", "IEditMultiTimeModelApi", "IEditMultiTimeViewAction", "IEditMultiTimeViewApi", "IEditMultiTimeViewData", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.b */
public final class EditMultiTimeContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0006H&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0018\u001a\u00020\u0016H&J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0004H&J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0006H&J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0004H&J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0004H&J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0006H&J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0004H&J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0010H&J\b\u0010$\u001a\u00020\u0012H&J\b\u0010%\u001a\u00020\u0012H&J\u0010\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u000bH&J\b\u0010(\u001a\u00020\u0012H&J\b\u0010)\u001a\u00020\u0012H&¨\u0006*"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeModelApi;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IModelCalendar;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "getAllDayEndCalendar", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "getAllDayEventInterval", "", "getAllDayStartCalendar", "getCurrentTimeZone", "Ljava/util/TimeZone;", "getCurrentTimeZoneId", "", "getEndCalendar", "getNormalEventInterval", "getStartCalendar", "getTimeType", "", "initDataByTimeData", "", "timeData", "Lcom/ss/android/lark/mail/impl/widget/time/TimeData;", "isAllDay", "", "isEventTimeCurrentInvalidate", "isEventTimeInvalidate", "setAllDayEndCalendar", "calendar", "setAllDayEventInterval", "interval", "setAllDayStartCalendar", "setEndCalendar", "setIsAllDay", "setNormalEventInterval", "setStartCalendar", "setTimeType", ShareHitPoint.f121869d, "updateAllDayCalendarByToggle", "updateCalendarByTimeZone", "updateCurrentTimeZone", "timeZoneId", "updateEventIntervalByTimeZone", "updateNormalCalendarByToggle", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.b$a */
    public interface IEditMultiTimeModelApi extends IModelCalendar<IEditMultiTimeViewData> {
        /* renamed from: a */
        void mo156954a(int i);

        /* renamed from: a */
        void mo156955a(long j);

        /* renamed from: a */
        void mo156956a(CalendarDate calendarDate);

        /* renamed from: a */
        void mo156957a(TimeData timeData);

        /* renamed from: a */
        void mo156958a(String str);

        /* renamed from: a */
        void mo156959a(boolean z);

        /* renamed from: a */
        boolean mo156960a();

        /* renamed from: b */
        CalendarDate mo156961b();

        /* renamed from: b */
        void mo156962b(long j);

        /* renamed from: b */
        void mo156963b(CalendarDate calendarDate);

        /* renamed from: c */
        CalendarDate mo156964c();

        /* renamed from: c */
        void mo156965c(CalendarDate calendarDate);

        /* renamed from: d */
        CalendarDate mo156966d();

        /* renamed from: d */
        void mo156967d(CalendarDate calendarDate);

        /* renamed from: e */
        CalendarDate mo156968e();

        /* renamed from: f */
        boolean mo156969f();

        /* renamed from: g */
        boolean mo156970g();

        /* renamed from: h */
        String mo156971h();

        /* renamed from: i */
        TimeZone mo156972i();

        /* renamed from: j */
        long mo156973j();

        /* renamed from: k */
        int mo156974k();

        /* renamed from: l */
        void mo156975l();

        /* renamed from: m */
        void mo156976m();

        /* renamed from: n */
        void mo156977n();

        /* renamed from: o */
        void mo156978o();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewAction;", "onBackBtnPressed", "", "onChooseEndTime", "onChooseStartTime", "onClickSaveBtn", "onTimeZoneChanged", "timeZoneId", "", "onToggleToAllDay", "onToggleToNormalDay", "onWheelViewDataChange", "calendar", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.b$b */
    public interface IEditMultiTimeViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo156979a();

        /* renamed from: a */
        void mo156980a(CalendarDate calendarDate);

        /* renamed from: a */
        void mo156981a(String str);

        /* renamed from: b */
        void mo156982b();

        /* renamed from: c */
        void mo156983c();

        /* renamed from: d */
        void mo156984d();

        /* renamed from: e */
        void mo156985e();

        /* renamed from: f */
        void mo156986f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewApi;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "hideAttendeeRecycleView", "", "refreshEndErrorState", "refreshErrorState", "refreshPickerViewData", "refreshStartErrorState", "refreshTimeContainerData", "refreshTimeContainerSelectedState", "refreshTimeWheelViewData", "refreshTimeWheelViewVisibility", "refreshTimeWheelsOnTimeFormatChange", "refreshTimeZoneContainer", "refreshWholeEditTimeView", "showEndTimeInvalidDialog", "content", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.b$c */
    public interface IEditMultiTimeViewApi extends IViewCalender<IEditMultiTimeViewData, IEditMultiTimeViewAction> {
        /* renamed from: a */
        void mo156987a();

        /* renamed from: a */
        void mo156988a(String str);

        /* renamed from: b */
        void mo156989b();

        /* renamed from: c */
        void mo156990c();

        /* renamed from: d */
        void mo156991d();

        /* renamed from: e */
        void mo156992e();

        /* renamed from: f */
        void mo156993f();

        /* renamed from: g */
        void mo156994g();

        /* renamed from: h */
        void mo156995h();

        /* renamed from: i */
        void mo156996i();

        /* renamed from: j */
        void mo156997j();

        /* renamed from: k */
        void mo156998k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/IViewCalender$IViewData;", "getAllDayEndCalendar", "Lcom/ss/android/lark/mail/impl/widget/time/CalendarDate;", "getAllDayStartCalendar", "getCurrentDate", "getCurrentTimeZone", "Ljava/util/TimeZone;", "getCurrentTimeZoneId", "", "getEndCalendar", "getStartCalendar", "getTimeType", "", "isAllDay", "", "isChoosePastTime", "isEventTimeInvalidate", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.b$d */
    public interface IEditMultiTimeViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        boolean mo156999a();

        /* renamed from: b */
        CalendarDate mo157000b();

        /* renamed from: c */
        CalendarDate mo157001c();

        /* renamed from: d */
        CalendarDate mo157002d();

        /* renamed from: e */
        CalendarDate mo157003e();

        /* renamed from: f */
        boolean mo157004f();

        /* renamed from: g */
        boolean mo157005g();

        /* renamed from: h */
        CalendarDate mo157006h();

        /* renamed from: i */
        TimeZone mo157007i();

        /* renamed from: j */
        String mo157008j();

        /* renamed from: k */
        int mo157009k();
    }
}

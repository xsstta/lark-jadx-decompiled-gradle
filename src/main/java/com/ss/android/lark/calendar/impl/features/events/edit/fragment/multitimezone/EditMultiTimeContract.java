package com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone;

import android.content.Context;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.data.TimeData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.multitimezone.attendeeLocalTimeAdapter.AttendeeLocalTimeData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract;", "", "()V", "IEditMultiTimeModelApi", "IEditMultiTimeViewAction", "IEditMultiTimeViewApi", "IEditMultiTimeViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a */
public final class EditMultiTimeContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0004H&J\b\u0010\u0018\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\u0016H&J\u0018\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` H&J\b\u0010!\u001a\u00020\u0004H&J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020\u0016H&J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020%H&J\b\u0010*\u001a\u00020#H&J\b\u0010+\u001a\u00020#H&J\b\u0010,\u001a\u00020#H&J\b\u0010-\u001a\u00020#H&J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0016H&J\u0010\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020\u0004H&J\u0010\u00102\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0016H&J\u0010\u00103\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0016H&J\u0010\u00104\u001a\u00020(2\u0006\u0010*\u001a\u00020#H&J\u0010\u00105\u001a\u00020(2\u0006\u0010+\u001a\u00020#H&J\u0010\u00106\u001a\u00020(2\u0006\u00101\u001a\u00020\u0004H&J\u0018\u00107\u001a\u00020(2\u0006\u0010)\u001a\u00020%2\u0006\u0010+\u001a\u00020#H&J\u0010\u00108\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0016H&J\b\u00109\u001a\u00020(H&J\b\u0010:\u001a\u00020(H&J\u0010\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020\nH&J\b\u0010=\u001a\u00020(H&J\b\u0010>\u001a\u00020(H&R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\nX¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006?"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeModelApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "eventOriginalTime", "", "getEventOriginalTime", "()J", "setEventOriginalTime", "(J)V", "eventRRule", "", "getEventRRule", "()Ljava/lang/String;", "setEventRRule", "(Ljava/lang/String;)V", "originalEvent", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "getOriginalEvent", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "setOriginalEvent", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;)V", "getAllDayEndCalendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getAllDayEventInterval", "getAllDayStartCalendar", "getCurrentTimeZone", "Ljava/util/TimeZone;", "getCurrentTimeZoneId", "getEndCalendar", "getMeetingRoomContainerList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "Lkotlin/collections/ArrayList;", "getNormalEventInterval", "getOriginalIsChosenStartTime", "", "getOriginalTimeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/TimeData;", "getStartCalendar", "initDataByTimeData", "", "timeData", "isAllDay", "isChosenStartTime", "isEventTimeInvalidate", "isNeedShowGuests", "setAllDayEndCalendar", "calendar", "setAllDayEventInterval", "interval", "setAllDayStartCalendar", "setEndCalendar", "setIsAllDay", "setIsChosenStartTime", "setNormalEventInterval", "setOriginalData", "setStartCalendar", "updateAllDayCalendarByToggle", "updateCalendarByTimeZone", "updateCurrentTimeZone", "timeZoneId", "updateEventIntervalByTimeZone", "updateNormalCalendarByToggle", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a$a */
    public interface IEditMultiTimeModelApi extends IModelCalendar<IEditMultiTimeViewData> {
        /* renamed from: a */
        long mo115357a();

        /* renamed from: a */
        void mo115358a(long j);

        /* renamed from: a */
        void mo115359a(CalendarDate calendarDate);

        /* renamed from: a */
        void mo115360a(TimeData timeData);

        /* renamed from: a */
        void mo115361a(TimeData timeData, boolean z);

        /* renamed from: a */
        void mo115362a(String str);

        /* renamed from: a */
        void mo115363a(boolean z);

        /* renamed from: b */
        String mo115364b();

        /* renamed from: b */
        void mo115365b(long j);

        /* renamed from: b */
        void mo115366b(CalendarDate calendarDate);

        /* renamed from: b */
        void mo115367b(boolean z);

        /* renamed from: c */
        CalendarEvent mo115368c();

        /* renamed from: c */
        void mo115369c(CalendarDate calendarDate);

        /* renamed from: d */
        void mo115370d(CalendarDate calendarDate);

        /* renamed from: d */
        boolean mo115371d();

        /* renamed from: e */
        CalendarDate mo115372e();

        /* renamed from: g */
        CalendarDate mo115373g();

        /* renamed from: h */
        CalendarDate mo115374h();

        /* renamed from: i */
        CalendarDate mo115375i();

        /* renamed from: j */
        boolean mo115376j();

        /* renamed from: k */
        String mo115377k();

        /* renamed from: l */
        TimeZone mo115378l();

        /* renamed from: m */
        long mo115379m();

        /* renamed from: n */
        long mo115380n();

        /* renamed from: o */
        boolean mo115381o();

        /* renamed from: p */
        void mo115382p();

        /* renamed from: q */
        void mo115383q();

        /* renamed from: r */
        void mo115384r();

        /* renamed from: s */
        void mo115385s();

        /* renamed from: t */
        ArrayList<CalendarEventAttendee> mo115386t();

        /* renamed from: u */
        TimeData mo115387u();

        /* renamed from: v */
        boolean mo115388v();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onBackBtnPressed", "", "onChooseEndTime", "onChooseStartTime", "onClickSaveBtn", "onTimeZoneChanged", "timeZoneId", "", "onToggleToAllDay", "onToggleToNormalDay", "onWheelViewDataChange", "calendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a$b */
    public interface IEditMultiTimeViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo115389a();

        /* renamed from: a */
        void mo115390a(CalendarDate calendarDate);

        /* renamed from: a */
        void mo115391a(String str);

        /* renamed from: b */
        void mo115392b();

        /* renamed from: c */
        void mo115393c();

        /* renamed from: d */
        void mo115394d();

        /* renamed from: e */
        void mo115395e();

        /* renamed from: f */
        void mo115396f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0007H&J\b\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0007H&J\b\u0010\u0012\u001a\u00020\u0007H&J\b\u0010\u0013\u001a\u00020\u0007H&J\b\u0010\u0014\u001a\u00020\u0007H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewAction;", "getContext", "Landroid/content/Context;", "hideAttendeeRecycleView", "", "refreshAttendeeRecycleView", "refreshEndErrorState", "refreshErrorState", "refreshPickerViewData", "refreshStartErrorState", "refreshTimeContainerData", "refreshTimeContainerSelectedState", "refreshTimeWheelViewData", "refreshTimeWheelViewVisibility", "refreshTimeWheelsOnTimeFormatChange", "refreshTimeZoneContainer", "refreshWholeEditTimeView", "showEndTimeInvalidDialog", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a$c */
    public interface IEditMultiTimeViewApi extends IViewCalender<IEditMultiTimeViewData, IEditMultiTimeViewAction> {
        /* renamed from: a */
        void mo115397a();

        /* renamed from: b */
        void mo115398b();

        /* renamed from: c */
        void mo115399c();

        /* renamed from: d */
        void mo115400d();

        /* renamed from: e */
        void mo115401e();

        /* renamed from: f */
        void mo115402f();

        /* renamed from: g */
        void mo115403g();

        /* renamed from: h */
        void mo115404h();

        /* renamed from: i */
        void mo115405i();

        /* renamed from: j */
        void mo115406j();

        /* renamed from: k */
        void mo115407k();

        /* renamed from: l */
        void mo115408l();

        /* renamed from: m */
        void mo115409m();

        /* renamed from: n */
        void mo115410n();

        /* renamed from: o */
        Context mo115411o();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u000fH&J\b\u0010\u0011\u001a\u00020\u000fH&J\b\u0010\u0012\u001a\u00020\u000fH&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/EditMultiTimeContract$IEditMultiTimeViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getAllDayEndCalendar", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getAllDayStartCalendar", "getAttendeeLocalTimeData", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/multitimezone/attendeeLocalTimeAdapter/AttendeeLocalTimeData;", "getCurrentTimeZone", "Ljava/util/TimeZone;", "getCurrentTimeZoneId", "", "getEndCalendar", "getStartCalendar", "isAllDay", "", "isChosenStartTime", "isEventTimeInvalidate", "isNeedShowGuests", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.d.a$d */
    public interface IEditMultiTimeViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        boolean mo115412a();

        /* renamed from: b */
        CalendarDate mo115413b();

        /* renamed from: c */
        CalendarDate mo115414c();

        /* renamed from: d */
        CalendarDate mo115415d();

        /* renamed from: e */
        CalendarDate mo115416e();

        /* renamed from: f */
        boolean mo115417f();

        /* renamed from: g */
        TimeZone mo115418g();

        /* renamed from: h */
        String mo115419h();

        /* renamed from: i */
        List<AttendeeLocalTimeData> mo115420i();

        /* renamed from: j */
        boolean mo115421j();
    }
}

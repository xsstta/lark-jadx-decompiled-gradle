package com.ss.android.lark.calendar.impl.features.calendarview.days;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.IDateLogicData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.AllDayChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayChipData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.DayRange;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.MultiThreadLiveData;
import com.ss.android.lark.calendar.impl.features.calendarview.days.data.SettingReadyData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract;", "", "IDaysDiagramModelApi", "IDaysDiagramViewAction", "IDaysDiagramViewApi", "IDaysDiagramViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.e */
public interface IDaysDiagramContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\b\u0010\r\u001a\u00020\u0004H&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u0004H&J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0004H&J\b\u0010\u001d\u001a\u00020\u0004H&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001aH&¨\u0006 "}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramModelApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewData;", "loadAllDayEventChipsData", "", "startDay", "", "endDay", "loadDayEventChipsData", "loadPageEventChipsData", "pageDayRange", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayRange;", "preloadDiskData", "preloadInstance", "selectDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "resetDataCache", "setLogicDate", "logicDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "setSettingReady", "updateAlternateCalendar", "updateCacheSelectDay", "selectDay", "isMoveToday", "", "updateDefaultEventDuration", "updateTimeFormat", "updateTimeZone", "updateWeekStartDay", "needRefreshAllPage", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.e$a */
    public interface IDaysDiagramModelApi extends IModelCalendar<IDaysDiagramViewData> {
        /* renamed from: a */
        void mo110906a(int i, int i2);

        /* renamed from: a */
        void mo110907a(int i, boolean z);

        /* renamed from: a */
        void mo110908a(CalendarDate calendarDate);

        /* renamed from: a */
        void mo110909a(IDateLogicData hVar);

        /* renamed from: a */
        void mo110910a(List<DayRange> list);

        /* renamed from: a */
        void mo110911a(boolean z);

        /* renamed from: b */
        void mo110912b();

        /* renamed from: b */
        void mo110913b(int i, int i2);

        /* renamed from: c */
        void mo110914c();

        /* renamed from: d */
        void mo110915d();

        /* renamed from: e */
        void mo110916e();

        /* renamed from: g */
        void mo110917g();

        /* renamed from: h */
        void mo110918h();

        /* renamed from: i */
        void mo110919i();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH&J \u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001bH&¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onAppendTimeCancel", "", "onAppendTimeSelect", "startTime", "", "endTime", "onBindAllDayLayer", "startDay", "", "endDay", "onBindDayLayer", "layerDay", "onClickChipView", "intent", "Landroid/content/Intent;", "onDragSaveEvent", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "onRefreshLayout", "pageDayRange", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayRange;", "onSelectDateChanged", "selectDay", "isMoveToday", "", "onTabProgressChange", "process", "", "startEventDetailActivity", "activity", "Landroid/app/Activity;", "chipViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/EventChipViewData;", "isOpenNearbyClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.e$b */
    public interface IDaysDiagramViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo111012a();

        /* renamed from: a */
        void mo111013a(float f);

        /* renamed from: a */
        void mo111014a(int i);

        /* renamed from: a */
        void mo111015a(int i, int i2);

        /* renamed from: a */
        void mo111016a(int i, boolean z);

        /* renamed from: a */
        void mo111017a(long j, long j2);

        /* renamed from: a */
        void mo111018a(Activity activity, EventChipViewData eventChipViewData, boolean z);

        /* renamed from: a */
        void mo111019a(Intent intent);

        /* renamed from: a */
        void mo111020a(CalendarEventInstance calendarEventInstance, long j, long j2);

        /* renamed from: a */
        void mo111021a(List<DayRange> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0005H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewAction;", "clearAppendEvent", "", "clearEvent", "getDaysDiagramView", "Landroid/view/View;", "moveToSelectDay", "refreshAllPage", "refreshChipsMask", "refreshCurrentDay", "setDaysViewVisibility", "isVisible", "", "showViewTimeZoneGuide", "smoothToSelectDay", "selectDay", "", "smoothToToday", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.e$c */
    public interface IDaysDiagramViewApi extends IViewCalender<IDaysDiagramViewData, IDaysDiagramViewAction> {
        /* renamed from: a */
        void mo111028a(boolean z);

        /* renamed from: c */
        View mo111030c();

        /* renamed from: d */
        void mo111031d();

        /* renamed from: e */
        void mo111032e();

        /* renamed from: f */
        void mo111033f();

        /* renamed from: g */
        void mo111034g();

        /* renamed from: h */
        void mo111035h();

        /* renamed from: i */
        void mo111036i();

        /* renamed from: j */
        void mo111037j();

        /* renamed from: k */
        void mo111038k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nH&J\b\u0010\r\u001a\u00020\u0006H&J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nH&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\nH&J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\nH&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/IDaysDiagramContract$IDaysDiagramViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getAllDayChipsLD", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/MultiThreadLiveData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayChipData;", "getCurrentDay", "", "getDayChipsLD", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/DayChipData;", "getDefaultEventDurationLD", "Landroidx/lifecycle/MutableLiveData;", "getFirstDayOfWeekLD", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "getSelectDay", "getSettingReadyLD", "Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/SettingReadyData;", "getShowLunarCalendarLD", "", "getTimeZoneIdLD", "", "getTwelveTimeFormatLD", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.e$d */
    public interface IDaysDiagramViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        C1177w<CalendarSetting.DayOfWeek> mo110921a();

        /* renamed from: b */
        C1177w<Boolean> mo110922b();

        /* renamed from: c */
        C1177w<Boolean> mo110923c();

        /* renamed from: d */
        C1177w<String> mo110924d();

        /* renamed from: e */
        MultiThreadLiveData<AllDayChipData> mo110925e();

        /* renamed from: f */
        MultiThreadLiveData<DayChipData> mo110926f();

        /* renamed from: g */
        C1177w<Integer> mo110927g();

        /* renamed from: h */
        MultiThreadLiveData<SettingReadyData> mo110928h();

        /* renamed from: i */
        int mo110929i();

        /* renamed from: j */
        int mo110930j();
    }
}

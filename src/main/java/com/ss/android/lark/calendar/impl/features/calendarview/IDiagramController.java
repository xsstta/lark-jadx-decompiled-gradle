package com.ss.android.lark.calendar.impl.features.calendarview;

import android.app.Activity;
import android.view.View;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H&J\b\u0010\u0011\u001a\u00020\u0003H&J \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0007H&J\b\u0010 \u001a\u00020\u0003H&J\b\u0010!\u001a\u00020\u0003H&J\b\u0010\"\u001a\u00020\u0003H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(H&J\b\u0010)\u001a\u00020\u0003H&J\b\u0010*\u001a\u00020\u0003H&¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramController;", "", "changeAccount", "", "changeAlternateCalendar", "changeCurrentDay", "date", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "changeFirstDayOfWeek", "changeTimeFormat", "clearAppendEvent", "create", "activity", "Landroid/app/Activity;", "destroy", "getDiagramView", "Landroid/view/View;", "hideDiagramView", "initDiagramView", "diagramDelegate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDiagramDelegate;", "viewDependency", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$ViewDependency;", "dateLogicData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/IDateLogicData;", "moveBackForwardPage", "isBack", "", "moveToToday", "preLoadDiskInstance", "preLoadInstance", "selectDate", "refreshAllPage", "refreshCurrentTimeLine", "refreshEventMask", "refreshOnSettingChanged", "settingChangedEvent", "Lcom/ss/android/lark/calendar/impl/framework/busevents/SettingChangedEvent;", "refreshViewTimeZone", "timeZoneId", "", "showDiagramGuide", "showDiagramView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.i */
public interface IDiagramController {
    /* renamed from: a */
    void mo110989a();

    /* renamed from: a */
    void mo110990a(Activity activity);

    /* renamed from: a */
    void mo110991a(CalendarDate calendarDate);

    /* renamed from: a */
    void mo110992a(IDiagramDelegate jVar, CalendarDaysContract.AbstractC30658d dVar, IDateLogicData hVar);

    /* renamed from: a */
    void mo110993a(SettingChangedEvent mVar);

    /* renamed from: a */
    void mo110994a(String str);

    /* renamed from: b */
    View mo110995b();

    /* renamed from: b */
    void mo110996b(CalendarDate calendarDate);

    /* renamed from: c */
    void mo110997c();

    /* renamed from: d */
    void mo110998d();

    void destroy();

    /* renamed from: e */
    void mo110999e();

    /* renamed from: f */
    void mo111000f();

    /* renamed from: g */
    void mo111001g();

    /* renamed from: h */
    void mo111002h();

    /* renamed from: i */
    void mo111003i();

    /* renamed from: j */
    void mo111004j();

    /* renamed from: k */
    void mo111005k();

    /* renamed from: l */
    void mo111006l();
}

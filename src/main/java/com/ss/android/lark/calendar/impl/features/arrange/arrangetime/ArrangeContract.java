package com.ss.android.lark.calendar.impl.features.arrange.arrangetime;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.data.ArrangeMeetingData;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.ArrangeConflictUnit;
import com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract;", "", "IArrangeModel", "IArrangeView", "ViewDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.a */
public interface ArrangeContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001:\u0001<J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\u0018\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0007j\b\u0012\u0004\u0012\u00020\u000b`\tH&J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\rH&J\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\b\u0010\u000f\u001a\u00020\bH&J\u0018\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\bH&J\u0018\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0014H&J\b\u0010\u001f\u001a\u00020\u0016H&J\b\u0010 \u001a\u00020!H&J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020#0\rH&J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020%H&J\b\u0010'\u001a\u00020%H&J&\u0010(\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0*2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010,H&J\u0018\u0010-\u001a\u00020\u00032\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010,H&J\u0010\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201H&J\u0010\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0014H&J\u0018\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u001d2\u0006\u00106\u001a\u00020\u001dH&J\u0010\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\bH&J\u0010\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u001dH&J$\u0010;\u001a\u00020\u00032\u001a\u0010)\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tH&¨\u0006="}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeModel;", "Lcom/larksuite/framework/mvp/IModel;", "clearAllAttendees", "", "getArrangeMeetingData", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/data/ArrangeMeetingData;", "getAttendeeChatterIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAttendeeList", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "getAttendeeTimeZoneMap", "", "getBothConflictList", "getChatId", "getConflictList", "getConflictResult", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit;", "getEndDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getEndTime", "", "getEventInstanceData", "callback", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;", "getOrganizerCalendarId", "getOutWorkHourList", "getSource", "", "getStartDate", "getStartTime", "getViewTimeZone", "Ljava/util/TimeZone;", "getWorkHourMap", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "isAlwaysShowChipAndFooter", "", "isFromP2P", "isLoadDataError", "loadAttendee", "chatterIds", "", "originCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "loadChatArrangeOriginData", "viewCallback", "setModelDelegate", "delegate", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeModel$ModelDelegate;", "setStartEndDate", "selectDate", "setStartEndDayMinutes", "startDayMinutes", "endDayMinutes", "setViewTimeZone", "timeZoneId", "updateIndexToLeft", "index", "updateSelectedChatterIds", "ModelDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.a$a */
    public interface IArrangeModel extends IModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeModel$ModelDelegate;", "", "onLoadAttendeeSuccess", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.a$a$a */
        public interface ModelDelegate {
            /* renamed from: a */
            void mo108871a();
        }

        /* renamed from: a */
        ArrayList<AbstractC30095b> mo108842a();

        /* renamed from: a */
        void mo108843a(int i);

        /* renamed from: a */
        void mo108844a(int i, int i2);

        /* renamed from: a */
        void mo108845a(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo108846a(OnLoadEventInstances cVar);

        /* renamed from: a */
        void mo108847a(ModelDelegate aVar);

        /* renamed from: a */
        void mo108848a(CalendarDate calendarDate);

        /* renamed from: a */
        void mo108849a(String str);

        /* renamed from: a */
        void mo108850a(ArrayList<String> arrayList);

        /* renamed from: a */
        void mo108851a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        TimeZone mo108852b();

        /* renamed from: c */
        long mo108853c();

        /* renamed from: d */
        long mo108854d();

        /* renamed from: e */
        CalendarDate mo108855e();

        /* renamed from: f */
        CalendarDate mo108856f();

        /* renamed from: g */
        ArrangeConflictUnit mo108857g();

        /* renamed from: h */
        ArrayList<String> mo108858h();

        /* renamed from: i */
        ArrayList<String> mo108859i();

        /* renamed from: j */
        ArrayList<String> mo108860j();

        /* renamed from: k */
        boolean mo108861k();

        /* renamed from: l */
        Map<String, String> mo108862l();

        /* renamed from: m */
        Map<String, CalendarWorkHourSetting> mo108863m();

        /* renamed from: n */
        ArrayList<String> mo108864n();

        /* renamed from: o */
        int mo108865o();

        /* renamed from: p */
        boolean mo108866p();

        /* renamed from: q */
        String mo108867q();

        /* renamed from: r */
        void mo108868r();

        /* renamed from: s */
        boolean mo108869s();

        /* renamed from: t */
        ArrangeMeetingData mo108870t();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00016J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH&J,\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\b\u001a\u00020\tH&JP\u0010\u0013\u001a\u00020\u00042\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e2\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000e2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00120\fj\b\u0012\u0004\u0012\u00020\u0012`\u000eH&JB\u0010\u0017\u001a\u00020\u000428\u0010\u0018\u001a4\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\f0\u0019j\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001a0\fj\b\u0012\u0004\u0012\u00020\u001a`\u000e`\u001bH&J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH&J\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0012H&J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0012H&J\b\u0010#\u001a\u00020\u0004H&J\b\u0010$\u001a\u00020\u0004H&J\b\u0010%\u001a\u00020\u0004H&J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020(H&J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020(H&J\b\u0010+\u001a\u00020\u0004H&J\b\u0010,\u001a\u00020\u0004H&J\b\u0010-\u001a\u00020\u0004H&J\b\u0010.\u001a\u00020\u0004H&J\b\u0010/\u001a\u00020\u0004H&J\b\u00100\u001a\u00020\u0004H&J\b\u00101\u001a\u00020\u0004H&J8\u00102\u001a\u00020\u00042\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002040\u00112\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\b\u001a\u00020\tH&¨\u00067"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeView$ViewDelegate;", "bindArrangeTime", "", "startTime", "", "endTime", "viewTimeZone", "Ljava/util/TimeZone;", "bindAvatarNameInfo", "attendeeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "Lkotlin/collections/ArrayList;", "bindAvatarTimezone", "attendeeTimezone", "", "", "bindBusyAttendee", "busyCalendarIds", "outWorkHourCalendarIds", "bothConflictCalendarIds", "bindEventChipView", "chipViewData", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "bindFreeBusyResult", "freeBusyResult", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit;", "bindTitleBar", "viewTimeZoneId", "bindViewTimeZone", "timeZoneId", "clearAllEventChip", "hideFinishedBtn", "refreshTimeFormat", "setAlwaysShowChipAndFooter", "alwaysShow", "", "setIsAnimOnClickAppendChip", "isAnim", "setTitleLeftIconAsCross", "showAddGroupChatterIcon", "showAppendChip", "showLoading", "showLoadingError", "showNoAttendees", "showTimeChip", "showWorkHourShadow", "workHourMap", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "attendeeTimeZoneMap", "ViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.a$b */
    public interface IArrangeView extends IView<ViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH&J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0003H&J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH&J\b\u0010\u0015\u001a\u00020\fH&J\b\u0010\u0016\u001a\u00020\fH&J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\fH&¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeView$ViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "getEndDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getIsLoadDataError", "", "getStartDate", "getTimeBarNormalUnit", "", "getViewTimeZone", "Ljava/util/TimeZone;", "onChipHandleVisible", "", "onClickAppendChip", "onClickToLeft", "index", "onDateChanged", "selectDate", "onDayMinutesChanged", "startDayMinutes", "endDayMinutes", "onFinishClicked", "onSelectGroupNumberClick", "onViewTimeZoneChanged", "timeZoneId", "", "refreshEventChip", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.a$b$a */
        public interface ViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo108893a();

            /* renamed from: a */
            void mo108894a(int i);

            /* renamed from: a */
            void mo108895a(int i, int i2);

            /* renamed from: a */
            void mo108896a(CalendarDate calendarDate);

            /* renamed from: a */
            void mo108897a(String str);

            /* renamed from: b */
            CalendarDate mo108898b();

            /* renamed from: c */
            CalendarDate mo108899c();

            /* renamed from: d */
            void mo108900d();

            /* renamed from: e */
            boolean mo108901e();

            /* renamed from: f */
            void mo108902f();

            /* renamed from: g */
            void mo108903g();

            /* renamed from: h */
            void mo108904h();

            /* renamed from: i */
            int mo108905i();

            /* renamed from: j */
            TimeZone mo108906j();
        }

        /* renamed from: a */
        void mo108872a();

        /* renamed from: a */
        void mo108873a(long j, long j2, TimeZone timeZone);

        /* renamed from: a */
        void mo108874a(long j, String str);

        /* renamed from: a */
        void mo108875a(long j, Map<String, String> map, TimeZone timeZone);

        /* renamed from: a */
        void mo108876a(ArrangeConflictUnit arrangeConflictUnit);

        /* renamed from: a */
        void mo108877a(String str);

        /* renamed from: a */
        void mo108878a(ArrayList<AbstractC30095b> arrayList);

        /* renamed from: a */
        void mo108879a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3);

        /* renamed from: a */
        void mo108880a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap);

        /* renamed from: a */
        void mo108881a(Map<String, CalendarWorkHourSetting> map, Map<String, String> map2, TimeZone timeZone);

        /* renamed from: a */
        void mo108882a(boolean z);

        /* renamed from: b */
        void mo108883b();

        /* renamed from: b */
        void mo108884b(boolean z);

        /* renamed from: c */
        void mo108885c();

        /* renamed from: d */
        void mo108886d();

        /* renamed from: e */
        void mo108887e();

        /* renamed from: f */
        void mo108888f();

        /* renamed from: g */
        void mo108889g();

        /* renamed from: h */
        void mo108890h();

        /* renamed from: i */
        void mo108891i();

        /* renamed from: j */
        void mo108892j();
    }
}

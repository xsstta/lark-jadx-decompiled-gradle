package com.ss.android.lark.calendar.impl.features.arrange.arrangelook;

import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.calendar.impl.features.arrange.arrangelook.widget.LookPageView;
import com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDaysContract;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract;", "", "ILookModel", "ILookView", "OnEventDrag", "TimeSelectedListener", "ViewDependency", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.a */
public interface ILookContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001'Jt\u0010\u0002\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b`\u000728\u0010\t\u001a4\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003j\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\b`\u0007H&J\u0018\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\bH&J\u0018\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0005j\b\u0012\u0004\u0012\u00020\f`\bH&J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u001a\u001a\u00020\u001bH&J\u0014\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u000eH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\u001fH&J\b\u0010!\u001a\u00020\u0010H&J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$H&J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0004H&¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookModel;", "Lcom/larksuite/framework/mvp/IModel;", "convertToResourceEventChipViewData", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "eventInstances", "getAttendeeChatterIds", "getAttendeeList", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "getAttendeeTimeZoneMap", "", "getEventInstanceData", "", "loadDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "callback", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;", "getExternalCalendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "getExternalCalendarResource", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "getMtRoomCalendarId", "getViewTimeZone", "Ljava/util/TimeZone;", "getWorkHourMap", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "isFromProfile", "", "isLoadDataError", "loadAttendeeByChatterId", "setModelDelegate", "modelDelegate", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookModel$ModelDelegate;", "setViewTimeZone", "timeZoneId", "ModelDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.a$a */
    public interface ILookModel extends IModel {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookModel$ModelDelegate;", "", "onLoadAttendeeSuccess", "", "attendeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "Lkotlin/collections/ArrayList;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.a$a$a */
        public interface ModelDelegate {
            /* renamed from: a */
            void mo108531a(ArrayList<AbstractC30095b> arrayList);
        }

        /* renamed from: a */
        HashMap<String, ArrayList<DayEventChipViewData>> mo108520a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap);

        /* renamed from: a */
        void mo108521a();

        /* renamed from: a */
        void mo108522a(ModelDelegate aVar);

        /* renamed from: a */
        void mo108523a(CalendarDate calendarDate, OnLoadEventInstances cVar);

        /* renamed from: a */
        void mo108524a(String str);

        /* renamed from: b */
        ArrayList<AbstractC30095b> mo108525b();

        /* renamed from: c */
        Map<String, String> mo108526c();

        /* renamed from: d */
        Map<String, CalendarWorkHourSetting> mo108527d();

        /* renamed from: e */
        TimeZone mo108528e();

        /* renamed from: f */
        boolean mo108529f();

        /* renamed from: g */
        String mo108530g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$J$\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH&JJ\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u001128\u0010\u0012\u001a4\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u0013j\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\fj\b\u0012\u0004\u0012\u00020\u0014`\u000e`\u0015H&JR\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u000728\u0010\u0012\u001a4\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f0\u0013j\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\fj\b\u0012\u0004\u0012\u00020\u0014`\u000e`\u0015H&J\b\u0010\u0018\u001a\u00020\u0011H&J\b\u0010\u0019\u001a\u00020\u0011H&J\b\u0010\u001a\u001a\u00020\u0011H&J\b\u0010\u001b\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0004H&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u001e\u001a\u00020\u0004H&J\b\u0010\u001f\u001a\u00020\u0004H&J8\u0010 \u001a\u00020\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"0\u00062\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&¨\u0006%"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookView$ViewDelegate;", "bindAttendeeTimeZone", "", "attendeeTimeZone", "", "", "viewTimeZone", "Ljava/util/TimeZone;", "bindAttendeesInfo", "attendeeList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "Lkotlin/collections/ArrayList;", "bindEventChipView", "page", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/widget/LookPageView;", "chipViewData", "Ljava/util/HashMap;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "Lkotlin/collections/HashMap;", "bindMtRoomEventChipView", "mtRoomCalendarId", "getCenterPage", "getLeftPage", "getRightPage", "hideAttendeeInfo", "hideAttendeeTip", "loadEventError", "refreshTimeFormat", "showLoadingToast", "showWorkHourShadow", "workHourMap", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "timeZoneMap", "ViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.a$b */
    public interface ILookView extends IView<ViewDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ILookView$ViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "didAfterPagesInflated", "", "didMoveToCenterPage", "didMoveToFollowingPage", "didMoveToPreviousPage", "isFromProfile", "", "refreshThreePage", "viewTimeZoneChanged", "timeZoneId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.a$b$a */
        public interface ViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo108545a();

            /* renamed from: a */
            void mo108546a(String str);

            /* renamed from: b */
            void mo108547b();

            /* renamed from: c */
            void mo108548c();

            /* renamed from: d */
            void mo108549d();

            /* renamed from: e */
            void mo108550e();

            /* renamed from: f */
            boolean mo108551f();
        }

        /* renamed from: a */
        void mo108532a();

        /* renamed from: a */
        void mo108533a(LookPageView aVar);

        /* renamed from: a */
        void mo108534a(LookPageView aVar, String str, HashMap<String, ArrayList<DayEventChipViewData>> hashMap);

        /* renamed from: a */
        void mo108535a(LookPageView aVar, HashMap<String, ArrayList<DayEventChipViewData>> hashMap);

        /* renamed from: a */
        void mo108536a(ArrayList<AbstractC30095b> arrayList);

        /* renamed from: a */
        void mo108537a(Map<String, CalendarWorkHourSetting> map, Map<String, String> map2, TimeZone timeZone);

        /* renamed from: a */
        void mo108538a(Map<String, String> map, TimeZone timeZone);

        /* renamed from: b */
        LookPageView mo108539b();

        /* renamed from: c */
        LookPageView mo108540c();

        /* renamed from: d */
        LookPageView mo108541d();

        /* renamed from: e */
        void mo108542e();

        /* renamed from: f */
        void mo108543f();

        /* renamed from: g */
        void mo108544g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$OnEventDrag;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$OnEventDrag;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.a$c */
    public interface OnEventDrag extends CalendarDaysContract.AbstractC30655a {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$TimeSelectedListener;", "", "onTimeSelectCancel", "", "onTimeSelected", "startTime", "", "endTime", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.a$d */
    public interface TimeSelectedListener {
        /* renamed from: a */
        void mo108552a();

        /* renamed from: a */
        void mo108553a(long j, long j2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangelook/ILookContract$ViewDependency;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDaysContract$ViewDependency;", "setHasOutWorkHourAttendee", "", "hasOutWorkHourAttendee", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.a$e */
    public interface ViewDependency extends CalendarDaysContract.AbstractC30658d {
        /* renamed from: a */
        void mo108519a(boolean z);
    }
}

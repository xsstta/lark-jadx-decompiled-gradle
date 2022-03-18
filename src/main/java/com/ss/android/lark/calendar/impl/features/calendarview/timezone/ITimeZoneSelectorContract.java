package com.ss.android.lark.calendar.impl.features.calendarview.timezone;

import com.ss.android.lark.calendar.impl.features.calendarview.timezone.TimeZoneEnterView;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimeZoneItemData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract;", "", "ITimeZoneSelectorModel", "ITimeZoneSelectorView", "IViewAction", "IViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b */
public interface ITimeZoneSelectorContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H&J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0012H&J\u0012\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0018\u0010\u0018\u001a\u00020\u000f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001aH&J\u0018\u0010\u001b\u001a\u00020\u000f2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001aH&J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&R\u0018\u0010\u0003\u001a\u00020\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$ITimeZoneSelectorModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewData;", "isShowToast", "", "()Z", "setShowToast", "(Z)V", ShareHitPoint.f121868c, "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;", "getSource", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;", "setSource", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/TimeZoneEnterView$Source;)V", "deleteAllRecentTimeZone", "", "deleteRecentTimeZone", "timeZoneId", "", "getDeviceTimeZoneId", "getSelectedTimeZoneId", "setDeviceTimeZone", "timeZoneData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "setRecentTomeZone", "recentTimeZoneIdList", "Ljava/util/ArrayList;", "setSearchResult", "searchTimeZoneList", "setSelectedTimeZoneId", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b$a */
    public interface ITimeZoneSelectorModel extends IModelCalendar<IViewData> {
        /* renamed from: a */
        TimeZoneEnterView.Source mo112495a();

        /* renamed from: a */
        void mo112496a(TimeZoneItemData aVar);

        /* renamed from: a */
        void mo112497a(String str);

        /* renamed from: a */
        void mo112498a(ArrayList<String> arrayList);

        /* renamed from: a */
        void mo112499a(boolean z);

        /* renamed from: b */
        void mo112500b(String str);

        /* renamed from: b */
        void mo112501b(ArrayList<TimeZoneItemData> arrayList);

        /* renamed from: b */
        boolean mo112502b();

        /* renamed from: c */
        String mo112503c();

        /* renamed from: d */
        String mo112504d();

        /* renamed from: e */
        void mo112505e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$ITimeZoneSelectorView;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewAction;", "hideKeyboard", "", "modifyForDesktop", "showDeviceTimeZoneData", "showRecentTimeZoneData", "showRecentView", "showSearchNotData", "showSearchResultData", "showSearchView", "showSelectTimeZone", "showSelectedToast", "timeZoneTip", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b$b */
    public interface ITimeZoneSelectorView extends IViewCalender<IViewData, IViewAction> {
        /* renamed from: a */
        void mo112506a();

        /* renamed from: a */
        void mo112507a(String str);

        /* renamed from: b */
        void mo112508b();

        /* renamed from: c */
        void mo112509c();

        /* renamed from: d */
        void mo112510d();

        /* renamed from: e */
        void mo112511e();

        /* renamed from: f */
        void mo112512f();

        /* renamed from: g */
        void mo112513g();

        /* renamed from: h */
        void mo112514h();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onClearAllRecentTimeZoneClick", "", "delTimeZoneIds", "Ljava/util/ArrayList;", "", "onDeleteRecentTimeZoneClick", "delTimeZoneId", "onSearchCancelClick", "onSearchClick", "searchKey", "onSearchEditViewClick", "onTimeZoneSelected", "timeZoneId", "onTitleBarCloseClicked", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b$c */
    public interface IViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo112515a();

        /* renamed from: a */
        void mo112516a(String str);

        /* renamed from: a */
        void mo112517a(ArrayList<String> arrayList);

        /* renamed from: b */
        void mo112518b();

        /* renamed from: b */
        void mo112519b(String str);

        /* renamed from: c */
        void mo112520c(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getDeviceTimeZone", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "getRecentResult", "Ljava/util/ArrayList;", "getSearchResult", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.timezone.b$d */
    public interface IViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        TimeZoneItemData mo112521a();

        /* renamed from: b */
        ArrayList<TimeZoneItemData> mo112522b();

        /* renamed from: c */
        ArrayList<TimeZoneItemData> mo112523c();
    }
}

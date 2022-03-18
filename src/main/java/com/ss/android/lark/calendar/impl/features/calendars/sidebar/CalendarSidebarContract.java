package com.ss.android.lark.calendar.impl.features.calendars.sidebar;

import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bf\u0018\u0000 \u00022\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract;", "", "Companion", "ICalendarSidebarModel", "ICalendarSidebarView", "IFragmentDependency", "IViewAction", "IViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.c */
public interface CalendarSidebarContract {

    /* renamed from: a */
    public static final Companion f76438a = Companion.f76439a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u0004H&J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0004H&J\u0016\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\nH&J\u0018\u0010!\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0015H&J\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0015H&R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\nX¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR4\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0014j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015`\u0016X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$ICalendarSidebarModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewData;", "blinkCalendarId", "", "getBlinkCalendarId", "()Ljava/lang/String;", "setBlinkCalendarId", "(Ljava/lang/String;)V", "calendars", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendars", "()Ljava/util/List;", "setCalendars", "(Ljava/util/List;)V", "localCalendars", "getLocalCalendars", "setLocalCalendars", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getThirdPartAccountSetting", "()Ljava/util/HashMap;", "setThirdPartAccountSetting", "(Ljava/util/HashMap;)V", "getCalendarById", "calendarId", "updateCalendarErr", "", "updateCalendarSynced", "calendarIds", "updateCalendarVisibility", "visibility", "updateLocalCalendarVisibility", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.c$b */
    public interface ICalendarSidebarModel extends IModelCalendar<IViewData> {
        /* renamed from: a */
        String mo110240a();

        /* renamed from: a */
        void mo110241a(String str);

        /* renamed from: a */
        void mo110242a(String str, boolean z);

        /* renamed from: a */
        void mo110243a(HashMap<String, Boolean> hashMap);

        /* renamed from: a */
        void mo110244a(List<? extends Calendar> list);

        /* renamed from: b */
        Calendar mo110245b(String str);

        /* renamed from: b */
        HashMap<String, Boolean> mo110246b();

        /* renamed from: b */
        void mo110247b(String str, boolean z);

        /* renamed from: b */
        void mo110248b(List<? extends List<? extends Calendar>> list);

        /* renamed from: c */
        void mo110249c(String str);

        /* renamed from: c */
        void mo110250c(List<String> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H&J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$ICalendarSidebarView;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewAction;", "scrollToBlinkCalendar", "", "calendarId", "", "scrollToNewAccount", "newAccount", "setCalendarSynced", "syncedCalendarIds", "", "setUpdateCalendarErr", "syncErrorCalId", "showCalendars", "showLocalCalendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.c$c */
    public interface ICalendarSidebarView extends IViewCalender<IViewData, IViewAction> {
        /* renamed from: a */
        void mo110251a();

        /* renamed from: a */
        void mo110252a(String str);

        /* renamed from: a */
        void mo110253a(List<String> list);

        /* renamed from: b */
        void mo110254b();

        /* renamed from: b */
        void mo110255b(String str);

        /* renamed from: c */
        void mo110256c(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IFragmentDependency;", "", "getContext", "Landroid/content/Context;", "onGotoAccountManagePage", "", "accountItem", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onStartCalendarCreator", "targetCal", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onStartImportActivity", "onStartNewCalendarActivity", "onStartSubscribeActivity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.c$d */
    public interface IFragmentDependency {
        /* renamed from: a */
        void mo110206a();

        /* renamed from: a */
        void mo110207a(AccountDataListItem aVar);

        /* renamed from: a */
        void mo110208a(Calendar calendar);

        /* renamed from: b */
        void mo110209b();

        /* renamed from: c */
        void mo110210c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onClickCalendarSetting", "", "calendarId", "", "onClickCalendarVisibility", "isVisible", "", "onClickLocalCalVisibility", "onGotoAccountManagePage", "accountItem", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onStartImportActivity", "onStartNewCalendarActivity", "onStartSubscribeActivity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.c$e */
    public interface IViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo110219a();

        /* renamed from: a */
        void mo110220a(AccountDataListItem aVar);

        /* renamed from: a */
        void mo110221a(String str);

        /* renamed from: a */
        void mo110222a(String str, boolean z);

        /* renamed from: b */
        void mo110223b();

        /* renamed from: b */
        void mo110224b(String str, boolean z);

        /* renamed from: c */
        void mo110225c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getCalendars", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "getLocalCalendars", "getTopContent", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.c$f */
    public interface IViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        List<DataListItem> mo110257a();

        /* renamed from: b */
        List<DataListItem> mo110258b();

        /* renamed from: c */
        List<DataListItem> mo110259c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$Companion;", "", "()V", "REQUEST_IMPORT_CALENDAR", "", "REQUEST_MANAGE_CALENDAR", "REQUEST_NEW_CALENDAR", "REQUEST_SUBSCRIBE_CALENDAR", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.c$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f76439a = new Companion();

        private Companion() {
        }
    }
}

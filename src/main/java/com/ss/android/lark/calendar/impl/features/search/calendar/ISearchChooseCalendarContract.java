package com.ss.android.lark.calendar.impl.features.search.calendar;

import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract;", "", "ISearchChooseCalendarModel", "ISearchChooseCalendarView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.b */
public interface ISearchChooseCalendarContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0017\u001a\u00020\u00182\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H&R(\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u0018\u0010\u0014\u001a\u00020\fX¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewData;", "calendars", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/ArrayList;", "getCalendars", "()Ljava/util/ArrayList;", "setCalendars", "(Ljava/util/ArrayList;)V", "selectCalendarId", "", "getSelectCalendarId", "()Ljava/lang/String;", "setSelectCalendarId", "(Ljava/lang/String;)V", "selectedCalendarIds", "getSelectedCalendarIds", "setSelectedCalendarIds", "unSelectCalendarId", "getUnSelectCalendarId", "setUnSelectCalendarId", "updateDiffCalendars", "", "newCalendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.b$a */
    public interface ISearchChooseCalendarModel extends IModelCalendar<ISearchChooseCalendarView.IViewData> {
        /* renamed from: a */
        ArrayList<String> mo118074a();

        /* renamed from: a */
        void mo118075a(String str);

        /* renamed from: a */
        void mo118076a(ArrayList<String> arrayList);

        /* renamed from: b */
        void mo118077b(String str);

        /* renamed from: b */
        void mo118078b(ArrayList<Calendar> arrayList);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0006\u0007J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewData;", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewAction;", "showCalendar", "", "IViewAction", "IViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.b$b */
    public interface ISearchChooseCalendarView extends IViewCalender<IViewData, IViewAction> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onBackPressed", "", "onClickSubscribeCalendar", "onItemClicked", "calendarId", "", "isSelected", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.b$b$a */
        public interface IViewAction extends IViewCalender.IViewAction {
            /* renamed from: a */
            void mo118080a();

            /* renamed from: a */
            void mo118081a(String str, boolean z);

            /* renamed from: b */
            void mo118082b();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH&J$\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003`\fH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/ISearchChooseCalendarContract$ISearchChooseCalendarView$IViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getCalendarVisibility", "", "calendarId", "", "getCalendars", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/ArrayList;", "getGoogleAccountSetting", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getSelectedCalendarIds", "", "getSelectedCalendarSize", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.b$b$b */
        public interface IViewData extends IViewCalender.IViewData {
            /* renamed from: a */
            ArrayList<Calendar> mo118083a();

            /* renamed from: a */
            boolean mo118084a(String str);

            /* renamed from: b */
            HashMap<String, Boolean> mo118085b();
        }

        /* renamed from: a */
        void mo118079a();
    }
}

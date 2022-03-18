package com.ss.android.lark.calendar.impl.features.search;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IModelCalendar;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.IViewCalender;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract;", "", "()V", "ICalendarSearchModelApi", "ICalendarSearchViewAction", "ICalendarSearchViewApi", "ICalendarSearchViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.c */
public final class ICalendarSearchContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010/\u001a\u000200H&J\u0010\u00101\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u000102H&J\u001c\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006H&J\b\u00104\u001a\u000205H&J\u001c\u00106\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006H&J\u0018\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H&J\u0012\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H&Jj\u0010<\u001a\u0002092\u001a\u0010=\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00062\u001a\u0010>\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00062\u001a\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00062\f\u0010@\u001a\b\u0012\u0004\u0012\u00020A02H&J\u0016\u0010B\u001a\u0002092\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\f02H&J\u0012\u0010D\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010EH&R(\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\u0018\u0010\u000f\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R4\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00170\u0016j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017`\u0018X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u00020\u0017X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010&\u001a\u00020'X¦\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0018\u0010,\u001a\u00020\u0010X¦\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0012\"\u0004\b.\u0010\u0014¨\u0006F"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchModelApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewData;", "calendarFilterIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getCalendarFilterIds", "()Ljava/util/ArrayList;", "setCalendarFilterIds", "(Ljava/util/ArrayList;)V", "calendars", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendars", "setCalendars", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "googleAccountSetting", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getGoogleAccountSetting", "()Ljava/util/HashMap;", "setGoogleAccountSetting", "(Ljava/util/HashMap;)V", "isCalendarFilterSelected", "()Z", "setCalendarFilterSelected", "(Z)V", "searchKey", "getSearchKey", "()Ljava/lang/String;", "setSearchKey", "(Ljava/lang/String;)V", "searchResult", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "getSearchResult", "()Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "setSearchResult", "(Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;)V", "startTime", "getStartTime", "setStartTime", "getAppendBuildingFragmentData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;", "getAttendeeCalendarIds", "", "getAttendeeIds", "getBuildingFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "getGroupIds", "getResourceCalendarIds", "updateAppendMeetingRoomData", "", "meetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "updateAttendeeDataForSelect", "attendeeIds", "groupIds", "attendeeCalendarIds", "avatarBitmaps", "Landroid/graphics/Bitmap;", "updateDiffCalendars", "newCalendars", "updateMeetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.c$a */
    public interface ICalendarSearchModelApi extends IModelCalendar<ICalendarSearchViewData> {
        /* renamed from: a */
        String mo117992a();

        /* renamed from: a */
        void mo117993a(long j);

        /* renamed from: a */
        void mo117994a(EventMeetingRoomData eventMeetingRoomData);

        /* renamed from: a */
        void mo117995a(SearchCalendarEventResult fVar);

        /* renamed from: a */
        void mo117996a(CalendarEventAttendee calendarEventAttendee);

        /* renamed from: a */
        void mo117997a(String str);

        /* renamed from: a */
        void mo117998a(ArrayList<String> arrayList);

        /* renamed from: a */
        void mo117999a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, List<Bitmap> list);

        /* renamed from: a */
        void mo118000a(HashMap<String, Boolean> hashMap);

        /* renamed from: a */
        void mo118001a(List<? extends Calendar> list);

        /* renamed from: b */
        void mo118004b(long j);

        /* renamed from: b */
        void mo118005b(ArrayList<Calendar> arrayList);

        /* renamed from: c */
        long mo118006c();

        /* renamed from: d */
        long mo118007d();

        /* renamed from: g */
        ArrayList<String> mo118009g();

        /* renamed from: h */
        ArrayList<Calendar> mo118010h();

        /* renamed from: i */
        HashMap<String, Boolean> mo118011i();

        /* renamed from: j */
        ArrayList<String> mo118012j();

        /* renamed from: k */
        ArrayList<String> mo118013k();

        /* renamed from: m */
        List<String> mo118015m();

        /* renamed from: n */
        BuildingFragmentData mo118016n();

        /* renamed from: o */
        ResourceAppendFragmentData mo118017o();

        /* renamed from: p */
        ArrayList<String> mo118018p();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewAction;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewAction;", "onClickAttendeeFilter", "", "onClickBackIv", "onClickCalendarFilter", "containerId", "", "onClickCancelTv", "onClickMeetingRoomFilter", "onClickTimeFilter", "context", "Landroid/content/Context;", "onInputSearchKey", "key", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.c$b */
    public interface ICalendarSearchViewAction extends IViewCalender.IViewAction {
        /* renamed from: a */
        void mo117969a();

        /* renamed from: a */
        void mo117970a(int i);

        /* renamed from: a */
        void mo117971a(Context context);

        /* renamed from: a */
        void mo117972a(String str);

        /* renamed from: b */
        void mo117973b();

        /* renamed from: b */
        void mo117974b(int i);

        /* renamed from: c */
        void mo117975c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewApi;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewData;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewAction;", "clearSearchBarFocus", "", "refreshFilter", "refreshSearchBar", "refreshSearchResultList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.c$c */
    public interface ICalendarSearchViewApi extends IViewCalender<ICalendarSearchViewData, ICalendarSearchViewAction> {
        /* renamed from: a */
        void mo118059a();

        /* renamed from: b */
        void mo118060b();

        /* renamed from: c */
        void mo118061c();

        /* renamed from: d */
        void mo118062d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&J\u0018\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0006H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0012H&¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewData;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/IViewCalender$IViewData;", "getAvatarBitmaps", "", "Landroid/graphics/Bitmap;", "getEndTime", "", "getMeetingRoomFilterStr", "", "getSearchKey", "getSearchResultViewData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/CalendarListViewData;", "Lkotlin/collections/ArrayList;", "getSelectedCalendarCount", "", "getStartTime", "isAttendeeFilterSelected", "", "isCalendarFilterSelected", "isMeetingRoomFilterSelected", "isTimeFilterSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.c$d */
    public interface ICalendarSearchViewData extends IViewCalender.IViewData {
        /* renamed from: a */
        String mo118020a();

        /* renamed from: b */
        ArrayList<CalendarListViewData> mo118021b();

        /* renamed from: c */
        int mo118022c();

        /* renamed from: d */
        boolean mo118023d();

        /* renamed from: e */
        boolean mo118024e();

        /* renamed from: f */
        boolean mo118025f();

        /* renamed from: g */
        String mo118026g();

        /* renamed from: h */
        long mo118027h();

        /* renamed from: i */
        long mo118028i();

        /* renamed from: j */
        boolean mo118029j();

        /* renamed from: k */
        List<Bitmap> mo118030k();
    }
}

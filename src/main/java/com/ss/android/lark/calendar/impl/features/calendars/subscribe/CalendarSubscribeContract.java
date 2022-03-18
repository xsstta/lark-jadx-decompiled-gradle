package com.ss.android.lark.calendar.impl.features.calendars.subscribe;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomFilter;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeBaseData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeCalendarBuildingData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeContactData;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.model.SubscribeMeetingRoomData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract;", "", "()V", "ICalendarSubscribeModel", "ICalendarSubscribeView", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a */
public final class CalendarSubscribeContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005H&JX\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e28\u0010\u000f\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u0010j\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011`\u00130\u0005H&J\u0018\u0010\u0014\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0005H&JD\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00110\u0005H&J4\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00110\u0005H&J8\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010#\u001a\u00020\u00192\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0005H&J\u001e\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020&0\u0005H&J\u001e\u0010'\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0005H&¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeModel;", "Lcom/larksuite/framework/mvp/IModel;", "loadAllBuildings", "", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "loadBatchBuildingMeetingRooms", "chooseBuildings", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "meetingRoomFilter", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "callback", "Ljava/util/HashMap;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "Lkotlin/collections/HashMap;", "loadSubscribeCalendars", "", "searchContactCalendars", SearchIntents.EXTRA_QUERY, "offset", "", "pageSize", "searchMeetingRoom", "searchShareCalendar", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "searchPublicCalendars", "dataCallBack", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "startSearchMeetingRoom", "keyword", "searchTime", "subscribe", "calendarId", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "unsubscribe", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a$a */
    public interface ICalendarSubscribeModel extends IModel {
        /* renamed from: a */
        void mo110361a(IGetDataCallback<Map<String, CalendarBuilding>> iGetDataCallback);

        /* renamed from: a */
        void mo110362a(String str, int i, int i2, IGetDataCallback<ArrayList<SubscribeBaseData>> iGetDataCallback);

        /* renamed from: a */
        void mo110363a(String str, int i, int i2, boolean z, boolean z2, IGetDataCallback<ArrayList<SubscribeContactData>> iGetDataCallback);

        /* renamed from: a */
        void mo110364a(String str, MeetingRoomFilter meetingRoomFilter, int i, IGetDataCallback<ArrayList<SubscribeMeetingRoomData>> iGetDataCallback);

        /* renamed from: a */
        void mo110365a(String str, IGetDataCallback<Calendar> iGetDataCallback);

        /* renamed from: a */
        void mo110366a(List<SubscribeCalendarBuildingData> list, MeetingRoomFilter meetingRoomFilter, IGetDataCallback<HashMap<String, ArrayList<SubscribeMeetingRoomData>>> iGetDataCallback);

        /* renamed from: b */
        void mo110367b(IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        void mo110368b(String str, IGetDataCallback<Boolean> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\u001e\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\u0012\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH&J\u001e\u0010\u0014\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0016\u001a\u00020\rH&J<\u0010\u0017\u001a\u00020\r22\u0010\u0018\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f0\u0019j\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f`\u001aH&J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH&J\u0016\u0010\u001d\u001a\u00020\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH&J\u0016\u0010!\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&J\u0016\u0010\"\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH&J\b\u0010#\u001a\u00020\rH&J\u001e\u0010$\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010%\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fH&J\u0016\u0010&\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH&J\u0010\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\bH&J\u0010\u0010)\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeView$ViewDelegate;", "frameLayoutIsVisible", "", "getCurrentSearchText", "", "getFrameLayoutId", "", "getSubViewSearchText", "viewType", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/SubViewType;", "loadMoreCalendars", "", "calendarList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeContactData;", "loadMoreErr", "loadMoreMeetingRoom", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeMeetingRoomData;", "loadMoreShareCalendars", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "onBackPressed", "showBuildingsMeetingRooms", "buildingsMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "showErr", "showLoading", "showMeetingRoomBuildings", "calendarBuildings", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "showRecommendCalendars", "showRecommendShareCalendars", "showRemindConferenceMeetingRoom", "showSearchCalendars", "showSearchMeetingRoomResult", "showSearchShareCalendars", "updateMeetingRoomSubscribe", "position", "updateViewData", "ViewDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a$b */
    public interface ICalendarSubscribeView extends IView<ViewDelegate> {
        /* renamed from: a */
        int mo110369a();

        /* renamed from: a */
        String mo110370a(SubViewType subViewType);

        /* renamed from: a */
        void mo110371a(int i);

        /* renamed from: a */
        void mo110372a(ArrayList<SubscribeMeetingRoomData> arrayList);

        /* renamed from: a */
        void mo110373a(ArrayList<SubscribeContactData> arrayList, SubViewType subViewType);

        /* renamed from: a */
        void mo110374a(HashMap<String, ArrayList<SubscribeMeetingRoomData>> hashMap);

        /* renamed from: a */
        void mo110375a(List<? extends CalendarBuilding> list);

        /* renamed from: b */
        void mo110376b();

        /* renamed from: b */
        void mo110377b(SubViewType subViewType);

        /* renamed from: b */
        void mo110378b(ArrayList<SubscribeBaseData> arrayList);

        /* renamed from: b */
        void mo110379b(ArrayList<SubscribeContactData> arrayList, SubViewType subViewType);

        /* renamed from: c */
        void mo110380c(SubViewType subViewType);

        /* renamed from: c */
        void mo110381c(ArrayList<SubscribeContactData> arrayList);

        /* renamed from: c */
        void mo110382c(ArrayList<SubscribeBaseData> arrayList, SubViewType subViewType);

        /* renamed from: c */
        boolean mo110383c();

        /* renamed from: d */
        String mo110384d();

        /* renamed from: d */
        void mo110385d(SubViewType subViewType);

        /* renamed from: d */
        void mo110386d(ArrayList<SubscribeBaseData> arrayList);

        /* renamed from: e */
        void mo110387e();

        /* renamed from: e */
        void mo110388e(SubViewType subViewType);

        /* renamed from: e */
        void mo110389e(ArrayList<SubscribeMeetingRoomData> arrayList);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J.\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0011H&J\u001e\u0010\u001a\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0014H&J\b\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/CalendarSubscribeContract$ICalendarSubscribeView$ViewDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onBackPressed", "", "onBuildingExpandRoomsItemClicked", "buildings", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeCalendarBuildingData;", "meetingRoomFilter", "Lcom/bytedance/lark/pb/calendar/v1/MeetingRoomFilter;", "onCalendarSubClicked", "content", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/model/SubscribeBaseData;", "position", "", "onLoadMore", "searchText", "", "pageCount", "viewType", "Lcom/ss/android/lark/calendar/impl/features/calendars/subscribe/SubViewType;", "onMeetingRoomBuildingItemClicked", "chooseCalendarBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "onMeetingRoomInfoClicked", "resourceCalendarId", "onSearchTextChanged", "setCurrentView", "currentViewType", "updateMeetingRoomFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a$b$a */
        public interface ViewDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo110337a();

            /* renamed from: a */
            void mo110338a(SubViewType subViewType);

            /* renamed from: a */
            void mo110339a(SubscribeBaseData bVar, int i);

            /* renamed from: a */
            void mo110340a(CalendarBuilding calendarBuilding);

            /* renamed from: a */
            void mo110341a(String str);

            /* renamed from: a */
            void mo110342a(String str, int i, SubViewType subViewType, MeetingRoomFilter meetingRoomFilter);

            /* renamed from: a */
            void mo110343a(String str, MeetingRoomFilter meetingRoomFilter);

            /* renamed from: a */
            void mo110344a(List<SubscribeCalendarBuildingData> list, MeetingRoomFilter meetingRoomFilter);

            @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.subscribe.a$b$a$a */
            public static final class C30594a {
                /* renamed from: a */
                public static /* synthetic */ void m113702a(ViewDelegate aVar, String str, MeetingRoomFilter meetingRoomFilter, int i, Object obj) {
                    if (obj == null) {
                        if ((i & 2) != 0) {
                            meetingRoomFilter = null;
                        }
                        aVar.mo110343a(str, meetingRoomFilter);
                        return;
                    }
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSearchTextChanged");
                }
            }
        }
    }
}

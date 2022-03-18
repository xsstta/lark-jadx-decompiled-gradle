package com.ss.android.lark.calendar.impl.features.search;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.SearchEventChipViewData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.BuildingFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.meetingroom.append.data.ResourceAppendFragmentData;
import com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract;
import com.ss.android.lark.calendar.impl.framework.calendarmvp.BaseModelCalendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.AbstractC30060b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001SB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010A\u001a\u00020BH\u0016J\u001c\u0010C\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nH\u0016J\u001c\u0010D\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nH\u0016J\b\u0010E\u001a\u00020FH\u0016J\u001c\u0010G\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nH\u0016J\u0018\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0016J\b\u0010I\u001a\u00020\u0002H\u0016J \u0010J\u001a\u0012\u0012\u0004\u0012\u00020;0\bj\b\u0012\u0004\u0012\u00020;`\n2\u0006\u0010K\u001a\u000204H\u0002J\u0012\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010\u0006H\u0016Jj\u0010O\u001a\u00020M2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\u001a\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0016\u0010P\u001a\u00020M2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0016J\u0012\u0010R\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010-H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000RD\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RD\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00150\bj\b\u0012\u0004\u0012\u00020\u0015`\n2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00150\bj\b\u0012\u0004\u0012\u00020\u0015`\n@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR6\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020!0 j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020!`\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00105\u001a\u0002042\u0006\u00103\u001a\u000204@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010:\u001a\u0012\u0012\u0004\u0012\u00020;0\bj\b\u0012\u0004\u0012\u00020;`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0012\"\u0004\b=\u0010\u0014R\u001a\u0010>\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u0010\u001e¨\u0006T"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchModel;", "Lcom/ss/android/lark/calendar/impl/framework/calendarmvp/BaseModelCalendar;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewData;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchModelApi;", "()V", "appendMeetingRoomData", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "attendeeCalendarIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "attendeeIds", "avatarBitmaps", "", "Landroid/graphics/Bitmap;", "values", "calendarFilterIds", "getCalendarFilterIds", "()Ljava/util/ArrayList;", "setCalendarFilterIds", "(Ljava/util/ArrayList;)V", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "calendars", "getCalendars", "setCalendars", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "googleAccountSetting", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getGoogleAccountSetting", "()Ljava/util/HashMap;", "setGoogleAccountSetting", "(Ljava/util/HashMap;)V", "groupIds", "isCalendarFilterSelected", "()Z", "setCalendarFilterSelected", "(Z)V", "meetingRoomData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventMeetingRoomData;", "searchKey", "getSearchKey", "()Ljava/lang/String;", "setSearchKey", "(Ljava/lang/String;)V", "value", "Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "searchResult", "getSearchResult", "()Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;", "setSearchResult", "(Lcom/ss/android/lark/calendar/impl/features/search/SearchCalendarEventResult;)V", "searchResultList", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/CalendarListViewData;", "getSearchResultList", "setSearchResultList", "startTime", "getStartTime", "setStartTime", "getAppendBuildingFragmentData", "Lcom/ss/android/lark/calendar/impl/features/meetingroom/append/data/ResourceAppendFragmentData;", "getAttendeeCalendarIds", "getAttendeeIds", "getBuildingFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/BuildingFragmentData;", "getGroupIds", "getResourceCalendarIds", "getViewData", "parseSearchResult", "result", "updateAppendMeetingRoomData", "", "meetingRoom", "updateAttendeeDataForSelect", "updateDiffCalendars", "newCalendars", "updateMeetingRoomData", "CalendarSearchViewData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.a */
public final class CalendarSearchModel extends BaseModelCalendar<ICalendarSearchContract.ICalendarSearchViewData> implements ICalendarSearchContract.ICalendarSearchModelApi {

    /* renamed from: a */
    public EventMeetingRoomData f82634a;

    /* renamed from: b */
    public ArrayList<String> f82635b;

    /* renamed from: c */
    public ArrayList<String> f82636c;

    /* renamed from: d */
    public List<Bitmap> f82637d;

    /* renamed from: e */
    public CalendarEventAttendee f82638e;

    /* renamed from: f */
    private String f82639f = "";

    /* renamed from: g */
    private ArrayList<CalendarListViewData> f82640g = new ArrayList<>();

    /* renamed from: h */
    private SearchCalendarEventResult f82641h = new SearchCalendarEventResult(null, null, 0, 3, null);

    /* renamed from: i */
    private long f82642i = -1;

    /* renamed from: j */
    private long f82643j = -1;

    /* renamed from: k */
    private boolean f82644k;

    /* renamed from: l */
    private ArrayList<String> f82645l = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<Calendar> f82646m = new ArrayList<>();

    /* renamed from: n */
    private HashMap<String, Boolean> f82647n = new HashMap<>();

    /* renamed from: o */
    private ArrayList<String> f82648o;

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public String mo117992a() {
        return this.f82639f;
    }

    /* renamed from: b */
    public final ArrayList<CalendarListViewData> mo118003b() {
        return this.f82640g;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: c */
    public long mo118006c() {
        return this.f82642i;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: d */
    public long mo118007d() {
        return this.f82643j;
    }

    /* renamed from: e */
    public boolean mo118008e() {
        return this.f82644k;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: g */
    public ArrayList<String> mo118009g() {
        return this.f82645l;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: h */
    public ArrayList<Calendar> mo118010h() {
        return this.f82646m;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: i */
    public HashMap<String, Boolean> mo118011i() {
        return this.f82647n;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: j */
    public ArrayList<String> mo118012j() {
        return this.f82635b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: k */
    public ArrayList<String> mo118013k() {
        return this.f82636c;
    }

    /* renamed from: l */
    public ArrayList<String> mo118015m() {
        return this.f82648o;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchModel$CalendarSearchViewData;", "Lcom/ss/android/lark/calendar/impl/features/search/ICalendarSearchContract$ICalendarSearchViewData;", "(Lcom/ss/android/lark/calendar/impl/features/search/CalendarSearchModel;)V", "getAvatarBitmaps", "", "Landroid/graphics/Bitmap;", "getEndTime", "", "getMeetingRoomFilterStr", "", "getSearchKey", "getSearchResultViewData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/CalendarListViewData;", "Lkotlin/collections/ArrayList;", "getSelectedCalendarCount", "", "getStartTime", "isAttendeeFilterSelected", "", "isCalendarFilterSelected", "isMeetingRoomFilterSelected", "isTimeFilterSelected", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.a$a */
    public final class CalendarSearchViewData implements ICalendarSearchContract.ICalendarSearchViewData {
        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: a */
        public String mo118020a() {
            return CalendarSearchModel.this.mo117992a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: b */
        public ArrayList<CalendarListViewData> mo118021b() {
            return CalendarSearchModel.this.mo118003b();
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: d */
        public boolean mo118023d() {
            return CalendarSearchModel.this.mo118008e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: h */
        public long mo118027h() {
            return CalendarSearchModel.this.mo118006c();
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: i */
        public long mo118028i() {
            return CalendarSearchModel.this.mo118007d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: k */
        public List<Bitmap> mo118030k() {
            return CalendarSearchModel.this.f82637d;
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: c */
        public int mo118022c() {
            return CalendarSearchModel.this.mo118009g().size();
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: e */
        public boolean mo118024e() {
            int i;
            int i2;
            ArrayList<String> arrayList = CalendarSearchModel.this.f82635b;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            ArrayList<String> arrayList2 = CalendarSearchModel.this.f82636c;
            if (arrayList2 != null) {
                i2 = arrayList2.size();
            } else {
                i2 = 0;
            }
            if (i > 0 || i2 > 0) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: f */
        public boolean mo118025f() {
            if (C30022a.f74883b.mo112692F()) {
                if (CalendarSearchModel.this.f82638e != null) {
                    return true;
                }
                return false;
            } else if (CalendarSearchModel.this.f82634a != null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: j */
        public boolean mo118029j() {
            if (CalendarSearchModel.this.mo118006c() == -1 && CalendarSearchModel.this.mo118007d() == -1) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchViewData
        /* renamed from: g */
        public String mo118026g() {
            String mDisplayText$calendar_impl_release;
            String localizedDisplayName;
            if (C30022a.f74883b.mo112692F()) {
                CalendarEventAttendee calendarEventAttendee = CalendarSearchModel.this.f82638e;
                if (calendarEventAttendee != null && (localizedDisplayName = calendarEventAttendee.getLocalizedDisplayName()) != null) {
                    return localizedDisplayName;
                }
                String b = C32634ae.m125182b(R.string.Calendar_EventSearch_Room);
                Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(\n     …alendar_EventSearch_Room)");
                return b;
            }
            EventMeetingRoomData eventMeetingRoomData = CalendarSearchModel.this.f82634a;
            if (eventMeetingRoomData != null && (mDisplayText$calendar_impl_release = eventMeetingRoomData.getMDisplayText$calendar_impl_release()) != null) {
                return mDisplayText$calendar_impl_release;
            }
            String b2 = C32634ae.m125182b(R.string.Calendar_EventSearch_Room);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(\n     …alendar_EventSearch_Room)");
            return b2;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CalendarSearchViewData() {
        }
    }

    /* renamed from: q */
    public ICalendarSearchContract.ICalendarSearchViewData mo109793f() {
        return new CalendarSearchViewData();
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: n */
    public BuildingFragmentData mo118016n() {
        ArrayList arrayList = new ArrayList();
        EventMeetingRoomData eventMeetingRoomData = this.f82634a;
        if (eventMeetingRoomData != null) {
            arrayList.add(eventMeetingRoomData);
        }
        return new BuildingFragmentData(false, arrayList, false, false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: o */
    public ResourceAppendFragmentData mo118017o() {
        List list;
        CalendarEventAttendee calendarEventAttendee = this.f82638e;
        if (calendarEventAttendee == null || (list = CollectionsKt.listOf(calendarEventAttendee)) == null) {
            list = CollectionsKt.emptyList();
        }
        return new ResourceAppendFragmentData(null, null, list, false, false, 3, null);
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: p */
    public ArrayList<String> mo118018p() {
        String mCalendarId$calendar_impl_release;
        String attendeeCalendarId;
        if (C30022a.f74883b.mo112692F()) {
            CalendarEventAttendee calendarEventAttendee = this.f82638e;
            if (calendarEventAttendee == null || (attendeeCalendarId = calendarEventAttendee.getAttendeeCalendarId()) == null) {
                return new ArrayList<>();
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(attendeeCalendarId);
            return arrayList;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        EventMeetingRoomData eventMeetingRoomData = this.f82634a;
        if (!(eventMeetingRoomData == null || (mCalendarId$calendar_impl_release = eventMeetingRoomData.getMCalendarId$calendar_impl_release()) == null)) {
            arrayList2.add(mCalendarId$calendar_impl_release);
        }
        return arrayList2;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public void mo117993a(long j) {
        this.f82642i = j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: b */
    public void mo118004b(long j) {
        this.f82643j = j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public void mo117994a(EventMeetingRoomData eventMeetingRoomData) {
        this.f82634a = eventMeetingRoomData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public void mo117995a(SearchCalendarEventResult fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "value");
        this.f82641h = fVar;
        this.f82640g = m123147b(fVar);
        AbstractC30060b bVar = C30022a.f74882a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public void mo117996a(CalendarEventAttendee calendarEventAttendee) {
        this.f82638e = calendarEventAttendee;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public void mo117997a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f82639f = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: b */
    public void mo118005b(ArrayList<Calendar> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "values");
        this.f82646m.clear();
        this.f82646m.addAll(arrayList);
        mo118009g().clear();
        for (T t : arrayList) {
            if (t.isVisible()) {
                mo118009g().add(t.getServerId());
            }
        }
        mo118002a(CollectionUtils.isNotEmpty(mo118009g()));
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public void mo117998a(ArrayList<String> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "values");
        this.f82645l.clear();
        ArrayList<String> arrayList2 = arrayList;
        this.f82645l.addAll(arrayList2);
        mo118002a(CollectionUtils.isNotEmpty(arrayList2));
    }

    /* renamed from: b */
    private final ArrayList<CalendarListViewData> m123147b(SearchCalendarEventResult fVar) {
        ArrayList<CalendarListViewData> arrayList = new ArrayList<>();
        if (fVar.mo118186a().isEmpty()) {
            return arrayList;
        }
        long c = fVar.mo118186a().get(0).mo118181c();
        long b = fVar.mo118186a().get(0).mo118180b();
        for (T t : fVar.mo118186a()) {
            if (t.mo118180b() < b) {
                b = t.mo118180b();
            }
            if (t.mo118181c() > c) {
                c = t.mo118181c();
            }
        }
        long j = (long) 1000;
        int julianDay = new CalendarDate(new Date(b * j)).getJulianDay();
        int julianDay2 = new CalendarDate(new Date(c * j)).getJulianDay();
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : fVar.mo118186a()) {
            SearchCalendarEventContent dVar = fVar.mo118187b().get(t2.mo118179a());
            if (dVar != null) {
                arrayList2.add(new SearchEventChipViewData(t2, dVar));
            }
        }
        SparseArray sparseArray = new SparseArray();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            SearchEventChipViewData searchEventChipViewData = (SearchEventChipViewData) it.next();
            Intrinsics.checkExpressionValueIsNotNull(searchEventChipViewData, "searchChipViewData");
            ArrayList arrayList3 = (ArrayList) sparseArray.get(searchEventChipViewData.getStartDay());
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                sparseArray.put(searchEventChipViewData.getStartDay(), arrayList3);
            }
            searchEventChipViewData.setEventTotalDays(searchEventChipViewData.instance.mo118183e());
            searchEventChipViewData.setCurrentDay(searchEventChipViewData.instance.mo118182d());
            searchEventChipViewData.setAttachedDay(searchEventChipViewData.getStartDay());
            searchEventChipViewData.setIsNeedForbidMask(true);
            arrayList3.add(searchEventChipViewData);
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            Collections.sort((List) sparseArray.valueAt(i), C32291b.f82650a);
        }
        CalendarDate calendarDate = new CalendarDate();
        if (julianDay <= julianDay2) {
            boolean z = false;
            while (true) {
                CalendarDate calendarDate2 = new CalendarDate();
                calendarDate2.setJulianDay(julianDay);
                List list = (List) sparseArray.get(julianDay);
                if (calendarDate2.getMonthDay() == 1) {
                    z = false;
                }
                if (!z && list != null && (!list.isEmpty())) {
                    arrayList.add(new CalendarListViewData(calendarDate2, 1, calendarDate));
                    z = true;
                }
                if (list != null && (!list.isEmpty())) {
                    boolean z2 = true;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj = ((ArrayList) list).get(i2);
                        Intrinsics.checkExpressionValueIsNotNull(obj, "tempDayEvent[index]");
                        CalendarListViewData calendarListViewData = new CalendarListViewData(calendarDate2, (SearchEventChipViewData) obj, calendarDate);
                        if (z2) {
                            calendarListViewData.setIsDayFirstInstance(true);
                            z2 = false;
                        }
                        if (i2 == list.size() - 1) {
                            calendarListViewData.setIsDayLastInstance(true);
                        }
                        arrayList.add(calendarListViewData);
                    }
                }
                if (julianDay == julianDay2) {
                    break;
                }
                julianDay++;
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public void mo118000a(HashMap<String, Boolean> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "<set-?>");
        this.f82647n = hashMap;
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public void mo118001a(List<? extends Calendar> list) {
        Intrinsics.checkParameterIsNotNull(list, "newCalendars");
        HashSet hashSet = new HashSet();
        List<? extends Calendar> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getServerId());
        }
        for (T t : mo118010h()) {
            if (!hashSet.contains(t.getServerId())) {
                mo118009g().remove(t.getServerId());
            }
        }
        hashSet.clear();
        Iterator<T> it2 = mo118010h().iterator();
        while (it2.hasNext()) {
            hashSet.add(it2.next().getServerId());
        }
        for (T t2 : list2) {
            if (!hashSet.contains(t2.getServerId())) {
                mo118009g().add(t2.getServerId());
            }
        }
        mo118002a(CollectionUtils.isNotEmpty(mo118009g()));
        mo118010h().clear();
        mo118010h().addAll(list);
    }

    /* renamed from: a */
    public void mo118002a(boolean z) {
        this.f82644k = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/SearchEventChipViewData;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.a$b */
    public static final class C32291b<T> implements Comparator<SearchEventChipViewData> {

        /* renamed from: a */
        public static final C32291b f82650a = new C32291b();

        C32291b() {
        }

        /* renamed from: a */
        public final int compare(SearchEventChipViewData searchEventChipViewData, SearchEventChipViewData searchEventChipViewData2) {
            if (searchEventChipViewData == searchEventChipViewData2 || searchEventChipViewData == null || searchEventChipViewData2 == null) {
                return 0;
            }
            if (searchEventChipViewData.isAllDay() && !searchEventChipViewData2.isAllDay()) {
                return -1;
            }
            if (searchEventChipViewData2.isAllDay() && !searchEventChipViewData.isAllDay()) {
                return 1;
            }
            if (searchEventChipViewData.getStartTime() != searchEventChipViewData2.getStartTime()) {
                if (searchEventChipViewData.getStartTime() - searchEventChipViewData2.getStartTime() < 0) {
                    return -1;
                }
                return 1;
            } else if (searchEventChipViewData2.getEndTime() == searchEventChipViewData.getEndTime()) {
                try {
                    return searchEventChipViewData.instance.mo118179a().compareTo(searchEventChipViewData2.instance.mo118179a());
                } catch (Exception e) {
                    C3474b.m14692a(e);
                    return 0;
                }
            } else if (searchEventChipViewData.getEndTime() - searchEventChipViewData2.getEndTime() < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.search.ICalendarSearchContract.ICalendarSearchModelApi
    /* renamed from: a */
    public void mo117999a(ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3, List<Bitmap> list) {
        Intrinsics.checkParameterIsNotNull(list, "avatarBitmaps");
        this.f82635b = arrayList;
        this.f82636c = arrayList2;
        this.f82648o = arrayList3;
        this.f82637d = list;
    }
}

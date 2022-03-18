package com.ss.android.lark.calendar.impl.features.calendars.sidebar;

import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0016\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u0018\u0010$\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0016H\u0016J\u0018\u0010&\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0016H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R6\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016`\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$ICalendarSidebarModel;", "()V", "blinkCalendarId", "", "getBlinkCalendarId", "()Ljava/lang/String;", "setBlinkCalendarId", "(Ljava/lang/String;)V", "calendars", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendars", "()Ljava/util/List;", "setCalendars", "(Ljava/util/List;)V", "localCalendars", "getLocalCalendars", "setLocalCalendars", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getThirdPartAccountSetting", "()Ljava/util/HashMap;", "setThirdPartAccountSetting", "(Ljava/util/HashMap;)V", "getCalendarById", "calendarId", "getViewData", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewData;", "updateCalendarErr", "", "updateCalendarSynced", "calendarIds", "updateCalendarVisibility", "visibility", "updateLocalCalendarVisibility", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.d */
public final class CalendarSidebarModel extends BaseModel implements CalendarSidebarContract.ICalendarSidebarModel {

    /* renamed from: a */
    private String f76440a;

    /* renamed from: b */
    private List<? extends Calendar> f76441b;

    /* renamed from: c */
    private List<? extends List<? extends Calendar>> f76442c;

    /* renamed from: d */
    private HashMap<String, Boolean> f76443d = new HashMap<>();

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: a */
    public String mo110240a() {
        return this.f76440a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: b */
    public HashMap<String, Boolean> mo110246b() {
        return this.f76443d;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar>, java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar> */
    /* renamed from: c */
    public List<Calendar> mo110260c() {
        return this.f76441b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar>>, java.util.List<java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar>> */
    /* renamed from: d */
    public List<List<Calendar>> mo110261d() {
        return this.f76442c;
    }

    /* renamed from: e */
    public CalendarSidebarContract.IViewData mo109793f() {
        return new C30559a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J@\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rH\u0002J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0003H\u0002J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J2\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0002JH\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rH\u0002JH\u0010\u001a\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rH\u0002J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0002¨\u0006\u001d"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarModel$getViewData$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IViewData;", "getCalendars", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "getLocalCalendars", "getParsedCalendars", "calendars", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getParsedLocalCalendars", "localCalendars", "getTopContent", "parseCalendar", "", "myCalendars", "subCalendars", "dataList", "Ljava/util/ArrayList;", "parseExchangeCalendar", "exchangeCalendars", "calendarVisibleMap", "parseGoogleCalendar", "googleCalendars", "sortForVisibility", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.d$a */
    public static final class C30559a implements CalendarSidebarContract.IViewData {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarModel f76444a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewData
        /* renamed from: a */
        public List<DataListItem> mo110257a() {
            ArrayList arrayList = new ArrayList();
            DataListItem dataListItem = new DataListItem();
            dataListItem.mo109807a(DataListItem.TYPE.VIEW_SWITCH);
            arrayList.add(dataListItem);
            return arrayList;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewData
        /* renamed from: b */
        public List<DataListItem> mo110258b() {
            List<Calendar> c = this.f76444a.mo110260c();
            if (c != null) {
                return m113568a(c, this.f76444a.mo110246b());
            }
            return CollectionsKt.emptyList();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IViewData
        /* renamed from: c */
        public List<DataListItem> mo110259c() {
            List<List<Calendar>> d = this.f76444a.mo110261d();
            if (d != null) {
                return m113567a(d);
            }
            return CollectionsKt.emptyList();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30559a(CalendarSidebarModel dVar) {
            this.f76444a = dVar;
        }

        /* renamed from: a */
        private final ArrayList<Calendar> m113566a(ArrayList<Calendar> arrayList) {
            ArrayList<Calendar> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            if (CollectionUtils.isEmpty(arrayList)) {
                return arrayList2;
            }
            arrayList2.add(arrayList.get(0));
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                Calendar calendar = arrayList.get(i);
                Intrinsics.checkExpressionValueIsNotNull(calendar, "calendars[i]");
                Calendar calendar2 = calendar;
                if (calendar2.isVisible()) {
                    arrayList2.add(calendar2);
                } else {
                    arrayList3.add(calendar2);
                }
            }
            arrayList2.addAll(arrayList3);
            return arrayList2;
        }

        /* renamed from: a */
        private final List<DataListItem> m113567a(List<? extends List<? extends Calendar>> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends List<? extends Calendar>> it = list.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                if (!list2.isEmpty()) {
                    DataListItem dataListItem = new DataListItem();
                    dataListItem.mo109807a(DataListItem.TYPE.TITLE);
                    dataListItem.mo109814b(true);
                    dataListItem.mo109813b(((Calendar) list2.get(0)).getLocalName());
                    arrayList.add(dataListItem);
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        DataListItem dataListItem2 = new DataListItem();
                        Calendar calendar = (Calendar) list2.get(i);
                        dataListItem2.mo109808a(calendar);
                        dataListItem2.mo109814b(true);
                        dataListItem2.mo109807a(DataListItem.TYPE.CELL);
                        if (calendar.isVisible()) {
                            arrayList2.add(dataListItem2);
                        } else {
                            arrayList3.add(dataListItem2);
                        }
                    }
                    arrayList.addAll(arrayList2);
                    arrayList.addAll(arrayList3);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private final List<DataListItem> m113568a(List<? extends Calendar> list, HashMap<String, Boolean> hashMap) {
            ArrayList<DataListItem> arrayList = new ArrayList<>();
            ArrayList<Calendar> arrayList2 = new ArrayList<>();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Calendar calendar = (Calendar) list.get(i);
                if (calendar != null) {
                    if (calendar.getType() == Calendar.Type.GOOGLE) {
                        arrayList4.add(calendar);
                    } else if (calendar.getType() == Calendar.Type.EXCHANGE) {
                        arrayList5.add(calendar);
                    } else if (calendar.getSelfAccessRole() == Calendar.AccessRole.OWNER) {
                        arrayList2.add(calendar);
                    } else {
                        arrayList3.add(calendar);
                    }
                }
            }
            m113570a(m113566a(arrayList2), arrayList3, arrayList);
            m113569a(arrayList4, arrayList, hashMap);
            m113571b(arrayList5, arrayList, hashMap);
            return arrayList;
        }

        /* renamed from: b */
        private final void m113571b(List<? extends Calendar> list, ArrayList<DataListItem> arrayList, HashMap<String, Boolean> hashMap) {
            boolean z;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Calendar calendar : list) {
                if (calendar.getExternalAccount() != null) {
                    ArrayList arrayList2 = (ArrayList) linkedHashMap.get(calendar.getExternalAccount());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(arrayList2, "accountCalendarMap[calen…alAccount] ?: ArrayList()");
                    String externalAccount = calendar.getExternalAccount();
                    Intrinsics.checkExpressionValueIsNotNull(externalAccount, "calendar.externalAccount");
                    linkedHashMap.put(externalAccount, arrayList2);
                    arrayList2.add(calendar);
                }
            }
            for (String str : linkedHashMap.keySet()) {
                ArrayList<Calendar> arrayList3 = (ArrayList) linkedHashMap.get(str);
                Boolean bool = hashMap.get(str);
                if (bool == null) {
                    bool = true;
                }
                Intrinsics.checkExpressionValueIsNotNull(bool, "calendarVisibleMap[email] ?: true");
                boolean booleanValue = bool.booleanValue();
                ArrayList<Calendar> arrayList4 = arrayList3;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && booleanValue) {
                    DataListItem dataListItem = new DataListItem();
                    dataListItem.mo109807a(DataListItem.TYPE.TITLE);
                    dataListItem.mo109819e(true);
                    dataListItem.mo109813b(str);
                    arrayList.add(dataListItem);
                    ArrayList<Calendar> a = m113566a(arrayList3);
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        DataListItem dataListItem2 = new DataListItem();
                        dataListItem2.mo109808a(a.get(i));
                        dataListItem2.mo109807a(DataListItem.TYPE.CELL);
                        arrayList.add(dataListItem2);
                    }
                    if (C30022a.f74883b.mo112712t()) {
                        DataListItem dataListItem3 = new DataListItem();
                        dataListItem3.mo109807a(DataListItem.TYPE.ACC_MANAGER);
                        dataListItem3.mo109819e(true);
                        dataListItem3.mo109813b(str);
                        dataListItem3.mo109810a(a);
                        arrayList.add(dataListItem3);
                    }
                }
            }
        }

        /* renamed from: a */
        private final void m113569a(List<? extends Calendar> list, ArrayList<DataListItem> arrayList, HashMap<String, Boolean> hashMap) {
            boolean z;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Calendar calendar : list) {
                if (calendar.getExternalAccount() != null) {
                    ArrayList arrayList2 = (ArrayList) linkedHashMap.get(calendar.getExternalAccount());
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(arrayList2, "accountCalendarMap[calen…alAccount] ?: ArrayList()");
                    String externalAccount = calendar.getExternalAccount();
                    Intrinsics.checkExpressionValueIsNotNull(externalAccount, "calendar.externalAccount");
                    linkedHashMap.put(externalAccount, arrayList2);
                    arrayList2.add(calendar);
                }
            }
            for (String str : linkedHashMap.keySet()) {
                ArrayList<Calendar> arrayList3 = (ArrayList) linkedHashMap.get(str);
                Boolean bool = hashMap.get(str);
                if (bool == null) {
                    bool = true;
                }
                Intrinsics.checkExpressionValueIsNotNull(bool, "calendarVisibleMap[email] ?: true");
                boolean booleanValue = bool.booleanValue();
                ArrayList<Calendar> arrayList4 = arrayList3;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && booleanValue) {
                    DataListItem dataListItem = new DataListItem();
                    dataListItem.mo109807a(DataListItem.TYPE.TITLE);
                    dataListItem.mo109817d(true);
                    dataListItem.mo109813b(str);
                    arrayList.add(dataListItem);
                    ArrayList<Calendar> a = m113566a(arrayList3);
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        DataListItem dataListItem2 = new DataListItem();
                        dataListItem2.mo109808a(a.get(i));
                        dataListItem2.mo109807a(DataListItem.TYPE.CELL);
                        arrayList.add(dataListItem2);
                    }
                    if (C30022a.f74883b.mo112712t()) {
                        DataListItem dataListItem3 = new DataListItem();
                        dataListItem3.mo109807a(DataListItem.TYPE.ACC_MANAGER);
                        dataListItem3.mo109817d(true);
                        dataListItem3.mo109813b(str);
                        dataListItem3.mo109810a(a);
                        arrayList.add(dataListItem3);
                    }
                }
            }
        }

        /* renamed from: a */
        private final void m113570a(List<? extends Calendar> list, List<? extends Calendar> list2, ArrayList<DataListItem> arrayList) {
            DataListItem dataListItem = new DataListItem();
            dataListItem.mo109807a(DataListItem.TYPE.TITLE);
            dataListItem.mo109813b(C32634ae.m125182b(R.string.Calendar_Manage_Managing));
            arrayList.add(dataListItem);
            DataListItem dataListItem2 = new DataListItem();
            dataListItem2.mo109807a(DataListItem.TYPE.ADD_CALENDAR);
            arrayList.add(dataListItem2);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                DataListItem dataListItem3 = new DataListItem();
                dataListItem3.mo109808a((Calendar) list.get(i));
                dataListItem3.mo109809a(this.f76444a.mo110240a());
                dataListItem3.mo109807a(DataListItem.TYPE.CELL);
                arrayList.add(dataListItem3);
            }
            DataListItem dataListItem4 = new DataListItem();
            dataListItem4.mo109807a(DataListItem.TYPE.TITLE);
            dataListItem4.mo109813b(C32634ae.m125182b(R.string.Calendar_Manage_Following));
            dataListItem4.mo109811a(true);
            arrayList.add(dataListItem4);
            DataListItem dataListItem5 = new DataListItem();
            dataListItem5.mo109807a(DataListItem.TYPE.SUBSCRIBE_CALENDAR);
            arrayList.add(dataListItem5);
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                DataListItem dataListItem6 = new DataListItem();
                dataListItem6.mo109808a((Calendar) list2.get(i2));
                dataListItem6.mo109809a(this.f76444a.mo110240a());
                dataListItem6.mo109807a(DataListItem.TYPE.CELL);
                arrayList.add(dataListItem6);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: a */
    public void mo110241a(String str) {
        this.f76440a = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: b */
    public void mo110248b(List<? extends List<? extends Calendar>> list) {
        this.f76442c = list;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: a */
    public void mo110243a(HashMap<String, Boolean> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "<set-?>");
        this.f76443d = hashMap;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: a */
    public void mo110244a(List<? extends Calendar> list) {
        this.f76441b = list;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: b */
    public Calendar mo110245b(String str) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        List<Calendar> c = mo110260c();
        if (c != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : c) {
                if (Intrinsics.areEqual(t.getServerId(), str)) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return null;
        }
        return (Calendar) arrayList.get(0);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: c */
    public void mo110249c(String str) {
        ArrayList<Calendar> arrayList;
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        List<Calendar> c = mo110260c();
        if (c != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : c) {
                if (Intrinsics.areEqual(t.getServerId(), str)) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (Calendar calendar : arrayList) {
                calendar.setIsLoading(false);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: c */
    public void mo110250c(List<String> list) {
        ArrayList<Calendar> arrayList;
        Intrinsics.checkParameterIsNotNull(list, "calendarIds");
        List<Calendar> c = mo110260c();
        if (c != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : c) {
                if (list.contains(t.getServerId())) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (Calendar calendar : arrayList) {
                calendar.setActive(true);
                calendar.setIsLoading(false);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: b */
    public void mo110247b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        List<List<Calendar>> d = mo110261d();
        if (d != null) {
            Iterator<T> it = d.iterator();
            while (it.hasNext()) {
                for (Calendar calendar : it.next()) {
                    if (Intrinsics.areEqual(calendar.getServerId(), str)) {
                        calendar.setIsVisible(z);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.ICalendarSidebarModel
    /* renamed from: a */
    public void mo110242a(String str, boolean z) {
        ArrayList<Calendar> arrayList;
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        List<Calendar> c = mo110260c();
        if (c != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : c) {
                if (Intrinsics.areEqual(t.getServerId(), str)) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            for (Calendar calendar : arrayList) {
                calendar.setIsVisible(z);
            }
        }
    }
}

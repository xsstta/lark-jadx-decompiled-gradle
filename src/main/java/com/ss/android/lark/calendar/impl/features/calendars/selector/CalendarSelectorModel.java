package com.ss.android.lark.calendar.impl.features.calendars.selector;

import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract;
import com.ss.android.lark.calendar.impl.features.calendars.selector.vh.DataListItem;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0016\u0010\"\u001a\u00020!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\u0018\u0010$\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0016H\u0016J\u0018\u0010&\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0016H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R6\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0015j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0016`\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$ICalendarSelectorModel;", "()V", "blinkCalendarId", "", "getBlinkCalendarId", "()Ljava/lang/String;", "setBlinkCalendarId", "(Ljava/lang/String;)V", "calendars", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendars", "()Ljava/util/List;", "setCalendars", "(Ljava/util/List;)V", "localCalendars", "getLocalCalendars", "setLocalCalendars", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getThirdPartAccountSetting", "()Ljava/util/HashMap;", "setThirdPartAccountSetting", "(Ljava/util/HashMap;)V", "getCalendarById", "calendarId", "getViewData", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$IViewData;", "updateCalendarErr", "", "updateCalendarSynced", "calendarIds", "updateCalendarVisibility", "visibility", "updateLocalCalendarVisibility", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.d */
public final class CalendarSelectorModel extends BaseModel implements CalendarSelectorContract.ICalendarSelectorModel {

    /* renamed from: a */
    private List<? extends Calendar> f76139a;

    /* renamed from: b */
    private List<? extends List<? extends Calendar>> f76140b;

    /* renamed from: c */
    private HashMap<String, Boolean> f76141c = new HashMap<>();

    /* renamed from: d */
    private String f76142d;

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: a */
    public HashMap<String, Boolean> mo109754a() {
        return this.f76141c;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: b */
    public String mo109760b() {
        return this.f76142d;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar>, java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar> */
    /* renamed from: c */
    public List<Calendar> mo109790c() {
        return this.f76139a;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<? extends com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar>>, java.util.List<java.util.List<com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar>> */
    /* renamed from: d */
    public List<List<Calendar>> mo109791d() {
        return this.f76140b;
    }

    /* renamed from: e */
    public CalendarSelectorContract.IViewData mo109793f() {
        return new C30413a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J@\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rH\u0002J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0003H\u0002J2\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015H\u0002JH\u0010\u0016\u001a\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\"\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rH\u0002JH\u0010\u0019\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\"\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rH\u0002J\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¨\u0006\u001c"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorModel$getViewData$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/CalendarSelectorContract$IViewData;", "getCalendars", "", "Lcom/ss/android/lark/calendar/impl/features/calendars/selector/vh/DataListItem;", "getLocalCalendars", "getParsedCalendars", "calendars", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getParsedLocalCalendars", "localCalendars", "parseCalendar", "", "myCalendars", "subCalendars", "dataList", "Ljava/util/ArrayList;", "parseExchangeCalendar", "exchangeCalendars", "calendarVisibleMap", "parseGoogleCalendar", "googleCalendars", "sortForVisibility", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.selector.d$a */
    public static final class C30413a implements CalendarSelectorContract.IViewData {

        /* renamed from: a */
        final /* synthetic */ CalendarSelectorModel f76143a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IViewData
        /* renamed from: a */
        public List<DataListItem> mo109776a() {
            List<Calendar> c = this.f76143a.mo109790c();
            if (c != null) {
                return m113070a(c, this.f76143a.mo109754a());
            }
            return CollectionsKt.emptyList();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.IViewData
        /* renamed from: b */
        public List<DataListItem> mo109777b() {
            List<List<Calendar>> d = this.f76143a.mo109791d();
            if (d != null) {
                return m113069a(d);
            }
            return CollectionsKt.emptyList();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30413a(CalendarSelectorModel dVar) {
            this.f76143a = dVar;
        }

        /* renamed from: a */
        private final ArrayList<Calendar> m113068a(ArrayList<Calendar> arrayList) {
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
        private final List<DataListItem> m113069a(List<? extends List<? extends Calendar>> list) {
            boolean z;
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
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dataListItem2.mo109811a(z);
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
        private final List<DataListItem> m113070a(List<? extends Calendar> list, HashMap<String, Boolean> hashMap) {
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
            m113072a(m113068a(arrayList2), arrayList3, arrayList);
            m113071a(arrayList4, arrayList, hashMap);
            m113073b(arrayList5, arrayList, hashMap);
            return arrayList;
        }

        /* renamed from: b */
        private final void m113073b(List<? extends Calendar> list, ArrayList<DataListItem> arrayList, HashMap<String, Boolean> hashMap) {
            boolean z;
            boolean z2;
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
                    ArrayList<Calendar> a = m113068a(arrayList3);
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        DataListItem dataListItem2 = new DataListItem();
                        dataListItem2.mo109808a(a.get(i));
                        dataListItem2.mo109807a(DataListItem.TYPE.CELL);
                        if (i != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        dataListItem2.mo109811a(z2);
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
        private final void m113071a(List<? extends Calendar> list, ArrayList<DataListItem> arrayList, HashMap<String, Boolean> hashMap) {
            boolean z;
            boolean z2;
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
                    ArrayList<Calendar> a = m113068a(arrayList3);
                    int size = a.size();
                    for (int i = 0; i < size; i++) {
                        DataListItem dataListItem2 = new DataListItem();
                        dataListItem2.mo109808a(a.get(i));
                        dataListItem2.mo109807a(DataListItem.TYPE.CELL);
                        if (i != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        dataListItem2.mo109811a(z2);
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
        private final void m113072a(List<? extends Calendar> list, List<? extends Calendar> list2, ArrayList<DataListItem> arrayList) {
            boolean z;
            boolean z2;
            List<? extends Calendar> list3 = list;
            if (!list3.isEmpty()) {
                DataListItem dataListItem = new DataListItem();
                dataListItem.mo109807a(DataListItem.TYPE.TITLE);
                dataListItem.mo109813b(C32634ae.m125182b(R.string.Calendar_Common_MyCalendars));
                arrayList.add(dataListItem);
            }
            int size = list3.size();
            for (int i = 0; i < size; i++) {
                DataListItem dataListItem2 = new DataListItem();
                dataListItem2.mo109808a((Calendar) list.get(i));
                dataListItem2.mo109807a(DataListItem.TYPE.CELL);
                if (i != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dataListItem2.mo109811a(z2);
                dataListItem2.mo109809a(this.f76143a.mo109760b());
                arrayList.add(dataListItem2);
            }
            List<? extends Calendar> list4 = list2;
            if (!list4.isEmpty()) {
                DataListItem dataListItem3 = new DataListItem();
                dataListItem3.mo109807a(DataListItem.TYPE.TITLE);
                dataListItem3.mo109813b(C32634ae.m125182b(R.string.Calendar_Common_SubscribedCalendar));
                arrayList.add(dataListItem3);
            }
            int size2 = list4.size();
            for (int i2 = 0; i2 < size2; i2++) {
                DataListItem dataListItem4 = new DataListItem();
                dataListItem4.mo109808a((Calendar) list2.get(i2));
                dataListItem4.mo109807a(DataListItem.TYPE.CELL);
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                dataListItem4.mo109811a(z);
                dataListItem4.mo109809a(this.f76143a.mo109760b());
                arrayList.add(dataListItem4);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: a */
    public void mo109755a(String str) {
        this.f76142d = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: b */
    public void mo109762b(List<? extends List<? extends Calendar>> list) {
        this.f76140b = list;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: a */
    public void mo109757a(HashMap<String, Boolean> hashMap) {
        Intrinsics.checkParameterIsNotNull(hashMap, "<set-?>");
        this.f76141c = hashMap;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: a */
    public void mo109758a(List<? extends Calendar> list) {
        this.f76139a = list;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: b */
    public Calendar mo109759b(String str) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        List<Calendar> c = mo109790c();
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

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: c */
    public void mo109763c(String str) {
        ArrayList<Calendar> arrayList;
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        List<Calendar> c = mo109790c();
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

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: c */
    public void mo109764c(List<String> list) {
        ArrayList<Calendar> arrayList;
        Intrinsics.checkParameterIsNotNull(list, "calendarIds");
        List<Calendar> c = mo109790c();
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

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: b */
    public void mo109761b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        List<List<Calendar>> d = mo109791d();
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

    @Override // com.ss.android.lark.calendar.impl.features.calendars.selector.CalendarSelectorContract.ICalendarSelectorModel
    /* renamed from: a */
    public void mo109756a(String str, boolean z) {
        ArrayList<Calendar> arrayList;
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        List<Calendar> c = mo109790c();
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

package com.ss.android.lark.calendar.impl.features.arrange.p1441a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.ArrangeInstancesLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstanceUnit;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.DayInstancesSlotMetric;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceSlotMetric;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.a.e */
public class C30096e implements IGetDataCallback<CalendarEventInstanceUnit> {

    /* renamed from: a */
    public ArrangeBaseModel f75043a;

    /* renamed from: b */
    ArrayList<EventChipViewData> f75044b;

    /* renamed from: c */
    public int f75045c;

    /* renamed from: d */
    private int f75046d;

    /* renamed from: e */
    private int f75047e;

    /* renamed from: f */
    private String f75048f;

    /* renamed from: g */
    private String f75049g;

    /* renamed from: h */
    private long f75050h;

    /* renamed from: i */
    private OnLoadEventInstances f75051i;

    /* renamed from: j */
    private Map<String, String> f75052j;

    /* renamed from: k */
    private Map<String, CalendarWorkHourSetting> f75053k;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.a.e$a */
    public interface AbstractC30097a<K, T> {
        /* renamed from: a */
        boolean mo108503a(K k, T t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.a.e$b */
    public interface AbstractC30098b {
        /* renamed from: a */
        HashMap<String, ArrayList<DayEventChipViewData>> mo108504a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.a.e$c */
    public class C30099c implements AbstractC30098b {
        C30099c() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.p1441a.C30096e.AbstractC30098b
        /* renamed from: a */
        public HashMap<String, ArrayList<DayEventChipViewData>> mo108504a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
            List<ArrangeInstancesLayout> b = m111393b(hashMap);
            if (b == null) {
                return null;
            }
            HashMap<String, ArrayList<DayEventChipViewData>> hashMap2 = new HashMap<>();
            for (String str : hashMap.keySet()) {
                hashMap2.put(str, m111392a(str, hashMap.get(str), b));
            }
            return hashMap2;
        }

        /* renamed from: b */
        private List<ArrangeInstancesLayout> m111393b(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (String str : hashMap.keySet()) {
                ArrayList arrayList3 = new ArrayList();
                DayInstancesSlotMetric dayInstancesSlotMetric = new DayInstancesSlotMetric();
                for (DayEventChipViewData dayEventChipViewData : hashMap.get(str)) {
                    arrayList3.add(new InstanceSlotMetric().setId(dayEventChipViewData.getId()).setStartDay(dayEventChipViewData.getStartDay()).setEndDay(dayEventChipViewData.getEndDay()).setStartMinute(dayEventChipViewData.getStartMinute()).setEndMinute(dayEventChipViewData.getEndMinute()).setStartTime(dayEventChipViewData.getStartTime()).setEndTime(dayEventChipViewData.getEndTime()));
                }
                dayInstancesSlotMetric.setLayoutDay(C30096e.this.f75045c);
                dayInstancesSlotMetric.setInstanceSlotMetrics(arrayList3);
                arrayList2.clear();
                arrayList2.add(dayInstancesSlotMetric);
                List<DayInstancesLayout> b = C30096e.this.f75043a.mo108477b((List<? extends DayInstancesSlotMetric>) arrayList2);
                if (b.size() > 0) {
                    ArrangeInstancesLayout aVar = new ArrangeInstancesLayout();
                    aVar.mo108989a(str);
                    aVar.mo108988a(b.get(0));
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private ArrayList<DayEventChipViewData> m111392a(String str, ArrayList<DayEventChipViewData> arrayList, List<ArrangeInstancesLayout> list) {
            C301001 r0 = new AbstractC30097a<String, ArrangeInstancesLayout>() {
                /* class com.ss.android.lark.calendar.impl.features.arrange.p1441a.C30096e.C30099c.C301001 */

                /* renamed from: a */
                public boolean mo108503a(String str, ArrangeInstancesLayout aVar) {
                    return str.equals(aVar.f75459a);
                }
            };
            C301012 r1 = new AbstractC30097a<String, DayEventChipViewData>() {
                /* class com.ss.android.lark.calendar.impl.features.arrange.p1441a.C30096e.C30099c.C301012 */

                /* renamed from: a */
                public boolean mo108503a(String str, DayEventChipViewData dayEventChipViewData) {
                    return str.equals(dayEventChipViewData.getId());
                }
            };
            ArrayList<DayEventChipViewData> arrayList2 = new ArrayList<>();
            for (InstanceLayout instanceLayout : ((ArrangeInstancesLayout) C30096e.this.mo108500a(str, list, r0)).mo108987a().getInstanceLayouts()) {
                DayEventChipViewData dayEventChipViewData = (DayEventChipViewData) C30096e.this.mo108500a(instanceLayout.getId(), arrayList, r1);
                if (dayEventChipViewData != null) {
                    dayEventChipViewData.setLayout(instanceLayout);
                    arrayList2.add(dayEventChipViewData);
                }
            }
            return arrayList2;
        }
    }

    /* renamed from: a */
    private HashMap<String, ArrayList<DayEventChipViewData>> m111382a(HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
        return new C30099c().mo108504a(hashMap);
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        this.f75043a.mo108476a(true);
        this.f75051i.mo108498a(errorResult);
    }

    /* renamed from: b */
    private boolean m111386b(CalendarEventInstance calendarEventInstance) {
        long endTime = calendarEventInstance.getEndTime() - calendarEventInstance.getStartTime();
        if (calendarEventInstance.getDisplayType() == CalendarEvent.DisplayType.LIMITED && endTime == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m111385a(CalendarEventInstance calendarEventInstance) {
        boolean z;
        if (calendarEventInstance.isFree() || calendarEventInstance.getSelfAttendeeStatus() == CalendarEventAttendee.Status.REMOVED || calendarEventInstance.getSelfAttendeeStatus() == CalendarEventAttendee.Status.DECLINE) {
            z = false;
        } else {
            z = true;
        }
        if (this.f75048f.equals("null") && this.f75049g.equals("null") && this.f75050h == -1) {
            return z;
        }
        if (!z || calendarEventInstance.getEventServerId().equals(this.f75049g) || (calendarEventInstance.getKey().equals(this.f75048f) && calendarEventInstance.getOriginalTime() == this.f75050h)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void onSuccess(CalendarEventInstanceUnit calendarEventInstanceUnit) {
        this.f75052j = calendarEventInstanceUnit.getMCalendarTimezone();
        this.f75053k = calendarEventInstanceUnit.getMWorkHourSettings();
        List<CalendarEventInstance> mCalendarEventInstance = calendarEventInstanceUnit.getMCalendarEventInstance();
        int i = 0;
        for (CalendarEventInstance calendarEventInstance : mCalendarEventInstance) {
            calendarEventInstance.setId(String.valueOf(i));
            if (calendarEventInstance.getCalendarLocation() == null) {
                calendarEventInstance.setCalendarLocation(new CalendarLocation());
            }
            i++;
        }
        ArrayList<EventChipViewData> arrayList = new ArrayList<>();
        this.f75044b = arrayList;
        m111384a(mCalendarEventInstance, arrayList);
        mo108502a(this.f75044b);
    }

    /* renamed from: a */
    public void mo108502a(ArrayList<EventChipViewData> arrayList) {
        ArrayList<EventChipViewData> arrayList2 = new ArrayList<>();
        Iterator<EventChipViewData> it = arrayList.iterator();
        while (it.hasNext()) {
            EventChipViewData next = it.next();
            if (!next.getKey().startsWith("sync_from_lark_")) {
                arrayList2.add(next);
            }
        }
        Collections.sort(arrayList2);
        HashMap<String, ArrayList<DayEventChipViewData>> hashMap = new HashMap<>();
        m111383a(arrayList2, hashMap);
        HashMap<String, ArrayList<DayEventChipViewData>> a = m111382a(hashMap);
        this.f75043a.mo108482b(a);
        this.f75043a.mo108476a(false);
        this.f75043a.mo108474a(this.f75052j);
        this.f75043a.mo108483b(this.f75053k);
        this.f75051i.mo108499a(a);
    }

    /* renamed from: a */
    private void m111384a(List<CalendarEventInstance> list, List<EventChipViewData> list2) {
        for (CalendarEventInstance calendarEventInstance : list) {
            if (m111385a(calendarEventInstance) && !m111386b(calendarEventInstance)) {
                EventChipViewData eventChipViewData = new EventChipViewData(calendarEventInstance);
                eventChipViewData.setIsTitleShowCalendarName(false);
                list2.add(eventChipViewData);
            }
        }
    }

    /* renamed from: a */
    private void m111383a(ArrayList<EventChipViewData> arrayList, HashMap<String, ArrayList<DayEventChipViewData>> hashMap) {
        Iterator<EventChipViewData> it = arrayList.iterator();
        while (it.hasNext()) {
            EventChipViewData next = it.next();
            int startDay = next.getStartDay();
            int endDay = next.getEndDay();
            int max = Math.max(this.f75046d, startDay);
            int min = Math.min(this.f75047e, endDay);
            if (max <= this.f75047e && min >= this.f75046d) {
                DayEventChipViewData dayEventChipViewData = new DayEventChipViewData(next);
                dayEventChipViewData.setIsSupportDrag(false);
                String c = C30810k.m114955a().mo111644c();
                String calendarId = next.getCalendarId();
                dayEventChipViewData.setIsNeedForbidMask(true);
                if (!c.equals(calendarId) && !this.f75043a.mo108472G().equals(calendarId)) {
                    dayEventChipViewData.setGrayAttributes();
                }
                if (hashMap.containsKey(calendarId)) {
                    hashMap.get(calendarId).add(dayEventChipViewData);
                } else {
                    ArrayList<DayEventChipViewData> arrayList2 = new ArrayList<>();
                    arrayList2.add(dayEventChipViewData);
                    hashMap.put(calendarId, arrayList2);
                }
            }
        }
    }

    /* renamed from: a */
    public <K, T> T mo108500a(K k, Iterable<T> iterable, AbstractC30097a<K, T> aVar) {
        for (T t : iterable) {
            if (aVar.mo108503a(k, t)) {
                return t;
            }
        }
        return null;
    }

    public C30096e(ArrangeBaseModel aVar, int i, int i2, String str, String str2, long j, OnLoadEventInstances cVar) {
        this.f75043a = aVar;
        this.f75046d = i;
        this.f75047e = i2;
        this.f75051i = cVar;
        this.f75045c = i;
        this.f75048f = str;
        this.f75049g = str2;
        this.f75050h = j;
    }
}

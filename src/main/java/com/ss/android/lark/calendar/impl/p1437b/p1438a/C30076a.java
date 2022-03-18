package com.ss.android.lark.calendar.impl.p1437b.p1438a;

import android.text.TextUtils;
import com.bytedance.article.common.monitor.stack.C3474b;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.impl.b.a.a */
public class C30076a {

    /* renamed from: a */
    public HashMap<String, Calendar> f74985a;

    /* renamed from: b */
    public List<Calendar> f74986b;

    /* renamed from: c */
    private HashMap<String, String> f74987c;

    /* renamed from: d */
    private AbstractC32595g f74988d;

    /* renamed from: e */
    private List<AbstractC30081a> f74989e;

    /* renamed from: f */
    private volatile boolean f74990f;

    /* renamed from: g */
    private String f74991g;

    /* renamed from: com.ss.android.lark.calendar.impl.b.a.a$a */
    public interface AbstractC30081a {
        /* renamed from: a */
        void mo108441a(List<Calendar> list);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.b.a.a$b */
    public interface AbstractC30082b {
        void onLoadSucceed(Calendar calendar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.b.a.a$c */
    public static class C30083c {

        /* renamed from: a */
        public static final C30076a f75002a = new C30076a();
    }

    /* renamed from: a */
    public static C30076a m111290a() {
        return C30083c.f75002a;
    }

    /* renamed from: d */
    public List<Calendar> mo108434d() {
        return this.f74986b;
    }

    /* renamed from: b */
    public synchronized void mo108429b() {
        this.f74985a.clear();
        this.f74986b = null;
        this.f74991g = null;
    }

    private C30076a() {
        this.f74985a = new HashMap<>();
        this.f74987c = new HashMap<>();
        this.f74989e = new ArrayList();
        this.f74988d = C32583e.m124816a();
    }

    /* renamed from: c */
    public void mo108431c() {
        final String l = Long.toString(new Date().getTime());
        Log.m165389i("CalendarServiceModel", C32673y.m125376b(l, "loadAllCalendars", new String[0]));
        this.f74988d.mo119034a(new C30084d(new IGetDataCallback<List<Calendar>>("loadAllCalendars") {
            /* class com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a.C300771 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("CalendarServiceModel", C32673y.m125370a(l, "loadAllCalendars", errorResult));
            }

            /* renamed from: a */
            public void onSuccess(List<Calendar> list) {
                String str;
                if (list == null) {
                    str = "null";
                } else {
                    str = String.valueOf(list.size());
                }
                Log.m165389i("CalendarServiceModel", C32673y.m125373a(l, "loadAllCalendars", "calendars_size", str));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.b.a.a$d */
    public class C30084d implements IGetDataCallback<Map<String, Calendar>> {

        /* renamed from: a */
        protected IGetDataCallback<List<Calendar>> f75003a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            IGetDataCallback<List<Calendar>> iGetDataCallback = this.f75003a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo108443a(List<Calendar> list) {
            C30076a.this.mo108426a(list);
            IGetDataCallback<List<Calendar>> iGetDataCallback = this.f75003a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(list);
            }
        }

        /* renamed from: a */
        public void onSuccess(Map<String, Calendar> map) {
            ArrayList arrayList = new ArrayList();
            for (String str : map.keySet()) {
                arrayList.add(map.get(str));
            }
            mo108443a(arrayList);
        }

        public C30084d(IGetDataCallback<List<Calendar>> iGetDataCallback) {
            this.f75003a = iGetDataCallback;
        }
    }

    /* renamed from: a */
    public void mo108427a(boolean z) {
        this.f74990f = z;
    }

    /* renamed from: a */
    public synchronized String mo108421a(String str) {
        return this.f74987c.get(str);
    }

    /* renamed from: c */
    public synchronized void mo108433c(String str) {
        this.f74985a.remove(str);
    }

    /* renamed from: com.ss.android.lark.calendar.impl.b.a.a$e */
    private class C30085e extends C30084d {
        @Override // com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a.C30084d
        /* renamed from: a */
        public void onSuccess(Map<String, Calendar> map) {
            ArrayList arrayList = new ArrayList();
            List<Calendar> a = C30076a.this.mo108422a(map, arrayList);
            C30076a.this.mo108426a(arrayList);
            if (this.f75003a != null) {
                C30076a.this.f74986b = a;
                this.f75003a.onSuccess(a);
            }
        }

        public C30085e(IGetDataCallback<List<Calendar>> iGetDataCallback) {
            super(iGetDataCallback);
        }
    }

    /* renamed from: b */
    public void mo108430b(IGetDataCallback<List<Calendar>> iGetDataCallback) {
        this.f74988d.mo119034a(new C30085e(iGetDataCallback));
    }

    /* renamed from: a */
    private boolean m111291a(Calendar calendar) {
        if (calendar == null) {
            return true;
        }
        if ((calendar.getType() == Calendar.Type.GOOGLE || calendar.getType() == Calendar.Type.EXCHANGE) && !calendar.isPrimary() && !calendar.isUserIdInValid() && !calendar.isOwnerCalendar()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public synchronized Calendar mo108428b(String str) {
        Calendar calendar;
        calendar = this.f74985a.get(str);
        if (calendar == null) {
            Log.m165389i("CalendarServiceModel", C32673y.m125378d("serverId = " + str + "; mCalendarCache.size = " + this.f74985a.size()));
        }
        return calendar;
    }

    /* renamed from: d */
    private String m111292d(String str) {
        for (Map.Entry<String, Calendar> entry : this.f74985a.entrySet()) {
            Calendar value = entry.getValue();
            if (value.getUserId().equals(str) && Calendar.Type.PRIMARY.equals(value.getType())) {
                return value.getNoteOrLocalizeSummary();
            }
        }
        boolean isNotEmpty = CollectionUtils.isNotEmpty(this.f74985a);
        C3474b.m14696a(isNotEmpty, "userId=" + str);
        return null;
    }

    /* renamed from: e */
    private Calendar m111293e(String str) {
        for (Map.Entry<String, Calendar> entry : this.f74985a.entrySet()) {
            Calendar value = entry.getValue();
            if (value.getUserId().equals(str) && value.isGoogleCalendar() && value.getSelfAccessRole() != Calendar.AccessRole.OWNER) {
                return value;
            }
        }
        boolean isNotEmpty = CollectionUtils.isNotEmpty(this.f74985a);
        C3474b.m14696a(isNotEmpty, "userId=" + str);
        return null;
    }

    /* renamed from: c */
    public synchronized void mo108432c(IGetDataCallback<List<Calendar>> iGetDataCallback) {
        if (this.f74985a.size() != 0) {
            if (this.f74990f) {
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(mo108422a(this.f74985a, new ArrayList()));
                }
            }
        }
        this.f74988d.mo119034a(new C30085e(iGetDataCallback));
    }

    /* renamed from: a */
    public synchronized void mo108423a(IGetDataCallback<List<Calendar>> iGetDataCallback) {
        if (this.f74985a.size() != 0) {
            if (this.f74990f) {
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(new ArrayList(this.f74985a.values()));
                }
            }
        }
        this.f74988d.mo119034a(new C30084d(iGetDataCallback));
    }

    /* renamed from: a */
    public synchronized void mo108426a(List<Calendar> list) {
        this.f74985a.clear();
        for (int i = 0; i < list.size(); i++) {
            Calendar calendar = list.get(i);
            this.f74985a.put(calendar.getServerId(), calendar);
        }
        for (Calendar calendar2 : list) {
            if (calendar2.isGoogleCalendar()) {
                this.f74987c.put(calendar2.getServerId(), m111292d(calendar2.getUserId()));
            } else {
                this.f74987c.put(calendar2.getServerId(), calendar2.getNoteOrLocalizeSummary());
            }
            if (calendar2.isRealPrimary()) {
                this.f74991g = calendar2.getServerId();
            }
        }
        if (CollectionUtils.isNotEmpty(this.f74989e)) {
            List<Calendar> a = mo108422a(this.f74985a, new ArrayList());
            for (AbstractC30081a aVar : this.f74989e) {
                aVar.mo108441a(a);
            }
        }
    }

    /* renamed from: a */
    public List<Calendar> mo108422a(Map<String, Calendar> map, List<Calendar> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Calendar calendar = null;
        for (String str : map.keySet()) {
            Calendar calendar2 = map.get(str);
            list.add(calendar2);
            boolean a = m111291a(calendar2);
            if (calendar2.isPrimary() && calendar2.getType() == Calendar.Type.PRIMARY) {
                calendar = calendar2;
            } else if (calendar2.isOwnerCalendar()) {
                if (!a) {
                    arrayList2.add(calendar2);
                }
            } else if (!a) {
                arrayList.add(calendar2);
            }
        }
        Collections.sort(arrayList2, new Comparator<Calendar>() {
            /* class com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a.C300793 */

            /* renamed from: a */
            public int compare(Calendar calendar, Calendar calendar2) {
                return calendar2.getWeight() - calendar.getWeight();
            }
        });
        Collections.sort(arrayList, new Comparator<Calendar>() {
            /* class com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a.C300804 */

            /* renamed from: a */
            public int compare(Calendar calendar, Calendar calendar2) {
                return calendar2.getWeight() - calendar.getWeight();
            }
        });
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.addAll(arrayList);
        if (calendar != null) {
            arrayList3.add(0, calendar);
        }
        return arrayList3;
    }

    /* renamed from: a */
    public synchronized void mo108424a(final String str, CallbackManager callbackManager, final AbstractC30082b bVar) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f74985a.size() == 0 || !this.f74990f) {
                final String l = Long.toString(new Date().getTime());
                Log.m165389i("CalendarServiceModel", C32673y.m125376b(l, "getCalendar", new String[0]));
                IGetDataCallback r0 = new IGetDataCallback<List<Calendar>>("getCalendar") {
                    /* class com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a.C300782 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("CalendarServiceModel", C32673y.m125370a(l, "getCalendar", errorResult));
                        AbstractC30082b bVar = bVar;
                        if (bVar != null) {
                            bVar.onLoadSucceed(null);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(List<Calendar> list) {
                        String str;
                        String str2 = l;
                        String str3 = "getCalendar";
                        String[] strArr = new String[2];
                        strArr[0] = "calendars_size";
                        if (list == null) {
                            str = "null";
                        } else {
                            str = String.valueOf(list.size());
                        }
                        strArr[1] = str;
                        Log.m165389i("CalendarServiceModel", C32673y.m125373a(str2, str3, strArr));
                        if (bVar != null) {
                            bVar.onLoadSucceed(C30076a.this.f74985a.get(str));
                        }
                    }
                };
                if (callbackManager != null) {
                    r0 = callbackManager.wrapAndAddGetDataCallback(r0);
                }
                this.f74988d.mo119034a(new C30084d(r0));
            } else {
                Calendar calendar = this.f74985a.get(str);
                if (bVar != null) {
                    bVar.onLoadSucceed(calendar);
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo108425a(String str, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
        Calendar e;
        boolean isNotEmpty = CollectionUtils.isNotEmpty(this.f74985a);
        C3474b.m14696a(isNotEmpty, "calendarId=" + str);
        Calendar calendar = this.f74985a.get(str);
        if (calendar != null) {
            if (calendar.getType() == Calendar.Type.PRIMARY && (e = m111293e(calendar.getUserId())) != null) {
                e.setIsVisible(z);
            }
            calendar.setIsVisible(z);
            this.f74988d.mo119037a(str, z, iGetDataCallback);
        }
    }
}

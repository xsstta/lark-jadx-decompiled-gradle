package com.ss.android.lark.opmonitor.config;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.opmonitor.config.f */
public class C48914f {

    /* renamed from: a */
    private double f122865a = 1.0d;

    /* renamed from: b */
    private double f122866b;

    /* renamed from: c */
    private double f122867c = 1.0d;

    /* renamed from: d */
    private double f122868d = 1.0d;

    /* renamed from: e */
    private double f122869e = 1.0d;

    /* renamed from: f */
    private double f122870f = 1.0d;

    /* renamed from: g */
    private ArrayList<C48912d> f122871g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.opmonitor.config.f$2 */
    public static /* synthetic */ class C489162 {

        /* renamed from: a */
        static final /* synthetic */ int[] f122873a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.opmonitor.model.OPMonitorLevel[] r0 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.opmonitor.config.C48914f.C489162.f122873a = r0
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.FATAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.opmonitor.config.C48914f.C489162.f122873a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.opmonitor.config.C48914f.C489162.f122873a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.opmonitor.config.C48914f.C489162.f122873a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.NORMAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.opmonitor.config.C48914f.C489162.f122873a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.opmonitor.model.OPMonitorLevel r1 = com.ss.android.lark.opmonitor.model.OPMonitorLevel.TRACE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.opmonitor.config.C48914f.C489162.<clinit>():void");
        }
    }

    /* renamed from: c */
    private ArrayList<String> m192700c(JSONArray jSONArray) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.optString(i));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private C48912d m192698b(HashMap<String, Object> hashMap) {
        ArrayList<C48912d> arrayList = this.f122871g;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<C48912d> it = this.f122871g.iterator();
            while (it.hasNext()) {
                C48912d next = it.next();
                if (next.mo170770a(hashMap)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private ArrayList<C48912d> m192697a(JSONArray jSONArray) {
        ArrayList<C48912d> arrayList = new ArrayList<>();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                C48912d dVar = new C48912d();
                dVar.f122860a = optJSONObject.optInt("priority");
                dVar.f122861b = optJSONObject.optDouble("sample_rate", 0.0d);
                dVar.f122862c = m192699b(optJSONObject.optJSONArray("filters"));
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private ArrayList<C48913e> m192699b(JSONArray jSONArray) {
        ArrayList<C48913e> arrayList = new ArrayList<>();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                C48913e eVar = new C48913e();
                eVar.f122863a = optJSONObject.optString("key");
                eVar.f122864b = m192700c(optJSONObject.optJSONArray("values"));
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized float mo170772a(HashMap<String, Object> hashMap) {
        OPMonitorLevel oPMonitorLevel;
        C48912d b = m192698b(hashMap);
        float f = 1.0f;
        if (b != null) {
            if (b.f122861b < 1.0d) {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            return f;
        }
        Object obj = hashMap.get("monitor_level");
        if (obj instanceof OPMonitorLevel) {
            oPMonitorLevel = (OPMonitorLevel) obj;
        } else if (obj instanceof Integer) {
            oPMonitorLevel = OPMonitorLevel.forNumber(((Integer) obj).intValue());
        } else {
            oPMonitorLevel = null;
        }
        double d = this.f122865a;
        if (oPMonitorLevel != null) {
            int i = C489162.f122873a[oPMonitorLevel.ordinal()];
            if (i == 1) {
                d = this.f122870f;
            } else if (i == 2) {
                d = this.f122869e;
            } else if (i == 3) {
                d = this.f122868d;
            } else if (i == 4) {
                d = this.f122867c;
            } else if (i == 5) {
                d = this.f122866b;
            }
        }
        if (d < 1.0d) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        return f;
    }

    /* renamed from: a */
    public synchronized void mo170773a(JSONObject jSONObject) {
        this.f122865a = jSONObject.optDouble("sample_rate", 1.0d);
        this.f122866b = jSONObject.optDouble("trace_sample_rate", 0.0d);
        this.f122867c = jSONObject.optDouble("normal_sample_rate", 1.0d);
        this.f122868d = jSONObject.optDouble("warn_sample_rate", 1.0d);
        this.f122869e = jSONObject.optDouble("error_sample_rate", 1.0d);
        this.f122870f = jSONObject.optDouble("fatal_sample_rate", 1.0d);
        ArrayList<C48912d> a = m192697a(jSONObject.optJSONArray("rules"));
        this.f122871g = a;
        Collections.sort(a, new Comparator<C48912d>() {
            /* class com.ss.android.lark.opmonitor.config.C48914f.C489151 */

            /* renamed from: a */
            public int compare(C48912d dVar, C48912d dVar2) {
                return Integer.compare(dVar2.f122860a, dVar.f122860a);
            }
        });
    }
}

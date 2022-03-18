package com.ss.android.lark.calendar.impl.features.local;

import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.calendar.impl.features.local.h */
public class C31934h {

    /* renamed from: a */
    private static String f81576a = "calendar_local_cal_acc";

    /* renamed from: b */
    private static String f81577b = "calendar_local_calendar";

    /* renamed from: c */
    private static Map<String, Boolean> f81578c;

    /* renamed from: d */
    private static Map<String, Boolean> f81579d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.local.h$a */
    public static class C31936a {

        /* renamed from: a */
        public static final C31934h f81580a = new C31934h();
    }

    /* renamed from: a */
    public static C31934h m121506a() {
        return C31936a.f81580a;
    }

    /* renamed from: c */
    public Map<String, Boolean> mo116563c() {
        return f81578c;
    }

    private C31934h() {
        mo116561b();
    }

    /* renamed from: b */
    public void mo116561b() {
        f81578c = m121508c(f81576a);
        f81579d = m121508c(f81577b);
        List<List<Calendar>> c = C31927d.m121459a().mo116550c();
        if (!(c == null || c.size() == 0)) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < c.size(); i++) {
                List<Calendar> list = c.get(i);
                String localName = list.get(0).getLocalName();
                if (localName != null) {
                    if (f81578c.get(localName) == null) {
                        f81578c.put(localName, false);
                        z = true;
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        String a = mo116558a(list.get(i2));
                        if (a != null && f81579d.get(a) == null) {
                            f81579d.put(a, true);
                            z2 = true;
                        }
                    }
                }
            }
            if (z) {
                m121507a(f81576a, f81578c);
            }
            if (z2) {
                m121507a(f81577b, f81579d);
            }
        }
    }

    /* renamed from: a */
    public Boolean mo116557a(String str) {
        if (str == null) {
            return false;
        }
        if (f81578c.get(str) == null) {
            f81578c.put(str, false);
        }
        return f81578c.get(str);
    }

    /* renamed from: a */
    public String mo116558a(Calendar calendar) {
        if (calendar.getServerId() != null) {
            return calendar.getServerId();
        }
        return calendar.getLocalName() + "_" + calendar.getNoteOrLocalizeSummary();
    }

    /* renamed from: b */
    public Boolean mo116560b(String str) {
        if (str == null) {
            return false;
        }
        if (f81579d.get(str) == null) {
            f81579d.put(str, true);
        }
        return f81579d.get(str);
    }

    /* renamed from: c */
    private Map<String, Boolean> m121508c(String str) {
        HashMap hashMap = new HashMap();
        String b = C30022a.f74882a.spDependency().mo108181b(str, "invalid_data_V1.19.0");
        if ("invalid_data_V1.19.0".equals(b) && (b = C30022a.f74882a.spDependency().mo108183c(str, "")) != null) {
            C30022a.f74882a.spDependency().mo108179a(str, b);
        }
        if (!TextUtils.isEmpty(b)) {
            try {
                JSONObject jSONObject = new JSONObject(b);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    boolean z = jSONObject.getBoolean(next);
                    if (next != null) {
                        hashMap.put(next, Boolean.valueOf(z));
                    }
                }
            } catch (JSONException e) {
                Log.m165383e("LocalSettingManager", e.getMessage());
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public void mo116562b(String str, boolean z) {
        if (str != null) {
            f81579d.put(str, Boolean.valueOf(z));
            m121507a(f81577b, f81579d);
        }
    }

    /* renamed from: a */
    private void m121507a(String str, Map<String, Boolean> map) {
        if (map != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException e) {
                Log.m165383e("LocalSettingManager", e.getMessage());
            }
            C30022a.f74882a.spDependency().mo108179a(str, jSONObject.toString());
        }
    }

    /* renamed from: a */
    public void mo116559a(String str, boolean z) {
        if (str != null) {
            f81578c.put(str, Boolean.valueOf(z));
            m121507a(f81576a, f81578c);
        }
    }
}

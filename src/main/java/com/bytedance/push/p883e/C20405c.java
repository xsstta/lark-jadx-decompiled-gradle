package com.bytedance.push.p883e;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.e.c */
public class C20405c {

    /* renamed from: a */
    private List<C20406a> f49877a;

    /* renamed from: b */
    private C20407b f49878b;

    /* renamed from: com.bytedance.push.e.c$b */
    public static class C20407b {

        /* renamed from: a */
        public boolean f49881a;

        /* renamed from: b */
        public C20408c f49882b;

        /* renamed from: c */
        public C20408c f49883c;

        /* renamed from: a */
        public C20408c mo68823a() {
            return this.f49882b;
        }

        /* renamed from: b */
        public C20408c mo68824b() {
            return this.f49883c;
        }

        public String toString() {
            return "MuteConfig{isMute=" + this.f49881a + ", from=" + this.f49882b + ", to=" + this.f49883c + '}';
        }
    }

    /* renamed from: com.bytedance.push.e.c$c */
    public static class C20408c {

        /* renamed from: a */
        private int f49884a;

        /* renamed from: b */
        private int f49885b;

        public String toString() {
            return mo68826a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo68826a() {
            return String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(this.f49884a), Integer.valueOf(this.f49885b));
        }
    }

    /* renamed from: com.bytedance.push.e.c$a */
    public static class C20406a {

        /* renamed from: a */
        public String f49879a;

        /* renamed from: b */
        public boolean f49880b;

        public String toString() {
            return "ChildSwitcher{tag='" + this.f49879a + '\'' + ", isOpen=" + this.f49880b + '}';
        }
    }

    /* renamed from: a */
    public String mo68820a() {
        int i;
        C20407b bVar = this.f49878b;
        if (bVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (bVar.f49881a) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_mute", i);
            if (bVar.f49881a) {
                jSONObject.put("start_time", bVar.mo68823a().mo68826a());
                jSONObject.put("end_time", bVar.mo68824b().mo68826a());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public String mo68821b() {
        int i;
        ArrayList<C20406a> arrayList = this.f49877a == null ? null : new ArrayList(this.f49877a);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (C20406a aVar : arrayList) {
            if (aVar != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (aVar.f49880b) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    jSONObject.put("is_close", i);
                    jSONObject.put("name", aVar.f49879a);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray.toString();
    }
}

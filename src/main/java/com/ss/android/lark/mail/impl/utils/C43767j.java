package com.ss.android.lark.mail.impl.utils;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.utils.j */
public class C43767j {

    /* renamed from: com.ss.android.lark.mail.impl.utils.j$a */
    public static class C43768a {

        /* renamed from: a */
        public JSONObject f111065a = new JSONObject();

        /* renamed from: a */
        public JSONObject mo155934a() {
            return this.f111065a;
        }

        /* renamed from: a */
        public C43768a mo155930a(String str, float f) {
            try {
                this.f111065a.put(str, (double) f);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public C43768a mo155931a(String str, int i) {
            try {
                this.f111065a.put(str, i);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public C43768a mo155932a(String str, Object obj) {
            try {
                this.f111065a.put(str, obj);
            } catch (JSONException unused) {
            }
            return this;
        }

        /* renamed from: a */
        public C43768a mo155933a(String str, String str2) {
            try {
                this.f111065a.put(str, str2);
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    /* renamed from: a */
    public static C43768a m173489a() {
        return new C43768a();
    }
}

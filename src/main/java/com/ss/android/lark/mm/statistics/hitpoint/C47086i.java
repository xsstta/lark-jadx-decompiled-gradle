package com.ss.android.lark.mm.statistics.hitpoint;

import com.ss.android.lark.mm.p2288b.C45855f;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.i */
public class C47086i {

    /* renamed from: a */
    private JSONObject f118574a = new JSONObject();

    /* renamed from: c */
    public JSONObject mo165421c() {
        return this.f118574a;
    }

    /* renamed from: a */
    public C47086i mo165415a(boolean z) {
        try {
            this.f118574a.put("action_enabled", z ? 1 : 0);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: a */
    public static C47086i m186432a() {
        return new C47086i();
    }

    /* renamed from: b */
    public C47086i mo165416b() {
        return mo165423e("none");
    }

    private C47086i() {
    }

    /* renamed from: a */
    public C47086i mo165409a(String str) {
        try {
            this.f118574a.put("action_name", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: b */
    public C47086i mo165417b(String str) {
        try {
            this.f118574a.put("from_source", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: c */
    public C47086i mo165420c(String str) {
        try {
            this.f118574a.put("action_type", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: d */
    public C47086i mo165422d(String str) {
        try {
            this.f118574a.put("click", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: e */
    public C47086i mo165423e(String str) {
        try {
            this.f118574a.put("target", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: f */
    public C47086i mo165424f(String str) {
        try {
            this.f118574a.put("location", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: g */
    public C47086i mo165425g(String str) {
        try {
            this.f118574a.put("is_open", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: h */
    public C47086i mo165426h(String str) {
        try {
            this.f118574a.put("page_name", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: i */
    public C47086i mo165427i(String str) {
        try {
            this.f118574a.put("popup_name", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: j */
    public C47086i mo165428j(String str) {
        try {
            this.f118574a.put("from_language", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: k */
    public C47086i mo165429k(String str) {
        try {
            this.f118574a.put("action_language", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: l */
    public C47086i mo165430l(String str) {
        try {
            this.f118574a.put("tab_type", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: m */
    public C47086i mo165431m(String str) {
        try {
            this.f118574a.put("url", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: b */
    public C47086i mo165419b(boolean z) {
        String str;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        try {
            this.f118574a.put("is_open", str);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: a */
    public C47086i mo165410a(String str, int i) {
        try {
            this.f118574a.put(str, i);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: b */
    public C47086i mo165418b(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        try {
            this.f118574a.put(str, str2);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: a */
    public C47086i mo165411a(String str, long j) {
        try {
            this.f118574a.put(str, j);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: a */
    public C47086i mo165412a(String str, Object obj) {
        try {
            this.f118574a.put(str, obj);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: a */
    public C47086i mo165413a(String str, String str2) {
        try {
            this.f118574a.put(str, str2);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }

    /* renamed from: a */
    public C47086i mo165414a(String str, boolean z) {
        try {
            this.f118574a.put(str, z);
        } catch (Exception e) {
            C45855f.m181666e("MmHitPointJSON", "[put] error: " + e.getMessage());
        }
        return this;
    }
}

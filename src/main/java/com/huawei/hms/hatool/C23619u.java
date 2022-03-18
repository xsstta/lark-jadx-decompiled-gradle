package com.huawei.hms.hatool;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.u */
public class C23619u {

    /* renamed from: a */
    public String f58325a;

    /* renamed from: b */
    public String f58326b;

    /* renamed from: c */
    public String f58327c;

    /* renamed from: d */
    public List<C23615q> f58328d;

    /* renamed from: e */
    public String f58329e;

    public C23619u(String str, String str2, String str3, List<C23615q> list, String str4) {
        this.f58325a = str;
        this.f58326b = str2;
        this.f58327c = str3;
        this.f58328d = list;
        this.f58329e = str4;
    }

    /* renamed from: a */
    public final String mo83158a(String str, String str2) {
        String str3;
        String f = AbstractC23598c.m85636f(str, str2);
        if (TextUtils.isEmpty(f)) {
            C23625y.m85972a("hmsSdk", "No report address,TAG : %s,TYPE: %s ", str, str2);
            return "";
        }
        if ("oper".equals(str2)) {
            str3 = "{url}/common/hmshioperqrt";
        } else if ("maint".equals(str2)) {
            str3 = "{url}/common/hmshimaintqrt";
        } else if (!"diffprivacy".equals(str2)) {
            return "";
        } else {
            str3 = "{url}/common/common2";
        }
        return str3.replace("{url}", f);
    }

    /* renamed from: a */
    public void mo83159a() {
        n0 n0Var;
        m0 m0Var;
        String str;
        String a = mo83158a(this.f58325a, this.f58326b);
        if (!TextUtils.isEmpty(a) || "preins".equals(this.f58326b)) {
            if (!"_hms_config_tag".equals(this.f58325a) && !"_openness_config_tag".equals(this.f58325a)) {
                mo83161b();
            }
            C23616r d = mo83163d();
            if (d != null) {
                byte[] a2 = mo83160a(d);
                if (a2.length == 0) {
                    str = "request body is empty";
                } else {
                    m0Var = new i0(a2, a, this.f58325a, this.f58326b, this.f58329e, this.f58328d);
                    n0Var = n0.m85860a();
                }
            } else {
                m0Var = new l0(this.f58328d, this.f58325a, this.f58329e, this.f58326b);
                n0Var = n0.m85861b();
            }
            n0Var.mo83125a(m0Var);
            return;
        }
        str = "collectUrl is empty";
        C23625y.m85981e("hmsSdk", str);
    }

    /* renamed from: a */
    public final byte[] mo83160a(C23616r rVar) {
        String str;
        try {
            JSONObject a = rVar.mo82974a();
            if (a != null) {
                return r0.m85909a(a.toString().getBytes("UTF-8"));
            }
            C23625y.m85981e("hmsSdk", "uploadEvents is null");
            return new byte[0];
        } catch (JSONException unused) {
            str = "uploadEvents to json error";
            C23625y.m85981e("hmsSdk", str);
            return new byte[0];
        } catch (UnsupportedEncodingException unused2) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            C23625y.m85981e("hmsSdk", str);
            return new byte[0];
        }
    }

    /* renamed from: b */
    public final void mo83161b() {
        if (p0.m85879a(AbstractC23596b.m85619f(), "backup_event", 5242880)) {
            C23625y.m85979d("hmsSdk", "backup file reach max limited size, discard new event ");
            return;
        }
        JSONArray c = mo83162c();
        String a = s0.m85915a(this.f58325a, this.f58326b, this.f58329e);
        C23625y.m85977c("hmsSdk", "Update data cached into backup,spKey: " + a);
        g0.m85724b(AbstractC23596b.m85619f(), "backup_event", a, c.toString());
    }

    /* renamed from: c */
    public final JSONArray mo83162c() {
        JSONArray jSONArray = new JSONArray();
        for (C23615q qVar : this.f58328d) {
            try {
                jSONArray.put(qVar.mo83147d());
            } catch (JSONException unused) {
                C23625y.m85977c("hmsSdk", "handleEvents: json error,Abandon this data");
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    public final C23616r mo83163d() {
        return b1.m85628a(this.f58328d, this.f58325a, this.f58326b, this.f58329e, this.f58327c);
    }
}

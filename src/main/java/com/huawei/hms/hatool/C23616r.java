package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.secure.android.common.p1021a.p1022a.C23804a;
import com.huawei.secure.android.common.p1021a.p1026d.C23809b;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.hatool.r */
public class C23616r implements AbstractC23617s {

    /* renamed from: a */
    public List<C23615q> f58314a;

    /* renamed from: b */
    public AbstractC23613o f58315b;

    /* renamed from: c */
    public AbstractC23614p f58316c;

    /* renamed from: d */
    public AbstractC23617s f58317d;

    /* renamed from: e */
    public String f58318e = "";

    /* renamed from: f */
    public String f58319f;

    public C23616r(String str) {
        this.f58319f = str;
    }

    @Override // com.huawei.hms.hatool.AbstractC23617s
    /* renamed from: a */
    public JSONObject mo82974a() {
        String str;
        List<C23615q> list = this.f58314a;
        if (list == null || list.size() == 0) {
            str = "Not have actionEvent to send";
        } else if (this.f58315b == null || this.f58316c == null || this.f58317d == null) {
            str = "model in wrong format";
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", this.f58315b.mo82974a());
            JSONObject jSONObject2 = new JSONObject();
            JSONObject a = this.f58317d.mo82974a();
            a.put("properties", this.f58316c.mo82974a());
            try {
                a.put("events_global_properties", new JSONObject(this.f58318e));
            } catch (JSONException unused) {
                a.put("events_global_properties", this.f58318e);
            }
            jSONObject2.put("events_common", a);
            JSONArray jSONArray = new JSONArray();
            for (C23615q qVar : this.f58314a) {
                JSONObject a2 = qVar.mo82974a();
                if (a2 != null) {
                    jSONArray.put(a2);
                } else {
                    C23625y.m85981e("hmsSdk", "custom event is empty,delete this event");
                }
            }
            jSONObject2.put("events", jSONArray);
            try {
                String a3 = C23809b.m87022a(C23804a.m87002a(r0.m85909a(jSONObject2.toString().getBytes("UTF-8")), C23809b.m87023a(this.f58319f)));
                if (TextUtils.isEmpty(a3)) {
                    C23625y.m85981e("hmsSdk", "eventInfo encrypt failed,report over!");
                    return null;
                }
                jSONObject.put("event", a3);
                return jSONObject;
            } catch (UnsupportedEncodingException unused2) {
                str = "getBitZip(): Unsupported coding : utf-8";
            }
        }
        C23625y.m85981e("hmsSdk", str);
        return null;
    }

    /* renamed from: a */
    public void mo83151a(c1 c1Var) {
        this.f58317d = c1Var;
    }

    /* renamed from: a */
    public void mo83152a(AbstractC23613o oVar) {
        this.f58315b = oVar;
    }

    /* renamed from: a */
    public void mo83153a(AbstractC23614p pVar) {
        this.f58316c = pVar;
    }

    /* renamed from: a */
    public void mo83154a(String str) {
        if (str != null) {
            this.f58318e = str;
        }
    }

    /* renamed from: a */
    public void mo83155a(List<C23615q> list) {
        this.f58314a = list;
    }
}

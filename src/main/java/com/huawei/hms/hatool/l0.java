package com.huawei.hms.hatool;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class l0 implements m0 {

    /* renamed from: a */
    public String f58280a;

    /* renamed from: b */
    public String f58281b;

    /* renamed from: c */
    public String f58282c;

    /* renamed from: d */
    public List<C23615q> f58283d;

    public l0(List<C23615q> list, String str, String str2, String str3) {
        this.f58280a = str;
        this.f58281b = str2;
        this.f58282c = str3;
        this.f58283d = list;
    }

    /* renamed from: a */
    public final void mo83112a() {
        String a = s0.m85915a(this.f58280a, this.f58282c, this.f58281b);
        g0.m85721a(AbstractC23596b.m85619f(), "backup_event", a);
    }

    public void run() {
        List<C23615q> list = this.f58283d;
        if (list == null || list.size() == 0) {
            C23625y.m85979d("hmsSdk", "failed events is empty");
            return;
        }
        if (p0.m85879a(AbstractC23596b.m85619f(), "cached_v2_1", AbstractC23596b.m85621h() * 1048576)) {
            C23625y.m85981e("hmsSdk", "The cacheFile is full,Can not writing data! reqID:" + this.f58281b);
            return;
        }
        String a = s0.m85914a(this.f58280a, this.f58282c);
        List<C23615q> list2 = C23621w.m85943b(AbstractC23596b.m85619f(), "cached_v2_1", a).get(a);
        if (!(list2 == null || list2.size() == 0)) {
            this.f58283d.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        for (C23615q qVar : this.f58283d) {
            try {
                jSONArray.put(qVar.mo83147d());
            } catch (JSONException unused) {
                C23625y.m85981e("hmsSdk", "event to json error");
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2.length() > AbstractC23596b.m85618e() * 1048576) {
            C23625y.m85981e("hmsSdk", "this failed data is too long,can not writing it");
            this.f58283d = null;
            return;
        }
        C23625y.m85979d("hmsSdk", "data send failed, write to cache file...reqID:" + this.f58281b);
        g0.m85724b(AbstractC23596b.m85619f(), "cached_v2_1", a, jSONArray2);
        mo83112a();
    }
}

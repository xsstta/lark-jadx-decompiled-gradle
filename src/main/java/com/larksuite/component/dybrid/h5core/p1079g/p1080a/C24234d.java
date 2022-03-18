package com.larksuite.component.dybrid.h5core.p1079g.p1080a;

import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.util.share_preference.UserSP;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.g.a.d */
public class C24234d implements AbstractC24169l {
    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a(AbstractC24169l.C24170a.f59768r);
        aVar.mo86723a(AbstractC24169l.C24170a.f59767q);
        aVar.mo86723a(AbstractC24169l.C24170a.f59769s);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        boolean z;
        String str;
        String b = h5Event.mo86707b();
        JSONObject d = h5Event.mo86710d();
        String a = C24246a.m88559a(d, "key");
        boolean a2 = C24246a.m88564a(d, "isUserScope", false);
        if (AbstractC24169l.C24170a.f59768r.equals(b)) {
            String a3 = C24246a.m88559a(d, "value");
            if (a2) {
                UserSP.getInstance().putString(a, a3);
            } else {
                C57744a.m224104a().putString(a, a3);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", true);
            h5Event.mo86708b(jSONObject);
        } else if (AbstractC24169l.C24170a.f59767q.equals(b)) {
            String a4 = C24246a.m88559a(d, "defaultValue");
            JSONObject jSONObject2 = new JSONObject();
            if (a2) {
                str = UserSP.getInstance().getString(a, a4);
            } else {
                str = C57744a.m224104a().getString(a, a4);
            }
            jSONObject2.put("value", str);
            h5Event.mo86708b(jSONObject2);
        } else if (AbstractC24169l.C24170a.f59769s.equals(b)) {
            if (a2) {
                z = UserSP.getInstance().remove(a);
            } else {
                z = C57744a.m224104a().remove(a);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("success", z);
            h5Event.mo86708b(jSONObject3);
        }
        return true;
    }
}

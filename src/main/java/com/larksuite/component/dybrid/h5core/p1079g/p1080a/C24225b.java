package com.larksuite.component.dybrid.h5core.p1079g.p1080a;

import android.text.TextUtils;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.H5JumpForResultActivity;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.g.a.b */
public class C24225b implements AbstractC24169l {
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
        aVar.mo86723a(AbstractC24169l.C24170a.f59759i);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(final H5Event h5Event) throws JSONException {
        if (!AbstractC24169l.C24170a.f59759i.equals(h5Event.mo86707b())) {
            return true;
        }
        String a = C24246a.m88559a(h5Event.mo86710d(), "url");
        if (TextUtils.isEmpty(a)) {
            h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
            return false;
        }
        H5JumpForResultActivity.m88358a(C24214b.m88460a(), a, new H5JumpForResultActivity.AbstractC24196a() {
            /* class com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24225b.C242261 */

            @Override // com.larksuite.component.dybrid.h5core.core.H5JumpForResultActivity.AbstractC24196a
            /* renamed from: a */
            public void mo86806a(String str) {
                C24174b.m88296a("H5RouterPlugin", "jsonData:" + str);
                AbstractC24168k kVar = (AbstractC24168k) h5Event.mo86711e();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("h5_action_on_result_param", str);
                } catch (JSONException e) {
                    C24174b.m88297a("H5RouterPlugin", "JSONException", e);
                }
                kVar.mo86736a("h5PageActivityOnResult", jSONObject);
            }
        });
        return true;
    }
}

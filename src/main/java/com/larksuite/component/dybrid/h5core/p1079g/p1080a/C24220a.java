package com.larksuite.component.dybrid.h5core.p1079g.p1080a;

import android.util.Base64;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.sdk.Sdk;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1079g.p1080a.p1081a.C24222a;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.g.a.a */
public class C24220a implements AbstractC24169l {

    /* renamed from: a */
    private C24222a f59856a;

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
        C24222a aVar = this.f59856a;
        if (aVar != null) {
            Sdk.removePushObserver(aVar);
            this.f59856a.mo86858a();
            this.f59856a = null;
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a(AbstractC24169l.C24170a.f59770t);
        aVar.mo86723a(AbstractC24169l.C24170a.f59771u);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(final H5Event h5Event) throws JSONException {
        JSONArray a = C24246a.m88561a(h5Event.mo86710d(), "commands", (JSONArray) null);
        if (this.f59856a == null) {
            C24222a aVar = new C24222a();
            this.f59856a = aVar;
            Sdk.addPushObserver(aVar);
        }
        int i = 0;
        if (AbstractC24169l.C24170a.f59770t.equals(h5Event.mo86707b())) {
            while (i < a.length()) {
                final int i2 = a.getInt(i);
                this.f59856a.mo86859a(Command.fromValue(i2), new C24222a.AbstractC24223a() {
                    /* class com.larksuite.component.dybrid.h5core.p1079g.p1080a.C24220a.C242211 */

                    @Override // com.larksuite.component.dybrid.h5core.p1079g.p1080a.p1081a.C24222a.AbstractC24223a
                    /* renamed from: a */
                    public void mo86857a(byte[] bArr, String str, boolean z, boolean z2) {
                        String encodeToString = Base64.encodeToString(bArr, 0);
                        C24174b.m88301c("H5PushPlugin", "responseStr:" + encodeToString + " commandId:" + i2);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, encodeToString);
                            jSONObject2.put("command", i2);
                            jSONObject.put("detail", jSONObject2);
                            h5Event.mo86704a("biz.util.larkSDK.push.receiver", jSONObject);
                        } catch (JSONException e) {
                            C24174b.m88297a("H5PushPlugin", "JSONException", e);
                        }
                    }
                });
                i++;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("registerSuccess", true);
                h5Event.mo86708b(jSONObject);
            } catch (JSONException e) {
                C24174b.m88297a("H5PushPlugin", "JSONException", e);
            }
        } else if (AbstractC24169l.C24170a.f59771u.equals(h5Event.mo86707b())) {
            boolean z = false;
            while (i < a.length()) {
                this.f59856a.mo86860b(Command.fromValue(a.getInt(i)), null);
                i++;
                z = true;
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                h5Event.mo86708b(jSONObject2);
            } catch (JSONException e2) {
                C24174b.m88297a("H5PushPlugin", "JSONException", e2);
            }
        }
        return true;
    }
}

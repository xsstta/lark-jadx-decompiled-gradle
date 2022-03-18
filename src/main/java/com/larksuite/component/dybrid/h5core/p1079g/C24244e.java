package com.larksuite.component.dybrid.h5core.p1079g;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24164g;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1076d.C24212a;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.g.e */
public class C24244e implements AbstractC24169l {
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
        aVar.mo86723a(AbstractC24169l.C24170a.f59761k);
        aVar.mo86723a(AbstractC24169l.C24170a.f59762l);
        aVar.mo86723a(AbstractC24169l.C24170a.f59763m);
        aVar.mo86723a(AbstractC24169l.C24170a.f59764n);
        aVar.mo86723a(AbstractC24169l.C24170a.f59765o);
        aVar.mo86723a(AbstractC24169l.C24170a.f59766p);
    }

    /* renamed from: c */
    private void m88531c(H5Event h5Event) {
        AbstractC24164g c = C24212a.m88455a().mo86744c();
        JSONObject d = h5Event.mo86710d();
        if (d != null && c != null) {
            String a = c.mo86741a(C24246a.m88559a(d, "key"));
            if (TextUtils.isEmpty(a)) {
                a = C24246a.m88559a(d, "defaultValue");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", a);
                h5Event.mo86708b(jSONObject);
            } catch (JSONException e) {
                C24174b.m88297a("H5ServicePlugin", "JSONException", e);
            }
        }
    }

    /* renamed from: d */
    private void m88532d(H5Event h5Event) {
        AbstractC24164g c = C24212a.m88455a().mo86744c();
        JSONObject d = h5Event.mo86710d();
        if (d != null && c != null) {
            c.mo86743b(C24246a.m88559a(d, "key"));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", true);
                h5Event.mo86708b(jSONObject);
            } catch (JSONException e) {
                C24174b.m88297a("H5ServicePlugin", "JSONException", e);
            }
        }
    }

    /* renamed from: e */
    private void m88533e(H5Event h5Event) {
        AbstractC24164g c = C24212a.m88455a().mo86744c();
        JSONObject d = h5Event.mo86710d();
        if (d != null && c != null) {
            c.mo86742a(C24246a.m88559a(d, "key"), C24246a.m88559a(d, "value"));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", true);
                h5Event.mo86708b(jSONObject);
            } catch (JSONException e) {
                C24174b.m88297a("H5ServicePlugin", "JSONException", e);
            }
        }
    }

    /* renamed from: g */
    private void m88535g(H5Event h5Event) throws JSONException {
        JSONObject d = h5Event.mo86710d();
        JSONObject jSONObject = new JSONObject();
        JSONArray a = C24246a.m88561a(d, "keys", (JSONArray) null);
        AbstractC24164g c = C24212a.m88455a().mo86744c();
        if (!(a == null || a.length() == 0)) {
            int length = a.length();
            for (int i = 0; i < length; i++) {
                Object obj = a.get(i);
                if (obj instanceof String) {
                    String str = (String) obj;
                    jSONObject.put(str, c.mo86741a(str));
                }
            }
        }
        h5Event.mo86708b(jSONObject);
    }

    /* renamed from: f */
    private void m88534f(H5Event h5Event) {
        JSONObject a = C24246a.m88562a(h5Event.mo86710d(), Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (JSONObject) null);
        if (a != null && a.length() != 0) {
            AbstractC24164g c = C24212a.m88455a().mo86744c();
            Iterator<String> keys = a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String a2 = C24246a.m88559a(a, next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(a2)) {
                    c.mo86742a(next, a2);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", true);
                h5Event.mo86708b(jSONObject);
            } catch (JSONException e) {
                C24174b.m88297a("H5ServicePlugin", "JSONException", e);
            }
        }
    }

    /* renamed from: h */
    private void m88536h(H5Event h5Event) throws JSONException {
        JSONArray a = C24246a.m88561a(h5Event.mo86710d(), "keys", (JSONArray) null);
        AbstractC24164g c = C24212a.m88455a().mo86744c();
        if (!(a == null || a.length() == 0)) {
            int length = a.length();
            for (int i = 0; i < length; i++) {
                Object obj = a.get(i);
                if (obj instanceof String) {
                    c.mo86743b((String) obj);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", true);
            h5Event.mo86708b(jSONObject);
        } catch (JSONException e) {
            C24174b.m88297a("H5ServicePlugin", "JSONException", e);
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        String b = h5Event.mo86707b();
        if (AbstractC24169l.C24170a.f59765o.equals(b)) {
            m88534f(h5Event);
            return true;
        } else if (AbstractC24169l.C24170a.f59766p.equals(b)) {
            m88536h(h5Event);
            return true;
        } else if (AbstractC24169l.C24170a.f59764n.equals(b)) {
            m88535g(h5Event);
            return true;
        } else if (AbstractC24169l.C24170a.f59762l.equals(b)) {
            m88533e(h5Event);
            return true;
        } else if (AbstractC24169l.C24170a.f59763m.equals(b)) {
            m88532d(h5Event);
            return true;
        } else if (!AbstractC24169l.C24170a.f59761k.equals(b)) {
            return true;
        } else {
            m88531c(h5Event);
            return true;
        }
    }
}

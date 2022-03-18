package com.larksuite.component.dybrid.h5core.p1079g;

import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5api.p1071b.C24176c;
import com.larksuite.component.dybrid.h5core.p1076d.C24212a;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.ss.android.lark.http.netstate.AbstractC38769a;
import com.ss.android.lark.http.netstate.C38770b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.g.a */
public class C24218a implements AbstractC24169l {

    /* renamed from: a */
    private static AbstractC38769a f59855a = new AbstractC38769a() {
        /* class com.larksuite.component.dybrid.h5core.p1079g.C24218a.C242191 */

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
            if (r3.equals("mobile") != false) goto L_0x0044;
         */
        @Override // com.ss.android.lark.http.netstate.AbstractC38769a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNetworkStateChange(com.ss.android.lark.http.netstate.NetworkUtils.NetworkType r7) {
            /*
            // Method dump skipped, instructions count: 126
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.dybrid.h5core.p1079g.C24218a.C242191.onNetworkStateChange(com.ss.android.lark.http.netstate.NetworkUtils$NetworkType):void");
        }
    };

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
        C24174b.m88296a("H5DefaultPlugin", "onRelease");
    }

    public C24218a() {
        C38770b.m153078a().mo142127a(f59855a);
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a("h5PageShouldLoadUrl");
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        if (!"h5PageShouldLoadUrl".equals(h5Event.mo86707b())) {
            return true;
        }
        m88475c(h5Event);
        return true;
    }

    /* renamed from: c */
    private void m88475c(H5Event h5Event) {
        String a = C24246a.m88559a(h5Event.mo86710d(), "url");
        if (a.contains(".apk")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", a);
                h5Event.mo86711e().mo86736a("openInBrowser", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            C24176c.m88304a(a).getScheme();
            H5Event h5Event2 = new H5Event("h5PageDoLoadUrl");
            h5Event2.mo86705a(h5Event.mo86710d());
            h5Event2.mo86703a(h5Event.mo86711e());
            C24212a.m88459c().mo86828a(h5Event2);
        }
    }
}

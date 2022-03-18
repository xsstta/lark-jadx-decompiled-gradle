package com.larksuite.component.dybrid.h5core.p1079g;

import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24159b;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.impl.C24205b;
import org.json.JSONException;

/* renamed from: com.larksuite.component.dybrid.h5core.g.c */
public class C24239c implements AbstractC24169l {

    /* renamed from: a */
    private AbstractC24159b f59886a;

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    public C24239c(C24205b bVar) {
        this.f59886a = bVar.mo86755h();
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a("h5PageStarted");
        aVar.mo86723a("h5PageFinished");
        aVar.mo86723a("h5PageReceivedTitle");
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        if (this.f59886a == null) {
            return false;
        }
        String b = h5Event.mo86707b();
        if ("h5PageStarted".equals(b)) {
            this.f59886a.mo86727b();
            C24174b.m88296a("H5InspectPlugin", "resetBridge");
        } else if ("h5PageFinished".equals(b) || "h5PageReceivedTitle".equals(b)) {
            this.f59886a.mo86724a();
            C24174b.m88296a("H5InspectPlugin", "inspectSentEventToWebForWebView");
        }
        return false;
    }
}

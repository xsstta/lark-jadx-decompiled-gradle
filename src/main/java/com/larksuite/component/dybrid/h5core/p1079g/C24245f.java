package com.larksuite.component.dybrid.h5core.p1079g;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24163f;
import com.larksuite.component.dybrid.h5api.api.AbstractC24168k;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.AbstractC24172n;
import com.larksuite.component.dybrid.h5api.api.C24160c;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.C24203c;
import com.larksuite.component.dybrid.h5core.core.impl.C24210e;
import com.larksuite.component.dybrid.h5core.p1076d.C24214b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.larksuite.component.dybrid.router.C24258a;
import com.larksuite.framework.utils.C26252ad;
import java.util.Stack;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.g.f */
public class C24245f implements AbstractC24169l {

    /* renamed from: a */
    private AbstractC24172n f59898a;

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) {
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
        this.f59898a = null;
    }

    public C24245f(AbstractC24172n nVar) {
        this.f59898a = nVar;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a(AbstractC24169l.C24170a.f59774x);
        aVar.mo86723a(AbstractC24169l.C24170a.f59773w);
        aVar.mo86723a(AbstractC24169l.C24170a.f59772v);
    }

    /* renamed from: e */
    private void m88543e(H5Event h5Event) {
        JSONObject d = h5Event.mo86710d();
        if (d != null) {
            this.f59898a.mo86744c().mo86742a("h5_session_pop_param", C24246a.m88562a(d, Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (JSONObject) null).toString());
        }
        AbstractC24168k g = this.f59898a.mo86768g();
        if (g != null) {
            g.mo86736a("h5PageClose", null);
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) {
        String b = h5Event.mo86707b();
        if (AbstractC24169l.C24170a.f59773w.equals(b)) {
            return m88542d(h5Event);
        }
        if (AbstractC24169l.C24170a.f59772v.equals(b)) {
            return m88541c(h5Event);
        }
        if (!AbstractC24169l.C24170a.f59774x.equals(b)) {
            return true;
        }
        m88543e(h5Event);
        return true;
    }

    /* renamed from: d */
    private boolean m88542d(H5Event h5Event) {
        int i;
        int i2;
        JSONObject d = h5Event.mo86710d();
        if (d == null || d.isNull("index")) {
            i = Integer.MAX_VALUE;
        } else {
            i = C24246a.m88550a(d, "index", Integer.MAX_VALUE);
        }
        if (i == Integer.MAX_VALUE) {
            C24174b.m88301c("H5SessionPlugin", "can`t find page index");
            return false;
        }
        Stack<AbstractC24168k> h = this.f59898a.mo86769h();
        int size = h.size();
        if (i < 0) {
            i += size - 1;
        }
        if (i < 0 || i >= (i2 = size - 1)) {
            C24174b.m88301c("H5SessionPlugin", "invalid page index");
            return false;
        }
        for (i2 = size - 1; i2 > i; i2--) {
            h.get(i2).mo86736a("h5PageClose", null);
        }
        return true;
    }

    /* renamed from: c */
    private boolean m88541c(H5Event h5Event) {
        if (!C26252ad.m94993b(C24214b.m88460a())) {
            return false;
        }
        JSONObject d = h5Event.mo86710d();
        AbstractC24163f e = h5Event.mo86711e();
        if (!(e instanceof AbstractC24168k)) {
            C24174b.m88299b("H5SessionPlugin", "invalid target!");
            return false;
        }
        AbstractC24168k kVar = (AbstractC24168k) e;
        Bundle l = kVar.mo86759l();
        l.remove("titleBackgroundTranslate");
        Bundle bundle = new Bundle();
        bundle.putAll(l);
        JSONObject a = C24246a.m88562a(d, "params", (JSONObject) null);
        if (!(a == null || a.length() == 0)) {
            Bundle bundle2 = new Bundle();
            C24246a.m88551a(bundle2, a);
            C24203c a2 = C24203c.m88400a();
            Bundle a3 = a2.mo86831a(bundle2, false);
            for (String str : a3.keySet()) {
                a2.mo86832a(bundle, str);
            }
            bundle.putAll(a3);
        }
        String a4 = C24246a.m88560a(d, "url", (String) null);
        if (TextUtils.isEmpty(a4)) {
            C24174b.m88300c("can't get url parameter!");
            return false;
        }
        bundle.putString("url", a4);
        if (!a4.startsWith("http")) {
            return C24258a.m88594a().mo86894a(C24214b.m88460a(), a4, bundle);
        }
        C24210e.m88437g().mo86824a(kVar.mo86757j(), new C24160c(bundle));
        return true;
    }
}

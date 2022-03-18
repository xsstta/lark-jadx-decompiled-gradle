package com.larksuite.component.dybrid.h5core.p1073b;

import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.AbstractC24171m;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.api.H5PluginConfig;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.p1082h.C24246a;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.larksuite.component.dybrid.h5core.b.b */
public class C24193b implements AbstractC24169l {

    /* renamed from: a */
    private Map<String, C24194a> f59800a = new HashMap();

    /* renamed from: b */
    private AbstractC24171m f59801b;

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        for (String str : this.f59800a.keySet()) {
            aVar.mo86723a(str);
        }
    }

    /* renamed from: a */
    private AbstractC24169l m88350a(H5PluginConfig h5PluginConfig) {
        if (h5PluginConfig.f59745a != null) {
            this.f59801b.mo86762a(h5PluginConfig.f59745a);
            return h5PluginConfig.f59745a;
        }
        try {
            Object newInstance = C24246a.m88565b(h5PluginConfig.f59746b).newInstance();
            if (!(newInstance instanceof AbstractC24169l)) {
                return null;
            }
            AbstractC24169l lVar = (AbstractC24169l) newInstance;
            this.f59801b.mo86762a(lVar);
            return lVar;
        } catch (IllegalAccessException e) {
            C24174b.m88297a("H5PluginProxy", ApiHandler.API_CALLBACK_EXCEPTION, e);
            return null;
        } catch (InstantiationException e2) {
            C24174b.m88297a("H5PluginProxy", ApiHandler.API_CALLBACK_EXCEPTION, e2);
            return null;
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        String b = h5Event.mo86707b();
        C24194a aVar = this.f59800a.get(b);
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (aVar.f59802a != null && aVar.f59804c) {
            return false;
        }
        if (aVar.f59802a == null) {
            aVar.f59802a = m88350a(aVar.f59803b);
        }
        if (aVar.f59802a != null) {
            try {
                z = aVar.f59802a.mo86747a(h5Event);
            } catch (JSONException e) {
                C24174b.m88297a("H5PluginProxy", ApiHandler.API_CALLBACK_EXCEPTION, e);
            }
            aVar.f59804c = z;
            String name = aVar.f59802a.getClass().getName();
            if (z) {
                C24174b.m88296a("H5PluginProxy", "[" + b + "] intercept by " + name);
            } else {
                C24174b.m88296a("H5PluginProxy", "[" + b + "] intercept pass " + name);
            }
        }
        return z;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        String b = h5Event.mo86707b();
        C24194a aVar = this.f59800a.get(b);
        boolean z = false;
        if (aVar == null) {
            return false;
        }
        if (aVar.f59802a != null && aVar.f59804c) {
            return false;
        }
        if (aVar.f59802a == null) {
            aVar.f59802a = m88350a(aVar.f59803b);
        }
        if (aVar.f59802a != null) {
            try {
                z = aVar.f59802a.mo86748b(h5Event);
            } catch (JSONException e) {
                C24174b.m88297a("H5PluginProxy", ApiHandler.API_CALLBACK_EXCEPTION, e);
            }
            aVar.f59804c = true;
            String name = aVar.f59802a.getClass().getName();
            if (z) {
                C24174b.m88296a("H5PluginProxy", "[" + b + "] handle by " + name);
            } else {
                C24174b.m88296a("H5PluginProxy", "[" + b + "] handle pass " + name);
            }
        }
        return z;
    }

    /* renamed from: com.larksuite.component.dybrid.h5core.b.b$a */
    class C24194a {

        /* renamed from: a */
        public AbstractC24169l f59802a;

        /* renamed from: b */
        public H5PluginConfig f59803b;

        /* renamed from: c */
        public boolean f59804c;

        C24194a(C24193b bVar) {
        }
    }

    public C24193b(List<H5PluginConfig> list, AbstractC24171m mVar) {
        this.f59801b = mVar;
        if (!(list == null || list.isEmpty())) {
            for (H5PluginConfig h5PluginConfig : list) {
                C24194a aVar = new C24194a(this);
                aVar.f59804c = false;
                aVar.f59802a = null;
                aVar.f59803b = h5PluginConfig;
                for (String str : h5PluginConfig.f59747c) {
                    this.f59800a.put(str, aVar);
                }
            }
        }
    }
}

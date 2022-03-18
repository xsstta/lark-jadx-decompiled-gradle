package com.larksuite.component.dybrid.h5core.core;

import android.app.Activity;
import com.larksuite.component.dybrid.h5api.api.AbstractC24161d;
import com.larksuite.component.dybrid.h5api.api.AbstractC24163f;
import com.larksuite.component.dybrid.h5api.api.AbstractC24164g;
import com.larksuite.component.dybrid.h5api.api.AbstractC24171m;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.larksuite.component.dybrid.h5api.p1071b.C24174b;
import com.larksuite.component.dybrid.h5core.core.H5TranslateProxyActivity;
import com.larksuite.component.dybrid.h5core.p1076d.C24212a;
import com.larksuite.component.dybrid.h5core.p1078f.C24217a;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.dybrid.h5core.core.a */
public abstract class AbstractC24198a implements AbstractC24163f {

    /* renamed from: a */
    protected AbstractC24164g f59812a;

    /* renamed from: b */
    protected Map<String, H5Event> f59813b = new HashMap();

    /* renamed from: c */
    private AbstractC24163f f59814c;

    /* renamed from: d */
    private List<AbstractC24163f> f59815d = new ArrayList();

    /* renamed from: e */
    private AbstractC24171m f59816e = new C24217a();

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24163f
    /* renamed from: a */
    public AbstractC24163f mo86732a() {
        return this.f59814c;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24165h
    /* renamed from: c */
    public AbstractC24164g mo86744c() {
        return this.f59812a;
    }

    /* renamed from: n */
    public AbstractC24171m mo86816n() {
        return this.f59816e;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24163f
    /* renamed from: b */
    public int mo86738b() {
        return hashCode();
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
        AbstractC24171m mVar = this.f59816e;
        if (mVar != null) {
            mVar.mo86749d();
            this.f59816e = null;
        }
        this.f59812a = null;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24163f
    /* renamed from: a */
    public void mo86734a(final H5Event.AbstractC24157b bVar) {
        H5TranslateProxyActivity.m88363a(new H5TranslateProxyActivity.AbstractC24197a() {
            /* class com.larksuite.component.dybrid.h5core.core.AbstractC24198a.C241991 */

            @Override // com.larksuite.component.dybrid.h5core.core.H5TranslateProxyActivity.AbstractC24197a
            /* renamed from: a */
            public void mo86815a(Activity activity) {
                bVar.onCreated(activity, true);
            }
        });
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24163f
    /* renamed from: a */
    public void mo86735a(AbstractC24163f fVar) {
        AbstractC24163f fVar2 = this.f59814c;
        if (fVar != fVar2) {
            if (fVar2 != null) {
                fVar2.mo86740c(this);
            }
            this.f59814c = fVar;
            if (fVar != null) {
                fVar.mo86739b(this);
            }
        }
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        AbstractC24171m mVar = this.f59816e;
        if (mVar != null) {
            try {
                return mVar.mo86748b(h5Event);
            } catch (JSONException e) {
                C24174b.m88297a("H5CoreTarget", ApiHandler.API_CALLBACK_EXCEPTION, e);
            }
        }
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24163f
    /* renamed from: a */
    public AbstractC24163f mo86733a(int i) {
        if (mo86738b() == i) {
            return this;
        }
        List<AbstractC24163f> list = this.f59815d;
        if (list != null && !list.isEmpty()) {
            Stack stack = new Stack();
            stack.addAll(this.f59815d);
            while (!stack.empty()) {
                AbstractC24163f a = ((AbstractC24163f) stack.pop()).mo86733a(i);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24163f
    /* renamed from: b */
    public boolean mo86739b(AbstractC24163f fVar) {
        if (fVar == null) {
            return false;
        }
        for (AbstractC24163f fVar2 : this.f59815d) {
            if (fVar2.equals(fVar)) {
                return false;
            }
        }
        this.f59815d.add(fVar);
        fVar.mo86735a(this);
        return true;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24163f
    /* renamed from: c */
    public boolean mo86740c(AbstractC24163f fVar) {
        if (fVar == null) {
            return false;
        }
        Iterator<AbstractC24163f> it = this.f59815d.iterator();
        while (it.hasNext()) {
            if (it.next().equals(fVar)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        AbstractC24171m mVar = this.f59816e;
        if (mVar != null) {
            try {
                return mVar.mo86747a(h5Event);
            } catch (JSONException e) {
                C24174b.m88297a("H5CoreTarget", ApiHandler.API_CALLBACK_EXCEPTION, e);
            }
        }
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24163f
    /* renamed from: a */
    public void mo86736a(String str, JSONObject jSONObject) {
        C24212a.m88459c().mo86828a(new H5Event.C24156a().mo86719b(str).mo86717a(jSONObject).mo86718a());
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24163f
    /* renamed from: a */
    public void mo86737a(String str, JSONObject jSONObject, AbstractC24161d dVar) {
        H5Event a = new H5Event.C24156a().mo86719b(str).mo86717a(jSONObject).mo86718a();
        a.mo86702a(dVar);
        this.f59813b.put(a.mo86709c(), a);
        C24212a.m88459c().mo86828a(a);
    }
}

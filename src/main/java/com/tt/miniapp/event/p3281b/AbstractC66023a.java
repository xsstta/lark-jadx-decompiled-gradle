package com.tt.miniapp.event.p3281b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.event.b.a */
public abstract class AbstractC66023a {

    /* renamed from: a */
    protected List<C66029b> f166684a = new ArrayList();

    /* renamed from: b */
    private C66031d f166685b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo231096a(String str, String str2) {
    }

    /* renamed from: f */
    public abstract boolean mo231103f(C66029b bVar);

    /* renamed from: a */
    public void mo231094a() {
        C66031d dVar = this.f166685b;
        if (dVar != null) {
            dVar.mo231109b();
        }
        this.f166684a.clear();
    }

    /* renamed from: b */
    public List<C66029b> mo231098b() {
        if (this.f166684a.isEmpty()) {
            return Collections.emptyList();
        }
        return this.f166684a;
    }

    protected AbstractC66023a(C66031d dVar) {
        this.f166685b = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo231100c(C66029b bVar) {
        if (this.f166684a.contains(bVar)) {
            mo231099b(bVar);
        } else {
            mo231095a(bVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo231101d(C66029b bVar) {
        C66031d dVar = this.f166685b;
        if (dVar != null) {
            dVar.mo231110b(bVar);
        }
        return this.f166684a.remove(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C66029b mo231102e(C66029b bVar) {
        if (bVar.f166687b.has("__inner_handled")) {
            bVar.f166687b.remove("__inner_handled");
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo231095a(C66029b bVar) {
        if (!this.f166684a.contains(bVar)) {
            this.f166684a.add(bVar);
            C66031d dVar = this.f166685b;
            if (dVar != null) {
                dVar.mo231107a(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo231099b(C66029b bVar) {
        if (this.f166684a.contains(bVar)) {
            List<C66029b> list = this.f166684a;
            list.set(list.indexOf(bVar), bVar);
            C66031d dVar = this.f166685b;
            if (dVar != null) {
                dVar.mo231107a(bVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo231097a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("AbsEventDelegate", "49411_build json put exp", e);
        }
    }
}

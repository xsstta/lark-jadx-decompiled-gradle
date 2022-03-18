package com.larksuite.framework.apiplugin.core;

import android.content.Context;
import android.content.Intent;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKBasePluginResult;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.entity.LKPluginInterceptResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25894e;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25902m;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25904o;
import com.larksuite.framework.apiplugin.p1177c.C25916a;
import com.larksuite.framework.apiplugin.p1177c.C25918b;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.larksuite.framework.apiplugin.core.a */
public abstract class AbstractC25922a implements AbstractC25891b {

    /* renamed from: a */
    private AbstractC25904o f64214a;

    /* renamed from: b */
    private AbstractC25891b f64215b;

    /* renamed from: c */
    private final List<AbstractC25891b> f64216c;

    /* renamed from: d */
    private AbstractC25902m f64217d;

    /* renamed from: e */
    private AbstractC25905b f64218e;

    /* renamed from: f */
    private C25918b.C25919a f64219f = new C25918b.C25919a(OPTraceService.m192757a().subTrace());

    /* renamed from: k */
    protected C25925c f64220k;

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: t */
    public AbstractC25891b mo92182t() {
        return this.f64215b;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: u */
    public AbstractC25904o mo92183u() {
        return this.f64214a;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: w */
    public int mo92185w() {
        return hashCode();
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: x */
    public void mo92186x() {
        this.f64217d.mo92194a();
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: v */
    public AbstractC25905b mo92184v() {
        if (this.f64218e == null) {
            this.f64219f.mo92224i("LKCoreTarget", "build bridge context");
            this.f64218e = new C25916a(this);
        }
        return this.f64218e;
    }

    public AbstractC25922a() {
        C25930g gVar = new C25930g();
        this.f64217d = gVar;
        C25931h hVar = new C25931h(gVar);
        hVar.mo92256a(this.f64219f);
        this.f64214a = hVar;
        this.f64216c = new ArrayList();
        this.f64220k = new C25925c();
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    public void ah_() {
        this.f64219f.mo92224i("LKCoreTarget", "onRelease");
        AbstractC25904o oVar = this.f64214a;
        if (oVar != null) {
            oVar.mo92201b();
            this.f64214a = null;
        }
        AbstractC25905b bVar = this.f64218e;
        if (bVar != null) {
            bVar.mo92215b();
            this.f64218e = null;
        }
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: a */
    public void mo92178a(AbstractC25937e eVar) {
        this.f64217d.mo92197b(eVar);
    }

    /* renamed from: b */
    public void mo92244b(AbstractC25937e eVar) {
        this.f64217d.mo92195a(eVar);
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: b */
    public LKBasePluginResult mo92179b(LKEvent lKEvent) {
        lKEvent.mo92120a((AbstractC25891b) this);
        return this.f64220k.mo92249b(lKEvent);
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        AbstractC25904o oVar = this.f64214a;
        if (oVar != null) {
            try {
                return oVar.handleEvent(lKEvent);
            } catch (Exception e) {
                this.f64219f.mo92223e("LKCoreTarget", "handleEvent exception", e);
            }
        }
        return LKPluginHandleResult.f64251d;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25900k
    /* renamed from: a */
    public LKPluginInterceptResult mo87280a(LKEvent lKEvent) {
        AbstractC25904o oVar = this.f64214a;
        if (oVar != null) {
            try {
                return oVar.mo87280a(lKEvent);
            } catch (Exception e) {
                this.f64219f.mo92223e("LKCoreTarget", "interceptEvent exception", e);
            }
        }
        return LKPluginInterceptResult.f64253d;
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: a */
    public void mo92177a(AbstractC25891b bVar) {
        AbstractC25891b bVar2 = this.f64215b;
        if (bVar == bVar2) {
            this.f64219f.mo92225w("LKCoreTarget", "already set this parent.");
            return;
        }
        if (bVar2 != null) {
            this.f64219f.mo92224i("LKCoreTarget", "reset parent");
            this.f64215b.mo92181c(this);
        }
        this.f64215b = bVar;
        if (bVar != null) {
            this.f64219f.mo92224i("LKCoreTarget", "add child");
            this.f64215b.mo92180b(this);
        }
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: b */
    public boolean mo92180b(AbstractC25891b bVar) {
        if (bVar == null) {
            this.f64219f.mo92223e("LKCoreTarget", "add child is null");
            return false;
        }
        synchronized (this.f64216c) {
            for (AbstractC25891b bVar2 : this.f64216c) {
                if (bVar2.equals(bVar)) {
                    this.f64219f.mo92223e("LKCoreTarget", "child already set");
                    return false;
                }
            }
            this.f64216c.add(bVar);
            bVar.mo92177a(this);
            return true;
        }
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25891b
    /* renamed from: c */
    public boolean mo92181c(AbstractC25891b bVar) {
        if (bVar == null) {
            this.f64219f.mo92223e("LKCoreTarget", "remove child is null");
            return false;
        }
        synchronized (this.f64216c) {
            Iterator<AbstractC25891b> it = this.f64216c.iterator();
            while (it.hasNext()) {
                if (it.next().equals(bVar)) {
                    this.f64219f.mo92224i("LKCoreTarget", "removed");
                    it.remove();
                    return true;
                }
            }
            this.f64219f.mo92224i("LKCoreTarget", "not need remove");
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo87111a(int i, int i2, Intent intent) {
        AbstractC25902m mVar = this.f64217d;
        boolean z = false;
        if (mVar != null) {
            for (AbstractC25937e eVar : mVar.mo92196b()) {
                if (eVar.handleActivityResult(i, i2, intent)) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public LKBasePluginResult mo92243a(Context context, String str, JSONObject jSONObject, AbstractC25894e eVar) {
        LKEvent a = new LKEvent.C25888a().mo92168a(str).mo92169a(jSONObject).mo92162a(context).mo92171a();
        if (eVar != null) {
            a.mo92122a(eVar);
        }
        return mo92179b(a);
    }
}

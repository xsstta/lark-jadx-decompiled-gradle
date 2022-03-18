package com.tt.miniapp.p3324r.p3326b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.api.AbstractC24361a;
import com.larksuite.framework.apiplugin.AbstractC25937e;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25901l;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25903n;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapphost.util.ProcessUtil;

/* renamed from: com.tt.miniapp.r.b.b */
public abstract class AbstractC66716b extends AbstractC25937e {

    /* renamed from: a */
    protected IApiInputParam f168428a;

    /* renamed from: b */
    private IAppContext f168429b;

    /* renamed from: a */
    public abstract IApiOutputParam mo87999a();

    /* renamed from: b */
    public abstract String mo88000b();

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public AbstractC66716b() {
    }

    /* renamed from: c */
    public IAppContext mo232461c() {
        return this.f168429b;
    }

    public AbstractC66716b(IApiInputParam iApiInputParam) {
        this.f168428a = iApiInputParam;
    }

    /* renamed from: a */
    public void mo232460a(IAppContext iAppContext) {
        this.f168429b = iAppContext;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        gVar.mo92192a(mo88000b());
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        AbstractC25891b r = lKEvent.mo92151r();
        if (r instanceof AbstractC24361a) {
            mo232460a(((AbstractC24361a) r).mo87113d());
        } else {
            AppBrandLogger.m52829e("SyncMsgCtrlV2", "core node is not Container, so have not appContext");
            if (lKEvent.mo92138e() instanceof IAppContext) {
                mo232460a((IAppContext) lKEvent.mo92138e());
                AppBrandLogger.m52830i("SyncMsgCtrlV2", "get find ServiceContext");
            } else if (!ProcessUtil.isMainProcess(lKEvent.mo92145l())) {
                C48936b.m192783a("core node is not Container, so have not appContext");
            }
        }
        if (!mo88000b().equals(m) || lKEvent.mo92148o() == null) {
            return lKEvent.mo92155v();
        }
        AbstractC25901l o = lKEvent.mo92148o();
        if (o instanceof IApiInputParam) {
            this.f168428a = (IApiInputParam) o;
            return lKEvent.mo92115a((AbstractC25903n) mo87999a());
        }
        AppBrandLogger.m52829e("SyncMsgCtrlV2", "input params is error.");
        return lKEvent.mo92155v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo232458a(String str, String str2) {
        return str + ":" + str2;
    }

    /* renamed from: a */
    public String mo232459a(boolean z, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        String b = mo88000b();
        if (z) {
            str2 = "ok";
        } else {
            str2 = "fail";
        }
        sb.append(mo232458a(b, str2));
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }
}

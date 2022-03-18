package com.larksuite.component.openplatform.core.plugin.infra.network;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p626b.C12810b;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.ac.C65733b;
import com.tt.miniapp.ac.C65738c;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3324r.p3325a.C66695a;
import com.tt.miniapp.p3324r.p3326b.AbstractC66716b;
import com.tt.miniapp.util.C67019aa;
import com.tt.miniapp.util.C67053q;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.network.n */
public class C24945n extends AbstractC66716b {
    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66716b
    /* renamed from: b */
    public String mo88000b() {
        return "createSocketTask";
    }

    public C24945n() {
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66716b
    /* renamed from: a */
    public IApiOutputParam mo87999a() {
        C12810b a = C65738c.m257721a((C66695a.C66696a) this.f168428a);
        if (a == null || TextUtils.isEmpty(a.f34201a)) {
            AppBrandLogger.m52829e("SyncMsgCtrlV2", "wsRequest is null or url is empty!");
            return m90194a(ApiCode.CONNECTSOCKET_INVALID_URL, -1);
        } else if (C67053q.m261326a("socket", a.f34201a, mo232461c())) {
            return m90194a((ApiCode) null, C65733b.m257704a(mo232461c()).mo230338a(a));
        } else {
            AppBrandLogger.m52830i("SyncMsgCtrlV2", "url is not safe domain:" + C67019aa.m261223a(a.f34201a));
            return m90194a(ApiCode.CONNECTSOCKET_INVALID_DOMAIN, -1);
        }
    }

    public C24945n(IApiInputParam iApiInputParam) {
        super(iApiInputParam);
    }

    /* renamed from: a */
    private IApiOutputParam m90194a(ApiCode apiCode, int i) {
        C66695a.C66697b bVar = new C66695a.C66697b();
        if (apiCode == null) {
            bVar.f168365a = i;
            bVar.f168366b = mo232458a("createSocketTask", "ok");
        } else {
            bVar.f168366b = mo232458a("createSocketTask", "fail, " + apiCode.msg);
            bVar.f168367c = Integer.valueOf(apiCode.code);
        }
        return bVar;
    }
}

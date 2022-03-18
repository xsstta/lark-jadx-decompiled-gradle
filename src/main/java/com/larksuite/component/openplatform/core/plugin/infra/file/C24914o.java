package com.larksuite.component.openplatform.core.plugin.infra.file;

import android.text.TextUtils;
import com.larksuite.component.openplatform.core.plugin.infra.file.read.C24917a;
import com.larksuite.component.openplatform.core.plugin.infra.file.write.C24920a;
import com.tt.frontendapiinterface.IApiInputParam;
import com.tt.frontendapiinterface.IApiOutputParam;
import com.tt.miniapp.p3324r.p3325a.C66701c;
import com.tt.miniapp.p3324r.p3325a.C66709e;
import com.tt.miniapp.p3324r.p3326b.AbstractC66716b;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.o */
public class C24914o extends AbstractC66716b {

    /* renamed from: b */
    private String f61058b;

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66716b
    /* renamed from: b */
    public String mo88000b() {
        return this.f61058b;
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66716b
    /* renamed from: a */
    public IApiOutputParam mo87999a() {
        if (TextUtils.equals(this.f61058b, "writeFileSync")) {
            C24920a aVar = new C24920a(this.f61058b);
            aVar.mo87971a(mo232461c());
            return (IApiOutputParam) aVar.mo87974b((C66709e.C66710a) this.f168428a);
        } else if (!TextUtils.equals(this.f61058b, "readFileSync")) {
            return null;
        } else {
            C24917a aVar2 = new C24917a(this.f61058b);
            aVar2.mo87971a(mo232461c());
            return (IApiOutputParam) aVar2.mo87974b((C66701c.C66702a) this.f168428a);
        }
    }

    public C24914o(IApiInputParam iApiInputParam, String str) {
        super(iApiInputParam);
        this.f61058b = str;
    }
}

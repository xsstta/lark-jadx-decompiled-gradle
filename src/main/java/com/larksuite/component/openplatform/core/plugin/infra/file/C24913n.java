package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.read.C24918b;
import com.larksuite.component.openplatform.core.plugin.infra.file.write.C24921b;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.miniapp.p3324r.p3326b.AbstractC66715a;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.n */
public class C24913n extends AbstractC66715a {

    /* renamed from: b */
    private String f61057b;

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: a */
    public String mo87633a() {
        return this.f61057b;
    }

    @Override // com.tt.miniapp.p3324r.p3326b.AbstractC66715a
    /* renamed from: b */
    public String mo87634b() {
        ApiCallResult apiCallResult;
        if (this.f61057b.equals("protocolPathToAbsPath")) {
            try {
                String optString = new JSONObject(this.f168426a).optString("protocolPath");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("absPath", optString);
                return mo232446a(jSONObject);
            } catch (Exception e) {
                AppBrandLogger.m52829e("FileSystemManagerSync", e);
                return mo232445a(e);
            }
        } else {
            AbstractC24899a aVar = null;
            String str = this.f61057b;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1574561970:
                    if (str.equals("unlinkSync")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1528590803:
                    if (str.equals("rmdirSync")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1251412231:
                    if (str.equals("renameSync")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1142033889:
                    if (str.equals("accessSync")) {
                        c = 3;
                        break;
                    }
                    break;
                case -799949100:
                    if (str.equals("saveFileSync")) {
                        c = 4;
                        break;
                    }
                    break;
                case -734079374:
                    if (str.equals("readdirSync")) {
                        c = 5;
                        break;
                    }
                    break;
                case -271906454:
                    if (str.equals("mkdirSync")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1317686031:
                    if (str.equals("statSync")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1431909580:
                    if (str.equals("copyFileSync")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1713034038:
                    if (str.equals("writeFileSync")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 2112368109:
                    if (str.equals("readFileSync")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    aVar = new C24910k(this.f61057b);
                    break;
                case 1:
                    aVar = new C24907h(this.f61057b);
                    break;
                case 2:
                    aVar = new C24906g(this.f61057b);
                    break;
                case 3:
                    aVar = new C24902c(this.f61057b);
                    break;
                case 4:
                    aVar = new C24908i(this.f61057b);
                    break;
                case 5:
                    aVar = new C24905f(this.f61057b);
                    break;
                case 6:
                    aVar = new C24904e(this.f61057b);
                    break;
                case 7:
                    aVar = new C24909j(this.f61057b);
                    break;
                case '\b':
                    aVar = new C24903d(this.f61057b);
                    break;
                case '\t':
                    aVar = new C24921b(this.f61057b);
                    break;
                case '\n':
                    aVar = new C24918b(this.f61057b);
                    break;
            }
            if (aVar != null) {
                aVar.mo87971a(mo232455f());
                apiCallResult = (ApiCallResult) aVar.mo87974b((Object) this.f168426a);
            } else {
                String format = String.format("api is not supported in app: %s", this.f61057b);
                AppBrandLogger.m52829e("FileSystemManagerSync", format);
                apiCallResult = ApiCallResult.Builder.createFail(this.f61057b).extraInfo(format).build();
            }
            return apiCallResult.toString();
        }
    }

    public C24913n(String str) {
        this.f61057b = str;
    }

    public C24913n(String str, String str2) {
        super(str2);
        this.f61057b = str;
    }
}

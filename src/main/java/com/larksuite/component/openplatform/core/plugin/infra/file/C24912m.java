package com.larksuite.component.openplatform.core.plugin.infra.file;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.infra.file.read.C24918b;
import com.larksuite.component.openplatform.core.plugin.infra.file.write.C24921b;
import com.tt.frontendapiinterface.ApiCallResult;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.infra.file.m */
public class C24912m extends ApiHandler {

    /* renamed from: a */
    private String f61056a;

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return this.f61056a;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AbstractC24899a aVar;
        ApiCallResult apiCallResult;
        String str = this.f61056a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1423461020:
                if (str.equals("access")) {
                    c = 0;
                    break;
                }
                break;
            case -1406748165:
                if (str.equals("writeFile")) {
                    c = 1;
                    break;
                }
                break;
            case -934594754:
                if (str.equals("rename")) {
                    c = 2;
                    break;
                }
                break;
            case -867956686:
                if (str.equals("readFile")) {
                    c = 3;
                    break;
                }
                break;
            case -840447469:
                if (str.equals("unlink")) {
                    c = 4;
                    break;
                }
                break;
            case -506374511:
                if (str.equals("copyFile")) {
                    c = 5;
                    break;
                }
                break;
            case 3540564:
                if (str.equals("stat")) {
                    c = 6;
                    break;
                }
                break;
            case 103950895:
                if (str.equals("mkdir")) {
                    c = 7;
                    break;
                }
                break;
            case 108628082:
                if (str.equals("rmdir")) {
                    c = '\b';
                    break;
                }
                break;
            case 111449576:
                if (str.equals("unzip")) {
                    c = '\t';
                    break;
                }
                break;
            case 1080408887:
                if (str.equals("readdir")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                aVar = new C24902c(this.f61056a);
                break;
            case 1:
                aVar = new C24921b(this.f61056a);
                break;
            case 2:
                aVar = new C24906g(this.f61056a);
                break;
            case 3:
                aVar = new C24918b(this.f61056a);
                break;
            case 4:
                aVar = new C24910k(this.f61056a);
                break;
            case 5:
                aVar = new C24903d(this.f61056a);
                break;
            case 6:
                aVar = new C24909j(this.f61056a);
                break;
            case 7:
                aVar = new C24904e(this.f61056a);
                break;
            case '\b':
                aVar = new C24907h(this.f61056a);
                break;
            case '\t':
                aVar = new C24911l(this.f61056a);
                break;
            case '\n':
                aVar = new C24905f(this.f61056a);
                break;
            default:
                aVar = null;
                break;
        }
        if (aVar != null) {
            aVar.mo87971a(getAppContext());
            apiCallResult = (ApiCallResult) aVar.mo87974b((Object) this.mArgs);
        } else {
            String format = String.format("api is not supported in app: %s", this.f61056a);
            AppBrandLogger.m52829e("FileSystemManager", format);
            apiCallResult = ApiCallResult.Builder.createFail(this.f61056a).extraInfo(format).build();
        }
        doApiHandlerCallback(apiCallResult);
    }

    public C24912m(String str) {
        this.f61056a = str;
    }

    public C24912m(String str, String str2, int i, AbstractC67619e eVar) {
        super(str2, i, eVar);
        this.f61056a = str;
    }
}

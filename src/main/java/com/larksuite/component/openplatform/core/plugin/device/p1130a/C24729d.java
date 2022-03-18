package com.larksuite.component.openplatform.core.plugin.device.p1130a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapp.permission.C66578b;
import com.tt.miniapp.util.C67032f;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3412i.AbstractC67733a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@ApiSupportType(apiName = {"setClipboardData"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.a.d */
public class C24729d extends AbstractC65797c {
    public C24729d() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("setClipboardData");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        final String str = (String) bVar.mo234984a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (str == null) {
            mo230481a(ApiCode.GENERAL_PARAM);
            return;
        }
        try {
            ((AbstractC67733a) mo230473f().findServiceByInterface(AbstractC67733a.class)).mo235103a(mo230473f().getCurrentActivity(), "getClipboardData", C66578b.C66579a.m260125j(mo230473f()), new AbstractC67540b() {
                /* class com.larksuite.component.openplatform.core.plugin.device.p1130a.C24729d.C247301 */

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87199a() {
                    AppBrandLogger.m52830i("ApiHandler", "api setClipboardData, data length" + str.length());
                    C67032f.m261249a(str, C24729d.this.mo230473f().getApplicationContext());
                    HashMap hashMap = new HashMap();
                    hashMap.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, str);
                    C24729d.this.mo230492b(ApiCallResultHelper.generateJsonObjectResponseData(hashMap));
                }

                @Override // com.tt.miniapphost.p3373f.AbstractC67540b
                /* renamed from: a */
                public void mo87200a(String str) {
                    AppBrandLogger.m52829e("ApiHandler", "clipboard permission is denied");
                    C24729d.this.mo230481a(ApiCode.GENERAL_USER_AUTH_DENIED);
                }
            });
        } catch (Exception e) {
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateThrowableExtraInfo(e));
            AppBrandLogger.m52829e("ApiHandler", "api setClipboardData fail", e);
        }
    }

    public C24729d(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}

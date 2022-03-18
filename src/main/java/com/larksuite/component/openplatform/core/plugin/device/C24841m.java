package com.larksuite.component.openplatform.core.plugin.device;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@ApiSupportType(apiName = {"onUserCaptureScreen"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.m */
public class C24841m extends AbstractC65797c {
    public C24841m() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("onUserCaptureScreen");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        if (mo230475h().mo235051f() == null) {
            AppBrandLogger.m52829e("OnUserCaptureScreenHandler", "activity is null");
            mo230482a(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateDataNullExtraInfo("activity"));
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
        mo230475h().mo235022a(mo230475h().mo235051f(), mo230472e(), hashSet, new AbstractC67709b.AbstractC67711b() {
            /* class com.larksuite.component.openplatform.core.plugin.device.C24841m.C248421 */

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87574a() {
                try {
                    C24843n.m89965b(C24841m.this.mo230473f()).mo87870a(C24841m.this.mo230473f(), C24841m.this.mo230474g());
                    C24841m.this.mo230494j();
                } catch (Exception e) {
                    AppBrandLogger.m52829e("OnUserCaptureScreenHandler", "act", e);
                    C24841m.this.mo230482a(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateThrowableExtraInfo(e));
                }
            }

            @Override // com.tt.refer.p3400a.p3401a.AbstractC67709b.AbstractC67711b
            /* renamed from: a */
            public void mo87575a(String str) {
                AppBrandLogger.m52828d("OnUserCaptureScreenHandler", "requestPermissionsIfNecessaryForResult user denied");
                C24841m.this.mo230481a(ApiCode.GENERAL_SYSTEM_AUTH_DENY);
            }
        });
    }

    public C24841m(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}

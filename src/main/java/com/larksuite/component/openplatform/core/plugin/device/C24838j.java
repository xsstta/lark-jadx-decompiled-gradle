package com.larksuite.component.openplatform.core.plugin.device;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import java.util.Collections;
import java.util.List;

@ApiSupportType(apiName = {"makePhoneCall"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
/* renamed from: com.larksuite.component.openplatform.core.plugin.device.j */
public class C24838j extends AbstractC65797c {
    public C24838j() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        return Collections.singletonList("makePhoneCall");
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        AppBrandLogger.m52830i("MakePhoneCallAsyncHandler", "start make phone call api");
        Context f = mo230475h().mo235051f();
        if (f == null) {
            f = mo230473f().getApplicationContext();
        }
        String str = (String) bVar.mo234984a("phoneNumber");
        if (!TextUtils.isEmpty(str)) {
            try {
                if (!str.startsWith("tel:")) {
                    str = "tel:" + str;
                }
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(str));
                intent.setFlags(268435456);
                f.startActivity(intent);
                mo230494j();
            } catch (Exception e) {
                AppBrandLogger.m52829e("MakePhoneCallAsyncHandler", e);
                mo230482a(ApiCode.GENERAL_UNKONW_ERROR, ApiCallResultHelper.generateThrowableExtraInfo(e));
            }
        } else {
            mo230481a(ApiCode.MAKEPHONECALL_INVALID_PHONE_NUMBER);
            AppBrandLogger.m52829e("MakePhoneCallAsyncHandler", "phone number is null");
        }
    }

    public C24838j(String str, IAppContext iAppContext) {
        super(str, iAppContext);
    }
}

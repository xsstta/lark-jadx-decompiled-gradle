package com.ss.lark.android.passport.biz.feature.sso.external;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.log.MonitorUtil;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.entity.AuthInfo;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IQRLoginService;
import com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.sso.external.b */
public class C65029b extends C49020a implements AbstractC65033d.AbstractC65034a {

    /* renamed from: c */
    private final String f163799c;

    /* renamed from: d */
    private final int f163800d;

    /* renamed from: e */
    private final AuthInfo f163801e;

    /* renamed from: f */
    private final IQRLoginService f163802f = ((IQRLoginService) ServiceFinder.m193746a(IQRLoginService.class));

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65034a
    /* renamed from: g */
    public String mo224096g() {
        return this.f163799c;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65034a
    /* renamed from: h */
    public AuthInfo mo224097h() {
        return this.f163801e;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65034a
    /* renamed from: i */
    public int mo224098i() {
        return this.f163800d;
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65034a
    /* renamed from: j */
    public void mo224099j() {
        if (this.f163802f != null) {
            if (this.f123074a != null) {
                this.f123074a.appendOneSceneMonitorParam("template", "authz");
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("template", "authz");
            hashMap.put("token", MonitorUtil.m193717b(this.f163799c));
            this.f123075b.mo171467b("n_action_auth_login_cancel_request", "External authz qrCancel", hashMap);
            this.f163802f.qrLoginCancel(this.f123074a, this.f163799c, null);
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.sso.external.AbstractC65033d.AbstractC65034a
    /* renamed from: a */
    public void mo224095a(List<String> list, IGetDataCallback<BaseStepData> iGetDataCallback) {
        if (this.f163802f != null) {
            if (this.f123074a != null) {
                this.f123074a.appendOneSceneMonitorParam("template", "authz");
            }
            HashMap hashMap = new HashMap(3);
            StringBuilder sb = new StringBuilder();
            if (list != null) {
                for (String str : list) {
                    sb.append(str);
                }
            } else {
                sb.append("null");
            }
            hashMap.put("template", "authz");
            hashMap.put("scope", sb.toString());
            hashMap.put("token", MonitorUtil.m193717b(this.f163799c));
            this.f123075b.mo171467b("n_action_auth_login_confirm_request", "External authz qrConfirm", hashMap);
            mo171171a(this.f163802f.qrLoginConfirm(this.f123074a, this.f163799c, list, false, iGetDataCallback));
        }
    }

    public C65029b(int i, String str, AuthInfo authInfo) {
        this.f163799c = str;
        this.f163801e = authInfo;
        this.f163800d = i;
    }
}

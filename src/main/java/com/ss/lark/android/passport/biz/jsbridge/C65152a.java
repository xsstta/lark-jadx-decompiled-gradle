package com.ss.lark.android.passport.biz.jsbridge;

import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.lark.android.passport.biz.jsbridge.a */
public class C65152a implements AbstractC24169l {
    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a("biz.user.userInfo.get");
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        if (!"biz.user.userInfo.get".equals(h5Event.mo86707b())) {
            return true;
        }
        if (!h5Event.mo86715i()) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        LoginInfo loginInfo = ServiceFinder.m193748c().getLoginInfo();
        if (loginInfo != null) {
            jSONObject.put("localizedName", ServiceFinder.m193752g().getDisplayName(loginInfo.getUserId()));
            jSONObject.put("userName", loginInfo.getUserName());
            jSONObject.put("userNameEn", loginInfo.getUserNameEn());
            jSONObject.put("avatarUrl", loginInfo.getAvatarUrl());
            jSONObject.put("tenantName", loginInfo.getTenantName());
            jSONObject.put("tenantIconUrl", loginInfo.getTenantIconUrl());
        }
        h5Event.mo86708b(jSONObject);
        return true;
    }
}

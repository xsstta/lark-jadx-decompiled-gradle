package com.ss.android.lark.invite_new_tenant.invite.single.mobile;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c;
import com.ss.android.lark.invite_new_tenant.p2065c.C40536a;
import com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.mobile.e */
public class C40612e extends BaseModel implements C40605c.AbstractC40606a {
    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40606a
    /* renamed from: a */
    public void mo146735a(IGetDataCallback<IInviteNewTenantService.C40630a> iGetDataCallback) {
        C40536a.m160445a().mo146645a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.invite_new_tenant.invite.single.mobile.C40605c.AbstractC40606a
    /* renamed from: a */
    public void mo146736a(IInviteNewTenantService.ContactType contactType, String str, IGetDataCallback<IInviteNewTenantService.C40631b> iGetDataCallback) {
        C40536a.m160445a().mo146646a(contactType, str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }
}

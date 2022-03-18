package com.ss.android.lark.invite_new_tenant.invite.single.email;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a;
import com.ss.android.lark.invite_new_tenant.p2065c.C40536a;
import com.ss.android.lark.invite_new_tenant.service.IInviteNewTenantService;

/* renamed from: com.ss.android.lark.invite_new_tenant.invite.single.email.c */
public class C40591c extends BaseModel implements C40585a.AbstractC40586a {
    @Override // com.ss.android.lark.invite_new_tenant.invite.single.email.C40585a.AbstractC40586a
    /* renamed from: a */
    public void mo146713a(IInviteNewTenantService.ContactType contactType, String str, IGetDataCallback<IInviteNewTenantService.C40631b> iGetDataCallback) {
        C40536a.m160445a().mo146646a(contactType, str, (IGetDataCallback) getCallbackManager().wrapAndAddCallback(iGetDataCallback));
    }
}

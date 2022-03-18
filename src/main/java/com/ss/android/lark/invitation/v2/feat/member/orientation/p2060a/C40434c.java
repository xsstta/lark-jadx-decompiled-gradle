package com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.a.c */
public class C40434c extends BaseModel implements AbstractC40429a.AbstractC40430a {
    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2060a.AbstractC40429a.AbstractC40430a
    /* renamed from: a */
    public void mo146427a(InvitationServiceApi.C40083b bVar, String str, IGetDataCallback<InvitationServiceApi.C40084c> iGetDataCallback) {
        C40147z.m159162b().invite(bVar, true, str, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}

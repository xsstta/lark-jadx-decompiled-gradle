package com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.inv.export.api.InvitationServiceApi;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.orientation.b.c */
public class C40454c extends BaseModel implements AbstractC40449a.AbstractC40450a {
    @Override // com.ss.android.lark.invitation.v2.feat.member.orientation.p2061b.AbstractC40449a.AbstractC40450a
    /* renamed from: a */
    public void mo146459a(InvitationServiceApi.C40083b bVar, String str, IGetDataCallback<InvitationServiceApi.C40084c> iGetDataCallback) {
        C40147z.m159162b().invite(bVar, false, str, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}

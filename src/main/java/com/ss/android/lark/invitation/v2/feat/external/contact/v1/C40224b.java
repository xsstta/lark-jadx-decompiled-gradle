package com.ss.android.lark.invitation.v2.feat.external.contact.v1;

import com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.contact.v1.b */
public class C40224b extends BaseModel implements AbstractC40220a.AbstractC40221a {
    @Override // com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a.AbstractC40221a
    /* renamed from: a */
    public void mo145922a(String str, IGetDataCallback<SearchUserByContactPointResponse> iGetDataCallback) {
        C40147z.m159162b().search(str, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.contact.v1.AbstractC40220a.AbstractC40221a
    /* renamed from: a */
    public void mo145923a(String str, boolean z, IGetDataCallback<SendUserInvitationResponse> iGetDataCallback) {
        C40147z.m159162b().sendContent(str, z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}

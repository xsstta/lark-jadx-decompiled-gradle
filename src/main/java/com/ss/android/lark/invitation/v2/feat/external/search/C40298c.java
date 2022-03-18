package com.ss.android.lark.invitation.v2.feat.external.search;

import com.bytedance.lark.pb.contact.v1.SearchUserByContactPointResponse;
import com.bytedance.lark.pb.contact.v1.SendUserInvitationResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.search.c */
public class C40298c extends BaseModel implements AbstractC40294a.AbstractC40295a {
    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40295a
    /* renamed from: a */
    public void mo146126a(String str, IGetDataCallback<SearchUserByContactPointResponse> iGetDataCallback) {
        C40147z.m159162b().search(str, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.invitation.v2.feat.external.search.AbstractC40294a.AbstractC40295a
    /* renamed from: a */
    public void mo146127a(String str, boolean z, IGetDataCallback<SendUserInvitationResponse> iGetDataCallback) {
        C40147z.m159162b().sendContent(str, z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback));
    }
}

package com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.lark.pb.contact.v1.GetInvitationLinkResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.AbstractC52464a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52501a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.c */
public class C52472c extends AbstractC52501a implements AbstractC52464a.AbstractC52465a {

    /* renamed from: a */
    public static final int f129936a = UIHelper.dp2px(230.0f);

    /* renamed from: b */
    public static final int f129937b = UIHelper.dp2px(230.0f);

    /* renamed from: c */
    public static final int f129938c = UIHelper.dp2px(2.0f);

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52501a
    /* renamed from: a */
    public void mo179496a(final IGetDataCallback<Bitmap> iGetDataCallback) {
        C52239a.m202617d().mo133558a(new IGetDataCallback<GetInvitationLinkResponse>() {
            /* class com.ss.android.lark.profile.func.share_profile.inviter_new_member.fragment.C52472c.C524731 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }

            /* renamed from: a */
            public void onSuccess(GetInvitationLinkResponse getInvitationLinkResponse) {
                if (iGetDataCallback != null) {
                    if (!getInvitationLinkResponse.success.booleanValue() || TextUtils.isEmpty(getInvitationLinkResponse.invitation_qr_url) || TextUtils.isEmpty(getInvitationLinkResponse.invitation_url)) {
                        iGetDataCallback.onError(new ErrorResult(-1));
                        return;
                    }
                    Bitmap a = C52239a.m202617d().mo133544a(getInvitationLinkResponse.invitation_qr_url, C52472c.f129936a, C52472c.f129937b, C52472c.f129938c);
                    if (a == null) {
                        iGetDataCallback.onError(new ErrorResult("this 2D code bitmap is null"));
                    } else {
                        iGetDataCallback.onSuccess(a);
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52510c.AbstractC52511a, com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52501a
    /* renamed from: a */
    public void mo179495a(Bitmap bitmap, IGetDataCallback<String> iGetDataCallback) {
        super.mo179495a(bitmap, iGetDataCallback);
    }
}

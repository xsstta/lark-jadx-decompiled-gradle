package com.ss.android.lark.invitation.v2.feat.member.common;

import android.text.TextUtils;
import com.bytedance.lark.pb.contact.v1.GetInvitationLinkResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.common.c */
public class C40338c {

    /* renamed from: a */
    public static final ErrorResult f102487a = new ErrorResult("no permission");

    /* renamed from: b */
    private static C40338c f102488b;

    /* renamed from: a */
    public static C40338c m159892a() {
        if (f102488b == null) {
            synchronized (C40338c.class) {
                if (f102488b == null) {
                    f102488b = new C40338c();
                }
            }
        }
        return f102488b;
    }

    /* renamed from: a */
    public void mo146228a(boolean z, String str, IGetDataCallback<MemberInvitationInfo> iGetDataCallback) {
        final UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(iGetDataCallback);
        C40147z.m159162b().getInviteNewMemberUrl(z, str, new IGetDataCallback<GetInvitationLinkResponse>() {
            /* class com.ss.android.lark.invitation.v2.feat.member.common.C40338c.C403402 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                C53241h.m205894a("InviteMemberInnerService", errorResult.getDebugMsg());
                uIGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            private void m159896a(MemberInvitationInfo memberInvitationInfo) {
                C40147z.m159161a("linkUrl", memberInvitationInfo.invUrl);
                C40147z.m159161a("qrUrl", memberInvitationInfo.qrUrl);
                C40147z.m159161a("teamCode", memberInvitationInfo.teamCode);
            }

            /* renamed from: a */
            public void onSuccess(GetInvitationLinkResponse getInvitationLinkResponse) {
                if (!getInvitationLinkResponse.success.booleanValue() || TextUtils.isEmpty(getInvitationLinkResponse.invitation_url)) {
                    C53241h.m205894a("InviteMemberInnerService", "no permission");
                    ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InviteMemberPermissionDeny);
                    uIGetDataCallback.onError(C40338c.f102487a);
                    return;
                }
                MemberInvitationInfo parseFromPb = MemberInvitationInfo.parseFromPb(getInvitationLinkResponse);
                m159896a(parseFromPb);
                uIGetDataCallback.onSuccess(parseFromPb);
            }
        });
    }

    /* renamed from: a */
    public void mo146227a(String str, ShareActionType shareActionType, final ViewUtils.C57751a aVar, IGetDataCallback<MemberInvitationInfo> iGetDataCallback) {
        if (aVar != null) {
            aVar.mo196039b();
        }
        final UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(iGetDataCallback);
        mo146228a(false, str, new IGetDataCallback<MemberInvitationInfo>() {
            /* class com.ss.android.lark.invitation.v2.feat.member.common.C40338c.C403391 */

            /* renamed from: a */
            public void onSuccess(MemberInvitationInfo memberInvitationInfo) {
                ViewUtils.C57751a aVar = aVar;
                if (aVar != null) {
                    aVar.mo196042e();
                }
                uIGetDataCallback.onSuccess(memberInvitationInfo);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                ViewUtils.C57751a aVar = aVar;
                if (aVar != null) {
                    aVar.mo196042e();
                }
                uIGetDataCallback.onError(errorResult);
                ViewUtils.m224150a(errorResult.getDisplayMsg());
            }
        });
    }
}

package com.ss.android.lark.invitation.v2.feat.member.teamCode;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.invitation.v2.feat.member.common.C40338c;
import com.ss.android.lark.invitation.v2.feat.member.teamCode.C40469a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.teamCode.c */
public class C40474c extends BasePresenter<C40469a.AbstractC40470a, C40469a.AbstractC40471b, C40469a.AbstractC40471b.AbstractC40472a> {

    /* renamed from: a */
    private String f102800a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C40469a.AbstractC40471b.AbstractC40472a createViewDelegate() {
        return new C40469a.AbstractC40471b.AbstractC40472a() {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40474c.C404751 */

            @Override // com.ss.android.lark.invitation.v2.feat.member.teamCode.C40469a.AbstractC40471b.AbstractC40472a
            /* renamed from: a */
            public void mo146504a() {
                C40474c.this.mo146507a(false);
            }

            @Override // com.ss.android.lark.invitation.v2.feat.member.teamCode.C40469a.AbstractC40471b.AbstractC40472a
            /* renamed from: b */
            public void mo146505b() {
                C40474c.this.mo146507a(true);
            }
        };
    }

    /* renamed from: a */
    public void mo146507a(final boolean z) {
        C40338c.m159892a().mo146228a(z, this.f102800a, new IGetDataCallback<MemberInvitationInfo>() {
            /* class com.ss.android.lark.invitation.v2.feat.member.teamCode.C40474c.C404762 */

            /* renamed from: a */
            public void onSuccess(MemberInvitationInfo memberInvitationInfo) {
                ((C40469a.AbstractC40471b) C40474c.this.getView()).mo146502a(memberInvitationInfo);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (C40338c.f102487a.equals(errorResult)) {
                    ((C40469a.AbstractC40471b) C40474c.this.getView()).mo146503a(UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberPermissionDeny));
                } else if (z) {
                    ((C40469a.AbstractC40471b) C40474c.this.getView()).mo146501a();
                    ViewUtils.m224150a(UIHelper.getString(R.string.Lark_Legacy_LoadFailedRetryTip));
                } else {
                    ((C40469a.AbstractC40471b) C40474c.this.getView()).mo146503a(UIHelper.getString(R.string.Lark_Legacy_LoadFailedRetryTip));
                    ViewUtils.m224150a(errorResult.getDisplayMsg());
                }
            }
        });
    }

    public C40474c(C40469a.AbstractC40470a aVar, C40469a.AbstractC40471b bVar, String str) {
        super(aVar, bVar);
        bVar.setViewDelegate(createViewDelegate());
        this.f102800a = str;
        mo146507a(false);
    }
}

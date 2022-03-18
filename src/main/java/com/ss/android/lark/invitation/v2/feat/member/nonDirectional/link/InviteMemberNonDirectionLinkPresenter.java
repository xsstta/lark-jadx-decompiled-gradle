package com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link;

import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.mvp.AbstractC40090b;
import com.ss.android.lark.inv.export.util.C40107f;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.invitation.v2.feat.member.bean.MemberInvitationInfo;
import com.ss.android.lark.invitation.v2.feat.member.nonDirectional.InviteMemberNonDirectionalActivity;
import com.ss.android.lark.invitation.v2.p2052c.C40157a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkPresenter;", "Lcom/ss/android/lark/inv/export/mvp/InvBasePresenter;", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkView;", "Lcom/ss/android/lark/invitation/v2/feat/member/nonDirectional/link/InviteMemberNonDirectionLinkMvp$Presenter;", "()V", "mInfo", "Lcom/ss/android/lark/invitation/v2/feat/member/bean/MemberInvitationInfo;", "onBindView", "", "onClickCopy", "onClickRefresh", "onClickShareLink", "updateRefreshAnim", "isStart", "", "updateView", "info", "isRefreshAction", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.member.nonDirectional.link.b */
public final class InviteMemberNonDirectionLinkPresenter extends AbstractC40090b<InviteMemberNonDirectionLinkView> {

    /* renamed from: a */
    private MemberInvitationInfo f102653a;

    @Override // com.ss.android.lark.inv.export.mvp.AbstractC40090b
    /* renamed from: a */
    public void mo145598a() {
    }

    /* renamed from: d */
    public void mo146379d() {
        InviteMemberNonDirectionalActivity inviteMemberNonDirectionalActivity = (InviteMemberNonDirectionalActivity) ((InviteMemberNonDirectionLinkView) mo145600b()).mo145593a();
        if (inviteMemberNonDirectionalActivity != null) {
            inviteMemberNonDirectionalActivity.mo146348b();
        }
    }

    /* renamed from: f */
    public void mo146381f() {
        FragmentActivity a = ((InviteMemberNonDirectionLinkView) mo145600b()).mo145593a();
        MemberInvitationInfo memberInvitationInfo = this.f102653a;
        if (memberInvitationInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        C40157a.m159180a(a, memberInvitationInfo, new InviteMemberNonDirectionLinkPresenter$onClickShareLink$1(this));
    }

    /* renamed from: e */
    public void mo146380e() {
        MemberInvitationInfo memberInvitationInfo = this.f102653a;
        if (memberInvitationInfo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mInfo");
        }
        C40107f.m159012a(memberInvitationInfo.linkMsg);
        ViewUtils.m224145a((int) R.string.Lark_Legacy_CopyReady);
        InvHitPoint.m160397n(((InviteMemberNonDirectionLinkView) mo145600b()).mo146364b());
        InvApmUtils.m158966a("ug_invite_member_nondirectional_copy", MapsKt.mapOf(TuplesKt.to(ShareHitPoint.f121869d, "link")), null, null, 12, null);
    }

    /* renamed from: a */
    public void mo146378a(boolean z) {
        ((InviteMemberNonDirectionLinkView) mo145600b()).mo146363a(z);
    }

    /* renamed from: a */
    public void mo146377a(MemberInvitationInfo memberInvitationInfo, boolean z) {
        Intrinsics.checkParameterIsNotNull(memberInvitationInfo, "info");
        this.f102653a = memberInvitationInfo;
        if (z) {
            ((InviteMemberNonDirectionLinkView) mo145600b()).mo146365b(memberInvitationInfo);
        } else {
            ((InviteMemberNonDirectionLinkView) mo145600b()).mo146362a(memberInvitationInfo);
        }
    }
}

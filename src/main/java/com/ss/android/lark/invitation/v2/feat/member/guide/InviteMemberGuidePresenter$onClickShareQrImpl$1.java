package com.ss.android.lark.invitation.v2.feat.member.guide;

import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/guide/InviteMemberGuidePresenter$onClickShareQrImpl$1", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback;", "onFailed", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/thirdshare/base/export/ShareActionType;", "error", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback$ShareError;", "onSuccess", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteMemberGuidePresenter$onClickShareQrImpl$1 extends OnShareCallback {
    final /* synthetic */ InviteMemberGuidePresenter this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    InviteMemberGuidePresenter$onClickShareQrImpl$1(InviteMemberGuidePresenter aVar) {
        this.this$0 = aVar;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onSuccess(ShareActionType shareActionType) {
        Intrinsics.checkParameterIsNotNull(shareActionType, ShareHitPoint.f121869d);
        InvApmUtils.m158966a("ug_invite_member_nondirectional_share", MapsKt.mapOf(TuplesKt.to(ShareHitPoint.f121869d, "qrcode"), TuplesKt.to("item", shareActionType.name())), null, null, 12, null);
        this.this$0.f102593b = true;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
        Intrinsics.checkParameterIsNotNull(shareActionType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(shareError, "error");
        if (Intrinsics.areEqual(shareError, OnShareCallback.NOT_INSTALLED)) {
            ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled);
        } else if (Intrinsics.areEqual(shareError, OnShareCallback.SAVE_FAILED)) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
        }
        InvApmUtils.m158961a("ug_invite_member_nondirectional_share", MapsKt.mapOf(TuplesKt.to(ShareHitPoint.f121869d, "qrcode"), TuplesKt.to("item", shareActionType.name())), shareError.getCode(), shareError.getMsg());
    }
}

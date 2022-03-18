package com.ss.android.lark.invitation.v2.feat.b2b;

import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/invitation/v2/feat/b2b/InviteB2bPresenter$onClickShareQr$1", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback;", "intercept", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/thirdshare/base/export/ShareActionType;", "onFailed", "", "error", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback$ShareError;", "onSuccess", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteB2bPresenter$onClickShareQr$1 extends OnShareCallback {
    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public boolean intercept(ShareActionType shareActionType) {
        Intrinsics.checkParameterIsNotNull(shareActionType, ShareHitPoint.f121869d);
        return false;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onSuccess(ShareActionType shareActionType) {
        Intrinsics.checkParameterIsNotNull(shareActionType, ShareHitPoint.f121869d);
    }

    InviteB2bPresenter$onClickShareQr$1() {
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
    }
}

package com.ss.android.lark.thirdshare.container.impl;

import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import com.ss.android.lark.thirdshare.container.impl.LarkShareContainerQrcodeFragment;
import com.ss.android.lark.utils.ViewUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/thirdshare/container/impl/LarkShareContainerQrcodeFragment$showSuccessView$3$shareEntity$1", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback;", "onFailed", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/thirdshare/base/export/ShareActionType;", "error", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback$ShareError;", "onSuccess", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class LarkShareContainerQrcodeFragment$showSuccessView$3$shareEntity$1 extends OnShareCallback {
    final /* synthetic */ LarkShareContainerQrcodeFragment.View$OnClickListenerC55756h this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    LarkShareContainerQrcodeFragment$showSuccessView$3$shareEntity$1(LarkShareContainerQrcodeFragment.View$OnClickListenerC55756h hVar) {
        this.this$0 = hVar;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onSuccess(ShareActionType shareActionType) {
        LarkShareContainerConfig.QrcodeCallback g = this.this$0.f137585b.mo189919g();
        if (g != null) {
            g.onSuccess(shareActionType);
        }
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
        if (Intrinsics.areEqual(shareError, OnShareCallback.NOT_INSTALLED)) {
            ViewUtils.m224145a((int) R.string.Lark_UserGrowth_InvitePeopleContactsShareNotInstalled);
        } else if (Intrinsics.areEqual(shareError, OnShareCallback.SAVE_FAILED)) {
            ViewUtils.m224145a((int) R.string.Lark_Legacy_SaveFail);
        }
        LarkShareContainerConfig.QrcodeCallback g = this.this$0.f137585b.mo189919g();
        if (g != null) {
            g.onFailed(shareActionType, shareError);
        }
    }
}

package com.ss.android.lark.invitation.v2.feat.member.debug;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"com/ss/android/lark/invitation/v2/feat/member/debug/InviteDebugActivity$showMockContainer$3$getQrcodeConfig$success$1", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$QrcodeCallback;", "noNoPermission", "", "onFailed", ShareHitPoint.f121869d, "Lcom/ss/android/lark/thirdshare/base/export/ShareActionType;", "error", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback$ShareError;", "onSaveFailed", "msg", "", "onSaveSuccess", "file", "Ljava/io/File;", "onSuccess", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class InviteDebugActivity$showMockContainer$3$getQrcodeConfig$success$1 extends LarkShareContainerConfig.QrcodeCallback {
    InviteDebugActivity$showMockContainer$3$getQrcodeConfig$success$1() {
    }

    @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55692a
    public void noNoPermission() {
        Log.m165389i("InvitationModule", "noNoPermission");
    }

    @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
    public void onSaveFailed(String str) {
        Log.m165389i("InvitationModule", "onSaveFailed");
    }

    @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
    public void onSaveSuccess(File file) {
        Log.m165389i("InvitationModule", "onSaveSuccess");
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onSuccess(ShareActionType shareActionType) {
        Intrinsics.checkParameterIsNotNull(shareActionType, ShareHitPoint.f121869d);
        Log.m165389i("InvitationModule", "onSuccess");
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
        Intrinsics.checkParameterIsNotNull(shareActionType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(shareError, "error");
        Log.m165389i("InvitationModule", "onFailed");
    }
}

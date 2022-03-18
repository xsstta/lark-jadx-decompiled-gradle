package com.bytedance.ee.bear.share.externalshare;

import com.bytedance.ee.log.C13479a;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;

public class OnIpcShareCallback extends OnShareCallback {
    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onSuccess(ShareActionType shareActionType) {
        C13479a.m54764b("ExternalShareHelper_OnIpcShareCallback", "onSuccess: shareActionType = " + shareActionType.name());
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
        C13479a.m54775e("OnIpcShareCallback", "onFailed: shareActionType = " + shareActionType.name() + ", errorCode = " + shareError.getCode() + ", errorMsg = " + shareError.getMsg());
    }
}

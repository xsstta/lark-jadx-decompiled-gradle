package com.ss.android.lark.thirdshare.base.export;

import android.os.Bundle;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.TransActivity;
import com.ss.android.lark.thirdshare.base.export.p2742d.C55723c;
import java.io.Serializable;

public class TransActivityDelegate4Share extends TransActivity.TransActivityDelegate {
    private void wrapCallback(final TransActivity transActivity, ShareEntity shareEntity) {
        final OnShareCallback callback = shareEntity.getCallback();
        shareEntity.setCallback(new OnShareCallback() {
            /* class com.ss.android.lark.thirdshare.base.export.TransActivityDelegate4Share.C556981 */

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onShow() {
                super.onShow();
                OnShareCallback onShareCallback = callback;
                if (onShareCallback != null) {
                    onShareCallback.onShow();
                }
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onDismiss(boolean z) {
                super.onDismiss(z);
                OnShareCallback onShareCallback = callback;
                if (onShareCallback != null) {
                    onShareCallback.onDismiss(z);
                }
                transActivity.finish();
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onSuccess(ShareActionType shareActionType) {
                OnShareCallback onShareCallback = callback;
                if (onShareCallback != null) {
                    onShareCallback.onSuccess(shareActionType);
                }
                transActivity.finish();
            }

            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                OnShareCallback onShareCallback = callback;
                if (onShareCallback != null) {
                    onShareCallback.onFailed(shareActionType, shareError);
                }
                transActivity.finish();
            }
        });
    }

    @Override // com.ss.android.lark.thirdshare.base.export.TransActivity.TransActivityDelegate
    public void onCreated(TransActivity transActivity, Bundle bundle) {
        super.onCreated(transActivity, bundle);
        Serializable serializableExtra = transActivity.getIntent().getSerializableExtra("extra_share_entity");
        if (serializableExtra instanceof ShareEntity) {
            ShareEntity shareEntity = (ShareEntity) serializableExtra;
            shareEntity.processIpcShareCallback();
            wrapCallback(transActivity, shareEntity);
            C55723c.m215808a(transActivity, shareEntity);
        }
    }
}

package com.ss.android.lark.thirdshare.base.export.downgrade;

import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import java.io.Serializable;

public interface ShareDowngradePanelCallback extends Serializable {
    void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError);

    void onSuccess(ShareActionType shareActionType);
}

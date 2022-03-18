package com.huawei.hms.site;

import android.text.TextUtils;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;

/* renamed from: com.huawei.hms.site.j */
public class C23758j {
    /* renamed from: a */
    public static Status m86926a(ResponseErrorCode responseErrorCode) {
        int errorCode = responseErrorCode.getErrorCode();
        String errorReason = responseErrorCode.getErrorReason();
        if (errorCode == 6003 || errorCode == 907135000 || errorCode == 907135001 || errorCode == 907135701 || errorCode == 907135702 || errorCode == 907135703 || errorCode == 907135704) {
            errorCode = Integer.parseInt("010002");
            if (TextUtils.isEmpty(errorReason)) {
                errorReason = "REQUEST_DENIED";
            }
        }
        return new Status(errorCode, errorReason);
    }
}

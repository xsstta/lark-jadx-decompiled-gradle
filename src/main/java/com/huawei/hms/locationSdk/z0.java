package com.huawei.hms.locationSdk;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;

public class z0<TResult> {

    /* renamed from: a */
    private static final byte[] f58445a = new byte[0];

    /* renamed from: b */
    private static volatile z0 f58446b;

    /* renamed from: a */
    public static z0 m86140a() {
        if (f58446b == null) {
            synchronized (f58445a) {
                if (f58446b == null) {
                    f58446b = new z0();
                }
            }
        }
        return f58446b;
    }

    /* renamed from: a */
    public void mo83549a(C23433g<TResult> gVar, ResponseErrorCode responseErrorCode, TResult tresult) throws Exception {
        int i = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        if (gVar == null || responseErrorCode == null) {
            throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
        }
        int errorCode = responseErrorCode.getErrorCode();
        String errorReason = responseErrorCode.getErrorReason();
        HMSLog.m86966i("ServiceErrorCodeAdaptor", "set task by error code:" + responseErrorCode.getErrorCode() + ",reason:" + responseErrorCode.getErrorReason());
        if (responseErrorCode.getErrorCode() < 10000 || responseErrorCode.getErrorCode() > 10099) {
            i = errorCode;
        } else {
            errorReason = y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        }
        if (i == 0) {
            gVar.mo81846a((Object) tresult);
        } else {
            gVar.mo81845a((Exception) new ApiException(new Status(i, errorReason)));
        }
    }
}

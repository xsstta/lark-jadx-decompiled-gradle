package com.huawei.hms.locationSdk;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;

public class l0 extends c0<C23663p, Void> {

    /* renamed from: b */
    private a0 f58415b;

    public l0(String str, String str2, String str3, a0 a0Var, String str4) {
        super(str, str2, str3, str4);
        this.f58415b = a0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doExecute(C23663p pVar, ResponseErrorCode responseErrorCode, String str, C23433g<Void> gVar) {
        try {
            u0.m86106c("RemoveLocationUpdatesTaskApiCall", this.f58396a, "doExecute");
            if (responseErrorCode != null) {
                if (responseErrorCode.getErrorCode() == 0 || responseErrorCode.getErrorCode() == 10104) {
                    C23677z.m86138b().mo83546c(this.f58415b);
                }
                z0.m86140a().mo83549a(gVar, responseErrorCode, null);
                return;
            }
            throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
        } catch (Exception unused) {
            u0.m86105b("RemoveLocationUpdatesTaskApiCall", this.f58396a, "doExecute exception");
            gVar.mo81845a(new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
        }
    }
}

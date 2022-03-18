package com.huawei.hms.locationSdk;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;

public class k0 extends c0<C23667r, Void> {
    public k0(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doExecute(C23667r rVar, ResponseErrorCode responseErrorCode, String str, C23433g<Void> gVar) {
        try {
            u0.m86106c("RemoveGeofencesTaskApiCall", this.f58396a, "doExecute");
            if (responseErrorCode != null) {
                z0.m86140a().mo83549a(gVar, responseErrorCode, null);
                return;
            }
            throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
        } catch (ApiException e) {
            String str2 = this.f58396a;
            u0.m86105b("RemoveGeofencesTaskApiCall", str2, "doExecute exception:" + e.getMessage());
            gVar.mo81845a(e);
        } catch (Exception unused) {
            u0.m86105b("RemoveGeofencesTaskApiCall", this.f58396a, "doExecute exception");
            gVar.mo81845a(new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
        }
    }
}

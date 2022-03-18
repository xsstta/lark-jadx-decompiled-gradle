package com.huawei.hms.locationSdk;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.support.api.client.Status;
import org.json.JSONObject;

public class e0 extends c0<C23663p, HWLocation> {
    public e0(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doExecute(C23663p pVar, ResponseErrorCode responseErrorCode, String str, C23433g<HWLocation> gVar) {
        try {
            u0.m86106c("GetLastLocationTaskApiCall", this.f58396a, "doExecute");
            if (responseErrorCode != null) {
                HWLocation hWLocation = null;
                if (responseErrorCode.getErrorCode() == 0) {
                    hWLocation = w0.m86119a(new JSONObject(str));
                }
                z0.m86140a().mo83549a(gVar, responseErrorCode, hWLocation);
                return;
            }
            throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
        } catch (ApiException e) {
            String str2 = this.f58396a;
            u0.m86105b("GetLastLocationTaskApiCall", str2, "doExecute exception:" + e.getMessage());
            gVar.mo81845a(e);
        } catch (Exception unused) {
            u0.m86105b("GetLastLocationTaskApiCall", this.f58396a, "doExecute exception");
            gVar.mo81845a(new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40000000;
    }
}

package com.huawei.hms.locationSdk;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.locationavailability.GetLocationAvailabilityResponse;
import com.huawei.hms.utils.JsonUtil;

public class g0 extends c0<C23663p, LocationAvailability> {
    public g0(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doExecute(C23663p pVar, ResponseErrorCode responseErrorCode, String str, C23433g<LocationAvailability> gVar) {
        try {
            u0.m86106c("GetLocationAvailabilityTaskApiCall", this.f58396a, "doExecute");
            if (responseErrorCode != null) {
                LocationAvailability locationAvailability = null;
                if (responseErrorCode.getErrorCode() == 0) {
                    locationAvailability = ((GetLocationAvailabilityResponse) JsonUtil.jsonToEntity(str, new GetLocationAvailabilityResponse())).getLocationAvailability();
                }
                z0.m86140a().mo83549a(gVar, responseErrorCode, locationAvailability);
                return;
            }
            throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
        } catch (Exception unused) {
            u0.m86105b("GetLocationAvailabilityTaskApiCall", this.f58396a, "doExecute exception");
            gVar.mo81845a(new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
        }
    }
}

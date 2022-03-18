package com.huawei.hms.locationSdk;

import android.app.PendingIntent;
import android.os.Parcelable;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.LocationSettingsResponse;
import com.huawei.hms.location.LocationSettingsResult;
import com.huawei.hms.location.LocationSettingsStates;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.JsonUtil;
import org.json.JSONObject;

public class d0 extends c0<C23663p, LocationSettingsResponse> {
    public d0(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doExecute(C23663p pVar, ResponseErrorCode responseErrorCode, String str, C23433g<LocationSettingsResponse> gVar) {
        LocationSettingsResponse locationSettingsResponse;
        Status status;
        try {
            u0.m86106c("CheckLocationSettingsTaskApiCall", this.f58396a, "doExecute");
            if (responseErrorCode != null) {
                Status status2 = null;
                LocationSettingsStates locationSettingsStates = null;
                if (responseErrorCode.getErrorCode() == 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("statusCheck")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("statusCheck");
                        Parcelable parcelable = responseErrorCode.getParcelable();
                        PendingIntent pendingIntent = (parcelable == null || !(parcelable instanceof PendingIntent)) ? null : (PendingIntent) parcelable;
                        int i = -100;
                        if (jSONObject2.has(HiAnalyticsConstant.HaKey.BI_KEY_RESULT)) {
                            i = jSONObject2.getInt(HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
                        }
                        status = new Status(i, jSONObject2.has("statusMessage") ? jSONObject2.getString("statusMessage") : "", pendingIntent);
                    } else {
                        status = null;
                    }
                    if (jSONObject.has("locationSettingsStates")) {
                        locationSettingsStates = new LocationSettingsStates();
                        JsonUtil.jsonToEntity(jSONObject.getJSONObject("locationSettingsStates").toString(), locationSettingsStates);
                        locationSettingsStates.setGnssPresent(locationSettingsStates.isGpsPresent());
                        locationSettingsStates.setGnssUsable(locationSettingsStates.isGpsUsable());
                    }
                    LocationSettingsResult locationSettingsResult = new LocationSettingsResult();
                    locationSettingsResult.setLocationSettingsStates(locationSettingsStates);
                    locationSettingsResult.setStatus(status);
                    locationSettingsResponse = new LocationSettingsResponse(locationSettingsResult);
                    status2 = status;
                } else {
                    locationSettingsResponse = null;
                }
                if (status2 == null || status2.getStatusCode() != 6) {
                    z0.m86140a().mo83549a(gVar, responseErrorCode, locationSettingsResponse);
                } else {
                    gVar.mo81845a(new ResolvableApiException(status2));
                }
            } else {
                throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            }
        } catch (Exception unused) {
            u0.m86105b("CheckLocationSettingsTaskApiCall", this.f58396a, "doExecute exception");
            gVar.mo81845a(new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
        }
    }
}

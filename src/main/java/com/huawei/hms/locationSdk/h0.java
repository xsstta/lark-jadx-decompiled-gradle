package com.huawei.hms.locationSdk;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.NavigationResult;
import com.huawei.hms.support.api.client.Status;
import org.json.JSONObject;

public class h0 extends c0<C23666q, NavigationResult> {
    public h0(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doExecute(C23666q qVar, ResponseErrorCode responseErrorCode, String str, C23433g<NavigationResult> gVar) {
        try {
            u0.m86106c("GetNavigationContextStateTaskApiCall", this.f58396a, "doExecute");
            if (responseErrorCode != null) {
                responseErrorCode.getErrorCode();
                u0.m86104a("GetNavigationContextStateTaskApiCall", this.f58396a, "getNavigationContextState message start");
                JSONObject jSONObject = new JSONObject(str);
                NavigationResult navigationResult = new NavigationResult();
                navigationResult.setState(jSONObject.getInt("environment"));
                navigationResult.setPossibility(jSONObject.getInt("confidence"));
                z0.m86140a().mo83549a(gVar, responseErrorCode, navigationResult);
                u0.m86104a("GetNavigationContextStateTaskApiCall", this.f58396a, "getNavigationContextState message success");
                return;
            }
            throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
        } catch (ApiException e) {
            e.getStatusCode();
            String str2 = this.f58396a;
            u0.m86105b("GetNavigationContextStateTaskApiCall", str2, "doExecute exception:" + e.getMessage());
            gVar.mo81845a(e);
        } catch (Exception unused) {
            u0.m86105b("GetNavigationContextStateTaskApiCall", this.f58396a, "doExecute exception");
            gVar.mo81845a(new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
        }
    }
}

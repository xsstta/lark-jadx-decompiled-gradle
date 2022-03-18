package com.huawei.hms.site;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.site.api.model.NearbySearchResponse;
import com.huawei.hms.site.api.model.TextSearchResponse;

/* renamed from: com.huawei.hms.site.c */
public class C23749c extends TaskApiCall {
    public C23749c(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(AnyClient anyClient, ResponseErrorCode responseErrorCode, String str, C23433g gVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            NearbySearchResponse nearbySearchResponse = (NearbySearchResponse) C23760l.m86929a(str, NearbySearchResponse.class);
            if (nearbySearchResponse == null) {
                C23761m.m86935b("NearbySearchTaskApiCall", "call nearbySearch from kit, response error");
                gVar.mo81846a(new TextSearchResponse());
                return;
            }
            gVar.mo81846a(nearbySearchResponse);
            return;
        }
        StringBuilder a = C23738a.m86922a("responseErrorCode errorCode = ");
        a.append(responseErrorCode.getErrorCode());
        a.append(" errorReason = ");
        a.append(responseErrorCode.getErrorReason());
        C23761m.m86935b("NearbySearchTaskApiCall", a.toString());
        gVar.mo81845a((Exception) new ApiException(C23758j.m86926a(responseErrorCode)));
    }
}

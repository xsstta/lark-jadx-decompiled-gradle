package com.huawei.hms.site;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.site.api.model.DetailSearchResponse;
import com.huawei.hms.site.api.model.TextSearchResponse;

/* renamed from: com.huawei.hms.site.b */
public class C23748b extends TaskApiCall {
    public C23748b(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(AnyClient anyClient, ResponseErrorCode responseErrorCode, String str, C23433g gVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            DetailSearchResponse detailSearchResponse = (DetailSearchResponse) C23760l.m86929a(str, DetailSearchResponse.class);
            if (detailSearchResponse == null) {
                C23761m.m86935b("DetailSearchTaskApiCall", "call detailSearch from kit, response error");
                gVar.mo81846a(new TextSearchResponse());
                return;
            }
            gVar.mo81846a(detailSearchResponse);
            return;
        }
        StringBuilder a = C23738a.m86922a("responseErrorCode errorCode = ");
        a.append(responseErrorCode.getErrorCode());
        a.append(" errorReason = ");
        a.append(responseErrorCode.getErrorReason());
        C23761m.m86935b("DetailSearchTaskApiCall", a.toString());
        gVar.mo81845a((Exception) new ApiException(C23758j.m86926a(responseErrorCode)));
    }
}

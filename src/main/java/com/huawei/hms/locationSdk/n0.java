package com.huawei.hms.locationSdk;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;

public class n0 extends c0<C23660o, Void> {

    /* renamed from: b */
    private C23671v f58419b;

    public n0(String str, String str2, C23671v vVar) {
        super(str, str2, vVar.mo83541a());
        this.f58419b = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doExecute(C23660o oVar, ResponseErrorCode responseErrorCode, String str, C23433g<Void> gVar) {
        try {
            u0.m86106c("RequestActivityUpdatesTaskApiCall", this.f58396a, "doExecute");
            if (responseErrorCode != null) {
                if (responseErrorCode.getErrorCode() == 0) {
                    C23674w.m86117b().mo83544a(this.f58419b);
                }
                z0.m86140a().mo83549a(gVar, responseErrorCode, null);
                return;
            }
            throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
        } catch (Exception unused) {
            u0.m86105b("RequestActivityUpdatesTaskApiCall", this.f58396a, "doExecute exception");
            gVar.mo81845a(new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT))));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 4;
    }
}

package com.huawei.hms.locationSdk;

import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import org.json.JSONObject;

public class q0 extends c0<C23663p, Void> {

    /* renamed from: b */
    private a0 f58428b;

    public q0(String str, String str2, String str3, a0 a0Var, String str4) {
        super(str, str2, str3, str4);
        this.f58428b = a0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void doExecute(C23663p pVar, ResponseErrorCode responseErrorCode, String str, C23433g<Void> gVar) {
        ApiException e;
        u0.m86106c("RequestLocationUpdatesWithIntentTaskApiCall", this.f58396a, "doExecute");
        if (responseErrorCode != null) {
            try {
                if (responseErrorCode.getErrorCode() == 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    a0 a0Var = (a0) C23677z.m86138b().mo83545b(this.f58428b);
                    this.f58428b = a0Var;
                    if (a0Var != null) {
                        if (a0Var.mo83483d() != null) {
                            if (jSONObject.has("locationResult")) {
                                int size = w0.m86123b(jSONObject).getLocations().size();
                                int f = this.f58428b.mo83486f();
                                String str2 = this.f58396a;
                                u0.m86106c("RequestLocationUpdatesWithIntentTaskApiCall", str2, "modify numUpdates with callback, numUpdates:" + f + " , locationSize:" + size);
                                if (f > 0) {
                                    if (f >= size) {
                                        if (f == size) {
                                            u0.m86106c("RequestLocationUpdatesWithIntentTaskApiCall", this.f58396a, "modify numUpdates last need remove request");
                                            C23643b.m86020b(pVar.getContext(), (C23668s) null).mo83497a(this.f58428b.mo83479b());
                                        }
                                        C23677z.m86138b().mo83548a(this.f58428b, f - size);
                                        return;
                                    }
                                }
                                u0.m86106c("RequestLocationUpdatesWithIntentTaskApiCall", this.f58396a, "modify numUpdates exception need remove request");
                                C23643b.m86020b(pVar.getContext(), (C23668s) null).mo83497a(this.f58428b.mo83479b());
                                return;
                            }
                        }
                    }
                    u0.m86105b("RequestLocationUpdatesWithIntentTaskApiCall", this.f58396a, "INTERNAL_ERROR : doExecute requestLocationUpdatesCache is null");
                    return;
                }
                C23677z.m86138b().mo83546c(this.f58428b);
                z0.m86140a().mo83549a(gVar, responseErrorCode, null);
            } catch (ApiException e2) {
                e = e2;
                C23677z.m86138b().mo83546c(this.f58428b);
                String str3 = this.f58396a;
                u0.m86105b("RequestLocationUpdatesWithIntentTaskApiCall", str3, "doExecute exception:" + e.getMessage());
                gVar.mo81845a(e);
            } catch (Exception unused) {
                C23677z.m86138b().mo83546c(this.f58428b);
                u0.m86105b("RequestLocationUpdatesWithIntentTaskApiCall", this.f58396a, "doExecute exception");
                e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
                gVar.mo81845a(e);
            }
        } else {
            C23677z.m86138b().mo83546c(this.f58428b);
            throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 4;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 40000000;
    }
}

package com.huawei.hms.locationSdk;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.location.NavigationRequest;
import com.huawei.hms.location.NavigationResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.common.LocationNaming;
import com.huawei.hms.support.api.entity.location.enhance.RequestNavigationStateRequest;
import com.huawei.hms.utils.JsonUtil;

/* renamed from: com.huawei.hms.locationSdk.k */
public class C23656k extends HuaweiApi<C23668s> implements AbstractC23654i {

    /* renamed from: a */
    private static final C23655j f58413a = new C23655j();

    /* renamed from: b */
    private static final Api<C23668s> f58414b = new Api<>("HmsLocation.API");

    public C23656k(Activity activity, C23668s sVar) {
        super(activity, (Api) f58414b, (Api.ApiOptions) sVar, (AbstractClientBuilder) f58413a);
    }

    public C23656k(Context context, C23668s sVar) {
        super(context, f58414b, sVar, f58413a);
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23654i
    /* renamed from: a */
    public AbstractC23432f<NavigationResult> mo83513a(NavigationRequest navigationRequest) {
        C23433g gVar = new C23433g();
        RequestNavigationStateRequest requestNavigationStateRequest = new RequestNavigationStateRequest(getContext());
        String tid = requestNavigationStateRequest.getTid();
        if (navigationRequest != null) {
            try {
                requestNavigationStateRequest.setNavigationRequest(navigationRequest);
                return doWrite(new h0(LocationNaming.GET_NAVIGATION_CONTEXT_STATE, JsonUtil.createJsonString(requestNavigationStateRequest), requestNavigationStateRequest.getTid()));
            } catch (ApiException e) {
                e = e;
                u0.m86105b("EnhanceClientImpl", tid, "getNavigationState api exception:" + e.getMessage());
                gVar.mo81845a((Exception) e);
                return gVar.mo81844a();
            } catch (Exception unused) {
                u0.m86105b("EnhanceClientImpl", tid, "getNavigationState exception");
                e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
                gVar.mo81845a((Exception) e);
                return gVar.mo81844a();
            }
        } else {
            throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 2;
    }
}

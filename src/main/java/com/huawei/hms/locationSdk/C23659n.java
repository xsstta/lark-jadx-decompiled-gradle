package com.huawei.hms.locationSdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.api.CommonStatusCodes;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.location.GeofenceErrorCodes;
import com.huawei.hms.location.GeofenceRequest;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.entity.location.common.LocationNaming;
import com.huawei.hms.support.api.entity.location.fence.AddGeofencesRequest;
import com.huawei.hms.support.api.entity.location.fence.RemoveGeofencesRequest;
import com.huawei.hms.utils.JsonUtil;
import java.util.List;

/* renamed from: com.huawei.hms.locationSdk.n */
public class C23659n extends HuaweiApi<C23668s> implements AbstractC23657l {

    /* renamed from: a */
    private static final C23658m f58417a = new C23658m();

    /* renamed from: b */
    private static final Api<C23668s> f58418b = new Api<>("HmsLocation.API");

    public C23659n(Activity activity, C23668s sVar) {
        super(activity, (Api) f58418b, (Api.ApiOptions) sVar, (AbstractClientBuilder) f58417a);
    }

    public C23659n(Context context, C23668s sVar) {
        super(context, f58418b, sVar, f58417a);
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23657l
    /* renamed from: a */
    public AbstractC23432f<Void> mo83517a(PendingIntent pendingIntent) {
        long currentTimeMillis = System.currentTimeMillis();
        C23433g gVar = new C23433g();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        if (pendingIntent != null) {
            try {
                k0 k0Var = new k0(LocationNaming.REMOVE_GEOFENCES, JsonUtil.createJsonString(locationBaseRequest), tid);
                k0Var.setParcelable(pendingIntent);
                AbstractC23432f<Void> doWrite = doWrite(k0Var);
                long currentTimeMillis2 = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder();
                sb.append("removeGeofences sdk useTime:");
                long j = currentTimeMillis2 - currentTimeMillis;
                sb.append(j);
                u0.m86106c("LocationGeofenceClientImpl", tid, sb.toString());
                Log.i("LocationGeofenceClientImpl", "removeGeofences sdk useTime:" + j);
                return doWrite;
            } catch (ApiException e) {
                u0.m86105b("LocationGeofenceClientImpl", tid, "removeGeofences api exception:" + e.getMessage());
                gVar.mo81845a((Exception) e);
                long currentTimeMillis3 = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("removeGeofences sdk useTime:");
                long j2 = currentTimeMillis3 - currentTimeMillis;
                sb2.append(j2);
                u0.m86106c("LocationGeofenceClientImpl", tid, sb2.toString());
                Log.i("LocationGeofenceClientImpl", "removeGeofences sdk useTime:" + j2);
                return gVar.mo81844a();
            }
        } else {
            throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23657l
    /* renamed from: a */
    public AbstractC23432f<Void> mo83518a(GeofenceRequest geofenceRequest, PendingIntent pendingIntent) {
        C23433g gVar = new C23433g();
        AddGeofencesRequest addGeofencesRequest = new AddGeofencesRequest(getContext());
        String tid = addGeofencesRequest.getTid();
        if (geofenceRequest == null || pendingIntent == null) {
            throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
        }
        try {
            if (x0.m86130b(getContext())) {
                addGeofencesRequest.setGeofencingRequest(geofenceRequest);
                b0 b0Var = new b0(LocationNaming.ADD_GEOFENCES, JsonUtil.createJsonString(addGeofencesRequest), tid);
                b0Var.setParcelable(pendingIntent);
                return doWrite(b0Var);
            }
            throw new ApiException(new Status(GeofenceErrorCodes.GEOFENCE_INSUFFICIENT_PERMISSION, CommonStatusCodes.getStatusCodeString(GeofenceErrorCodes.GEOFENCE_INSUFFICIENT_PERMISSION)));
        } catch (ApiException e) {
            u0.m86105b("LocationGeofenceClientImpl", tid, "addGeofences api exception:" + e.getMessage());
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23657l
    /* renamed from: a */
    public AbstractC23432f<Void> mo83519a(List<String> list) {
        C23433g gVar = new C23433g();
        RemoveGeofencesRequest removeGeofencesRequest = new RemoveGeofencesRequest(getContext());
        String tid = removeGeofencesRequest.getTid();
        if (list != null) {
            try {
                if (list.size() != 0) {
                    removeGeofencesRequest.setGeofenceRequestIds(list);
                    return doWrite(new k0(LocationNaming.REMOVE_GEOFENCES, JsonUtil.createJsonString(removeGeofencesRequest), tid));
                }
            } catch (ApiException e) {
                u0.m86105b("LocationGeofenceClientImpl", tid, "removeGeofences api exception:" + e.getMessage());
                gVar.mo81845a((Exception) e);
                return gVar.mo81844a();
            }
        }
        throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 51000300;
    }
}

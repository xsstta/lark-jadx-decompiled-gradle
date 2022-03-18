package com.huawei.hms.locationSdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.huawei.hmf.tasks.AbstractC23432f;
import com.huawei.hmf.tasks.C23433g;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.location.ActivityConversionInfo;
import com.huawei.hms.location.ActivityConversionRequest;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.activityrecognition.RequestActivityConversionRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.entity.location.common.LocationNaming;
import com.huawei.hms.utils.JsonUtil;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.locationSdk.e */
public class C23646e extends HuaweiApi<C23668s> implements AbstractC23644c {

    /* renamed from: a */
    private static final C23645d f58397a = new C23645d();

    /* renamed from: b */
    private static final Api<C23668s> f58398b = new Api<>("HmsLocation.API");

    public C23646e(Activity activity, C23668s sVar) {
        super(activity, (Api) f58398b, (Api.ApiOptions) sVar, (AbstractClientBuilder) f58397a);
    }

    public C23646e(Context context, C23668s sVar) {
        super(context, f58398b, sVar, f58397a);
    }

    /* renamed from: a */
    private void m86031a(String str) throws ApiException {
        if (Build.VERSION.SDK_INT <= 28) {
            if (!x0.m86131b(getContext(), "com.huawei.hms.permission.ACTIVITY_RECOGNITION")) {
                u0.m86105b("LocationArClientImpl", str, "requestActivityUpdates isPermissionAvailable is false ");
                throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
            }
        } else if (!x0.m86131b(getContext(), "android.permission.ACTIVITY_RECOGNITION")) {
            u0.m86105b("LocationArClientImpl", str, "android Q requestActivityUpdates isPermissionAvailable is false ");
            throw new ApiException(new Status(10803, y0.getStatusCodeString(10803)));
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23644c
    /* renamed from: a */
    public AbstractC23432f<Void> mo83490a(long j, PendingIntent pendingIntent) {
        String uuid = UUID.randomUUID().toString();
        u0.m86106c("LocationArClientImpl", uuid, "createActivityIdentificationUpdates begin");
        C23433g gVar = new C23433g();
        if (pendingIntent != null) {
            try {
                m86031a(uuid);
                if (j >= 0) {
                    C23671v vVar = new C23671v();
                    vVar.mo83534a(pendingIntent);
                    vVar.mo83542a(uuid);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("detectionIntervalMillis", j);
                    jSONObject.put("locTransactionId", uuid);
                    n0 n0Var = new n0(LocationNaming.REQUEST_ACTIVITY_IDENTIFICATION_UPDATES, jSONObject.toString(), vVar);
                    n0Var.setParcelable(pendingIntent);
                    return doWrite(n0Var);
                }
                throw new ApiException(new Status(10802, y0.getStatusCodeString(10802)));
            } catch (ApiException e) {
                e = e;
                u0.m86105b("LocationArClientImpl", uuid, "createActivityIdentificationUpdates api exception:" + e.getMessage());
                gVar.mo81845a((Exception) e);
                return gVar.mo81844a();
            } catch (Exception unused) {
                u0.m86105b("LocationArClientImpl", uuid, "createActivityIdentificationUpdates exception");
                e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
                gVar.mo81845a((Exception) e);
                return gVar.mo81844a();
            }
        } else {
            throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23644c
    /* renamed from: a */
    public AbstractC23432f<Void> mo83491a(PendingIntent pendingIntent) {
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        u0.m86106c("LocationArClientImpl", tid, "deleteActivityIdentificationUpdates begin");
        C23433g gVar = new C23433g();
        if (pendingIntent != null) {
            try {
                C23671v vVar = new C23671v();
                vVar.mo83534a(pendingIntent);
                C23671v vVar2 = (C23671v) C23674w.m86117b().mo83545b(vVar);
                if (vVar2 != null) {
                    u0.m86105b("LocationArClientImpl", tid, "deleteActivityIdentificationUpdates cannot find cache");
                    tid = vVar2.mo83541a();
                }
                locationBaseRequest.setTid(tid);
                vVar.mo83542a(tid);
                j0 j0Var = new j0(LocationNaming.REMOVE_ACTIVITY_IDENTIFICATION_UPDATES, JsonUtil.createJsonString(locationBaseRequest), vVar);
                j0Var.setParcelable(pendingIntent);
                return doWrite(j0Var);
            } catch (ApiException e) {
                e = e;
                u0.m86105b("LocationArClientImpl", tid, "deleteActivityIdentificationUpdates api exception:" + e.getMessage());
                gVar.mo81845a((Exception) e);
                return gVar.mo81844a();
            } catch (Exception unused) {
                u0.m86105b("LocationArClientImpl", tid, "deleteActivityIdentificationUpdates exception");
                e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
                gVar.mo81845a((Exception) e);
                return gVar.mo81844a();
            }
        } else {
            throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23644c
    /* renamed from: a */
    public AbstractC23432f<Void> mo83492a(ActivityConversionRequest activityConversionRequest, PendingIntent pendingIntent) {
        RequestActivityConversionRequest requestActivityConversionRequest = new RequestActivityConversionRequest(getContext());
        String tid = requestActivityConversionRequest.getTid();
        u0.m86106c("LocationArClientImpl", tid, "createActivityConversionUpdates begin");
        C23433g gVar = new C23433g();
        if (activityConversionRequest == null || pendingIntent == null) {
            throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
        }
        try {
            m86031a(tid);
            List<ActivityConversionInfo> activityConversions = activityConversionRequest.getActivityConversions();
            if (!t0.m86101a(activityConversions)) {
                for (ActivityConversionInfo activityConversionInfo : activityConversions) {
                    int conversionType = activityConversionInfo.getConversionType();
                    int activityType = activityConversionInfo.getActivityType();
                    if (conversionType != 0) {
                        if (conversionType != 1) {
                            throw new ApiException(new Status(10802, y0.getStatusCodeString(10802)));
                        }
                    }
                    if (!ActivityIdentificationData.isValidType(activityType)) {
                        throw new ApiException(new Status(10802, y0.getStatusCodeString(10802)));
                    }
                }
            }
            C23669t tVar = new C23669t();
            tVar.mo83532a(pendingIntent);
            tVar.mo83542a(tid);
            requestActivityConversionRequest.setActivityConversions(activityConversionRequest.getActivityConversions());
            m0 m0Var = new m0(LocationNaming.REQUEST_ACTIVITY_CONVERSION_UPDATES, JsonUtil.createJsonString(requestActivityConversionRequest), tVar);
            m0Var.setParcelable(pendingIntent);
            return doWrite(m0Var);
        } catch (ApiException e) {
            e = e;
            u0.m86105b("LocationArClientImpl", tid, "createActivityConversionUpdates api exception");
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        } catch (Exception unused) {
            u0.m86105b("LocationArClientImpl", tid, "createActivityConversionUpdates exception");
            e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
            gVar.mo81845a((Exception) e);
            return gVar.mo81844a();
        }
    }

    @Override // com.huawei.hms.locationSdk.AbstractC23644c
    /* renamed from: b */
    public AbstractC23432f<Void> mo83493b(PendingIntent pendingIntent) {
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        u0.m86106c("LocationArClientImpl", tid, "deleteActivityConversionUpdates begin");
        C23433g gVar = new C23433g();
        if (pendingIntent != null) {
            try {
                C23669t tVar = new C23669t();
                tVar.mo83532a(pendingIntent);
                C23669t tVar2 = (C23669t) C23670u.m86102b().mo83545b(tVar);
                if (tVar2 != null) {
                    u0.m86105b("LocationArClientImpl", tid, "deleteActivityConversionUpdates cannot find cache");
                    tid = tVar2.mo83541a();
                }
                locationBaseRequest.setTid(tid);
                tVar.mo83542a(tid);
                i0 i0Var = new i0(LocationNaming.REMOVE_ACTIVITY_CONVERSION_UPDATES, JsonUtil.createJsonString(locationBaseRequest), tVar);
                i0Var.setParcelable(pendingIntent);
                return doWrite(i0Var);
            } catch (ApiException e) {
                e = e;
                u0.m86105b("LocationArClientImpl", tid, "deleteActivityConversionUpdates api exception:" + e.getMessage());
                gVar.mo81845a((Exception) e);
                return gVar.mo81844a();
            } catch (Exception unused) {
                u0.m86105b("LocationArClientImpl", tid, "deleteActivityConversionUpdates exception");
                e = new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
                gVar.mo81845a((Exception) e);
                return gVar.mo81844a();
            }
        } else {
            throw new ApiException(new Status(10801, y0.getStatusCodeString(10801)));
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 51000300;
    }
}

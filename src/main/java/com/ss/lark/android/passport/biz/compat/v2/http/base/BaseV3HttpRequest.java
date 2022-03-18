package com.ss.lark.android.passport.biz.compat.v2.http.base;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.http.p1952a.AbstractC38759a;
import com.ss.android.lark.http.p1953b.C38762c;
import com.ss.android.lark.passport.env.C48998a;
import com.ss.android.lark.passport.infra.base.network.C49081e;
import com.ss.android.lark.passport.infra.base.network.TerminalType;
import com.ss.android.lark.passport.infra.base.p2423a.C49012c;
import com.ss.android.lark.passport.infra.base.statistics.C49096b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49193h;
import com.ss.android.lark.passport.infra.util.C49196k;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49342a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49354b;
import com.ss.android.lark.passport.signinsdk_api.base.http.AbstractC49355c;
import com.ss.android.lark.passport.signinsdk_api.base.http.IRequest;
import com.ss.android.lark.passport.signinsdk_api.base.p2457c.AbstractC49348a;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceInfo;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.lark.android.passport.biz.C64340b;
import com.ss.lark.android.passport.biz.account.C64291a;
import com.ss.lark.android.passport.biz.compat.v1.http.C64478a;
import com.ss.lark.android.passport.biz.compat.v1.http.ResponseFilter;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.OpsiteAccountData;
import com.ss.lark.android.passport.biz.compat.v2.http.common.C64524d;
import com.ss.lark.android.passport.biz.compat.v2.http.common.CommonCodeHandlers;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class BaseV3HttpRequest<T> extends BaseRequest<V2ResponseModel<T>> implements IRequest<V2ResponseModel<T>> {
    private final SparseArray<Class> mCustomClasses = new SparseArray<>();
    protected AbstractC49354b mHttpExecutor = ServiceFinder.m193752g().getHttpExecutor();
    private AbstractC49347c mICancelable;

    /* access modifiers changed from: protected */
    public List<AbstractC64511a> getExtraCommonCodeHandler() {
        return null;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49348a getMonitorCodeCreator() {
        return null;
    }

    public abstract C64519g getRequestIntercepts();

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49355c getResponseFilter() {
        return new ResponseFilter(this);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC38759a<V2ResponseModel<T>> getObjectConverter() {
        return new C64512b(getResponseDataClass());
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public boolean isCancelable() {
        AbstractC49347c cVar = this.mICancelable;
        if (cVar != null) {
            return cVar.mo171124b();
        }
        return false;
    }

    private ArrayList<AbstractC64511a> getRequestCodeHandlers() {
        ArrayList<AbstractC64511a> arrayList = new ArrayList<>();
        if (getExtraCommonCodeHandler() != null) {
            arrayList.addAll(getExtraCommonCodeHandler());
        }
        arrayList.addAll(C64524d.m253498b());
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public SparseArray<Class> getResponseDataClass() {
        ParameterizedType parameterizedType;
        Class cls;
        SparseArray<Class> onResponseDataClass = onResponseDataClass();
        if (onResponseDataClass == null) {
            onResponseDataClass = new SparseArray<>();
        }
        onResponseDataClass.put(4205, OpsiteAccountData.class);
        if (onResponseDataClass.get(0) == null) {
            Class<?> cls2 = getClass();
            while (true) {
                if (!BaseV3HttpRequest.class.isAssignableFrom(cls2)) {
                    break;
                }
                Type genericSuperclass = cls2.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    parameterizedType = (ParameterizedType) genericSuperclass;
                } else {
                    parameterizedType = null;
                }
                if (parameterizedType != null && parameterizedType.getActualTypeArguments().length == 1 && (cls = (Class) parameterizedType.getActualTypeArguments()[0]) != null) {
                    onResponseDataClass.put(0, cls);
                    break;
                }
                cls2 = cls2.getSuperclass();
            }
        }
        C49193h.m193947a(onResponseDataClass, this.mCustomClasses);
        return onResponseDataClass;
    }

    public BaseV3HttpRequest() {
        this.mHttpMethod = HttpMethod.POST;
        C49196k.m193953a(this.mHeaders, "X-Request-ID", C38762c.m153059a());
        String a = C49081e.m193468a();
        if (!TextUtils.isEmpty(a)) {
            C49196k.m193953a(this.mHeaders, "X-Request-ID", a);
        }
        String b = C49081e.m193469b();
        if (!TextUtils.isEmpty(b)) {
            C49196k.m193953a(this.mHeaders, "X-Locale", b);
            C49196k.m193953a(this.mHeaders, "Locale", b);
        }
        C49196k.m193953a(this.mHeaders, "X-Terminal-Type", Integer.toString(TerminalType.ANDROID.getValue()));
        C49196k.m193953a(this.mHeaders, "X-Device-Info", getDeviceInfo());
        C49196k.m193953a(this.mHeaders, "X-Api-Version", "1.0.0");
        C49196k.m193953a(this.mHeaders, "Content-Type", "application/json");
        if (!ServiceFinder.m193752g().isPrivateKaPkg()) {
            C49196k.m193953a(this.mHeaders, "X-Passport-Unit", C48998a.f123026a.mo171069d());
        }
        mRequestBody.put("app_id", Integer.valueOf(C49121a.m193727a().mo171506b()));
    }

    private String getDeviceInfo() {
        String str;
        String deviceId = ServiceFinder.m193762q().getDeviceId();
        Context b = C64340b.m252955a().mo222860b();
        String packageName = b.getPackageName();
        try {
            str = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
        } catch (Exception e) {
            if (canLog()) {
                this.log.mo171462a(getName(), "getDeviceInfo error", e);
            }
            str = "";
        }
        StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
        if (!TextUtils.isEmpty(deviceId)) {
            sb.append("device_id");
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(Uri.encode(deviceId));
            sb.append(";");
        }
        DeviceInfo deviceInfo = ServiceFinder.m193761p().getDeviceInfo();
        if (deviceInfo == null) {
            return sb.toString();
        }
        String deviceName = deviceInfo.getDeviceName();
        String deviceModel = deviceInfo.getDeviceModel();
        String deviceOs = deviceInfo.getDeviceOs();
        String buildPackageChannel = ServiceFinder.m193752g().getBuildPackageChannel(C64340b.m252955a().mo222860b());
        if (!TextUtils.isEmpty(deviceName)) {
            sb.append("device_name");
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(Uri.encode(deviceName));
            sb.append(";");
        }
        if (!TextUtils.isEmpty(deviceOs)) {
            sb.append("device_os");
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(Uri.encode(deviceOs));
            sb.append(";");
        }
        if (!TextUtils.isEmpty(deviceModel)) {
            sb.append("device_model");
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(Uri.encode(deviceModel));
            sb.append(";");
        }
        if (!TextUtils.isEmpty(packageName)) {
            sb.append("package_name");
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(Uri.encode(packageName));
            sb.append(";");
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("lark_version");
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(Uri.encode(str));
            sb.append(";");
        }
        if (packageName != null && packageName.contains(".lite")) {
            buildPackageChannel = "saas_lite";
        }
        if (!TextUtils.isEmpty(buildPackageChannel)) {
            sb.append("channel=");
            sb.append(buildPackageChannel);
            sb.append(";");
        }
        sb.append("tt_app_id=");
        sb.append(C49121a.m193727a().mo171508c());
        sb.append(";");
        String appsFlyerUID = ServiceFinder.m193752g().getAppsFlyerUID();
        if (!TextUtils.isEmpty(appsFlyerUID)) {
            sb.append("af_id=");
            sb.append(appsFlyerUID);
            sb.append(";");
        }
        return sb.toString();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public void request(AbstractC49342a<V2ResponseModel<T>> aVar) {
        request2(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest$a */
    public static class C64510a<T> implements AbstractC49352d<V2ResponseModel<T>> {

        /* renamed from: a */
        private final AbstractC49342a<V2ResponseModel<T>> f162881a;

        /* renamed from: b */
        private final CommonCodeHandlers<V2ResponseModel<T>> f162882b;

        /* renamed from: c */
        private SparseArray<Class> f162883c = new SparseArray<>();

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo145179a(Object obj) {
            mo223174a((V2ResponseModel) ((V2ResponseModel) obj));
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            if (!this.f162882b.mo223189a(networkErrorResult, this.f162881a)) {
                AbstractC49342a<V2ResponseModel<T>> aVar = this.f162881a;
                if (aVar != null) {
                    aVar.mo171966a(networkErrorResult);
                }
                this.f162882b.mo223188a(networkErrorResult);
            }
        }

        /* renamed from: a */
        public void mo223174a(V2ResponseModel<T> v2ResponseModel) {
            AbstractC49342a<V2ResponseModel<T>> aVar = this.f162881a;
            if (aVar != null) {
                aVar.mo171968a(v2ResponseModel);
            }
            if (this.f162883c.get(v2ResponseModel.code) == null) {
                this.f162882b.mo223190a((V2ResponseModel<?>) v2ResponseModel);
            }
        }

        C64510a(AbstractC49342a<V2ResponseModel<T>> aVar, CommonCodeHandlers<V2ResponseModel<T>> eVar, SparseArray<Class> sparseArray) {
            this.f162881a = aVar;
            this.f162882b = eVar;
            if (sparseArray != null) {
                this.f162883c = sparseArray;
            }
        }
    }

    public void handleRustErrorCodeProxy(NetworkErrorResult networkErrorResult) {
        CommonCodeHandlers eVar = new CommonCodeHandlers(this);
        eVar.mo223187a(getRequestCodeHandlers());
        eVar.mo223188a(networkErrorResult);
    }

    /* access modifiers changed from: package-private */
    public void doRealRequest(AbstractC49352d<V2ResponseModel<T>> dVar) {
        String str;
        if (this.mHttpExecutor == null) {
            this.mHttpExecutor = new C64478a();
        }
        if (canLog()) {
            PassportLog passportLog = this.log;
            String name = getName();
            if (this.mHttpExecutor instanceof C64478a) {
                str = "OkHttpExecutor";
            } else {
                str = "NotOkHttpExecutor start doRealRequest";
            }
            passportLog.mo171465b(name, str);
        }
        this.mHttpExecutor.mo145177a(this, dVar);
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public void onProcessResponseHeaders(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if ("Suite-Session-Key".equalsIgnoreCase(entry.getKey())) {
                String value = entry.getValue();
                if (!TextUtils.isEmpty(value)) {
                    if (canLog()) {
                        this.log.mo171465b(getName(), "save suite token");
                    }
                    C64291a.m252809b(value);
                }
            }
        }
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.base.http.IRequest
    public AbstractC49347c request2(AbstractC49342a<V2ResponseModel<T>> aVar) {
        if (canLog()) {
            this.log.mo171465b(getName(), "start request2");
        }
        CommonCodeHandlers eVar = new CommonCodeHandlers(this);
        eVar.mo223187a(getRequestCodeHandlers());
        final C49012c cVar = new C49012c(new C64510a(aVar, eVar, this.mCustomClasses));
        C64519g requestIntercepts = getRequestIntercepts();
        if (requestIntercepts == null) {
            requestIntercepts = new C64519g(getUniContext(), new AbstractC64517e[0]);
        }
        requestIntercepts.mo223181a(this, new AbstractC49352d() {
            /* class com.ss.lark.android.passport.biz.compat.v2.http.base.BaseV3HttpRequest.C645091 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145179a(Object obj) {
                if (BaseV3HttpRequest.this.canLog()) {
                    BaseV3HttpRequest.this.log.mo171465b(BaseV3HttpRequest.this.getName(), "request2 intercept success");
                }
                BaseV3HttpRequest.this.doRealRequest(cVar);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
            /* renamed from: a */
            public void mo145178a(NetworkErrorResult networkErrorResult) {
                cVar.mo145178a(networkErrorResult);
                if (BaseV3HttpRequest.this.canLog()) {
                    BaseV3HttpRequest.this.log.mo171471d(BaseV3HttpRequest.this.getName(), PassportLog.m193687a("request2 intercept onError", networkErrorResult));
                }
                if (networkErrorResult != null) {
                    C49096b.m193574a(networkErrorResult.getErrorCode(), BaseV3HttpRequest.this.getPath());
                }
            }
        });
        this.mICancelable = cVar;
        return cVar;
    }
}

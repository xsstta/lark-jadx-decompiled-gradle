package com.ss.android.lark.passport.device.service.impl;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.passport.infra.base.network.CommonRequest;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.infra.base.network.service.RequestService;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49347c;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.entity.Devices;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007J\u0018\u0010\u0010\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eH\u0007JL\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/passport/device/service/impl/DeviceApi;", "", "()V", "TAG_DEVICE_ID", "", "TAG_DEVICE_MODEL", "TAG_DEVICE_NAME", "TAG_DEVICE_OS", "TAG_LARK_VERSION", "TAG_SDK_VERSION", "deleteDevice", "Lcom/ss/android/lark/passport/signinsdk_api/base/ICancelable;", "did", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "fetchDevices", "Lcom/ss/android/lark/passport/signinsdk_api/entity/Devices;", "updateDevice", "deviceName", "deviceModel", "deviceOs", "sdkVersion", "larkVersion", "device_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.device.service.impl.a */
public final class DeviceApi {

    /* renamed from: a */
    public static final DeviceApi f122994a = new DeviceApi();

    private DeviceApi() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/passport/device/service/impl/DeviceApi$deleteDevice$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "device_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.device.service.impl.a$a */
    public static final class C48978a implements ICallback<BaseStepData> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f122995a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return Object.class;
        }

        C48978a(IGetDataCallback iGetDataCallback) {
            this.f122995a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f122995a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<BaseStepData> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IGetDataCallback iGetDataCallback = this.f122995a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/passport/device/service/impl/DeviceApi$fetchDevices$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/entity/Devices;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "device_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.device.service.impl.a$b */
    public static final class C48979b implements ICallback<Devices> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f122996a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return Devices.class;
        }

        C48979b(IGetDataCallback iGetDataCallback) {
            this.f122996a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f122996a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<Devices> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IGetDataCallback iGetDataCallback = this.f122996a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(responseModel.getData());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/passport/device/service/impl/DeviceApi$updateDevice$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "device_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.device.service.impl.a$c */
    public static final class C48980c implements ICallback<Object> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f122997a;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return Object.class;
        }

        C48980c(IGetDataCallback iGetDataCallback) {
            this.f122997a = iGetDataCallback;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<Object> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            IGetDataCallback iGetDataCallback = this.f122997a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(responseModel);
            }
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            IGetDataCallback iGetDataCallback = this.f122997a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(C49069a.m193380a(networkErrorResult));
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m192886a(IGetDataCallback<Devices> iGetDataCallback) {
        CommonRequest a = new CommonRequest.Builder(UniContext.CONTEXT_DEVICES, false).mo171303a(HttpMethod.GET).mo171309a(true).mo171314c(false).mo171305a("/accounts/device/list").mo171310a();
        RequestService.f123287a.mo171365a(a, new C48979b(iGetDataCallback));
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m192887a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "did");
        CommonRequest a = new CommonRequest.Builder(UniContext.CONTEXT_DEVICES, false).mo171303a(HttpMethod.POST).mo171306a("device_id", (Object) str).mo171309a(true).mo171305a("/accounts/device/disable").mo171310a();
        RequestService.f123287a.mo171365a(a, new C48978a(iGetDataCallback));
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final AbstractC49347c m192888a(String str, String str2, String str3, String str4, String str5, IGetDataCallback<Object> iGetDataCallback) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("device_os", str3);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("device_name", str);
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("sdk_version", str4);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("device_model", str2);
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("lark_version", str5);
        CommonRequest a = new CommonRequest.Builder(UniContext.CONTEXT_DEVICES, false).mo171303a(HttpMethod.POST).mo171308a(linkedHashMap).mo171309a(true).mo171314c(false).mo171305a("/accounts/device/update").mo171310a();
        RequestService.f123287a.mo171365a(a, new C48980c(iGetDataCallback));
        return a;
    }
}

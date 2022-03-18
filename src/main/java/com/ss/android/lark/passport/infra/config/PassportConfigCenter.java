package com.ss.android.lark.passport.infra.config;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.google.gson.reflect.TypeToken;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.http.model.http.HttpMethod;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.infra.base.network.CommonRequest;
import com.ss.android.lark.passport.infra.base.network.service.RequestService;
import com.ss.android.lark.passport.infra.base.p2426c.p2430d.C49067a;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.GetPassportConfigData;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.utils.C57878s;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012J\u0006\u0010\u0017\u001a\u00020\u0012J\u0010\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0007H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0010\u0010 \u001a\u00020\u00102\b\u0010!\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\"\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/passport/infra/config/PassportConfigCenter;", "", "()V", "CONFIG_FILE_PATH", "", "CONFIG_SAVE_KEY", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "Lcom/ss/android/lark/passport/infra/model/GetPassportConfigData;", "CONFIG_UPDATE_BROADCAST_ACTION", "PASSPORT_CONFIG_ENV_FEISHU", "PASSPORT_CONFIG_ENV_LARK", "TAG", "mAllConfigData", "mUniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "fetchPassportConfig", "", "getConfigInfo", "Lcom/ss/android/lark/passport/infra/model/GetPassportConfigData$ConfigBean;", "usePackageConfig", "", "getConfigInfoByPackage", "getFeishuConfigInfo", "getLarkConfigInfo", "init", "uniContext", "loadConfigFromCacheIfEmpty", "onConfigChanged", "readConfigCache", "updateConfigCache", "updateConfigData", "configData", "updateConfigEnv", "configEnv", "updateConfigToPackageEnv", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.b.a */
public final class PassportConfigCenter {

    /* renamed from: a */
    public static final PassportConfigCenter f123034a = new PassportConfigCenter();

    /* renamed from: b */
    private static final Key<GetPassportConfigData> f123035b = new C49006a("key_passport_config");

    /* renamed from: c */
    private static volatile GetPassportConfigData f123036c;

    /* renamed from: d */
    private static UniContext f123037d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.b.a$a */
    public static final class C49006a implements Key<GetPassportConfigData> {

        /* renamed from: b */
        final /* synthetic */ String f123038b;

        /* renamed from: c */
        private final String f123039c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f123039c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<GetPassportConfigData>() {
                /* class com.ss.android.lark.passport.infra.config.PassportConfigCenter.C49006a.C490071 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C49006a(String str) {
            this.f123038b = str;
            this.f123039c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/passport/infra/config/PassportConfigCenter$fetchPassportConfig$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/infra/model/GetPassportConfigData;", "getConvertType", "Ljava/lang/reflect/Type;", "onError", "", "networkErrorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ResponseModel;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.b.a$b */
    public static final class C49008b implements ICallback<GetPassportConfigData> {
        C49008b() {
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public Type mo101474a() {
            return GetPassportConfigData.class;
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101475a(NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(networkErrorResult, "networkErrorResult");
            Log.m165383e("PassportConfigCenter", PassportLog.f123351c.mo171478a("getPassportConfig from net fail!", networkErrorResult));
        }

        @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
        /* renamed from: a */
        public void mo101476a(ResponseModel<GetPassportConfigData> responseModel) {
            Intrinsics.checkParameterIsNotNull(responseModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (responseModel.getData() != null) {
                Log.m165389i("PassportConfigCenter", "getPassportConfig from net success and updateConfigData");
                PassportConfigCenter aVar = PassportConfigCenter.f123034a;
                GetPassportConfigData data = responseModel.getData();
                if (data == null) {
                    Intrinsics.throwNpe();
                }
                aVar.mo171108a(data);
                PassportConfigCenter.f123034a.mo171112c();
                return;
            }
            Log.m165383e("PassportConfigCenter", "getPassportConfig from net fail! getPassportConfigResponse is NUll");
        }
    }

    private PassportConfigCenter() {
    }

    /* renamed from: d */
    public final GetPassportConfigData.ConfigBean mo171113d() {
        return mo171106a(false);
    }

    /* renamed from: e */
    public final GetPassportConfigData.ConfigBean mo171114e() {
        return mo171106a(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.b.a$c */
    static final class RunnableC49009c implements Runnable {

        /* renamed from: a */
        public static final RunnableC49009c f123040a = new RunnableC49009c();

        RunnableC49009c() {
        }

        public final void run() {
            PassportConfigCenter.f123034a.mo171111b();
            PassportConfigCenter.f123034a.mo171107a();
        }
    }

    /* renamed from: b */
    public final void mo171111b() {
        if (f123036c == null) {
            mo171108a(m192998j());
        }
    }

    /* renamed from: c */
    public final void mo171112c() {
        C49067a.m193335a(IsolateStorage.f123105c).mo171253b(f123035b, f123036c);
    }

    static {
        Key.Companion aVar = Key.f123153a;
    }

    /* renamed from: i */
    private final void m192997i() {
        Context applicationContext = ServiceFinder.m193748c().getApplicationContext();
        Intent intent = new Intent("com.ss.android.lark.passport.common.config.update");
        intent.setPackage(applicationContext.getPackageName());
        applicationContext.sendBroadcast(intent);
    }

    /* renamed from: f */
    public final GetPassportConfigData.ConfigBean mo171115f() {
        mo171111b();
        GetPassportConfigData getPassportConfigData = f123036c;
        if (getPassportConfigData == null) {
            Intrinsics.throwNpe();
        }
        GetPassportConfigData.ConfigBean configBean = getPassportConfigData.lark;
        if (configBean == null) {
            Intrinsics.throwNpe();
        }
        configBean.copyNullableParams(GetPassportConfigData.ConfigBean.getLarkDomain());
        return configBean;
    }

    /* renamed from: g */
    public final GetPassportConfigData.ConfigBean mo171116g() {
        mo171111b();
        GetPassportConfigData getPassportConfigData = f123036c;
        if (getPassportConfigData == null) {
            Intrinsics.throwNpe();
        }
        GetPassportConfigData.ConfigBean configBean = getPassportConfigData.feishu;
        if (configBean == null) {
            Intrinsics.throwNpe();
        }
        configBean.copyNullableParams(GetPassportConfigData.ConfigBean.getFeishuDomain());
        return configBean;
    }

    /* renamed from: h */
    public final void mo171117h() {
        String str;
        if (ServiceFinder.m193748c().isLarkPackage()) {
            str = "lark";
        } else {
            str = "feishu";
        }
        Log.m165389i("n_action_fetch_config", "packageEnv is:" + str);
        mo171110a(str);
    }

    /* renamed from: a */
    public final void mo171107a() {
        RequestService.f123287a.mo171365a(new CommonRequest.Builder(f123037d, false).mo171303a(HttpMethod.GET).mo171305a("/accounts/config").mo171310a(), new C49008b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0068, code lost:
        if (r5 != null) goto L_0x0096;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.ss.android.lark.passport.infra.model.GetPassportConfigData m192998j() {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.passport.infra.config.PassportConfigCenter.m192998j():com.ss.android.lark.passport.infra.model.GetPassportConfigData");
    }

    /* renamed from: a */
    public final synchronized void mo171108a(GetPassportConfigData getPassportConfigData) {
        C57878s.m224591a(f123036c);
        f123036c = getPassportConfigData;
        m192997i();
    }

    /* renamed from: a */
    public final void mo171109a(UniContext uniContext) {
        f123037d = uniContext;
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(RunnableC49009c.f123040a);
    }

    /* renamed from: a */
    public final GetPassportConfigData.ConfigBean mo171106a(boolean z) {
        boolean z2;
        if (z) {
            z2 = ServiceFinder.m193748c().isLarkPackage();
        } else {
            z2 = ServiceFinder.m193749d().isLarkConfig();
        }
        Log.m165389i("PassportConfigCenter", "getConfigInfo usePackageConfig=" + z + ", isOversea=" + z2);
        if (z2) {
            return mo171115f();
        }
        return mo171116g();
    }

    /* renamed from: a */
    public final void mo171110a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = ServiceFinder.m193749d().getDefaultConfigEnv();
        }
        String configEnv = ServiceFinder.m193749d().getConfigEnv();
        Log.m165389i("n_action_fetch_config", "updateConfigEnv env=" + str + " ,preConfigEnv=" + configEnv);
        if (!StringsKt.equals$default(str, configEnv, false, 2, null)) {
            AbstractC49370a d = ServiceFinder.m193749d();
            if (str == null) {
                Intrinsics.throwNpe();
            }
            d.saveConfigEnv(str);
            mo171107a();
        }
    }
}

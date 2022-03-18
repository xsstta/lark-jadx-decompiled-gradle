package com.ss.android.lark.larkconfig.universal;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.basic.v1.UniversalUserSetting;
import com.bytedance.lark.pb.settings.v1.GetUniversalUserSettingRequest;
import com.bytedance.lark.pb.settings.v1.GetUniversalUserSettingResponse;
import com.bytedance.lark.pb.settings.v1.UpdateUniversalUserSettingRequest;
import com.bytedance.lark.pb.settings.v1.UpdateUniversalUserSettingResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.SdkSender;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0000*\u0001\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J(\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013H\u0002J(\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013H\u0016J(\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00162\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/larkconfig/universal/UniversalUserSettingService;", "Lcom/ss/android/lark/larkconfig/universal/IUniversalUserSettingService;", "()V", "LOG_TAG", "", "pushListener", "com/ss/android/lark/larkconfig/universal/UniversalUserSettingService$pushListener$1", "Lcom/ss/android/lark/larkconfig/universal/UniversalUserSettingService$pushListener$1;", "getAllUniversalUserSetting", "", "getUniversalUserSetting", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "key", "init", "unInit", "updateUniversalUserSetting", "builder", "Lcom/bytedance/lark/pb/settings/v1/UpdateUniversalUserSettingRequest$Builder;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "", "universal_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.larkconfig.b.f */
public final class UniversalUserSettingService implements IUniversalUserSettingService {

    /* renamed from: a */
    public static final UniversalUserSettingService f104921a = new UniversalUserSettingService();

    /* renamed from: b */
    private static final C41146c f104922b = new C41146c();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/larkconfig/universal/UniversalUserSettingService$getAllUniversalUserSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "universalUserSettingMap", "universal_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.b.f$a */
    public static final class C41144a implements IGetDataCallback<Map<String, ? extends UniversalUserSetting>> {
        C41144a() {
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("UniversalUserSettingService", "get all universal user setting failed, " + errorResult.getDebugMsg());
        }

        /* renamed from: a */
        public void onSuccess(Map<String, UniversalUserSetting> map) {
            if (map != null) {
                for (Map.Entry<String, UniversalUserSetting> entry : map.entrySet()) {
                    UniversalUserSettingHandler.f104913a.mo148384a(entry.getKey(), entry.getValue());
                }
                return;
            }
            C53241h.m205894a("UniversalUserSettingService", "universal user setting map is null");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/larkconfig/universal/UniversalUserSettingService$pushListener$1", "Lcom/ss/android/lark/larkconfig/universal/IUniversalUserSettingUpdateListener;", "onUpdate", "", "universalUserSettingList", "", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "universal_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.b.f$c */
    public static final class C41146c implements IUniversalUserSettingUpdateListener {
        C41146c() {
        }

        @Override // com.ss.android.lark.larkconfig.universal.IUniversalUserSettingUpdateListener
        /* renamed from: a */
        public void mo148382a(List<UniversalUserSetting> list) {
            Intrinsics.checkParameterIsNotNull(list, "universalUserSettingList");
            for (T t : list) {
                UniversalUserSettingHandler cVar = UniversalUserSettingHandler.f104913a;
                String str = t.key;
                Intrinsics.checkExpressionValueIsNotNull(str, "universalUserSetting.key");
                cVar.mo148384a(str, t);
            }
        }
    }

    private UniversalUserSettingService() {
    }

    @Override // com.ss.android.lark.larkconfig.universal.IUniversalUserSettingService
    /* renamed from: b */
    public void mo148381b() {
        UniversalUserSettingPush.f104915a.mo148388b(f104922b);
    }

    @Override // com.ss.android.lark.larkconfig.universal.IUniversalUserSettingService
    /* renamed from: a */
    public void mo148378a() {
        UniversalUserSettingPush.f104915a.mo148386a(f104922b);
    }

    /* renamed from: c */
    public void mo148390c() {
        SdkSender.asynSendRequestNonWrap(Command.GET_UNIVERSAL_USER_SETTING, new GetUniversalUserSettingRequest.C19159a().mo65469a((Boolean) true).mo65468a(SyncDataStrategy.FORCE_SERVER), new C41144a(), C41145b.f104923a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001aB\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003* \u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00012\u000e\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.b.f$b */
    static final class C41145b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C41145b f104923a = new C41145b();

        C41145b() {
        }

        /* renamed from: a */
        public final Map<String, UniversalUserSetting> parse(byte[] bArr) {
            return GetUniversalUserSettingResponse.ADAPTER.decode(bArr).settings;
        }
    }

    @Override // com.ss.android.lark.larkconfig.universal.IUniversalUserSettingService
    /* renamed from: a */
    public UniversalUserSetting mo148377a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return UniversalUserSettingHandler.f104913a.mo148383a(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "it", "", "kotlin.jvm.PlatformType", "parse"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.b.f$e */
    public static final class C41148e<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C41148e f104926a = new C41148e();

        C41148e() {
        }

        /* renamed from: a */
        public final UniversalUserSetting parse(byte[] bArr) {
            List<UniversalUserSetting> list = UpdateUniversalUserSettingResponse.ADAPTER.decode(bArr).settings;
            Intrinsics.checkExpressionValueIsNotNull(list, "response.settings");
            return (UniversalUserSetting) CollectionsKt.firstOrNull((List) list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/larkconfig/universal/UniversalUserSettingService$updateUniversalUserSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/basic/v1/UniversalUserSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "universalUserSetting", "universal_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.larkconfig.b.f$d */
    public static final class C41147d implements IGetDataCallback<UniversalUserSetting> {

        /* renamed from: a */
        final /* synthetic */ String f104924a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f104925b;

        /* renamed from: a */
        public void onSuccess(UniversalUserSetting universalUserSetting) {
            if (universalUserSetting != null) {
                UniversalUserSettingHandler cVar = UniversalUserSettingHandler.f104913a;
                String str = universalUserSetting.key;
                Intrinsics.checkExpressionValueIsNotNull(str, "universalUserSetting.key");
                cVar.mo148384a(str, universalUserSetting);
                IGetDataCallback iGetDataCallback = this.f104925b;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(universalUserSetting);
                    return;
                }
                return;
            }
            C53241h.m205894a("UniversalUserSettingService", "universal user setting is null, key = " + this.f104924a);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C53241h.m205894a("UniversalUserSettingService", "update universal user setting failed, key = " + this.f104924a + ", " + errorResult.getDebugMsg());
        }

        C41147d(String str, IGetDataCallback iGetDataCallback) {
            this.f104924a = str;
            this.f104925b = iGetDataCallback;
        }
    }

    /* renamed from: a */
    private final void m163259a(String str, UpdateUniversalUserSettingRequest.C19223a aVar, IGetDataCallback<UniversalUserSetting> iGetDataCallback) {
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_UNIVERSAL_USER_SETTING, aVar, new C41147d(str, iGetDataCallback), C41148e.f104926a);
    }

    @Override // com.ss.android.lark.larkconfig.universal.IUniversalUserSettingService
    /* renamed from: a */
    public void mo148379a(String str, long j, IGetDataCallback<UniversalUserSetting> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        UpdateUniversalUserSettingRequest.C19223a a = new UpdateUniversalUserSettingRequest.C19223a().mo65629a(CollectionsKt.listOf(new UniversalUserSetting.C15418a().mo55923a(str).mo55922a(Long.valueOf(j)).build()));
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m163259a(str, a, iGetDataCallback);
    }

    @Override // com.ss.android.lark.larkconfig.universal.IUniversalUserSettingService
    /* renamed from: a */
    public void mo148380a(String str, boolean z, IGetDataCallback<UniversalUserSetting> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        UpdateUniversalUserSettingRequest.C19223a a = new UpdateUniversalUserSettingRequest.C19223a().mo65629a(CollectionsKt.listOf(new UniversalUserSetting.C15418a().mo55923a(str).mo55921a(Boolean.valueOf(z)).build()));
        Intrinsics.checkExpressionValueIsNotNull(a, "builder");
        m163259a(str, a, iGetDataCallback);
    }
}

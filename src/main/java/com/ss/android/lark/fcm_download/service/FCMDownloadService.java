package com.ss.android.lark.fcm_download.service;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.contact.v2.GetUserProfileRequest;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.fcm_download.FCMDownloadModule;
import com.ss.android.lark.fcm_download.IFCMDownModuleDependency;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/fcm_download/service/FCMDownloadService;", "", "()V", "fetchTenantCertification", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "core_fcm_fcm-download_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.fcm_download.a.a */
public final class FCMDownloadService {

    /* renamed from: a */
    public static final FCMDownloadService f95613a = new FCMDownloadService();

    private FCMDownloadService() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "parse", "([B)Ljava/lang/Boolean;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.fcm_download.a.a$a */
    public static final class C37230a<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C37230a f95614a = new C37230a();

        C37230a() {
        }

        /* renamed from: a */
        public final Boolean parse(byte[] bArr) {
            return GetUserProfileResponse.ADAPTER.decode(bArr).user_info.is_tenant_certification;
        }
    }

    /* renamed from: a */
    public final void mo136917a(IGetDataCallback<Boolean> iGetDataCallback) {
        String str;
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        IFCMDownModuleDependency a = FCMDownloadModule.f95612b.mo136916a();
        if (a != null) {
            str = a.mo133162b();
        } else {
            str = null;
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_USER_PROFILE_V2, new GetUserProfileRequest.C16488a().mo58770a(str).mo58767a(SyncDataStrategy.FORCE_SERVER).mo58768a(GetUserProfileRequest.Scene.BY_USER_ID), iGetDataCallback, C37230a.f95614a);
    }
}

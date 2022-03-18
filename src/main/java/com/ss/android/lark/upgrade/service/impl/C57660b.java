package com.ss.android.lark.upgrade.service.impl;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DownloadStatus;
import com.bytedance.lark.pb.basic.v1.GetNewVersionRequest;
import com.bytedance.lark.pb.basic.v1.GetNewVersionResponse;
import com.bytedance.lark.pb.basic.v1.PatchDownloadStatusRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.C26278h;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.utils.PackageChannelManager;
import java.io.IOException;

/* renamed from: com.ss.android.lark.upgrade.service.impl.b */
public class C57660b {

    /* renamed from: a */
    private AbstractC57608a f142107a = C57607a.m223662a();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.upgrade.service.impl.b$a */
    public static final class C57663a {

        /* renamed from: a */
        public static final C57660b f142111a = new C57660b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Void m223869a(byte[] bArr) throws IOException {
        return null;
    }

    /* renamed from: a */
    public static C57660b m223868a() {
        return C57663a.f142111a;
    }

    /* renamed from: a */
    public void mo195749a(Context context, String str) {
        String packageName;
        String buildPackageChannel = PackageChannelManager.getBuildPackageChannel(context);
        PatchDownloadStatusRequest.C15111a a = new PatchDownloadStatusRequest.C15111a().mo55114a(str).mo55116b("Android").mo55112a(DownloadStatus.DOWNLOAD_STATUS_SUCCESS);
        if (PackageChannelManager.isKABuildPackage(context)) {
            a.mo55117c(buildPackageChannel);
        }
        if (!(context == null || (packageName = context.getPackageName()) == null || !packageName.contains(".lite"))) {
            a.mo55113a(PatchDownloadStatusRequest.AppType.FEISHULITE);
        }
        SdkSender.asynSendRequestNonWrap(Command.PATCH_DOWNLOAD_STATUS, a, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.upgrade.service.impl.C57660b.C576611 */

            /* renamed from: a */
            public void onSuccess(Void r1) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }
        }, $$Lambda$b$D4B89PKo0aK5VDY47CwxuOMncE.INSTANCE);
    }

    /* renamed from: a */
    public void mo195750a(Context context, boolean z, final IGetDataCallback<NewVersionResponse> iGetDataCallback) {
        String packageName;
        String a = C26246a.m94977a(context);
        String d = this.f142107a.mo177710d();
        String e = this.f142107a.mo177711e();
        String c = C57607a.m223662a().mo177709c();
        String buildPackageChannel = PackageChannelManager.getBuildPackageChannel(context);
        String oSVersion = DeviceUtils.getOSVersion();
        String brand = DeviceUtils.getBrand();
        GetNewVersionRequest.C14977a a2 = new GetNewVersionRequest.C14977a().mo54770b("Android").mo54767a(a).mo54772c(d).mo54773d(e).mo54774e(c).mo54775f(buildPackageChannel).mo54776g(oSVersion).mo54777h(brand).mo54778i(DeviceUtils.getModel()).mo54779j(DeviceUtils.getRomVersion()).mo54769b(Boolean.valueOf(C26278h.m95144a())).mo54771c(Boolean.valueOf(C26278h.m95145a(context))).mo54766a(Boolean.valueOf(z));
        if (PackageChannelManager.isKABuildPackage(context)) {
            a2.mo54780k(buildPackageChannel);
        }
        if (!(context == null || (packageName = context.getPackageName()) == null || !packageName.contains(".lite"))) {
            a2.mo54765a(GetNewVersionRequest.AppType.FEISHULITE);
        }
        SdkSender.asynSendRequestNonWrap(Command.GET_NEW_VERSION, a2, iGetDataCallback, new SdkSender.IParser<NewVersionResponse>() {
            /* class com.ss.android.lark.upgrade.service.impl.C57660b.C576622 */

            /* renamed from: a */
            public NewVersionResponse parse(byte[] bArr) throws IOException {
                GetNewVersionResponse getNewVersionResponse;
                try {
                    getNewVersionResponse = GetNewVersionResponse.ADAPTER.decode(bArr);
                } catch (Exception e) {
                    Log.m165397w("VersionService", e.getMessage());
                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                    if (iGetDataCallback != null) {
                        iGetDataCallback.onError(new ErrorResult("get new version fail"));
                    }
                    getNewVersionResponse = null;
                }
                NewVersionResponse newVersionResponse = new NewVersionResponse(getNewVersionResponse.has_new.booleanValue(), C57659a.m223867a(getNewVersionResponse.data), C57659a.m223866a(getNewVersionResponse.plan), getNewVersionResponse.reason);
                Log.m165389i("VersionService", "getNewAppVersion hasNew >" + newVersionResponse.isHasNew() + " reason > " + newVersionResponse.getReason());
                return newVersionResponse;
            }
        });
    }
}

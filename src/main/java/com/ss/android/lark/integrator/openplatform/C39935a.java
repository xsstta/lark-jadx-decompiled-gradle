package com.ss.android.lark.integrator.openplatform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.C1711a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.bytedance.lark.pb.basic.v1.KaInitConfig;
import com.bytedance.lark.pb.device.v1.SetDeviceRequest;
import com.bytedance.lark.pb.tool.v1.InitNetRequest;
import com.bytedance.lark.pb.tool.v1.SetCurrentUserRequest;
import com.bytedance.lark.pb.tool.v1.SetCurrentUserResponse;
import com.bytedance.lark.sdk.Sdk;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.integrator.littleapp.LittleAppModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.passport_api.IPassportApi;
import com.ss.android.lark.sdk.AbstractC53235b;
import com.ss.android.lark.sdk.AbstractC53238e;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.C53254m;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57840j;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.PackageChannelManager;
import com.ss.android.lark.utils.UIHelper;
import com.tt.miniapphost.host.HostDependManager;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.integrator.openplatform.a */
public class C39935a {

    /* renamed from: a */
    private static C39940a f101635a;

    /* renamed from: b */
    private static boolean f101636b;

    /* renamed from: d */
    public static void m158524d() {
        C53254m.m205924a(new AbstractC53238e() {
            /* class com.ss.android.lark.integrator.openplatform.C39935a.C399361 */

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: b */
            public boolean mo102654b() {
                return false;
            }

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: c */
            public int mo102655c() {
                return 1;
            }

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: d */
            public boolean mo102656d() {
                return true;
            }

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: a */
            public String mo102652a() {
                return ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            }

            @Override // com.ss.android.lark.sdk.AbstractC53238e
            /* renamed from: a */
            public boolean mo102653a(Command command) {
                if (command == Command.SET_DEVICE || command == Command.MAKE_USER_ONLINE || command == Command.GET_INIT_SETTINGS) {
                    return true;
                }
                return false;
            }
        });
    }

    /* renamed from: b */
    public static void m158522b() {
        Log.m165379d("MailProcessInitorImpl", "afterDecompressSo");
        if (C57840j.m224507c()) {
            C1711a.m7628a("ttv8");
            C1711a.m7628a("j2v8");
            C1711a.m7628a("file-stat");
        }
    }

    /* renamed from: a */
    public static void m158517a() {
        Log.m165379d("MailProcessInitorImpl", "decompressSo");
        C57840j.m224506b().mo196191c("smartprogram", "videoplayer");
        if (C57840j.m224506b().mo196189a("smartprogram", "videoplayer")) {
            C39940a aVar = f101635a;
            if (aVar != null) {
                aVar.mo144970a(true);
            }
            m158522b();
        }
    }

    /* renamed from: e */
    public static void m158525e() {
        InitNetRequest.C19713a aVar = new InitNetRequest.C19713a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitNetRequest.HostAlias.OPEN);
        arrayList.add(InitNetRequest.HostAlias.MINA);
        arrayList.add(InitNetRequest.HostAlias.DOCS_API);
        aVar.mo66816a(arrayList);
        SdkSender.asynSendRequestNonWrap(Command.INIT_NET, aVar, null, new SdkSender.IParser<byte[]>() {
            /* class com.ss.android.lark.integrator.openplatform.C39935a.C399394 */

            /* renamed from: a */
            public byte[] parse(byte[] bArr) throws IOException {
                return new byte[0];
            }
        });
    }

    /* renamed from: c */
    public static void m158523c() {
        if (!f101636b) {
            SetCurrentUserRequest.C19749a aVar = new SetCurrentUserRequest.C19749a();
            String userId = ((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getUserId();
            if (TextUtils.isEmpty(userId)) {
                Log.m165389i("MailProcessInitorImpl", "initUserIdToRustSdk fail : user id is null");
                return;
            }
            try {
                aVar.mo66903a(Long.decode(userId));
                SdkSender.syncSendMayError(Command.SET_CURRENT_USER_ID, aVar, $$Lambda$a$YSUzgLGDd4ut0S8v7LiWHSVgZM.INSTANCE);
                f101636b = true;
            } catch (NumberFormatException e) {
                Log.m165383e("MailProcessInitorImpl", " initUserIdToRustSdk user id format error : " + e.getMessage() + " original user id : " + userId);
            }
        }
    }

    /* renamed from: com.ss.android.lark.integrator.openplatform.a$a */
    public static class C39940a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        private boolean f101637a;

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo144970a(boolean z) {
            this.f101637a = z;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            Log.m165379d("MailProcessInitorImpl", "onActivityCreated check");
            if (!this.f101637a) {
                Log.m165379d("MailProcessInitorImpl", "onActivityCreated check failed");
                C39935a.m158517a();
                return;
            }
            Log.m165379d("MailProcessInitorImpl", "onActivityCreated check success");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m158516a(byte[] bArr) throws IOException {
        return SetCurrentUserResponse.ADAPTER.decode(bArr).toString();
    }

    /* renamed from: a */
    public static void m158518a(Context context) {
        if (context.getApplicationContext() instanceof Application) {
            f101635a = new C39940a();
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(f101635a);
        }
    }

    /* renamed from: a */
    public static void m158521a(String str) {
        SetDeviceRequest.C16592a aVar = new SetDeviceRequest.C16592a();
        aVar.mo59022a(str).mo59025b(Build.VERSION.RELEASE).mo59026c(Build.MODEL).mo59027d(UIHelper.getAppName()).mo59028e(((IPassportApi) ApiUtils.getApi(IPassportApi.class)).getDevicePlatform());
        SdkSender.asynSendRequestNonWrap(Command.SET_DEVICE, aVar, null, new SdkSender.IParser<byte[]>() {
            /* class com.ss.android.lark.integrator.openplatform.C39935a.C399383 */

            /* renamed from: a */
            public byte[] parse(byte[] bArr) throws IOException {
                return new byte[0];
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m158520a(com.bytedance.lark.pb.basic.v1.InitSDKRequest.C15029a r6) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.openplatform.C39935a.m158520a(com.bytedance.lark.pb.basic.v1.InitSDKRequest$a):void");
    }

    /* renamed from: a */
    public static void m158519a(Context context, IAppContext iAppContext) {
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).initTTNet(context);
        DynamicConfigModule.m145552b().mo136167a();
        C53254m.m205921a(new AbstractC53235b() {
            /* class com.ss.android.lark.integrator.openplatform.C39935a.C399372 */

            @Override // com.ss.android.lark.sdk.AbstractC53235b
            /* renamed from: a */
            public void mo102657a() {
            }

            @Override // com.ss.android.lark.sdk.AbstractC53235b
            /* renamed from: b */
            public void mo102658b() {
                LittleAppModuleProvider.m157932a().mo148943b().mo149176b(true);
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).noticeClientEvent(false);
            }
        });
        IPassportApi iPassportApi = (IPassportApi) ApiUtils.getApi(IPassportApi.class);
        InitSDKRequest.C15029a aVar = new InitSDKRequest.C15029a();
        InitSDKRequest.EnvV2 envV2 = new InitSDKRequest.EnvV2(InitSDKRequest.EnvV2.Type.fromValue(iPassportApi.envType()), iPassportApi.getUserUnit(), "");
        aVar.mo54914a(context.getFilesDir().getAbsolutePath() + "/miniapp").mo54905a(InitSDKRequest.EnvType.fromValue(iPassportApi.oldSdkEnv())).mo54906a(envV2).mo54925i(DynamicConfigModule.m145555d()).mo54917b(C26246a.m94977a(context)).mo54923g(C57881t.m224635g(context)).mo54909a(InitSDKRequest.ProcessType.NETWORK).mo54919c((String) HostDependManager.getInst().getHostData(2002, "", iAppContext)).mo54920d(String.valueOf(C29410a.m108287a().mo104277a()));
        if (PackageChannelManager.isKABuildPackage(context)) {
            KaInitConfig.C15033a aVar2 = new KaInitConfig.C15033a();
            aVar2.mo54934a(PackageChannelManager.getBuildPackageChannel(context));
            boolean z = true;
            if (!PackageChannelManager.isKABuildPackage(context) || PackageChannelManager.getDeployMode(context) == 1) {
                z = false;
            }
            aVar2.mo54933a(Boolean.valueOf(z));
            if (z) {
                aVar2.mo54936b(DynamicConfigModule.m145555d());
            }
            aVar.mo54910a(aVar2.build());
        }
        try {
            m158520a(aVar);
        } catch (Exception e) {
            Log.m165384e("MailProcessInitorImpl", "initWithCertificate", e);
        }
        iPassportApi.interceptRustInitRequest(aVar);
        try {
            Sdk.getInstance().initSDK(context, aVar);
            Sdk.addPushObserver(C53248k.m205912a());
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable th) {
            Sdk.notifyEndInitSdk();
            throw th;
        }
        Sdk.notifyEndInitSdk();
        m158523c();
        Log.m165389i("MailProcessInitorImpl", "-----sdk init finished-----");
    }
}

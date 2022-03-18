package com.ss.android.lark.littleapp.service.p2132a;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e;
import com.bytedance.ee.lark.infra.config.mina.v2.C12745c;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.AboutDebugActivity;
import com.bytedance.ee.larkbrand.C12941a;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.abtest.experiment.C12961d;
import com.bytedance.ee.larkbrand.abtest.experiment.C12964g;
import com.bytedance.ee.larkbrand.p643a.p645b.C12952b;
import com.bytedance.ee.larkbrand.permission.AbstractC13298i;
import com.bytedance.ee.ref.impl.host.HostInterface;
import com.bytedance.lark.pb.basic.v1.AppFeed;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.openplatform.v1.PushAppFeedResponse;
import com.bytedance.lark.pb.openplatform.v1.PushTenantMiniprogramNeedUpdateRequest;
import com.bytedance.lark.pb.openplatform.v1.SetAppNotificationReadRequest;
import com.bytedance.lark.pb.openplatform.v1.SetAppNotificationReadResponse;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.openplatform.core.plugin.passport.C25464i;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26252ad;
import com.larksuite.suite.R;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.applink.AppLink;
import com.ss.android.lark.http.netstate.AbstractC38769a;
import com.ss.android.lark.http.netstate.C38770b;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.littleapp.C41343f;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.entity.LittleAppPermissionData;
import com.ss.android.lark.littleapp.entity.RouteDriveSDKModel;
import com.ss.android.lark.littleapp.entity.RouteFileDetailModel;
import com.ss.android.lark.littleapp.entity.RoutePasswordVerifyModel;
import com.ss.android.lark.littleapp.entity.RouteProfileModel;
import com.ss.android.lark.littleapp.entity.RouteQRModel;
import com.ss.android.lark.littleapp.entity.RouteShareModel;
import com.ss.android.lark.littleapp.entity.ShareAppModel;
import com.ss.android.lark.littleapp.p2124b.AbstractC41301a;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.optrace.core.C48939c;
import com.ss.android.lark.optrace.p2413c.C48936b;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57840j;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.tt.miniapp.debug.InspectDebugHelper;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.C66653c;
import com.tt.miniapp.process.manager.C66656e;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.manager.api.IAppSandboxEnvManagerService;
import com.tt.miniapp.settings.v2.C66751b;
import com.tt.miniapp.settings.v2.handler.C66802u;
import com.tt.miniapp.util.C67018a;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.appbase.C67466a;
import com.tt.miniapphost.data.C67485a;
import com.tt.miniapphost.data.C67489c;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3362a.p3367e.C67460f;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import io.reactivex.functions.Consumer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.service.a.d */
public class C41437d implements ILittleAppService {

    /* renamed from: a */
    public final C41343f f105339a = new C41343f();

    /* renamed from: b */
    public boolean f105340b;

    /* renamed from: c */
    public Context f105341c;

    /* renamed from: d */
    private final C41454c f105342d = new C41454c();

    /* renamed from: e */
    private final ArrayList<AbstractC41453b> f105343e = new ArrayList<>();

    /* renamed from: f */
    private ILittleAppService.AbstractC41416a f105344f;

    /* renamed from: g */
    private boolean f105345g = false;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.littleapp.service.a.d$a */
    public static final class C41452a {

        /* renamed from: a */
        public static final C41437d f105395a = new C41437d();
    }

    /* renamed from: com.ss.android.lark.littleapp.service.a.d$b */
    public interface AbstractC41453b {
        /* renamed from: a */
        void mo149212a();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public int mo149141a(int i) {
        int i2 = 1509;
        if (i != 1509) {
            i2 = 1510;
            if (i != 1510) {
                i2 = 1516;
                if (i != 1516) {
                    switch (i) {
                        case 1:
                            return 1069;
                        case 2:
                            return 1011;
                        case 3:
                            return 1012;
                        case 4:
                            return 1007;
                        case 5:
                            return 1009;
                        case 6:
                            return 1010;
                        case 7:
                            return 1037;
                        default:
                            switch (i) {
                                case 9:
                                    return 1504;
                                case 10:
                                    return CommonCode.StatusCode.API_CLIENT_EXPIRED;
                                case 11:
                                    return 1515;
                                case HwBuildEx.VersionCodes.EMUI_5_1:
                                    return 1514;
                                default:
                                    return 1000;
                            }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: e */
    public static C41437d m164411e() {
        return C41452a.f105395a;
    }

    /* renamed from: i */
    private boolean m164415i() {
        return this.f105345g;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149148a(Context context, int i, String str) {
        mo149144a();
        for (IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType : C66645a.m260337a().mo232361c()) {
            if (sandBoxEnvType != null) {
                mo149199a(context, i, str, sandBoxEnvType);
            }
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149149a(Context context, int i, String str, IGetDataCallback<Boolean> iGetDataCallback) {
        mo149144a();
        for (IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType : C66645a.m260337a().mo232361c()) {
            if (sandBoxEnvType != null) {
                m164408a(context, i, str, sandBoxEnvType, iGetDataCallback);
            }
        }
    }

    /* renamed from: a */
    public void mo149199a(final Context context, final int i, final String str, final IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType) {
        mo149144a();
        C67866g.m264032c(new Runnable() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.AnonymousClass12 */

            public void run() {
                C41437d.this.mo149198a(context, i, str, C66645a.m260337a().mo232355a(sandBoxEnvType), (IGetDataCallback<Boolean>) null);
            }
        });
    }

    /* renamed from: a */
    public synchronized void mo149198a(final Context context, final int i, final String str, final IAppSandboxEnvProcessor iAppSandboxEnvProcessor, final IGetDataCallback<Boolean> iGetDataCallback) {
        if (!this.f105339a.mo148923a()) {
            AppBrandLogger.m52829e("LittleAppService", "preloadProcess, not support mini app." + i);
        } else if (!C12961d.m53370b() || !m164409b(i)) {
            AppBrandLogger.m52828d("LittleAppService", " Libra say do not preload process!" + i);
        } else if (this.f105345g) {
            AppBrandLogger.m52830i("LittleAppService", "preloadProcess when init finished, from: " + i + ", reason: " + str);
            this.f105339a.mo148915a(context, i, str, iAppSandboxEnvProcessor, iGetDataCallback);
            this.f105340b = true;
        } else {
            this.f105343e.add(new AbstractC41453b() {
                /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.AnonymousClass14 */

                @Override // com.ss.android.lark.littleapp.service.p2132a.C41437d.AbstractC41453b
                /* renamed from: a */
                public void mo149212a() {
                    AppBrandLogger.m52830i("LittleAppService", "preloadProcess when init finished, from: " + i + ", reason: " + str);
                    C41437d.this.f105339a.mo148915a(context, i, str, iAppSandboxEnvProcessor, iGetDataCallback);
                    C41437d.this.f105340b = true;
                }
            });
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149171a(String str) {
        mo149144a();
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!this.f105344f.mo144278a(parse) || parse.getQueryParameter("appId") == null || !"/client/mini_program/open".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149151a(final Context context, final String str, final int i) {
        mo149144a();
        C57840j.m224506b().mo196190b("smartprogram", "videoplayer").subscribe(new Consumer<Boolean>() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.AnonymousClass15 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (bool.booleanValue()) {
                    C41437d.this.mo149204c(context, str, i);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo149200a(Context context, String str, C25464i.AbstractC25468c cVar) {
        mo149144a();
        this.f105339a.mo148917a(context, str, cVar);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149150a(Context context, String str) {
        mo149144a();
        if (!TextUtils.isEmpty(str)) {
            m164412f(context, str);
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149158a(boolean z) {
        mo149144a();
        if (LarkExtensionManager.getInstance().getExtension() != null) {
            C12941a.m53323a(LarkExtensionManager.getInstance().getExtension().mo49565b());
        }
        AbstractC67433a k = C67448a.m262353a().mo234192k();
        if (k == null) {
            k = C67448a.m262353a().mo234190i();
        }
        C12941a.m53324a(z, k);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149152a(Context context, String str, String str2, int i) {
        mo149144a();
        mo149204c(context, C12941a.m53315a(str, str2), i);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149153a(Context context, String str, String str2, int i, String str3) {
        mo149144a();
        mo149151a(context, str2, i);
        mo149201a(str, str3);
        this.f105342d.mo149220a(str, str2);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149155a(Context context, String str, String str2, String str3, int i, String str4) {
        mo149144a();
        mo149151a(context, str3, i);
        mo149201a(str, str4);
        this.f105342d.mo149220a(str, str3);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149165a(Context context, RouteProfileModel routeProfileModel) {
        mo149144a();
        if (this.f105344f == null || routeProfileModel == null || TextUtils.isEmpty(routeProfileModel.mo148855b())) {
            return false;
        }
        return this.f105344f.mo144283b(context, routeProfileModel.mo148855b(), routeProfileModel.mo148857c());
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149166a(Context context, RouteQRModel routeQRModel) {
        mo149144a();
        ILittleAppService.AbstractC41416a aVar = this.f105344f;
        if (aVar == null || routeQRModel == null) {
            return false;
        }
        return aVar.mo144289c(context, routeQRModel.mo148864b(), routeQRModel.mo148866c(), routeQRModel.mo148868d());
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149167a(Context context, RouteShareModel routeShareModel) {
        mo149144a();
        ILittleAppService.AbstractC41416a aVar = this.f105344f;
        if (aVar == null || routeShareModel == null) {
            return false;
        }
        return aVar.mo144275a(context, routeShareModel.mo148873b(), routeShareModel.mo148874c(), routeShareModel.mo148875d(), 20008);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149168a(Context context, ShareAppModel shareAppModel) {
        mo149144a();
        return this.f105344f.mo144273a(context, shareAppModel, 20008);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149163a(Context context, RouteFileDetailModel routeFileDetailModel) {
        mo149144a();
        if (this.f105344f == null || routeFileDetailModel == null || TextUtils.isEmpty(routeFileDetailModel.mo148829b())) {
            return false;
        }
        return this.f105344f.mo144293d(context, routeFileDetailModel.mo148829b(), routeFileDetailModel.mo148830c(), routeFileDetailModel.f105130a);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149162a(Context context, RouteDriveSDKModel routeDriveSDKModel) {
        mo149144a();
        if (this.f105344f == null || routeDriveSDKModel == null || TextUtils.isEmpty(routeDriveSDKModel.mo148823b())) {
            return false;
        }
        return this.f105344f.mo144276a(context, routeDriveSDKModel.f105126a, routeDriveSDKModel.mo148823b(), routeDriveSDKModel.mo148824c(), routeDriveSDKModel.f105127b);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149164a(Context context, RoutePasswordVerifyModel routePasswordVerifyModel) {
        mo149144a();
        ILittleAppService.AbstractC41416a aVar = this.f105344f;
        if (aVar == null || routePasswordVerifyModel == null) {
            return false;
        }
        return aVar.mo144288c(context, routePasswordVerifyModel.mo148840b(), routePasswordVerifyModel.mo148841c());
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149169a(Context context, ILittleAppService.AbstractC41419d dVar) {
        mo149144a();
        if (C41354g.m163939a() != null && context != null) {
            return C41354g.m163939a().startPasswordVerifyActivity(context, dVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startPasswordVerify context is null ");
        sb.append(context == null);
        Log.m165383e("LittleAppService", sb.toString());
        return false;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149160a(Activity activity, int i, boolean z, boolean z2, boolean z3) {
        mo149144a();
        if (C41354g.m163939a() == null || activity == null) {
            Log.m165383e("LittleAppService", "openLarkPhotoPicker mDependency is null ");
            return false;
        }
        C41354g.m163939a().openLarkPhotoPicker(activity, i, z, z2, z3);
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149170a(Context context, String str, String str2) {
        mo149144a();
        if (C41354g.m163939a() == null || TextUtils.isEmpty(str) || !(context instanceof Activity)) {
            return false;
        }
        C41354g.m163939a().openBrowser((Activity) context, str, str2);
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149156a(Context context, String str, String str2, List<LittleAppPermissionData> list, AppType appType, String str3, Integer num) {
        mo149144a();
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            C41343f fVar = this.f105339a;
            if (fVar != null) {
                fVar.mo148920a(context, str, str2, list, appType, str3, num);
            }
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149154a(Context context, String str, String str2, AppType appType, AbstractC13298i iVar) {
        C41343f fVar;
        mo149144a();
        if (!TextUtils.isEmpty(str) && (fVar = this.f105339a) != null) {
            fVar.mo148919a(context, str, str2, appType, iVar);
        }
    }

    /* renamed from: a */
    public void mo149202a(byte[] bArr, String str, boolean z, boolean z2) {
        this.f105342d.mo149221a(bArr, str, z, z2);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149161a(Context context, Bundle bundle) {
        mo149144a();
        this.f105344f.mo144257a(context, bundle);
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public boolean mo149159a(Activity activity, int i, boolean z) {
        mo149144a();
        C58557a.m227127a().mo198520e(1).mo198514b(true).mo198509a(z).mo198510a(activity, i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo149201a(String str, String str2) {
        SetAppNotificationReadRequest.C18711a aVar = new SetAppNotificationReadRequest.C18711a();
        aVar.mo64363a(str).mo64365b(str2);
        SdkSender.asynSendRequestNonWrap(Command.SET_APP_NOTIFICATION_READ, aVar, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.C414497 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Log.m165389i("LittleAppService", "set_app_notification_read success");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("LittleAppService", errorResult.toString());
            }
        }, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.C414508 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                SetAppNotificationReadResponse.ADAPTER.decode(bArr);
                return true;
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: c */
    public void mo149180c() {
        mo149144a();
        this.f105339a.mo148925b();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: b */
    public void mo149172b() {
        mo149144a();
        try {
            this.f105339a.mo148927c();
        } catch (Exception e) {
            Log.m165384e("LittleAppService", "killAllProcess error ", e);
            e.printStackTrace();
        }
    }

    public C41437d() {
        C48939c.m192792a().mo170890a().mo170897a(C48939c.m192792a().mo170891b());
    }

    /* renamed from: h */
    private synchronized void m164414h() {
        this.f105345g = true;
        ArrayList<AbstractC41453b> arrayList = this.f105343e;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC41453b> it = this.f105343e.iterator();
            while (it.hasNext()) {
                it.next().mo149212a();
            }
            this.f105343e.clear();
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: d */
    public void mo149185d() {
        CoreThreadPool.getDefault().getFixedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.RunnableC414456 */

            public void run() {
                C41437d.this.mo149144a();
                C53248k.m205912a().mo181697a(Command.PUSH_MINIPROGRAM_UPDATE, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.RunnableC414456.C414461 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        try {
                            Log.m165389i("LittleAppService", "receive push PUSH_MINIPROGRAM_UPDATE");
                            PushTenantMiniprogramNeedUpdateRequest decode = PushTenantMiniprogramNeedUpdateRequest.ADAPTER.decode(bArr);
                            C41437d.this.f105339a.mo148922a(decode.cli_id, decode.latency.intValue(), decode.extra);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                C53248k.m205912a().mo181697a(Command.PUSH_APP_FEED, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.RunnableC414456.C414472 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        Log.m165389i("LittleAppService", "receive push PUSH_APP_FEED");
                        C41437d.this.mo149202a(bArr, str, z, z2);
                    }
                });
                C53248k.m205912a().mo181697a(Command.PUSH_MINIPROGRAM_PREVIEW, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.RunnableC414456.C414483 */

                    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
                        r6 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
                        r6.printStackTrace();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
                        r5 = move-exception;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
                        r5.printStackTrace();
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
                        return;
                     */
                    /* JADX WARNING: Failed to process nested try/catch */
                    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[ExcHandler: IOException (r5v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:5:0x000c] */
                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onPush(byte[] r5, java.lang.String r6, boolean r7, boolean r8) {
                        /*
                            r4 = this;
                            java.lang.String r6 = "LittleAppService"
                            if (r8 == 0) goto L_0x000a
                            java.lang.String r5 = "receive offlinePush PUSH_MINIPROGRAM_PREVIEW"
                            com.ss.android.lark.log.Log.m165389i(r6, r5)
                            return
                        L_0x000a:
                            java.lang.String r7 = "receive PUSH_MINIPROGRAM_PREVIEW"
                            com.ss.android.lark.log.Log.m165389i(r6, r7)     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            com.squareup.wire.ProtoAdapter<com.bytedance.lark.pb.openplatform.v1.PushMiniprogramPreviewRequest> r6 = com.bytedance.lark.pb.openplatform.v1.PushMiniprogramPreviewRequest.ADAPTER     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            java.lang.Object r5 = r6.decode(r5)     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            com.bytedance.lark.pb.openplatform.v1.PushMiniprogramPreviewRequest r5 = (com.bytedance.lark.pb.openplatform.v1.PushMiniprogramPreviewRequest) r5     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            java.lang.String r6 = r5.time_stamp     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            long r6 = r6.longValue()     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            r2 = 1000(0x3e8, double:4.94E-321)
                            long r0 = r0 / r2
                            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                            if (r8 <= 0) goto L_0x002d
                            return
                        L_0x002d:
                            java.lang.String r6 = r5.url     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ IOException -> 0x005f, NumberFormatException -> 0x005a }
                            r7 = 1000(0x3e8, float:1.401E-42)
                            java.lang.String r8 = "scene"
                            java.lang.String r6 = r6.getQueryParameter(r8)     // Catch:{ NumberFormatException -> 0x0044, IOException -> 0x005f }
                            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x0044, IOException -> 0x005f }
                            int r7 = r6.intValue()     // Catch:{ NumberFormatException -> 0x0044, IOException -> 0x005f }
                            goto L_0x0048
                        L_0x0044:
                            r6 = move-exception
                            r6.printStackTrace()
                        L_0x0048:
                            com.ss.android.lark.littleapp.service.a.d$6 r6 = com.ss.android.lark.littleapp.service.p2132a.C41437d.RunnableC414456.this
                            com.ss.android.lark.littleapp.service.a.d r6 = com.ss.android.lark.littleapp.service.p2132a.C41437d.this
                            com.tt.miniapphost.AppbrandContext r8 = com.tt.miniapphost.AppbrandContext.getInst()
                            android.app.Application r8 = r8.getApplicationContext()
                            java.lang.String r5 = r5.url
                            r6.mo149151a(r8, r5, r7)
                            goto L_0x0063
                        L_0x005a:
                            r5 = move-exception
                            r5.printStackTrace()
                            goto L_0x0063
                        L_0x005f:
                            r5 = move-exception
                            r5.printStackTrace()
                        L_0x0063:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.littleapp.service.p2132a.C41437d.RunnableC414456.C414483.onPush(byte[], java.lang.String, boolean, boolean):void");
                    }
                });
            }
        });
    }

    /* renamed from: f */
    public boolean mo149205f() {
        ILittleAppService.AbstractC41416a aVar = this.f105344f;
        if (aVar != null) {
            return aVar.mo144296e("microapp.update.v2");
        }
        AppBrandLogger.m52829e("LittleAppService", "isUpdateV2Enabled, mDependency is null.");
        return false;
    }

    /* renamed from: g */
    private void m164413g() {
        String b = C66802u.m260678a().mo232710b();
        long j = 30;
        long j2 = 0;
        if (!TextUtils.isEmpty(b)) {
            try {
                JSONObject jSONObject = new JSONObject(b);
                j = jSONObject.optLong("checkDelayAfterNetworkChange", 30);
                j2 = jSONObject.optLong("checkDelayAfterLaunch", 0);
                AppBrandLogger.m52830i("LittleAppService", "config: ", "checkDelayAfterNetworkChange: ", Long.valueOf(j), ", checkDelayAfterLaunch: ", Long.valueOf(j2), ", minTimeSinceLastCheck: ");
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("LittleAppService", "init4Update, parse preload error: " + e.getMessage(), e);
            }
        }
        m164407a(j);
        C67866g.m264028a(new Runnable() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.AnonymousClass10 */

            public void run() {
                AppBrandLogger.m52828d("LittleAppService", "add IdleHandler");
                Looper.getMainLooper();
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() {
                    /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.AnonymousClass10.C414391 */

                    public boolean queueIdle() {
                        AppBrandLogger.m52828d("LittleAppService", "queueIdle, update little apps...");
                        C41437d.this.f105339a.mo148926b(true);
                        return false;
                    }
                });
            }
        }, j2 * 1000);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149144a() {
        if (!m164415i()) {
            synchronized (C41437d.class) {
                AbstractC41301a aVar = (AbstractC41301a) ApiUtils.getApi(AbstractC41301a.class);
                if (aVar != null) {
                    mo149142a(aVar.getContext(), aVar.getInnerDependency());
                    aVar.addAccountListener();
                    aVar.addLanAndEnvListener();
                } else {
                    Log.m165383e("LittleAppService", "Claymore init ILittleAppModuleDependency error");
                }
            }
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149157a(HostInterface hostInterface) {
        mo149144a();
        C12941a.m53322a(hostInterface);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: b */
    public boolean mo149179b(String str) {
        mo149144a();
        return C41456f.m164493a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.littleapp.service.a.d$c */
    public class C41454c {

        /* renamed from: b */
        private String f105397b;

        /* renamed from: c */
        private final Map<String, String> f105398c;

        /* renamed from: d */
        private Map<String, AppFeed> f105399d;

        private C41454c() {
            this.f105398c = new HashMap();
        }

        /* renamed from: b */
        public synchronized void mo149222b(String str) {
            this.f105397b = "";
            Log.m165389i("LittleAppService", "onHide, appId: " + str);
        }

        /* renamed from: a */
        public synchronized void mo149219a(String str) {
            AppFeed appFeed;
            this.f105397b = str;
            if (this.f105399d != null) {
                String str2 = this.f105398c.get(str);
                if (!TextUtils.isEmpty(str2) && (appFeed = this.f105399d.get(str2)) != null) {
                    Log.m165389i("LittleAppService", "onShow, feedId: " + str2 + ", appId: " + str + ", seq_id: " + appFeed.last_notification_seq_id);
                    C41437d.this.mo149201a(str2, appFeed.last_notification_seq_id);
                    this.f105399d = null;
                }
            }
        }

        /* renamed from: a */
        public void mo149220a(String str, String str2) {
            if (!TextUtils.isEmpty(str2)) {
                Uri parse = Uri.parse(str2);
                String queryParameter = parse.getQueryParameter("app_id");
                if (TextUtils.isEmpty(queryParameter)) {
                    queryParameter = parse.getQueryParameter("appId");
                }
                if (!TextUtils.isEmpty(queryParameter)) {
                    this.f105398c.put(queryParameter, str);
                }
            }
        }

        /* renamed from: a */
        public void mo149221a(byte[] bArr, String str, boolean z, boolean z2) {
            String str2;
            AppFeed appFeed;
            try {
                PushAppFeedResponse decode = PushAppFeedResponse.ADAPTER.decode(bArr);
                if (decode.app_feeds != null) {
                    synchronized (this) {
                        str2 = this.f105397b;
                    }
                    if (C41437d.this.f105341c != null && !TextUtils.isEmpty(str2)) {
                        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
                            if (iAppSandboxEnvProcessor != null && iAppSandboxEnvProcessor.isAppSandBoxEnvExistByAppId(C41437d.this.f105341c.getApplicationContext(), str2)) {
                                String str3 = this.f105398c.get(str2);
                                Log.m165389i("LittleAppService", "onPushAppFeed, feedId: " + str3 + ", appId: " + str2);
                                if (!(TextUtils.isEmpty(str3) || (appFeed = decode.app_feeds.get(str3)) == null)) {
                                    Log.m165389i("LittleAppService", "onPushAppFeed, feedId: " + str3 + ", appId: " + str2 + ", seq_id: " + appFeed.last_notification_seq_id);
                                    C41437d.this.mo149201a(str3, appFeed.last_notification_seq_id);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    Log.m165389i("LittleAppService", "onPushAppFeed, appId: " + str2 + ", app_feeds: " + decode.app_feeds);
                    synchronized (this) {
                        this.f105399d = decode.app_feeds;
                    }
                }
            } catch (Exception e) {
                Log.m165386e(e.getMessage(), e);
            }
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: b */
    public void mo149176b(boolean z) {
        mo149144a();
        if (this.f105339a != null) {
            C41343f.m163912a(z);
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: f */
    public void mo149190f(String str) {
        mo149144a();
        this.f105339a.mo148921a(str);
    }

    /* renamed from: a */
    private void m164407a(final long j) {
        C38770b.m153078a().mo142127a(new AbstractC38769a() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.AnonymousClass11 */

            @Override // com.ss.android.lark.http.netstate.AbstractC38769a
            public void onNetworkStateChange(NetworkUtils.NetworkType networkType) {
                Log.m165379d("LittleAppService", "onNetworkStateChange, type: " + networkType);
                if (NetworkUtils.NetworkType.WIFI == networkType) {
                    C67866g.m264028a(new Runnable() {
                        /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.AnonymousClass11.RunnableC414401 */

                        public void run() {
                            AppBrandLogger.m52828d("LittleAppService", "change to WiFi, update little apps...");
                            C41437d.this.f105339a.mo148926b(false);
                        }
                    }, j * 1000);
                }
            }
        });
        AppBrandLogger.m52828d("LittleAppService", "registerNetworkChangeListener");
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: d */
    public Map<String, AbstractC29186b> mo149184d(final Context context) {
        mo149144a();
        C414445 r0 = new AbstractC29186b() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.C414445 */

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: a */
            public boolean mo103482a() {
                return true;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: d */
            public boolean mo103484d(Context context, AppLink appLink) {
                if (Uri.parse(appLink.mo103435a()).getQueryParameter("appId") != null) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.applink.AbstractC29194f
            /* renamed from: c */
            public boolean mo103483c(Context context, AppLink appLink) {
                String a = appLink.mo103435a();
                if (Uri.parse(a).getQueryParameter("appId") == null) {
                    return false;
                }
                if (context == null) {
                    context = context;
                }
                C41437d dVar = C41437d.this;
                dVar.mo149204c(context, a, dVar.mo149141a(appLink.mo103436b()));
                return true;
            }
        };
        HashMap hashMap = new HashMap();
        hashMap.put("/client/mini_program/open", r0);
        return hashMap;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: e */
    public void mo149189e(String str) {
        mo149144a();
        this.f105342d.mo149222b(str);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: b */
    public void mo149173b(Context context) {
        mo149144a();
        C67460f fVar = new C67460f(context);
        context.startActivity(AboutDebugActivity.m53278a(context, "", C66399c.m259608a().mo231922b(context, fVar), C66399c.m259608a().mo231913a(context), false, C67485a.m262488a(fVar).mo234275E().mo85965a(context)));
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: c */
    public boolean mo149181c(Context context) {
        mo149144a();
        this.f105344f.mo144256a(context);
        return true;
    }

    /* renamed from: g */
    public boolean mo149206g(String str) {
        Uri parse;
        mo149144a();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && parse.getHost() != null && parse.getHost().equals("microapp")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m164409b(int i) {
        ILittleAppService.AbstractC41416a aVar = this.f105344f;
        if (aVar == null) {
            return false;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        return true;
                    }
                    if (!aVar.mo144296e("microapp.preload.scan") || !C12964g.m53379a(i)) {
                        return false;
                    }
                    return true;
                } else if (!aVar.mo144296e("microapp.preload.app.feed") || !C12964g.m53379a(i)) {
                    return false;
                } else {
                    return true;
                }
            } else if (!aVar.mo144296e("microapp.preload.bot.create") || !C12964g.m53379a(i)) {
                return false;
            } else {
                return true;
            }
        } else if (!aVar.mo144296e("microapp.preload.bot.click") || !C12964g.m53379a(i)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: d */
    public void mo149187d(String str) {
        mo149144a();
        this.f105342d.mo149219a(str);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: c */
    public boolean mo149183c(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(C12952b.m53344a(str))) {
            return false;
        }
        mo149144a();
        return true;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149146a(Context context) {
        mo149144a();
        C12745c.m52737a().mo48253a(C66751b.m260570a());
        C12745c.m52737a().mo48251a(context, new AbstractC12749e.AbstractC12750a() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.AnonymousClass16 */

            @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e.AbstractC12750a
            /* renamed from: a */
            public void mo48260a(JSONObject jSONObject) {
                Log.m165388i("updateConfig->onFetchSettingSuccess!");
            }

            @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12749e.AbstractC12750a
            /* renamed from: a */
            public void mo48259a(String str, String str2) {
                Log.m165382e("updateConfig->onFetchSettingError,code:" + str + " msg:" + str2);
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149147a(Context context, int i) {
        mo149144a();
        C41343f fVar = this.f105339a;
        if (fVar != null) {
            fVar.mo148914a(context, i);
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: d */
    public void mo149186d(final Context context, final String str) {
        mo149144a();
        Schedulers.longIO().execute(new Runnable() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.RunnableC414423 */

            public void run() {
                AppBrandLogger.m52830i("LittleAppService", "check gadget update and download, appId " + str);
                ISandboxEnvInfo a = C66645a.m260337a().mo232354a(str);
                if (a != null) {
                    try {
                        Intent intent = new Intent(context, a.getPreloadServiceClass());
                        intent.putExtra("command", "hostActionCommand");
                        intent.putExtra("hostAction", "checknewapp");
                        intent.putExtra("hostActionParams", str);
                        context.startService(intent);
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "LittleAppService", e.getStackTrace());
                    }
                }
            }
        });
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: e */
    public void mo149188e(final Context context, final String str) {
        mo149144a();
        Schedulers.longIO().execute(new Runnable() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.RunnableC414434 */

            public void run() {
                AppBrandLogger.m52830i("LittleAppService", "check gadget update and download, appId " + str);
                ISandboxEnvInfo a = C66645a.m260337a().mo232354a(str);
                if (a != null) {
                    try {
                        Intent intent = new Intent(context, a.getPreloadServiceClass());
                        intent.putExtra("command", "hostActionCommand");
                        intent.putExtra("hostAction", "reDownlaod");
                        intent.putExtra("hostActionParams", str);
                        context.startService(intent);
                    } catch (Exception e) {
                        AppBrandLogger.stacktrace(6, "LittleAppService", e.getStackTrace());
                    }
                }
            }
        });
    }

    /* renamed from: f */
    private void m164412f(Context context, String str) {
        try {
            this.f105339a.mo148916a(context, str);
        } catch (Exception e) {
            Log.m165384e("LittleAppService", "resumeMiniApp error ", e);
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: c */
    public boolean mo149182c(Context context, String str) {
        mo149144a();
        if (this.f105344f == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f105344f.mo144287c(context, str);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public IAppContext mo149142a(final Context context, ILittleAppService.AbstractC41416a aVar) {
        this.f105344f = aVar;
        this.f105341c = context;
        final AbstractC41301a a = C41354g.m163939a();
        IAppContext a2 = C41455e.m164491a((Application) context, aVar, this, a);
        if (C26252ad.m94993b(context)) {
            this.f105344f.mo144264a(new ILittleAppService.AbstractC41417b() {
                /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.C414381 */

                /* renamed from: a */
                private void m164475a() {
                    Boolean b;
                    for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
                        if ((iAppSandboxEnvProcessor instanceof C66656e) && C41437d.this.f105340b && a.getLoginDependency().mo144247b() != null && (b = C66653c.m260375b(context)) != null && !b.booleanValue()) {
                            C41437d.this.mo149199a(context, 7, "lark_killed_process", iAppSandboxEnvProcessor.getSandBoxType());
                        }
                    }
                }

                @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41417b
                /* renamed from: a */
                public void mo149192a(boolean z) {
                    AppBrandLogger.m52830i("LittleAppService", "onAppFrontChange" + z);
                    if (z) {
                        m164475a();
                    }
                }
            });
            C38770b.m153078a().mo142127a(new AbstractC38769a() {
                /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.C414519 */

                @Override // com.ss.android.lark.http.netstate.AbstractC38769a
                public void onNetworkStateChange(NetworkUtils.NetworkType networkType) {
                    WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                    if (wifiManager != null) {
                        wifiManager.startScan();
                        Log.m165389i("LittleAppService", "scan wifi");
                    }
                }
            });
            if (mo149205f()) {
                m164413g();
            } else {
                Log.m165389i("LittleAppService", "update v2 is turn off.");
            }
        } else {
            Log.m165389i("LittleAppService", "skip init pre-update...");
        }
        m164414h();
        return a2;
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: b */
    public void mo149174b(Context context, int i) {
        ActivityManager.AppTask b = C67018a.m261210b(context);
        if (b != null && b.getTaskInfo().id != i) {
            C67018a.m261202a(context, i);
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: b */
    public boolean mo149177b(Context context, String str) {
        mo149144a();
        if (this.f105344f == null || TextUtils.isEmpty(str)) {
            return false;
        }
        this.f105344f.mo144292d(context, str);
        return true;
    }

    /* renamed from: c */
    public void mo149204c(Context context, String str, int i) {
        mo149203b(context, str, null, i);
    }

    /* renamed from: c */
    private void m164410c(Context context, String str, String str2) {
        try {
            this.f105339a.mo148918a(context, str, str2);
        } catch (Exception e) {
            Log.m165384e("LittleAppService", "resumeMiniAppWithData error ", e);
            e.printStackTrace();
        }
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public List<LittleAppPermissionData> mo149143a(Context context, String str, AppType appType) {
        C41343f fVar;
        mo149144a();
        if (TextUtils.isEmpty(str) || (fVar = this.f105339a) == null) {
            return new ArrayList();
        }
        return fVar.mo148913a(context, str, appType);
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: b */
    public void mo149175b(Context context, final String str, final String str2) {
        mo149144a();
        Observable.create(new Action() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.C414412 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                AppBrandLogger.m52830i("LittleAppService", "restart gadget appId: " + str + " scheme: " + str2);
                if (!TextUtils.isEmpty(str)) {
                    IAppSandboxEnvProcessor e = C66645a.m260337a().mo232363e(str);
                    if (e != null) {
                        e.killSandBoxByAppId(str);
                    } else {
                        C48936b.m192783a("processor == null");
                    }
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e2) {
                    AppBrandLogger.stacktrace(6, "LittleAppService", e2.getStackTrace());
                }
                C67489c.m262538a().openAppbrand(new C67466a(str2));
            }
        }).schudleOn(C67554l.m262725b()).subscribeSimple();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: a */
    public void mo149145a(Activity activity, Bundle bundle, String str) {
        mo149144a();
        String string = bundle.getString("extra_key_app_id");
        bundle.remove("extra_key_app_id");
        m164410c(activity, string, str);
        activity.finish();
    }

    @Override // com.ss.android.lark.littleapp.service.ILittleAppService
    /* renamed from: b */
    public boolean mo149178b(Context context, String str, int i) {
        mo149144a();
        String a = C12952b.m53344a(str);
        if (TextUtils.isEmpty(a)) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("refererLink", str);
            jSONObject2.put("extraData", jSONObject);
        } catch (JSONException e) {
            Log.m165386e("LittleAppService", e);
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("miniPath");
        if (!TextUtils.isEmpty(queryParameter)) {
            mo149151a(context, String.format("sslocal://microapp?app_id=%s&start_page=%s&referer_info=%s", a, queryParameter, Uri.encode(jSONObject2.toString())), i);
            return true;
        }
        String queryParameter2 = parse.getQueryParameter("open_item");
        if ("tt06bd70009997ab3e".equals(a) && !TextUtils.isEmpty(queryParameter2)) {
            mo149151a(context, String.format("sslocal://microapp?app_id=%s&start_page=%s", a, Uri.encode("pages/feedinfo/root?feedID=" + queryParameter2)), i);
            return true;
        } else if ("tt06bd70009997ab3e".equals(a)) {
            mo149151a(context, String.format("sslocal://microapp?app_id=%s&start_page=%s", a, Uri.encode("pages/home/root?miniReferer=" + Uri.encode(str))), i);
            return true;
        } else {
            mo149151a(context, String.format("sslocal://microapp?app_id=%s&referer_info=%s", a, Uri.encode(jSONObject2.toString())), i);
            return true;
        }
    }

    /* renamed from: b */
    public void mo149203b(Context context, String str, String str2, int i) {
        if (!C41354g.m163939a().onAppIntercept(context)) {
            if (!TextUtils.isEmpty(str) && InspectDebugHelper.f166565a.mo230982a()) {
                String queryParameter = Uri.parse(str).getQueryParameter("app_id");
                if (!InspectDebugHelper.f166565a.mo230983a(queryParameter)) {
                    AppBrandLogger.m52830i("LittleAppService", "appId " + queryParameter + " is not support inspect,will return");
                    LKUIToast.show(context, UIHelper.getString(R.string.Lark_OpenPlatform_DebuggingModeDesc));
                    return;
                }
            }
            C41455e.m164492a(context, str, str2, i);
        }
    }

    /* renamed from: a */
    private void m164408a(final Context context, final int i, final String str, final IAppSandboxEnvManagerService.SandBoxEnvType sandBoxEnvType, final IGetDataCallback<Boolean> iGetDataCallback) {
        mo149144a();
        C67866g.m264032c(new Runnable() {
            /* class com.ss.android.lark.littleapp.service.p2132a.C41437d.AnonymousClass13 */

            public void run() {
                C41437d.this.mo149198a(context, i, str, C66645a.m260337a().mo232355a(sandBoxEnvType), iGetDataCallback);
            }
        });
    }
}

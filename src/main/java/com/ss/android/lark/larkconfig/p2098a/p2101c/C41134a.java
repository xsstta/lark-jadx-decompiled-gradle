package com.ss.android.lark.larkconfig.p2098a.p2101c;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.SyncDataStrategy;
import com.bytedance.lark.pb.im.v1.PullAllAppConfigV2Request;
import com.bytedance.lark.pb.im.v1.PullAllAppConfigV2Response;
import com.google.gson.Gson;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.larkconfig.p2098a.AbstractC41137d;
import com.ss.android.lark.larkconfig.p2098a.AbstractC41138e;
import com.ss.android.lark.larkconfig.p2098a.C41128a;
import com.ss.android.lark.larkconfig.p2098a.C41130b;
import com.ss.android.lark.larkconfig.p2098a.C41133c;
import com.ss.android.lark.larkconfig.p2098a.p2099a.C41129a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.ss.android.lark.larkconfig.a.c.a */
public class C41134a implements AbstractC41137d {

    /* renamed from: a */
    private AppConfig f104907a;

    /* renamed from: b */
    private ConcurrentLinkedQueue<IGetDataCallback<AppConfig>> f104908b;

    /* renamed from: c */
    private AbstractC41138e f104909c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.a.c.a$a */
    public static class C41136a {

        /* renamed from: a */
        public static C41134a f104912a = new C41134a();
    }

    /* renamed from: c */
    public static C41134a m163226c() {
        return C41136a.f104912a;
    }

    @Override // com.ss.android.lark.larkconfig.p2098a.AbstractC41137d
    /* renamed from: b */
    public void mo148373b() {
        this.f104907a = null;
        C41130b.m163208a().mo148360b(this.f104909c);
    }

    private C41134a() {
        this.f104908b = new ConcurrentLinkedQueue<>();
        this.f104909c = new AbstractC41138e() {
            /* class com.ss.android.lark.larkconfig.p2098a.p2101c.$$Lambda$a$BXYui_YSiyenRTyGcaqH6iYSghw */

            @Override // com.ss.android.lark.larkconfig.p2098a.AbstractC41138e
            public final void onUpdate(AppConfig appConfig) {
                C41134a.this.m163224a((C41134a) appConfig);
            }
        };
    }

    @Override // com.ss.android.lark.larkconfig.p2098a.AbstractC41137d
    /* renamed from: a */
    public void mo148367a() {
        C41130b.m163208a().mo148359a(this.f104909c);
        mo148370a(false, (IGetDataCallback<AppConfig>) null);
    }

    @Override // com.ss.android.lark.larkconfig.p2098a.AbstractC41137d
    /* renamed from: b */
    public void mo148374b(IGetDataCallback<AppConfig> iGetDataCallback) {
        this.f104908b.remove(iGetDataCallback);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ AppConfig m163223a(byte[] bArr) throws IOException {
        return C41129a.m163207a(PullAllAppConfigV2Response.ADAPTER.decode(bArr).config);
    }

    @Override // com.ss.android.lark.larkconfig.p2098a.AbstractC41137d
    /* renamed from: b */
    public AppConfig.FeatureConfig mo148372b(String str) {
        AppConfig appConfig;
        if (C41133c.m163221a().mo148363a("lark.leanmode.switch") && (appConfig = this.f104907a) != null) {
            return appConfig.getFeatureConfig(str);
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo148375c(String str) {
        Boolean bool;
        Map<String, Boolean> b = C41133c.m163221a().mo148364b();
        if (b == null || (bool = b.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.ss.android.lark.larkconfig.p2098a.AbstractC41137d
    /* renamed from: a */
    public void mo148368a(IGetDataCallback<AppConfig> iGetDataCallback) {
        this.f104908b.add(iGetDataCallback);
        AppConfig appConfig = this.f104907a;
        if (appConfig != null) {
            iGetDataCallback.onSuccess(appConfig);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m163224a(AppConfig appConfig) {
        if (C41133c.m163221a().mo148363a("lark.leanmode.debug.log")) {
            Log.m165379d("AppConfigService", "successful to receive appconfig push. appconfig:" + new Gson().toJson(appConfig));
        }
        if (!C41133c.m163221a().mo148363a("lark.leanmode.switch")) {
            Log.m165379d("AppConfigService", "fg is false, return.");
            mo148369a((AppConfig) null, (ErrorResult) null);
            return;
        }
        C41128a.m163206a(appConfig);
        this.f104907a = appConfig;
        m163225b(appConfig, null);
    }

    @Override // com.ss.android.lark.larkconfig.p2098a.AbstractC41137d
    /* renamed from: a */
    public boolean mo148371a(String str) {
        if (!C41133c.m163221a().mo148363a("lark.leanmode.switch")) {
            return mo148375c(str);
        }
        if (this.f104907a == null) {
            return mo148375c(str);
        }
        return this.f104907a.isOn(str, mo148375c(str));
    }

    /* renamed from: b */
    private void m163225b(AppConfig appConfig, ErrorResult errorResult) {
        Iterator<IGetDataCallback<AppConfig>> it = this.f104908b.iterator();
        while (it.hasNext()) {
            if (errorResult != null) {
                it.next().onError(errorResult);
            } else {
                it.next().onSuccess(appConfig);
            }
        }
    }

    /* renamed from: a */
    public void mo148369a(AppConfig appConfig, ErrorResult errorResult) {
        this.f104907a = appConfig;
        C41128a.m163206a(appConfig);
        m163225b(appConfig, errorResult);
    }

    @Override // com.ss.android.lark.larkconfig.p2098a.AbstractC41137d
    /* renamed from: a */
    public void mo148370a(boolean z, final IGetDataCallback<AppConfig> iGetDataCallback) {
        SyncDataStrategy syncDataStrategy;
        if (!C41133c.m163221a().mo148363a("lark.leanmode.switch")) {
            mo148369a((AppConfig) null, (ErrorResult) null);
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(new ErrorResult("loadAppConfig called. fg is false"));
                return;
            }
            return;
        }
        if (z) {
            syncDataStrategy = SyncDataStrategy.FORCE_SERVER;
        } else {
            syncDataStrategy = SyncDataStrategy.TRY_LOCAL;
        }
        Context a = C41133c.m163221a().mo148361a();
        if (a != null && !NetworkUtils.m153070c(a)) {
            syncDataStrategy = SyncDataStrategy.LOCAL;
        }
        PullAllAppConfigV2Request.C17853a aVar = new PullAllAppConfigV2Request.C17853a();
        aVar.mo62217a(syncDataStrategy);
        SdkSender.asynSendRequestNonWrap(Command.PULL_ALL_APP_CONFIG_V2, aVar, new IGetDataCallback<AppConfig>() {
            /* class com.ss.android.lark.larkconfig.p2098a.p2101c.C41134a.C411351 */

            /* renamed from: a */
            public void onSuccess(AppConfig appConfig) {
                if (C41133c.m163221a().mo148363a("lark.leanmode.debug.log")) {
                    Log.m165389i("AppConfigService", "success to pull all appConfigV2. appconfig:" + new Gson().toJson(appConfig));
                }
                C41134a.this.mo148369a(appConfig, (ErrorResult) null);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(appConfig);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("AppConfigService", "failed to pull all appConfigV2. e:" + errorResult);
                C41134a.this.mo148369a((AppConfig) null, errorResult);
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }, $$Lambda$a$d1ZXpwE1x9qV6IrHxDwd_4H0iuQ.INSTANCE);
    }
}

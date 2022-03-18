package com.ss.android.lark.appstrategy.service.impl;

import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.bytedance.ee.appstrategy.C4149b;
import com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper;
import com.bytedance.ee.appstrategy.p240a.AbstractC4147e;
import com.bytedance.ee.appstrategy.p240a.C4143a;
import com.bytedance.ee.appstrategy.p240a.C4145c;
import com.bytedance.ee.appstrategy.p240a.C4148f;
import com.bytedance.lark.pb.basic.v1.ActionInfo;
import com.bytedance.lark.pb.basic.v1.AppTipsContent;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.OpenApp;
import com.bytedance.lark.pb.basic.v1.SendHttpRequest;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.bytedance.lark.pb.openplatform.v1.BotInfo;
import com.bytedance.lark.pb.openplatform.v1.C18636Button;
import com.bytedance.lark.pb.openplatform.v1.CommonUsageStatus;
import com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoRequest;
import com.bytedance.lark.pb.openplatform.v1.GetBotControlInfoResponse;
import com.bytedance.lark.pb.openplatform.v1.GetDataStrategy;
import com.bytedance.lark.pb.openplatform.v1.GetH5ControlInfoResponse;
import com.bytedance.lark.pb.openplatform.v1.GetMiniAppControlInfoResponse;
import com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateRequest;
import com.bytedance.lark.pb.openplatform.v1.GetOpenAppStateResponse;
import com.bytedance.lark.pb.openplatform.v1.PushOpenCommonRequest;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.appstrategy.C29231a;
import com.ss.android.lark.appstrategy.dto.SimpleLocation;
import com.ss.android.lark.appstrategy.p1375b.C29234a;
import com.ss.android.lark.appstrategy.p1375b.C29236b;
import com.ss.android.lark.appstrategy.p1376c.C29237a;
import com.ss.android.lark.appstrategy.p1376c.C29239b;
import com.ss.android.lark.appstrategy.p1376c.C29240c;
import com.ss.android.lark.appstrategy.service.AbstractC29242a;
import com.ss.android.lark.appstrategy.service.IAppStrategyManisService;
import com.ss.android.lark.appstrategy.service.impl.C29252a;
import com.ss.android.lark.appstrategy.service.impl.dto.SuccessResultWrapper;
import com.ss.android.lark.appstrategy.userscope.AppStrategyUserScope;
import com.ss.android.lark.appstrategy.userscope.CircleScope;
import com.ss.android.lark.appstrategy.userscope.PolygonScope;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.http.netstate.AbstractC38769a;
import com.ss.android.lark.http.netstate.C38770b;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.util.share_preference.C57744a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.appstrategy.service.impl.a */
public class C29252a implements AbstractC29242a {

    /* renamed from: a */
    public WifiInfo f73213a;

    /* renamed from: b */
    public AppStrategyUserScope f73214b;

    /* renamed from: c */
    public boolean f73215c;

    /* renamed from: d */
    public boolean f73216d;

    /* renamed from: e */
    private AbstractC38769a f73217e;

    /* renamed from: f */
    private NetworkUtils.NetworkType f73218f;

    /* renamed from: g */
    private List<ScanResult> f73219g;

    /* renamed from: h */
    private final Object f73220h = new Object();

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.appstrategy.service.impl.a$a */
    public static final class C29263a {

        /* renamed from: a */
        public static final C29252a f73270a = new C29252a();
    }

    /* renamed from: c */
    public static C29252a m107549c() {
        return C29263a.f73270a;
    }

    /* renamed from: d */
    public void mo103724d() {
        C29271c.m107607a();
    }

    @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a
    /* renamed from: a */
    public void mo103690a(final String str, final boolean z, final AbstractC4147e eVar) {
        Log.m165389i("AppStrategyService", "getAppState begin appId=" + str + " isH5=" + z);
        if (!z) {
            final long currentTimeMillis = System.currentTimeMillis();
            C29271c.m107607a().mo103744a(str, z ? IAppStrategyManisService.OpenAppInfoType.H5 : IAppStrategyManisService.OpenAppInfoType.MiniApp, new IGetDataCallback<Parcelable>() {
                /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292586 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    String str;
                    Log.m165383e("AppStrategyService", "errMsg=" + errorResult.getDebugMsg());
                    String debugMsg = errorResult.getDebugMsg();
                    String str2 = str;
                    if (z) {
                        str = "h5";
                    } else {
                        str = "ma";
                    }
                    eVar.onResult(new OpenAppStrategyDataWrapper(OpenAppStrategyDataWrapper.DataVersion.V2, 10110, errorResult.getDisplayMsg(), null, C4143a.m17242a(10110, "client.open_platform.gadget.app_strategy.middle.service", 0, 0, 0, debugMsg, str2, str, true, null)).toString());
                    boolean z = z;
                    String str3 = str;
                    long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                    C29240c.m107525a(z, str3, currentTimeMillis, false, -2, "rust error:" + errorResult.getDebugMsg());
                }

                /* renamed from: a */
                public void onSuccess(Parcelable parcelable) {
                    String str;
                    if (parcelable == null || !(parcelable instanceof SuccessResultWrapper)) {
                        Log.m165383e("AppStrategyService", "resp type error");
                        String str2 = str;
                        if (z) {
                            str = "h5";
                        } else {
                            str = "ma";
                        }
                        eVar.onResult(new OpenAppStrategyDataWrapper(OpenAppStrategyDataWrapper.DataVersion.V2, 10100, "app strategy service result wrapper type error", null, C4143a.m17242a(10100, "client.open_platform.gadget.app_strategy.middle.service", 0, 0, 0, "app strategy service result wrapper type error", str2, str, true, null)).toString());
                        return;
                    }
                    SuccessResultWrapper successResultWrapper = (SuccessResultWrapper) parcelable;
                    String str3 = null;
                    if (successResultWrapper.f73298a instanceof GetMiniAppControlInfoResponse) {
                        C4145c a = C29252a.this.mo103712a((GetMiniAppControlInfoResponse) successResultWrapper.f73298a);
                        OpenAppStrategyDataWrapper.DataVersion dataVersion = OpenAppStrategyDataWrapper.DataVersion.V2;
                        if (a != null) {
                            str3 = a.toString();
                        }
                        eVar.onResult(new OpenAppStrategyDataWrapper(dataVersion, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, null, str3, successResultWrapper.f73299b).toString());
                    } else if (successResultWrapper.f73298a instanceof GetH5ControlInfoResponse) {
                        C4145c a2 = C29252a.this.mo103711a((GetH5ControlInfoResponse) successResultWrapper.f73298a);
                        OpenAppStrategyDataWrapper.DataVersion dataVersion2 = OpenAppStrategyDataWrapper.DataVersion.V2;
                        if (a2 != null) {
                            str3 = a2.toString();
                        }
                        eVar.onResult(new OpenAppStrategyDataWrapper(dataVersion2, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, null, str3, successResultWrapper.f73299b).toString());
                    } else {
                        Log.m165397w("AppStrategyService", "app strategy service result wrapper response type undefined");
                    }
                }
            });
            return;
        }
        mo103723b(str, z, eVar);
    }

    @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a
    /* renamed from: a */
    public void mo103691a(final String str, final boolean z, final AbstractC29242a.AbstractC29243a aVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        mo103718a(str, (String) null, currentTimeMillis);
        C29271c.m107607a().mo103743a(str, new IGetDataCallback<Serializable>() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292597 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                aVar.mo103695a(errorResult.getDebugMsg());
                boolean z = z;
                String str = str;
                long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                C29240c.m107525a(z, str, currentTimeMillis, false, -2, "rust error:" + errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccess(Serializable serializable) {
                if (!(serializable instanceof GetOpenAppStateResponse)) {
                    aVar.mo103695a("openappstate response null ");
                    return;
                }
                GetOpenAppStateResponse getOpenAppStateResponse = (GetOpenAppStateResponse) serializable;
                if (getOpenAppStateResponse.open_app == null) {
                    aVar.mo103695a("open app null");
                    C29240c.m107525a(z, str, System.currentTimeMillis() - currentTimeMillis, false, -1, "open_app null");
                    return;
                }
                OpenApp.State state = getOpenAppStateResponse.open_app.state;
                if (state == null) {
                    aVar.mo103695a("app state null");
                    C29240c.m107525a(z, str, System.currentTimeMillis() - currentTimeMillis, false, -1, "app_state null");
                    return;
                }
                Log.m165389i("AppStrategyService", "appid " + str + " appstate " + state.getValue());
                aVar.mo103694a(state.getValue());
            }
        });
    }

    @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a
    /* renamed from: a */
    public void mo103688a(final String str, final AbstractC29242a.AbstractC29244b bVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        final GetBotControlInfoRequest.C18653a a = new GetBotControlInfoRequest.C18653a().mo64227a(str).mo64226a(GetDataStrategy.LocalOnly);
        Command command = Command.GET_BOT_INFO_WITH_TIPS;
        C292608 r9 = new IGetDataCallback<GetBotControlInfoResponse>() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292608 */

            /* renamed from: a */
            public void onSuccess(GetBotControlInfoResponse getBotControlInfoResponse) {
                BotInfo botInfo = getBotControlInfoResponse.bot_info;
                if (botInfo == null || botInfo.status != CommonUsageStatus.USABLE) {
                    Log.m165389i("AppStrategyService", " get bot appstate from net ");
                    a.mo64226a(GetDataStrategy.NetOnly);
                    Command command = Command.GET_BOT_INFO_WITH_TIPS;
                    GetBotControlInfoRequest.C18653a aVar = a;
                    C292611 r1 = new IGetDataCallback<GetBotControlInfoResponse>() {
                        /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292608.C292611 */

                        /* renamed from: a */
                        public void onSuccess(GetBotControlInfoResponse getBotControlInfoResponse) {
                            boolean z;
                            if (getBotControlInfoResponse.bot_info == null) {
                                Log.m165383e("AppStrategyService", " bot info null ");
                                bVar.mo103696a(" bot info null");
                                C29240c.m107525a(false, str, System.currentTimeMillis() - currentTimeMillis, false, -4, " bot info null");
                                return;
                            }
                            C4145c a = C29252a.this.mo103710a(getBotControlInfoResponse);
                            bVar.mo103697a(getBotControlInfoResponse.bot_info.bot_id, a);
                            String str = str;
                            long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                            if (a != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C29240c.m107525a(false, str, currentTimeMillis, z, 0, "");
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            Log.m165383e("AppStrategyService", " get bot state err " + errorResult.getDebugMsg());
                            bVar.mo103696a(errorResult.getDebugMsg());
                            String str = str;
                            long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                            C29240c.m107525a(false, str, currentTimeMillis, false, -1, "rust error:" + errorResult.getDebugMsg());
                        }
                    };
                    ProtoAdapter<GetBotControlInfoResponse> protoAdapter = GetBotControlInfoResponse.ADAPTER;
                    protoAdapter.getClass();
                    SdkSender.asynSendRequestNonWrap(command, aVar, r1, new SdkSender.IParser() {
                        /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$CxnhMHU_aO_TFzudSEfexCDOV8c */

                        @Override // com.ss.android.lark.sdk.SdkSender.IParser
                        public final Object parse(byte[] bArr) {
                            return (GetBotControlInfoResponse) ProtoAdapter.this.decode(bArr);
                        }
                    });
                    return;
                }
                Log.m165389i("AppStrategyService", " get bot appstate use local");
                bVar.mo103697a(botInfo.bot_id, null);
                a.mo64226a(GetDataStrategy.NetOnly);
                SdkSender.asynSendRequestNonWrap(Command.GET_BOT_INFO_WITH_TIPS, a, null, null);
                C29240c.m107525a(false, str, System.currentTimeMillis() - currentTimeMillis, false, 0, "");
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("AppStrategyService", " get bot state err " + errorResult.getDebugMsg());
                bVar.mo103696a(errorResult.getDebugMsg());
                String str = str;
                long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                C29240c.m107525a(false, str, currentTimeMillis, false, -1, "rust error:" + errorResult.getDebugMsg());
            }
        };
        ProtoAdapter<GetBotControlInfoResponse> protoAdapter = GetBotControlInfoResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, a, r9, new SdkSender.IParser() {
            /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$CxnhMHU_aO_TFzudSEfexCDOV8c */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetBotControlInfoResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public void mo103718a(String str, String str2, long j) {
        C29271c.m107607a().mo103745a(str, str2, j, new IGetDataCallback<Serializable>() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292629 */

            /* renamed from: a */
            public void onSuccess(Serializable serializable) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }
        });
    }

    @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a
    /* renamed from: a */
    public void mo103689a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cli_id", str);
                jSONObject.put("apply_param", str3);
            } catch (JSONException unused) {
            }
            SendHttpRequest.C15253a c = new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.POST).mo55528a(str2).mo55529a(m107552i()).mo55533c(jSONObject.toString());
            Command command = Command.SEND_HTTP;
            AnonymousClass10 r5 = new IGetDataCallback<SendHttpResponse>() {
                /* class com.ss.android.lark.appstrategy.service.impl.C29252a.AnonymousClass10 */

                /* renamed from: a */
                public void onSuccess(SendHttpResponse sendHttpResponse) {
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                }
            };
            ProtoAdapter<SendHttpResponse> protoAdapter = SendHttpResponse.ADAPTER;
            protoAdapter.getClass();
            SdkSender.asynSendRequestNonWrap(command, c, r5, new SdkSender.IParser() {
                /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$nlGhYri8FPznwzigG1jXpA4FnXA */

                @Override // com.ss.android.lark.sdk.SdkSender.IParser
                public final Object parse(byte[] bArr) {
                    return (SendHttpResponse) ProtoAdapter.this.decode(bArr);
                }
            });
        }
    }

    @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a
    /* renamed from: a */
    public void mo103692a(boolean z) {
        Log.m165389i("AppStrategyService", " login status change");
        if (z) {
            mo103716a("login");
            OPMonitor addCategoryValue = C29234a.m107517a(C29236b.f73183a).addCategoryValue("trigger_type", "login");
            AppStrategyUserScope appStrategyUserScope = this.f73214b;
            addCategoryValue.addCategoryValue("snapshot_id", appStrategyUserScope != null ? appStrategyUserScope.getSnapshotId() : "").flush();
        }
    }

    /* renamed from: a */
    public void mo103715a(NetworkUtils.NetworkType networkType) {
        Log.m165389i("AppStrategyService", " network change " + networkType.getNativeName());
        String a = C29231a.m107507a().getLoginDependency().mo103665a();
        if (!TextUtils.isEmpty(a)) {
            OPMonitor addCategoryValue = C29234a.m107517a(C29236b.f73183a).addCategoryValue("trigger_type", "network_change");
            AppStrategyUserScope appStrategyUserScope = this.f73214b;
            addCategoryValue.addCategoryValue("snapshot_id", appStrategyUserScope != null ? appStrategyUserScope.getSnapshotId() : "").flush();
            this.f73214b = (AppStrategyUserScope) C57744a.m224104a().getJSONObject(m107547b(a), AppStrategyUserScope.class);
        }
        if (this.f73214b != null) {
            WifiInfo wifiInfo = this.f73213a;
            m107550g();
            if (mo103721a(this.f73214b)) {
                CoreThreadPool.getBackgroundHandler().post(new Runnable(wifiInfo) {
                    /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$a$BU7aMWEr0OelhgYLvSlXvkvVGpw */
                    public final /* synthetic */ WifiInfo f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C29252a.this.m107545a((C29252a) this.f$1);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public boolean mo103720a(SimpleLocation simpleLocation) {
        AppStrategyUserScope appStrategyUserScope;
        List<CircleScope> circleScopes;
        String a = C29231a.m107507a().getLoginDependency().mo103665a();
        if (TextUtils.isEmpty(a) || (appStrategyUserScope = (AppStrategyUserScope) C57744a.m224104a().getJSONObject(m107547b(a), AppStrategyUserScope.class)) == null || !appStrategyUserScope.isHasLocationScope() || (circleScopes = appStrategyUserScope.getCircleScopes()) == null || circleScopes.size() <= 0) {
            return false;
        }
        int size = circleScopes.size();
        for (int i = 0; i < size; i++) {
            CircleScope circleScope = circleScopes.get(i);
            if (!(circleScope == null || circleScope.getLocation() == null || C29239b.m107522a(simpleLocation, circleScope.getLocation()) >= ((double) circleScope.getRadius()))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo103716a(final String str) {
        Log.m165389i("AppStrategyService", "getTerminalInfo ");
        if (!this.f73215c) {
            final String a = C29231a.m107507a().getLoginDependency().mo103665a();
            if (!TextUtils.isEmpty(a)) {
                this.f73215c = true;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("user_id", a);
                } catch (JSONException e) {
                    Log.m165386e("AppStrategyService", e);
                }
                final long currentTimeMillis = System.currentTimeMillis();
                OPMonitor addCategoryValue = C29234a.m107517a(C29236b.f73184b).addCategoryValue("trigger_type", str);
                AppStrategyUserScope appStrategyUserScope = this.f73214b;
                addCategoryValue.addCategoryValue("snapshot_id", appStrategyUserScope != null ? appStrategyUserScope.getSnapshotId() : "").flush();
                SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.GET).mo55529a(m107552i()).mo55528a(C29237a.C29238a.f73192a).mo55533c(jSONObject.toString()), new IGetDataCallback<String>() {
                    /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292553 */

                    /* access modifiers changed from: private */
                    /* access modifiers changed from: public */
                    /* renamed from: b */
                    private /* synthetic */ void m107583b(String str) {
                        C29252a aVar = C29252a.this;
                        aVar.mo103719a(aVar.f73214b.isHasLocationScope(), C29252a.this.f73214b.isHasWifiScope(), null, str);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        String str;
                        C29252a.this.f73215c = false;
                        Log.m165383e("AppStrategyService", "get user scope err," + errorResult);
                        OPMonitor errorMessage = C29234a.m107517a(C29236b.f73186d).addCategoryValue("trigger_type", str).setDuration(System.currentTimeMillis() - currentTimeMillis).setErrorCode(String.valueOf(errorResult.getErrorCode())).setErrorMessage(errorResult.getDebugMsg());
                        if (C29252a.this.f73214b != null) {
                            str = C29252a.this.f73214b.getSnapshotId();
                        } else {
                            str = "";
                        }
                        errorMessage.addCategoryValue("snapshot_id", str).flush();
                    }

                    /* renamed from: a */
                    public void onSuccess(String str) {
                        boolean z;
                        String str2;
                        boolean z2 = false;
                        C29252a.this.f73215c = false;
                        Log.m165389i("AppStrategyService", "get user scope success ");
                        C29252a.this.mo103717a(a, str);
                        C29252a aVar = C29252a.this;
                        if (aVar.mo103721a(aVar.f73214b)) {
                            CoreThreadPool.getBackgroundHandler().post(new Runnable(str) {
                                /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$a$3$RIzgzWw8AWICT7yOiPL5OxFbdiw */
                                public final /* synthetic */ String f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    C29252a.C292553.this.m107583b(this.f$1);
                                }
                            });
                        }
                        OPMonitor addCategoryValue = C29234a.m107517a(C29236b.f73185c).addCategoryValue("trigger_type", str);
                        if (C29252a.this.f73214b == null || !C29252a.this.f73214b.isHasLocationScope()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        OPMonitor addCategoryValue2 = addCategoryValue.addCategoryValue("location_switch", Boolean.valueOf(z));
                        if (C29252a.this.f73214b != null && C29252a.this.f73214b.isHasWifiScope()) {
                            z2 = true;
                        }
                        OPMonitor duration = addCategoryValue2.addCategoryValue("wifi_switch", Boolean.valueOf(z2)).setDuration(System.currentTimeMillis() - currentTimeMillis);
                        if (C29252a.this.f73214b != null) {
                            str2 = C29252a.this.f73214b.getSnapshotId();
                        } else {
                            str2 = "";
                        }
                        duration.addCategoryValue("snapshot_id", str2).flush();
                    }
                }, new SdkSender.IParser<String>() {
                    /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292564 */

                    /* renamed from: a */
                    public String parse(byte[] bArr) throws IOException {
                        return SendHttpResponse.ADAPTER.decode(bArr).json_body;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo103719a(boolean z, boolean z2, WifiInfo wifiInfo, String str) {
        String str2 = UUID.randomUUID().toString() + "-" + System.currentTimeMillis();
        OPMonitor addCategoryValue = C29234a.m107517a(C29236b.f73187e).addCategoryValue("trigger_type", str).addCategoryValue("location_switch", Boolean.valueOf(z)).addCategoryValue("wifi_switch", Boolean.valueOf(z2)).addCategoryValue("terminal_uid", str2);
        AppStrategyUserScope appStrategyUserScope = this.f73214b;
        addCategoryValue.addCategoryValue("snapshot_id", appStrategyUserScope != null ? appStrategyUserScope.getSnapshotId() : "").flush();
        if (z2) {
            m107550g();
            if (!z) {
                mo103714a(null, wifiInfo, this.f73213a, this.f73219g, false, true, false, str, 0, str2);
            }
        }
        if (z) {
            m107546a(z2, wifiInfo, this.f73219g, str, str2);
        }
    }

    /* renamed from: a */
    public boolean mo103721a(AppStrategyUserScope appStrategyUserScope) {
        return appStrategyUserScope != null && (appStrategyUserScope.isHasWifiScope() || appStrategyUserScope.isHasLocationScope());
    }

    /* renamed from: a */
    public void mo103717a(String str, String str2) {
        AppStrategyUserScope appStrategyUserScope;
        JSONException e;
        ArrayList arrayList;
        AppStrategyUserScope appStrategyUserScope2;
        ArrayList arrayList2;
        AppStrategyUserScope appStrategyUserScope3;
        int i;
        JSONArray jSONArray;
        ArrayList arrayList3;
        AppStrategyUserScope appStrategyUserScope4;
        int i2;
        JSONObject jSONObject;
        AppStrategyUserScope appStrategyUserScope5 = new AppStrategyUserScope();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                if (jSONObject2.has(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (jSONObject3.has("wifi")) {
                        appStrategyUserScope5.setHasWifiScope(true);
                        m107544a(C29231a.m107507a().getContext());
                    } else {
                        C29240c.m107524a(false, " wifi flag not open");
                        m107551h();
                    }
                    if (jSONObject3.has("location")) {
                        appStrategyUserScope5.setHasLocationScope(true);
                        JSONArray optJSONArray = jSONObject3.optJSONObject("location").optJSONArray("geofences");
                        if (optJSONArray != null) {
                            int length = optJSONArray.length();
                            int i3 = 0;
                            while (i3 < length) {
                                JSONObject jSONObject4 = optJSONArray.getJSONObject(i3);
                                if (jSONObject4 != null) {
                                    String optString = jSONObject4.optString(ShareHitPoint.f121869d);
                                    if (TextUtils.equals(optString, "circle")) {
                                        CircleScope circleScope = new CircleScope();
                                        JSONObject optJSONObject = jSONObject4.optJSONObject("center");
                                        if (optJSONObject != null) {
                                            jSONObject = jSONObject4;
                                            circleScope.setLocation(new SimpleLocation(optJSONObject.optDouble("latitude"), optJSONObject.optDouble("longitude")));
                                        } else {
                                            jSONObject = jSONObject4;
                                        }
                                        circleScope.setRadius(jSONObject.optInt("radius"));
                                        arrayList4.add(circleScope);
                                    } else if (TextUtils.equals(optString, "polygon")) {
                                        JSONArray optJSONArray2 = jSONObject4.optJSONArray("coords");
                                        PolygonScope polygonScope = new PolygonScope();
                                        ArrayList arrayList6 = new ArrayList();
                                        if (optJSONArray2 != null) {
                                            int length2 = optJSONArray2.length();
                                            int i4 = 0;
                                            while (i4 < length2) {
                                                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i4);
                                                if (optJSONObject2 != null) {
                                                    i2 = length;
                                                    appStrategyUserScope4 = appStrategyUserScope5;
                                                    arrayList3 = arrayList4;
                                                    try {
                                                        arrayList6.add(new SimpleLocation(optJSONObject2.optDouble("latitude"), optJSONObject2.optDouble("longitude")));
                                                    } catch (JSONException e2) {
                                                        e = e2;
                                                        appStrategyUserScope = appStrategyUserScope4;
                                                        Log.m165386e("AppStrategyService", e);
                                                        this.f73214b = appStrategyUserScope;
                                                        C57744a.m224104a().putJSONObject(m107547b(str), appStrategyUserScope);
                                                    }
                                                } else {
                                                    appStrategyUserScope4 = appStrategyUserScope5;
                                                    arrayList3 = arrayList4;
                                                    i2 = length;
                                                }
                                                i4++;
                                                optJSONArray = optJSONArray;
                                                length = i2;
                                                appStrategyUserScope5 = appStrategyUserScope4;
                                                arrayList4 = arrayList3;
                                            }
                                        }
                                        jSONArray = optJSONArray;
                                        appStrategyUserScope3 = appStrategyUserScope5;
                                        arrayList2 = arrayList4;
                                        i = length;
                                        polygonScope.setLocationList(arrayList6);
                                        arrayList5.add(polygonScope);
                                        i3++;
                                        optJSONArray = jSONArray;
                                        length = i;
                                        appStrategyUserScope5 = appStrategyUserScope3;
                                        arrayList4 = arrayList2;
                                    }
                                }
                                jSONArray = optJSONArray;
                                appStrategyUserScope3 = appStrategyUserScope5;
                                arrayList2 = arrayList4;
                                i = length;
                                i3++;
                                optJSONArray = jSONArray;
                                length = i;
                                appStrategyUserScope5 = appStrategyUserScope3;
                                arrayList4 = arrayList2;
                            }
                        }
                        appStrategyUserScope2 = appStrategyUserScope5;
                        arrayList = arrayList4;
                    } else {
                        appStrategyUserScope2 = appStrategyUserScope5;
                        arrayList = arrayList4;
                        C29240c.m107523a(false, -1, " location flag not open");
                    }
                    if (jSONObject3.has("rule_snapshot_id")) {
                        appStrategyUserScope = appStrategyUserScope2;
                        try {
                            appStrategyUserScope.setSnapshotId(jSONObject3.optString("rule_snapshot_id"));
                        } catch (JSONException e3) {
                            e = e3;
                            Log.m165386e("AppStrategyService", e);
                            this.f73214b = appStrategyUserScope;
                            C57744a.m224104a().putJSONObject(m107547b(str), appStrategyUserScope);
                        }
                    } else {
                        appStrategyUserScope = appStrategyUserScope2;
                    }
                    appStrategyUserScope.setCircleScopes(arrayList);
                    appStrategyUserScope.setPolygonScopes(arrayList5);
                    this.f73214b = appStrategyUserScope;
                    C57744a.m224104a().putJSONObject(m107547b(str), appStrategyUserScope);
                }
            } catch (JSONException e4) {
                e = e4;
                appStrategyUserScope = appStrategyUserScope5;
                Log.m165386e("AppStrategyService", e);
                this.f73214b = appStrategyUserScope;
                C57744a.m224104a().putJSONObject(m107547b(str), appStrategyUserScope);
            }
        }
        appStrategyUserScope = appStrategyUserScope5;
        this.f73214b = appStrategyUserScope;
        C57744a.m224104a().putJSONObject(m107547b(str), appStrategyUserScope);
    }

    @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a
    /* renamed from: a */
    public void mo103687a() {
        C53248k.m205912a().mo181697a(Command.PUSH_OPEN_COMMON, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29252a.AnonymousClass11 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                String str2;
                try {
                    Log.m165389i("AppStrategyService", " push open platform setting ");
                    List<PushOpenCommonRequest.OpenEvent> list = PushOpenCommonRequest.ADAPTER.decode(bArr).events;
                    if (list != null && list.size() > 0) {
                        boolean z3 = false;
                        Iterator<PushOpenCommonRequest.OpenEvent> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (it.next().event_type == PushOpenCommonRequest.EventType.USER_UPLOAD_SETTING_UPDATED) {
                                    z3 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (z3) {
                            C29252a.this.mo103716a("push");
                            OPMonitor addCategoryValue = C29234a.m107517a(C29236b.f73183a).addCategoryValue("trigger_type", "push");
                            if (C29252a.this.f73214b != null) {
                                str2 = C29252a.this.f73214b.getSnapshotId();
                            } else {
                                str2 = "";
                            }
                            addCategoryValue.addCategoryValue("snapshot_id", str2).flush();
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: h */
    private void m107551h() {
        synchronized (this.f73220h) {
            if (this.f73217e != null) {
                C38770b.m153078a().mo142129b(this.f73217e);
                this.f73217e = null;
            }
        }
    }

    /* renamed from: i */
    private Map<String, String> m107552i() {
        HashMap hashMap = new HashMap();
        hashMap.put(ConvertOfficeToSpaceService.f88309g, "session=" + C29231a.m107507a().getLoginDependency().mo103666b());
        return hashMap;
    }

    /* renamed from: f */
    public void mo103726f() {
        String str;
        Log.m165389i("AppStrategyService", " account change ");
        mo103716a("account_change");
        OPMonitor addCategoryValue = C29234a.m107517a(C29236b.f73183a).addCategoryValue("trigger_type", "account_change");
        AppStrategyUserScope appStrategyUserScope = this.f73214b;
        if (appStrategyUserScope != null) {
            str = appStrategyUserScope.getSnapshotId();
        } else {
            str = "";
        }
        addCategoryValue.addCategoryValue("snapshot_id", str).flush();
    }

    /* renamed from: g */
    private void m107550g() {
        boolean z;
        String str;
        this.f73218f = NetworkUtils.m153071d(C29231a.m107507a().getContext());
        Context context = C29231a.m107507a().getContext();
        if (context != null) {
            if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
                this.f73213a = wifiManager.getConnectionInfo();
                wifiManager.startScan();
                this.f73219g = wifiManager.getScanResults();
            }
            Log.m165389i("AppStrategyService", " get wifiinfo  grant " + z);
            if (z) {
                str = null;
            } else {
                str = " ACCESS_FINE_LOCATION permission deny";
            }
            C29240c.m107524a(z, str);
        }
    }

    /* renamed from: e */
    public void mo103725e() {
        String str;
        Log.m165389i("AppStrategyService", " onBackToFrontEvent");
        String a = C29231a.m107507a().getLoginDependency().mo103665a();
        if (TextUtils.isEmpty(a)) {
            Log.m165389i("AppStrategyService", " user id is empty");
            return;
        }
        OPMonitor addCategoryValue = C29234a.m107517a(C29236b.f73183a).addCategoryValue("trigger_type", "back_to_front");
        AppStrategyUserScope appStrategyUserScope = this.f73214b;
        if (appStrategyUserScope != null) {
            str = appStrategyUserScope.getSnapshotId();
        } else {
            str = "";
        }
        addCategoryValue.addCategoryValue("snapshot_id", str).flush();
        AppStrategyUserScope appStrategyUserScope2 = (AppStrategyUserScope) C57744a.m224104a().getJSONObject(m107547b(a), AppStrategyUserScope.class);
        this.f73214b = appStrategyUserScope2;
        if (mo103721a(appStrategyUserScope2)) {
            mo103719a(this.f73214b.isHasLocationScope(), this.f73214b.isHasWifiScope(), null, "back_to_front");
        }
    }

    @Override // com.ss.android.lark.appstrategy.service.AbstractC29242a
    /* renamed from: b */
    public void mo103693b() {
        String str;
        Log.m165389i("AppStrategyService", " pre task start");
        mo103716a("start_up");
        OPMonitor addCategoryValue = C29234a.m107517a(C29236b.f73183a).addCategoryValue("trigger_type", "start_up");
        AppStrategyUserScope appStrategyUserScope = this.f73214b;
        if (appStrategyUserScope != null) {
            str = appStrategyUserScope.getSnapshotId();
        } else {
            str = "";
        }
        addCategoryValue.addCategoryValue("snapshot_id", str).flush();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m107545a(WifiInfo wifiInfo) {
        mo103719a(this.f73214b.isHasLocationScope(), this.f73214b.isHasWifiScope(), wifiInfo, "network_change");
    }

    /* renamed from: b */
    private String m107547b(String str) {
        return String.format("%s_%s", str, "key_appstrategy_user_scope");
    }

    /* renamed from: a */
    private void m107544a(Context context) {
        if (this.f73217e == null || !NetworkUtils.m153070c(context)) {
            synchronized (this.f73220h) {
                if (this.f73217e == null) {
                    this.f73217e = new AbstractC38769a() {
                        /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292575 */

                        @Override // com.ss.android.lark.http.netstate.AbstractC38769a
                        public void onNetworkStateChange(NetworkUtils.NetworkType networkType) {
                            C29252a.this.mo103715a(networkType);
                        }
                    };
                    C38770b.m153078a().mo142127a(this.f73217e);
                }
                m107550g();
            }
        }
    }

    /* renamed from: b */
    public ArrayList<C4149b.C4150a> mo103722b(List<ActionInfo> list) {
        boolean z;
        ArrayList<C4149b.C4150a> arrayList = new ArrayList<>();
        if (list != null) {
            for (ActionInfo actionInfo : list) {
                if (!(actionInfo == null || actionInfo.operator_code == null || actionInfo.action_code == null)) {
                    C4149b.C4150a aVar = new C4149b.C4150a();
                    if (actionInfo.operator_code.getValue() == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f12616f = z;
                    aVar.f12611a = actionInfo.i18n_text;
                    aVar.f12612b = actionInfo.action_code.getValue();
                    if (aVar.f12612b == 4) {
                        Statistics.sendEvent("app_states_unavailable_show");
                    }
                    if (actionInfo.extra != null) {
                        aVar.f12613c = actionInfo.extra.admin_id;
                        aVar.f12614d = actionInfo.extra.params;
                        aVar.f12615e = actionInfo.extra.url;
                    }
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4145c mo103710a(GetBotControlInfoResponse getBotControlInfoResponse) {
        if (getBotControlInfoResponse == null || getBotControlInfoResponse.bot_info == null || getBotControlInfoResponse.bot_info.status == CommonUsageStatus.USABLE || getBotControlInfoResponse.tips == null) {
            return null;
        }
        return new C4145c(getBotControlInfoResponse.bot_info.app_id, getBotControlInfoResponse.bot_info.local_name, getBotControlInfoResponse.tips.local_title, getBotControlInfoResponse.tips.local_content, mo103713a(getBotControlInfoResponse.tips.buttons));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4145c mo103711a(GetH5ControlInfoResponse getH5ControlInfoResponse) {
        if (getH5ControlInfoResponse == null || getH5ControlInfoResponse.h5_info == null || getH5ControlInfoResponse.h5_info.status == CommonUsageStatus.USABLE || getH5ControlInfoResponse.tips == null) {
            return null;
        }
        return new C4145c(getH5ControlInfoResponse.h5_info.app_id, getH5ControlInfoResponse.h5_info.local_name, getH5ControlInfoResponse.tips.local_title, getH5ControlInfoResponse.tips.local_content, mo103713a(getH5ControlInfoResponse.tips.buttons));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4145c mo103712a(GetMiniAppControlInfoResponse getMiniAppControlInfoResponse) {
        if (getMiniAppControlInfoResponse == null || getMiniAppControlInfoResponse.app_info == null || getMiniAppControlInfoResponse.app_info.status == CommonUsageStatus.USABLE || getMiniAppControlInfoResponse.tips == null) {
            return null;
        }
        return new C4145c(getMiniAppControlInfoResponse.app_info.app_id, getMiniAppControlInfoResponse.app_info.local_name, getMiniAppControlInfoResponse.tips.local_title, getMiniAppControlInfoResponse.tips.local_content, mo103713a(getMiniAppControlInfoResponse.tips.buttons));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C4148f> mo103713a(List<C18636Button> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C18636Button button : list) {
            arrayList.add(new C4148f(button.local_content, button.schema, button.extras));
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo103723b(final String str, final boolean z, final AbstractC4147e eVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        mo103718a(str, (String) null, currentTimeMillis);
        new GetOpenAppStateRequest.C18665a().mo64258a(str).mo64257a((Boolean) true);
        C29271c.m107607a().mo103743a(str, new IGetDataCallback<Serializable>() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292531 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                eVar.onResult(new OpenAppStrategyDataWrapper(OpenAppStrategyDataWrapper.DataVersion.V1, -1, null, null, null).toString());
                boolean z = z;
                String str = str;
                long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                C29240c.m107525a(z, str, currentTimeMillis, false, -2, "rust error:" + errorResult.getDebugMsg());
            }

            /* renamed from: a */
            public void onSuccess(Serializable serializable) {
                boolean z;
                if (serializable != null && (serializable instanceof GetOpenAppStateResponse)) {
                    GetOpenAppStateResponse getOpenAppStateResponse = (GetOpenAppStateResponse) serializable;
                    if (getOpenAppStateResponse == null || getOpenAppStateResponse.open_app == null) {
                        eVar.onResult(new OpenAppStrategyDataWrapper(OpenAppStrategyDataWrapper.DataVersion.V1, -1, null, null, null).toString());
                        C29240c.m107525a(z, str, System.currentTimeMillis() - currentTimeMillis, false, -1, "rust return null");
                    } else if (getOpenAppStateResponse.open_app.app_tips == null) {
                        eVar.onResult(new OpenAppStrategyDataWrapper(OpenAppStrategyDataWrapper.DataVersion.V1, -1, null, null, null).toString());
                        C29240c.m107525a(z, str, System.currentTimeMillis() - currentTimeMillis, false, -1, "app_tips is  null");
                    } else {
                        AppTipsContent appTipsContent = getOpenAppStateResponse.open_app.app_tips;
                        C4149b a = C4149b.m17251a(appTipsContent.i18n_title, appTipsContent.i18n_msg, C29252a.this.mo103722b(appTipsContent.actions), getOpenAppStateResponse.open_app.i18n_name);
                        eVar.onResult(new OpenAppStrategyDataWrapper(OpenAppStrategyDataWrapper.DataVersion.V1, 0, null, a.mo16252a(), null).toString());
                        boolean z2 = z;
                        String str = str;
                        long currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                        if (a != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C29240c.m107525a(z2, str, currentTimeMillis, z, 0, "success");
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private void m107548b(final boolean z, final WifiInfo wifiInfo, final List<ScanResult> list, final String str, final String str2) {
        if (!this.f73216d) {
            final long currentTimeMillis = System.currentTimeMillis();
            this.f73216d = true;
            C29231a.m107507a().getLocation(new IGetDataCallback<SimpleLocation>() {
                /* class com.ss.android.lark.appstrategy.service.impl.C29252a.AnonymousClass12 */

                /* renamed from: a */
                public void onSuccess(SimpleLocation simpleLocation) {
                    CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(simpleLocation, wifiInfo, list, z, str, str2, currentTimeMillis) {
                        /* class com.ss.android.lark.appstrategy.service.impl.$$Lambda$a$12$7qkbfWweWZP7L8v3RERraR7GDg */
                        public final /* synthetic */ SimpleLocation f$1;
                        public final /* synthetic */ WifiInfo f$2;
                        public final /* synthetic */ List f$3;
                        public final /* synthetic */ boolean f$4;
                        public final /* synthetic */ String f$5;
                        public final /* synthetic */ String f$6;
                        public final /* synthetic */ long f$7;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                            this.f$4 = r5;
                            this.f$5 = r6;
                            this.f$6 = r7;
                            this.f$7 = r8;
                        }

                        public final void run() {
                            C29252a.AnonymousClass12.this.m107579a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                        }
                    });
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C29252a aVar = C29252a.this;
                    aVar.mo103714a(null, wifiInfo, aVar.f73213a, list, false, z, true, str, errorResult.getErrorCode(), str2);
                    C29252a.this.f73216d = false;
                    Log.m165389i("AppStrategyService", " getLocation err,msg " + errorResult.toString());
                    C29240c.m107523a(false, System.currentTimeMillis() - currentTimeMillis, errorResult.getDebugMsg());
                }

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m107579a(SimpleLocation simpleLocation, WifiInfo wifiInfo, List list, boolean z, String str, String str2, long j) {
                    String str3;
                    boolean a = C29252a.this.mo103720a(simpleLocation);
                    C29252a aVar = C29252a.this;
                    aVar.mo103714a(simpleLocation, wifiInfo, aVar.f73213a, list, a, z, true, str, 0, str2);
                    C29252a.this.f73216d = false;
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    if (a) {
                        str3 = null;
                    } else {
                        str3 = " location not in scope";
                    }
                    C29240c.m107523a(a, currentTimeMillis, str3);
                    Log.m165389i("AppStrategyService", " getLocation success in scope " + a + " la:" + simpleLocation.getLatitude() + " lo:" + simpleLocation.getLongitude());
                }
            });
        }
    }

    /* renamed from: a */
    private void m107546a(boolean z, WifiInfo wifiInfo, List<ScanResult> list, String str, String str2) {
        boolean z2;
        Context context = C29231a.m107507a().getContext();
        if (context != null) {
            boolean z3 = true;
            if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                z3 = false;
            }
            if (z2 || z3) {
                m107548b(z, wifiInfo, list, str, str2);
                return;
            }
            Log.m165389i("AppStrategyService", " location permission deny");
            mo103714a(null, wifiInfo, this.f73213a, list, false, z, true, str, 2000, str2);
            C29240c.m107523a(false, -1, " location permission deny");
        }
    }

    /* renamed from: a */
    public synchronized void mo103714a(final SimpleLocation simpleLocation, final WifiInfo wifiInfo, final WifiInfo wifiInfo2, final List<ScanResult> list, final boolean z, final boolean z2, final boolean z3, final String str, int i, final String str2) {
        String str3;
        String str4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean isAppRealForeground = C29231a.m107507a().isAppRealForeground();
        OPMonitor addCategoryValue = C29234a.m107516a(C29236b.f73188f, simpleLocation, wifiInfo, wifiInfo2, list, z, z2, z3, str).addCategoryValue("is_front", Boolean.valueOf(isAppRealForeground)).addCategoryValue("terminal_uid", str2);
        AppStrategyUserScope appStrategyUserScope = this.f73214b;
        if (appStrategyUserScope != null) {
            str3 = appStrategyUserScope.getSnapshotId();
        } else {
            str3 = "";
        }
        addCategoryValue.addCategoryValue("snapshot_id", str3).setErrorCode(String.valueOf(i)).flush();
        Log.m165389i("AppStrategyService", " is foreground " + isAppRealForeground);
        if (!isAppRealForeground) {
            Log.m165383e("AppStrategyService", "upload terminal info early return. is foreground " + isAppRealForeground);
            return;
        }
        if (!z3 || simpleLocation == null || !z) {
            boolean z7 = true;
            if (!z2 || (wifiInfo2 == null && wifiInfo == null && (list == null || list.size() < 1))) {
                Log.m165383e("AppStrategyService", "upload terminal info early return. location flag:" + z3 + "\twifi flag:" + z2 + "\tin scope:" + z);
                StringBuilder sb = new StringBuilder();
                sb.append("location null:");
                if (simpleLocation == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sb.append(z4);
                sb.append("\twifi null:");
                if (wifiInfo2 == null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                sb.append(z5);
                sb.append("\tlast wifi null:");
                if (wifiInfo == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                sb.append(z6);
                sb.append("\tscan wifi empty:");
                if (list != null && list.size() >= 1) {
                    z7 = false;
                }
                sb.append(z7);
                Log.m165383e("AppStrategyService", sb.toString());
                return;
            }
        }
        if (TextUtils.isEmpty(C29231a.m107507a().getLoginDependency().mo103665a())) {
            Log.m165383e("AppStrategyService", "upload terminal info early return. user ID is empty ");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", String.valueOf(C29231a.m107507a().getNtpTime()));
            if (simpleLocation != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("longitude", simpleLocation.getLongitude());
                jSONObject2.put("latitude", simpleLocation.getLatitude());
                jSONObject2.put("accuracy", simpleLocation.getAccuracy());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("coord", jSONObject2);
                jSONObject.put("location", jSONObject3);
            }
            JSONObject jSONObject4 = null;
            if (wifiInfo != null) {
                jSONObject4 = new JSONObject();
                String ssid = wifiInfo.getSSID();
                if (!TextUtils.isEmpty(ssid)) {
                    jSONObject4.put("lastSSID", ssid.replace("\"", ""));
                }
                jSONObject4.put("lastBSSID", wifiInfo.getBSSID());
            }
            if (wifiInfo2 != null) {
                if (jSONObject4 == null) {
                    jSONObject4 = new JSONObject();
                }
                String ssid2 = wifiInfo2.getSSID();
                if (!TextUtils.isEmpty(ssid2)) {
                    jSONObject4.put("SSID", ssid2.replace("\"", ""));
                }
                jSONObject4.put("BSSID", wifiInfo2.getBSSID());
            }
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (ScanResult scanResult : list) {
                    if (scanResult != null) {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("SSID", scanResult.SSID);
                        jSONObject5.put("BSSID", scanResult.BSSID);
                        jSONArray.put(jSONObject5);
                    }
                }
                jSONObject.put("scanWifi", jSONArray);
            }
            if (jSONObject4 != null) {
                jSONObject.put("wifi", jSONObject4);
            }
            jSONObject.put("deviceID", C29231a.m107507a().getDeviceId());
        } catch (JSONException e) {
            Log.m165386e("AppStrategyService", e);
        }
        OPMonitor addCategoryValue2 = C29234a.m107516a(C29236b.f73189g, simpleLocation, wifiInfo, wifiInfo2, list, z, z2, z3, str).addCategoryValue("terminal_uid", str2);
        AppStrategyUserScope appStrategyUserScope2 = this.f73214b;
        if (appStrategyUserScope2 != null) {
            str4 = appStrategyUserScope2.getSnapshotId();
        } else {
            str4 = "";
        }
        addCategoryValue2.addCategoryValue("snapshot_id", str4).flush();
        final long currentTimeMillis = System.currentTimeMillis();
        SdkSender.asynSendRequestNonWrap(Command.SEND_HTTP, new SendHttpRequest.C15253a().mo55526a(SendHttpRequest.Method.POST).mo55529a(m107552i()).mo55528a(C29237a.C29238a.f73193b).mo55533c(jSONObject.toString()), new IGetDataCallback<String>() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29252a.AnonymousClass13 */

            /* renamed from: a */
            public void onSuccess(String str) {
                String str2;
                Log.m165389i("AppStrategyService", "upload terminal info success");
                OPMonitor addCategoryValue = C29234a.m107516a(C29236b.f73190h, simpleLocation, wifiInfo, wifiInfo2, list, z, z2, z3, str).setDuration(System.currentTimeMillis() - currentTimeMillis).addCategoryValue("terminal_uid", str2);
                if (C29252a.this.f73214b != null) {
                    str2 = C29252a.this.f73214b.getSnapshotId();
                } else {
                    str2 = "";
                }
                addCategoryValue.addCategoryValue("snapshot_id", str2).flush();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                Log.m165383e("AppStrategyService", "upload terminal info err," + errorResult);
                OPMonitor addCategoryValue = C29234a.m107516a(C29236b.f73191i, simpleLocation, wifiInfo, wifiInfo2, list, z, z2, z3, str).setDuration(System.currentTimeMillis() - currentTimeMillis).addCategoryValue("terminal_uid", str2);
                if (C29252a.this.f73214b != null) {
                    str = C29252a.this.f73214b.getSnapshotId();
                } else {
                    str = "";
                }
                addCategoryValue.addCategoryValue("snapshot_id", str).setErrorMessage(errorResult.getDebugMsg()).setErrorCode(String.valueOf(errorResult.getErrorCode())).flush();
            }
        }, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.appstrategy.service.impl.C29252a.C292542 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return SendHttpResponse.ADAPTER.decode(bArr).json_body;
            }
        });
    }
}

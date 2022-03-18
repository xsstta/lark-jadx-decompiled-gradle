package com.ss.android.lark.p2989x.p2991b.p2992a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.DeprecatedConfig;
import com.bytedance.lark.pb.basic.v1.InitLogUpload;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import com.bytedance.lark.pb.basic.v1.KaInitConfig;
import com.bytedance.lark.pb.basic.v1.LogPathWithType;
import com.bytedance.lark.pb.basic.v1.SetClientStatusRequest;
import com.bytedance.lark.pb.basic.v1.SetEnvRequest;
import com.bytedance.lark.pb.basic.v1.SetEnvResponse;
import com.bytedance.lark.pb.settings.v1.UpdateTimezoneRequest;
import com.bytedance.lark.pb.tool.v1.MakeUserOnlineRequest;
import com.bytedance.lark.pb.tool.v1.MakeUserOnlineResponse;
import com.bytedance.lark.sdk.Sdk;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.http.netstate.NetworkUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2989x.C59333a;
import com.ss.android.lark.p2989x.p2990a.AbstractC59334a;
import com.ss.android.lark.p2989x.p2991b.AbstractC59337a;
import com.ss.android.lark.p2989x.p2991b.C59350b;
import com.ss.android.lark.p2989x.p2991b.C59354c;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.C53248k;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.PackageChannelManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.ss.android.lark.x.b.a.a */
public class C59339a {

    /* renamed from: c */
    private static volatile int f147308c;

    /* renamed from: a */
    public AbstractC59334a f147309a;

    /* renamed from: b */
    private Context f147310b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.x.b.a.a$7 */
    public static /* synthetic */ class C593487 {

        /* renamed from: a */
        static final /* synthetic */ int[] f147323a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType[] r0 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593487.f147323a = r0
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_2G     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593487.f147323a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_3G     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593487.f147323a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE_4G     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593487.f147323a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.WIFI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593487.f147323a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.http.netstate.NetworkUtils$NetworkType r1 = com.ss.android.lark.http.netstate.NetworkUtils.NetworkType.MOBILE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593487.<clinit>():void");
        }
    }

    public C59339a(AbstractC59334a aVar) {
        this.f147310b = aVar.mo178414a();
        this.f147309a = aVar;
    }

    /* renamed from: a */
    public void mo201670a(AbstractC59337a.AbstractC59338a aVar) {
        C59354c.m230413a().mo201709c();
        aVar.mo178029a();
        m230370b(this.f147310b);
    }

    /* renamed from: a */
    private void m230368a(final Context context) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable() {
            /* class com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.RunnableC593434 */

            public void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                try {
                    m230379a(context.getApplicationContext(), new BroadcastReceiver() {
                        /* class com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.RunnableC593434.C593441 */

                        public void onReceive(Context context, Intent intent) {
                            if (intent != null && "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
                                SdkSender.asynSendRequestNonWrap(Command.UPDATE_TIMEZONE, new UpdateTimezoneRequest.C19221a().mo65624a(TimeZone.getDefault().getID()), null, new SdkSender.IParser<Boolean>() {
                                    /* class com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.RunnableC593434.C593441.C593451 */

                                    /* renamed from: a */
                                    public Boolean parse(byte[] bArr) {
                                        return true;
                                    }
                                });
                            }
                        }
                    }, intentFilter);
                } catch (Exception unused) {
                }
            }

            @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
            /* renamed from: a */
            public static Intent m230379a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
                try {
                    return context.registerReceiver(broadcastReceiver, intentFilter);
                } catch (Exception e) {
                    if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                        return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                    }
                    throw e;
                }
            }
        });
    }

    /* renamed from: b */
    private void m230370b(Context context) {
        try {
            NetworkUtils.NetworkType d = NetworkUtils.m153071d(context);
            Log.m165378d("rust network onNetworkStateChange networkState = " + d);
            mo201669a(d);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: a */
    public void mo201669a(NetworkUtils.NetworkType networkType) {
        SetClientStatusRequest.NetType netType;
        int i = C593487.f147323a[networkType.ordinal()];
        if (i == 1) {
            netType = SetClientStatusRequest.NetType.ONLINE_2G;
        } else if (i == 2) {
            netType = SetClientStatusRequest.NetType.ONLINE_3G;
        } else if (i == 3) {
            netType = SetClientStatusRequest.NetType.ONLINE_4G;
        } else if (i == 4) {
            netType = SetClientStatusRequest.NetType.ONLINE_WIFI;
        } else if (i != 5) {
            netType = SetClientStatusRequest.NetType.OFFLINE;
        } else {
            netType = SetClientStatusRequest.NetType.ONLINE_WIRED;
        }
        SetClientStatusRequest.C15264a a = new SetClientStatusRequest.C15264a().mo55563a(netType);
        int i2 = f147308c;
        f147308c = i2 + 1;
        SdkSender.asynSendRequestNonWrap(Command.SET_CLIENT_STATUS, a.mo55565a(Integer.valueOf(i2)), null, new SdkSender.IParser<String>() {
            /* class com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593476 */

            /* renamed from: a */
            public String parse(byte[] bArr) throws IOException {
                return "";
            }
        });
    }

    /* renamed from: a */
    public void mo201671a(C59350b bVar) {
        String e = bVar.mo201684e();
        Log.m165379d("StoreRust", "storepath = " + e);
        this.f147309a.mo178416b().mo178421a("init_and_load_rust_sdk", null);
        m230369a(this.f147310b, bVar.mo201681b(), bVar.mo201688i(), bVar.mo201687h(), bVar.mo201682c(), bVar.mo201683d(), bVar.mo201680a(), e, bVar.mo201685f(), bVar.mo201686g(), bVar.mo201689j(), bVar.mo201690k(), bVar.mo201691l());
        this.f147309a.mo178416b().mo178419a();
        Sdk.addPushObserver(C53248k.m205912a());
    }

    /* renamed from: a */
    public void mo201667a(final int i, final String str, IGetDataCallback<Boolean> iGetDataCallback) {
        SetEnvRequest.C15268a a = new SetEnvRequest.C15268a().mo55574a(InitSDKRequest.EnvType.ONLINE).mo55575a(new InitSDKRequest.EnvV2(InitSDKRequest.EnvV2.Type.fromValue(i), str, "")).mo55576a((Boolean) true);
        String a2 = C53234a.m205877a();
        Log.m165389i("DeviceIdService", "StoreRust setEnv envType=" + i + ", serverUnit=" + str + ", contextId=" + a2);
        SdkSender.asynSendRequestNonWrap(Command.SET_ENV, a, a2, iGetDataCallback, new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593401 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                SetEnvResponse decode = SetEnvResponse.ADAPTER.decode(bArr);
                if (decode == null || decode.domain_settings == null || CollectionUtils.isEmpty(decode.domain_settings.pairs)) {
                    return false;
                }
                C59333a.m230349a().mo178415a(InitSDKRequest.EnvType.fromValue(i), str, decode.domain_settings);
                Log.m165389i("DeviceIdService", "setEnv success");
                return true;
            }
        });
    }

    /* renamed from: a */
    public void mo201668a(Context context, String str, String str2, String str3, String str4, String str5, final AbstractC59337a.AbstractC59338a aVar) {
        Log.m165389i("StoreRust", "StoreRust create");
        final String a = C53234a.m205877a();
        Log.m165389i("StoreRust", "rust setAccessToken locale params is :" + str4);
        Log.m165389i("DeviceIdService", "rust create, setAccessToken called, contextId = " + a + ", userId = " + str);
        this.f147309a.mo178416b().mo178422b("set_access_token", a);
        mo201672a(str2, str, str3, a, str4, str5, new IGetDataCallback<Void>() {
            /* class com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593412 */

            /* renamed from: a */
            public void onSuccess(Void r3) {
                Log.m165389i("StoreRust", "set accesstoken success");
                C59339a.this.f147309a.mo178416b().mo178423c("set_access_token", a);
                C59339a.this.mo201670a(aVar);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165387e("StoreRust->create result is null", (Throwable) new RuntimeException("StoreRust->create result is null"), true);
                C59339a.this.f147309a.mo178416b().mo178420a(errorResult);
            }
        });
    }

    /* renamed from: a */
    public void mo201672a(String str, String str2, String str3, String str4, String str5, String str6, IGetDataCallback<Void> iGetDataCallback) {
        MakeUserOnlineRequest.C19723a aVar;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!this.f147309a.mo178418d().isGuest(str2)) {
                aVar = new MakeUserOnlineRequest.C19723a().mo66840a(str).mo66842b(str5).mo66843c(str6).mo66839a(Long.valueOf(Long.parseLong(str2))).mo66838a(new MakeUserOnlineRequest.NamedUserExtraInfo(MakeUserOnlineRequest.NamedUserExtraInfo.TenantTag.UNDEFINED, new HashMap()));
            } else {
                aVar = new MakeUserOnlineRequest.C19723a().mo66840a(str).mo66839a(Long.valueOf(Long.parseLong(str2))).mo66843c(str6).mo66837a(new MakeUserOnlineRequest.GuestUserExtraInfo());
            }
            SdkSender.asynSendRequestNonWrap(Command.MAKE_USER_ONLINE, aVar, str4, iGetDataCallback, new SdkSender.IParser<Void>() {
                /* class com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593465 */

                /* renamed from: a */
                public Void parse(byte[] bArr) throws IOException {
                    MakeUserOnlineResponse decode = MakeUserOnlineResponse.ADAPTER.decode(bArr);
                    if (decode == null) {
                        Log.m165387e("DevicesAPIRustImpl->asyncMakeUserOnline response is null", (Throwable) new RuntimeException("DevicesAPIRustImpl->asyncMakeUserOnline response is null"), true);
                        return null;
                    }
                    Log.m165389i("StoreRust", "asyncMakeUserOnline isValid: " + decode.is_valid);
                    return null;
                }
            });
        }
    }

    /* renamed from: a */
    private void m230369a(Context context, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i3, int i4, C59350b.AbstractC59353b bVar) {
        InitSDKRequest.C15029a aVar = new InitSDKRequest.C15029a();
        InitSDKRequest.EnvType fromValue = InitSDKRequest.EnvType.fromValue(i);
        InitSDKRequest.EnvV2 envV2 = new InitSDKRequest.EnvV2(InitSDKRequest.EnvV2.Type.fromValue(i2), str, "");
        InitLogUpload.C15019a aVar2 = new InitLogUpload.C15019a();
        aVar2.mo54880a(str7);
        boolean z = true;
        aVar2.mo54879a((Boolean) true);
        aVar2.mo54881a(new ArrayList<LogPathWithType>(context) {
            /* class com.ss.android.lark.p2989x.p2991b.p2992a.C59339a.C593423 */
            final /* synthetic */ Context val$context;

            {
                this.val$context = r5;
                add(new LogPathWithType(C57881t.m224634f(r5), LogPathWithType.LogType.METRIC, LogPathWithType.LogOrigin.DOCS));
                add(new LogPathWithType(C57881t.m224635g(r5), LogPathWithType.LogType.METRIC, LogPathWithType.LogOrigin.MINIAPP));
            }
        });
        Log.m165389i("DeviceIdService", "initSdk env = , " + fromValue);
        aVar.mo54914a(str5).mo54925i(DynamicConfigModule.m145555d()).mo54905a(fromValue).mo54906a(envV2).mo54904a(InitSDKRequest.DataSynchronismStrategy.SUBSCRIBE).mo54921e(str4).mo54917b(str2).mo54919c(str3).mo54912a((Boolean) true).mo54908a(new InitSDKRequest.PreloadConfig(Integer.valueOf(C59333a.m230349a().mo178417c()))).mo54922f(str6).mo54916b((Boolean) false).mo54903a(aVar2.build()).mo54902a(new DeprecatedConfig.C14862a().mo54505a(false).build()).mo54907a(InitSDKRequest.PackageId.fromValue(i3)).mo54913a(Long.valueOf(Looper.getMainLooper().getThread().getId())).mo54920d(String.valueOf(i4)).mo54924h(TimeZone.getDefault().getID());
        if (bVar != null) {
            bVar.onInitRequest(aVar);
        }
        if (PackageChannelManager.isKABuildPackage(context)) {
            KaInitConfig.C15033a aVar3 = new KaInitConfig.C15033a();
            aVar3.mo54934a(PackageChannelManager.getBuildPackageChannel(context));
            if (!PackageChannelManager.isKABuildPackage(context) || PackageChannelManager.getDeployMode(context) == 1) {
                z = false;
            }
            aVar3.mo54933a(Boolean.valueOf(z));
            if (z) {
                aVar3.mo54936b(DynamicConfigModule.m145555d());
            }
            aVar.mo54910a(aVar3.build());
        }
        Sdk.getInstance().initSDK(context, aVar);
        m230368a(context);
        C59354c.m230413a().mo201707b();
    }
}

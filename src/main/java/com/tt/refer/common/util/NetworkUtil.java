package com.tt.refer.common.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.android.HwBuildEx;
import com.ss.android.lark.integrator.p2018e.C39400a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import com.tt.miniapphost.host.HostDependManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Lcom/tt/refer/common/util/NetworkUtil;", "", "()V", "Companion", "NetWorkChangedListener", "NetworkType", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.common.util.e */
public final class NetworkUtil {

    /* renamed from: a */
    public static boolean f170921a;

    /* renamed from: b */
    public static final Handler f170922b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public static final Map<IAppContext, NetWorkChangedListener> f170923c = new LinkedHashMap();

    /* renamed from: d */
    public static Companion.NetChangedRunnable f170924d;

    /* renamed from: e */
    public static Runnable f170925e;

    /* renamed from: f */
    public static boolean f170926f;

    /* renamed from: g */
    public static long f170927g;

    /* renamed from: h */
    public static String f170928h;

    /* renamed from: i */
    public static boolean f170929i;

    /* renamed from: j */
    public static String f170930j;

    /* renamed from: k */
    public static final Companion f170931k = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/tt/refer/common/util/NetworkUtil$NetWorkChangedListener;", "", "onChanged", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "networkType", "", "isAvailable", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.common.util.e$b */
    public interface NetWorkChangedListener {
        /* renamed from: a */
        void mo88035a(IAppContext iAppContext, String str, boolean z);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m264004a(Context context) {
        return f170931k.mo235497a(context);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m264005a(Context context, ConnectivityManager connectivityManager) {
        return f170931k.mo235498a(context, connectivityManager);
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m264006b(Context context) {
        return f170931k.mo235501b(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001:\u0001(B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010!\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0012H\u0007J\u0010\u0010&\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010'\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/tt/refer/common/util/NetworkUtil$Companion;", "", "()V", "DELAY_TIME", "", "TAG", "", "TIME_INTERVAL", "currentAvailableState", "", "currentNetworkType", "hasRegister", "lastAvailableState", "lastChangeTime", "lastNetworkType", "listenerList", "", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "Lcom/tt/refer/common/util/NetworkUtil$NetWorkChangedListener;", "mainHandler", "Landroid/os/Handler;", "netChangeRunnable", "Lcom/tt/refer/common/util/NetworkUtil$Companion$NetChangedRunnable;", "realNetChangeRunnable", "Ljava/lang/Runnable;", "getNetGeneration", "context", "Landroid/content/Context;", "getNetGenerationV2", "connManager", "Landroid/net/ConnectivityManager;", "getNetworkType", "isNetworkAvailable", "onNetworkChanged", "", "registerNetWorkChangedListener", "appContext", "listener", "sendNetworkChanged", "unregisterNetWorkChangedListener", "NetChangedRunnable", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.common.util.e$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tt/refer/common/util/NetworkUtil$Companion$NetChangedRunnable;", "Ljava/lang/Runnable;", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getApplicationContext", "()Landroid/content/Context;", "run", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.tt.refer.common.util.e$a$a */
        public static final class NetChangedRunnable implements Runnable {

            /* renamed from: a */
            private final Context f170932a;

            public void run() {
                NetworkUtil.f170931k.mo235503d(this.f170932a);
            }

            public NetChangedRunnable(Context context) {
                Intrinsics.checkParameterIsNotNull(context, "applicationContext");
                this.f170932a = context;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.tt.refer.common.util.e$a$b */
        public static final class RunnableC67863b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Context f170933a;

            RunnableC67863b(Context context) {
                this.f170933a = context;
            }

            public final void run() {
                NetworkUtil.f170931k.mo235504e(this.f170933a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo235499a(IAppContext iAppContext) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            NetworkUtil.f170923c.remove(iAppContext);
        }

        /* renamed from: a */
        public static int m264007a(TelephonyManager telephonyManager) {
            if (Build.VERSION.SDK_INT < 24) {
                return telephonyManager.getNetworkType();
            }
            try {
                C39400a.m155625a().mo143243a(LarkContext.getApplication());
                C39400a.m155625a().mo143245b(LarkContext.getApplication());
                if (C39400a.m155625a().mo143244b() != -1) {
                    return C39400a.m155625a().mo143244b();
                }
                int networkType = telephonyManager.getNetworkType();
                C39400a.m155625a().mo143242a(networkType);
                Log.m165389i("TelephonyManagerLancetHook", "get network type from system");
                return networkType;
            } catch (Throwable th) {
                Log.m165386e("TelephonyManagerLancetHook", th);
                return telephonyManager.getNetworkType();
            }
        }

        @JvmStatic
        /* renamed from: b */
        public final String mo235501b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            AppBrandLogger.m52830i("NetworkUtil", "get network type v1");
            Object systemService = context.getSystemService("phone");
            if (systemService != null) {
                int a = m264007a((TelephonyManager) systemService);
                if (a == 20) {
                    return "5g";
                }
                switch (a) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return "2g";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                    case 14:
                    case 15:
                        return "3g";
                    case 13:
                        return "4g";
                    default:
                        return "unknown";
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            }
        }

        /* renamed from: c */
        public final boolean mo235502c(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                try {
                    NetworkInfo[] allNetworkInfo = ((ConnectivityManager) systemService).getAllNetworkInfo();
                    Intrinsics.checkExpressionValueIsNotNull(allNetworkInfo, "connectivityManager.getAllNetworkInfo()");
                    for (NetworkInfo networkInfo : allNetworkInfo) {
                        Intrinsics.checkExpressionValueIsNotNull(networkInfo, "it");
                        if (networkInfo.isAvailable() && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AppBrandLogger.m52829e("NetworkUtil", e);
                    return false;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
        }

        /* renamed from: d */
        public final void mo235503d(Context context) {
            Companion aVar = this;
            boolean c = aVar.mo235502c(context);
            String a = aVar.mo235497a(context);
            long currentTimeMillis = System.currentTimeMillis();
            if (c == NetworkUtil.f170926f && TextUtils.equals(NetworkUtil.f170928h, a) && currentTimeMillis - NetworkUtil.f170927g <= 1000) {
                NetworkUtil.f170927g = currentTimeMillis;
            } else if (NetworkUtil.f170928h != null) {
                NetworkUtil.f170926f = c;
                NetworkUtil.f170928h = a;
                NetworkUtil.f170927g = currentTimeMillis;
                if (TextUtils.equals(a, "none")) {
                    NetworkUtil.f170925e = new RunnableC67863b(context);
                    Runnable runnable = NetworkUtil.f170925e;
                    if (runnable != null) {
                        NetworkUtil.f170922b.postDelayed(runnable, 1000);
                        return;
                    }
                    return;
                }
                Runnable runnable2 = NetworkUtil.f170925e;
                if (runnable2 != null) {
                    NetworkUtil.f170922b.removeCallbacks(runnable2);
                }
                aVar.mo235504e(context);
            } else {
                NetworkUtil.f170926f = c;
                NetworkUtil.f170928h = a;
            }
        }

        /* renamed from: e */
        public final void mo235504e(Context context) {
            Companion aVar = this;
            boolean c = aVar.mo235502c(context);
            String a = aVar.mo235497a(context);
            if (NetworkUtil.f170929i != c || !TextUtils.equals(NetworkUtil.f170930j, a)) {
                NetworkUtil.f170929i = c;
                NetworkUtil.f170930j = a;
                for (Map.Entry<IAppContext, NetWorkChangedListener> entry : NetworkUtil.f170923c.entrySet()) {
                    NetWorkChangedListener bVar = NetworkUtil.f170923c.get(entry.getKey());
                    if (bVar != null) {
                        bVar.mo88035a(entry.getKey(), a, c);
                    }
                }
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo235497a(Context context) {
            String str;
            Intrinsics.checkParameterIsNotNull(context, "context");
            try {
                Object systemService = context.getSystemService("connectivity");
                if (systemService != null) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                        AppBrandLogger.m52830i("NetworkUtil", "network null or network unAvailable");
                        str = "none";
                    } else {
                        int type = activeNetworkInfo.getType();
                        if (type != 0) {
                            if (type != 1) {
                                return "unknown";
                            }
                            str = "wifi";
                        } else if (HostDependManager.getInst().getFeatureGating("gadget.api.networktype")) {
                            str = mo235498a(context, connectivityManager);
                        } else {
                            str = mo235501b(context);
                        }
                    }
                    return str;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
            } catch (Exception e) {
                AppBrandLogger.eWithThrowable("NetworkUtil", e.getMessage(), e);
                return "unknown";
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo235500a(IAppContext iAppContext, NetWorkChangedListener bVar) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            Intrinsics.checkParameterIsNotNull(bVar, "listener");
            if (!NetworkUtil.f170921a) {
                NetworkUtil.f170921a = true;
                m264008a(iAppContext.getApplicationContext(), new NetworkUtil$Companion$registerNetWorkChangedListener$1(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            }
            NetworkUtil.f170923c.put(iAppContext, bVar);
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo235498a(Context context, ConnectivityManager connectivityManager) {
            Integer num;
            String str;
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(connectivityManager, "connManager");
            AppBrandLogger.m52830i("NetworkUtil", "get network type v2");
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null) {
                return "unknown";
            }
            NetworkInfo.State state = networkInfo.getState();
            String subtypeName = networkInfo.getSubtypeName();
            Integer num2 = null;
            if (activeNetworkInfo != null) {
                num = Integer.valueOf(activeNetworkInfo.getSubtype());
            } else {
                num = null;
            }
            if (activeNetworkInfo != null) {
                str = activeNetworkInfo.getSubtypeName();
            } else {
                str = null;
            }
            AppBrandLogger.m52830i("NetworkUtil", "network: " + state + " ," + subtypeName + " ," + num + " ," + str);
            if (state == null) {
                return "unknown";
            }
            if (state != NetworkInfo.State.CONNECTED && state != NetworkInfo.State.CONNECTING) {
                return "unknown";
            }
            if (activeNetworkInfo != null) {
                num2 = Integer.valueOf(activeNetworkInfo.getSubtype());
            }
            if ((num2 != null && num2.intValue() == 1) || ((num2 != null && num2.intValue() == 4) || ((num2 != null && num2.intValue() == 2) || ((num2 != null && num2.intValue() == 7) || ((num2 != null && num2.intValue() == 11) || (num2 != null && num2.intValue() == 16)))))) {
                return "2g";
            }
            if ((num2 == null || num2.intValue() != 6) && ((num2 == null || num2.intValue() != 3) && ((num2 == null || num2.intValue() != 5) && ((num2 == null || num2.intValue() != 8) && ((num2 == null || num2.intValue() != 9) && ((num2 == null || num2.intValue() != 10) && ((num2 == null || num2.intValue() != 12) && ((num2 == null || num2.intValue() != 14) && ((num2 == null || num2.intValue() != 15) && (num2 == null || num2.intValue() != 18)))))))))) {
                if (num2 != null && num2.intValue() == 13) {
                    return "4g";
                }
                if (num2 != null && num2.intValue() == 20) {
                    return "5g";
                }
                if (!StringsKt.equals(subtypeName, "TD-SCDMA", true) && !StringsKt.equals(subtypeName, "WCDMA", true) && !StringsKt.equals(subtypeName, "CDMA2000", true)) {
                    return "unknown";
                }
            }
            return "3g";
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        /* renamed from: a */
        public static Intent m264008a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }
    }
}

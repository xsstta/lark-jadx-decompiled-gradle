package com.bytedance.bdturing.setting;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.bdturing.LogUtil;
import com.bytedance.bdturing.localstorage.DbManager;
import com.bytedance.bdturing.setting.SettingUpdateRequest;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020\u0001J\b\u0010K\u001a\u00020 H\u0002J\u0010\u0010L\u001a\u0004\u0018\u00010\u00042\u0006\u0010M\u001a\u00020\u0004J\u001a\u0010N\u001a\u0004\u0018\u00010\u00042\u0006\u0010M\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004H\u0002J\u0010\u0010P\u001a\u0004\u0018\u00010\u00042\u0006\u0010M\u001a\u00020\u0004J\u000e\u0010Q\u001a\u0002002\u0006\u0010M\u001a\u00020\u0004J\u0012\u0010R\u001a\u00020\t2\b\b\u0002\u0010S\u001a\u00020 H\u0002J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u001cJ\"\u0010Y\u001a\u00020U2\u0006\u0010Z\u001a\u00020\u001e2\b\u0010[\u001a\u0004\u0018\u00010\u00042\u0006\u0010\\\u001a\u00020\tH\u0016J\u000e\u0010]\u001a\u00020 2\u0006\u0010J\u001a\u00020\u0001J\u001a\u0010^\u001a\u00020U2\b\b\u0002\u0010_\u001a\u00020 2\u0006\u0010`\u001a\u00020\u0001H\u0007J\b\u0010a\u001a\u00020UH\u0002J&\u0010b\u001a\u00020U2\u0006\u0010M\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u00042\u0006\u0010d\u001a\u00020\u00042\u0006\u0010e\u001a\u00020\u0004J\u0012\u0010f\u001a\u00020U2\b\b\u0002\u0010g\u001a\u00020\tH\u0002J\u0010\u0010h\u001a\u00020U2\u0006\u0010i\u001a\u00020\u0004H\u0002J\u0014\u0010j\u001a\u00020\u0004*\u00020\u00042\u0006\u0010k\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t8B@BX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\t8BX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0016R\u000e\u0010/\u001a\u000200X\u000e¢\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020 8BX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0004¢\u0006\u0002\n\u0000R$\u00106\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020 8F@FX\u000e¢\u0006\f\u001a\u0004\b7\u00103\"\u0004\b8\u00109R\u000e\u0010:\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R$\u0010;\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020 8F@FX\u000e¢\u0006\f\u001a\u0004\b<\u00103\"\u0004\b=\u00109R\u000e\u0010>\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R$\u0010?\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020 8F@FX\u000e¢\u0006\f\u001a\u0004\b@\u00103\"\u0004\bA\u00109R\u000e\u0010B\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R$\u0010C\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020 8F@FX\u000e¢\u0006\f\u001a\u0004\bD\u00103\"\u0004\bE\u00109R\u000e\u0010F\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u000e¢\u0006\u0002\n\u0000¨\u0006l"}, d2 = {"Lcom/bytedance/bdturing/setting/SettingsManager;", "Lcom/bytedance/bdturing/setting/SettingUpdateRequest$Callback;", "()V", "BACK_UP_KEY", "", "CDN_KEY", "COMMON_SERVICE", "HOST_KEY", "MIN_DELAY_TIME", "", "QA_SERVICE", "SETTINGS_PATH", "SMARTER_BUTTON_SERVICE", "SMARTER_VIEW_SERVICE", "SMS_SERVICE", "TAG", "TWICE_VERIFY_SERVICE", "UNPUNISH_SERVICE", "VERIFY_SERVICE", "value", "availableTime", "getAvailableTime", "()J", "setAvailableTime", "(J)V", "callbacks", "", "configProvider", "Lcom/bytedance/bdturing/setting/ConfigProvider;", "currentRetryCount", "", "inited", "", "mServiceInterceptor", "Lcom/bytedance/bdturing/setting/ServiceInterceptor;", "getMServiceInterceptor", "()Lcom/bytedance/bdturing/setting/ServiceInterceptor;", "setMServiceInterceptor", "(Lcom/bytedance/bdturing/setting/ServiceInterceptor;)V", "period", "getPeriod", "proxys", "retryCount", "getRetryCount", "()I", "retryInterval", "getRetryInterval", "settings", "Lorg/json/JSONObject;", "skipLaunch", "getSkipLaunch", "()Z", "updateTask", "Ljava/lang/Runnable;", "useJsbRequest", "getUseJsbRequest", "setUseJsbRequest", "(Z)V", "useJsbRequestTest", "useMock", "getUseMock", "setUseMock", "useMockTest", "useNativeReport", "getUseNativeReport", "setUseNativeReport", "useNativeReportTest", "usePreCreate", "getUsePreCreate", "setUsePreCreate", "usePreCreateTest", "workHandler", "Landroid/os/Handler;", "addCallback", "pxy", "checkValid", "getCDN", "service", "getDataWithFallback", ShareHitPoint.f121869d, "getHost", "getServiceSettings", "getTaskDelay", "isSuccess", "init", "", "context", "Landroid/content/Context;", "provider", "onResponse", "responseCode", "responseContent", "duration", "removeCallback", "requestSettings", "force", "callback", "sendRequest", "setServiceUrlSettings", "key", "region", "url", "startUpdateTask", "delay", "updateSettings", "content", "appendPath", "path", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.setting.g */
public final class SettingsManager implements SettingUpdateRequest.Callback {

    /* renamed from: a */
    public static final SettingsManager f11297a = new SettingsManager();

    /* renamed from: b */
    private static int f11298b;

    /* renamed from: c */
    private static boolean f11299c;

    /* renamed from: d */
    private static boolean f11300d;

    /* renamed from: e */
    private static boolean f11301e;

    /* renamed from: f */
    private static JSONObject f11302f = DefaultSettings.f11289a.mo14391a();

    /* renamed from: g */
    private static Handler f11303g;

    /* renamed from: h */
    private static ConfigProvider f11304h;

    /* renamed from: i */
    private static final List<SettingUpdateRequest.Callback> f11305i = new LinkedList();

    /* renamed from: j */
    private static final List<SettingUpdateRequest.Callback> f11306j = new LinkedList();

    /* renamed from: k */
    private static final Runnable f11307k = new RunnableC3573a();

    /* renamed from: l */
    private static ServiceInterceptor f11308l;

    /* renamed from: m */
    private static boolean f11309m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/bdturing/setting/SettingsManager$updateTask$1", "Ljava/lang/Runnable;", "run", "", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bdturing.setting.g$a */
    public static final class RunnableC3573a implements Runnable {
        RunnableC3573a() {
        }

        public void run() {
            SettingsManager.f11297a.mo14405d();
        }
    }

    private SettingsManager() {
    }

    /* renamed from: c */
    public final boolean mo14404c() {
        return f11301e;
    }

    /* renamed from: a */
    public final boolean mo14399a() {
        return f11299c || mo14403c("common").optInt("use_native_report", 0) == 1;
    }

    /* renamed from: a */
    public final boolean mo14400a(SettingUpdateRequest.Callback aVar) {
        boolean add;
        Intrinsics.checkParameterIsNotNull(aVar, "pxy");
        List<SettingUpdateRequest.Callback> list = f11305i;
        synchronized (list) {
            add = list.add(aVar);
        }
        return add;
    }

    /* renamed from: f */
    private final int m15081f() {
        return mo14403c("common").optInt("retry_count", 0);
    }

    /* renamed from: g */
    private final long m15082g() {
        return mo14403c("common").optLong("retry_interval", 30000);
    }

    /* renamed from: h */
    private final long m15083h() {
        return mo14403c("common").optLong("period", 30000);
    }

    /* renamed from: i */
    private final long m15084i() {
        return f11302f.optLong("available_time");
    }

    /* renamed from: j */
    private final boolean m15085j() {
        if (m15084i() > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m15080e() {
        if (mo14403c("common").optInt("skip_launch", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo14402b() {
        if (f11300d || mo14403c("common").optInt("use_jsb_request", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo14405d() {
        String str;
        HashMap hashMap = new HashMap();
        ConfigProvider aVar = f11304h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        Pair pair = TuplesKt.to("aid", aVar.mo14281c());
        hashMap.put(pair.getFirst(), pair.getSecond());
        ConfigProvider aVar2 = f11304h;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        Pair pair2 = TuplesKt.to("lang", aVar2.mo14284f());
        hashMap.put(pair2.getFirst(), pair2.getSecond());
        ConfigProvider aVar3 = f11304h;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        Pair pair3 = TuplesKt.to("app_name", aVar3.mo14285g());
        hashMap.put(pair3.getFirst(), pair3.getSecond());
        ConfigProvider aVar4 = f11304h;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        Pair pair4 = TuplesKt.to("channel", aVar4.mo14288j());
        hashMap.put(pair4.getFirst(), pair4.getSecond());
        ConfigProvider aVar5 = f11304h;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        Pair pair5 = TuplesKt.to("region", aVar5.mo14289k());
        hashMap.put(pair5.getFirst(), pair5.getSecond());
        Pair pair6 = TuplesKt.to("os_type", "0");
        hashMap.put(pair6.getFirst(), pair6.getSecond());
        Pair pair7 = TuplesKt.to("datetime", String.valueOf(System.currentTimeMillis()));
        hashMap.put(pair7.getFirst(), pair7.getSecond());
        ConfigProvider aVar6 = f11304h;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        Pair pair8 = TuplesKt.to("sdk_version", aVar6.mo14287i());
        hashMap.put(pair8.getFirst(), pair8.getSecond());
        ConfigProvider aVar7 = f11304h;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        Pair pair9 = TuplesKt.to("iid", aVar7.mo14282d());
        hashMap.put(pair9.getFirst(), pair9.getSecond());
        ConfigProvider aVar8 = f11304h;
        if (aVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        Pair pair10 = TuplesKt.to("app_version", aVar8.mo14286h());
        hashMap.put(pair10.getFirst(), pair10.getSecond());
        Pair pair11 = TuplesKt.to("os_name", "Android");
        hashMap.put(pair11.getFirst(), pair11.getSecond());
        Pair pair12 = TuplesKt.to("os_version", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put(pair12.getFirst(), pair12.getSecond());
        ConfigProvider aVar9 = f11304h;
        if (aVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        Pair pair13 = TuplesKt.to("did", aVar9.mo14283e());
        hashMap.put(pair13.getFirst(), pair13.getSecond());
        String str2 = Build.BRAND;
        try {
            str2 = URLEncoder.encode(str2, "utf-8");
        } catch (UnsupportedEncodingException e) {
            LogUtil.m14894a(e);
        }
        Pair pair14 = TuplesKt.to("device_brand", str2);
        hashMap.put(pair14.getFirst(), pair14.getSecond());
        String b = mo14401b("common");
        if (b != null) {
            str = m15077b(b, "vc/setting");
        } else {
            str = null;
        }
        LogUtil.m14899d("SettingsMager", str);
        if (str != null || !LogUtil.m14896a()) {
            if (str == null) {
                str = "";
            }
            SettingsManager gVar = this;
            ConfigProvider aVar10 = f11304h;
            if (aVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("configProvider");
            }
            new SettingUpdateRequest(str, hashMap, gVar, aVar10.mo14280b()).mo14395a();
            return;
        }
        throw new RuntimeException("url should not empty");
    }

    /* renamed from: a */
    private final void m15075a(long j) {
        f11302f.put("available_time", j);
    }

    /* renamed from: b */
    public final String mo14401b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "service");
        return m15074a(str, "host");
    }

    /* renamed from: b */
    private final void m15078b(long j) {
        Handler handler = f11303g;
        if (handler != null) {
            handler.removeCallbacks(f11307k);
        }
        Handler handler2 = f11303g;
        if (handler2 != null) {
            handler2.postDelayed(f11307k, j);
        }
    }

    /* renamed from: d */
    private final void m15079d(String str) {
        try {
            f11302f = new JSONObject(str);
            m15075a(System.currentTimeMillis() + m15083h());
            DbManager.f11148a.mo14300a(str);
        } catch (JSONException e) {
            LogUtil.m14894a(e);
        }
    }

    /* renamed from: a */
    private final long m15073a(boolean z) {
        if (z || f11298b >= m15081f() || m15082g() == 0) {
            return Math.max(Math.min(m15084i() - System.currentTimeMillis(), m15083h()), 30000L);
        }
        f11298b++;
        return m15082g();
    }

    /* renamed from: c */
    public final JSONObject mo14403c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "service");
        JSONObject optJSONObject = f11302f.optJSONObject(str);
        if (optJSONObject == null) {
            optJSONObject = DefaultSettings.f11289a.mo14391a().optJSONObject(str);
        }
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        ConfigProvider aVar = f11304h;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        ServiceInterceptor a = aVar.mo14279a();
        if (a != null) {
            f11302f.put(str, a.mo14394a(str, optJSONObject));
        }
        return optJSONObject;
    }

    /* renamed from: a */
    public final String mo14396a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "service");
        return m15074a(str, "url");
    }

    /* renamed from: b */
    private final String m15077b(String str, String str2) {
        if (StringsKt.endsWith$default(str, "/", false, 2, (Object) null)) {
            return str + str2;
        }
        return str + '/' + str2;
    }

    /* renamed from: a */
    private final String m15074a(String str, String str2) {
        String str3;
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = mo14403c(str).optJSONObject(str2);
        if (optJSONObject2 != null) {
            ConfigProvider aVar = f11304h;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("configProvider");
            }
            str3 = optJSONObject2.optString(aVar.mo14289k());
        } else {
            str3 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        JSONObject optJSONObject3 = DefaultSettings.f11289a.mo14391a().optJSONObject(str);
        if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject(str2)) == null) {
            return null;
        }
        ConfigProvider aVar2 = f11304h;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configProvider");
        }
        return optJSONObject.optString(aVar2.mo14289k());
    }

    /* renamed from: a */
    public final void mo14397a(Context context, ConfigProvider aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        synchronized (this) {
            if (!f11309m) {
                f11304h = new ConfigProviderChecker(aVar);
                ConfigProvider aVar2 = f11304h;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("configProvider");
                }
                f11303g = new Handler(aVar2.mo14290l());
                ConfigProvider aVar3 = f11304h;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("configProvider");
                }
                f11308l = aVar3.mo14279a();
                DbManager.f11148a.mo14299a(context);
                String a = DbManager.f11148a.mo14298a();
                if (a != null) {
                    f11297a.m15079d(a);
                }
                FreeFlowHost dVar = FreeFlowHost.f11292a;
                ConfigProvider aVar4 = f11304h;
                if (aVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("configProvider");
                }
                dVar.mo14392a(aVar4.mo14281c());
                SettingsManager gVar = f11297a;
                if (gVar.m15080e()) {
                    gVar.m15078b(m15072a(gVar, false, 1, (Object) null));
                } else {
                    m15076a(gVar, 0, 1, (Object) null);
                }
                f11309m = true;
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo14398a(boolean z, SettingUpdateRequest.Callback aVar) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        if (z || !m15085j()) {
            synchronized (this) {
                List<SettingUpdateRequest.Callback> list = f11306j;
                if (list.size() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(aVar);
                if (z2) {
                    m15076a(f11297a, 0, 1, (Object) null);
                }
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        aVar.mo14278a(LocationRequest.PRIORITY_HD_ACCURACY, null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062 A[LOOP:0: B:14:0x005c->B:16:0x0062, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072 A[SYNTHETIC] */
    @Override // com.bytedance.bdturing.setting.SettingUpdateRequest.Callback
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14278a(int r6, java.lang.String r7, long r8) {
        /*
        // Method dump skipped, instructions count: 174
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.setting.SettingsManager.mo14278a(int, java.lang.String, long):void");
    }

    /* renamed from: a */
    static /* synthetic */ long m15072a(SettingsManager gVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return gVar.m15073a(z);
    }

    /* renamed from: a */
    static /* synthetic */ void m15076a(SettingsManager gVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        gVar.m15078b(j);
    }
}

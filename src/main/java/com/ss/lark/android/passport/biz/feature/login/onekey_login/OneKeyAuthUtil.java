package com.ss.lark.android.passport.biz.feature.login.onekey_login;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.p2069j.p2070a.C40654u;
import com.ss.android.lark.passport.infra.base.p2426c.p2430d.C49067a;
import com.ss.android.lark.passport.infra.base.storage.IsolateStorage;
import com.ss.android.lark.passport.infra.base.storage.key.Key;
import com.ss.android.lark.passport.infra.base.storage.store.DataStorageDelegate;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.model.OneKeyAuthConfigData;
import com.ss.android.lark.passport.infra.util.OperatorAuthTokenInfo;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.C49368c;
import com.ss.android.lark.passport.signinsdk_api.entity.SecurityScanResult;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49395i;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49396j;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.C57878s;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.ttvecamera.p3038g.C60375c;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001@B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J'\u0010\u0018\u001a\u0004\u0018\u0001H\u0019\"\b\b\u0000\u0010\u0019*\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001bH\u0002¢\u0006\u0002\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020\u000bJ\u0010\u0010(\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020\u000bJ>\u0010,\u001a\u00020\u00172\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\b\b\u0002\u0010-\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010.\u001a\u00020&2\b\b\u0002\u0010/\u001a\u00020\u000bH\u0007J\u0006\u00100\u001a\u00020\u0017J\"\u00101\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0002\u00104\u001a\u000205J\u0018\u00106\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*2\u0006\u00107\u001a\u00020\u000bH\u0002J\u0010\u00108\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u000bH\u0002J(\u0010:\u001a\u00020\u00172\u0006\u0010)\u001a\u00020;2\u0006\u0010.\u001a\u00020&2\u0006\u0010<\u001a\u00020\u000b2\b\u0010!\u001a\u0004\u0018\u00010\"J\u000e\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020?R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/OneKeyAuthUtil;", "", "()V", "KEY_ENABLE_ONEKEY_LOGIN", "", "KEY_ENABLE_ONEKEY_SECURITY_SCAN", "KEY_NET_TYPE", "KEY_SECURITY_PHONE", "KEY_SP_ONEKEY_LOGIN", "TAG", "enableOnekeyLogin", "", "enableOnekeySecurityScan", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "oneKeyLoginService", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IOneKeyLoginService;", "getOneKeyLoginService", "()Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IOneKeyLoginService;", "oneKeyLoginService$delegate", "Lkotlin/Lazy;", "onekeyLoginServiceInitialized", "clearCache", "", "findService", "T", C60375c.f150914a, "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getAuthToken", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/android/lark/passport/infra/util/OperatorAuthTokenInfo;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "getConfig", "Lcom/ss/android/lark/passport/signinsdk_api/entity/OneKeyLoginConfig;", ShareHitPoint.f121869d, "", "getEnableOneKeyLogin", "getEnableOnekeyLoginSp", "context", "Landroid/content/Context;", "getEnableOnekeyScan", "getSecurityPhone", "useCach", "authType", "oneKeyAuthStarting", "initOneKeyLogin", "mobileSecurityScan", "securityScanCallback", "Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/OneKeyAuthUtil$SecurityScanCallback;", "timeoutMs", "", "saveEnableOnekeyLogin", "enableOnekey", "saveEnableOnekeyScan", "enableOnekeyScan", "startOneKeyAuthActivity", "Landroid/app/Activity;", "fromGuide", "updateOneKeyLoginConfig", "config", "Lcom/ss/android/lark/passport/infra/model/OneKeyAuthConfigData;", "SecurityScanCallback", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b */
public final class OneKeyAuthUtil {

    /* renamed from: a */
    public static final OneKeyAuthUtil f163513a;

    /* renamed from: b */
    private static boolean f163514b;

    /* renamed from: c */
    private static boolean f163515c;

    /* renamed from: d */
    private static boolean f163516d;

    /* renamed from: e */
    private static final Lazy f163517e = LazyKt.lazy(C64874h.INSTANCE);

    /* renamed from: f */
    private static final PassportLog f163518f = PassportLog.f123351c.mo171474a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/onekey_login/OneKeyAuthUtil$SecurityScanCallback;", "", "onScanFinish", "", "scanResult", "Lcom/ss/android/lark/passport/signinsdk_api/entity/SecurityScanResult;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b$a */
    public interface SecurityScanCallback {
        /* renamed from: a */
        void mo223803a(SecurityScanResult securityScanResult);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "event", "", "kotlin.jvm.PlatformType", "params", "Lorg/json/JSONObject;", "onEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b$e */
    public static final class C64870e implements AbstractC49395i {

        /* renamed from: a */
        public static final C64870e f163525a = new C64870e();

        C64870e() {
        }
    }

    /* renamed from: a */
    public final AbstractC49396j mo223817a() {
        return (AbstractC49396j) f163517e.getValue();
    }

    /* renamed from: a */
    public final void mo223823a(AbstractC49352d<OperatorAuthTokenInfo> dVar, boolean z, UniContext uniContext, int i) {
        m254762a(this, dVar, z, uniContext, i, false, 16, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b$c */
    public static final class C64867c implements Key<Boolean> {

        /* renamed from: b */
        final /* synthetic */ String f163521b;

        /* renamed from: c */
        private final String f163522c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f163522c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<Boolean>() {
                /* class com.ss.lark.android.passport.biz.feature.login.onekey_login.OneKeyAuthUtil.C64867c.C648681 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C64867c(String str) {
            this.f163521b = str;
            this.f163522c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"com/ss/android/lark/passport/infra/base/storage/key/Key$Companion$newKey$1", "Lcom/ss/android/lark/passport/infra/base/storage/key/Key;", "key", "", "getKey", "()Ljava/lang/String;", ShareHitPoint.f121869d, "Ljava/lang/reflect/Type;", "getType", "()Ljava/lang/reflect/Type;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b$i */
    public static final class C64875i implements Key<Boolean> {

        /* renamed from: b */
        final /* synthetic */ String f163537b;

        /* renamed from: c */
        private final String f163538c;

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: a */
        public String mo171118a() {
            return this.f163538c;
        }

        @Override // com.ss.android.lark.passport.infra.base.storage.key.Key
        /* renamed from: b */
        public Type mo171119b() {
            Type type = new TypeToken<Boolean>() {
                /* class com.ss.lark.android.passport.biz.feature.login.onekey_login.OneKeyAuthUtil.C64875i.C648761 */
            }.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "object : TypeToken<T>() {}.type");
            return type;
        }

        public C64875i(String str) {
            this.f163537b = str;
            this.f163538c = str;
        }
    }

    private OneKeyAuthUtil() {
    }

    /* renamed from: a */
    public final void mo223822a(AbstractC49352d<OperatorAuthTokenInfo> dVar, UniContext uniContext) {
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        if (!f163515c) {
            f163518f.mo171471d("n_action_get_auth_token", "getAuthToken return for enableOnekeyLogin is false");
            return;
        }
        mo223825b();
        C64866b bVar = new C64866b(uniContext, dVar);
        C40654u uVar = C40654u.f103191n;
        Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…K_GET_TOKEN_REQUEST_START");
        WatcherHelper.m193666a(uniContext, uVar, null, 4, null);
        AbstractC49396j a = mo223817a();
        if (a != null) {
            a.getAuthToken(bVar);
        }
    }

    /* renamed from: a */
    public final void mo223824a(AbstractC49352d<OperatorAuthTokenInfo> dVar, boolean z, UniContext uniContext, int i, boolean z2) {
        if (!f163515c) {
            f163518f.mo171471d("n_action_get_security_phone", "getSecurityPhone return for enableOnekeyLogin is false");
            return;
        }
        String string = C57744a.m224104a().getString("one_key_login_security_phone");
        String string2 = C57744a.m224104a().getString("one_key_login_net_type");
        PassportLog passportLog = f163518f;
        passportLog.mo171465b("n_action_get_security_phone", "getSecurityPhone useCache=" + z);
        boolean z3 = false;
        if (z) {
            if (string != null) {
                if ((string.length() > 0 ? string : null) != null) {
                    if (dVar != null) {
                        Intrinsics.checkExpressionValueIsNotNull(string2, "netTypeSp");
                        dVar.mo145179a(new OperatorAuthTokenInfo(string, null, string2, 2, null));
                    }
                    passportLog.mo171465b("n_action_get_security_phone", "getSecurityPhone useCache success");
                    z3 = true;
                }
            }
            passportLog.mo171465b("n_action_get_security_phone", "getSecurityPhone useCache but securityPhone is empty");
            if (dVar != null) {
                dVar.mo145178a(new NetworkErrorResult(-1, "getSecurityPhone useCache but securityPhone is empty"));
            }
        }
        if (!z3) {
            mo223825b();
            C64869d dVar2 = new C64869d(uniContext, dVar);
            C40654u uVar = C40654u.f103187j;
            Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…K_GET_PHONE_REQUEST_START");
            WatcherHelper.m193666a(uniContext, uVar, null, 4, null);
            AbstractC49396j a = mo223817a();
            if (a != null) {
                a.getPhoneInfo(dVar2);
            }
            if (z2) {
                JSONObject jSONObject = new JSONObject();
                String string3 = C57744a.m224104a().getString("one_key_login_net_type");
                jSONObject.put("login_type", i == 1 ? "register" : "login");
                jSONObject.put("carrier", string3);
                Statistics.sendEvent("one_click_auth_start", jSONObject);
            }
        }
    }

    /* renamed from: a */
    public final void mo223821a(OneKeyAuthConfigData oneKeyAuthConfigData) {
        Intrinsics.checkParameterIsNotNull(oneKeyAuthConfigData, "config");
        UniContext uniContext = UniContext.CONTEXT_GLOBAL;
        PassportLog passportLog = f163518f;
        passportLog.mo171465b("OneKeyAuthUtil", "update onekeylogin config beg enableOnekeyLogin=" + oneKeyAuthConfigData.enableOnekeyLogin + ", enableOnekeySecurityScan=" + oneKeyAuthConfigData.enableOnekeySecurityScan + ", enableUpdateOnekeySetting=" + oneKeyAuthConfigData.enableUpdateOnekeySetting);
        if (oneKeyAuthConfigData.enableOnekeyLogin ^ f163515c) {
            f163515c = oneKeyAuthConfigData.enableOnekeyLogin;
            passportLog.mo171465b("OneKeyAuthUtil", "updateOneKeyLoginConfig save new enableOnekeyLogin= " + f163515c);
            Application application = LarkContext.getApplication();
            Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
            m254760a(application, f163515c);
        }
        if (oneKeyAuthConfigData.enableOnekeySecurityScan ^ f163516d) {
            f163516d = oneKeyAuthConfigData.enableOnekeySecurityScan;
            passportLog.mo171465b("OneKeyAuthUtil", "enableOnekeySecurityScan save new enableOnekeyScan= " + f163516d);
            m254763a(f163516d);
        }
        if (!oneKeyAuthConfigData.enableOnekeyLogin) {
            passportLog.mo171471d("OneKeyAuthUtil", "updateOneKeyLoginConfig return for enableOnekeyLogin is false");
        } else if (!oneKeyAuthConfigData.enableUpdateOnekeySetting) {
            passportLog.mo171471d("OneKeyAuthUtil", "updateOneKeyLoginConfig return for config.enableUpdateOnekeySetting is false");
        } else if (mo223817a() == null) {
            passportLog.mo171471d("OneKeyAuthUtil", "updateOneKeyLoginConfig fail for oneKeyLoginService is null");
        } else {
            JSONObject jSONObject = new JSONObject(C57878s.m224591a(oneKeyAuthConfigData));
            AbstractC49396j a = mo223817a();
            if (a != null) {
                a.updateSettings(LarkContext.getApplication(), jSONObject);
            }
            passportLog.mo171465b("OneKeyAuthUtil", "update onekeylogin config succ end");
            mo223824a(null, false, uniContext, 2, false);
        }
    }

    /* renamed from: a */
    public final void mo223819a(Activity activity, int i, boolean z, UniContext uniContext) {
        Intrinsics.checkParameterIsNotNull(activity, "context");
        Intent intent = new Intent(activity, OneKeyAuthActivity.class);
        intent.putExtra("auth_type_tag", i);
        intent.putExtra("from_guide_tag", z);
        if (uniContext != null) {
            intent.putExtra("key_of_uni_context", uniContext);
        }
        activity.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo223820a(Context context, SecurityScanCallback aVar, long j) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        Handler newThreadHandler = CoreThreadPool.newThreadHandler("onekey_scan");
        Handler handler = new Handler(Looper.getMainLooper());
        RunnableC64873g gVar = new RunnableC64873g(booleanRef, aVar, newThreadHandler);
        handler.postDelayed(gVar, j);
        newThreadHandler.post(new RunnableC64871f(context, handler, gVar, booleanRef, aVar, newThreadHandler));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IOneKeyLoginService;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b$h */
    static final class C64874h extends Lambda implements Function0<AbstractC49396j> {
        public static final C64874h INSTANCE = new C64874h();

        C64874h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC49396j invoke() {
            return (AbstractC49396j) OneKeyAuthUtil.f163513a.mo223818a(AbstractC49396j.class);
        }
    }

    /* renamed from: c */
    public final boolean mo223826c() {
        Application application = LarkContext.getApplication();
        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
        return m254764a(application);
    }

    /* renamed from: d */
    public final void mo223827d() {
        C57744a.m224104a().putString("one_key_login_net_type", "");
        C57744a.m224104a().putString("one_key_login_security_phone", "");
    }

    static {
        OneKeyAuthUtil bVar = new OneKeyAuthUtil();
        f163513a = bVar;
        f163515c = bVar.mo223826c();
        f163516d = bVar.mo223828e();
    }

    /* renamed from: e */
    public final boolean mo223828e() {
        DataStorageDelegate a = C49067a.m193335a(IsolateStorage.f123105c);
        Key.Companion aVar = Key.f123153a;
        return ((Boolean) a.mo171260d(new C64867c("one_key_security_scan_enable"), Boolean.valueOf(OneKeyAuthConfigData.DEFAULT_ONEKEY_SECURITY_SCAN))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b$f */
    public static final class RunnableC64871f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f163526a;

        /* renamed from: b */
        final /* synthetic */ Handler f163527b;

        /* renamed from: c */
        final /* synthetic */ Runnable f163528c;

        /* renamed from: d */
        final /* synthetic */ Ref.BooleanRef f163529d;

        /* renamed from: e */
        final /* synthetic */ SecurityScanCallback f163530e;

        /* renamed from: f */
        final /* synthetic */ Handler f163531f;

        RunnableC64871f(Context context, Handler handler, Runnable runnable, Ref.BooleanRef booleanRef, SecurityScanCallback aVar, Handler handler2) {
            this.f163526a = context;
            this.f163527b = handler;
            this.f163528c = runnable;
            this.f163529d = booleanRef;
            this.f163530e = aVar;
            this.f163531f = handler2;
        }

        public final void run() {
            final SecurityScanResult securityScanResult;
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC49396j a = OneKeyAuthUtil.f163513a.mo223817a();
            if (a != null) {
                securityScanResult = a.mobileSecurityScan(this.f163526a);
            } else {
                securityScanResult = null;
            }
            OneKeyAuthUtil bVar = OneKeyAuthUtil.f163513a;
            PassportLog passportLog = OneKeyAuthUtil.f163518f;
            passportLog.mo171465b("n_action_onekey_security_scan", "end,cost=" + (System.currentTimeMillis() - currentTimeMillis) + "ms, scanRes=" + C57878s.m224591a(securityScanResult));
            this.f163527b.removeCallbacks(this.f163528c);
            this.f163527b.post(new Runnable(this) {
                /* class com.ss.lark.android.passport.biz.feature.login.onekey_login.OneKeyAuthUtil.RunnableC64871f.RunnableC648721 */

                /* renamed from: a */
                final /* synthetic */ RunnableC64871f f163532a;

                {
                    this.f163532a = r1;
                }

                public final void run() {
                    OneKeyAuthUtil bVar = OneKeyAuthUtil.f163513a;
                    PassportLog passportLog = OneKeyAuthUtil.f163518f;
                    StringBuilder sb = new StringBuilder();
                    sb.append("scan succ,needCallback = ");
                    sb.append(this.f163532a.f163529d.element);
                    sb.append(", thread= ");
                    Thread currentThread = Thread.currentThread();
                    Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
                    sb.append(currentThread.getName());
                    passportLog.mo171465b("n_action_onekey_security_scan", sb.toString());
                    if (this.f163532a.f163529d.element) {
                        SecurityScanCallback aVar = this.f163532a.f163530e;
                        if (aVar != null) {
                            aVar.mo223803a(securityScanResult);
                        }
                        this.f163532a.f163529d.element = false;
                    }
                    Handler handler = this.f163532a.f163531f;
                    Intrinsics.checkExpressionValueIsNotNull(handler, "scanHandler");
                    handler.getLooper().quitSafely();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b$g */
    public static final class RunnableC64873g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Ref.BooleanRef f163534a;

        /* renamed from: b */
        final /* synthetic */ SecurityScanCallback f163535b;

        /* renamed from: c */
        final /* synthetic */ Handler f163536c;

        RunnableC64873g(Ref.BooleanRef booleanRef, SecurityScanCallback aVar, Handler handler) {
            this.f163534a = booleanRef;
            this.f163535b = aVar;
            this.f163536c = handler;
        }

        public final void run() {
            OneKeyAuthUtil bVar = OneKeyAuthUtil.f163513a;
            PassportLog passportLog = OneKeyAuthUtil.f163518f;
            StringBuilder sb = new StringBuilder();
            sb.append("scan timeout,needCallback = ");
            sb.append(this.f163534a.element);
            sb.append(", thread= ");
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkExpressionValueIsNotNull(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            passportLog.mo171465b("n_action_onekey_security_scan", sb.toString());
            if (this.f163534a.element) {
                SecurityScanCallback aVar = this.f163535b;
                if (aVar != null) {
                    aVar.mo223803a(null);
                }
                this.f163534a.element = false;
            }
            Handler handler = this.f163536c;
            Intrinsics.checkExpressionValueIsNotNull(handler, "scanHandler");
            handler.getLooper().quitSafely();
        }
    }

    /* renamed from: b */
    public final void mo223825b() {
        if (!f163515c) {
            f163518f.mo171471d("OneKeyAuthUtil", "initOneKeyLogin return for enableOnekeyLogin is false");
            return;
        }
        PassportLog passportLog = f163518f;
        passportLog.mo171465b("OneKeyAuthUtil", "initOneKeyLogin onekeyLoginServiceInitialized=" + f163514b);
        if (!f163514b) {
            Map<Integer, C49368c> mapOf = MapsKt.mapOf(TuplesKt.to(1, mo223816a(1)), TuplesKt.to(2, mo223816a(2)), TuplesKt.to(3, mo223816a(3)));
            try {
                AbstractC49396j a = mo223817a();
                if (a != null) {
                    a.initOneKeyLogin(LarkContext.getApplication(), mapOf, C64870e.f163525a);
                }
                f163514b = true;
                passportLog.mo171465b("OneKeyAuthUtil", "initOneKeyLogin init end");
            } catch (Exception e) {
                f163518f.mo171462a("OneKeyAuthUtil", "initOneKeyLogin init exception", e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/login/onekey_login/OneKeyAuthUtil$getAuthToken$wrapperCb$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Landroid/os/Bundle;", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", "bundle", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b$b */
    public static final class C64866b implements AbstractC49352d<Bundle> {

        /* renamed from: a */
        final /* synthetic */ UniContext f163519a;

        /* renamed from: b */
        final /* synthetic */ AbstractC49352d f163520b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            this.f163520b.mo145178a(networkErrorResult);
            OneKeyAuthUtil bVar = OneKeyAuthUtil.f163513a;
            OneKeyAuthUtil.f163518f.mo171471d("n_action_get_auth_token", PassportLog.f123351c.mo171478a("onError", networkErrorResult));
        }

        /* renamed from: a */
        public void mo145179a(Bundle bundle) {
            String str;
            String str2;
            String str3;
            boolean z;
            String str4;
            if (bundle != null) {
                UniContext uniContext = this.f163519a;
                C40654u uVar = C40654u.f103192o;
                Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…DK_GET_TOKEN_REQUEST_SUCC");
                WatcherHelper.m193666a(uniContext, uVar, null, 4, null);
                AbstractC49396j a = OneKeyAuthUtil.f163513a.mo223817a();
                if (a == null || (str = a.getAccessTokenConst()) == null) {
                    str = "access_token";
                }
                String string = bundle.getString(str);
                if (string == null) {
                    string = "";
                }
                Intrinsics.checkExpressionValueIsNotNull(string, "bundle.getString(oneKeyL… ?: \"access_token\") ?: \"\"");
                AbstractC49396j a2 = OneKeyAuthUtil.f163513a.mo223817a();
                if (a2 == null || (str2 = a2.getNetTypeConst()) == null) {
                    str2 = HiAnalyticsConstant.BI_KEY_NET_TYPE;
                }
                String string2 = bundle.getString(str2);
                if (string2 != null) {
                    str3 = string2;
                } else {
                    str3 = "";
                }
                Intrinsics.checkExpressionValueIsNotNull(str3, "bundle.getString(oneKeyL…onst ?: \"net_type\") ?: \"\"");
                OneKeyAuthUtil bVar = OneKeyAuthUtil.f163513a;
                OneKeyAuthUtil.f163518f.mo171465b("n_action_get_auth_token", "onekeyauth get token success token :" + string + "  netType:" + str3);
                if (string.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str4 = string;
                } else {
                    str4 = null;
                }
                if (str4 != null) {
                    this.f163520b.mo145179a(new OperatorAuthTokenInfo(null, str4, str3, 1, null));
                } else {
                    this.f163520b.mo145178a(new NetworkErrorResult(-1, "GetAuthTokenProxy success but accessToken is null"));
                }
            } else {
                this.f163520b.mo145178a(new NetworkErrorResult(-1, "GetAuthTokenProxy success but args is null"));
            }
        }

        C64866b(UniContext uniContext, AbstractC49352d dVar) {
            this.f163519a = uniContext;
            this.f163520b = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/login/onekey_login/OneKeyAuthUtil$getSecurityPhone$wrapperCb$1", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Landroid/os/Bundle;", "onError", "", "errorResult", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "onSuccess", "bundle", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.onekey_login.b$d */
    public static final class C64869d implements AbstractC49352d<Bundle> {

        /* renamed from: a */
        final /* synthetic */ UniContext f163523a;

        /* renamed from: b */
        final /* synthetic */ AbstractC49352d f163524b;

        @Override // com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d
        /* renamed from: a */
        public void mo145178a(NetworkErrorResult networkErrorResult) {
            AbstractC49352d dVar = this.f163524b;
            if (dVar != null) {
                dVar.mo145178a(networkErrorResult);
            }
            OneKeyAuthUtil bVar = OneKeyAuthUtil.f163513a;
            OneKeyAuthUtil.f163518f.mo171471d("n_action_get_security_phone", PassportLog.f123351c.mo171478a("onError", networkErrorResult));
        }

        /* renamed from: a */
        public void mo145179a(Bundle bundle) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (bundle != null) {
                UniContext uniContext = this.f163523a;
                C40654u uVar = C40654u.f103188k;
                Intrinsics.checkExpressionValueIsNotNull(uVar, "EPMClientPassportMonitor…DK_GET_PHONE_REQUEST_SUCC");
                WatcherHelper.m193666a(uniContext, uVar, null, 4, null);
                AbstractC49396j a = OneKeyAuthUtil.f163513a.mo223817a();
                if (a == null || (str = a.getSecurityPhoneConst()) == null) {
                    str = "security_phone";
                }
                String string = bundle.getString(str);
                if (string != null) {
                    str2 = string;
                } else {
                    str2 = "";
                }
                Intrinsics.checkExpressionValueIsNotNull(str2, "it.getString(oneKeyLogin…: \"security_phone\") ?: \"\"");
                AbstractC49396j a2 = OneKeyAuthUtil.f163513a.mo223817a();
                if (a2 == null || (str3 = a2.getNetTypeConst()) == null) {
                    str3 = HiAnalyticsConstant.BI_KEY_NET_TYPE;
                }
                String string2 = bundle.getString(str3);
                if (string2 != null) {
                    str4 = string2;
                } else {
                    str4 = "";
                }
                Intrinsics.checkExpressionValueIsNotNull(str4, "it.getString(oneKeyLogin…onst ?: \"net_type\") ?: \"\"");
                OneKeyAuthUtil bVar = OneKeyAuthUtil.f163513a;
                PassportLog passportLog = OneKeyAuthUtil.f163518f;
                passportLog.mo171465b("n_action_get_security_phone", "getPhoneInfo onSucc, newNetType=" + str4);
                if (!StringsKt.isBlank(str2)) {
                    C57744a.m224104a().putString("one_key_login_security_phone", str2);
                    C57744a a3 = C57744a.m224104a();
                    if (TextUtils.isEmpty(str4)) {
                        str5 = "mobile";
                    } else {
                        str5 = str4;
                    }
                    a3.putString("one_key_login_net_type", str5);
                    AbstractC49352d dVar = this.f163524b;
                    if (dVar != null) {
                        dVar.mo145179a(new OperatorAuthTokenInfo(str2, null, str4, 2, null));
                        return;
                    }
                    return;
                }
                OneKeyAuthUtil.f163513a.mo223827d();
                AbstractC49352d dVar2 = this.f163524b;
                if (dVar2 != null) {
                    dVar2.mo145178a(new NetworkErrorResult(-1, "GetSecurityPhoneProxy onSuccess but newSecurityPhone is null"));
                }
            }
        }

        C64869d(UniContext uniContext, AbstractC49352d dVar) {
            this.f163523a = uniContext;
            this.f163524b = dVar;
        }
    }

    /* renamed from: a */
    private final void m254763a(boolean z) {
        DataStorageDelegate a = C49067a.m193335a(IsolateStorage.f123105c);
        Key.Companion aVar = Key.f123153a;
        a.mo171253b(new C64875i("one_key_security_scan_enable"), Boolean.valueOf(z));
    }

    /* renamed from: a */
    private final boolean m254764a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("sp_one_key_login", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean("one_key_login_enable", true);
        }
        return true;
    }

    /* renamed from: a */
    public final C49368c mo223816a(int i) {
        return C49121a.m193727a().mo171507b(i);
    }

    /* renamed from: a */
    public final <T> T mo223818a(Class<T> cls) {
        T t = (T) ClaymoreServiceLoader.loadFirstOrNull(cls);
        if (t == null) {
            PassportLog passportLog = f163518f;
            passportLog.mo171471d("OneKeyAuthUtil", "service not found: " + cls.getName());
        }
        return t;
    }

    /* renamed from: a */
    private final void m254760a(Context context, boolean z) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = context.getSharedPreferences("sp_one_key_login", 0);
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            edit.putBoolean("one_key_login_enable", z);
            edit.apply();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m254761a(OneKeyAuthUtil bVar, Context context, SecurityScanCallback aVar, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 1000;
        }
        bVar.mo223820a(context, aVar, j);
    }

    /* renamed from: a */
    public static /* synthetic */ void m254762a(OneKeyAuthUtil bVar, AbstractC49352d dVar, boolean z, UniContext uniContext, int i, boolean z2, int i2, Object obj) {
        boolean z3;
        if ((i2 & 2) != 0) {
            z3 = false;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            z2 = !z3;
        }
        bVar.mo223824a(dVar, z3, uniContext, i, z2);
    }
}

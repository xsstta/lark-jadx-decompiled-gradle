package com.larksuite.component.openplatform.core.plugin.passport;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.launchaction.BasePreloadManager;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3456d.C68279a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001d\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0014J \u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\rH\u0014J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LoginLoadManager;", "Lcom/tt/miniapp/launchaction/BasePreloadManager;", "Lcom/larksuite/component/openplatform/core/plugin/passport/LoginLoadManager$InputParams;", "Lcom/larksuite/component/openplatform/core/plugin/passport/LoginLoadManager$LoginResult;", "()V", "PATH_LOGIN", "", "TAG", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "expiredTime", "", "hasRequested", "", "isPreLoginPending", "loginResult", "doLoad", "Lio/reactivex/Observable;", "p", "getDataFromCache", "isDataResultOk", "params", "r", "fromCache", "preLogin", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "saveData", "InputParams", "LoginResult", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.h */
public final class LoginLoadManager extends BasePreloadManager<InputParams, LoginResult> {

    /* renamed from: a */
    public static final LoginLoadManager f62037a = new LoginLoadManager();

    /* renamed from: b */
    private static LoginResult f62038b;

    /* renamed from: c */
    private static long f62039c = -1;

    /* renamed from: d */
    private static final CountDownLatch f62040d = new CountDownLatch(1);

    /* renamed from: e */
    private static volatile boolean f62041e;

    /* renamed from: f */
    private static volatile boolean f62042f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LoginLoadManager$InputParams;", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "isFromPreLogin", "", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;Z)V", "getAppContext", "()Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "()Z", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.h$a */
    public static final class InputParams {

        /* renamed from: a */
        private final IAppContext f62043a;

        /* renamed from: b */
        private final boolean f62044b;

        /* renamed from: a */
        public final IAppContext mo88599a() {
            return this.f62043a;
        }

        /* renamed from: b */
        public final boolean mo88600b() {
            return this.f62044b;
        }

        public InputParams(IAppContext iAppContext, boolean z) {
            Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
            this.f62043a = iAppContext;
            this.f62044b = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ InputParams(IAppContext iAppContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(iAppContext, (i & 2) != 0 ? false : z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0019\u001a\u00020\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LoginLoadManager$LoginResult;", "", "originObject", "Lorg/json/JSONObject;", "session", "", "dataObject", "(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V", "getDataObject", "()Lorg/json/JSONObject;", "fromPreLogin", "", "getFromPreLogin", "()Z", "setFromPreLogin", "(Z)V", "getOriginObject", "saveTime", "", "getSaveTime", "()J", "setSaveTime", "(J)V", "getSession", "()Ljava/lang/String;", "isOk", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.h$b */
    public static final class LoginResult {

        /* renamed from: a */
        private long f62045a = -1;

        /* renamed from: b */
        private boolean f62046b;

        /* renamed from: c */
        private final JSONObject f62047c;

        /* renamed from: d */
        private final String f62048d;

        /* renamed from: e */
        private final JSONObject f62049e;

        /* renamed from: a */
        public final long mo88601a() {
            return this.f62045a;
        }

        /* renamed from: b */
        public final boolean mo88604b() {
            return this.f62046b;
        }

        /* renamed from: d */
        public final JSONObject mo88606d() {
            return this.f62047c;
        }

        /* renamed from: e */
        public final String mo88607e() {
            return this.f62048d;
        }

        /* renamed from: f */
        public final JSONObject mo88608f() {
            return this.f62049e;
        }

        /* renamed from: c */
        public final boolean mo88605c() {
            if (this.f62047c == null || this.f62048d == null || this.f62049e == null) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final void mo88602a(long j) {
            this.f62045a = j;
        }

        /* renamed from: a */
        public final void mo88603a(boolean z) {
            this.f62046b = z;
        }

        public LoginResult(JSONObject jSONObject, String str, JSONObject jSONObject2) {
            this.f62047c = jSONObject;
            this.f62048d = str;
            this.f62049e = jSONObject2;
        }
    }

    private LoginLoadManager() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LoginResult mo88591a(InputParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "p");
        return f62038b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/larksuite/component/openplatform/core/plugin/passport/LoginLoadManager$LoginResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.h$d */
    static final class C25462d<T> implements Consumer<LoginResult> {

        /* renamed from: a */
        public static final C25462d f62051a = new C25462d();

        C25462d() {
        }

        /* renamed from: a */
        public final void accept(LoginResult bVar) {
            LoginLoadManager hVar = LoginLoadManager.f62037a;
            LoginLoadManager.f62042f = false;
            LoginLoadManager hVar2 = LoginLoadManager.f62037a;
            LoginLoadManager.f62040d.countDown();
            AppBrandLogger.m52830i("LoginLoadManager", "preLogin success");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.h$e */
    static final class C25463e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C25463e f62052a = new C25463e();

        C25463e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            LoginLoadManager hVar = LoginLoadManager.f62037a;
            LoginLoadManager.f62042f = false;
            LoginLoadManager hVar2 = LoginLoadManager.f62037a;
            LoginLoadManager.f62040d.countDown();
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            AppBrandLogger.m52829e("LoginLoadManager", th.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Lcom/larksuite/component/openplatform/core/plugin/passport/LoginLoadManager$LoginResult;", "res", "", "apply", "com/larksuite/component/openplatform/core/plugin/passport/LoginLoadManager$doLoad$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.h$c */
    public static final class C25461c<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ InputParams f62050a;

        C25461c(InputParams aVar) {
            this.f62050a = aVar;
        }

        /* renamed from: a */
        public final LoginResult apply(String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, "res");
            boolean z2 = true;
            if (!this.f62050a.mo88600b()) {
                LoginLoadManager hVar = LoginLoadManager.f62037a;
                LoginLoadManager.f62041e = true;
            }
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new LoginResult(null, null, null);
            }
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("session");
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Intrinsics.checkExpressionValueIsNotNull(optString, "session");
            if (optString.length() <= 0) {
                z2 = false;
            }
            if (!z2 || optJSONObject == null) {
                return new LoginResult(null, null, null);
            }
            return new LoginResult(jSONObject, optString, optJSONObject);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Observable<LoginResult> mo88598b(InputParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "p");
        if (aVar.mo88600b()) {
            f62042f = true;
        } else if (f62042f && !f62041e) {
            AppBrandLogger.m52830i("LoginLoadManager", "wait pre login");
            try {
                f62040d.await(1, TimeUnit.SECONDS);
            } catch (Exception e) {
                AppBrandLogger.m52829e("LoginLoadManager", "wait", e.getLocalizedMessage());
            }
            LoginResult bVar = f62038b;
            if (bVar != null) {
                AppBrandLogger.m52830i("LoginLoadManager", "wait pre login end return result");
                Observable<LoginResult> just = Observable.just(bVar);
                Intrinsics.checkExpressionValueIsNotNull(just, "Observable.just(this)");
                return just;
            }
        }
        AppBrandLogger.m52830i("LoginLoadManager", "no need wait pre login");
        IAppContext a = aVar.mo88599a();
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, a.getAppId());
        IBaseService findServiceByInterface = a.findServiceByInterface(AbstractC67724a.class);
        Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…IHostService::class.java)");
        hashMap.put("sessionid", ((AbstractC67724a) findServiceByInterface).mo50459d());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", String.valueOf(true));
        int b = C67857a.m263993b(a);
        if (!C67857a.m263992a(a) && b == 1) {
            hashMap2.put("domain_alias", "open");
        }
        AbstractC67724a aVar2 = (AbstractC67724a) a.findServiceByInterface(AbstractC67724a.class);
        Observable<R> map = aVar2.mo50437a(C67857a.m263994c(a) + "/v2/login", (Map<String, String>) hashMap2, new JSONObject(hashMap), a, false).map(new C25461c(aVar));
        Intrinsics.checkExpressionValueIsNotNull(map, "appContext.findServiceBy…          }\n            }");
        return map;
    }

    /* renamed from: a */
    public final void mo88592a(IAppContext iAppContext, long j) {
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
        f62039c = j;
        mo231709c(new InputParams(iAppContext, true)).subscribeOn(C68279a.m265023b()).subscribe(C25462d.f62051a, C25463e.f62052a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo88594a(InputParams aVar, LoginResult bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "p");
        Intrinsics.checkParameterIsNotNull(bVar, "r");
        if (aVar.mo88600b()) {
            bVar.mo88602a(System.currentTimeMillis());
            bVar.mo88603a(true);
            f62038b = bVar;
            return;
        }
        f62038b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo88596a(InputParams aVar, LoginResult bVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        Intrinsics.checkParameterIsNotNull(bVar, "r");
        boolean z2 = false;
        if (!bVar.mo88605c()) {
            return false;
        }
        if (aVar.mo88600b()) {
            return !z;
        }
        if (!z) {
            return true;
        }
        if (!(f62039c == -1 || bVar.mo88601a() == -1)) {
            if (System.currentTimeMillis() - bVar.mo88601a() < f62039c) {
                z2 = true;
            }
            bVar.mo88602a(-1);
        }
        return z2;
    }
}

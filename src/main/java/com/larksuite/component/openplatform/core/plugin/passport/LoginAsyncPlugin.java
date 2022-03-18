package com.larksuite.component.openplatform.core.plugin.passport;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.passport.LoginLoadManager;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.larksuite.framework.apiplugin.p1176b.C25913h;
import com.tt.miniapphost.C67475d;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\b\u0016¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0014J'\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0014R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LoginAsyncPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "invokeDuration", "", "Ljava/lang/Long;", "isJsCoreReady", "", "()Ljava/lang/Boolean;", "setJsCoreReady", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "callbackOk", "", "responseData", "Lorg/json/JSONObject;", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "login", "startTime", "(JLjava/lang/Boolean;Lcom/larksuite/framework/apiplugin/LKEvent;)V", "newLogin", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LoginAsyncPlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);
    public Long invokeDuration;
    private Boolean isJsCoreReady;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LoginAsyncPlugin$Companion;", "", "()V", "PATH_LOGIN", "", "TAG", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.LoginAsyncPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Boolean isJsCoreReady() {
        return this.isJsCoreReady;
    }

    public final void setJsCoreReady(Boolean bool) {
        this.isJsCoreReady = bool;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.LoginAsyncPlugin$c */
    public static final class C25446c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ LoginAsyncPlugin f62010a;

        /* renamed from: b */
        final /* synthetic */ LKEvent f62011b;

        /* renamed from: c */
        final /* synthetic */ long f62012c;

        /* renamed from: d */
        final /* synthetic */ Boolean f62013d;

        C25446c(LoginAsyncPlugin loginAsyncPlugin, LKEvent lKEvent, long j, Boolean bool) {
            this.f62010a = loginAsyncPlugin;
            this.f62011b = lKEvent;
            this.f62012c = j;
            this.f62013d = bool;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            String localizedMessage = th.getLocalizedMessage();
            Companion aVar = LoginAsyncPlugin.Companion;
            AppBrandLogger.m52829e("LoginAsyncPlugin", "login fail:" + localizedMessage);
            C25921b createFailedResponse = this.f62010a.createFailedResponse(C25913h.f64179i);
            createFailedResponse.mInnerMsg = localizedMessage;
            this.f62011b.mo92132b(createFailedResponse);
            C67475d.m262457a("fail", System.currentTimeMillis() - this.f62012c, this.f62010a.invokeDuration, this.f62013d, localizedMessage, (Boolean) null, this.f62010a.getAppContext());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.LoginAsyncPlugin$e */
    public static final class C25448e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ LoginAsyncPlugin f62018a;

        /* renamed from: b */
        final /* synthetic */ LKEvent f62019b;

        /* renamed from: c */
        final /* synthetic */ long f62020c;

        /* renamed from: d */
        final /* synthetic */ Boolean f62021d;

        C25448e(LoginAsyncPlugin loginAsyncPlugin, LKEvent lKEvent, long j, Boolean bool) {
            this.f62018a = loginAsyncPlugin;
            this.f62019b = lKEvent;
            this.f62020c = j;
            this.f62021d = bool;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            String localizedMessage = th.getLocalizedMessage();
            Companion aVar = LoginAsyncPlugin.Companion;
            AppBrandLogger.m52829e("LoginAsyncPlugin", "login fail:" + localizedMessage);
            C25921b createFailedResponse = this.f62018a.createFailedResponse(C25913h.f64179i);
            createFailedResponse.mInnerMsg = localizedMessage;
            this.f62019b.mo92132b(createFailedResponse);
            C67475d.m262457a("fail", System.currentTimeMillis() - this.f62020c, this.f62018a.invokeDuration, this.f62021d, localizedMessage, (Boolean) null, this.f62018a.getAppContext());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.LoginAsyncPlugin$b */
    public static final class C25445b<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ LoginAsyncPlugin f62006a;

        /* renamed from: b */
        final /* synthetic */ LKEvent f62007b;

        /* renamed from: c */
        final /* synthetic */ long f62008c;

        /* renamed from: d */
        final /* synthetic */ Boolean f62009d;

        C25445b(LoginAsyncPlugin loginAsyncPlugin, LKEvent lKEvent, long j, Boolean bool) {
            this.f62006a = loginAsyncPlugin;
            this.f62007b = lKEvent;
            this.f62008c = j;
            this.f62009d = bool;
        }

        /* renamed from: a */
        public final void accept(String str) {
            if (TextUtils.isEmpty(str)) {
                Companion aVar = LoginAsyncPlugin.Companion;
                AppBrandLogger.m52829e("LoginAsyncPlugin", "login response is empty");
                this.f62007b.mo92132b(this.f62006a.createFailedResponse(C25906a.f64081k, "response is empty"));
                C67475d.m262457a("fail", System.currentTimeMillis() - this.f62008c, this.f62006a.invokeDuration, this.f62009d, "null_response", (Boolean) null, this.f62006a.getAppContext());
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String optString = jSONObject.optString("session");
            if (!TextUtils.isEmpty(optString)) {
                this.f62006a.getApiDependency().mo235055h(optString);
            }
            Companion aVar2 = LoginAsyncPlugin.Companion;
            AppBrandLogger.m52830i("LoginAsyncPlugin", "login success");
            LoginAsyncPlugin loginAsyncPlugin = this.f62006a;
            Intrinsics.checkExpressionValueIsNotNull(optJSONObject, "dataObject");
            loginAsyncPlugin.callbackOk(optJSONObject, this.f62007b);
            long currentTimeMillis = System.currentTimeMillis() - this.f62008c;
            Long l = this.f62006a.invokeDuration;
            Boolean bool = this.f62009d;
            C67475d.m262457a("success", currentTimeMillis, l, bool, jSONObject.optString("message") + jSONObject.optInt("error"), (Boolean) null, this.f62006a.getAppContext());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "loginResult", "Lcom/larksuite/component/openplatform/core/plugin/passport/LoginLoadManager$LoginResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.LoginAsyncPlugin$d */
    public static final class C25447d<T> implements Consumer<LoginLoadManager.LoginResult> {

        /* renamed from: a */
        final /* synthetic */ LoginAsyncPlugin f62014a;

        /* renamed from: b */
        final /* synthetic */ LKEvent f62015b;

        /* renamed from: c */
        final /* synthetic */ long f62016c;

        /* renamed from: d */
        final /* synthetic */ Boolean f62017d;

        C25447d(LoginAsyncPlugin loginAsyncPlugin, LKEvent lKEvent, long j, Boolean bool) {
            this.f62014a = loginAsyncPlugin;
            this.f62015b = lKEvent;
            this.f62016c = j;
            this.f62017d = bool;
        }

        /* renamed from: a */
        public final void accept(LoginLoadManager.LoginResult bVar) {
            String str;
            if (bVar.mo88605c()) {
                this.f62014a.getApiDependency().mo235055h(bVar.mo88607e());
                JSONObject f = bVar.mo88608f();
                if (f != null) {
                    f.put("from_pre_login", bVar.mo88604b());
                    this.f62014a.callbackOk(f, this.f62015b);
                }
                long currentTimeMillis = System.currentTimeMillis() - this.f62016c;
                Companion aVar = LoginAsyncPlugin.Companion;
                AppBrandLogger.m52830i("LoginAsyncPlugin", "login res fromPreLogin:" + bVar.mo88604b(), " dur:" + currentTimeMillis);
                Long l = this.f62014a.invokeDuration;
                Boolean bool = this.f62017d;
                JSONObject d = bVar.mo88606d();
                Integer num = null;
                if (d != null) {
                    str = d.optString("message");
                } else {
                    str = null;
                }
                JSONObject d2 = bVar.mo88606d();
                if (d2 != null) {
                    num = Integer.valueOf(d2.optInt("error"));
                }
                C67475d.m262457a("success", currentTimeMillis, l, bool, Intrinsics.stringPlus(str, num), Boolean.valueOf(bVar.mo88604b()), this.f62014a.getAppContext());
                return;
            }
            Companion aVar2 = LoginAsyncPlugin.Companion;
            AppBrandLogger.m52829e("LoginAsyncPlugin", "login response is empty");
            this.f62015b.mo92132b(this.f62014a.createFailedResponse(C25906a.f64081k, "response is empty"));
            C67475d.m262457a("fail", System.currentTimeMillis() - this.f62016c, this.f62014a.invokeDuration, this.f62017d, "null_response", (Boolean) null, this.f62014a.getAppContext());
        }
    }

    @LKPluginFunction(async = true, eventName = {"login"})
    public final void login(LKEvent lKEvent) {
        Intrinsics.checkParameterIsNotNull(lKEvent, "lkEvent");
        Object obj = lKEvent.mo92140g().get("inner_invoke_time");
        Object obj2 = lKEvent.mo92140g().get("inner_js_app_completed");
        if (obj2 instanceof Boolean) {
            this.isJsCoreReady = (Boolean) obj2;
            AppBrandLogger.m52830i("LoginAsyncPlugin", "isJsCoreReady:" + this.isJsCoreReady);
        }
        if ((obj instanceof Long) && (!Intrinsics.areEqual(obj, (Object) 0L))) {
            this.invokeDuration = Long.valueOf(System.currentTimeMillis() - ((Number) obj).longValue());
            AppBrandLogger.m52828d("LoginAsyncPlugin", "invokeDuration:" + this.invokeDuration);
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC67709b.AbstractC67710a apiDependency = getApiDependency();
        Intrinsics.checkExpressionValueIsNotNull(apiDependency, "apiDependency");
        if (apiDependency.mo235053g() == null) {
            LoginAsyncPlugin loginAsyncPlugin = this;
            AppBrandLogger.m52829e("LoginAsyncPlugin", "get lark session null");
            C67475d.m262457a("fail", System.currentTimeMillis() - currentTimeMillis, loginAsyncPlugin.invokeDuration, loginAsyncPlugin.isJsCoreReady, "empty_session", (Boolean) null, loginAsyncPlugin.getAppContext());
            C25921b createFailedResponse = loginAsyncPlugin.createFailedResponse(C25913h.f64177g);
            createFailedResponse.mInnerMsg = "get lark session null";
            lKEvent.mo92132b(createFailedResponse);
        } else if (getApiDependency().mo235052f("openplatform.gadget.prelogin")) {
            newLogin(currentTimeMillis, this.isJsCoreReady, lKEvent);
        } else {
            login(currentTimeMillis, this.isJsCoreReady, lKEvent);
        }
    }

    public final void callbackOk(JSONObject jSONObject, LKEvent lKEvent) {
        lKEvent.mo92127a(jSONObject);
    }

    private final void newLogin(long j, Boolean bool, LKEvent lKEvent) {
        AppBrandLogger.m52830i("LoginAsyncPlugin", "preLogin is start");
        LoginLoadManager hVar = LoginLoadManager.f62037a;
        IAppContext appContext = getAppContext();
        Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
        hVar.mo231709c(new LoginLoadManager.InputParams(appContext, false, 2, null)).subscribeOn(C68279a.m265023b()).subscribe(new C25447d(this, lKEvent, j, bool), new C25448e(this, lKEvent, j, bool));
    }

    private final void login(long j, Boolean bool, LKEvent lKEvent) {
        AppBrandLogger.m52830i("LoginAsyncPlugin", "login is start");
        HashMap hashMap = new HashMap();
        IAppContext appContext = getAppContext();
        Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, appContext.getAppId());
        AbstractC67709b.AbstractC67710a apiDependency = getApiDependency();
        Intrinsics.checkExpressionValueIsNotNull(apiDependency, "apiDependency");
        hashMap.put("sessionid", apiDependency.mo235053g());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", String.valueOf(true));
        int b = C67857a.m263993b(getAppContext());
        if (!C67857a.m263992a(getAppContext()) && b == 1) {
            hashMap2.put("domain_alias", "open");
        }
        AppBrandLogger.m52830i("LoginAsyncPlugin", "http request start");
        AbstractC67724a aVar = (AbstractC67724a) getAppContext().findServiceByInterface(AbstractC67724a.class);
        aVar.mo50437a(C67857a.m263994c(getAppContext()) + "/v2/login", (Map<String, String>) hashMap2, new JSONObject(hashMap), getAppContext(), false).subscribe(new C25445b(this, lKEvent, j, bool), new C25446c(this, lKEvent, j, bool));
    }
}

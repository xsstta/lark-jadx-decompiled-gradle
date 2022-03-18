package com.larksuite.component.openplatform.core.plugin.passport;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.C67475d;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@ApiSupportType(apiName = {"login"}, support = {AppType.GadgetAPP}, testSupport = {AppType.WebGadgetAPP})
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0003R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LoginAsyncHandler;", "Lcom/tt/miniapp/business/api/base/AbsAsyncAPIHandler;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Ljava/lang/String;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "invokeDuration", "", "Ljava/lang/Long;", "apiNames", "", "handleAPI", "", "apiInvokeData", "Lcom/tt/refer/abs/api/entity/APIInvokeData;", "login", "startTime", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.g */
public final class LoginAsyncHandler extends AbstractC65797c {

    /* renamed from: b */
    public static final Companion f62031b = new Companion(null);

    /* renamed from: a */
    public Long f62032a;

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LoginAsyncHandler$Companion;", "", "()V", "PATH_LOGIN", "", "TAG", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LoginAsyncHandler() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        List<String> singletonList = Collections.singletonList("login");
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis…onstant.AppApi.API_LOGIN)");
        return singletonList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.g$c */
    public static final class C25460c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ LoginAsyncHandler f62035a;

        /* renamed from: b */
        final /* synthetic */ long f62036b;

        C25460c(LoginAsyncHandler gVar, long j) {
            this.f62035a = gVar;
            this.f62036b = j;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            String localizedMessage = th.getLocalizedMessage();
            Companion aVar = LoginAsyncHandler.f62031b;
            AppBrandLogger.m52829e("LoginAsyncHandler", "login fail:" + localizedMessage);
            this.f62035a.mo230493c(localizedMessage);
            C67475d.m262457a("fail", System.currentTimeMillis() - this.f62036b, this.f62035a.f62032a, this.f62035a.f165822l, localizedMessage, (Boolean) null, this.f62035a.mo230473f());
        }
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "apiInvokeData");
        if (this.f165823m != 0) {
            this.f62032a = Long.valueOf(System.currentTimeMillis() - this.f165823m);
            AppBrandLogger.m52828d("LoginAsyncHandler", "invokeDuration:" + this.f62032a);
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC67709b.AbstractC67710a h = mo230475h();
        Intrinsics.checkExpressionValueIsNotNull(h, "apiDependency");
        if (h.mo235053g() != null) {
            m90989a(currentTimeMillis);
            return;
        }
        LoginAsyncHandler gVar = this;
        AppBrandLogger.m52829e("LoginAsyncHandler", "get lark session null");
        C67475d.m262457a("fail", System.currentTimeMillis() - currentTimeMillis, gVar.f62032a, gVar.f165822l, "empty_session", (Boolean) null, gVar.mo230473f());
        gVar.mo230482a(ApiCode.GENERAL_UNKONW_ERROR, "lark not login");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.g$b */
    public static final class C25459b<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ LoginAsyncHandler f62033a;

        /* renamed from: b */
        final /* synthetic */ long f62034b;

        C25459b(LoginAsyncHandler gVar, long j) {
            this.f62033a = gVar;
            this.f62034b = j;
        }

        /* renamed from: a */
        public final void accept(String str) {
            if (TextUtils.isEmpty(str)) {
                Companion aVar = LoginAsyncHandler.f62031b;
                AppBrandLogger.m52829e("LoginAsyncHandler", "login response is empty");
                this.f62033a.mo230493c("response is empty");
                C67475d.m262457a("fail", System.currentTimeMillis() - this.f62034b, this.f62033a.f62032a, this.f62033a.f165822l, "null_response", (Boolean) null, this.f62033a.mo230473f());
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            String optString = jSONObject.optString("session");
            if (!TextUtils.isEmpty(optString)) {
                this.f62033a.mo230475h().mo235055h(optString);
            }
            this.f62033a.mo230492b(optJSONObject);
            long currentTimeMillis = System.currentTimeMillis() - this.f62034b;
            Long l = this.f62033a.f62032a;
            Boolean bool = this.f62033a.f165822l;
            C67475d.m262457a("success", currentTimeMillis, l, bool, jSONObject.optString("message") + jSONObject.optInt("error"), (Boolean) null, this.f62033a.mo230473f());
        }
    }

    /* renamed from: a */
    private final void m90989a(long j) {
        HashMap hashMap = new HashMap();
        IAppContext f = mo230473f();
        Intrinsics.checkExpressionValueIsNotNull(f, "appContext");
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, f.getAppId());
        AbstractC67709b.AbstractC67710a h = mo230475h();
        Intrinsics.checkExpressionValueIsNotNull(h, "apiDependency");
        hashMap.put("sessionid", h.mo235053g());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", String.valueOf(true));
        int b = C67857a.m263993b(mo230473f());
        if (!C67857a.m263992a(mo230473f()) && b == 1) {
            hashMap2.put("domain_alias", "open");
        }
        AbstractC67724a aVar = (AbstractC67724a) mo230473f().findServiceByInterface(AbstractC67724a.class);
        aVar.mo50437a(C67857a.m263994c(mo230473f()) + "/v2/login", (Map<String, String>) hashMap2, new JSONObject(hashMap), mo230473f(), false).subscribe(new C25459b(this, j), new C25460c(this, j));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginAsyncHandler(String str, IAppContext iAppContext) {
        super(str, iAppContext);
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
    }
}

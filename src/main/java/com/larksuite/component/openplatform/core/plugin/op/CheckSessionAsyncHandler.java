package com.larksuite.component.openplatform.core.plugin.op;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c;
import com.tt.miniapphost.C67475d;
import com.tt.refer.common.annotation.ApiSupportType;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67857a;
import com.tt.refer.common.util.C67864f;
import com.tt.refer.p3400a.p3401a.p3402a.C67701b;
import com.tt.refer.p3400a.p3408f.AbstractC67724a;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@ApiSupportType(apiName = {"checkSession"}, support = {AppType.WebAPP}, testSupport = {AppType.GadgetAPP})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016JP\u0010\n\u001a\u00020\u000b2!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000b0\r2#\b\u0002\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\rH\u0003J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¨\u0006\u001d"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/op/CheckSessionAsyncHandler;", "Lcom/tt/miniapp/business/api/base/AbsAsyncAPIHandler;", "()V", HiAnalyticsConstant.HaKey.BI_KEY_APINAME, "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Ljava/lang/String;Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "apiNames", "", "checkFromNetWork", "", "success", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "fail", "error", "deleteExpireTime", "expireTime", "", "getExpireTime", "handleAPI", "apiInvokeData", "Lcom/tt/refer/abs/api/entity/APIInvokeData;", "saveExpireTime", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.op.ac */
public final class CheckSessionAsyncHandler extends AbstractC65797c {

    /* renamed from: a */
    public static final Companion f61842a = new Companion(null);

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/op/CheckSessionAsyncHandler$Companion;", "", "()V", "CHECK_PATH", "", "ONE_DAY", "", "SESSION_PRE_NAME", "TAG", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.ac$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CheckSessionAsyncHandler() {
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65792a
    /* renamed from: a */
    public List<String> mo87215a() {
        List<String> singletonList = Collections.singletonList("checkSession");
        Intrinsics.checkExpressionValueIsNotNull(singletonList, "Collections.singletonLis….AppApi.API_CHECKSESSION)");
        return singletonList;
    }

    /* renamed from: b */
    public final void mo88464b() {
        AppBrandLogger.m52830i("CheckSessionAsyncHandler", "delete check time");
        SharedPreferences.Editor edit = C67864f.m264018a(mo230473f(), "session_time").edit();
        IAppContext f = mo230473f();
        Intrinsics.checkExpressionValueIsNotNull(f, "appContext");
        edit.remove(f.getAppId()).apply();
    }

    /* renamed from: c */
    private final long m90823c() {
        SharedPreferences a = C67864f.m264018a(mo230473f(), "session_time");
        try {
            IAppContext f = mo230473f();
            Intrinsics.checkExpressionValueIsNotNull(f, "appContext");
            String string = a.getString(f.getAppId(), null);
            if (string == null) {
                return -1;
            }
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException e) {
                AppBrandLogger.m52829e("CheckSessionAsyncHandler", e.getLocalizedMessage());
                return -1;
            }
        } catch (ClassCastException unused) {
            IAppContext f2 = mo230473f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "appContext");
            return a.getLong(f2.getAppId(), -1);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.ac$b */
    public static final class C25332b extends Lambda implements Function1<String, Unit> {
        public static final C25332b INSTANCE = new C25332b();

        C25332b() {
            super(1);
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.ac$e */
    static final class C25335e extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ CheckSessionAsyncHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25335e(CheckSessionAsyncHandler acVar) {
            super(1);
            this.this$0 = acVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke(jSONObject);
            return Unit.INSTANCE;
        }

        public final void invoke(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "response");
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                boolean optBoolean = optJSONObject.optBoolean("valid");
                Companion aVar = CheckSessionAsyncHandler.f61842a;
                AppBrandLogger.m52830i("CheckSessionAsyncHandler", "check valid:" + optBoolean);
                if (optBoolean) {
                    long a = this.this$0.mo88462a(jSONObject);
                    if (a > 0) {
                        this.this$0.mo88463a(a * ((long) 1000));
                        return;
                    }
                    return;
                }
                Companion aVar2 = CheckSessionAsyncHandler.f61842a;
                AppBrandLogger.m52830i("CheckSessionAsyncHandler", "not valid time");
                this.this$0.mo88464b();
                return;
            }
            this.this$0.mo88464b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.ac$f */
    static final class C25336f extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ long $startTime;
        final /* synthetic */ CheckSessionAsyncHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25336f(CheckSessionAsyncHandler acVar, long j) {
            super(1);
            this.this$0 = acVar;
            this.$startTime = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke(jSONObject);
            return Unit.INSTANCE;
        }

        public final void invoke(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "response");
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                boolean optBoolean = optJSONObject.optBoolean("valid");
                Companion aVar = CheckSessionAsyncHandler.f61842a;
                AppBrandLogger.m52830i("CheckSessionAsyncHandler", "check valid:" + optBoolean);
                if (optBoolean) {
                    this.this$0.mo230494j();
                    C67475d.m262461a(false, "success", System.currentTimeMillis() - this.$startTime, 0, "", this.this$0.mo230473f());
                    long a = this.this$0.mo88462a(jSONObject);
                    if (a != -1) {
                        this.this$0.mo88463a(a * ((long) 1000));
                        return;
                    }
                    return;
                }
                this.this$0.mo230481a(ApiCode.CHECKSESSION_INVALID_SESSION);
                this.this$0.mo88464b();
                return;
            }
            CheckSessionAsyncHandler acVar = this.this$0;
            acVar.mo230481a(ApiCode.CHECKSESSION_INVALID_SESSION);
            C67475d.m262461a(false, "fail", System.currentTimeMillis() - this.$startTime, jSONObject.optInt("error", 0), jSONObject.optString("message", ""), acVar.mo230473f());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.ac$g */
    static final class C25337g extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ long $startTime;
        final /* synthetic */ CheckSessionAsyncHandler this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25337g(CheckSessionAsyncHandler acVar, long j) {
            super(1);
            this.this$0 = acVar;
            this.$startTime = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            C67475d.m262461a(false, "fail", System.currentTimeMillis() - this.$startTime, 0, str, this.this$0.mo230473f());
            this.this$0.mo230493c(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.ac$d */
    public static final class C25334d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Function1 f61845a;

        C25334d(Function1 function1) {
            this.f61845a = function1;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Function1 function1 = this.f61845a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            String localizedMessage = th.getLocalizedMessage();
            Intrinsics.checkExpressionValueIsNotNull(localizedMessage, "it.localizedMessage");
            function1.invoke(localizedMessage);
        }
    }

    /* renamed from: a */
    public final long mo88462a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (optJSONObject != null) {
            return optJSONObject.getLong("expire_time");
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.ac$c */
    public static final class C25333c<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ Function1 f61843a;

        /* renamed from: b */
        final /* synthetic */ Function1 f61844b;

        C25333c(Function1 function1, Function1 function12) {
            this.f61843a = function1;
            this.f61844b = function12;
        }

        /* renamed from: a */
        public final void accept(String str) {
            if (TextUtils.isEmpty(str)) {
                Function1 function1 = this.f61843a;
                String generateDataNullExtraInfo = ApiCallResultHelper.generateDataNullExtraInfo("response");
                Intrinsics.checkExpressionValueIsNotNull(generateDataNullExtraInfo, "ApiCallResultHelper.gene…NullExtraInfo(\"response\")");
                function1.invoke(generateDataNullExtraInfo);
                return;
            }
            this.f61844b.invoke(new JSONObject(str));
        }
    }

    /* renamed from: a */
    public final void mo88463a(long j) {
        SharedPreferences.Editor edit = C67864f.m264018a(mo230473f(), "session_time").edit();
        IAppContext f = mo230473f();
        Intrinsics.checkExpressionValueIsNotNull(f, "appContext");
        edit.putLong(f.getAppId(), j).apply();
    }

    @Override // com.tt.miniapp.p3260b.p3261a.p3262a.AbstractC65797c
    /* renamed from: a */
    public void mo87216a(C67701b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "apiInvokeData");
        long currentTimeMillis = System.currentTimeMillis();
        long c = m90823c();
        IBaseService findServiceByInterface = mo230473f().findServiceByInterface(AbstractC67724a.class);
        Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…IHostService::class.java)");
        long m = ((AbstractC67724a) findServiceByInterface).mo50472m();
        AppBrandLogger.m52830i("CheckSessionAsyncHandler", "startTime: " + currentTimeMillis + ", expireTime: " + c + ", " + "serVerTime: " + m);
        if (c <= 0 || m <= 0 || c - m <= 86400000) {
            AppBrandLogger.m52830i("CheckSessionAsyncHandler", "check expireTime form net");
            m90822a(new C25336f(this, currentTimeMillis), new C25337g(this, currentTimeMillis));
            return;
        }
        mo230494j();
        C67475d.m262461a(true, "success", System.currentTimeMillis() - currentTimeMillis, 0, "", mo230473f());
        m90821a(this, new C25335e(this), null, 2, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckSessionAsyncHandler(String str, IAppContext iAppContext) {
        super(str, iAppContext);
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_APINAME);
        Intrinsics.checkParameterIsNotNull(iAppContext, "appContext");
    }

    /* renamed from: a */
    private final void m90822a(Function1<? super JSONObject, Unit> function1, Function1<? super String, Unit> function12) {
        String str = C67857a.m263995d(mo230473f()) + "/checkSession";
        HashMap hashMap = new HashMap();
        IAppContext f = mo230473f();
        Intrinsics.checkExpressionValueIsNotNull(f, "appContext");
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, f.getAppId());
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", String.valueOf(true));
        int b = C67857a.m263993b(mo230473f());
        if (!C67857a.m263992a(mo230473f()) && b == 1) {
            hashMap2.put("domain_alias", "open");
        }
        ((AbstractC67724a) mo230473f().findServiceByInterface(AbstractC67724a.class)).mo50437a(str, (Map<String, String>) hashMap2, new JSONObject(hashMap), mo230473f(), true).subscribe(new C25333c(function12, function1), new C25334d(function12));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.openplatform.core.plugin.op.ac */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m90821a(CheckSessionAsyncHandler acVar, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = C25332b.INSTANCE;
        }
        acVar.m90822a(function1, function12);
    }
}

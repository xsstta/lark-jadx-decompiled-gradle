package com.larksuite.component.openplatform.core.plugin.op;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.DebugUtils;
import com.bytedance.ee.larkbrand.utils.sharedpreference.Sp;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.option.ext.AbstractC67619e;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Deprecated(message = "use new plugin")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0014JP\u0010\u000f\u001a\u00020\u000e2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u000e0\u00112#\b\u0002\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\u0011H\u0003J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\n\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0017\u0010!\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0004H\u0002R\u0014\u0010\n\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006$"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/op/LarkApiCheckSessionCtrl;", "Lcom/tt/frontendapiinterface/ApiHandler;", "()V", "params", "", "callbackId", "", "apiHandlerCallback", "Lcom/tt/option/ext/ApiHandlerCallback;", "(Ljava/lang/String;ILcom/tt/option/ext/ApiHandlerCallback;)V", "URL", "getURL", "()Ljava/lang/String;", "act", "", "checkFromNetWork", "success", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "Lkotlin/ParameterName;", "name", "response", "fail", "error", "deleteExpireTime", "", "()Ljava/lang/Boolean;", "expireTime", "", "getActionName", "getExpireTime", "getSp", "Lcom/bytedance/ee/larkbrand/utils/sharedpreference/Sp;", "saveExpireTime", "(J)Ljava/lang/Boolean;", "spName", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.op.af */
public final class LarkApiCheckSessionCtrl extends ApiHandler {

    /* renamed from: a */
    private final String f61846a = "/checkSession";

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "checkSession";
    }

    public LarkApiCheckSessionCtrl() {
    }

    /* renamed from: c */
    private final String m90838c() {
        StringBuilder sb = new StringBuilder();
        HostDependManager inst = HostDependManager.getInst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "HostDependManager.getInst()");
        sb.append(inst.getSpPrefixPath());
        sb.append("session_time");
        return sb.toString();
    }

    /* renamed from: b */
    private final long m90837b() {
        Sp d = m90839d();
        if (d == null) {
            return -1;
        }
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(getAppContext());
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandApplicationImpl.getInst(appContext)");
        String str = inst.getAppInfo().appId;
        Intrinsics.checkExpressionValueIsNotNull(str, "AppbrandApplicationImpl.…appContext).appInfo.appId");
        Long l = (Long) d.mo49642a(str, -1L);
        if (l != null) {
            return l.longValue();
        }
        return -1;
    }

    /* renamed from: d */
    private final Sp m90839d() {
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(getAppContext());
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandApplicationImpl.getInst(appContext)");
        if (inst.getAppInfo().appId != null) {
            return Sp.f35236a.mo49645a(m90838c(), true);
        }
        return null;
    }

    /* renamed from: a */
    public final Boolean mo88472a() {
        Sp d = m90839d();
        if (d == null) {
            return null;
        }
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(getAppContext());
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandApplicationImpl.getInst(appContext)");
        String str = inst.getAppInfo().appId;
        Intrinsics.checkExpressionValueIsNotNull(str, "AppbrandApplicationImpl.…appContext).appInfo.appId");
        Sp a = d.mo49641a(str);
        if (a != null) {
            return Boolean.valueOf(Sp.m54286a(a, false, 1, null));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        long currentTimeMillis = System.currentTimeMillis();
        LarkExtensionManager instance = LarkExtensionManager.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
        if (instance.getExtension().getFeatureGating("microapp.login.expiretime")) {
            long b = m90837b();
            LarkExtensionManager instance2 = LarkExtensionManager.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(instance2, "LarkExtensionManager.getInstance()");
            ExtensionWrapper extension = instance2.getExtension();
            Intrinsics.checkExpressionValueIsNotNull(extension, "LarkExtensionManager.getInstance().extension");
            long serverTime = extension.getServerTime();
            if (b <= 0 || serverTime <= 0 || b - serverTime <= ((long) 86400000)) {
                m90836a(new C25341b(this, currentTimeMillis), new C25342c(this, currentTimeMillis));
                return;
            }
            callbackDefaultMsg(true);
            C13377u.m54419a(true, "success", System.currentTimeMillis() - currentTimeMillis, 0, "", getAppContext());
            m90835a(this, new C25340a(this), null, 2, null);
            return;
        }
        m90836a(new C25343d(this, currentTimeMillis), new C25344e(this, currentTimeMillis));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.af$a */
    static final class C25340a extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ LarkApiCheckSessionCtrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25340a(LarkApiCheckSessionCtrl afVar) {
            super(1);
            this.this$0 = afVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke(jSONObject);
            return Unit.INSTANCE;
        }

        public final void invoke(JSONObject jSONObject) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(jSONObject, "response");
            JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optJSONObject != null) {
                if (optJSONObject.optBoolean("valid")) {
                    long a = this.this$0.mo88471a(jSONObject);
                    if (a > 0) {
                        this.this$0.mo88473a(a * ((long) 1000));
                    }
                    obj = Unit.INSTANCE;
                } else {
                    obj = this.this$0.mo88472a();
                }
                if (obj != null) {
                    return;
                }
            }
            this.this$0.mo88472a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.af$b */
    static final class C25341b extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ long $startTime;
        final /* synthetic */ LarkApiCheckSessionCtrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25341b(LarkApiCheckSessionCtrl afVar, long j) {
            super(1);
            this.this$0 = afVar;
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
                optJSONObject.optBoolean("valid");
                this.this$0.callbackDefaultMsg(true);
                C13377u.m54419a(false, "success", System.currentTimeMillis() - this.$startTime, 0, "", this.this$0.getAppContext());
                long a = this.this$0.mo88471a(jSONObject);
                if (a != -1) {
                    this.this$0.mo88473a(a * ((long) 1000));
                    return;
                }
                return;
            }
            LarkApiCheckSessionCtrl afVar = this.this$0;
            afVar.callbackDefaultMsg(false);
            C13377u.m54419a(false, "fail", System.currentTimeMillis() - this.$startTime, jSONObject.optInt("error", 0), jSONObject.optString("message", ""), afVar.getAppContext());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.af$c */
    static final class C25342c extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ long $startTime;
        final /* synthetic */ LarkApiCheckSessionCtrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25342c(LarkApiCheckSessionCtrl afVar, long j) {
            super(1);
            this.this$0 = afVar;
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
            C13377u.m54419a(false, "fail", System.currentTimeMillis() - this.$startTime, 0, str, this.this$0.getAppContext());
            this.this$0.callbackDefaultMsg(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lorg/json/JSONObject;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.af$d */
    static final class C25343d extends Lambda implements Function1<JSONObject, Unit> {
        final /* synthetic */ long $startTime;
        final /* synthetic */ LarkApiCheckSessionCtrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25343d(LarkApiCheckSessionCtrl afVar, long j) {
            super(1);
            this.this$0 = afVar;
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
                optJSONObject.optBoolean("valid");
                this.this$0.callbackDefaultMsg(true);
                C13377u.m54419a(false, "success", System.currentTimeMillis() - this.$startTime, 0, "", this.this$0.getAppContext());
                return;
            }
            LarkApiCheckSessionCtrl afVar = this.this$0;
            C13377u.m54419a(false, "fail", System.currentTimeMillis() - this.$startTime, jSONObject.optInt("error", 0), jSONObject.optString("message", ""), afVar.getAppContext());
            afVar.callbackDefaultMsg(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.af$e */
    static final class C25344e extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ long $startTime;
        final /* synthetic */ LarkApiCheckSessionCtrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25344e(LarkApiCheckSessionCtrl afVar, long j) {
            super(1);
            this.this$0 = afVar;
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
            C13377u.m54419a(false, "fail", System.currentTimeMillis() - this.$startTime, 0, str, this.this$0.getAppContext());
            this.this$0.callbackDefaultMsg(false);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.af$f */
    public static final class C25345f extends Lambda implements Function1<String, Unit> {
        public static final C25345f INSTANCE = new C25345f();

        C25345f() {
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

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.af$g */
    public static final class C25346g<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ Function1 f61847a;

        /* renamed from: b */
        final /* synthetic */ Function1 f61848b;

        C25346g(Function1 function1, Function1 function12) {
            this.f61847a = function1;
            this.f61848b = function12;
        }

        /* renamed from: a */
        public final void accept(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f61847a.invoke("empty response");
                return;
            }
            this.f61848b.invoke(new JSONObject(str));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.op.af$h */
    public static final class C25347h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Function1 f61849a;

        C25347h(Function1 function1) {
            this.f61849a = function1;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Function1 function1 = this.f61849a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            String localizedMessage = th.getLocalizedMessage();
            Intrinsics.checkExpressionValueIsNotNull(localizedMessage, "it.localizedMessage");
            function1.invoke(localizedMessage);
        }
    }

    /* renamed from: a */
    public final long mo88471a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (optJSONObject != null) {
            return optJSONObject.getLong("expire_time");
        }
        return -1;
    }

    /* renamed from: a */
    public final Boolean mo88473a(long j) {
        Sp d = m90839d();
        if (d == null) {
            return null;
        }
        AppbrandApplicationImpl inst = AppbrandApplicationImpl.getInst(getAppContext());
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandApplicationImpl.getInst(appContext)");
        String str = inst.getAppInfo().appId;
        Intrinsics.checkExpressionValueIsNotNull(str, "AppbrandApplicationImpl.…appContext).appInfo.appId");
        Sp b = d.mo49644b(str, Long.valueOf(j));
        if (b != null) {
            return Boolean.valueOf(Sp.m54286a(b, false, 1, null));
        }
        return null;
    }

    /* renamed from: a */
    private final void m90836a(Function1<? super JSONObject, Unit> function1, Function1<? super String, Unit> function12) {
        String str = C13047a.C13049b.m53532a() + this.f61846a;
        DebugUtils.f35244a.mo49649a("event_request_get_user_info", DebugUtils.Companion.m54327a(DebugUtils.f35244a, true, str, null, null, 12, null));
        HashMap hashMap = new HashMap();
        AbstractC67538f a = C67432a.m262319a(getAppContext());
        Intrinsics.checkExpressionValueIsNotNull(a, "AppbrandApplication.getInst(appContext)");
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, a.getAppInfo().appId);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("EENet-Request-Enable-Complex-Connect", String.valueOf(true));
        EnvInfo a2 = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a2 != null && !a2.mo148730a() && a2.mo148731b() == 1) {
            hashMap2.put("domain_alias", "open");
        }
        C12843b.m53039a(str, (Map<String, String>) hashMap2, new JSONObject(hashMap), getAppContext(), true).subscribe(new C25346g(function12, function1), new C25347h(function12));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LarkApiCheckSessionCtrl(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "apiHandlerCallback");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.larksuite.component.openplatform.core.plugin.op.af */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m90835a(LarkApiCheckSessionCtrl afVar, Function1 function1, Function1 function12, int i, Object obj) {
        if ((i & 2) != 0) {
            function12 = C25345f.INSTANCE;
        }
        afVar.m90836a(function1, function12);
    }
}

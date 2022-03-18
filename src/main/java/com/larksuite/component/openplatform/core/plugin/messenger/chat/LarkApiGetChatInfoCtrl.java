package com.larksuite.component.openplatform.core.plugin.messenger.chat;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.utils.C13362n;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.IdTransformer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated(message = "废弃，被 GetChatInfoAsyncHandler 替代")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0007\b\u0016¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/chat/LarkApiGetChatInfoCtrl;", "Lcom/tt/frontendapiinterface/ApiHandler;", "parms", "", "callbackId", "", "apiHandlerCallback", "Lcom/tt/option/ext/ApiHandlerCallback;", "(Ljava/lang/String;ILcom/tt/option/ext/ApiHandlerCallback;)V", "()V", "act", "", "getActionName", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.chat.d */
public final class LarkApiGetChatInfoCtrl extends ApiHandler {

    /* renamed from: a */
    public static final String f61419a = f61419a;

    /* renamed from: b */
    public static final Companion f61420b = new Companion(null);

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getChatInfo";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/chat/LarkApiGetChatInfoCtrl$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.chat.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo88240a() {
            return LarkApiGetChatInfoCtrl.f61419a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LarkApiGetChatInfoCtrl() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        boolean a = ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
        C13377u.m54418a(getActionName(), "chatInfo", a, getAppContext());
        JSONObject jSONObject = new JSONObject(this.mArgs);
        String str = f61419a;
        AppBrandLogger.m52830i(str, "api args " + this.mArgs + ",chat info permission has granted " + a);
        String optString = jSONObject.optString("openChatId");
        Intrinsics.checkExpressionValueIsNotNull(optString, "it.optString(\"openChatId\")");
        int optInt = jSONObject.optInt("chatType");
        if (jSONObject.optInt("userType", -1) == 1) {
            z = true;
        } else {
            z = false;
        }
        OPTrace a2 = C12805d.m52893a(getAppContext());
        Intrinsics.checkExpressionValueIsNotNull(a2, "RequestIdUtil.createNetworkParentTrace(appContext)");
        OPTrace a3 = C12805d.m52894a(a2, true, getAppContext());
        IdTransformer oVar = IdTransformer.f35273a;
        IAppContext appContext = getAppContext();
        Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
        Intrinsics.checkExpressionValueIsNotNull(a3, "apiTraceSpan");
        oVar.mo49669a(optString, appContext, a3, getActionName(), new C25141b(this, optString, optInt, z, a), new C25143c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.chat.d$b */
    static final class C25141b extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ int $chatType;
        final /* synthetic */ boolean $hasAuthCheck;
        final /* synthetic */ boolean $isBot;
        final /* synthetic */ String $openChatId;
        final /* synthetic */ LarkApiGetChatInfoCtrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25141b(LarkApiGetChatInfoCtrl dVar, String str, int i, boolean z, boolean z2) {
            super(1);
            this.this$0 = dVar;
            this.$openChatId = str;
            this.$chatType = i;
            this.$isBot = z;
            this.$hasAuthCheck = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            String str2;
            JSONObject jSONObject;
            Intrinsics.checkParameterIsNotNull(str, "it");
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("chatids");
            if (optJSONObject == null || (str2 = optJSONObject.optString(this.$openChatId)) == null) {
                str2 = "";
            }
            if (!StringsKt.isBlank(str2)) {
                LarkExtensionManager instance = LarkExtensionManager.getInstance();
                Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
                jSONObject = instance.getExtension().mo49582d(str2);
            } else {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str2);
            jSONObject2.put("chatType", this.$chatType);
            jSONObject2.put("isBot", this.$isBot);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            C13362n.m54361a(jSONArray.toString(), new C25142a(this, jSONObject2, jSONObject), this.$hasAuthCheck, this.this$0.getAppContext());
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J,\u0010\b\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b`\fH\u0016¨\u0006\r¸\u0006\u0000"}, d2 = {"com/larksuite/component/openplatform/core/plugin/messenger/chat/LarkApiGetChatInfoCtrl$act$2$1$1", "Lcom/bytedance/ee/larkbrand/utils/ForwardIdUtils$TransformIdCallback;", "onError", "", "msg", "", "throwable", "", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.chat.d$b$a */
        public static final class C25142a implements C13362n.AbstractC13365a {

            /* renamed from: a */
            final /* synthetic */ C25141b f61421a;

            /* renamed from: b */
            final /* synthetic */ JSONObject f61422b;

            /* renamed from: c */
            final /* synthetic */ JSONObject f61423c;

            @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
            /* renamed from: a */
            public void mo49668a(HashMap<String, Object> hashMap) {
                Intrinsics.checkParameterIsNotNull(hashMap, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                AppBrandLogger.m52830i(LarkApiGetChatInfoCtrl.f61420b.mo88240a(), "chatinfo result " + hashMap);
                try {
                    Object obj = hashMap.get(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (!(obj instanceof JSONArray)) {
                        obj = null;
                    }
                    JSONArray jSONArray = (JSONArray) obj;
                    if (jSONArray == null) {
                        Intrinsics.throwNpe();
                    }
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    if (jSONObject.has("i18nNames")) {
                        this.f61423c.put("i18nNames", jSONObject.get("i18nNames"));
                    }
                    if (jSONObject.has("name")) {
                        this.f61423c.put("name", jSONObject.get("name"));
                    }
                    if (jSONObject.has("avatarUrls")) {
                        this.f61423c.put("avatarUrls", jSONObject.get("avatarUrls"));
                    }
                    LarkApiGetChatInfoCtrl dVar = this.f61421a.this$0;
                    HashMap<String, Object> hashMap2 = new HashMap<>();
                    hashMap2.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, this.f61423c);
                    dVar.callbackMsg(true, hashMap2, null);
                } catch (Exception e) {
                    AppBrandLogger.eWithThrowable(LarkApiGetChatInfoCtrl.f61420b.mo88240a(), "Exception", e);
                    this.f61421a.this$0.callbackExtraInfoMsg(false, "handle result fail");
                }
            }

            @Override // com.bytedance.ee.larkbrand.utils.C13362n.AbstractC13365a
            /* renamed from: a */
            public void mo49667a(String str, Throwable th) {
                String a = LarkApiGetChatInfoCtrl.f61420b.mo88240a();
                boolean z = true;
                AppBrandLogger.m52829e(a, "error msg:" + str);
                String str2 = str;
                if (!(str2 == null || str2.length() == 0)) {
                    z = false;
                }
                if (!z) {
                    this.f61421a.this$0.callbackExtraInfoMsg(false, str);
                } else if (th != null) {
                    this.f61421a.this$0.callbackFail(th);
                } else {
                    this.f61421a.this$0.callbackDefaultMsg(false);
                }
            }

            C25142a(C25141b bVar, JSONObject jSONObject, JSONObject jSONObject2) {
                this.f61421a = bVar;
                this.f61422b = jSONObject;
                this.f61423c = jSONObject2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.chat.d$c */
    static final class C25143c extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ LarkApiGetChatInfoCtrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25143c(LarkApiGetChatInfoCtrl dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            this.this$0.callbackException(th);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LarkApiGetChatInfoCtrl(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "apiHandlerCallback");
    }
}

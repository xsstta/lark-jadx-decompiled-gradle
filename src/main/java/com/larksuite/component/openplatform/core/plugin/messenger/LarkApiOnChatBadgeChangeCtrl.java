package com.larksuite.component.openplatform.core.plugin.messenger;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.p622a.p623a.C12805d;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.ee.larkbrand.utils.IdTransformer;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Deprecated(message = "use plugin")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/LarkApiOnChatBadgeChangeCtrl;", "Lcom/tt/frontendapiinterface/ApiHandler;", "()V", "params", "", "callbackId", "", "apiHandlerCallback", "Lcom/tt/option/ext/ApiHandlerCallback;", "(Ljava/lang/String;ILcom/tt/option/ext/ApiHandlerCallback;)V", "act", "", "getActionName", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.u */
public final class LarkApiOnChatBadgeChangeCtrl extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "onChatBadgeChange";
    }

    public LarkApiOnChatBadgeChangeCtrl() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        boolean a = ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
        C13377u.m54418a(getActionName(), "chatInfo", a, getAppContext());
        AppBrandLogger.m52830i("ApiHandler", "chatInfo permission has granted " + a);
        if (a) {
            String optString = new JSONObject(this.mArgs).optString("openChatId");
            OPTrace a2 = C12805d.m52893a(getAppContext());
            Intrinsics.checkExpressionValueIsNotNull(a2, "RequestIdUtil.createNetworkParentTrace(appContext)");
            OPTrace a3 = C12805d.m52894a(a2, true, getAppContext());
            Intrinsics.checkExpressionValueIsNotNull(optString, "openChatId");
            if (optString.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                IdTransformer oVar = IdTransformer.f35273a;
                IAppContext appContext = getAppContext();
                Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
                Intrinsics.checkExpressionValueIsNotNull(a3, "apiTraceSpan");
                oVar.mo49669a(optString, appContext, a3, getActionName(), new C25302a(this, optString), new C25303b(this));
                return;
            }
            AppBrandLogger.m52829e("ApiHandler", "openChatId is empty!");
            callbackExtraInfoMsg(false, "must set openChatId");
            return;
        }
        callbackExtraInfoMsg(false, "no chatInfo authorization");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.u$a */
    static final class C25302a extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ String $openChatId;
        final /* synthetic */ LarkApiOnChatBadgeChangeCtrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25302a(LarkApiOnChatBadgeChangeCtrl uVar, String str) {
            super(1);
            this.this$0 = uVar;
            this.$openChatId = str;
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
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, "it");
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("chatids");
            if (optJSONObject == null || (str2 = optJSONObject.optString(this.$openChatId)) == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                LarkBadgeHelper xVar = LarkBadgeHelper.f61807a;
                String str3 = this.$openChatId;
                Intrinsics.checkExpressionValueIsNotNull(str3, "openChatId");
                IAppContext appContext = this.this$0.getAppContext();
                Intrinsics.checkExpressionValueIsNotNull(appContext, "appContext");
                xVar.mo88426a(str3, str2, appContext);
                this.this$0.callbackDefaultMsg(true);
                return;
            }
            AppBrandLogger.m52829e("ApiHandler", "chatId is empty!");
            this.this$0.callbackExtraInfoMsg(false, "args error");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.u$b */
    static final class C25303b extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ LarkApiOnChatBadgeChangeCtrl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25303b(LarkApiOnChatBadgeChangeCtrl uVar) {
            super(1);
            this.this$0 = uVar;
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
    public LarkApiOnChatBadgeChangeCtrl(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "apiHandlerCallback");
    }
}

package com.larksuite.component.openplatform.core.plugin.messenger;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import com.tt.refer.p3400a.p3412i.AbstractC67734b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated(message = "use plugin")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/LarkApiOffChatBadgeChangeCtrl;", "Lcom/tt/frontendapiinterface/ApiHandler;", "()V", "params", "", "callbackId", "", "apiHandlerCallback", "Lcom/tt/option/ext/ApiHandlerCallback;", "(Ljava/lang/String;ILcom/tt/option/ext/ApiHandlerCallback;)V", "act", "", "getActionName", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.t */
public final class LarkApiOffChatBadgeChangeCtrl extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "offChatBadgeChange";
    }

    public LarkApiOffChatBadgeChangeCtrl() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        boolean z;
        boolean a = ((AbstractC67734b) getAppContext().findServiceByInterface(AbstractC67734b.class)).mo50195a("chatInfo");
        C13377u.m54418a(getActionName(), "chatInfo", a, getAppContext());
        AppBrandLogger.m52830i("ApiHandler", "chatInfo permission has granted " + a);
        if (a) {
            try {
                String optString = new JSONObject(this.mArgs).optString("openChatId");
                Intrinsics.checkExpressionValueIsNotNull(optString, "openChatId");
                if (optString.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    LarkBadgeHelper.f61807a.mo88425a(optString);
                    callbackDefaultMsg(true);
                    return;
                }
                AppBrandLogger.m52829e("ApiHandler", "openChatId is empty");
                callbackExtraInfoMsg(false, "openChatId must set");
            } catch (JSONException e) {
                JSONException jSONException = e;
                AppBrandLogger.eWithThrowable("LarkApiOffChatBadgeChangeCtrl", "json failed " + this.mArgs, jSONException);
                callbackException(jSONException);
            }
        } else {
            AppBrandLogger.m52830i("ApiHandler", "hasAuthCheck is false");
            callbackExtraInfoMsg(false, "no chatInfo authorization");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LarkApiOffChatBadgeChangeCtrl(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "apiHandlerCallback");
    }
}

package com.larksuite.component.openplatform.core.plugin.inner;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.service.ExtensionWrapper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "recommend use LarkApiGetServerTimePlugin")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/inner/LarkApiGetServerTimeCtrl;", "Lcom/tt/frontendapiinterface/ApiHandler;", "()V", "params", "", "callbackId", "", "apiHandlerCallback", "Lcom/tt/option/ext/ApiHandlerCallback;", "(Ljava/lang/String;ILcom/tt/option/ext/ApiHandlerCallback;)V", "TAG", "getTAG", "()Ljava/lang/String;", "act", "", "getActionName", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.inner.m */
public final class LarkApiGetServerTimeCtrl extends ApiHandler {

    /* renamed from: a */
    private final String f61114a = "LarkApiGetServerTimeCtrl";

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getServerTime";
    }

    public LarkApiGetServerTimeCtrl() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        LarkExtensionManager instance = LarkExtensionManager.getInstance();
        Intrinsics.checkExpressionValueIsNotNull(instance, "LarkExtensionManager.getInstance()");
        ExtensionWrapper extension = instance.getExtension();
        Intrinsics.checkExpressionValueIsNotNull(extension, "LarkExtensionManager.getInstance().extension");
        long serverTime = extension.getServerTime();
        if (serverTime < 0) {
            AppBrandLogger.m52829e(this.f61114a, "getServerTimeFail");
            callbackDefaultMsg(false);
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("date", Long.valueOf(serverTime));
        callbackOtherExtraMsg(true, hashMap);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LarkApiGetServerTimeCtrl(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "apiHandlerCallback");
    }
}

package com.larksuite.component.openplatform.core.plugin.messenger;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.option.ext.AbstractC67619e;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Deprecated(message = "use scan code open. ScanCodePlugin")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\r"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/messenger/LarkApiScanCodeCtrl;", "Lcom/tt/frontendapiinterface/ApiHandler;", "()V", "params", "", "callbackId", "", "apiHandlerCallback", "Lcom/tt/option/ext/ApiHandlerCallback;", "(Ljava/lang/String;ILcom/tt/option/ext/ApiHandlerCallback;)V", "act", "", "getActionName", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.w */
public final class LarkApiScanCodeCtrl extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "scanCode";
    }

    public LarkApiScanCodeCtrl() {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if (r8 == false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c8  */
    @Override // com.tt.frontendapiinterface.ApiHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void act() {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.openplatform.core.plugin.messenger.LarkApiScanCodeCtrl.act():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/openplatform/core/plugin/messenger/LarkApiScanCodeCtrl$act$ipcCallback$1", "Lcom/tt/miniapphost/process/callback/IpcCallback;", "onIpcCallback", "", "callbackData", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.w$a */
    public static final class C25307a extends AbstractC67565b {

        /* renamed from: a */
        final /* synthetic */ LarkApiScanCodeCtrl f61806a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25307a(LarkApiScanCodeCtrl wVar) {
            this.f61806a = wVar;
        }

        @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
        /* renamed from: a */
        public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
            boolean z = true;
            AppBrandLogger.m52830i(this.f61806a.getActionName(), "onIpcCallback");
            JSONObject jSONObject = new JSONObject();
            String a = C13374s.m54385a(crossProcessDataEntity);
            if (a != null) {
                if (a.length() <= 0) {
                    z = false;
                }
                if (z) {
                    jSONObject.put("result", a);
                    this.f61806a.callbackOk(jSONObject);
                    return;
                }
            }
            this.f61806a.callbackFail(ApiCode.GENERAL_CANCEL);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LarkApiScanCodeCtrl(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "apiHandlerCallback");
    }
}

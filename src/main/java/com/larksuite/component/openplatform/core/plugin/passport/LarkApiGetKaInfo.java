package com.larksuite.component.openplatform.core.plugin.passport;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.settings.v2.handler.C66788n;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import com.tt.option.ext.AbstractC67619e;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

@Deprecated(message = "use plugin")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LarkApiGetKaInfo;", "Lcom/tt/frontendapiinterface/ApiHandler;", "()V", "params", "", "callbackId", "", "apiHandlerCallback", "Lcom/tt/option/ext/ApiHandlerCallback;", "(Ljava/lang/String;ILcom/tt/option/ext/ApiHandlerCallback;)V", "act", "", "getActionName", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.e */
public final class LarkApiGetKaInfo extends ApiHandler {

    /* renamed from: a */
    public static final Companion f62028a = new Companion(null);

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getKAInfo";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LarkApiGetKaInfo$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LarkApiGetKaInfo() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        try {
            AbstractC67538f a = C67432a.m262319a(getAppContext());
            Intrinsics.checkExpressionValueIsNotNull(a, "AppbrandApplication.getInst(appContext)");
            AppInfoEntity appInfo = a.getAppInfo();
            if (appInfo != null) {
                Unit unit = null;
                if (C66788n.m260652a().mo232698a("getKAInfo", appInfo.appId)) {
                    CrossProcessDataEntity a2 = C67560a.m262955a("lak_getKaInfo", (CrossProcessDataEntity) null);
                    if (a2 != null) {
                        String b = a2.mo234744b("channel");
                        if (b != null) {
                            HashMap<String, Object> hashMap = new HashMap<>();
                            hashMap.put("channel", b);
                            callbackOtherExtraMsg(true, hashMap);
                        } else {
                            callbackDefaultMsg(false);
                        }
                        unit = Unit.INSTANCE;
                    }
                } else {
                    callbackExtraInfoMsg(false, "app has no permission");
                    unit = Unit.INSTANCE;
                }
                if (unit != null) {
                    return;
                }
            }
            AppBrandLogger.m52829e("LarkApiGetKaInfo", "appInfo null");
            callbackDefaultMsg(false);
            Unit unit2 = Unit.INSTANCE;
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("LarkApiGetKaInfo", "json failed", e);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LarkApiGetKaInfo(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "apiHandlerCallback");
    }
}

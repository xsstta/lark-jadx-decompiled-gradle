package com.larksuite.component.openplatform.core.plugin.passport;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.ee.larkbrand.utils.JsonUtil;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.option.ext.AbstractC67619e;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "use plugin")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B!\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LarkApiGetUserInfoExCtrl;", "Lcom/tt/frontendapiinterface/ApiHandler;", "()V", "params", "", "callbackId", "", "apiHandlerCallback", "Lcom/tt/option/ext/ApiHandlerCallback;", "(Ljava/lang/String;ILcom/tt/option/ext/ApiHandlerCallback;)V", "act", "", "getActionName", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.openplatform.core.plugin.passport.f */
public final class LarkApiGetUserInfoExCtrl extends ApiHandler {

    /* renamed from: a */
    public static final Companion f62029a = new Companion(null);

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "getUserInfoEx";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/LarkApiGetUserInfoExCtrl$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LarkApiGetUserInfoExCtrl() {
    }

    /* access modifiers changed from: protected */
    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        if (!C67556a.m262941a("lark_get_userInfo_ex")) {
            AppBrandLogger.m52829e("LarkApiGetUserInfoExCtrl", "no data handler");
            callbackAppUnSupportFeature();
            return;
        }
        C13374s.m54399c(new C25458b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/openplatform/core/plugin/passport/LarkApiGetUserInfoExCtrl$act$1", "Lcom/tt/miniapphost/process/callback/IpcCallback;", "onIpcCallback", "", "callbackData", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.f$b */
    public static final class C25458b extends AbstractC67565b {

        /* renamed from: a */
        final /* synthetic */ LarkApiGetUserInfoExCtrl f62030a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C25458b(LarkApiGetUserInfoExCtrl fVar) {
            this.f62030a = fVar;
        }

        @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
        /* renamed from: a */
        public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
            String str;
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("userInfoEx data: ");
            if (crossProcessDataEntity != null) {
                str = crossProcessDataEntity.toString();
            } else {
                str = null;
            }
            sb.append(str);
            objArr[0] = sb.toString();
            AppBrandLogger.m52830i("LarkApiGetUserInfoExCtrl", objArr);
            if (crossProcessDataEntity != null) {
                try {
                    if (crossProcessDataEntity.mo234742a("user_info_ex")) {
                        String b = crossProcessDataEntity.mo234744b("user_info_ex");
                        if (b != null) {
                            LarkApiGetUserInfoExCtrl fVar = this.f62030a;
                            JsonUtil.Companion aVar = JsonUtil.f35285a;
                            Intrinsics.checkExpressionValueIsNotNull(b, "it");
                            fVar.callbackOtherExtraMsg(true, aVar.mo49680a(b));
                            return;
                        }
                        this.f62030a.callbackDefaultMsg(false);
                    } else if (crossProcessDataEntity.mo234742a("user_info_ex_error")) {
                        String b2 = crossProcessDataEntity.mo234744b("user_info_ex_error");
                        if (b2 != null) {
                            this.f62030a.callbackExtraInfoMsg(false, b2);
                        } else {
                            this.f62030a.callbackDefaultMsg(false);
                        }
                    } else {
                        this.f62030a.callbackDefaultMsg(false);
                    }
                } catch (Exception e) {
                    AppBrandLogger.eWithThrowable("LarkApiGetUserInfoExCtrl", "get UserInfoEx error", e);
                    this.f62030a.callbackDefaultMsg(false);
                }
            } else {
                AppBrandLogger.m52829e("LarkApiGetUserInfoExCtrl", "get UserInfoEx error");
                this.f62030a.callbackDefaultMsg(false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LarkApiGetUserInfoExCtrl(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
        Intrinsics.checkParameterIsNotNull(eVar, "apiHandlerCallback");
    }
}

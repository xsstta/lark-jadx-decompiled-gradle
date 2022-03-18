package com.larksuite.component.openplatform.core.plugin.passport;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.tt.miniapp.settings.v2.handler.C66788n;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3375a.C67560a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0003\f\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/GetKaInfoPlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "getKaInfo", "", "lkEvent", "Lcom/larksuite/framework/apiplugin/LKEvent;", "getKaInfoRequest", "Lcom/larksuite/component/openplatform/core/plugin/passport/GetKaInfoPlugin$GetKaInfoRequest;", "invokeCallback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "Lcom/larksuite/component/openplatform/core/plugin/passport/GetKaInfoPlugin$GetKaInfoResponse;", "Companion", "GetKaInfoRequest", "GetKaInfoResponse", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class GetKaInfoPlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/GetKaInfoPlugin$GetKaInfoRequest;", "Lcom/larksuite/framework/apiplugin/common/LKBaseRequestModel;", "()V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class GetKaInfoRequest extends C25920a {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/GetKaInfoPlugin$GetKaInfoResponse;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "mChannel", "", "getMChannel", "()Ljava/lang/String;", "setMChannel", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class GetKaInfoResponse extends C25921b {
        @JSONField(name = "channel")
        private String mChannel = "";

        public final String getMChannel() {
            return this.mChannel;
        }

        public final void setMChannel(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.mChannel = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/passport/GetKaInfoPlugin$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.passport.GetKaInfoPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @LKPluginFunction(async = true, eventName = {"getKAInfo"})
    public final void getKaInfo(LKEvent lKEvent, GetKaInfoRequest getKaInfoRequest, AbstractC25897h<GetKaInfoResponse> hVar) {
        Intrinsics.checkParameterIsNotNull(lKEvent, "lkEvent");
        Intrinsics.checkParameterIsNotNull(getKaInfoRequest, "getKaInfoRequest");
        Intrinsics.checkParameterIsNotNull(hVar, "invokeCallback");
        GetKaInfoResponse getKaInfoResponse = new GetKaInfoResponse();
        IAppContext eventContext = getEventContext(lKEvent);
        if (eventContext == null) {
            AbstractC25895f c = lKEvent.mo92134c();
            Intrinsics.checkExpressionValueIsNotNull(c, "lkEvent.eventContext");
            c.mo92190b().mo92223e("LarkApiGetKaInfo", "appContext is null");
            fillFailedResponse(getKaInfoResponse, C25906a.f64080j, "appContext is null");
            hVar.callback(getKaInfoResponse);
            return;
        }
        AbstractC67538f a = C67432a.m262319a(eventContext);
        Intrinsics.checkExpressionValueIsNotNull(a, "AppbrandApplication.getInst(mAppContext)");
        AppInfoEntity appInfo = a.getAppInfo();
        if (appInfo != null) {
            Unit unit = null;
            if (C66788n.m260652a().mo232698a("getKAInfo", appInfo.appId)) {
                CrossProcessDataEntity a2 = C67560a.m262955a("lak_getKaInfo", (CrossProcessDataEntity) null);
                if (a2 != null) {
                    String b = a2.mo234744b("channel");
                    if (b != null) {
                        getKaInfoResponse.setMChannel(b);
                        hVar.callback(getKaInfoResponse);
                    } else {
                        AbstractC25895f c2 = lKEvent.mo92134c();
                        Intrinsics.checkExpressionValueIsNotNull(c2, "lkEvent.eventContext");
                        c2.mo92190b().mo92223e("LarkApiGetKaInfo", "channel is null");
                        fillFailedResponse(getKaInfoResponse, C25906a.f64080j, "channel is null");
                        hVar.callback(getKaInfoResponse);
                    }
                    unit = Unit.INSTANCE;
                }
            } else {
                AbstractC25895f c3 = lKEvent.mo92134c();
                Intrinsics.checkExpressionValueIsNotNull(c3, "lkEvent.eventContext");
                c3.mo92190b().mo92223e("LarkApiGetKaInfo", "app has no permission");
                fillFailedResponse(getKaInfoResponse, C25906a.f64080j, "app has no permission");
                hVar.callback(getKaInfoResponse);
                unit = Unit.INSTANCE;
            }
            if (unit != null) {
                return;
            }
        }
        AbstractC25895f c4 = lKEvent.mo92134c();
        Intrinsics.checkExpressionValueIsNotNull(c4, "lkEvent.eventContext");
        c4.mo92190b().mo92223e("LarkApiGetKaInfo", "appInfo null");
        fillFailedResponse(getKaInfoResponse, C25906a.f64080j, "appInfo is null");
        hVar.callback(getKaInfoResponse);
        Unit unit2 = Unit.INSTANCE;
    }
}

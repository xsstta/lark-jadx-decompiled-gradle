package com.larksuite.component.openplatform.core.plugin;

import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.annotation.LKRequiredParam;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25914i;
import com.larksuite.framework.apiplugin.validator.format.StringEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0003\f\r\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/PadDisplayScalePlugin;", "Lcom/larksuite/component/openplatform/core/plugin/OPPlugin;", "()V", "getPadDisplayScaleMode", "", "invokeCallback", "Lcom/larksuite/framework/apiplugin/api/LKEventInvokeCallback;", "Lcom/larksuite/component/openplatform/core/plugin/PadDisplayScalePlugin$PadDisplayScaleResponse;", "togglePadFullScreen", "requestModel", "Lcom/larksuite/component/openplatform/core/plugin/PadDisplayScalePlugin$TogglePadFullScreenRequest;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "Companion", "PadDisplayScaleResponse", "TogglePadFullScreenRequest", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PadDisplayScalePlugin extends OPPlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/PadDisplayScalePlugin$PadDisplayScaleResponse;", "Lcom/larksuite/framework/apiplugin/common/LKBaseResponseModel;", "()V", "displayScaleMode", "", "getDisplayScaleMode", "()Ljava/lang/String;", "setDisplayScaleMode", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class PadDisplayScaleResponse extends C25921b {
        private String displayScaleMode;

        public final String getDisplayScaleMode() {
            return this.displayScaleMode;
        }

        public final void setDisplayScaleMode(String str) {
            this.displayScaleMode = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/PadDisplayScalePlugin$TogglePadFullScreenRequest;", "Lcom/larksuite/framework/apiplugin/common/LKBaseRequestModel;", "()V", "displayScaleMode", "", "getDisplayScaleMode", "()Ljava/lang/String;", "setDisplayScaleMode", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class TogglePadFullScreenRequest extends C25920a {
        @LKRequiredParam
        @StringEnum(values = {"fullScreen", "allVisible"})
        private String displayScaleMode;

        public final String getDisplayScaleMode() {
            return this.displayScaleMode;
        }

        public final void setDisplayScaleMode(String str) {
            this.displayScaleMode = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/larksuite/component/openplatform/core/plugin/PadDisplayScalePlugin$Companion;", "", "()V", "RESULT_DISABLE_SCALE", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.openplatform.core.plugin.PadDisplayScalePlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @LKPluginFunction(async = true, eventName = {"getPadDisplayScaleMode"})
    public final void getPadDisplayScaleMode(AbstractC25897h<PadDisplayScaleResponse> hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "invokeCallback");
        PadDisplayScaleResponse padDisplayScaleResponse = new PadDisplayScaleResponse();
        padDisplayScaleResponse.setDisplayScaleMode("disableScale");
        hVar.callback(padDisplayScaleResponse);
    }

    @LKPluginFunction(async = true, eventName = {"togglePadFullScreen"})
    public final void togglePadFullScreen(TogglePadFullScreenRequest togglePadFullScreenRequest, AbstractC25897h<C25921b> hVar) {
        Intrinsics.checkParameterIsNotNull(togglePadFullScreenRequest, "requestModel");
        Intrinsics.checkParameterIsNotNull(hVar, "invokeCallback");
        hVar.callback(createFailedResponse(C25914i.f64200d));
    }
}

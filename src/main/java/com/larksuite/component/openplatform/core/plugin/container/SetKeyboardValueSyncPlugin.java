package com.larksuite.component.openplatform.core.plugin.container;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.RenderViewManager;
import com.tt.miniapp.component.nativeview.C65844b;
import com.tt.miniapp.component.nativeview.NativeViewManager;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.AppbrandContext;

public class SetKeyboardValueSyncPlugin extends OPPlugin {

    private static class SetKeyboardValueSyncRequest extends C25920a {
        @JSONField(name = "cursor")
        public int mCursor;
        @JSONField(name = "inputId")
        public int mInputId;
        @JSONField(name = "value")
        public String mValue;

        private SetKeyboardValueSyncRequest() {
        }
    }

    private static class SetKeyboardValueSyncResponse extends C25921b {
        private SetKeyboardValueSyncResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(eventName = {"setKeyboardValue"})
    public SetKeyboardValueSyncResponse setKeyboardValueSync(SetKeyboardValueSyncRequest setKeyboardValueSyncRequest, AbstractC25895f fVar) {
        SetKeyboardValueSyncResponse setKeyboardValueSyncResponse = new SetKeyboardValueSyncResponse();
        try {
            int i = setKeyboardValueSyncRequest.mInputId;
            final int i2 = setKeyboardValueSyncRequest.mCursor;
            final String str = setKeyboardValueSyncRequest.mValue;
            RenderViewManager renderViewManager = AppbrandApplicationImpl.getInst(getAppContext()).getRenderViewManager();
            if (renderViewManager == null) {
                ILogger b = fVar.mo92190b();
                b.mo92223e("tma_ApiRequestCtrl", "webViewManager == null, appContextKey:" + getAppContext().getAppId());
                setKeyboardValueSyncResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                setKeyboardValueSyncResponse.mErrorMessage = "WebViewManager is null";
                return setKeyboardValueSyncResponse;
            }
            RenderViewManager.IRender currentIRender = renderViewManager.getCurrentIRender();
            if (currentIRender == null) {
                ILogger b2 = fVar.mo92190b();
                b2.mo92223e("tma_ApiRequestCtrl", "render == null, appContextKey:" + getAppContext().getAppId());
                setKeyboardValueSyncResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                setKeyboardValueSyncResponse.mErrorMessage = "current render is null";
                return setKeyboardValueSyncResponse;
            }
            NativeViewManager nativeViewManager = currentIRender.getNativeViewManager();
            if (nativeViewManager == null) {
                ILogger b3 = fVar.mo92190b();
                b3.mo92223e("tma_ApiRequestCtrl", "nativeViewManager == null, appContextKey:" + getAppContext().getAppId());
                setKeyboardValueSyncResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                setKeyboardValueSyncResponse.mErrorMessage = "native view manager is null";
                return setKeyboardValueSyncResponse;
            }
            View view = nativeViewManager.getView(i);
            if (view instanceof C65844b) {
                final C65844b bVar = (C65844b) view;
                if (!TextUtils.equals(bVar.getValue(), str)) {
                    AppbrandContext.getMainHandler().post(new Runnable() {
                        /* class com.larksuite.component.openplatform.core.plugin.container.SetKeyboardValueSyncPlugin.RunnableC246341 */

                        public void run() {
                            bVar.setValue(str);
                            int i = i2;
                            if (i != -1) {
                                bVar.setSelection(i);
                                return;
                            }
                            C65844b bVar = bVar;
                            bVar.setSelection(bVar.getText().length());
                        }
                    });
                }
                return setKeyboardValueSyncResponse;
            }
            fVar.mo92190b().mo92223e("tma_ApiRequestCtrl", "view is not input");
            setKeyboardValueSyncResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            setKeyboardValueSyncResponse.mErrorMessage = "view is not input";
            return setKeyboardValueSyncResponse;
        } catch (Exception e) {
            fVar.mo92190b().mo92223e("tma_ApiRequestCtrl", e.getMessage());
            setKeyboardValueSyncResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
            setKeyboardValueSyncResponse.mErrorMessage = e.getMessage();
            return setKeyboardValueSyncResponse;
        }
    }
}

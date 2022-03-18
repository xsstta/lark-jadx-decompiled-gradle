package com.larksuite.component.openplatform.core.plugin.messenger;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.suite.R;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapp.errorcode.ApiErrorCode;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.util.C67590h;

public class ShowModalHandlerPlugin extends OPPlugin {

    private static class ShowModalHandlerRequest extends C25920a {
        @JSONField(name = "cancelColor")
        public String mCancelColor;
        @JSONField(name = "cancelText")
        public String mCancelText;
        @JSONField(name = "confirmColor")
        public String mConfirmColor;
        @JSONField(name = "confirmText")
        public String mConfirmText;
        @JSONField(name = "content")
        public String mContent;
        @JSONField(name = "showCancel")
        public boolean mShowCancel;
        @JSONField(name = "title")
        public String mTitle;

        private ShowModalHandlerRequest() {
        }
    }

    /* access modifiers changed from: private */
    public static class ShowModalHandlerResponse extends C25921b {
        @JSONField(name = "cancel")
        public boolean mCanceled;
        @JSONField(name = "confirm")
        public boolean mConfirmed;

        private ShowModalHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"showModal"})
    public void showModalHandlerAsync(LKEvent lKEvent, final ShowModalHandlerRequest showModalHandlerRequest, AbstractC25905b bVar, final AbstractC25897h<ShowModalHandlerResponse> hVar, final AbstractC25895f fVar) {
        final ShowModalHandlerResponse showModalHandlerResponse = new ShowModalHandlerResponse();
        fVar.mo92190b().mo92224i("ShowModalHandlerPlugin", showModalHandlerRequest.toString());
        if (!TextUtils.isEmpty(showModalHandlerRequest.mContent) || !TextUtils.isEmpty(showModalHandlerRequest.mTitle)) {
            if (TextUtils.isEmpty(showModalHandlerRequest.mCancelText)) {
                showModalHandlerRequest.mCancelText = C67590h.m263073a((int) R.string.microapp_m_map_dialog_cancel);
            }
            if (!showModalHandlerRequest.mShowCancel) {
                showModalHandlerRequest.mCancelText = "";
            }
            new Handler(getAppContext().getApplicationContext().getMainLooper()).post(new Runnable() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.ShowModalHandlerPlugin.RunnableC250921 */

                public void run() {
                    Activity f = ShowModalHandlerPlugin.this.getApiDependency().mo235051f();
                    if (f != null) {
                        ShowModalHandlerPlugin.this.getApiDependency().mo235025a(f, showModalHandlerRequest.toString(), showModalHandlerRequest.mTitle, showModalHandlerRequest.mContent, showModalHandlerRequest.mShowCancel, showModalHandlerRequest.mCancelText, showModalHandlerRequest.mCancelColor, showModalHandlerRequest.mConfirmText, showModalHandlerRequest.mConfirmColor, !ShowModalHandlerPlugin.this.getApiDependency().mo235052f("ecosystem.api.show_modal.disable_mask_click"), new AbstractC67550j.AbstractC67551a<Integer>() {
                            /* class com.larksuite.component.openplatform.core.plugin.messenger.ShowModalHandlerPlugin.RunnableC250921.C250931 */

                            /* renamed from: a */
                            public void onNativeModuleCall(Integer num) {
                                boolean z;
                                ILogger b = fVar.mo92190b();
                                boolean z2 = true;
                                b.mo92224i("ShowModalHandlerPlugin", "native module call , msg: " + num);
                                ShowModalHandlerResponse showModalHandlerResponse = showModalHandlerResponse;
                                if (num.intValue() == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                showModalHandlerResponse.mConfirmed = z;
                                ShowModalHandlerResponse showModalHandlerResponse2 = showModalHandlerResponse;
                                if (num.intValue() == 1) {
                                    z2 = false;
                                }
                                showModalHandlerResponse2.mCanceled = z2;
                                hVar.callback(showModalHandlerResponse);
                            }
                        });
                        return;
                    }
                    showModalHandlerResponse.mErrorCode = ApiCode.GENERAL_UNKONW_ERROR.code;
                    showModalHandlerResponse.mErrorMessage = ApiCode.GENERAL_UNKONW_ERROR.msg;
                    hVar.callback(showModalHandlerResponse);
                    AppBrandLogger.m52829e("ShowModalHandlerPlugin", ApiErrorCode.INNER_CONTEXT_ERROR.msg);
                }
            });
            return;
        }
        showModalHandlerResponse.mErrorCode = ApiCode.SHOWMODAL_INVALID_MODAL.code;
        showModalHandlerResponse.mErrorMessage = ApiCode.SHOWMODAL_INVALID_MODAL.msg;
        hVar.callback(showModalHandlerResponse);
        fVar.mo92190b().mo92223e("ShowModalHandlerPlugin", "title or content is empty");
    }
}

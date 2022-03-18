package com.larksuite.component.openplatform.core.plugin.messenger;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.larkbrand.utils.C13351i;
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
import com.tt.refer.common.util.C67866g;

public class LarkApiPromptCtrlPlugin extends OPPlugin {

    private static class LarkApiPromptCtrlResponse extends C25921b {
        @JSONField(name = "cancel")
        public boolean mCanceled;
        @JSONField(name = "confirm")
        public boolean mConfirmed;
        @JSONField(name = "inputValue")
        public String mInputValue;

        private LarkApiPromptCtrlResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private static class LarkApiPromptCtrlRequest extends C25920a {
        @JSONField(name = "cancelText")
        public String mCancelText;
        @JSONField(name = "confirmText")
        public String mConfirmText;
        @JSONField(name = "placeholder")
        public String mHint;
        @JSONField(name = "maxLength")
        public int mMaxLength = 140;
        @JSONField(name = "title")
        public String mTitle;

        private LarkApiPromptCtrlRequest() {
        }
    }

    @LKPluginFunction(async = true, eventName = {"showPrompt"})
    public void LarkApiPromptCtrlAsync(LKEvent lKEvent, final LarkApiPromptCtrlRequest larkApiPromptCtrlRequest, AbstractC25905b bVar, final AbstractC25897h<LarkApiPromptCtrlResponse> hVar, final AbstractC25895f fVar) {
        final LarkApiPromptCtrlResponse larkApiPromptCtrlResponse = new LarkApiPromptCtrlResponse();
        if (TextUtils.isEmpty(larkApiPromptCtrlRequest.mHint)) {
            larkApiPromptCtrlRequest.mHint = getAppContext().getApplicationContext().getString(R.string.lark_brand_prompt_hint);
        }
        if (TextUtils.isEmpty(larkApiPromptCtrlRequest.mConfirmText)) {
            larkApiPromptCtrlRequest.mConfirmText = getAppContext().getApplicationContext().getString(R.string.lark_brand_dialog_ok);
        }
        if (TextUtils.isEmpty(larkApiPromptCtrlRequest.mCancelText)) {
            larkApiPromptCtrlRequest.mCancelText = getAppContext().getApplicationContext().getString(R.string.lark_brand_dialog_cancel);
        }
        ILogger b = fVar.mo92190b();
        b.mo92224i("LarkApiPromptCtrlPlugin", "handler data, title: " + larkApiPromptCtrlRequest.mTitle + "max length:" + larkApiPromptCtrlRequest.mMaxLength);
        C67866g.m264027a(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkApiPromptCtrlPlugin.RunnableC250691 */

            public void run() {
                C13351i.m54346a(LarkApiPromptCtrlPlugin.this.getAppContext().getCurrentActivity(), larkApiPromptCtrlRequest.mTitle, larkApiPromptCtrlRequest.mHint, larkApiPromptCtrlRequest.mMaxLength, larkApiPromptCtrlRequest.mConfirmText, larkApiPromptCtrlRequest.mCancelText, new C13351i.AbstractC13358b() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.LarkApiPromptCtrlPlugin.RunnableC250691.C250701 */

                    @Override // com.bytedance.ee.larkbrand.utils.C13351i.AbstractC13358b
                    /* renamed from: a */
                    public void mo49660a(boolean z, String str) {
                        ILogger b = fVar.mo92190b();
                        b.mo92224i("LarkApiPromptCtrlPlugin", "handler data done, is cancel: " + z + "prompt Text:" + str);
                        larkApiPromptCtrlResponse.mConfirmed = z ^ true;
                        larkApiPromptCtrlResponse.mCanceled = z;
                        larkApiPromptCtrlResponse.mInputValue = str;
                        hVar.callback(larkApiPromptCtrlResponse);
                    }
                });
            }
        });
    }
}

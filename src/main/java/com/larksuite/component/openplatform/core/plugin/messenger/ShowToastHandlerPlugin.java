package com.larksuite.component.openplatform.core.plugin.messenger;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.p3400a.p3401a.AbstractC67709b;

public class ShowToastHandlerPlugin extends OPPlugin {

    private static class ShowToastHandlerResponse extends C25921b {
        private ShowToastHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    private static class ShowToastHandlerRequest extends C25920a {
        @JSONField(name = "duration")
        public long mDuration = 1500;
        @JSONField(name = "icon")
        public String mIcon = "";
        @JSONField(name = "mask")
        public boolean mMask;
        @JSONField(name = "title")
        public String mTitle = "";

        private ShowToastHandlerRequest() {
        }
    }

    @LKPluginFunction(async = true, eventName = {"showToast"})
    public void showToastAsync(LKEvent lKEvent, final ShowToastHandlerRequest showToastHandlerRequest, AbstractC25905b bVar, final AbstractC25897h<ShowToastHandlerResponse> hVar, final AbstractC25895f fVar) {
        final ShowToastHandlerResponse showToastHandlerResponse = new ShowToastHandlerResponse();
        ILogger b = fVar.mo92190b();
        b.mo92224i("ShowToastHandlerPlugin", "show toast plugin:" + showToastHandlerRequest.toString());
        final long j = showToastHandlerRequest.mDuration;
        final String str = showToastHandlerRequest.mTitle;
        final String str2 = showToastHandlerRequest.mIcon;
        if (j <= 0) {
            j = 1500;
        }
        if (TextUtils.isEmpty(str)) {
            fillFailedResponse(showToastHandlerResponse, C25906a.f64072b, "");
            hVar.callback(showToastHandlerResponse);
            fVar.mo92190b().mo92223e("ShowToastHandlerPlugin", "title is empty");
            return;
        }
        new Handler(getAppContext().getApplicationContext().getMainLooper()).post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.ShowToastHandlerPlugin.RunnableC250941 */

            public void run() {
                AbstractC67709b.AbstractC67710a apiDependency = ShowToastHandlerPlugin.this.getApiDependency();
                if (apiDependency != null) {
                    Context f = apiDependency.mo235051f();
                    if (f == null) {
                        f = ShowToastHandlerPlugin.this.getAppContext().getApplicationContext();
                    }
                    if (f != null) {
                        ShowToastHandlerPlugin.this.getApiDependency().mo235024a(f, showToastHandlerRequest.toString(), str, j, str2);
                        hVar.callback(showToastHandlerResponse);
                        return;
                    }
                    ShowToastHandlerPlugin.this.fillFailedResponse(showToastHandlerResponse, C25906a.f64080j, "context is null");
                    hVar.callback(showToastHandlerResponse);
                    fVar.mo92190b().mo92224i("ShowToastHandlerPlugin", "context is null");
                    return;
                }
                ShowToastHandlerPlugin.this.fillFailedResponse(showToastHandlerResponse, C25906a.f64080j, "api dependency is null");
                hVar.callback(showToastHandlerResponse);
                fVar.mo92190b().mo92224i("ShowToastHandlerPlugin", "api dependency is null");
            }
        });
    }
}

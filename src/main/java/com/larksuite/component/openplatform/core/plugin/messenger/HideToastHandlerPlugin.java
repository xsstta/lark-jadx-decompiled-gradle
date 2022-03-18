package com.larksuite.component.openplatform.core.plugin.messenger;

import android.os.Handler;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25895f;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;

public class HideToastHandlerPlugin extends OPPlugin {

    private static class HideToastHandlerRequest extends C25920a {
        private HideToastHandlerRequest() {
        }
    }

    private static class HideToastHandlerResponse extends C25921b {
        private HideToastHandlerResponse() {
        }
    }

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
    }

    @LKPluginFunction(async = true, eventName = {"hideToast"})
    public void hideToastAsync(LKEvent lKEvent, HideToastHandlerRequest hideToastHandlerRequest, AbstractC25905b bVar, final AbstractC25897h<HideToastHandlerResponse> hVar, AbstractC25895f fVar) {
        final HideToastHandlerResponse hideToastHandlerResponse = new HideToastHandlerResponse();
        fVar.mo92190b().mo92224i("HideToastHandlerPlugin", hideToastHandlerRequest.toString());
        new Handler(getAppContext().getApplicationContext().getMainLooper()).post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.HideToastHandlerPlugin.RunnableC250621 */

            public void run() {
                HideToastHandlerPlugin.this.getApiDependency().mo235059j();
                hVar.callback(hideToastHandlerResponse);
            }
        });
    }
}

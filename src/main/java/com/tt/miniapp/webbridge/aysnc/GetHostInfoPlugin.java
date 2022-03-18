package com.tt.miniapp.webbridge.aysnc;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.container.p1118a.AbstractC24461b;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25891b;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.tt.miniapp.errorcode.ApiCode;
import com.tt.miniapphost.host.HostDependManager;
import org.json.JSONObject;

public class GetHostInfoPlugin extends AbstractC25889a {
    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(async = true, eventName = {"getHostInfo"})
    public void getHostInfoAsync(LKEvent lKEvent) {
        int i;
        int i2;
        View view;
        AbstractC25891b r = lKEvent.mo92151r();
        JSONObject jSONObject = new JSONObject();
        if (r instanceof AbstractC24461b) {
            AbstractC24461b bVar = (AbstractC24461b) r;
            AppBrandLogger.m52830i("GetHostInfoPlugin", "appType:" + bVar.mo87289g().name());
            FrameLayout n = bVar.mo87296n();
            if (n != null) {
                i = n.getWidth();
            } else {
                i = 0;
            }
            if (n != null) {
                i2 = n.getHeight();
            } else {
                i2 = 0;
            }
            try {
                if (HostDependManager.getInst().getFeatureGating("openplatform.blockit.load.fix", false) && !(!(i == 0 || i2 == 0) || n == null || (view = (View) n.getParent()) == null)) {
                    i = view.getWidth();
                    i2 = view.getHeight();
                }
                jSONObject.put("viewWidth", C57582a.m223610b(bVar.mo49749b(), (float) i));
                jSONObject.put("viewHeight", C57582a.m223610b(bVar.mo49749b(), (float) i2));
                Bundle p = bVar.mo87298p();
                if (p != null) {
                    for (String str : p.keySet()) {
                        jSONObject.put(str, p.get(str));
                    }
                }
            } catch (Exception e) {
                AppBrandLogger.m52829e("GetHostInfoPlugin", "getHostInfoAsync->error:", e);
            }
            AppBrandLogger.m52830i("GetHostInfoPlugin", "result: " + jSONObject);
            lKEvent.mo92127a(jSONObject);
            return;
        }
        AppBrandLogger.m52829e("GetHostInfoPlugin", "getHostInfoAsync failed!");
        lKEvent.mo92116a(ApiCode.GENERAL_UNKONW_ERROR.code, new JSONObject());
    }
}

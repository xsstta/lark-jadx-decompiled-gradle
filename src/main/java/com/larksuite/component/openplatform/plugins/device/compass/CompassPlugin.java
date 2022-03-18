package com.larksuite.component.openplatform.plugins.device.compass;

import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;

public class CompassPlugin extends AbstractC25889a {
    private CompassManager mCompassManager;

    public static class CompassRequest extends C25920a {
    }

    public static class CompassResponse extends C25921b {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        CompassManager compassManager = this.mCompassManager;
        if (compassManager != null) {
            compassManager.mo88774e();
        }
        this.mCompassManager = null;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e
    public void addEvents(AbstractC25896g gVar) {
        gVar.mo92192a("onForeGround");
        gVar.mo92192a("onBackGround");
        super.addEvents(gVar);
    }

    public CompassManager getCompassManager(AbstractC25905b bVar) {
        if (this.mCompassManager == null) {
            this.mCompassManager = new CompassManager(bVar);
        }
        return this.mCompassManager;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25889a, com.larksuite.framework.apiplugin.AbstractC25937e, com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        if (checkApplicationForeGround(lKEvent)) {
            return lKEvent.mo92155v();
        }
        return super.handleEvent(lKEvent);
    }

    private boolean checkApplicationForeGround(LKEvent lKEvent) {
        String m = lKEvent.mo92146m();
        m.hashCode();
        if (m.equals("onForeGround")) {
            CompassManager compassManager = this.mCompassManager;
            if (compassManager != null) {
                compassManager.mo88769a();
            }
            return true;
        } else if (!m.equals("onBackGround")) {
            return false;
        } else {
            CompassManager compassManager2 = this.mCompassManager;
            if (compassManager2 != null) {
                compassManager2.mo88771b();
            }
            return true;
        }
    }

    @LKPluginFunction(async = true, eventName = {"stopCompass"})
    public void stopCompass(AbstractC25897h<CompassResponse> hVar, AbstractC25905b bVar) {
        if (!getCompassManager(bVar).mo88773d()) {
            CompassResponse compassResponse = new CompassResponse();
            fillFailedResponse(compassResponse, C25906a.f64078h, C25906a.f64078h.f64117J);
            hVar.callback(compassResponse);
            return;
        }
        hVar.callback(null);
    }

    @LKPluginFunction(async = true, eventName = {"startCompass"})
    public void startCompass(CompassRequest compassRequest, AbstractC25897h<CompassResponse> hVar, AbstractC25905b bVar) {
        CompassManager compassManager = getCompassManager(bVar);
        compassManager.mo88770a(compassRequest.mIsBackground);
        if (!compassManager.mo88772c()) {
            CompassResponse compassResponse = new CompassResponse();
            fillFailedResponse(compassResponse, C25906a.f64078h, C25906a.f64078h.f64117J);
            hVar.callback(compassResponse);
            return;
        }
        hVar.callback(null);
    }
}

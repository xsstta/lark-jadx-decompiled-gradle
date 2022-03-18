package com.larksuite.component.openplatform.plugins.device;

import android.os.Vibrator;
import com.larksuite.component.openplatform.plugins.utils.C25611a;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;

public class VibratePlugin extends AbstractC25889a {

    public static class VibrateResponse extends C25921b {
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    @LKPluginFunction(async = true, eventName = {"vibrateLong"})
    public void vibrateLong(AbstractC25897h<VibrateResponse> hVar, AbstractC25905b bVar) {
        vibrate(hVar, bVar, 400);
    }

    @LKPluginFunction(async = true, eventName = {"vibrateShort"})
    public void vibrateShort(AbstractC25897h<VibrateResponse> hVar, AbstractC25905b bVar) {
        vibrate(hVar, bVar, 30);
    }

    private void vibrate(AbstractC25897h<VibrateResponse> hVar, AbstractC25905b bVar, long j) {
        VibrateResponse vibrateResponse = new VibrateResponse();
        try {
            Vibrator vibrator = (Vibrator) bVar.mo92207a().getSystemService("vibrator");
            if (vibrator == null || !vibrator.hasVibrator()) {
                fillFailedResponse(vibrateResponse, C25906a.f64080j, "vibrator disable");
                hVar.callback(vibrateResponse);
                return;
            }
            vibrator.vibrate(j);
            hVar.callback(null);
        } catch (Exception e) {
            fillFailedResponse(vibrateResponse, C25906a.f64080j, C25611a.m91379a(e));
            hVar.callback(vibrateResponse);
        }
    }
}

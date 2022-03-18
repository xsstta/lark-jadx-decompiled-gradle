package com.larksuite.component.openplatform.core.plugin.device.p1132c;

import android.os.Vibrator;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.c.a */
public class C24803a extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "vibrateLong";
    }

    public C24803a() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        Vibrator vibrator = (Vibrator) AppbrandContext.getInst().getApplicationContext().getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            callbackFail("vibrator disable");
            return;
        }
        vibrator.vibrate(400);
        callbackOk();
    }

    public C24803a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}

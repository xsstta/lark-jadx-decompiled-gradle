package com.larksuite.component.openplatform.core.plugin.device.p1132c;

import android.os.Vibrator;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapphost.AppbrandContext;
import com.tt.option.ext.AbstractC67619e;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.c.b */
public class C24804b extends ApiHandler {
    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return "vibrateShort";
    }

    public C24804b() {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        Vibrator vibrator = (Vibrator) AppbrandContext.getInst().getApplicationContext().getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            callbackFail("vibrator disable");
            return;
        }
        vibrator.vibrate(30);
        callbackOk();
    }

    public C24804b(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }
}

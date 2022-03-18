package com.larksuite.component.openplatform.core.plugin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.apiplugin.LKEvent;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.core.LKTransActivity;
import com.ss.android.lark.optrace.api.ILogger;

public class OPCallTranslateActivityPlugin extends OPPlugin {
    @LKPluginFunction(async = true, eventName = {"callProxyTranslateActivity"})
    public void callProxyActivity(LKEvent lKEvent, ILogger aVar) {
        Bundle b = lKEvent.mo92129b();
        Context l = lKEvent.mo92145l();
        if (l instanceof Activity) {
            Intent intent = new Intent(l, LKTransActivity.class);
            intent.putExtras(b);
            l.startActivity(intent);
            aVar.mo92224i("OPCallTranslateActivity", "call success");
            return;
        }
        aVar.mo92223e("OPCallTranslateActivity", "context invalid");
    }
}

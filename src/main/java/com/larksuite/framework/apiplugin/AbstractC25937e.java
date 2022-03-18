package com.larksuite.framework.apiplugin;

import android.content.Intent;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.entity.LKPluginHandleResult;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25896g;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25899j;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.framework.apiplugin.e */
public abstract class AbstractC25937e implements AbstractC25899j, Comparable<AbstractC25937e> {
    public abstract void addEvents(AbstractC25896g gVar);

    public abstract void onRelease();

    public int priority() {
        return 0;
    }

    public boolean shouldHandleActivityResult() {
        return false;
    }

    public void callBackOk(LKEvent lKEvent) {
        lKEvent.mo92153t();
    }

    @Override // com.larksuite.framework.apiplugin.p1175a.AbstractC25899j
    public LKPluginHandleResult handleEvent(LKEvent lKEvent) {
        return lKEvent.mo92154u();
    }

    public int compareTo(AbstractC25937e eVar) {
        return priority() - eVar.priority();
    }

    public void callBackFail(String str, LKEvent lKEvent) {
        callBackFail(LKApiCode.GENERAL_UNKONW_ERROR.code, str, lKEvent);
    }

    public void callBackFail(int i, String str, LKEvent lKEvent) {
        C25921b bVar = new C25921b();
        bVar.mErrorCode = i;
        bVar.mErrorMessage = str;
        lKEvent.mo92132b(bVar);
    }

    public boolean handleActivityResult(int i, int i2, Intent intent) {
        Log.m165389i("LKPlugin", "requestCode:" + i + " resultCode:" + i2);
        return false;
    }
}

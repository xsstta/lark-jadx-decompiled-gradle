package com.ss.android.lark.littleapp.plugin;

import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import org.json.JSONObject;

public abstract class OfflineFaceBasePlugin extends AbstractC25889a {

    public static class FaceCheckRequest extends C25920a {
    }

    public static class FaceCheckResponse extends C25921b {
    }

    public abstract void reportOtherFailed(AbstractC25905b bVar, int i, String str, JSONObject jSONObject);

    public abstract void reportSuccess(AbstractC25905b bVar);

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void commResultCallback(org.json.JSONObject r12, com.larksuite.framework.apiplugin.p1175a.AbstractC25897h<com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin.FaceCheckResponse> r13, com.larksuite.framework.apiplugin.AbstractC25905b r14) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.littleapp.plugin.OfflineFaceBasePlugin.commResultCallback(org.json.JSONObject, com.larksuite.framework.apiplugin.a.h, com.larksuite.framework.apiplugin.b):void");
    }
}

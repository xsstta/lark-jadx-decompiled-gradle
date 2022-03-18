package com.ss.android.lark.inv.export.util;

import android.content.Context;
import android.os.Bundle;
import com.larksuite.component.dybrid.router.C24258a;
import com.ss.android.lark.log.Log;
import java.util.Map;

/* renamed from: com.ss.android.lark.inv.export.util.l */
public class C40118l {
    /* renamed from: a */
    public static void m159074a(Context context, String str, Map<String, String> map) {
        m159075a(context, str, map, 0);
    }

    /* renamed from: a */
    public static void m159075a(Context context, String str, Map<String, String> map, int i) {
        Log.m165389i("InvitationModule", "start: " + str + ", params: " + map);
        C24258a dynamicRouter = C40147z.m159160a().getDynamicRouter();
        if (dynamicRouter == null) {
            Log.m165383e("InvitationModule", "getDynamicRouter is null");
            return;
        }
        Bundle a = C40108g.m159013a(map);
        if (i <= 0) {
            dynamicRouter.mo86894a(context, str, a);
        } else {
            dynamicRouter.mo86895a(context, str, a, i);
        }
    }
}

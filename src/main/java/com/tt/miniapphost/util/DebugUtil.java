package com.tt.miniapphost.util;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.suite.R;
import com.tt.miniapp.util.C67031e;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.IAppbrandInitializer;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.host.HostDependManager;

public class DebugUtil {

    /* renamed from: com.tt.miniapphost.util.DebugUtil$a */
    public static class C67581a {

        /* renamed from: a */
        public boolean f170405a;
    }

    public static boolean debug() {
        return ContextSingletonInstance.getInstance().debugInstance.f170405a;
    }

    private static boolean shouldDebug(Context context, IAppbrandInitializer iAppbrandInitializer) {
        if (iAppbrandInitializer != null) {
            return iAppbrandInitializer.isDebug();
        }
        return debug();
    }

    public static void updateDebugState(Context context, IAppbrandInitializer iAppbrandInitializer) {
        ContextSingletonInstance.getInstance().debugInstance.f170405a = shouldDebug(context, iAppbrandInitializer);
        AppBrandLogger.setShowMoreLogInfo(ContextSingletonInstance.getInstance().debugInstance.f170405a);
    }

    public static void logOrThrow(String str, Object... objArr) {
        if (!debug() || !C67031e.m261247a()) {
            AppBrandLogger.m52829e(str, objArr);
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(" ");
            sb.append(obj);
        }
        throw new RuntimeException(sb.toString());
    }

    public static void outputError(String str, Object... objArr) {
        if (debug() && C67031e.m261247a()) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(" ");
                sb.append(obj);
            }
            Application applicationContext = AppbrandContext.getInst().getApplicationContext();
            if (applicationContext != null) {
                HostDependManager.getInst().showToast(applicationContext, null, C67590h.m263073a((int) R.string.microapp_m_little_app_debug_info) + sb.toString(), 1, null);
            }
        }
        AppBrandLogger.m52829e(str, objArr);
    }
}

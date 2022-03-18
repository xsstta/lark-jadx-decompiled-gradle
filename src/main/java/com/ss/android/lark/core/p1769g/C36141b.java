package com.ss.android.lark.core.p1769g;

import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.fcm_download.utils.FCMDownloadUtils;
import com.ss.android.lark.fcm_export.IFCMModule;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mira.MiraModule;

/* renamed from: com.ss.android.lark.core.g.b */
public class C36141b {
    /* renamed from: a */
    public static IFCMModule m142101a() {
        boolean z;
        Log.m165389i("FCMModuleProvider", "loadFCMFromLocal");
        if (!C36083a.m141486a().getOpenFeatureDependency().mo133002b() || !MiraModule.m205163c("com.ss.android.lark.plugin.fcm") || MiraModule.m205164d("com.ss.android.lark.plugin.fcm")) {
            z = false;
        } else {
            z = true;
        }
        if (FCMDownloadUtils.m146623a() && z) {
            MiraModule.m205162b("com.ss.android.lark.plugin.fcm");
            MiraModule.m205158a("com.ss.android.lark.plugin.fcm");
            Log.m165389i("FCMModuleProvider", "loadPlugin from local");
        }
        return (IFCMModule) ClaymoreServiceLoader.loadFirstOrNull(IFCMModule.class);
    }
}

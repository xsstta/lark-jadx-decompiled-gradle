package com.ss.android.lark.app.task;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.ApiUtils;

public class InitTTWebViewBasicTask extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        m106278c(context);
    }

    /* renamed from: b */
    public void mo102751b(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            String a = C26252ad.m94992a(context);
            if (!C26252ad.m94993b(context)) {
                WebView.setDataDirectorySuffix(a);
            }
        }
    }

    /* renamed from: c */
    private void m106278c(Context context) {
        C51995b.m201718a("initWebViewSDK basic", null, 1);
        mo102751b(context);
        Log.m165389i("InitTTWebViewBasicTask", "initWebViewSDK basic start");
        ICoreApi iCoreApi = (ICoreApi) ApiUtils.getApi(ICoreApi.class);
        if (iCoreApi.isSandboxProcess(context) || iCoreApi.shouldUseTTWebView()) {
            iCoreApi.initWebViewSDKBasic(context);
            Log.m165389i("InitTTWebViewBasicTask", "initWebViewSDK basic success");
        }
        Log.m165389i("InitTTWebViewBasicTask", "initWebViewSDK basic end");
        C51995b.m201714a();
    }
}

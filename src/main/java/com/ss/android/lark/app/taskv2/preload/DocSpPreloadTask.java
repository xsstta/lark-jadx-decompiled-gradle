package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;

public class DocSpPreloadTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        context.getSharedPreferences("WebViewBytedancePrefs", 0);
        context.getSharedPreferences("netConfig", 0);
        context.getSharedPreferences("debug_config", 0);
        context.getSharedPreferences("privatizationConfig", 0);
    }
}

package com.ss.android.lark.app.task;

import android.content.Context;
import android.os.Process;
import com.larksuite.framework.launch.task.AsyncLaunchTask;

public class PreloadSharePrefsTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        int threadPriority = Process.getThreadPriority(Process.myTid());
        Process.setThreadPriority(-1);
        context.getSharedPreferences("plugins_PACM.temp", 0);
        context.getSharedPreferences("com.google.android.gms.appid", 0);
        context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        context.getSharedPreferences("multi_process_config", 0);
        context.getSharedPreferences("push_multi_process_config", 0);
        context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        context.getSharedPreferences("anr_monitor_table", 0);
        context.getSharedPreferences("CookiePersistence_" + context.getPackageName(), 0);
        context.getSharedPreferences("applog_stats", 0);
        context.getSharedPreferences("custom_channels", 0);
        context.getSharedPreferences("siginsdk_pref", 0);
        context.getSharedPreferences("traffic_monitor_info", 0);
        context.getSharedPreferences("Cookies_Prefs", 0);
        context.getSharedPreferences("WebViewChromiumPrefs", 0);
        context.getSharedPreferences("proxy", 0);
        context.getSharedPreferences("debug_config", 0);
        context.getSharedPreferences("deviceinfo", 0);
        Process.setThreadPriority(threadPriority);
    }
}

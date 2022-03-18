package com.ss.android.lark.app.taskv2.preload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import java.util.TimeZone;
import me.ele.lancet.base.annotations.Skip;

public class UpdateTimeZoneTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 6;
    }

    /* renamed from: b */
    private static void m106896b(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        try {
            m106895a(context.getApplicationContext(), new BroadcastReceiver() {
                /* class com.ss.android.lark.app.taskv2.preload.UpdateTimeZoneTask.C290751 */

                public void onReceive(Context context, Intent intent) {
                    if (intent != null && "android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction())) {
                        String id = TimeZone.getDefault().getID();
                        Log.m165389i("updateTimeZone", " onTimeZoneChanged : " + id);
                        ((IIMApi) ApiUtils.getApi(IIMApi.class)).updateTimeZone(id);
                    }
                }
            }, intentFilter);
        } catch (Exception e) {
            e.printStackTrace();
            Log.m165383e("UpdateTimeZoneTask", "registerReceiver Intent.ACTION_TIMEZONE_CHANGED fail " + e.getMessage());
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        String id = TimeZone.getDefault().getID();
        Log.m165389i("updateTimeZone", "UpdateTimeZoneTask : " + id);
        ((IIMApi) ApiUtils.getApi(IIMApi.class)).updateTimeZone(id);
        m106896b(context);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m106895a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}

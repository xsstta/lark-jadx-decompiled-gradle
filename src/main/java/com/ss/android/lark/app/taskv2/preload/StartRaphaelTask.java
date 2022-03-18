package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import android.preference.PreferenceManager;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.upload.AbstractC3899e;
import com.bytedance.raphael.RaphaelManager;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;

public class StartRaphaelTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 60;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(final Context context) {
        Log.m165389i("RAPHAEL", "StartRaphaelTask.execute " + context);
        String a = C26246a.m94977a(context);
        int b = C26246a.m94978b(context);
        int c = C26246a.m94979c(context);
        Log.m165389i("RAPHAEL", "versionName:" + a + ", appVersionCode:" + b + ", updateVersionCode:" + c);
        if (c >= 300000 && c % 100 < 50) {
            boolean a2 = C37239a.m146648b().mo136952a("feature_native_heap_monitor_raphael", false);
            Log.m165389i("RAPHAEL", "monitorFg:" + a2);
            if (a2) {
                boolean z = PreferenceManager.getDefaultSharedPreferences(context).getBoolean("RAPHAEL", true);
                Log.m165389i("RAPHAEL", "monitorSp:" + z);
                if (z) {
                    AbstractC3899e.m16162a(new AbstractC3899e() {
                        /* class com.ss.android.lark.app.taskv2.preload.StartRaphaelTask.C290651 */

                        @Override // com.bytedance.crash.upload.AbstractC3899e
                        /* renamed from: a */
                        public void mo15542a(CrashType crashType, AbstractC3899e.C3902a aVar) {
                            String str;
                            if (aVar == null) {
                                str = "";
                            } else {
                                str = aVar.mo15546c();
                            }
                            Log.m165389i("RAPHAEL", "crashType:" + crashType + ", crashStack:" + str);
                            if (str.contains("libraphael.so")) {
                                PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("RAPHAEL", false).commit();
                            }
                        }
                    });
                    RaphaelManager.start(context, true);
                }
            }
        }
    }
}

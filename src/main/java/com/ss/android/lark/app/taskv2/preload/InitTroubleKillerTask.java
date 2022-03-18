package com.ss.android.lark.app.taskv2.preload;

import android.app.Application;
import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.eetroublebase.C36960a;
import com.ss.android.lark.eetroublebase.Log;
import com.ss.android.lark.eetroublecapture.C36969b;
import com.ss.android.lark.eetroublepet.TroublePETTracker;
import com.ss.android.lark.statistics.Statistics;
import org.json.JSONObject;

public class InitTroubleKillerTask extends AsyncLaunchTask {
    /* renamed from: a */
    public void mo103082a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("file_path", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Statistics.sendEvent("tk_write_capture_file", jSONObject);
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Context context2;
        if (context instanceof Application) {
            context2 = context;
        } else {
            context2 = context.getApplicationContext();
        }
        Application application = (Application) context2;
        TroublePETTracker.init(application, new TroublePETTracker.AbstractC36999a() {
            /* class com.ss.android.lark.app.taskv2.preload.InitTroubleKillerTask.C290491 */

            @Override // com.ss.android.lark.eetroublepet.TroublePETTracker.AbstractC36999a
            /* renamed from: a */
            public boolean mo103083a() {
                return C36960a.m145914a().mo136417c();
            }
        });
        C36969b.m145956a(application, C36960a.m145917b().mo136435c(false).mo136428a(true).mo136425a(20).mo136427a("2/60").mo136431b(5).mo136429a("MainActivity", "ChatWindowActivity").mo136433b(true).mo136432b(C26252ad.m94994c(context)).mo136434c(C26252ad.m94992a(context)).mo136437d(C26252ad.m94993b(context)).mo136436d("com.ss.android.lark.launcher").mo136426a(new Log.AbstractC36959a() {
            /* class com.ss.android.lark.app.taskv2.preload.InitTroubleKillerTask.C290502 */

            @Override // com.ss.android.lark.eetroublebase.Log.AbstractC36959a
            /* renamed from: a */
            public void mo103084a(String str, String str2) {
                com.ss.android.lark.log.Log.m165389i(str, str2);
            }

            @Override // com.ss.android.lark.eetroublebase.Log.AbstractC36959a
            /* renamed from: b */
            public void mo103087b(String str, String str2) {
                com.ss.android.lark.log.Log.m165397w(str, str2);
            }

            @Override // com.ss.android.lark.eetroublebase.Log.AbstractC36959a
            /* renamed from: a */
            public void mo103086a(String str, String str2, Throwable th) {
                com.ss.android.lark.log.Log.m165383e(str, str2);
            }

            @Override // com.ss.android.lark.eetroublebase.Log.AbstractC36959a
            /* renamed from: a */
            public void mo103085a(String str, String str2, String str3) {
                InitTroubleKillerTask initTroubleKillerTask = InitTroubleKillerTask.this;
                initTroubleKillerTask.mo103082a(str + str2);
                com.ss.android.lark.log.Log.writeFile(str, str2, str3, true);
            }
        }).mo136430a());
    }
}

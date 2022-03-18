package com.ss.android.lark.app.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.platform.horae.AbstractC20367b;
import com.bytedance.platform.horae.C20342a;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.app.util.FileFgCenter;
import com.ss.android.lark.log.Log;
import java.util.HashSet;

public class DoubleThreadQuickenInit extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: e */
    public String mo92547e() {
        return "DoubleThreadQuickenInit";
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (FileFgCenter.m106955b().mo103171a("lark.android.double.thread.quicken")) {
            m106060b(context);
        }
    }

    /* renamed from: b */
    private void m106060b(Context context) {
        HashSet hashSet = new HashSet();
        hashSet.add("androidx.work.impl.background.systemalarm.SystemAlarmService");
        C20342a.C20344a aVar = new C20342a.C20344a();
        aVar.mo68648a(false).mo68650b(false).mo68646a("double_turbo_quicken_engine").mo68647a(hashSet).mo68645a(new AbstractC20367b() {
            /* class com.ss.android.lark.app.task.DoubleThreadQuickenInit.C289321 */

            @Override // com.bytedance.platform.horae.AbstractC20367b
            /* renamed from: a */
            public void mo68704a() {
                Log.m165389i("DoubleThreadQuicken", "init Success");
            }

            @Override // com.bytedance.platform.horae.AbstractC20367b
            /* renamed from: a */
            public void mo68707a(Throwable th) {
                Log.m165387e("DoubleThreadQuicken", th, true);
            }

            @Override // com.bytedance.platform.horae.AbstractC20367b
            /* renamed from: a */
            public void mo68705a(int i) {
                Log.m165389i("DoubleThreadQuicken", "AsyncStart time:" + i);
            }

            @Override // com.bytedance.platform.horae.AbstractC20367b
            /* renamed from: a */
            public void mo68706a(String str, int i, long j) {
                Log.m165389i("DoubleThreadQuicken", "components:" + str + " id:" + i + " duration:" + j);
            }
        });
        if (context instanceof Application) {
            aVar.mo68649a().mo68644a((Application) context);
        } else {
            Log.m165383e("DoubleThreadQuicken", "context is not Application");
        }
    }
}

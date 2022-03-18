package com.ss.android.lark.app.task.initor;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.monitor.C48248r;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public class MonitorModuleDependencyInitor {
    /* renamed from: a */
    public static void m106409a(Context context) {
        C48248r.m190384a(new C48248r.AbstractC48249a() {
            /* class com.ss.android.lark.app.task.initor.MonitorModuleDependencyInitor.C289971 */

            @Override // com.ss.android.lark.monitor.C48248r.AbstractC48249a
            /* renamed from: b */
            public JSONObject mo102825b() {
                return CoreThreadPool.collectCoreThreadPoolMetric();
            }

            @Override // com.ss.android.lark.monitor.C48248r.AbstractC48249a
            /* renamed from: a */
            public ScheduledExecutorService mo102824a() {
                return CoreThreadPool.getDefault().getScheduleThreadPool();
            }
        });
    }
}

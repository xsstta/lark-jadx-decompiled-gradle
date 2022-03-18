package com.ss.android.lark.app.task.initor;

import android.content.Context;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.C28472a;
import java.util.concurrent.ScheduledExecutorService;

public class AudioModuleDependencyInitor {
    /* renamed from: a */
    public static void m106341a(final Context context) {
        C28472a.m104337a(new C28472a.AbstractC28473a() {
            /* class com.ss.android.lark.app.task.initor.AudioModuleDependencyInitor.C289831 */

            @Override // com.ss.android.lark.C28472a.AbstractC28473a
            /* renamed from: b */
            public Context mo34074b() {
                return context;
            }

            @Override // com.ss.android.lark.C28472a.AbstractC28473a
            /* renamed from: a */
            public ScheduledExecutorService mo34073a() {
                return CoreThreadPool.getDefault().getScheduleThreadPool();
            }
        });
    }
}

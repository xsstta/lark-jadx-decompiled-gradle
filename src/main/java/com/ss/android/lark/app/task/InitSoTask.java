package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57840j;
import java.util.concurrent.TimeUnit;

public class InitSoTask extends AbstractLaunchTask {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m106271a(Boolean bool) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m106272b(Boolean bool) throws Exception {
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(final Context context) {
        super.mo43817a(context);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerBootMileStoneListener(new AbstractC44544a() {
            /* class com.ss.android.lark.app.task.InitSoTask.C289731 */

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102547a(String str) {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: b */
            public void mo102548b() {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102546a() {
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unregisterBootMileStoneListener(this);
                InitSoTask.this.mo102750b(context);
            }
        });
    }

    /* renamed from: b */
    public void mo102750b(Context context) {
        C57840j.m224506b().mo196190b("ve", "vc").delay(0, TimeUnit.SECONDS).subscribe();
        C57840j.m224506b().mo196190b("doc").delay(3, TimeUnit.SECONDS).subscribe($$Lambda$InitSoTask$IFEOswEeDLZm0tRVpRHYo2Nvgw.INSTANCE);
        C57840j.m224506b().mo196190b("smartprogram", "videoplayer").delay(5, TimeUnit.SECONDS).subscribe($$Lambda$InitSoTask$HdtDoUG9tU0BLn25Y5MTW2uXXvY.INSTANCE);
    }
}

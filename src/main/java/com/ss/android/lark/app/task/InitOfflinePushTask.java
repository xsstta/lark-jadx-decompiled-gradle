package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.platform.offlinepush.C51894a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;

public class InitOfflinePushTask extends AbstractLaunchTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(InitOkHttpTask.class);
        return arrayList;
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(final Context context) {
        final C51894a.C51895a aVar = new C51894a.C51895a();
        aVar.mo178072b(context);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).registerBootMileStoneListener(new AbstractC44544a() {
            /* class com.ss.android.lark.app.task.InitOfflinePushTask.C289681 */

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102546a() {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: b */
            public void mo102548b() {
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102547a(String str) {
                aVar.mo178073d(context);
                ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).unregisterBootMileStoneListener(this);
            }
        });
    }
}

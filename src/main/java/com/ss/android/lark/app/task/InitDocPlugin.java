package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.platform.statistics.p2502b.C51959a;
import com.ss.android.lark.utils.ApiUtils;
import java.util.ArrayList;
import java.util.List;

public class InitDocPlugin extends AbstractLaunchTask {
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
    public void mo43817a(Context context) {
        C51959a.m201540i();
        ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).initDocPlugin(context);
        C51959a.m201541j();
    }
}

package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.meego_api.IMeegoApi;
import com.ss.android.lark.utils.ApiUtils;

public class InitMeegoTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: b */
    public int mo43824b() {
        return 3;
    }

    @Override // com.larksuite.framework.launch.task.AsyncLaunchTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: d */
    public boolean mo92546d() {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m106210g() {
        ((IMeegoApi) ApiUtils.getApi(IMeegoApi.class)).initData();
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        CoreThreadPool.getDefault().getCachedThreadPool().submit($$Lambda$InitMeegoTask$622XFS2oAtjq9K20RgqjYa2i0Kc.INSTANCE);
    }
}

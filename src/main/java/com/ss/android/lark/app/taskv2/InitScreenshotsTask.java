package com.ss.android.lark.app.taskv2;

import android.app.Application;
import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.screen.p2581a.p2582a.C53226d;

public class InitScreenshotsTask extends AbstractLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        C53226d.m205872a().mo181686a((Application) context);
    }
}

package com.ss.android.lark.app.taskv2.subordinate;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.app.task.PreloadModuleTask;

public class PrefetchTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        new PreloadModuleTask.BfdIssueTracker().mo102759a(context);
    }
}

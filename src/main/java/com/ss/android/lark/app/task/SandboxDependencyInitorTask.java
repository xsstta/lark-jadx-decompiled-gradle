package com.ss.android.lark.app.task;

import android.content.Context;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.app.task.initor.BaseModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.HotfixModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.MonitorModuleDependencyInitor;
import com.ss.android.lark.app.task.initor.TeaAgentModuleDependencyInitor;

public class SandboxDependencyInitorTask extends AsyncLaunchTask {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        MonitorModuleDependencyInitor.m106409a(context);
        TeaAgentModuleDependencyInitor.m106643a(context);
        BaseModuleDependencyInitor.m106344a(context);
        HotfixModuleDependencyInitor.m106400a(context);
    }
}

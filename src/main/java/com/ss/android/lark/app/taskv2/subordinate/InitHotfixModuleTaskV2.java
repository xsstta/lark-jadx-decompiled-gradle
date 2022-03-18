package com.ss.android.lark.app.taskv2.subordinate;

import android.content.Context;
import com.larksuite.framework.launch.task.ILaunchTask;
import com.ss.android.lark.app.task.InitHotfixModuleTask;
import com.ss.android.lark.app.task.initor.HotfixModuleDependencyInitor;
import java.util.List;

public class InitHotfixModuleTaskV2 extends InitHotfixModuleTask {
    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask
    /* renamed from: a */
    public List<Class<? extends ILaunchTask>> mo43818a() {
        return null;
    }

    @Override // com.ss.android.lark.app.task.InitHotfixModuleTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        HotfixModuleDependencyInitor.m106400a(context);
        super.mo43817a(context);
    }
}

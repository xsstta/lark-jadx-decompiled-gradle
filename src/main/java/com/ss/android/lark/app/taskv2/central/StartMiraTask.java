package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.mira.MiraModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/app/taskv2/central/StartMiraTask;", "Lcom/larksuite/framework/launch/task/AbstractLaunchTask;", "", "()V", "execute", "", "context", "Landroid/content/Context;", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class StartMiraTask extends AbstractLaunchTask<Object> {
    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        MiraModule.f130883a.mo180973a();
    }
}

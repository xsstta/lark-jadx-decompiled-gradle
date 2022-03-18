package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.ss.android.lark.sdk.C53254m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/app/taskv2/central/InitRustSdkTaskForSimple;", "Lcom/larksuite/framework/launch/task/AbstractLaunchTask;", "", "()V", "execute", "", "context", "Landroid/content/Context;", "setRustDependency", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitRustSdkTaskForSimple extends AbstractLaunchTask<Object> {
    /* renamed from: g */
    private final void m106727g() {
        C53254m.m205924a(new InitRustSdkTaskForSimple$setRustDependency$1());
        C53254m.m205921a(new InitRustSdkTaskForSimple$setRustDependency$2());
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        m106727g();
    }
}

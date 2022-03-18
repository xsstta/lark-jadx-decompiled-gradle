package com.ss.android.lark.app.taskv2.central;

import android.content.Context;
import com.ss.android.lark.app.task.InitBaseFeatureTaskForSimple;
import com.ss.android.lark.app.task.initor.BaseModuleDependencyInitorForSimple;
import com.ss.android.lark.app.task.initor.PhotoPickerModuleDependencyInitorForSimple;
import com.ss.android.lark.app.task.initor.WidgetModuleDependencyInitor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/app/taskv2/central/InitUIComponentTaskForSimple;", "Lcom/ss/android/lark/app/task/InitBaseFeatureTaskForSimple;", "()V", "execute", "", "context", "Landroid/content/Context;", "lark-launcher_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InitUIComponentTaskForSimple extends InitBaseFeatureTaskForSimple {
    @Override // com.ss.android.lark.app.task.InitBaseFeatureTaskForSimple, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        BaseModuleDependencyInitorForSimple.m106365a(context);
        WidgetModuleDependencyInitor.m106670a(context);
        PhotoPickerModuleDependencyInitorForSimple.m106465a(context);
        super.mo43817a(context);
    }
}

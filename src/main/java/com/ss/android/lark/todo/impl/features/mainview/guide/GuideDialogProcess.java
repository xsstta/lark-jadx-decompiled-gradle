package com.ss.android.lark.todo.impl.features.mainview.guide;

import android.content.Context;
import com.ss.android.lark.util.share_preference.C57744a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/mainview/guide/GuideDialogProcess;", "", "()V", "KEY_TODO_GUIDE_DIALOG", "", "showGuideDialog", "", "context", "Landroid/content/Context;", "createdTodoGuid", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.a.b */
public final class GuideDialogProcess {

    /* renamed from: a */
    public static final GuideDialogProcess f140225a = new GuideDialogProcess();

    private GuideDialogProcess() {
    }

    /* renamed from: a */
    public final void mo193101a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "createdTodoGuid");
        if (!C57744a.m224104a().getBoolean("key_todo_guide_dialog")) {
            new GuideDialog(context, str).mo193098a();
            C57744a.m224104a().putBoolean("key_todo_guide_dialog", true);
        }
    }
}

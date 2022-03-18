package com.ss.android.lark.todo.impl.features.messagecard.listener;

import android.content.Context;
import android.view.View;
import com.bytedance.lark.pb.todo.v1.TodoListView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.dependency.idependency.IMainModuleDependency;
import com.ss.android.lark.todo.impl.features.common.listener.DebounceClickListener;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/listener/EnterTodoTabClickListener;", "Lcom/ss/android/lark/todo/impl/features/common/listener/DebounceClickListener;", "()V", "doClick", "", "v", "Landroid/view/View;", "Companion", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.e.a */
public final class EnterTodoTabClickListener extends DebounceClickListener {

    /* renamed from: b */
    public static final Companion f140911b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/listener/EnterTodoTabClickListener$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.e.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.todo.impl.features.common.listener.DebounceClickListener
    /* renamed from: a */
    public void mo191942a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        Log.m165389i("EnterTodoTabClickListener", LogMessageUtil.f139260a.mo191765a("clickEnterTodoTab"));
        TodoHitPoint.m221758k("remind");
        TodoGeneralHitPoint.f141070a.mo194198e();
        if (TodoDependencyHolder.f139242a.mo191731b().mo191935h()) {
            IMainModuleDependency mainModuleDependency = TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency();
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "v.context");
            mainModuleDependency.mo145415a(context, TodoListView.Type.ASSIGN_TO_ME, true);
            return;
        }
        IMainModuleDependency mainModuleDependency2 = TodoDependencyHolder.f139242a.mo191730a().mainModuleDependency();
        Context context2 = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "v.context");
        mainModuleDependency2.mo145417b(context2);
    }
}

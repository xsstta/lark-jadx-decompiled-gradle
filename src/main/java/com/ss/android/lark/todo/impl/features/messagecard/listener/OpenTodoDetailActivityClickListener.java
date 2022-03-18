package com.ss.android.lark.todo.impl.features.messagecard.listener;

import android.view.View;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.todo.impl.features.common.listener.DebounceClickListener;
import com.ss.android.lark.todo.impl.utils.LogMessageUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/listener/OpenTodoDetailActivityClickListener;", "Lcom/ss/android/lark/todo/impl/features/common/listener/DebounceClickListener;", "enterDetailListener", "Lcom/ss/android/lark/todo/impl/features/messagecard/listener/OpenTodoDetailActivityClickListener$ITodoCardEnterDetailListener;", "(Lcom/ss/android/lark/todo/impl/features/messagecard/listener/OpenTodoDetailActivityClickListener$ITodoCardEnterDetailListener;)V", "doClick", "", "v", "Landroid/view/View;", "Companion", "ITodoCardEnterDetailListener", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.e.c */
public final class OpenTodoDetailActivityClickListener extends DebounceClickListener {

    /* renamed from: b */
    public static final Companion f140913b = new Companion(null);

    /* renamed from: c */
    private final ITodoCardEnterDetailListener f140914c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/listener/OpenTodoDetailActivityClickListener$ITodoCardEnterDetailListener;", "", "onEnterDetailClicked", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.e.c$b */
    public interface ITodoCardEnterDetailListener {
        /* renamed from: a */
        void mo193920a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/listener/OpenTodoDetailActivityClickListener$Companion;", "", "()V", "TAG", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.messagecard.e.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OpenTodoDetailActivityClickListener(ITodoCardEnterDetailListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "enterDetailListener");
        this.f140914c = bVar;
    }

    @Override // com.ss.android.lark.todo.impl.features.common.listener.DebounceClickListener
    /* renamed from: a */
    public void mo191942a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        Log.m165389i("OpenTodoDetailActivityClickListener", LogMessageUtil.f139260a.mo191765a("clickEnterDetail"));
        this.f140914c.mo193920a();
    }
}

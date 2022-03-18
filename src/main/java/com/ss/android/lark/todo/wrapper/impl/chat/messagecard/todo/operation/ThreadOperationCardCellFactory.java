package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.operation;

import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoContentVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/operation/ThreadOperationCardCellFactory;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/operation/TodoOperationCardCellFactory;", "()V", "createMessageCell", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/operation/TodoOperationCardMessageCell;", "chatContext", "Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;", "openCellCallback", "Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/vo/TodoContentVO;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.c.c.a */
public final class ThreadOperationCardCellFactory extends TodoOperationCardCellFactory {
    @Override // com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.operation.TodoOperationCardCellFactory
    /* renamed from: a */
    public TodoOperationCardMessageCell mo120404b(IMessageContext aVar, IOpenCellCallback<TodoContentVO> bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "chatContext");
        Intrinsics.checkParameterIsNotNull(bVar, "openCellCallback");
        return new TodoOperationCardMessageCell(aVar, true, bVar);
    }
}

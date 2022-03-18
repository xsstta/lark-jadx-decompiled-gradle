package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.comment;

import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCellFactory;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.TodoMsgConverter;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoContentVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0005¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/comment/TodoCommentCellFactory;", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCellFactory;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/vo/TodoContentVO;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/TodoMsgConverter;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/comment/TodoCommentMessageCell;", "()V", "createMessageCell", "chatContext", "Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;", "openCellCallback", "Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;", "getVOConverter", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.c.a.b */
public class TodoCommentCellFactory implements IOpenMessageCellFactory<TodoContentVO, TodoMsgConverter, TodoCommentMessageCell> {
    /* renamed from: a */
    public TodoMsgConverter mo120405b() {
        return new TodoMsgConverter();
    }

    /* renamed from: a */
    public TodoCommentMessageCell mo120404b(IMessageContext aVar, IOpenCellCallback<TodoContentVO> bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "chatContext");
        Intrinsics.checkParameterIsNotNull(bVar, "openCellCallback");
        return new TodoCommentMessageCell(aVar, bVar);
    }
}

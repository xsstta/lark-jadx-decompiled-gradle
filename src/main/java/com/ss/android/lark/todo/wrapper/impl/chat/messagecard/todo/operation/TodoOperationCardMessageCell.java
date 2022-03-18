package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.operation;

import com.ss.android.lark.chat.export.ui.message.IMessageContext;
import com.ss.android.lark.chat.export.ui.message.IOpenCellCallback;
import com.ss.android.lark.chat.export.ui.message.IOpenMessageCell;
import com.ss.android.lark.chat.export.ui.message.style.IOpenBubbleStyleProvider;
import com.ss.android.lark.todo.impl.features.messagecard.IMessageCellFactory;
import com.ss.android.lark.todo.impl.features.messagecard.operation.TodoOperationCardCellBinder;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.TodoBaseMessageCell;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoContentVO;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoOperationContentVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004B\u001d\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\tB#\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/operation/TodoOperationCardMessageCell;", "Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCell;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/vo/TodoContentVO;", "Lcom/ss/android/lark/chat/export/ui/message/style/IOpenBubbleStyleProvider;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/TodoBaseMessageCell;", "messageContext", "Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;", "openCellCallback", "Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;", "(Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;)V", "mMessageContext", "isShowBorder", "", "mOpenCellCallback", "(Lcom/ss/android/lark/chat/export/ui/message/IMessageContext;ZLcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;)V", "mMessageCellBinder", "Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;", "getMMessageCellBinder", "()Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;", "setMMessageCellBinder", "(Lcom/ss/android/lark/todo/impl/features/messagecard/IMessageCellFactory;)V", "getMessageClass", "Ljava/lang/Class;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.c.c.c */
public final class TodoOperationCardMessageCell extends TodoBaseMessageCell implements IOpenMessageCell<TodoContentVO>, IOpenBubbleStyleProvider<TodoContentVO> {

    /* renamed from: d */
    private IMessageCellFactory f139207d;

    @Override // com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.TodoBaseMessageCell, com.ss.android.lark.chat.export.ui.message.IOpenMessageCell
    /* renamed from: a */
    public Class<TodoContentVO> mo120409a() {
        return TodoOperationContentVO.class;
    }

    @Override // com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo.TodoBaseMessageCell
    /* renamed from: b */
    public IMessageCellFactory mo191696b() {
        return this.f139207d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TodoOperationCardMessageCell(IMessageContext aVar, IOpenCellCallback<TodoContentVO> bVar) {
        this(aVar, false, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "messageContext");
        Intrinsics.checkParameterIsNotNull(bVar, "openCellCallback");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoOperationCardMessageCell(IMessageContext aVar, boolean z, IOpenCellCallback<TodoContentVO> bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "mMessageContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOpenCellCallback");
        this.f139207d = new TodoOperationCardCellBinder(z);
    }
}

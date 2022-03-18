package com.ss.android.lark.todo.impl.features.messagecard.parser;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Content;
import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/messagecard/parser/TodoLarkMessageParser;", "", "()V", "getTodoInternalContent", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "entity", "Lcom/bytedance/lark/pb/basic/v1/Entity;", "pbContent", "Lcom/bytedance/lark/pb/basic/v1/Content;", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.messagecard.f.a */
public final class TodoLarkMessageParser {

    /* renamed from: a */
    public static final TodoLarkMessageParser f140915a = new TodoLarkMessageParser();

    private TodoLarkMessageParser() {
    }

    /* renamed from: a */
    public final TodoContent mo193948a(C14928Entity entity, Content content) {
        if (!(entity == null || content == null)) {
            TodoContent todoContent = new TodoContent();
            TodoOperationContent todoOperationContent = content.todo_operation_content;
            if (todoOperationContent != null) {
                Intrinsics.checkExpressionValueIsNotNull(todoOperationContent, "pbContent.todo_operation_content ?: return null");
                if (todoOperationContent.operation_type == TodoOperationContent.Type.UNKNOWN) {
                    return null;
                }
                todoContent.setCardContentData(todoOperationContent);
                todoContent.setMessageType(TodoContent.TodoMessageType.TODO_MESSAGE_CARD);
                return todoContent;
            }
        }
        return null;
    }
}

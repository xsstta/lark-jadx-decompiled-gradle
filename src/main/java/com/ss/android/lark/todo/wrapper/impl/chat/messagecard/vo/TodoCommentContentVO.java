package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo;

import com.ss.android.lark.chat.entity.message.content.TodoContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/vo/TodoCommentContentVO;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/vo/TodoContentVO;", "content", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "(Lcom/ss/android/lark/chat/entity/message/content/TodoContent;)V", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.d.a */
public final class TodoCommentContentVO extends TodoContentVO {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoCommentContentVO(TodoContent todoContent) {
        super(todoContent);
        Intrinsics.checkParameterIsNotNull(todoContent, "content");
    }
}

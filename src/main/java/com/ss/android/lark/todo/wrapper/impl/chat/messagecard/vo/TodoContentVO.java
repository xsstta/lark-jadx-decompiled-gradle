package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo;

import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/vo/TodoContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/TodoContent;)V", "canReply", "", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.d.b */
public class TodoContentVO extends ContentVO<TodoContent> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoContentVO(TodoContent todoContent) {
        super(todoContent);
        Intrinsics.checkParameterIsNotNull(todoContent, "content");
    }
}

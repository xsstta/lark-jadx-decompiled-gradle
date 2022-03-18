package com.ss.android.lark.todo.wrapper.api;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Content;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/api/ITodoParser;", "", "getTodoContent", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "entity", "Lcom/bytedance/lark/pb/basic/v1/Entity;", "pbContent", "Lcom/bytedance/lark/pb/basic/v1/Content;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.a.d */
public interface ITodoParser {
    /* renamed from: a */
    TodoContent mo191676a(C14928Entity entity, Content content);
}

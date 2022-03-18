package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.parser;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Content;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.todo.impl.features.messagecard.parser.TodoLarkMessageParser;
import com.ss.android.lark.todo.wrapper.api.ITodoParser;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/parser/TodoEntityParser;", "Lcom/ss/android/lark/todo/wrapper/api/ITodoParser;", "()V", "getTodoContent", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "entity", "Lcom/bytedance/lark/pb/basic/v1/Entity;", "pbContent", "Lcom/bytedance/lark/pb/basic/v1/Content;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.a.a */
public final class TodoEntityParser implements ITodoParser {
    @Override // com.ss.android.lark.todo.wrapper.api.ITodoParser
    /* renamed from: a */
    public TodoContent mo191676a(C14928Entity entity, Content content) {
        return TodoLarkMessageParser.f140915a.mo193948a(entity, content);
    }
}

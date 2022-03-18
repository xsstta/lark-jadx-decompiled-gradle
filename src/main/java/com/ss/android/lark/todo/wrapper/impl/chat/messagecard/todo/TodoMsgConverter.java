package com.ss.android.lark.todo.wrapper.impl.chat.messagecard.todo;

import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.TodoContent;
import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoCommentContentVO;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoContentVO;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoDailyRemindContentVO;
import com.ss.android.lark.todo.wrapper.impl.chat.messagecard.vo.TodoOperationContentVO;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/todo/TodoMsgConverter;", "Lcom/ss/android/lark/chat/export/vo/IOpenMsgVOConverter;", "Lcom/ss/android/lark/todo/wrapper/impl/chat/messagecard/vo/TodoContentVO;", "()V", "convert", "messageInfo", "Lcom/ss/android/lark/chat/export/entity/message/OpenMessageInfo;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/export/entity/message/MessageType;", "isCommentType", "", "Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent$Type;", "todo-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.c.b */
public final class TodoMsgConverter implements IOpenMsgVOConverter<TodoContentVO> {
    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: a */
    public MessageType mo120418a() {
        return MessageType.TODO;
    }

    /* renamed from: a */
    private final boolean m219421a(TodoOperationContent.Type type) {
        return CollectionsKt.listOf((Object[]) new TodoOperationContent.Type[]{TodoOperationContent.Type.CREATE_COMMENT, TodoOperationContent.Type.REPLY_COMMENT, TodoOperationContent.Type.REACT_COMMENT}).contains(type);
    }

    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: c */
    public CharSequence mo120420c(OpenMessageInfo cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageInfo");
        if (((TodoContent) cVar.getMessage().getContent()).getMessageType() == TodoContent.TodoMessageType.TODO_MESSAGE_CARD) {
            return ResUtil.f139261a.mo191781c(R.string.Todo_Task_MsgTypeTask);
        }
        return "";
    }

    /* renamed from: a */
    public TodoContentVO mo120419b(OpenMessageInfo cVar) {
        TodoOperationContent.Type type;
        Intrinsics.checkParameterIsNotNull(cVar, "messageInfo");
        TodoContent todoContent = (TodoContent) cVar.getMessage().getContent();
        if (todoContent.getMessageType() != TodoContent.TodoMessageType.TODO_MESSAGE_CARD) {
            return null;
        }
        TodoOperationContent cardContentData = todoContent.getCardContentData();
        if (cardContentData == null || (type = cardContentData.operation_type) == null) {
            type = TodoOperationContent.Type.UNKNOWN;
        }
        if (m219421a(type)) {
            return new TodoCommentContentVO(todoContent);
        }
        if (type == TodoOperationContent.Type.DAILY_REMIND) {
            return new TodoDailyRemindContentVO(todoContent);
        }
        return new TodoOperationContentVO(todoContent);
    }
}

package com.ss.android.lark.chat.entity.message.content;

import com.bytedance.lark.pb.basic.v1.TodoOperationContent;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/TodoContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "cardContentData", "Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;", "getCardContentData", "()Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;", "setCardContentData", "(Lcom/bytedance/lark/pb/basic/v1/TodoOperationContent;)V", "messageType", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent$TodoMessageType;", "getMessageType", "()Lcom/ss/android/lark/chat/entity/message/content/TodoContent$TodoMessageType;", "setMessageType", "(Lcom/ss/android/lark/chat/entity/message/content/TodoContent$TodoMessageType;)V", "TodoMessageType", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TodoContent extends Content {
    private TodoOperationContent cardContentData;
    private TodoMessageType messageType = TodoMessageType.UNKNOWN;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/TodoContent$TodoMessageType;", "", "number", "", "(Ljava/lang/String;II)V", "getNumber", "()I", GrsBaseInfo.CountryCodeSource.UNKNOWN, "TODO_MESSAGE_CARD", "Companion", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum TodoMessageType {
        UNKNOWN(0),
        TODO_MESSAGE_CARD(1);
        
        public static final Companion Companion = new Companion(null);
        private final int number;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/TodoContent$TodoMessageType$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/chat/entity/message/content/TodoContent$TodoMessageType;", "value", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.entity.message.content.TodoContent$TodoMessageType$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final int getNumber() {
            return this.number;
        }

        private TodoMessageType(int i) {
            this.number = i;
        }
    }

    public final TodoOperationContent getCardContentData() {
        return this.cardContentData;
    }

    public final TodoMessageType getMessageType() {
        return this.messageType;
    }

    public final void setCardContentData(TodoOperationContent todoOperationContent) {
        this.cardContentData = todoOperationContent;
    }

    public final void setMessageType(TodoMessageType todoMessageType) {
        Intrinsics.checkParameterIsNotNull(todoMessageType, "<set-?>");
        this.messageType = todoMessageType;
    }
}

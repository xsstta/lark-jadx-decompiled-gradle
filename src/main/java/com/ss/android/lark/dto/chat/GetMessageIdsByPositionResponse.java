package com.ss.android.lark.dto.chat;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse;", "", "msgList", "", "Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "(Ljava/util/List;)V", "getMsgList", "()Ljava/util/List;", "MessageTypeInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.dto.chat.e */
public final class GetMessageIdsByPositionResponse {

    /* renamed from: a */
    private final List<MessageTypeInfo> f94769a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/dto/chat/GetMessageIdsByPositionResponse$MessageTypeInfo;", "", "id", "", "position", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "(Ljava/lang/String;ILcom/ss/android/lark/chat/entity/message/Message$Type;)V", "getId", "()Ljava/lang/String;", "getPosition", "()I", "getType", "()Lcom/ss/android/lark/chat/entity/message/Message$Type;", "equals", "", "other", "hashCode", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.dto.chat.e$a */
    public static final class MessageTypeInfo {

        /* renamed from: a */
        private final String f94770a;

        /* renamed from: b */
        private final int f94771b;

        /* renamed from: c */
        private final Message.Type f94772c;

        /* renamed from: a */
        public final String mo136084a() {
            return this.f94770a;
        }

        /* renamed from: b */
        public final Message.Type mo136085b() {
            return this.f94772c;
        }

        public int hashCode() {
            return this.f94770a.hashCode();
        }

        public boolean equals(Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual(cls2, cls)) {
                return false;
            }
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.dto.chat.GetMessageIdsByPositionResponse.MessageTypeInfo");
            } else if (!Intrinsics.areEqual(this.f94770a, ((MessageTypeInfo) obj).f94770a)) {
                return false;
            } else {
                return true;
            }
        }

        public MessageTypeInfo(String str, int i, Message.Type type) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
            this.f94770a = str;
            this.f94771b = i;
            this.f94772c = type;
        }
    }

    /* renamed from: a */
    public final List<MessageTypeInfo> mo136083a() {
        return this.f94769a;
    }

    public GetMessageIdsByPositionResponse(List<MessageTypeInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "msgList");
        this.f94769a = list;
    }
}

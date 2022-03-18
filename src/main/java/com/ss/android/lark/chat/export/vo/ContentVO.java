package com.ss.android.lark.chat.export.vo;

import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH&J\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0016J\u0016\u0010\u0011\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\u0016R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/export/vo/ContentVO;", "T", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "", "content", "(Lcom/ss/android/lark/chat/export/entity/message/Content;)V", "getContent", "()Lcom/ss/android/lark/chat/export/entity/message/Content;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "canReply", "", "getMessageAggregationId", "", "message", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "isContentSame", "diffable", "isItemSame", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.vo.a */
public abstract class ContentVO<T extends Content> {

    /* renamed from: a */
    private final T f88007a;

    /* renamed from: z */
    public final T mo126168z() {
        return this.f88007a;
    }

    public ContentVO(T t) {
        Intrinsics.checkParameterIsNotNull(t, "content");
        this.f88007a = t;
    }

    /* renamed from: a */
    public String mo121898a(OpenMessageVO<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "message");
        return cVar.mo121697e();
    }

    /* renamed from: a */
    public boolean mo121780a(ContentVO<?> aVar) {
        Boolean bool;
        if (aVar == null) {
            return false;
        }
        T t = this.f88007a;
        if (t != null) {
            bool = Boolean.valueOf(t.isContentSame(aVar.f88007a));
        } else {
            bool = null;
        }
        return bool.booleanValue();
    }
}

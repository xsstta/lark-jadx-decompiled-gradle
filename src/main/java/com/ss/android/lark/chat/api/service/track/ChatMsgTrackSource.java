package com.ss.android.lark.chat.api.service.track;

import com.ss.android.lark.chat.core.model.ObservableMappedArrayList;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016R&\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/api/service/track/ChatMsgTrackSource;", "Lcom/ss/android/lark/chat/api/service/track/IMessageSource;", "messageList", "Lcom/ss/android/lark/chat/core/model/ObservableMappedArrayList;", "", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "(Lcom/ss/android/lark/chat/core/model/ObservableMappedArrayList;)V", "getMessageList", "()Lcom/ss/android/lark/chat/core/model/ObservableMappedArrayList;", "setMessageList", "getMessageBlock", "Lcom/ss/android/lark/chat/api/service/track/MessageBlock;", "anchorMsgId", "nextCount", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.api.service.track.a */
public final class ChatMsgTrackSource implements IMessageSource {

    /* renamed from: a */
    private ObservableMappedArrayList<String, MessageInfo> f84515a;

    public ChatMsgTrackSource(ObservableMappedArrayList<String, MessageInfo> observableMappedArrayList) {
        Intrinsics.checkParameterIsNotNull(observableMappedArrayList, "messageList");
        this.f84515a = observableMappedArrayList;
    }

    @Override // com.ss.android.lark.chat.api.service.track.IMessageSource
    /* renamed from: a */
    public C32910f mo121414a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "anchorMsgId");
        List<E> list = null;
        this.f84515a.acquireReadAccess();
        int itemPosByKey = this.f84515a.getItemPosByKey(str);
        this.f84515a.size();
        if (itemPosByKey > 0 && itemPosByKey < this.f84515a.size()) {
            ObservableMappedArrayList<String, MessageInfo> observableMappedArrayList = this.f84515a;
            list = observableMappedArrayList.subList(itemPosByKey, Math.min(i + itemPosByKey + 1, observableMappedArrayList.size()));
        }
        this.f84515a.releaseReadAccess();
        return new C32910f(list);
    }
}

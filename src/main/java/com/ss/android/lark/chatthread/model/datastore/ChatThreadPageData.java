package com.ss.android.lark.chatthread.model.datastore;

import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chatthread/model/datastore/ChatThreadPageData;", "Lcom/ss/android/lark/chat/core/model/BasePageData;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "dataList", "", "(Ljava/util/List;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.c.a.b */
public final class ChatThreadPageData extends C33952a<MessageInfo> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThreadPageData(List<? extends MessageInfo> list) {
        super(list, CollectionsKt.emptyList(), CollectionsKt.emptyList());
        Intrinsics.checkParameterIsNotNull(list, "dataList");
    }
}

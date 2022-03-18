package com.ss.android.lark.chat.chatwindow.chat.model;

import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/model/ChatPageData;", "Lcom/ss/android/lark/chat/core/model/BasePageData;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "dataList", "", "invisiblePositions", "", "missingPositions", "syncPipeFinishMap", "", "", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getSyncPipeFinishMap", "()Ljava/util/Map;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.model.b */
public final class ChatPageData extends C33952a<MessageInfo> {

    /* renamed from: a */
    private final Map<String, Boolean> f86016a;

    /* renamed from: a */
    public final Map<String, Boolean> mo122927a() {
        return this.f86016a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatPageData(List<? extends MessageInfo> list, List<Integer> list2, List<Integer> list3, Map<String, Boolean> map) {
        super(list, list2, list3);
        Intrinsics.checkParameterIsNotNull(list, "dataList");
        Intrinsics.checkParameterIsNotNull(list2, "invisiblePositions");
        Intrinsics.checkParameterIsNotNull(list3, "missingPositions");
        Intrinsics.checkParameterIsNotNull(map, "syncPipeFinishMap");
        this.f86016a = map;
    }
}

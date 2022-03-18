package com.ss.android.lark.chat.chatwindow.chat.v2.model.filter;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/filter/MessageSenderListFilter;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "", "userIdList", "", "", "(Ljava/util/Map;)V", "invoke", "p1", "(Lcom/ss/android/lark/chat/entity/message/IChatMessage;)Ljava/lang/Boolean;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.a.b */
public final class MessageSenderListFilter implements Function1<AbstractC34006a, Boolean> {

    /* renamed from: a */
    private final Map<String, String> f86144a;

    public MessageSenderListFilter(Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(map, "userIdList");
        this.f86144a = map;
    }

    /* renamed from: a */
    public Boolean invoke(AbstractC34006a aVar) {
        String str;
        Intrinsics.checkParameterIsNotNull(aVar, "p1");
        Map<String, String> map = this.f86144a;
        ChatChatter messageSender = aVar.getMessageSender();
        if (messageSender != null) {
            str = messageSender.getId();
        } else {
            str = null;
        }
        if (map != null) {
            return Boolean.valueOf(map.containsKey(str));
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }
}

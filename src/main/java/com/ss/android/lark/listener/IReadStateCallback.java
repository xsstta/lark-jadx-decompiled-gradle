package com.ss.android.lark.listener;

import com.ss.android.lark.chat.entity.message.MessageInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/listener/IReadStateCallback;", "", "getMessageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "key", "", "onSuccess", "", "messageInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.o.n */
public interface IReadStateCallback {
    /* renamed from: a */
    MessageInfo mo123095a(String str);

    /* renamed from: a */
    void mo123096a(MessageInfo messageInfo);
}

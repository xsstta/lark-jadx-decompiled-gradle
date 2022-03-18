package com.ss.android.lark.listener;

import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J&\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\tH\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\tH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/listener/PushChatRelationListener;", "", "()V", "onPushChat", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onPushChatAddUser", "chatterMap", "", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onPushChatRemoveUser", "onPushMessage", "pushMessageDTO", "Lcom/ss/android/lark/biz/im/api/PushMessageDTO;", "onPushReactionMessage", "reactions", "Lcom/bytedance/lark/pb/im/v1/PushMessageReactions;", "onPushReadStateMessage", "readStates", "Lcom/bytedance/lark/pb/im/v1/PushMessageReadStates;", "onPushThreadTopic", "threadTopic", "Lcom/ss/android/lark/biz/im/api/ThreadTopic;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.o.s */
public class PushChatRelationListener {
    /* renamed from: a */
    public void mo123090a(PushMessageReactions pushMessageReactions) {
        Intrinsics.checkParameterIsNotNull(pushMessageReactions, "reactions");
    }

    /* renamed from: a */
    public void mo123091a(PushMessageReadStates pushMessageReadStates) {
        Intrinsics.checkParameterIsNotNull(pushMessageReadStates, "readStates");
    }

    /* renamed from: a */
    public void mo169913a(ThreadTopic threadTopic) {
        Intrinsics.checkParameterIsNotNull(threadTopic, "threadTopic");
    }

    /* renamed from: a */
    public void mo123092a(C29598aa aaVar) {
        Intrinsics.checkParameterIsNotNull(aaVar, "pushMessageDTO");
    }

    /* renamed from: a */
    public void mo123093a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
    }

    /* renamed from: a */
    public void mo123094a(Chat chat, Map<String, ? extends Chatter> map) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(map, "chatterMap");
    }

    /* renamed from: b */
    public void mo169914b(Chat chat, Map<String, ? extends Chatter> map) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(map, "chatterMap");
    }
}

package com.ss.android.lark.chat.service;

import com.bytedance.lark.pb.im.v1.PushMessageReactions;
import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.ThreadTopic;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&J$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/service/IPushChatRelationListener;", "", "onPushChat", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onPushChatAddUser", "chatterMap", "", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onPushChatRemoveUser", "onPushMessage", "pushMessageDTO", "Lcom/ss/android/lark/biz/im/api/PushMessageDTO;", "onPushReactionMessage", "reactions", "Lcom/bytedance/lark/pb/im/v1/PushMessageReactions;", "onPushReadStateMessage", "readStates", "Lcom/bytedance/lark/pb/im/v1/PushMessageReadStates;", "onPushThreadTopic", "threadTopic", "Lcom/ss/android/lark/biz/im/api/ThreadTopic;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.service.h */
public interface IPushChatRelationListener {
    /* renamed from: a */
    void mo126570a(PushMessageReactions pushMessageReactions);

    /* renamed from: a */
    void mo126571a(PushMessageReadStates pushMessageReadStates);

    /* renamed from: a */
    void mo126572a(ThreadTopic threadTopic);

    /* renamed from: a */
    void mo126573a(C29598aa aaVar);

    /* renamed from: a */
    void mo126574a(Chat chat);

    /* renamed from: a */
    void mo126575a(Chat chat, Map<String, ? extends Chatter> map);

    /* renamed from: b */
    void mo126576b(Chat chat, Map<String, ? extends Chatter> map);
}

package com.ss.android.lark.chat.chatwindow.chat.v2.model.operation;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/operation/AliasNameUpdater;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", BottomDialog.f17198f, "", "nickname", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatterId", "()Ljava/lang/String;", "getNickname", "invoke", "chatMessage", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b.a */
public final class AliasNameUpdater implements Function1<AbstractC34006a, AbstractC34006a> {

    /* renamed from: a */
    private final String f86175a;

    /* renamed from: b */
    private final String f86176b;

    /* renamed from: a */
    public AbstractC34006a invoke(AbstractC34006a aVar) {
        ChatChatter chatChatter;
        if (aVar != null) {
            List<ReactionInfo> reactionInfoList = aVar.getReactionInfoList();
            if (CollectionUtils.isNotEmpty(reactionInfoList)) {
                for (ReactionInfo reactionInfo : reactionInfoList) {
                    Map<String, ChatChatter> reactionChatters = reactionInfo.getReactionChatters();
                    if (CollectionUtils.isNotEmpty(reactionChatters) && (chatChatter = reactionChatters.get(this.f86175a)) != null) {
                        chatChatter.setAlias(this.f86175a);
                    }
                }
            }
        }
        return aVar;
    }

    public AliasNameUpdater(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "nickname");
        this.f86175a = str;
        this.f86176b = str2;
    }
}

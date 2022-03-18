package com.ss.android.lark.chat.chatwindow.chat.v2.model.filter;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/filter/ReactionFilter;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "", BottomDialog.f17198f, "", "(Ljava/lang/String;)V", "getChatterId", "()Ljava/lang/String;", "invoke", "chatMessage", "(Lcom/ss/android/lark/chat/entity/message/IChatMessage;)Ljava/lang/Boolean;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.a.e */
public final class ReactionFilter implements Function1<AbstractC34006a, Boolean> {

    /* renamed from: a */
    private final String f86147a;

    public ReactionFilter(String str) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        this.f86147a = str;
    }

    /* renamed from: a */
    public Boolean invoke(AbstractC34006a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "chatMessage");
        List<ReactionInfo> reactionInfoList = aVar.getReactionInfoList();
        if (CollectionUtils.isNotEmpty(reactionInfoList)) {
            for (ReactionInfo reactionInfo : reactionInfoList) {
                Intrinsics.checkExpressionValueIsNotNull(reactionInfo, "reactionInfo");
                Map<String, ChatChatter> reactionChatters = reactionInfo.getReactionChatters();
                if (CollectionUtils.isNotEmpty(reactionChatters) && reactionChatters.get(this.f86147a) != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

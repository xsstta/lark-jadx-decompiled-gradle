package com.ss.android.lark.chat.export.entity.message.content;

import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0012\u0010\u0013\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u0004\u0018\u00010\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/message/content/OpenSystemContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "formattedContent", "", "getFormattedContent", "()Ljava/lang/CharSequence;", "fromChatter", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "getFromChatter", "()Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "fromChatterId", "", "getFromChatterId", "()Ljava/lang/String;", "isRedPackSystemMessage", "", "()Z", "isVCSystemMessage", "isVoIPSystemMessage", "toChatter", "getToChatter", "toChatterId", "getToChatterId", "triggerId", "getTriggerId", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageType;", "getType", "()Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageType;", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class OpenSystemContent extends Content {
    public abstract CharSequence getFormattedContent();

    public abstract OpenChatter getFromChatter();

    public abstract String getFromChatterId();

    public abstract OpenChatter getToChatter();

    public abstract String getToChatterId();

    public abstract String getTriggerId();

    public abstract SystemMessageType getType();

    public abstract boolean isRedPackSystemMessage();

    public abstract boolean isVCSystemMessage();

    public abstract boolean isVoIPSystemMessage();
}

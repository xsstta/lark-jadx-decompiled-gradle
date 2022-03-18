package com.ss.android.lark.chat.entity.message;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.entity.message.a */
public interface AbstractC34006a extends OpenMessageInfo, Cloneable {
    boolean canShow();

    @Override // java.lang.Object
    AbstractC34006a clone();

    AbstractC34006a doCopy();

    String getId();

    @Override // com.ss.android.lark.chat.export.entity.message.OpenMessageInfo
    Message getMessage();

    @Override // com.ss.android.lark.chat.export.entity.message.OpenMessageInfo
    ChatChatter getMessageSender();

    String getParentId();

    Pin getPin();

    List<ReactionInfo> getReactionInfoList();

    Content getTranslateContent(boolean z);

    TranslateInfo getTranslateInfo();

    long getUpdateTime();

    String getcId();

    boolean isIntermediateMessage();

    boolean isNeedToAutoTranslate();

    boolean isNoTraceDelete();

    boolean isPreMessage();

    boolean isShowMessageOriginContent();

    boolean isTranslating();

    boolean isTranslatingInited();

    void setFollow(boolean z);

    void setForceUpdate(boolean z);

    void setIsTranslating(boolean z);

    void setMessage(Message message);

    void setMessageSender(ChatChatter chatChatter);

    void setNeedToAutoTranslate(boolean z);

    void setNoTraceDelete(boolean z);

    void setPin(Pin pin);

    void setReactionInfoList(List<ReactionInfo> list);

    void setTranslateInfo(TranslateInfo translateInfo);
}

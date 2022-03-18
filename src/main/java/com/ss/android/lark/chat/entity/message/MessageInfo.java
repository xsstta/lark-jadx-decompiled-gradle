package com.ss.android.lark.chat.entity.message;

import android.text.TextUtils;
import com.larksuite.framework.utils.C26325y;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.entity.message.ITranslatable;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.ding.entity.DingStatus;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.List;

public class MessageInfo implements AbstractC26248b<MessageInfo>, AbstractC34006a, ITranslatable, OpenMessageInfo, Serializable, Comparable<MessageInfo> {
    private DingStatus dingStatus;
    private boolean isForceUpdate;
    private Boolean isTranslating;
    private Message mMessage;
    private ChatChatter mMessageSender;
    private boolean mNeedToAutoTranslate = true;
    private MessageInfo mParentMessageInfo;
    private Pin mPin;
    private ChatChatter mRecallUser;
    private MessageInfo mRootMessageInfo;
    private TranslateInfo mTranslateInfo;
    private ChatChatter originalSender;
    private List<ReactionInfo> reactionInfos;

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isNoTraceDelete() {
        return false;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setFollow(boolean z) {
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setNoTraceDelete(boolean z) {
    }

    public DingStatus getDingStatus() {
        return this.dingStatus;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.OpenMessageInfo, com.ss.android.lark.chat.entity.message.AbstractC34006a
    public Message getMessage() {
        return this.mMessage;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.OpenMessageInfo, com.ss.android.lark.chat.entity.message.AbstractC34006a
    public ChatChatter getMessageSender() {
        return this.mMessageSender;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.OpenMessageInfo
    public ChatChatter getOriginalSender() {
        return this.originalSender;
    }

    public AbstractC34006a getParent() {
        return this.mParentMessageInfo;
    }

    public MessageInfo getParentMessageInfo() {
        return this.mParentMessageInfo;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public Pin getPin() {
        return this.mPin;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public List<ReactionInfo> getReactionInfoList() {
        return this.reactionInfos;
    }

    public ChatChatter getRecallUser() {
        return this.mRecallUser;
    }

    public MessageInfo getRootMessageInfo() {
        return this.mRootMessageInfo;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public TranslateInfo getTranslateInfo() {
        return this.mTranslateInfo;
    }

    public boolean isForceUpdate() {
        return this.isForceUpdate;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isNeedToAutoTranslate() {
        return this.mNeedToAutoTranslate;
    }

    public MessageInfo() {
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean canShow() {
        return this.mMessage.canShow();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public AbstractC34006a doCopy() {
        return new MessageInfo(this);
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public String getId() {
        return this.mMessage.getId();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public String getParentId() {
        return this.mMessage.getParentId();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public long getUpdateTime() {
        return this.mMessage.getUpdateTime();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public String getcId() {
        return this.mMessage.getcId();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isIntermediateMessage() {
        return this.mMessage.isCryptoIntermediate();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isPreMessage() {
        return this.mMessage.isPreMessage();
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isTranslatingInited() {
        if (this.isTranslating != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a, java.lang.Object
    public AbstractC34006a clone() {
        try {
            return (AbstractC34006a) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Content getTranslateContent() {
        return getTranslateContent(isShowMessageOriginContent());
    }

    public int hashCode() {
        Message message = this.mMessage;
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isTranslating() {
        Boolean bool = this.isTranslating;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public String toString() {
        Message message = this.mMessage;
        if (message != null) {
            return message.toString();
        }
        return super.toString();
    }

    public boolean hasReaction() {
        if (getReactionInfoList() == null) {
            return false;
        }
        for (ReactionInfo reactionInfo : getReactionInfoList()) {
            if (reactionInfo.getReaction().getCount() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.ITranslatable, com.ss.android.lark.chat.entity.message.AbstractC34006a
    public boolean isShowMessageOriginContent() {
        String translateLanguage = getMessage().getTranslateLanguage();
        TranslateInfo translateInfo = getTranslateInfo();
        if (TextUtils.isEmpty(translateLanguage) || translateInfo == null || !translateLanguage.equals(translateInfo.getLanguage()) || getMessage().getStatus() == Message.Status.DELETED) {
            return true;
        }
        return false;
    }

    public void setDingStatus(DingStatus dingStatus2) {
        this.dingStatus = dingStatus2;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setForceUpdate(boolean z) {
        this.isForceUpdate = z;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setMessage(Message message) {
        this.mMessage = message;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setMessageSender(ChatChatter chatChatter) {
        this.mMessageSender = chatChatter;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setNeedToAutoTranslate(boolean z) {
        this.mNeedToAutoTranslate = z;
    }

    public void setOriginalSender(ChatChatter chatChatter) {
        this.originalSender = chatChatter;
    }

    public void setParentMessageInfo(MessageInfo messageInfo) {
        this.mParentMessageInfo = messageInfo;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setPin(Pin pin) {
        this.mPin = pin;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setReactionInfoList(List<ReactionInfo> list) {
        this.reactionInfos = list;
    }

    public void setRecallUser(ChatChatter chatChatter) {
        this.mRecallUser = chatChatter;
    }

    public void setRootMessageInfo(MessageInfo messageInfo) {
        this.mRootMessageInfo = messageInfo;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setTranslateInfo(TranslateInfo translateInfo) {
        this.mTranslateInfo = translateInfo;
    }

    @Override // com.ss.android.lark.chat.entity.message.AbstractC34006a
    public void setIsTranslating(boolean z) {
        this.isTranslating = Boolean.valueOf(z);
    }

    public int compareTo(MessageInfo messageInfo) {
        return this.mMessage.compareTo(messageInfo.getMessage());
    }

    public boolean isItemSame(MessageInfo messageInfo) {
        return this.mMessage.isItemSame(messageInfo.getMessage());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        Message message = this.mMessage;
        Message message2 = ((MessageInfo) obj).mMessage;
        if (message == null ? message2 == null : message.equals(message2)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.ITranslatable, com.ss.android.lark.chat.entity.message.AbstractC34006a
    public Content getTranslateContent(boolean z) {
        if (z) {
            return getMessage().getContent();
        }
        return getTranslateInfo().getTranslateContent();
    }

    public MessageInfo(MessageInfo messageInfo) {
        this.mMessage = messageInfo.mMessage;
        this.mMessageSender = messageInfo.mMessageSender;
        this.mTranslateInfo = messageInfo.mTranslateInfo;
        this.dingStatus = messageInfo.dingStatus;
        this.reactionInfos = messageInfo.reactionInfos;
        this.mRootMessageInfo = messageInfo.getRootMessageInfo();
        this.mParentMessageInfo = messageInfo.getParentMessageInfo();
        this.mRecallUser = messageInfo.mRecallUser;
        this.mNeedToAutoTranslate = messageInfo.isNeedToAutoTranslate();
        this.isTranslating = messageInfo.isTranslating;
        this.mTranslateInfo = messageInfo.getTranslateInfo();
        this.mPin = messageInfo.getPin();
        this.originalSender = messageInfo.originalSender;
    }

    public boolean isContentSame(MessageInfo messageInfo) {
        if (C26247a.m94983b(this.mMessage, messageInfo.getMessage()) && C26247a.m94982a((List) this.reactionInfos, (List) messageInfo.getReactionInfoList()) && C26247a.m94983b(this.dingStatus, messageInfo.getDingStatus()) && C26247a.m94983b(this.mMessageSender, messageInfo.getMessageSender()) && C26247a.m94983b(this.mRecallUser, messageInfo.getRecallUser()) && C26247a.m94983b(this.mPin, messageInfo.getPin()) && this.isTranslating == messageInfo.isTranslating && C26325y.m95335a(this.mTranslateInfo, messageInfo.getTranslateInfo())) {
            return true;
        }
        return false;
    }

    public MessageInfo(Message message, ChatChatter chatChatter) {
        this.mMessage = message;
        this.mMessageSender = chatChatter;
        if (chatChatter == null && message != null) {
            Log.m165396w("chatter is null in messageinfo, chatterid: " + message.getFromId());
        }
    }
}

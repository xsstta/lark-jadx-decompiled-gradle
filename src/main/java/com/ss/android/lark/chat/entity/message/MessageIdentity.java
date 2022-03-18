package com.ss.android.lark.chat.entity.message;

import com.ss.android.lark.chat.entity.message.Message;
import java.io.Serializable;

public class MessageIdentity implements Serializable {
    private String chatId;
    private long createTime;
    private boolean hideEditor;
    private boolean hideForward;
    private boolean hideJumpChat;
    private boolean hideSaveToDriver;
    private boolean hideStickerSave = true;
    private String messageId;
    private String sourceId;
    private Message.SourceType sourceType;
    private String threadId;
    private int threadPosition;

    public String getChatId() {
        return this.chatId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public int getThreadPosition() {
        return this.threadPosition;
    }

    public boolean isHideEditor() {
        return this.hideEditor;
    }

    public boolean isHideForward() {
        return this.hideForward;
    }

    public boolean isHideJumpChat() {
        return this.hideJumpChat;
    }

    public boolean isHideSaveToDriver() {
        return this.hideSaveToDriver;
    }

    public boolean isHideStickerSave() {
        return this.hideStickerSave;
    }

    public Message.SourceType getSourceType() {
        Message.SourceType sourceType2 = this.sourceType;
        if (sourceType2 != null) {
            return sourceType2;
        }
        return Message.SourceType.TYPE_FROM_MESSAGE;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setHideEditor(boolean z) {
        this.hideEditor = z;
    }

    public void setHideForward(boolean z) {
        this.hideForward = z;
    }

    public void setHideJumpChat(boolean z) {
        this.hideJumpChat = z;
    }

    public void setHideSaveToDriver(boolean z) {
        this.hideSaveToDriver = z;
    }

    public void setHideStickerSave(boolean z) {
        this.hideStickerSave = z;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setSourceId(String str) {
        this.sourceId = str;
    }

    public void setSourceType(Message.SourceType sourceType2) {
        this.sourceType = sourceType2;
    }

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setThreadPosition(int i) {
        this.threadPosition = i;
    }

    public MessageIdentity(String str, String str2) {
        this.messageId = str;
        this.chatId = str2;
        this.sourceId = str;
        this.sourceType = Message.SourceType.TYPE_FROM_MESSAGE;
    }

    public MessageIdentity(String str, String str2, String str3, Message.SourceType sourceType2) {
        this.messageId = str;
        this.chatId = str2;
        this.sourceId = str3;
        this.sourceType = sourceType2;
    }
}

package com.ss.android.lark.search.impl.entity.viewdata;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.doc.entity.Doc;
import java.util.List;

public class SearchMessageViewData extends SearchBaseViewData {
    private static final long serialVersionUID = -7318256022124152478L;
    private String botId;
    private String chatId;
    private String fromAvatarKey;
    private String fromId;
    private String fromName;
    private boolean isP2pChat;
    private List<Doc> messageDocInfoList;
    private String messageId;
    private int messageThreadPosition;
    private Message.Type msgType;
    private long p2pChatterId;
    private int position;
    private int threadChatPosition;
    private String threadId;
    private long updateTime;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 3;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public String getFromAvatarKey() {
        return this.fromAvatarKey;
    }

    public String getFromId() {
        return this.fromId;
    }

    public String getFromName() {
        return this.fromName;
    }

    public List<Doc> getMessageDocInfoList() {
        return this.messageDocInfoList;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public int getMessageThreadPosition() {
        return this.messageThreadPosition;
    }

    public Message.Type getMsgType() {
        return this.msgType;
    }

    public long getP2pChatterId() {
        return this.p2pChatterId;
    }

    public int getPosition() {
        return this.position;
    }

    public int getThreadChatPosition() {
        return this.threadChatPosition;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isP2pChat() {
        return this.isP2pChat;
    }

    public void setBotId(String str) {
        this.botId = str;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setFromAvatarKey(String str) {
        this.fromAvatarKey = str;
    }

    public void setFromId(String str) {
        this.fromId = str;
    }

    public void setFromName(String str) {
        this.fromName = str;
    }

    public void setMessageDocInfoList(List<Doc> list) {
        this.messageDocInfoList = list;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setMessageThreadPosition(int i) {
        this.messageThreadPosition = i;
    }

    public void setMsgType(Message.Type type) {
        this.msgType = type;
    }

    public void setP2pChat(boolean z) {
        this.isP2pChat = z;
    }

    public void setP2pChatterId(long j) {
        this.p2pChatterId = j;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setThreadChatPosition(int i) {
        this.threadChatPosition = i;
    }

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public String getAvatarId(int i) {
        if (i != 0) {
            return this.fromId;
        }
        if (this.isP2pChat) {
            return String.valueOf(this.p2pChatterId);
        }
        return this.chatId;
    }
}

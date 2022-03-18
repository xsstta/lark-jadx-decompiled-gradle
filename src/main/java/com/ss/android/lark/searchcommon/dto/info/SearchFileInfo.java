package com.ss.android.lark.searchcommon.dto.info;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.FileContent;

public class SearchFileInfo extends SearchBaseInfo {
    private static final long serialVersionUID = 2939786038190638748L;
    private String chatId;
    private FileContent fileContent;
    private String fromId;
    private boolean isP2pChat;
    private Message.Type msgType;
    private long p2pChatterId;
    private int position;
    private String threadId;
    private int threadPosition;
    private long updateTime;

    public String getChatId() {
        return this.chatId;
    }

    public FileContent getFileContent() {
        return this.fileContent;
    }

    public String getFromId() {
        return this.fromId;
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

    public String getThreadId() {
        return this.threadId;
    }

    public int getThreadPosition() {
        return this.threadPosition;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isP2pChat() {
        return this.isP2pChat;
    }

    public SearchFileInfo() {
        this.type = 10000001;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setFileContent(FileContent fileContent2) {
        this.fileContent = fileContent2;
    }

    public void setFromId(String str) {
        this.fromId = str;
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

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setThreadPosition(int i) {
        this.threadPosition = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }
}

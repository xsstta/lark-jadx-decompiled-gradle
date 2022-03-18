package com.ss.android.lark.searchcommon.dto.info;

public class SearchLinkInfo extends SearchBaseInfo {
    private static final long serialVersionUID = 1889066940445165094L;
    private String chatId;
    private long createTime;
    private String fromName;
    private String originalUrl;
    private int position;
    private String threadId;
    private int threadPosition;

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        return "link";
    }

    public String getChatId() {
        return this.chatId;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getFromName() {
        return this.fromName;
    }

    public String getOriginalUrl() {
        return this.originalUrl;
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

    public SearchLinkInfo() {
        this.type = 13;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setFromName(String str) {
        this.fromName = str;
    }

    public void setOriginalUrl(String str) {
        this.originalUrl = str;
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
}

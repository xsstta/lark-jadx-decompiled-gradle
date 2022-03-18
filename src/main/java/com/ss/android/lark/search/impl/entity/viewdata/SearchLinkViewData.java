package com.ss.android.lark.search.impl.entity.viewdata;

public class SearchLinkViewData extends SearchBaseViewData {
    private static final long serialVersionUID = -2570318299825851689L;
    private String avatarUrl;
    private String chatId;
    private long createTime;
    private String fromName;
    private String originalUrl;
    private int position;
    private String threadId;
    private int threadPosition;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 13;
    }

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public String getAvatarUrl() {
        return this.avatarUrl;
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

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
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

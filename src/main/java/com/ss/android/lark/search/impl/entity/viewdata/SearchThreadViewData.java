package com.ss.android.lark.search.impl.entity.viewdata;

import android.text.TextUtils;

public class SearchThreadViewData extends SearchBaseViewData {
    private static final long serialVersionUID = 5665503760102098266L;
    private String chatId;
    private String p2pChatterId;
    private String threadId;
    private long updateTime;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 8;
    }

    public String getChatId() {
        return this.chatId;
    }

    public String getP2pChatterId() {
        return this.p2pChatterId;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public String getAvatarId() {
        if (!TextUtils.isEmpty(this.p2pChatterId)) {
            return this.p2pChatterId;
        }
        return this.chatId;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setP2pChatterId(String str) {
        this.p2pChatterId = str;
    }

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }
}

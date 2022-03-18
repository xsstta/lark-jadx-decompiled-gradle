package com.ss.android.vc.dto;

public class SearchChatInfo extends BaseSearchInfo {
    private boolean isCrossTenant;
    private boolean isGroupChat;

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isGroupChat() {
        return this.isGroupChat;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setGroupChat(boolean z) {
        this.isGroupChat = z;
    }
}

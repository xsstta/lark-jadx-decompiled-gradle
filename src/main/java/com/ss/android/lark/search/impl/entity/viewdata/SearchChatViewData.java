package com.ss.android.lark.search.impl.entity.viewdata;

import com.bytedance.lark.pb.basic.v1.Tag;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.List;

public class SearchChatViewData extends SearchBaseViewData {
    private static final long serialVersionUID = 5846432294272826642L;
    private String chatId;
    private Chat.Type chatType;
    private boolean isCrossTenant;
    private boolean isCrossWithKA;
    private boolean isDepartment;
    private boolean isMeeting;
    private boolean isMember;
    private boolean isOfficialOnCall;
    private boolean isPublic;
    private boolean isRemind;
    private boolean isSecretChat;
    private boolean isShowTag;
    private boolean isTenant;
    private boolean isThread;
    private int newMsgCount;
    private List<Tag> tags;
    private int userCount;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 2;
    }

    public int getChatCount() {
        return this.userCount;
    }

    public String getChatId() {
        return this.chatId;
    }

    public Chat.Type getChatType() {
        return this.chatType;
    }

    public int getNewMsgCount() {
        return this.newMsgCount;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isCrossWithKA() {
        return this.isCrossWithKA;
    }

    public boolean isDepartment() {
        return this.isDepartment;
    }

    public boolean isMeeting() {
        return this.isMeeting;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public boolean isOfficialOnCall() {
        return this.isOfficialOnCall;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public boolean isRemind() {
        return this.isRemind;
    }

    public boolean isSecretChat() {
        return this.isSecretChat;
    }

    public boolean isShowTag() {
        return this.isShowTag;
    }

    public boolean isTenant() {
        return this.isTenant;
    }

    public boolean isThread() {
        return this.isThread;
    }

    public void setChatCount(int i) {
        this.userCount = i;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setChatType(Chat.Type type) {
        this.chatType = type;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setCrossWithKA(boolean z) {
        this.isCrossWithKA = z;
    }

    public void setDepartment(boolean z) {
        this.isDepartment = z;
    }

    public void setMeeting(boolean z) {
        this.isMeeting = z;
    }

    public void setMember(boolean z) {
        this.isMember = z;
    }

    public void setNewMsgCount(int i) {
        this.newMsgCount = i;
    }

    public void setOfficialOnCall(boolean z) {
        this.isOfficialOnCall = z;
    }

    public void setPublic(boolean z) {
        this.isPublic = z;
    }

    public void setRemind(boolean z) {
        this.isRemind = z;
    }

    public void setSecretChat(boolean z) {
        this.isSecretChat = z;
    }

    public void setShowTag(boolean z) {
        this.isShowTag = z;
    }

    public void setTags(List<Tag> list) {
        this.tags = list;
    }

    public void setTenant(boolean z) {
        this.isTenant = z;
    }

    public void setThread(boolean z) {
        this.isThread = z;
    }
}

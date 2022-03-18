package com.ss.android.lark.searchcommon.dto.info;

import com.bytedance.lark.pb.basic.v1.Tag;
import com.ss.android.lark.chat.entity.chat.Chat;
import java.util.List;

public class SearchChatInfo extends SearchBaseInfo {
    private static final long serialVersionUID = 8132510517498607897L;
    private Chat.ChatMode chatMode;
    private Chat.Type chatType;
    private boolean isCountLightStyle;
    private boolean isDelayed;
    private boolean isDepartment;
    private boolean isEnabledEmail;
    private boolean isMeeting;
    private boolean isMember = true;
    private boolean isOfficialOnCall;
    private boolean isPublic;
    private boolean isSecretChat;
    private boolean isTenant;
    private int memberCount;
    private List<Tag> tags;
    private int userCount;

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        return "groups";
    }

    public Chat.ChatMode getChatMode() {
        return this.chatMode;
    }

    public Chat.Type getChatType() {
        return this.chatType;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public boolean isCountLightStyle() {
        return this.isCountLightStyle;
    }

    public boolean isDelayed() {
        return this.isDelayed;
    }

    public boolean isDepartment() {
        return this.isDepartment;
    }

    public boolean isEnabledEmail() {
        return this.isEnabledEmail;
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

    public boolean isSecretChat() {
        return this.isSecretChat;
    }

    public boolean isTenant() {
        return this.isTenant;
    }

    public SearchChatInfo() {
        this.type = 2;
    }

    public boolean isThread() {
        if (getChatMode() == Chat.ChatMode.THREAD_V2) {
            return true;
        }
        return false;
    }

    public void setChatMode(Chat.ChatMode chatMode2) {
        this.chatMode = chatMode2;
    }

    public void setChatType(Chat.Type type) {
        this.chatType = type;
    }

    public void setCountLightStyle(boolean z) {
        this.isCountLightStyle = z;
    }

    public void setDelayed(boolean z) {
        this.isDelayed = z;
    }

    public void setDepartment(boolean z) {
        this.isDepartment = z;
    }

    public void setEnabledEmail(boolean z) {
        this.isEnabledEmail = z;
    }

    public void setIsMeeting(boolean z) {
        this.isMeeting = z;
    }

    public void setMember(boolean z) {
        this.isMember = z;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setOfficialOnCall(boolean z) {
        this.isOfficialOnCall = z;
    }

    public void setPublic(boolean z) {
        this.isPublic = z;
    }

    public void setSecretChat(boolean z) {
        this.isSecretChat = z;
    }

    public void setTags(List<Tag> list) {
        this.tags = list;
    }

    public void setTenant(boolean z) {
        this.isTenant = z;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }
}

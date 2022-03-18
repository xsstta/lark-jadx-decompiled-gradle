package com.ss.android.lark.meego.export;

public class ChatGroupInfo {
    private String groupId;
    private String groupName;

    public String getGroupId() {
        return this.groupId;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupId(String str) {
        this.groupId = str;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public ChatGroupInfo(String str, String str2) {
        this.groupId = str;
        this.groupName = str2;
    }
}

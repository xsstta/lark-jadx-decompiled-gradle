package com.ss.android.lark.member_manage.impl.bean;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.member_manage.impl.show_member.common_group.C45195c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SelectMemberInitData implements Serializable {
    private static final long serialVersionUID = -4303269609487250974L;
    private Chat mChat;
    private C45195c mMemberFilter;
    private MessageInfo mMessageInfo;
    private int mType;
    private List<String> selectedIds = new ArrayList();

    public Chat getChat() {
        return this.mChat;
    }

    public C45195c getMemberFilter() {
        return this.mMemberFilter;
    }

    public MessageInfo getMessageInfo() {
        return this.mMessageInfo;
    }

    public List<String> getSelectedIds() {
        return this.selectedIds;
    }

    public int getType() {
        return this.mType;
    }

    public void setChat(Chat chat) {
        this.mChat = chat;
    }

    public void setMemberFilter(C45195c cVar) {
        this.mMemberFilter = cVar;
    }

    public void setMessageInfo(MessageInfo messageInfo) {
        this.mMessageInfo = messageInfo;
    }

    public void setType(int i) {
        this.mType = i;
    }

    public void setSelectedIds(List<String> list) {
        this.selectedIds.clear();
        if (list != null) {
            this.selectedIds.addAll(list);
        }
    }
}

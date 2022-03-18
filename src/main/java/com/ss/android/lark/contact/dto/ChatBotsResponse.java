package com.ss.android.lark.contact.dto;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.io.Serializable;
import java.util.List;

public class ChatBotsResponse implements Serializable {
    public List<Chatter> chatters;
    public boolean hasMore;

    public ChatBotsResponse(List<Chatter> list, boolean z) {
        this.chatters = list;
        this.hasMore = z;
    }
}

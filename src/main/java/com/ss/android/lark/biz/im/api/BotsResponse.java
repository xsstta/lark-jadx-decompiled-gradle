package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.io.Serializable;
import java.util.List;

public class BotsResponse implements Serializable {
    public List<Chatter> chatters;
    public boolean hasMore;

    public BotsResponse(List<Chatter> list, boolean z) {
        this.chatters = list;
        this.hasMore = z;
    }
}

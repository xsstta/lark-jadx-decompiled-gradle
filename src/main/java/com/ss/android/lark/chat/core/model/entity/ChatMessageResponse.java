package com.ss.android.lark.chat.core.model.entity;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatMessageResponse implements Serializable {
    public Chat chat;
    public long clientDataCost;
    public final List<Integer> invisiblePositions;
    public final List<MessageInfo> messageInfoList;
    public Map<String, Boolean> messagesSyncPipeFinished;
    public List<Integer> missingPositions;
    public List<Long> netCosts;
    public long sdkCost;

    public ChatMessageResponse() {
        this(Collections.EMPTY_LIST, Collections.EMPTY_LIST);
    }

    public ChatMessageResponse(List<MessageInfo> list, List<Integer> list2) {
        this.missingPositions = new ArrayList();
        this.messagesSyncPipeFinished = new HashMap();
        this.messageInfoList = list;
        this.invisiblePositions = list2;
    }
}

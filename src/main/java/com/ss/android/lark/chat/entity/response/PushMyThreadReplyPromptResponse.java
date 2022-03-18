package com.ss.android.lark.chat.entity.response;

import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.io.Serializable;
import java.util.List;

public class PushMyThreadReplyPromptResponse implements Serializable {
    public String groupId;
    public List<MessageInfo> lastAtMessages;
    public int newAtReplyCount;
    public int newReplyCount;

    public PushMyThreadReplyPromptResponse(String str, int i, int i2, List<MessageInfo> list) {
        this.groupId = str;
        this.newReplyCount = i;
        this.newAtReplyCount = i2;
        this.lastAtMessages = list;
    }
}

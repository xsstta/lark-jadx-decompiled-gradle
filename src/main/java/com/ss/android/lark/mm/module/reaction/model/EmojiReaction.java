package com.ss.android.lark.mm.module.reaction.model;

import com.alibaba.fastjson.JSON;
import java.io.Serializable;

public class EmojiReaction implements Serializable {
    public String emoji_code;
    public long start_time;
    public String uuid;

    public EmojiReaction() {
    }

    public String toJson() {
        return JSON.toJSONString(this);
    }

    public EmojiReaction(String str, long j, String str2) {
        this.emoji_code = str;
        this.start_time = j;
        this.uuid = str2;
    }
}

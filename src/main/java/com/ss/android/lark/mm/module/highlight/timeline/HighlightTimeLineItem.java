package com.ss.android.lark.mm.module.highlight.timeline;

import java.io.Serializable;

public class HighlightTimeLineItem implements Serializable {
    public String emoji_code;
    public long start_time;
    public long stop_time;
    public int type;
    public String uuid;

    public String getEmojiCode() {
        return this.emoji_code;
    }
}

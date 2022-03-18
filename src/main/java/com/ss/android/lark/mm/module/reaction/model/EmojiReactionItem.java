package com.ss.android.lark.mm.module.reaction.model;

import java.io.Serializable;

public class EmojiReactionItem implements Serializable {
    public String mEmojiCode;
    public long mEmojiCount;
    public int type;

    public String toString() {
        return "EmojiReactionItem{mEmojiCode='" + this.mEmojiCode + '\'' + ", mEmojiCount=" + this.mEmojiCount + '}';
    }
}

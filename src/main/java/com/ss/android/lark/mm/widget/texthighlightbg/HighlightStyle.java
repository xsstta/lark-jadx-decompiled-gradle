package com.ss.android.lark.mm.widget.texthighlightbg;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/widget/texthighlightbg/HighlightStyle;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ORIGINAL_TEXT_BG", "COMMENT_DOTTED_LINE", "COMMENT_SELECTION_BG", "COMMENT_SELECTION_UNDERLINE", "KEYWORD_FIND", "SYNC", "INDEX_KEYWORD_FIND", "MENTION", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum HighlightStyle {
    ORIGINAL_TEXT_BG(0),
    COMMENT_DOTTED_LINE(1),
    COMMENT_SELECTION_BG(2),
    COMMENT_SELECTION_UNDERLINE(3),
    KEYWORD_FIND(4),
    SYNC(5),
    INDEX_KEYWORD_FIND(6),
    MENTION(7);
    
    private final int value;

    public final int getValue() {
        return this.value;
    }

    private HighlightStyle(int i) {
        this.value = i;
    }
}

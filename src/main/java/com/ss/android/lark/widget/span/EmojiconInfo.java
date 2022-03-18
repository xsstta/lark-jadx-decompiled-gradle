package com.ss.android.lark.widget.span;

import android.graphics.drawable.Drawable;
import java.util.Objects;

public class EmojiconInfo extends SpanInfo {
    public Drawable drawable;
    public String key;

    @Override // com.ss.android.lark.widget.span.SpanInfo
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.key, this.drawable);
    }

    @Override // com.ss.android.lark.widget.span.SpanInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiconInfo) || !super.equals(obj)) {
            return false;
        }
        EmojiconInfo emojiconInfo = (EmojiconInfo) obj;
        if (!Objects.equals(this.key, emojiconInfo.key) || !Objects.equals(this.drawable, emojiconInfo.drawable)) {
            return false;
        }
        return true;
    }
}

package com.ss.android.lark.widget.span;

import java.util.List;
import java.util.Objects;

public class IntentionInfo extends TextStyleInfo {
    public String chatId;
    public List<String> chatterIds;
    public long duration;
    public long endTime;
    public boolean isAtAll;
    public boolean isMeetting;
    public String messageId;
    public long startTime;
    public String title;

    @Override // com.ss.android.lark.widget.span.SpanInfo, com.ss.android.lark.widget.span.TextStyleInfo
    public int hashCode() {
        return Objects.hash(this.chatId, this.messageId, this.title, this.chatterIds, Long.valueOf(this.startTime), Long.valueOf(this.endTime), Long.valueOf(this.duration), Boolean.valueOf(this.isAtAll), Boolean.valueOf(this.isMeetting));
    }

    @Override // com.ss.android.lark.widget.span.SpanInfo, com.ss.android.lark.widget.span.TextStyleInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentionInfo)) {
            return false;
        }
        IntentionInfo intentionInfo = (IntentionInfo) obj;
        if (Objects.equals(this.chatId, intentionInfo.chatId) && Objects.equals(this.messageId, intentionInfo.messageId) && Objects.equals(this.title, intentionInfo.title) && Objects.equals(this.chatterIds, intentionInfo.chatterIds) && this.startTime == intentionInfo.startTime && this.endTime == intentionInfo.endTime && this.duration == intentionInfo.duration && this.isAtAll == intentionInfo.isAtAll && this.isMeetting == intentionInfo.isMeetting) {
            return true;
        }
        return false;
    }
}

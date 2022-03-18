package com.ss.android.lark.widget.span;

import java.util.Objects;

public class AbbreviationInfo extends TextStyleInfo {
    public String chatId;
    public String desc;
    public String fullName;
    public String id;
    public int intervalOff = -1;
    public int intervalOn = -1;
    public String messageId;
    public String name;

    @Override // com.ss.android.lark.widget.span.SpanInfo, com.ss.android.lark.widget.span.TextStyleInfo
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.desc, this.fullName, this.chatId, this.messageId, Integer.valueOf(this.intervalOn), Integer.valueOf(this.intervalOff));
    }

    @Override // com.ss.android.lark.widget.span.SpanInfo, com.ss.android.lark.widget.span.TextStyleInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbbreviationInfo)) {
            return false;
        }
        AbbreviationInfo abbreviationInfo = (AbbreviationInfo) obj;
        if (!Objects.equals(this.id, abbreviationInfo.id) || !Objects.equals(this.name, abbreviationInfo.name) || !Objects.equals(this.desc, abbreviationInfo.desc) || !Objects.equals(this.fullName, abbreviationInfo.fullName) || !Objects.equals(this.chatId, abbreviationInfo.chatId) || !Objects.equals(this.messageId, abbreviationInfo.messageId) || !Objects.equals(Integer.valueOf(this.intervalOn), Integer.valueOf(abbreviationInfo.intervalOn)) || !Objects.equals(Integer.valueOf(this.intervalOff), Integer.valueOf(abbreviationInfo.intervalOff))) {
            return false;
        }
        return true;
    }
}

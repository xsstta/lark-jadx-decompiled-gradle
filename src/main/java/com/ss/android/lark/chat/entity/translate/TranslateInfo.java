package com.ss.android.lark.chat.entity.translate;

import com.ss.android.lark.chat.export.entity.message.Content;
import java.io.Serializable;
import java.util.Objects;

public class TranslateInfo implements Serializable {
    private String language;
    private String messageId;
    private Content translateContent;

    public String getLanguage() {
        return this.language;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public <T extends Content> T getTranslateContent() {
        return (T) this.translateContent;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.messageId;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.language;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Content content = this.translateContent;
        if (content != null) {
            i3 = content.hashCode();
        }
        return i5 + i3;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TranslateInfo translateInfo = (TranslateInfo) obj;
        if (Objects.equals(this.messageId, translateInfo.messageId) && Objects.equals(this.language, translateInfo.language)) {
            return Objects.equals(this.translateContent, translateInfo.translateContent);
        }
        return false;
    }

    public TranslateInfo(String str, String str2, Content content) {
        this.messageId = str;
        this.language = str2;
        this.translateContent = content;
    }
}

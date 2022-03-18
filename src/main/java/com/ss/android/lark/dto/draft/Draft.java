package com.ss.android.lark.dto.draft;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Draft implements Serializable {
    public String chatId;
    public RichText contentRichText;
    public long createTime;
    public String id;
    public Message message;
    public String messageId;
    public RichText postRichText;
    public ChatChatter sender;
    public String title;
    public String topicGroupId;
    public int type;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DRAFT_TYPE {
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Draft{getChatId='");
        sb.append(this.chatId);
        sb.append('\'');
        sb.append(", messageId='");
        sb.append(this.messageId);
        sb.append('\'');
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", contentRichText=");
        RichText richText = this.contentRichText;
        String str2 = "";
        if (richText == null || richText.getInnerText() == null) {
            str = str2;
        } else {
            str = this.contentRichText.getInnerText();
        }
        sb.append(str);
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", createTime=");
        sb.append(this.createTime);
        sb.append(", postRichText=");
        RichText richText2 = this.postRichText;
        if (!(richText2 == null || richText2.getInnerText() == null)) {
            str2 = this.postRichText.getInnerText();
        }
        sb.append(str2);
        sb.append('}');
        return sb.toString();
    }

    public boolean exactlyCompare(Draft draft) {
        if (draft == null) {
            return false;
        }
        if (this == draft) {
            return true;
        }
        String str = this.chatId;
        if (str == null) {
            if (draft.chatId != null) {
                return false;
            }
        } else if (!str.equals(draft.chatId)) {
            return false;
        }
        RichText richText = this.contentRichText;
        if (richText == null ? draft.contentRichText != null : !richText.equals(draft.contentRichText)) {
            return false;
        }
        String str2 = this.title;
        if (str2 == null ? draft.title != null : !str2.equals(draft.title)) {
            return false;
        }
        RichText richText2 = this.postRichText;
        RichText richText3 = draft.postRichText;
        if (richText2 != null) {
            return richText2.equals(richText3);
        }
        if (richText3 == null) {
            return true;
        }
        return false;
    }
}

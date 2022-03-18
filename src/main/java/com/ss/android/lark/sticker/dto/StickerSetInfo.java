package com.ss.android.lark.sticker.dto;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.sticker.StickerInfo;
import java.io.Serializable;

public class StickerSetInfo implements Serializable {
    private Message message;

    public Message getMessage() {
        return this.message;
    }

    private StickerContent getContent() {
        Message message2 = this.message;
        if (message2 == null) {
            return null;
        }
        return (StickerContent) message2.getContent();
    }

    public String getImageKey() {
        StickerContent content = getContent();
        if (content == null) {
            return "";
        }
        return content.getKey();
    }

    public String getStickerId() {
        StickerContent content = getContent();
        if (content == null) {
            return "";
        }
        return content.getStickerId();
    }

    public String getStickerSetId() {
        StickerContent content = getContent();
        if (content == null) {
            return "";
        }
        return content.getStickerSetId();
    }

    public String getStickerDesc() {
        StickerInfo stickerInfo;
        StickerContent content = getContent();
        if (content == null || (stickerInfo = content.getStickerInfo()) == null) {
            return "";
        }
        return stickerInfo.getTitle();
    }

    public void setMessage(Message message2) {
        this.message = message2;
    }
}

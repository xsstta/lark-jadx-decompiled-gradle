package com.ss.android.lark.biz.core.api;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.log.Log;
import java.io.Serializable;

public class FavoriteForwardData implements Serializable {
    private boolean forceStandAlone;
    private String id;
    private Message sourceMessage;

    public String getId() {
        return this.id;
    }

    public Message getSourceMessage() {
        return this.sourceMessage;
    }

    public boolean isForceStandAlone() {
        return this.forceStandAlone;
    }

    public void setForceStandAlone(boolean z) {
        this.forceStandAlone = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setSourceMessage(Message message) {
        this.sourceMessage = message;
    }

    public boolean interceptStickerBeforeForward(Context context, String str) {
        if (this.sourceMessage.getType() != Message.Type.STICKER) {
            return false;
        }
        StickerContent stickerContent = (StickerContent) this.sourceMessage.getContent();
        if (stickerContent == null) {
            Log.m165378d("interceptStickerBeforeForward called. StickerContent is null.");
            return false;
        } else if (stickerContent.isPaid()) {
            return false;
        } else {
            LKUIToast.show(context, str);
            return true;
        }
    }
}

package com.ss.android.lark.chat.chatwindow.chat.data.p1620a;

import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.m */
public class C33223m {
    /* renamed from: a */
    public static Sticker m128430a(StickerContent stickerContent) {
        if (stickerContent == null) {
            Log.m165383e("StickerConverter", "convert called. stickerContent is null.");
            return null;
        }
        Sticker sticker = new Sticker();
        sticker.setStickerId(stickerContent.getStickerId());
        sticker.setStickerSetId(stickerContent.getStickerSetId());
        sticker.setHasPaid(stickerContent.isPaid());
        sticker.setDesc(stickerContent.getDescription());
        sticker.setMode(Sticker.Mode.STICKER);
        ImageSet imageSet = new ImageSet();
        Image image = new Image();
        image.setKey(stickerContent.getKey());
        imageSet.setOrigin(image);
        sticker.setImageSet(imageSet);
        return sticker;
    }
}

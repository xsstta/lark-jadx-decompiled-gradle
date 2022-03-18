package com.ss.android.lark.sticker.p2714a;

import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.im.v1.Sticker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.a.h */
public class C55012h {
    /* renamed from: a */
    private static Image m213669a(com.ss.android.lark.image.entity.Image image) {
        if (image == null) {
            return null;
        }
        return new Image.C15009a().mo54849a(image.getKey()).mo54850a(image.getUrls()).mo54848a(Integer.valueOf(image.getWidth())).mo54852b(Integer.valueOf(image.getHeight())).mo54847a(Image.Type.fromValue(1)).build();
    }

    /* renamed from: a */
    private static ImageSet m213670a(com.ss.android.lark.chat.entity.image.ImageSet imageSet) {
        if (imageSet == null) {
            return null;
        }
        return new ImageSet.C15011a().mo54857a(imageSet.getKey()).mo54856a(m213669a(imageSet.getOrigin())).mo54859b(m213669a(imageSet.getThumbnail())).mo54860c(m213669a(imageSet.getMiddle())).build();
    }

    /* renamed from: a */
    private static Sticker m213671a(com.ss.android.lark.chat.entity.sticker.Sticker sticker) {
        int i;
        if (sticker == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(sticker.getPosition());
        ImageSet a = m213670a(sticker.getImageSet());
        String desc = sticker.getDesc();
        if (sticker.getMode() != null) {
            i = sticker.getMode().getNumber();
        } else {
            i = 1;
        }
        return new Sticker(valueOf, a, desc, Sticker.Mode.fromValue(i), Boolean.valueOf(sticker.isHasPaid()), sticker.getStickerSetId(), sticker.getStickerId(), sticker.getSmallUrl());
    }

    /* renamed from: a */
    public static List<Sticker> m213672a(List<com.ss.android.lark.chat.entity.sticker.Sticker> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.lark.chat.entity.sticker.Sticker sticker : list) {
            arrayList.add(m213671a(sticker));
        }
        return arrayList;
    }
}

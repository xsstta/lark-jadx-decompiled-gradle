package com.ss.android.lark.sticker.p2714a;

import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.sticker.Archive;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.chat.entity.sticker.StickerSetType;
import com.ss.android.lark.image.entity.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.sticker.a.l */
public class C55037l {
    /* renamed from: a */
    private static ImageSet m213708a(com.bytedance.lark.pb.basic.v1.ImageSet imageSet) {
        if (imageSet == null) {
            return null;
        }
        ImageSet imageSet2 = new ImageSet();
        imageSet2.setKey(imageSet.key);
        imageSet2.setOrigin(m213712a(imageSet.origin));
        imageSet2.setThumbnail(m213712a(imageSet.thumbnail));
        imageSet2.setMiddle(m213712a(imageSet.middle));
        return imageSet2;
    }

    /* renamed from: b */
    public static List<Sticker> m213714b(List<com.bytedance.lark.pb.im.v1.Sticker> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.lark.pb.im.v1.Sticker sticker : list) {
            arrayList.add(m213710a(sticker));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Archive m213709a(com.bytedance.lark.pb.im.v1.Archive archive) {
        if (archive == null) {
            return null;
        }
        Archive archive2 = new Archive();
        archive2.setKey(archive.key);
        archive2.setUrls(archive.urls);
        archive2.setSize(archive.size.longValue());
        archive2.setCheckSum(archive.checksum);
        archive2.setMime(archive.mime);
        archive2.setParams(archive.params);
        return archive2;
    }

    /* renamed from: a */
    private static Sticker m213710a(com.bytedance.lark.pb.im.v1.Sticker sticker) {
        if (sticker == null) {
            return null;
        }
        Sticker sticker2 = new Sticker();
        sticker2.setPosition(sticker.position.intValue());
        sticker2.setImageSet(m213708a(sticker.image));
        sticker2.setDesc(sticker.description);
        if (sticker.mode != null) {
            sticker2.setMode(Sticker.Mode.forNumber(sticker.mode.getValue()));
        }
        sticker2.setHasPaid(sticker.has_paid.booleanValue());
        sticker2.setStickerSetId(sticker.sticker_set_id);
        sticker2.setStickerId(sticker.sticker_id);
        sticker2.setSmallUrl(sticker.small_url);
        return sticker2;
    }

    /* renamed from: a */
    public static StickerSet m213711a(com.bytedance.lark.pb.im.v1.StickerSet stickerSet) {
        if (stickerSet == null) {
            return null;
        }
        StickerSet stickerSet2 = new StickerSet();
        stickerSet2.setStickerSetId(stickerSet.sticker_set_id);
        if (stickerSet.type != null) {
            stickerSet2.setStickerSetType(StickerSetType.forNumber(stickerSet.type.getValue()));
        }
        stickerSet2.setAuthorId(stickerSet.author_id);
        stickerSet2.setCover(m213712a(stickerSet.cover));
        stickerSet2.setPreview(m213712a(stickerSet.preview));
        stickerSet2.setIcon(m213712a(stickerSet.icon));
        stickerSet2.setVersion(stickerSet.version.intValue());
        stickerSet2.setUpdateTime(stickerSet.update_time.longValue());
        stickerSet2.setTitle(stickerSet.title);
        stickerSet2.setDescription(stickerSet.description);
        stickerSet2.setStickers(m213714b(stickerSet.stickers));
        stickerSet2.setArchive(m213709a(stickerSet.archive));
        if (stickerSet.perm != null) {
            stickerSet2.setPerm(StickerSet.Perm.forNumber(stickerSet.perm.getValue()));
        }
        stickerSet2.setHasPaid(stickerSet.has_paid.booleanValue());
        return stickerSet2;
    }

    /* renamed from: a */
    private static Image m213712a(com.bytedance.lark.pb.basic.v1.Image image) {
        if (image == null) {
            return null;
        }
        Image image2 = new Image();
        image2.setKey(image.key);
        image2.setWidth(image.width.intValue());
        image2.setHeight(image.height.intValue());
        image2.setUrls(new ArrayList(image.urls));
        image2.setType(Image.Type.forNumber(image.type.getValue()));
        return image2;
    }

    /* renamed from: a */
    public static List<StickerSet> m213713a(List<com.bytedance.lark.pb.im.v1.StickerSet> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (com.bytedance.lark.pb.im.v1.StickerSet stickerSet : list) {
            arrayList.add(m213711a(stickerSet));
        }
        return arrayList;
    }
}

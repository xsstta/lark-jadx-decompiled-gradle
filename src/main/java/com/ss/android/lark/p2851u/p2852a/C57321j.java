package com.ss.android.lark.p2851u.p2852a;

import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.dependency.AbstractC36509x;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.sdk.C53241h;

/* renamed from: com.ss.android.lark.u.a.j */
public class C57321j {
    /* renamed from: a */
    public static PassThroughImage m222116a(ImageSetPassThrough imageSetPassThrough) {
        return new PassThroughImage(imageSetPassThrough.key, imageSetPassThrough.fs_unit, imageSetPassThrough.crypto);
    }

    /* renamed from: a */
    public static ImageSet m222115a(com.bytedance.lark.pb.basic.v1.ImageSet imageSet, String str) {
        if (imageSet == null) {
            C53241h.m205900d("ModelParserImage", "pbImageSet is null, messageId is " + str);
        } else if (imageSet.thumbnail == null) {
            C53241h.m205900d("ModelParserImage", "thumbnail is null, messageId is " + str);
        } else if (CollectionUtils.isEmpty(imageSet.thumbnail.urls)) {
            C53241h.m205900d("ModelParserImage", "thumbnail urls is null, messageId is " + str);
        }
        ImageSet imageSet2 = new ImageSet();
        m222117a(imageSet, imageSet2);
        return imageSet2;
    }

    /* renamed from: a */
    static void m222117a(com.bytedance.lark.pb.basic.v1.ImageSet imageSet, ImageSet imageSet2) {
        Image image;
        String str;
        AbstractC36509x y = C29990c.m110930b().mo134597y();
        if (!(imageSet == null || imageSet.intact == null || imageSet.intact.exif_orientation.intValue() < 0)) {
            imageSet2.setIntact(y.mo134731a(imageSet.intact));
        }
        if (imageSet != null) {
            image = imageSet.origin;
        } else {
            image = null;
        }
        imageSet2.setOrigin(y.mo134731a(image));
        if (imageSet != null) {
            str = imageSet.key;
        } else {
            str = "";
        }
        imageSet2.setKey(str);
        imageSet2.setThumbnail(y.mo134732a(imageSet));
        imageSet2.setMiddle(y.mo134739b(imageSet));
        imageSet2.setInlinePreview(y.mo134741c(imageSet));
    }
}

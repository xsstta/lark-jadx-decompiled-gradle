package com.ss.android.lark.image.impl.p1969i;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.ss.android.lark.image.C38792a;
import com.ss.android.lark.image.entity.Image;
import java.util.ArrayList;
import okio.ByteString;

/* renamed from: com.ss.android.lark.image.impl.i.b */
public class C38918b {

    /* renamed from: a */
    private static boolean f100010a = C38792a.m153106a().mo142263b("lark.chat.thumbnail.webp.enable");

    /* renamed from: a */
    public static String m153612a(RichTextElement.ImageProperty imageProperty) {
        if (imageProperty == null) {
            return "";
        }
        if (!f100010a || imageProperty.thumbnail_webp == null || TextUtils.isEmpty(imageProperty.thumbnail_webp.key)) {
            return imageProperty.thumb_key;
        }
        return imageProperty.thumbnail_webp.key;
    }

    /* renamed from: b */
    public static String m153614b(RichTextElement.ImageProperty imageProperty) {
        if (imageProperty == null) {
            return "";
        }
        if (!f100010a || imageProperty.middle_webp == null || TextUtils.isEmpty(imageProperty.middle_webp.key)) {
            return imageProperty.middle_key;
        }
        return imageProperty.middle_webp.key;
    }

    /* renamed from: a */
    public static Image m153611a(ImageSet imageSet) {
        if (imageSet == null) {
            return null;
        }
        if (!f100010a || imageSet.thumbnail_webp == null || TextUtils.isEmpty(imageSet.thumbnail_webp.key)) {
            return m153610a(imageSet.thumbnail);
        }
        return m153610a(imageSet.thumbnail_webp);
    }

    /* renamed from: b */
    public static Image m153613b(ImageSet imageSet) {
        if (imageSet == null) {
            return null;
        }
        if (!f100010a || imageSet.middle_webp == null || TextUtils.isEmpty(imageSet.middle_webp.key)) {
            return m153610a(imageSet.middle);
        }
        return m153610a(imageSet.middle_webp);
    }

    /* renamed from: c */
    public static ByteString m153615c(ImageSet imageSet) {
        if (!C38792a.m153106a().mo142263b("messenger.picture.placeholder.push") || imageSet == null || imageSet.inline_preview == null || imageSet.inline_preview.size() == 0) {
            return null;
        }
        return imageSet.inline_preview;
    }

    /* renamed from: a */
    public static Image m153610a(com.bytedance.lark.pb.basic.v1.Image image) {
        boolean z;
        Integer num;
        Integer num2;
        Image image2 = new Image();
        if (image == null) {
            return image2;
        }
        image2.setKey(image.key);
        if (image.exif_orientation.intValue() >= 5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            num = image.height;
        } else {
            num = image.width;
        }
        image2.setWidth(num.intValue());
        if (z) {
            num2 = image.width;
        } else {
            num2 = image.height;
        }
        image2.setHeight(num2.intValue());
        image2.setUrls(new ArrayList(image.urls));
        image2.setType(Image.Type.forNumber(image.type.getValue()));
        return image2;
    }
}

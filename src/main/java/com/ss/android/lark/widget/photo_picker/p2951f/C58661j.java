package com.ss.android.lark.widget.photo_picker.p2951f;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.RichTextElement;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.service.TranslateImageService;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.ss.android.lark.widget.photo_picker.f.j */
public class C58661j {
    /* renamed from: b */
    public static String m227534b(RichTextElement.ImageProperty imageProperty) {
        if (imageProperty == null) {
            return "";
        }
        if (imageProperty.thumbnail_webp == null || TextUtils.isEmpty(imageProperty.thumbnail_webp.key)) {
            return imageProperty.thumb_key;
        }
        return imageProperty.thumbnail_webp.key;
    }

    /* renamed from: c */
    public static String m227535c(RichTextElement.ImageProperty imageProperty) {
        if (imageProperty == null) {
            return "";
        }
        if (imageProperty.middle_webp == null || TextUtils.isEmpty(imageProperty.middle_webp.key)) {
            return imageProperty.middle_key;
        }
        return imageProperty.middle_webp.key;
    }

    /* renamed from: a */
    public static ImageSet m227527a(com.bytedance.lark.pb.basic.v1.ImageSet imageSet) {
        if (imageSet == null) {
            return null;
        }
        ImageSet imageSet2 = new ImageSet();
        imageSet2.setKey(imageSet.key);
        imageSet2.setOrigin(m227529a(imageSet.origin));
        imageSet2.setThumbnail(m227529a(imageSet.thumbnail));
        imageSet2.setMiddle(m227529a(imageSet.middle));
        imageSet2.setInlinePreview(C58612c.m227290a().mo102832a(imageSet));
        return imageSet2;
    }

    /* renamed from: a */
    public static ImageSet m227528a(RichTextElement.ImageProperty imageProperty) {
        RichTextElement.ImageProperty d = m227536d(imageProperty);
        if (d == null) {
            return null;
        }
        Image a = m227530a(C59031e.m229176a(d, 0));
        String key = a.getKey();
        if (!TextUtils.isEmpty(key)) {
            return new ImageSet(key, a, a);
        }
        return null;
    }

    /* renamed from: d */
    private static RichTextElement.ImageProperty m227536d(RichTextElement.ImageProperty imageProperty) {
        if (imageProperty == null) {
            return null;
        }
        RichTextElement.ImageProperty imageProperty2 = new RichTextElement.ImageProperty();
        imageProperty2.setUrls(imageProperty.urls);
        imageProperty2.setToken(imageProperty.token);
        imageProperty2.setOriginKey(imageProperty.origin_key);
        imageProperty2.setMiddleKey(m227535c(imageProperty));
        imageProperty2.setThumbKey(m227534b(imageProperty));
        imageProperty2.setOriginWidth(imageProperty.origin_width.intValue());
        imageProperty2.setOriginHeight(imageProperty.origin_height.intValue());
        imageProperty2.setAlt(imageProperty.alt);
        imageProperty2.setAltI18nKey(imageProperty.alt_i18n_key);
        imageProperty2.setImgCanPreview(imageProperty.img_can_preview.booleanValue());
        return imageProperty2;
    }

    /* renamed from: a */
    private static Image m227529a(com.bytedance.lark.pb.basic.v1.Image image) {
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
    private static Image m227530a(com.ss.android.lark.widget.richtext.Image image) {
        if (image == null) {
            return null;
        }
        Image image2 = new Image();
        image2.setHeight(image.getHeight());
        image2.setWidth(image.getWidth());
        image2.setKey(image.getKey());
        image2.setToken(image.getToken());
        Image.Type type = image.getType();
        if (type != null) {
            image2.setType(Image.Type.forNumber(type.getNumber()));
        }
        image2.setUrls(image.getUrls());
        return image2;
    }

    /* renamed from: a */
    public static String m227532a(PhotoItem photoItem) {
        PhotoItem.PicInfo originPicInfo;
        if (photoItem == null || (originPicInfo = photoItem.getOriginPicInfo()) == null) {
            return "";
        }
        String str = originPicInfo.key;
        if (TextUtils.isEmpty(str)) {
            str = photoItem.getImageKey();
        }
        return m227533a(str);
    }

    /* renamed from: a */
    public static String m227533a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("origin:", "").replace("thumbnail:", "").replace("middle:", "");
    }

    /* renamed from: a */
    public static PhotoItem m227531a(ImageSet imageSet, boolean z) {
        if (imageSet == null) {
            return null;
        }
        PhotoItem photoItem = C58659h.m227513a(Collections.singletonList(imageSet)).get(0);
        if (z) {
            TranslateImageService.INSTANCE.detectCanTranslate(photoItem);
        }
        return photoItem;
    }
}

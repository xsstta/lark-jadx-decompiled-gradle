package com.ss.android.lark.chat.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.base.view.vo.message.ImageContentVO;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2851u.p2852a.C57305aa;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chat.utils.s */
public class C34353s {
    /* renamed from: a */
    public static List<PhotoItem> m133246a(List<Image> list, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (Image image : list) {
            if (image == null) {
                Log.m165383e("PhotoUtils", "PhotoItem image is empty");
            } else if (TextUtils.isEmpty(image.getKey())) {
                Log.m165383e("PhotoUtils", "PhotoItem secure key is empty");
            } else {
                String key = image.getKey();
                PhotoItem messageId = new PhotoItem().setPaths(image.getUrls()).setImageKey(key).setType(2).setToken(image.getToken()).setMessageId(str);
                messageId.getTranslateProperty().setTranslated(z);
                arrayList.add(messageId);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m133248a(PhotoItem photoItem, PhotoItem photoItem2) {
        String messageId = photoItem.getMessageId();
        String messageId2 = photoItem2.getMessageId();
        if ((TextUtils.isEmpty(messageId) || TextUtils.isEmpty(messageId2) || TextUtils.equals(messageId, messageId2)) && photoItem.getTranslateProperty().isTranslated() == photoItem2.getTranslateProperty().isTranslated()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<PhotoItem> m133244a(List<Image> list) {
        return m133247a(list, false);
    }

    /* renamed from: a */
    private static PhotoItem.PicInfo m133239a(Image image) {
        if (image == null) {
            return new PhotoItem.PicInfo("", new ArrayList(), 0, 0);
        }
        return new PhotoItem.PicInfo(image.getKey(), image.getUrls(), image.getWidth(), image.getHeight());
    }

    /* renamed from: a */
    public static List<PhotoItem> m133245a(List<Image> list, String str) {
        return m133246a(list, str, false);
    }

    /* renamed from: a */
    public static List<PhotoItem> m133247a(List<Image> list, boolean z) {
        return m133246a(list, "", z);
    }

    /* renamed from: b */
    private static boolean m133249b(PhotoItem photoItem, PhotoItem photoItem2) {
        String token = photoItem.getToken();
        String token2 = photoItem2.getToken();
        if (TextUtils.isEmpty(token) || TextUtils.isEmpty(token2) || !token.equals(token2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m133238a(List<PhotoItem> list, PhotoItem photoItem) {
        if (CollectionUtils.isEmpty(list) || photoItem == null) {
            return -1;
        }
        Object tag = photoItem.getTag();
        String imageKey = photoItem.getImageKey();
        for (int i = 0; i < list.size(); i++) {
            PhotoItem photoItem2 = list.get(i);
            String imageKey2 = photoItem2.getImageKey();
            if (m133248a(photoItem, photoItem2)) {
                if (!m133249b(photoItem2, photoItem)) {
                    if (!TextUtils.isEmpty(imageKey) && TextUtils.equals(imageKey2, imageKey)) {
                        Object tag2 = photoItem2.getTag();
                        if (!(tag == null || tag2 == null || tag == tag2)) {
                        }
                    }
                }
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static PhotoItem m133240a(ImageContentVO fVar, String str) {
        if (fVar == null) {
            return null;
        }
        Image b = fVar.mo121844b();
        if (b == null) {
            Log.m165383e("PhotoUtils", "PhotoItem getOrigin image is empty");
            return null;
        } else if (TextUtils.isEmpty(b.getKey())) {
            Log.m165383e("PhotoUtils", "PhotoItem secure key is empty");
            return null;
        } else {
            String key = b.getKey();
            String token = b.getToken();
            MessageIdentity h = fVar.mo121850h();
            if (h == null || TextUtils.isEmpty(h.getMessageId())) {
                h = new MessageIdentity(str, "");
            }
            PhotoItem originSize = new PhotoItem().setPaths(b.getUrls()).setImageKey(key).setOriginPicInfo(m133239a(fVar.mo121844b())).setMiddlePicInfo(m133239a(fVar.mo121847e())).setThumbnailPicInfo(m133239a(fVar.mo121846d())).setInlinePreview(fVar.mo121848f()).setMessageIdentity(h).setType(2).setToken(token).setOriginSource(fVar.mo121851j()).setOriginSize(fVar.mo121852k());
            originSize.getTranslateProperty().setTranslated(fVar.mo121814i());
            originSize.getPhotoState().setFromMe(fVar.mo121853l());
            return originSize;
        }
    }

    /* renamed from: a */
    public static PhotoItem m133241a(ImageSet imageSet, String str) {
        if (imageSet == null) {
            return null;
        }
        Image origin = imageSet.getOrigin();
        if (origin == null) {
            Log.m165383e("PhotoUtils", "PhotoItem getOrigin image is empty");
            return null;
        } else if (TextUtils.isEmpty(origin.getKey())) {
            Log.m165383e("PhotoUtils", "PhotoItem secure key is empty");
            return null;
        } else {
            String key = origin.getKey();
            String token = origin.getToken();
            MessageIdentity messageIdentity = imageSet.getMessageIdentity();
            if (messageIdentity == null || TextUtils.isEmpty(messageIdentity.getMessageId())) {
                messageIdentity = new MessageIdentity(str, "");
            }
            PhotoItem originSize = new PhotoItem().setPaths(origin.getUrls()).setImageKey(key).setOriginPicInfo(m133239a(imageSet.getOrigin())).setMiddlePicInfo(m133239a(imageSet.getMiddle())).setThumbnailPicInfo(m133239a(imageSet.getThumbnail())).setInlinePreview(imageSet.getInlinePreview()).setMessageIdentity(messageIdentity).setType(2).setToken(token).setOriginSource(imageSet.isOriginSource()).setOriginSize(imageSet.getOriginSize());
            originSize.getTranslateProperty().setTranslated(imageSet.isTranslated());
            originSize.getPhotoState().setFromMe(imageSet.isFromMe());
            return originSize;
        }
    }

    /* renamed from: a */
    public static List<ImageSet> m133243a(RichText richText, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (richText != null && !C59035h.m229210a(richText) && !CollectionUtils.isEmpty(richText.getImageIds())) {
            Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
            for (String str : richText.getImageIds()) {
                RichTextElement richTextElement = dictionary.get(str);
                if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.ImageProperty)) {
                    RichTextElement.ImageProperty imageProperty = (RichTextElement.ImageProperty) richTextElement.getProperty();
                    ImageSet imageSet = new ImageSet();
                    imageSet.setKey(imageProperty.getOriginKey());
                    com.ss.android.lark.widget.richtext.Image a = C59031e.m229176a(imageProperty, 0);
                    com.ss.android.lark.widget.richtext.Image a2 = C59031e.m229176a(imageProperty, 1);
                    com.ss.android.lark.widget.richtext.Image a3 = C59031e.m229176a(imageProperty, 2);
                    imageSet.setOrigin(C57305aa.m222055a(a));
                    imageSet.setMiddle(C57305aa.m222055a(a2));
                    imageSet.setThumbnail(C57305aa.m222055a(a3));
                    imageSet.setOriginSource(imageProperty.isOriginSource());
                    imageSet.setOriginSize(imageProperty.getOriginSize());
                    imageSet.setFromMe(z);
                    arrayList.add(imageSet);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static PhotoItem m133242a(RichText richText, Image image, String str, boolean z) {
        String str2;
        String str3;
        if (!(richText == null || image == null)) {
            List<ImageSet> a = m133243a(richText, z);
            if (CollectionUtils.isEmpty(a)) {
                return null;
            }
            for (ImageSet imageSet : a) {
                String key = image.getKey();
                String str4 = "";
                if (imageSet.getOrigin() != null) {
                    str2 = imageSet.getOrigin().getKey();
                } else {
                    str2 = str4;
                }
                if (imageSet.getMiddle() != null) {
                    str3 = imageSet.getMiddle().getKey();
                } else {
                    str3 = str4;
                }
                if (imageSet.getThumbnail() != null) {
                    str4 = imageSet.getThumbnail().getKey();
                }
                if (TextUtils.isEmpty(key)) {
                    List<String> urls = image.getUrls();
                    Image origin = imageSet.getOrigin();
                    if (CollectionUtils.isNotEmpty(urls) && origin != null && CollectionUtils.isNotEmpty(origin.getUrls())) {
                        String str5 = urls.get(0);
                        if (!TextUtils.isEmpty(str5) && str5.equals(origin.getUrls().get(0))) {
                            return m133241a(imageSet, str);
                        }
                    }
                } else if (key.equals(str2) || key.equals(str3) || key.equals(str4)) {
                    return m133241a(imageSet, str);
                }
            }
        }
        return null;
    }
}

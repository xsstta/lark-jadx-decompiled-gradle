package com.ss.android.lark.widget.photo_picker.p2951f;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.photo_picker.f.h */
public class C58659h {
    /* renamed from: a */
    public static List<PhotoItem> m227513a(List<? extends ImageSet> list) {
        return m227514a(list, "");
    }

    /* renamed from: a */
    private static MediaExtra m227509a(ImageSet imageSet) {
        if (imageSet instanceof MediaImageSet) {
            return ((MediaImageSet) imageSet).getMediaExtra();
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m227518b(PhotoItem photoItem) {
        if (photoItem.getMessageIdentity() == null || !photoItem.getMessageIdentity().isHideEditor()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m227519c(PhotoItem photoItem) {
        String str = photoItem.getOriginPicInfo().key;
        if (TextUtils.isEmpty(str)) {
            str = photoItem.getImageKey();
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: e */
    private static boolean m227522e(PhotoItem photoItem) {
        for (String str : photoItem.getPaths()) {
            if (C26311p.m95294n(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static PhotoItem.PicInfo m227510a(Image image) {
        if (image == null) {
            return new PhotoItem.PicInfo("", new ArrayList(), 0, 0);
        }
        return new PhotoItem.PicInfo(image.getKey(), image.getUrls(), image.getWidth(), image.getHeight());
    }

    /* renamed from: b */
    public static List<PhotoItem> m227517b(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (String str : list) {
            if (URLUtil.isNetworkUrl(str)) {
                arrayList.add(new PhotoItem().setPaths(Collections.singletonList(str)).setImageKey(m227512a(str)));
            } else {
                arrayList.add(new PhotoItem().setPaths(Collections.singletonList(str)).setImageKey(str).setType(3));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<PhotoItem> m227520c(List<Image> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (Image image : list) {
            if (image == null) {
                Log.m165382e("PhotoItem image is empty");
            } else if (TextUtils.isEmpty(image.getKey())) {
                Log.m165382e("PhotoItem secure key is empty");
            } else {
                String key = image.getKey();
                arrayList.add(new PhotoItem().setPaths(image.getUrls()).setImageKey(key).setType(2).setToken(image.getToken()));
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static String m227521d(PhotoItem photoItem) {
        String str;
        boolean b = C58612c.m227290a().mo102854b("lark_messenger_image_key_intact");
        PhotoItem.PicInfo intactPicInfo = photoItem.getIntactPicInfo();
        if (!b || intactPicInfo == null) {
            str = null;
        } else {
            str = intactPicInfo.key;
        }
        if (TextUtils.isEmpty(str)) {
            str = m227519c(photoItem);
        }
        Log.m165389i("ImageDownload", "get download image key use intact: " + str + ", messageId: " + photoItem.getMessageId());
        if (str != null) {
            return str;
        }
        return "";
    }

    /* renamed from: a */
    private static String m227512a(String str) {
        String stripAnchor = URLUtil.stripAnchor(str);
        int indexOf = stripAnchor.indexOf(63);
        if (indexOf != -1) {
            stripAnchor = stripAnchor.substring(0, indexOf);
        }
        int lastIndexOf = stripAnchor.lastIndexOf("/");
        if (lastIndexOf >= 0 && lastIndexOf < stripAnchor.length()) {
            stripAnchor = stripAnchor.substring(lastIndexOf + 1);
        }
        int indexOf2 = stripAnchor.indexOf("~");
        if (indexOf2 >= 0 && indexOf2 < stripAnchor.length()) {
            stripAnchor = stripAnchor.substring(0, indexOf2);
        }
        Log.m165378d("getUrlKey urlKey = " + stripAnchor);
        return stripAnchor;
    }

    /* renamed from: a */
    public static boolean m227515a(PhotoItem photoItem) {
        if (photoItem.getImageKey() == null || photoItem.getImageKey().contains("http") || m227522e(photoItem)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m227508a(List<PhotoItem> list, PhotoItem photoItem) {
        if (CollectionUtils.isEmpty(list) || photoItem == null) {
            return -1;
        }
        Object tag = photoItem.getTag();
        String imageKey = photoItem.getImageKey();
        for (int i = 0; i < list.size(); i++) {
            PhotoItem photoItem2 = list.get(i);
            String imageKey2 = photoItem2.getImageKey();
            if (!m227516a(photoItem2, photoItem)) {
                if (!TextUtils.isEmpty(imageKey) && TextUtils.equals(imageKey2, imageKey)) {
                    Object tag2 = photoItem2.getTag();
                    if (!(tag == null || tag2 == null || tag == tag2)) {
                    }
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: a */
    public static List<PhotoItem> m227514a(List<? extends ImageSet> list, String str) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (ImageSet imageSet : list) {
            Image origin = imageSet.getOrigin();
            if (origin == null) {
                Log.m165382e("PhotoItem getOrigin image is empty");
            } else if (TextUtils.isEmpty(origin.getKey())) {
                Log.m165382e("PhotoItem secure key is empty");
            } else {
                String key = origin.getKey();
                String token = origin.getToken();
                MessageIdentity messageIdentity = imageSet.getMessageIdentity();
                if (messageIdentity == null || TextUtils.isEmpty(messageIdentity.getMessageId())) {
                    messageIdentity = new MessageIdentity(str, "");
                }
                PhotoItem originSize = new PhotoItem().setPaths(origin.getUrls()).setImageKey(key).setIntactPicInfo(m227510a(imageSet.getIntact())).setOriginPicInfo(m227510a(imageSet.getOrigin())).setMiddlePicInfo(m227510a(imageSet.getMiddle())).setThumbnailPicInfo(m227510a(imageSet.getThumbnail())).setInlinePreview(imageSet.getInlinePreview()).setMessageIdentity(messageIdentity).setType(2).setToken(token).setMediaExtra(m227509a(imageSet)).setOriginSource(imageSet.isOriginSource()).setOriginSize(imageSet.getOriginSize());
                originSize.getTranslateProperty().setTranslated(imageSet.isTranslated());
                originSize.getPhotoState().setFromMe(imageSet.isFromMe());
                arrayList.add(originSize);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static boolean m227516a(PhotoItem photoItem, PhotoItem photoItem2) {
        String token = photoItem.getToken();
        String token2 = photoItem2.getToken();
        if (TextUtils.isEmpty(token) || TextUtils.isEmpty(token2) || !token.equals(token2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static synchronized File m227511a(IRequestCreator iRequestCreator, PhotoItem photoItem, String str, String str2) {
        File b;
        synchronized (C58659h.class) {
            b = C58612c.m227290a().mo102850b(iRequestCreator, str, str2, photoItem.getEntityId(), m227515a(photoItem), photoItem.getType());
        }
        return b;
    }
}

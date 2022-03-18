package com.ss.android.lark.widget.richtext;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.widget.richtext.Image;
import com.ss.android.lark.widget.richtext.RichTextElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.widget.richtext.e */
public class C59031e {
    /* renamed from: a */
    public static List<Image> m229179a(RichText richText) {
        return m229180a(richText, 0, false);
    }

    /* renamed from: h */
    public static List<Image> m229190h(RichText richText) {
        return m229180a(richText, 0, true);
    }

    /* renamed from: d */
    public static boolean m229186d(RichText richText) {
        return m229178a(richText, true).contains(C57814c.m224347a());
    }

    /* renamed from: b */
    public static List<RichTextElement.MediaProperty> m229183b(RichText richText) {
        ArrayList arrayList = new ArrayList();
        if (richText != null && !C59035h.m229210a(richText)) {
            for (Map.Entry<String, RichTextElement> entry : richText.getElements().getDictionary().entrySet()) {
                RichTextElement value = entry.getValue();
                if (value.getProperty() instanceof RichTextElement.MediaProperty) {
                    arrayList.add((RichTextElement.MediaProperty) value.getProperty());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static boolean m229185c(RichText richText) {
        ArrayList<String> a = m229178a(richText, false);
        if (a.size() > 1 || (a.size() == 1 && !TextUtils.equals(C57814c.m224347a(), a.get(0)))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static List<String> m229187e(RichText richText) {
        if (C59035h.m229210a(richText) || CollectionUtils.isEmpty(richText.getAnchorIds())) {
            return Collections.emptyList();
        }
        List<String> anchorIds = richText.getAnchorIds();
        ArrayList arrayList = new ArrayList(anchorIds.size());
        Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
        for (String str : anchorIds) {
            RichTextElement richTextElement = dictionary.get(str);
            if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.AnchorProperty)) {
                arrayList.add(((RichTextElement.AnchorProperty) richTextElement.getProperty()).getHref());
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public static List<String> m229188f(RichText richText) {
        if (C59035h.m229210a(richText)) {
            return Collections.emptyList();
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, RichTextElement> entry : richText.getElements().getDictionary().entrySet()) {
            RichTextElement value = entry.getValue();
            if (value != null && (value.getProperty() instanceof RichTextElement.EmotionProperty)) {
                hashSet.add(((RichTextElement.EmotionProperty) value.getProperty()).getKey());
            }
        }
        return new ArrayList(hashSet);
    }

    /* renamed from: g */
    public static List<String> m229189g(RichText richText) {
        if (C59035h.m229210a(richText)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, RichTextElement> entry : richText.getElements().getDictionary().entrySet()) {
            RichTextElement value = entry.getValue();
            if (value != null && (value.getProperty() instanceof RichTextElement.EmotionProperty)) {
                arrayList.add(((RichTextElement.EmotionProperty) value.getProperty()).getKey());
            }
        }
        return new ArrayList(arrayList);
    }

    /* renamed from: a */
    public static boolean m229181a(RichText richText, String str) {
        return m229178a(richText, false).contains(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.lark.widget.richtext.RichTextElement.MediaProperty m229177a(com.ss.android.lark.widget.richtext.RichText r4, com.ss.android.lark.widget.span.MediaInfo r5) {
        /*
            java.util.List r4 = m229183b(r4)
            boolean r0 = com.larksuite.framework.utils.CollectionUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0010:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r4.next()
            com.ss.android.lark.widget.richtext.RichTextElement$MediaProperty r0 = (com.ss.android.lark.widget.richtext.RichTextElement.MediaProperty) r0
            java.lang.String r2 = r5.key
            java.lang.String r3 = r0.getKey()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0029
            return r0
        L_0x0029:
            java.lang.String r2 = r5.url
            java.lang.String r3 = r0.getUrl()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0010
            return r0
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.richtext.C59031e.m229177a(com.ss.android.lark.widget.richtext.RichText, com.ss.android.lark.widget.span.MediaInfo):com.ss.android.lark.widget.richtext.RichTextElement$MediaProperty");
    }

    /* renamed from: c */
    private static String m229184c(RichTextElement.ImageProperty imageProperty, int i) {
        String str;
        if (i == 0) {
            str = imageProperty.getOriginKey();
        } else if (i == 1) {
            str = imageProperty.getMiddleKey();
        } else if (i != 2) {
            str = imageProperty.getOriginKey();
        } else {
            str = imageProperty.getThumbKey();
        }
        if (TextUtils.isEmpty(str)) {
            return imageProperty.getOriginKey();
        }
        return str;
    }

    /* renamed from: a */
    public static Image m229176a(RichTextElement.ImageProperty imageProperty, int i) {
        if (imageProperty == null) {
            return null;
        }
        Image image = new Image();
        image.setHeight(imageProperty.getOriginHeight());
        image.setWidth(imageProperty.getOriginWidth());
        if (TextUtils.isEmpty(imageProperty.getOriginKey())) {
            image.setUrls(imageProperty.getUrls());
            image.setToken(imageProperty.getToken());
            image.setType(Image.Type.NORMAL);
        } else {
            String token = imageProperty.getToken();
            if (!TextUtils.isEmpty(token)) {
                image.setToken(token);
                String c = m229184c(imageProperty, i);
                image.setKey(c);
                image.setType(Image.Type.ENCRYPTED);
                if (c.startsWith("origin:")) {
                    c = c.substring(7);
                } else if (c.startsWith("middle:")) {
                    c = c.substring(7);
                } else if (c.startsWith("thumb:")) {
                    c = c.substring(6);
                }
                List<String> urls = imageProperty.getUrls();
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = urls.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next() + c);
                }
                image.setUrls(arrayList);
            } else {
                image.setKey(imageProperty.getOriginKey());
                image.setType(Image.Type.NORMAL);
                image.setUrls(imageProperty.getUrls());
            }
        }
        return image;
    }

    /* renamed from: b */
    public static Image m229182b(RichTextElement.ImageProperty imageProperty, int i) {
        if (imageProperty == null) {
            return null;
        }
        Image image = new Image();
        image.setHeight(imageProperty.getOriginHeight());
        image.setWidth(imageProperty.getOriginWidth());
        if (TextUtils.isEmpty(imageProperty.getToken())) {
            String c = m229184c(imageProperty, i);
            image.setKey(c);
            List<String> urls = imageProperty.getUrls();
            ArrayList arrayList = new ArrayList();
            if (!CollectionUtils.isEmpty(urls)) {
                Iterator<String> it = urls.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next() + c);
                }
            }
            image.setUrls(arrayList);
            image.setType(Image.Type.NORMAL);
        } else {
            image.setToken(imageProperty.getToken());
            String c2 = m229184c(imageProperty, i);
            image.setKey(c2);
            image.setType(Image.Type.ENCRYPTED);
            if (c2.startsWith("origin:")) {
                c2 = c2.substring(7);
            } else if (c2.startsWith("middle:")) {
                c2 = c2.substring(7);
            } else if (c2.startsWith("thumb:")) {
                c2 = c2.substring(6);
            }
            List<String> urls2 = imageProperty.getUrls();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it2 = urls2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next() + c2);
            }
            image.setUrls(arrayList2);
        }
        return image;
    }

    /* renamed from: a */
    public static ArrayList<String> m229178a(RichText richText, boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (richText != null && !C59035h.m229210a(richText) && !CollectionUtils.isEmpty(richText.getAtIds())) {
            List<String> atIds = richText.getAtIds();
            Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
            for (String str : atIds) {
                RichTextElement richTextElement = dictionary.get(str);
                if (!(richTextElement == null || richTextElement.getProperty() == null || !(richTextElement.getProperty() instanceof RichTextElement.AtProperty))) {
                    String userId = ((RichTextElement.AtProperty) richTextElement.getProperty()).getUserId();
                    if (TextUtils.isEmpty(userId)) {
                        continue;
                    } else if (!userId.equals(C57814c.m224347a()) || !z) {
                        arrayList.add(userId);
                    } else {
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        arrayList2.add(C57814c.m224347a());
                        return arrayList2;
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Image m229175a(RichText richText, String str, String str2) {
        boolean z;
        List<Image> a = m229179a(richText);
        if (CollectionUtils.isEmpty(a)) {
            return null;
        }
        boolean z2 = !TextUtils.isEmpty(str);
        boolean z3 = !TextUtils.isEmpty(str2);
        for (Image image : a) {
            boolean z4 = false;
            if (!z2 || !TextUtils.equals(str, image.getToken())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return image;
            }
            if (z3 && TextUtils.equals(str2, image.getFirstUrl())) {
                z4 = true;
                continue;
            }
            if (z4) {
                return image;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<Image> m229180a(RichText richText, int i, boolean z) {
        Image a;
        ArrayList arrayList = new ArrayList();
        if (richText != null && !C59035h.m229210a(richText) && !CollectionUtils.isEmpty(richText.getImageIds())) {
            Map<String, RichTextElement> dictionary = richText.getElements().getDictionary();
            for (String str : richText.getImageIds()) {
                RichTextElement richTextElement = dictionary.get(str);
                if (richTextElement != null && (richTextElement.getProperty() instanceof RichTextElement.ImageProperty)) {
                    RichTextElement.ImageProperty imageProperty = (RichTextElement.ImageProperty) richTextElement.getProperty();
                    if ((!z || imageProperty.isImgCanPreview()) && (a = m229176a(imageProperty, i)) != null) {
                        arrayList.add(a);
                    }
                }
            }
        }
        return arrayList;
    }
}

package com.ss.android.lark.p2851u.p2852a;

import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.widget.richtext.Image;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.u.a.aa */
public class C57305aa {
    /* renamed from: a */
    public static Image m222055a(com.ss.android.lark.widget.richtext.Image image) {
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
    public static List<com.ss.android.lark.image.entity.Image> m222056a(List<com.ss.android.lark.widget.richtext.Image> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (com.ss.android.lark.widget.richtext.Image image : list) {
            if (image != null) {
                arrayList.add(m222055a(image));
            }
        }
        return arrayList;
    }
}

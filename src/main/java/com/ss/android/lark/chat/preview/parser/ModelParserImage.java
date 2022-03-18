package com.ss.android.lark.chat.preview.parser;

import com.bytedance.lark.pb.basic.v1.Image;
import com.ss.android.lark.chat.preview.entity.component.ImageSet;
import com.ss.android.lark.image.entity.Image;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/preview/parser/ModelParserImage;", "", "()V", "parseImageFromPb", "Lcom/ss/android/lark/image/entity/Image;", "pbImage", "Lcom/bytedance/lark/pb/basic/v1/Image;", "parseImageSetFromPb", "Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "pbImageSet", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.c.a */
public final class ModelParserImage {

    /* renamed from: a */
    public static final ModelParserImage f88125a = new ModelParserImage();

    private ModelParserImage() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final ImageSet m132266a(com.bytedance.lark.pb.basic.v1.ImageSet imageSet) {
        if (imageSet == null) {
            return null;
        }
        return new ImageSet(imageSet.key, m132267a(imageSet.origin), m132267a(imageSet.thumbnail), m132267a(imageSet.middle), m132267a(imageSet.thumbnail_webp), m132267a(imageSet.middle_webp), m132267a(imageSet.middle_mp4), m132267a(imageSet.cover));
    }

    @JvmStatic
    /* renamed from: a */
    public static final Image m132267a(com.bytedance.lark.pb.basic.v1.Image image) {
        if (image == null) {
            return null;
        }
        Image image2 = new Image();
        Image.Type type = image.type;
        Intrinsics.checkExpressionValueIsNotNull(type, "pbImage.type");
        image2.setType(Image.Type.valueOf(type.getValue()));
        Integer num = image.width;
        Intrinsics.checkExpressionValueIsNotNull(num, "pbImage.width");
        image2.setWidth(num.intValue());
        Integer num2 = image.height;
        Intrinsics.checkExpressionValueIsNotNull(num2, "pbImage.height");
        image2.setHeight(num2.intValue());
        image2.setKey(image.key);
        image2.setUrls(image.urls);
        return image2;
    }
}

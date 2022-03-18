package com.ss.android.lark.chat.entity.message.content;

import com.alibaba.fastjson.annotation.JSONType;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0000J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0016J\u0012\u0010\u0019\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/content/ImageContent;", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()V", "imageSet", "Lcom/ss/android/lark/chat/entity/image/ImageSet;", "(Lcom/ss/android/lark/chat/entity/image/ImageSet;)V", "getImageSet", "()Lcom/ss/android/lark/chat/entity/image/ImageSet;", "setImageSet", "imageTranslateProperty", "Lcom/ss/android/lark/chat/entity/message/content/ImageTranslateProperty;", "getImageTranslateProperty", "()Lcom/ss/android/lark/chat/entity/message/content/ImageTranslateProperty;", "setImageTranslateProperty", "(Lcom/ss/android/lark/chat/entity/message/content/ImageTranslateProperty;)V", "progress", "", "getProgress", "()I", "setProgress", "(I)V", "copy", "isContentSame", "", "diffable", "isItemSame", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
@JSONType(typeName = "ImageContent")
public final class ImageContent extends Content {
    private ImageSet imageSet;
    private ImageTranslateProperty imageTranslateProperty = new ImageTranslateProperty(null, null, 3, null);
    private int progress = 100;

    public final ImageSet getImageSet() {
        return this.imageSet;
    }

    public final ImageTranslateProperty getImageTranslateProperty() {
        return this.imageTranslateProperty;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final ImageContent copy() {
        ImageContent imageContent = new ImageContent();
        imageContent.imageSet = this.imageSet;
        imageContent.progress = this.progress;
        return imageContent;
    }

    public ImageContent() {
    }

    public final void setImageSet(ImageSet imageSet2) {
        this.imageSet = imageSet2;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setImageTranslateProperty(ImageTranslateProperty imageTranslateProperty2) {
        Intrinsics.checkParameterIsNotNull(imageTranslateProperty2, "<set-?>");
        this.imageTranslateProperty = imageTranslateProperty2;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isContentSame(Content content) {
        if (content == null || !(content instanceof ImageContent) || this.progress != ((ImageContent) content).progress) {
            return false;
        }
        return true;
    }

    public ImageContent(ImageSet imageSet2) {
        Intrinsics.checkParameterIsNotNull(imageSet2, "imageSet");
        this.imageSet = imageSet2;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.Content
    public boolean isItemSame(Content content) {
        if (!(content instanceof ImageContent)) {
            return false;
        }
        if (this == content) {
            return true;
        }
        ImageSet imageSet2 = ((ImageContent) content).imageSet;
        ImageSet imageSet3 = this.imageSet;
        if (imageSet3 == null || imageSet2 == null) {
            return false;
        }
        if (imageSet3 == null) {
            Intrinsics.throwNpe();
        }
        return Intrinsics.areEqual(imageSet3.getKey(), imageSet2.getKey());
    }
}

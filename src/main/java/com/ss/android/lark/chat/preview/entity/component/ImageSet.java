package com.ss.android.lark.chat.preview.entity.component;

import com.ss.android.lark.image.entity.Image;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0000J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ji\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J\b\u0010%\u001a\u00020&H\u0016J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006("}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/ImageSet;", "Ljava/io/Serializable;", "key", "", "origin", "Lcom/ss/android/lark/image/entity/Image;", "thumbnail", "middle", "thumbnailWebp", "middleWebp", "middleMp4", "cover", "(Ljava/lang/String;Lcom/ss/android/lark/image/entity/Image;Lcom/ss/android/lark/image/entity/Image;Lcom/ss/android/lark/image/entity/Image;Lcom/ss/android/lark/image/entity/Image;Lcom/ss/android/lark/image/entity/Image;Lcom/ss/android/lark/image/entity/Image;Lcom/ss/android/lark/image/entity/Image;)V", "getCover", "()Lcom/ss/android/lark/image/entity/Image;", "getKey", "()Ljava/lang/String;", "getMiddle", "getMiddleMp4", "getMiddleWebp", "getOrigin", "getThumbnail", "getThumbnailWebp", "clone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ImageSet implements Serializable {
    private final Image cover;
    private final String key;
    private final Image middle;
    private final Image middleMp4;
    private final Image middleWebp;
    private final Image origin;
    private final Image thumbnail;
    private final Image thumbnailWebp;

    public ImageSet() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ ImageSet copy$default(ImageSet imageSet, String str, Image image, Image image2, Image image3, Image image4, Image image5, Image image6, Image image7, int i, Object obj) {
        return imageSet.copy((i & 1) != 0 ? imageSet.key : str, (i & 2) != 0 ? imageSet.origin : image, (i & 4) != 0 ? imageSet.thumbnail : image2, (i & 8) != 0 ? imageSet.middle : image3, (i & 16) != 0 ? imageSet.thumbnailWebp : image4, (i & 32) != 0 ? imageSet.middleWebp : image5, (i & 64) != 0 ? imageSet.middleMp4 : image6, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? imageSet.cover : image7);
    }

    public final String component1() {
        return this.key;
    }

    public final Image component2() {
        return this.origin;
    }

    public final Image component3() {
        return this.thumbnail;
    }

    public final Image component4() {
        return this.middle;
    }

    public final Image component5() {
        return this.thumbnailWebp;
    }

    public final Image component6() {
        return this.middleWebp;
    }

    public final Image component7() {
        return this.middleMp4;
    }

    public final Image component8() {
        return this.cover;
    }

    public final ImageSet copy(String str, Image image, Image image2, Image image3, Image image4, Image image5, Image image6, Image image7) {
        return new ImageSet(str, image, image2, image3, image4, image5, image6, image7);
    }

    public String toString() {
        return "ImageSet(key=" + this.key + ", origin=" + this.origin + ", thumbnail=" + this.thumbnail + ", middle=" + this.middle + ", thumbnailWebp=" + this.thumbnailWebp + ", middleWebp=" + this.middleWebp + ", middleMp4=" + this.middleMp4 + ", cover=" + this.cover + ")";
    }

    public final Image getCover() {
        return this.cover;
    }

    public final String getKey() {
        return this.key;
    }

    public final Image getMiddle() {
        return this.middle;
    }

    public final Image getMiddleMp4() {
        return this.middleMp4;
    }

    public final Image getMiddleWebp() {
        return this.middleWebp;
    }

    public final Image getOrigin() {
        return this.origin;
    }

    public final Image getThumbnail() {
        return this.thumbnail;
    }

    public final Image getThumbnailWebp() {
        return this.thumbnailWebp;
    }

    @Override // java.lang.Object
    public final ImageSet clone() {
        return new ImageSet(this.key, this.origin, this.thumbnail, this.middle, this.thumbnailWebp, this.middleWebp, this.middleMp4, this.cover);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = this.key;
        int i8 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 31;
        Image image = this.origin;
        if (image != null) {
            i2 = image.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        Image image2 = this.thumbnail;
        if (image2 != null) {
            i3 = image2.hashCode();
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        Image image3 = this.middle;
        if (image3 != null) {
            i4 = image3.hashCode();
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        Image image4 = this.thumbnailWebp;
        if (image4 != null) {
            i5 = image4.hashCode();
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        Image image5 = this.middleWebp;
        if (image5 != null) {
            i6 = image5.hashCode();
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        Image image6 = this.middleMp4;
        if (image6 != null) {
            i7 = image6.hashCode();
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        Image image7 = this.cover;
        if (image7 != null) {
            i8 = image7.hashCode();
        }
        return i15 + i8;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            ImageSet imageSet = (ImageSet) obj;
            if (!(!Intrinsics.areEqual(this.key, imageSet.key)) && !(!Intrinsics.areEqual(this.origin, imageSet.origin)) && !(!Intrinsics.areEqual(this.thumbnail, imageSet.thumbnail)) && !(!Intrinsics.areEqual(this.middle, imageSet.middle)) && !(!Intrinsics.areEqual(this.thumbnailWebp, imageSet.thumbnailWebp)) && !(!Intrinsics.areEqual(this.middleWebp, imageSet.middleWebp)) && !(!Intrinsics.areEqual(this.middleMp4, imageSet.middleMp4)) && !(!Intrinsics.areEqual(this.cover, imageSet.cover))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.preview.entity.component.ImageSet");
    }

    public ImageSet(String str, Image image, Image image2, Image image3, Image image4, Image image5, Image image6, Image image7) {
        this.key = str;
        this.origin = image;
        this.thumbnail = image2;
        this.middle = image3;
        this.thumbnailWebp = image4;
        this.middleWebp = image5;
        this.middleMp4 = image6;
        this.cover = image7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ImageSet(java.lang.String r10, com.ss.android.lark.image.entity.Image r11, com.ss.android.lark.image.entity.Image r12, com.ss.android.lark.image.entity.Image r13, com.ss.android.lark.image.entity.Image r14, com.ss.android.lark.image.entity.Image r15, com.ss.android.lark.image.entity.Image r16, com.ss.android.lark.image.entity.Image r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x000c
        L_0x000b:
            r1 = r10
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0014
            r3 = r2
            com.ss.android.lark.image.entity.Image r3 = (com.ss.android.lark.image.entity.Image) r3
            goto L_0x0015
        L_0x0014:
            r3 = r11
        L_0x0015:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001d
            r4 = r2
            com.ss.android.lark.image.entity.Image r4 = (com.ss.android.lark.image.entity.Image) r4
            goto L_0x001e
        L_0x001d:
            r4 = r12
        L_0x001e:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0026
            r5 = r2
            com.ss.android.lark.image.entity.Image r5 = (com.ss.android.lark.image.entity.Image) r5
            goto L_0x0027
        L_0x0026:
            r5 = r13
        L_0x0027:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002f
            r6 = r2
            com.ss.android.lark.image.entity.Image r6 = (com.ss.android.lark.image.entity.Image) r6
            goto L_0x0030
        L_0x002f:
            r6 = r14
        L_0x0030:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0038
            r7 = r2
            com.ss.android.lark.image.entity.Image r7 = (com.ss.android.lark.image.entity.Image) r7
            goto L_0x0039
        L_0x0038:
            r7 = r15
        L_0x0039:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0041
            r8 = r2
            com.ss.android.lark.image.entity.Image r8 = (com.ss.android.lark.image.entity.Image) r8
            goto L_0x0043
        L_0x0041:
            r8 = r16
        L_0x0043:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x004b
            r0 = r2
            com.ss.android.lark.image.entity.Image r0 = (com.ss.android.lark.image.entity.Image) r0
            goto L_0x004d
        L_0x004b:
            r0 = r17
        L_0x004d:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.preview.entity.component.ImageSet.<init>(java.lang.String, com.ss.android.lark.image.entity.Image, com.ss.android.lark.image.entity.Image, com.ss.android.lark.image.entity.Image, com.ss.android.lark.image.entity.Image, com.ss.android.lark.image.entity.Image, com.ss.android.lark.image.entity.Image, com.ss.android.lark.image.entity.Image, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}

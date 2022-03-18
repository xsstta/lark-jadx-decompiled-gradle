package com.ss.android.lark.moments.impl.common.utils;

import com.bytedance.lark.pb.basic.v1.Image;
import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Media;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0005\u001a\"\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u001a\"\u0010\u0007\u001a\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"isContentSame", "", "Lcom/bytedance/lark/pb/basic/v1/Image;", "other", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "Lcom/bytedance/lark/pb/moments/v1/Media;", "", "isKeySame", "im_moments-wrapper_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.utils.d */
public final class C47281d {
    /* renamed from: a */
    public static final boolean m187232a(Image image, Image image2) {
        if (image == null && image2 == null) {
            return true;
        }
        if (image == null || image2 == null || !Intrinsics.areEqual(image.width, image2.width) || !Intrinsics.areEqual(image.height, image2.height) || !Intrinsics.areEqual(image.urls, image2.urls)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m187236b(List<ImageSet> list, List<ImageSet> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!m187233a(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m187233a(ImageSet imageSet, ImageSet imageSet2) {
        if (imageSet == null && imageSet2 == null) {
            return true;
        }
        if (imageSet == null || imageSet2 == null || !Intrinsics.areEqual(imageSet.key, imageSet2.key) || !m187232a(imageSet.origin, imageSet2.origin) || (!m187232a(imageSet.thumbnail, imageSet2.thumbnail) && !m187232a(imageSet.thumbnail_webp, imageSet2.thumbnail_webp))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m187234a(Media media, Media media2) {
        if (media == null && media2 == null) {
            return true;
        }
        if (media == null || media2 == null || !Intrinsics.areEqual(media.drive_token, media2.drive_token) || !Intrinsics.areEqual(media.local_url, media2.local_url) || !m187233a(media.cover, media2.cover) || !Intrinsics.areEqual(media.size, media2.size) || !Intrinsics.areEqual(media.duration_sec, media2.duration_sec) || !Intrinsics.areEqual(media.width, media2.width) || !Intrinsics.areEqual(media.height, media2.height)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m187235a(List<ImageSet> list, List<ImageSet> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual(list.get(i).key, list2.get(i).key)) {
                return false;
            }
        }
        return true;
    }
}

package com.ss.android.lark.moments.impl.feed.nineimage;

import com.bytedance.lark.pb.basic.v1.ImageSet;
import com.bytedance.lark.pb.moments.v1.Media;
import com.ss.android.lark.moments.impl.common.utils.ImageUtils;
import com.ss.android.lark.moments.impl.feed.nineimage.NineImageBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageDataParser;", "", "()V", "parseNineImage", "", "Lcom/ss/android/lark/moments/impl/feed/nineimage/NineImageBean;", "imageList", "Lcom/bytedance/lark/pb/basic/v1/ImageSet;", "media", "Lcom/bytedance/lark/pb/moments/v1/Media;", "spanCount", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.feed.nineimage.b */
public final class NineImageDataParser {

    /* renamed from: a */
    public static final NineImageDataParser f120002a = new NineImageDataParser();

    private NineImageDataParser() {
    }

    /* renamed from: a */
    public final List<NineImageBean> mo167100a(List<ImageSet> list, Media media, int i) {
        NineImageBean.NineImageType nineImageType;
        boolean z;
        int i2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (ImageUtils.f119250a.mo166203a(media)) {
            arrayList.add(new NineImageBean(NineImageBean.NineImageType.TYPE_VIDEO, null, media, false, false));
        } else if (list != null) {
            List<ImageSet> list2 = list;
            if (!list2.isEmpty()) {
                if (list.size() == 1) {
                    nineImageType = NineImageBean.NineImageType.TYPE_SINGLE_IMAGE;
                } else {
                    nineImageType = NineImageBean.NineImageType.TYPE_NORMAL_IMAGE;
                }
                int size = list2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ImageSet imageSet = list.get(i3);
                    if (i3 % i != i - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (list.size() % i == 0) {
                        i2 = i;
                    } else {
                        i2 = list.size() % i;
                    }
                    if (list.size() == i || i3 >= list.size() - i2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    arrayList.add(new NineImageBean(nineImageType, imageSet, null, z, z2));
                }
            }
        }
        return arrayList;
    }
}

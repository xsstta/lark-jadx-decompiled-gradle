package com.bytedance.ee.bear.middleground.comment.p449g;

import android.text.TextUtils;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ee.bear.middleground.comment.g.c */
public class C9229c {

    /* renamed from: a */
    private static AtomicInteger f24849a = new AtomicInteger(1000);

    /* renamed from: a */
    public static ImageData.Image m38280a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
        ImageData.Image image = new ImageData.Image();
        image.setSrc(commentImageEntity.getSrc());
        image.setOriginalSrc(commentImageEntity.getOriginalSrc());
        if (TextUtils.isEmpty(commentImageEntity.getUuid())) {
            image.setUuid(String.format(Locale.CHINA, "%d_%d", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(f24849a.getAndIncrement())));
        } else {
            image.setUuid(commentImageEntity.getUuid());
        }
        return image;
    }

    /* renamed from: a */
    public static ImageData m38281a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity, List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
        if (commentImageEntity == null || list == null || list.isEmpty()) {
            return null;
        }
        ImageData imageData = new ImageData();
        ArrayList arrayList = new ArrayList();
        for (CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity2 : list) {
            ImageData.Image a = m38280a(commentImageEntity2);
            arrayList.add(a);
            if (commentImageEntity2 == commentImageEntity) {
                imageData.setImage(a);
            }
        }
        imageData.setImageList(arrayList);
        ImageData.ToolStatus toolStatus = new ImageData.ToolStatus();
        toolStatus.setComment(false);
        toolStatus.setCommentable(false);
        toolStatus.setCopy(true);
        toolStatus.setDelete(false);
        imageData.setToolStatus(toolStatus);
        return imageData;
    }
}

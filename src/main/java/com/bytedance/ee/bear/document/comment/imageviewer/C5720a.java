package com.bytedance.ee.bear.document.comment.imageviewer;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.document.comment.imageviewer.OpenCommentImageModel;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.document.comment.imageviewer.a */
public class C5720a extends AbstractC1142af {
    private C1177w<Boolean> active = new C1177w<>();
    private C1177w<ImageData> commentImageData = new C1177w<>();
    private C1177w<OpenCommentImageModel> imageList = new C1177w<>();

    public C1177w<Boolean> getActive() {
        return this.active;
    }

    public C1177w<ImageData> getCommentImageData() {
        return this.commentImageData;
    }

    public C1177w<OpenCommentImageModel> getImageList() {
        return this.imageList;
    }

    public void setActive(boolean z) {
        Boolean b = this.active.mo5927b();
        if (b == null || b.booleanValue() != z) {
            this.active.mo5929b(Boolean.valueOf(z));
        }
    }

    public void setImageList(OpenCommentImageModel openCommentImageModel) {
        if (!Objects.equals(this.imageList.mo5927b(), openCommentImageModel)) {
            this.imageList.mo5929b(openCommentImageModel);
            if (openCommentImageModel != null && openCommentImageModel.getActive() != -1) {
                this.commentImageData.mo5929b(buildImageData(openCommentImageModel));
            }
        }
    }

    private ImageData buildImageData(OpenCommentImageModel openCommentImageModel) {
        ImageData imageData = new ImageData();
        ArrayList arrayList = new ArrayList();
        for (OpenCommentImageModel.CommentImageBean commentImageBean : openCommentImageModel.getImageList()) {
            ImageData.Image image = new ImageData.Image();
            image.setUuid(commentImageBean.getToken());
            image.setSrc(commentImageBean.getSrc());
            image.setOriginalSrc(commentImageBean.getOriginalSrc());
            arrayList.add(image);
        }
        imageData.setImageList(arrayList);
        int active2 = openCommentImageModel.getActive();
        if (active2 >= 0 && active2 < openCommentImageModel.getImageList().size()) {
            imageData.setImage(arrayList.get(active2));
        }
        ImageData.ToolStatus toolStatus = new ImageData.ToolStatus();
        toolStatus.setDelete(false);
        toolStatus.setCopy(true);
        toolStatus.setCommentable(false);
        toolStatus.setComment(false);
        imageData.setToolStatus(toolStatus);
        return imageData;
    }
}

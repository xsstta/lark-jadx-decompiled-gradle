package com.bytedance.ee.bear.document.imageviewer;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.document.comment.bean.Card;
import com.bytedance.ee.bear.document.comment.bean.Per;
import com.bytedance.ee.bear.document.comment.bean.ShowCardsJsData;
import com.bytedance.ee.bear.document.imageviewer.bean.CardCommentData;
import com.bytedance.ee.bear.document.imageviewer.bean.DeleteImageData;
import com.bytedance.ee.bear.document.imageviewer.bean.ImageCardsData;
import com.bytedance.ee.bear.document.imageviewer.bean.ImageDataModel;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.middleground.comment.Comment;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.android.HwBuildEx;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ee.bear.document.imageviewer.b */
public class C5852b extends AbstractC1142af {
    private static AtomicInteger sCounter = new AtomicInteger(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
    private C1177w<Boolean> mCloseImageViewer;
    private AbstractC5853a mDelegate;
    private C1177w<DeleteImageData> mDeleteImageData;
    private C1177w<ImageCardsData> mImageCardsJsData;
    private C1177w<ImageDataModel> mImageData;

    /* renamed from: com.bytedance.ee.bear.document.imageviewer.b$a */
    public interface AbstractC5853a {
        /* renamed from: a */
        void mo23447a();

        /* renamed from: a */
        void mo23448a(ShowCardsJsData showCardsJsData);

        /* renamed from: a */
        void mo23449a(String str);

        /* renamed from: a */
        void mo23450a(String str, String str2, int i);

        /* renamed from: b */
        void mo23451b();

        /* renamed from: b */
        void mo23452b(String str);
    }

    public void closeCommentCards() {
        C13479a.m54764b("ImageViewerViewModel", "closeCommentCards");
        AbstractC5853a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23451b();
        }
    }

    /* access modifiers changed from: package-private */
    public LiveData<ImageCardsData> getCardsData() {
        if (this.mImageCardsJsData == null) {
            this.mImageCardsJsData = new C1177w<>();
        }
        return this.mImageCardsJsData;
    }

    /* access modifiers changed from: package-private */
    public LiveData<Boolean> getCloseImageViewer() {
        if (this.mCloseImageViewer == null) {
            this.mCloseImageViewer = new C1177w<>();
        }
        return this.mCloseImageViewer;
    }

    /* access modifiers changed from: package-private */
    public LiveData<DeleteImageData> getDeleteImageData() {
        if (this.mDeleteImageData == null) {
            this.mDeleteImageData = new C1177w<>();
        }
        return this.mDeleteImageData;
    }

    /* access modifiers changed from: package-private */
    public LiveData<ImageDataModel> getImageData() {
        if (this.mImageData == null) {
            this.mImageData = new C1177w<>();
        }
        return this.mImageData;
    }

    public void setDelegate(AbstractC5853a aVar) {
        this.mDelegate = aVar;
    }

    /* access modifiers changed from: package-private */
    public void deleteImage(String str) {
        AbstractC5853a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23449a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void openImage(ImageDataModel imageDataModel) {
        setImageUUIDIfNeed(imageDataModel);
        updateImageData(imageDataModel);
    }

    /* access modifiers changed from: package-private */
    public void closeImageViewer(String str) {
        AbstractC5853a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23447a();
            this.mDelegate.mo23450a("exit", str, -1);
        }
    }

    public void showCommentInput(String str) {
        C13479a.m54764b("ImageViewerViewModel", "showCommentInput");
        AbstractC5853a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23452b(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateCardsData(ImageCardsData imageCardsData) {
        ((C1177w) getCardsData()).mo5929b(imageCardsData);
    }

    /* access modifiers changed from: package-private */
    public void updateDeleteImageData(DeleteImageData deleteImageData) {
        ((C1177w) getDeleteImageData()).mo5929b(deleteImageData);
    }

    /* access modifiers changed from: package-private */
    public void updateImageData(ImageDataModel imageDataModel) {
        ((C1177w) getImageData()).mo5929b(imageDataModel);
    }

    public void setCloseImageViewer(Boolean bool) {
        C13479a.m54764b("ImageViewerViewModel", "setCloseImageViewer:" + bool);
        ((C1177w) getCloseImageViewer()).mo5929b(bool);
    }

    private void setImageUUIDIfNeed(ImageData.Image image) {
        if (TextUtils.isEmpty(image.getUuid())) {
            image.setUuid(String.format(Locale.CHINA, "%d_%d", Long.valueOf(System.currentTimeMillis()), Integer.valueOf(sCounter.getAndIncrement())));
        }
    }

    private void setImageUUIDIfNeed(ImageDataModel imageDataModel) {
        ImageData.Image image = imageDataModel.getImage();
        if (!(imageDataModel.getImageList() == null || imageDataModel.getImageList().isEmpty() || image == null)) {
            for (ImageData.Image image2 : imageDataModel.getImageList()) {
                setImageUUIDIfNeed(image2);
                if (TextUtils.isEmpty(image.getUuid()) && TextUtils.equals(image2.getSrc(), image.getSrc()) && TextUtils.equals(image2.getOriginalSrc(), image.getOriginalSrc())) {
                    image.setUuid(image2.getUuid());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void commentImage(String str, int i) {
        AbstractC5853a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23450a(Comment.f24093e, str, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void downloadImage(String str, int i) {
        AbstractC5853a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23450a("downloadImage", str, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void loadError(String str, int i) {
        AbstractC5853a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23450a("loadError", str, i);
        }
    }

    /* access modifiers changed from: package-private */
    public void swipe(String str, int i) {
        AbstractC5853a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23450a("swipe", str, i);
        }
    }

    public ShowCardsJsData convertImageData2CardsJsData(String str, ImageCardsData imageCardsData) {
        List<Card> list;
        ShowCardsJsData showCardsJsData = new ShowCardsJsData();
        CardCommentData cardCommentData = imageCardsData.getData().get(str);
        if (cardCommentData == null) {
            list = null;
        } else {
            list = cardCommentData.getComments();
        }
        showCardsJsData.setCards(list);
        showCardsJsData.setTmpCommentId(str);
        showCardsJsData.setCur_comment_id(imageCardsData.getCur_comment_id());
        showCardsJsData.setToken(C5890a.m23707b());
        showCardsJsData.permission = new Per();
        showCardsJsData.permission.comment = true;
        showCardsJsData.permission.resolve = imageCardsData.isShow_resolve();
        return showCardsJsData;
    }

    public void showCommentCards(String str, ImageCardsData imageCardsData) {
        ShowCardsJsData convertImageData2CardsJsData = convertImageData2CardsJsData(str, imageCardsData);
        C13479a.m54764b("ImageViewerViewModel", "updateCommentCard(): " + convertImageData2CardsJsData);
        AbstractC5853a aVar = this.mDelegate;
        if (aVar != null) {
            aVar.mo23448a(convertImageData2CardsJsData);
        }
    }
}

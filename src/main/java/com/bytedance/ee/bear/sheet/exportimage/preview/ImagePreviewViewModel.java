package com.bytedance.ee.bear.sheet.exportimage.preview;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001/B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020+J\u0018\u0010,\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\t¨\u00060"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/ImagePreviewViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "setActive", "(Landroidx/lifecycle/MutableLiveData;)V", "calSharePanelHeight", "getCalSharePanelHeight", "setCalSharePanelHeight", "delegate", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/ImagePreviewViewModel$Delegate;", "getDelegate", "()Lcom/bytedance/ee/bear/sheet/exportimage/preview/ImagePreviewViewModel$Delegate;", "setDelegate", "(Lcom/bytedance/ee/bear/sheet/exportimage/preview/ImagePreviewViewModel$Delegate;)V", "disableShareItem", "getDisableShareItem", "setDisableShareItem", "operationType", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/ShareOperationTypeModel;", "getOperationType", "setOperationType", "showLoading", "getShowLoading", "setShowLoading", "showShare", "getShowShare", "setShowShare", "titleData", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/PreviewTitleModel;", "getTitleData", "setTitleData", "onClose", "", "onShareImageToExternalApp", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "onSharePanelHeightChanged", "height", "", "onShareTextToExternalApp", "text", "", "Delegate", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.a */
public final class ImagePreviewViewModel extends AbstractC1142af {
    private C1177w<Boolean> active = new C1177w<>();
    private C1177w<Boolean> calSharePanelHeight = new C1177w<>();
    private Delegate delegate;
    private C1177w<Boolean> disableShareItem = new C1177w<>();
    private C1177w<ShareOperationTypeModel> operationType = new C1177w<>();
    private C1177w<Boolean> showLoading = new C1177w<>();
    private C1177w<Boolean> showShare = new C1177w<>();
    private C1177w<PreviewTitleModel> titleData = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/ImagePreviewViewModel$Delegate;", "", "onClose", "", "onShareImageToExternalApp", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "onSharePanelHeightChanged", "height", "", "onShareTextToExternalApp", "text", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.a$a */
    public interface Delegate {
        /* renamed from: a */
        void mo42506a();

        /* renamed from: a */
        void mo42507a(int i);

        /* renamed from: a */
        void mo42508a(ShareType shareType);

        /* renamed from: a */
        void mo42509a(ShareType shareType, String str);
    }

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final C1177w<Boolean> getCalSharePanelHeight() {
        return this.calSharePanelHeight;
    }

    public final Delegate getDelegate() {
        return this.delegate;
    }

    public final C1177w<Boolean> getDisableShareItem() {
        return this.disableShareItem;
    }

    public final C1177w<ShareOperationTypeModel> getOperationType() {
        return this.operationType;
    }

    public final C1177w<Boolean> getShowLoading() {
        return this.showLoading;
    }

    public final C1177w<Boolean> getShowShare() {
        return this.showShare;
    }

    public final C1177w<PreviewTitleModel> getTitleData() {
        return this.titleData;
    }

    public final void onClose() {
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo42506a();
        }
    }

    public final void setDelegate(Delegate aVar) {
        this.delegate = aVar;
    }

    public final void onSharePanelHeightChanged(int i) {
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo42507a(i);
        }
    }

    public final void setActive(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.active = wVar;
    }

    public final void setCalSharePanelHeight(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.calSharePanelHeight = wVar;
    }

    public final void setDisableShareItem(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.disableShareItem = wVar;
    }

    public final void setOperationType(C1177w<ShareOperationTypeModel> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.operationType = wVar;
    }

    public final void setShowLoading(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showLoading = wVar;
    }

    public final void setShowShare(C1177w<Boolean> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.showShare = wVar;
    }

    public final void setTitleData(C1177w<PreviewTitleModel> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.titleData = wVar;
    }

    public final void onShareImageToExternalApp(ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        Delegate aVar = this.delegate;
        if (aVar != null) {
            aVar.mo42508a(shareType);
        }
    }

    public final void onShareTextToExternalApp(ShareType shareType, String str) {
        Intrinsics.checkParameterIsNotNull(shareType, "shareType");
        Delegate aVar = this.delegate;
        if (aVar != null) {
            if (str == null) {
                str = "";
            }
            aVar.mo42509a(shareType, str);
        }
    }
}

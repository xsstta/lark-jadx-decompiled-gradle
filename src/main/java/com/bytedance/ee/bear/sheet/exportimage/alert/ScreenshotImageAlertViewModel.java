package com.bytedance.ee.bear.sheet.exportimage.alert;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "active", "Landroidx/lifecycle/MutableLiveData;", "", "getActive", "()Landroidx/lifecycle/MutableLiveData;", "delegete", "Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertViewModel$Delegete;", "getDelegete", "()Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertViewModel$Delegete;", "setDelegete", "(Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertViewModel$Delegete;)V", "imageAlertData", "Lcom/bytedance/ee/bear/sheet/exportimage/alert/ImageAlertModel;", "getImageAlertData", "imageBitmap", "Ljava/io/File;", "getImageBitmap", "close", "", "onClickSaveBtn", "onClickShareBtn", "onShareSuccess", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "onShareToExternalApp", "Delegete", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.b */
public final class ScreenshotImageAlertViewModel extends AbstractC1142af {
    private final C1177w<Boolean> active = new C1177w<>();
    private Delegete delegete;
    private final C1177w<ImageAlertModel> imageAlertData = new C1177w<>();
    private final C1177w<File> imageBitmap = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertViewModel$Delegete;", "", "onClose", "", "onSave", "onShare", "onShareSuccess", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "onShareToExternalApp", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.b$a */
    public interface Delegete {
        /* renamed from: a */
        void mo42341a();

        /* renamed from: a */
        void mo42342a(ShareType shareType);

        /* renamed from: b */
        void mo42343b();

        /* renamed from: b */
        void mo42344b(ShareType shareType);

        /* renamed from: c */
        void mo42345c();
    }

    public final C1177w<Boolean> getActive() {
        return this.active;
    }

    public final Delegete getDelegete() {
        return this.delegete;
    }

    public final C1177w<ImageAlertModel> getImageAlertData() {
        return this.imageAlertData;
    }

    public final C1177w<File> getImageBitmap() {
        return this.imageBitmap;
    }

    public final void close() {
        Delegete aVar = this.delegete;
        if (aVar != null) {
            aVar.mo42341a();
        }
    }

    public final void onClickSaveBtn() {
        Delegete aVar = this.delegete;
        if (aVar != null) {
            aVar.mo42343b();
        }
    }

    public final void onClickShareBtn() {
        Delegete aVar = this.delegete;
        if (aVar != null) {
            aVar.mo42345c();
        }
    }

    public final void setDelegete(Delegete aVar) {
        this.delegete = aVar;
    }

    public final void onShareSuccess(ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(shareType, ShareHitPoint.f121869d);
        Delegete aVar = this.delegete;
        if (aVar != null) {
            aVar.mo42344b(shareType);
        }
    }

    public final void onShareToExternalApp(ShareType shareType) {
        Intrinsics.checkParameterIsNotNull(shareType, ShareHitPoint.f121869d);
        Delegete aVar = this.delegete;
        if (aVar != null) {
            aVar.mo42342a(shareType);
        }
    }
}

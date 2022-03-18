package com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile;

import android.view.View;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.drive.biz.cache.CacheUtils;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.p367c.C7259c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/ownerdeletefile/DriveOwnerDeletedFilePlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "handleOwnerDeleteFile", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public class DriveOwnerDeletedFilePlugin extends AbsDrivePreviewPlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveOwnerDeletedFilePlugin$a */
    public static final class RunnableC6584a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveOwnerDeletedFilePlugin f18078a;

        RunnableC6584a(DriveOwnerDeletedFilePlugin driveOwnerDeletedFilePlugin) {
            this.f18078a = driveOwnerDeletedFilePlugin;
        }

        public final void run() {
            this.f18078a.handleOwnerDeleteFile();
        }
    }

    /* access modifiers changed from: protected */
    public void handleOwnerDeleteFile() {
        View a = new C7259c(getActivity()).mo28361a();
        Intrinsics.checkExpressionValueIsNotNull(a, "OwnerDeleteFileViewManag…vity).ownerDeleteFileView");
        removeAndAddPreviewView(a);
        CacheUtils.Companion.m25412a(CacheUtils.f17530a, ((DrivePluginHost) getHost()).mo27261l(), null, 2, null);
        AbstractC4958n uIContainer = getUIContainer();
        Intrinsics.checkExpressionValueIsNotNull(uIContainer, "uiContainer");
        uIContainer.mo19600e().mo19528h(false);
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        addErrorHandler(new RunnableC6584a(this), ErrCode.OWNER_DELETED_FILE);
    }
}

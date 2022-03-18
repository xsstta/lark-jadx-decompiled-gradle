package com.bytedance.ee.bear.drive.biz.preview.error.notfound;

import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.drive.biz.cache.CacheUtils;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.notfoundview.FileNoFoundView;
import com.bytedance.ee.bear.drive.view.preview.p367c.C7257a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0015J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/notfound/DriveFileNotFoundPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "mFileNoFoundViewManager", "Lcom/bytedance/ee/bear/drive/view/preview/viewmanager/FileNoFoundViewManager;", "getMFileNoFoundViewManager", "()Lcom/bytedance/ee/bear/drive/view/preview/viewmanager/FileNoFoundViewManager;", "setMFileNoFoundViewManager", "(Lcom/bytedance/ee/bear/drive/view/preview/viewmanager/FileNoFoundViewManager;)V", "handleFileNotFound", "", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public class DriveFileNotFoundPlugin extends AbsDrivePreviewPlugin {
    public static final Companion Companion = new Companion(null);
    private C7257a mFileNoFoundViewManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/notfound/DriveFileNotFoundPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.notfound.DriveFileNotFoundPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C7257a getMFileNoFoundViewManager() {
        return this.mFileNoFoundViewManager;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.notfound.DriveFileNotFoundPlugin$b */
    public static final class RunnableC6581b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveFileNotFoundPlugin f18075a;

        RunnableC6581b(DriveFileNotFoundPlugin driveFileNotFoundPlugin) {
            this.f18075a = driveFileNotFoundPlugin;
        }

        public final void run() {
            DriveFileNotFoundPlugin driveFileNotFoundPlugin = this.f18075a;
            AbstractC4958n uIContainer = driveFileNotFoundPlugin.getUIContainer();
            Intrinsics.checkExpressionValueIsNotNull(uIContainer, "uiContainer");
            driveFileNotFoundPlugin.handleFileNotFound(uIContainer);
        }
    }

    public final void setMFileNoFoundViewManager(C7257a aVar) {
        this.mFileNoFoundViewManager = aVar;
    }

    /* access modifiers changed from: protected */
    public void handleFileNotFound(AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        CacheUtils.Companion.m25412a(CacheUtils.f17530a, ((DrivePluginHost) getHost()).mo27261l(), null, 2, null);
        FileNoFoundView a = new C7257a(getActivity()).mo28359a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FileNoFoundViewManager(activity).fileNoFoundView");
        a.setDesc(getActivity().getString(R.string.Drive_Drive_FileIsNotExist));
        removeAndAddPreviewView(a);
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        this.mFileNoFoundViewManager = new C7257a(getActivity());
        addErrorHandler(new RunnableC6581b(this), ErrCode.FILE_NOT_FOUND);
    }
}

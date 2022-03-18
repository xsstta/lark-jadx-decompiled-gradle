package com.bytedance.ee.bear.drive.biz.preview.error.notsupport;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.NotSupportPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/notsupport/DriveFileNotSupportPreviewPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "showFileNotSupport", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveFileNotSupportPreviewPlugin extends AbsDrivePreviewPlugin {
    public final void showFileNotSupport() {
        C7553d dVar;
        if (((DrivePluginHost) getHost()).mo27261l().getFileModel() == null) {
            C13479a.m54775e("DriveComponent", "showFileNotSupport() but getFileModel is null");
            return;
        }
        AbstractC6946a fileModel = ((DrivePluginHost) getHost()).mo27261l().getFileModel();
        if (fileModel != null) {
            dVar = fileModel.mo27356v();
        } else {
            dVar = null;
        }
        removeAndAddPreviewView(new NotSupportPreviewView(new ViewOwner(getHost(), getLifecycleOwner()), getActivity(), dVar, null));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/error/notsupport/DriveFileNotSupportPreviewPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.notsupport.DriveFileNotSupportPreviewPlugin$b */
    public static final class C6583b extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveFileNotSupportPreviewPlugin f18077a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6583b(DriveFileNotSupportPreviewPlugin driveFileNotSupportPreviewPlugin) {
            this.f18077a = driveFileNotSupportPreviewPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            Intrinsics.checkParameterIsNotNull(errCode, "code");
            if (errCode == ErrCode.DRIVE_FILE_NOT_SUPPORT_PREVIEW) {
                this.f18077a.showFileNotSupport();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.notsupport.DriveFileNotSupportPreviewPlugin$a */
    public static final class C6582a<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DriveFileNotSupportPreviewPlugin f18076a;

        C6582a(DriveFileNotSupportPreviewPlugin driveFileNotSupportPreviewPlugin) {
            this.f18076a = driveFileNotSupportPreviewPlugin;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            C13479a.m54764b("DriveComponent", "liveInnerUnsupprtPreview show unsupport");
            this.f18076a.showFileNotSupport();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).liveInnerUnsupprtPreview().mo5923a(getLifecycleOwner(), new C6582a(this));
        aVar.mo27262m().mo27297a(new C6583b(this));
    }
}

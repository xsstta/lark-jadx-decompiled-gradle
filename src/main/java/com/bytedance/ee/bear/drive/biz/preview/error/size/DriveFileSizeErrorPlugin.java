package com.bytedance.ee.bear.drive.biz.preview.error.size;

import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.NotSupportPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/size/DriveFileSizeErrorPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveFileSizeErrorPlugin extends AbsDrivePreviewPlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        aVar.mo27262m().mo27297a(new C6607a(this, aVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/error/size/DriveFileSizeErrorPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.size.DriveFileSizeErrorPlugin$a */
    public static final class C6607a extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveFileSizeErrorPlugin f18103a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18104b;

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            C7553d dVar;
            C7553d dVar2;
            Intrinsics.checkParameterIsNotNull(errCode, "code");
            int i = C6608a.f18105a[errCode.ordinal()];
            if (i == 1) {
                AbstractC6946a fileModel = this.f18104b.mo27261l().getFileModel();
                if (fileModel != null) {
                    dVar = fileModel.mo27356v();
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar.mo29473a(5);
                    this.f18103a.removeAndAddPreviewView(new NotSupportPreviewView(new ViewOwner(this.f18104b, this.f18103a.getLifecycleOwner()), this.f18103a.getActivity(), dVar, null));
                }
            } else if (i == 2) {
                AbstractC6946a fileModel2 = this.f18104b.mo27261l().getFileModel();
                if (fileModel2 != null) {
                    dVar2 = fileModel2.mo27356v();
                } else {
                    dVar2 = null;
                }
                if (dVar2 != null) {
                    dVar2.mo29473a(6);
                    this.f18103a.removeAndAddPreviewView(new NotSupportPreviewView(new ViewOwner(this.f18104b, this.f18103a.getLifecycleOwner()), this.f18103a.getActivity(), dVar2, null));
                }
            }
        }

        C6607a(DriveFileSizeErrorPlugin driveFileSizeErrorPlugin, DrivePluginHost aVar) {
            this.f18103a = driveFileSizeErrorPlugin;
            this.f18104b = aVar;
        }
    }
}

package com.bytedance.ee.bear.drive.biz.fileinfo;

import android.text.TextUtils;
import com.bytedance.ee.bear.drive.biz.save2space.DriveImFileSaveToSpaceVM;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.C7088b;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/fileinfo/DriveImFileInfoPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveImFileInfoPlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        aVar.mo27262m().mo27297a(new C6466a(this, aVar));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/fileinfo/DriveImFileInfoPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.fileinfo.DriveImFileInfoPlugin$a */
    public static final class C6466a extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveImFileInfoPlugin f17857a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f17858b;

        C6466a(DriveImFileInfoPlugin driveImFileInfoPlugin, DrivePluginHost aVar) {
            this.f17857a = driveImFileInfoPlugin;
            this.f17858b = aVar;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            int i = C6468b.f17861a[infoCode.ordinal()];
            if (i != 1 && i != 2) {
                return;
            }
            if (!(t instanceof C7088b)) {
                C13479a.m54775e("DriveComponent", "receiveFileInfo update, but data is not DriveIMFileModel im im file");
                return;
            }
            T t2 = t;
            this.f17858b.mo27261l().setFileModel(t2);
            C6937b l = this.f17858b.mo27261l();
            C7088b.C7089a x = t2.mo27322a();
            Intrinsics.checkExpressionValueIsNotNull(x, "fileModel.meta");
            l.setFileName(x.mo27358a());
            if (!TextUtils.isEmpty(t2.mo27322a().f19104p)) {
                ((DriveImFileSaveToSpaceVM) this.f17857a.viewModel(DriveImFileSaveToSpaceVM.class)).getLiveFileToken().mo5926a(t2.mo27322a().f19104p);
            }
        }
    }
}

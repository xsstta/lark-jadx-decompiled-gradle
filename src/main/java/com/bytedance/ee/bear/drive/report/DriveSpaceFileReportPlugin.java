package com.bytedance.ee.bear.drive.report;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.C7086a;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/drive/report/DriveSpaceFileReportPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "hasReport", "", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "reportFile", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFileReportPlugin extends AbsDrivePlugin {
    private boolean hasReport;

    public final void reportFile() {
        C7086a aVar = (C7086a) ((DrivePluginHost) getHost()).mo27261l().getFileModel();
        C6522b b = ((DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class)).livePerm().mo5927b();
        if (aVar != null && b != null && !this.hasReport) {
            this.hasReport = true;
            DrivePluginHost aVar2 = (DrivePluginHost) getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
            C7086a aVar3 = aVar;
            C6891a.m27229a(aVar2).mo27906a(aVar3, aVar.mo27322a().f19099r);
            DrivePluginHost aVar4 = (DrivePluginHost) getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar4, "host");
            C6891a.m27229a(aVar4).mo27905a(aVar3, b);
            DrivePluginHost aVar5 = (DrivePluginHost) getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar5, "host");
            C6891a.m27229a(aVar5).mo27915a(C7130c.m28587b(aVar3));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.report.DriveSpaceFileReportPlugin$a */
    public static final class C7126a<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileReportPlugin f19194a;

        C7126a(DriveSpaceFileReportPlugin driveSpaceFileReportPlugin) {
            this.f19194a = driveSpaceFileReportPlugin;
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            this.f19194a.reportFile();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/report/DriveSpaceFileReportPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "code", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.report.DriveSpaceFileReportPlugin$b */
    public static final class C7127b extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileReportPlugin f19195a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7127b(DriveSpaceFileReportPlugin driveSpaceFileReportPlugin) {
            this.f19195a = driveSpaceFileReportPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "code");
            if (infoCode == InfoCode.FileInfoSuccess) {
                this.f19195a.reportFile();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        ((DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class)).livePerm().mo5923a(getLifecycleOwner(), new C7126a(this));
        aVar.mo27262m().mo27297a(new C7127b(this));
    }
}

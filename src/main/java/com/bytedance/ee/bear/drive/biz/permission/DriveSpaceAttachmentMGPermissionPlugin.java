package com.bytedance.ee.bear.drive.biz.permission;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/DriveSpaceAttachmentMGPermissionPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceAttachmentMGPermissionPlugin extends AbsDrivePlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.DriveSpaceAttachmentMGPermissionPlugin$a */
    public static final class C6510a<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceAttachmentMGPermissionVM f17943a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f17944b;

        C6510a(DriveSpaceAttachmentMGPermissionVM cVar, DrivePluginHost aVar) {
            this.f17943a = cVar;
            this.f17944b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            if (networkState != null && networkState.mo20041b() && this.f17943a.livePerm().mo5927b() == null) {
                DriveSpaceAttachmentMGPermissionVM cVar = this.f17943a;
                BaseOpenEntity openEntity = this.f17944b.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
                cVar.fetchPermission(openEntity.getFileId(), "");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.DriveSpaceAttachmentMGPermissionPlugin$b */
    public static final class C6511b<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f17945a;

        C6511b(DrivePluginHost aVar) {
            this.f17945a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            boolean z;
            C1177w<Boolean> liveOuterExportVisible = C6891a.m27236d(this.f17945a).liveOuterExportVisible();
            boolean z2 = false;
            if (bVar == null || !bVar.mo26059e()) {
                z = false;
            } else {
                z = true;
            }
            liveOuterExportVisible.mo5926a(Boolean.valueOf(z));
            C1177w<Boolean> liveOuterCopyable = C6891a.m27236d(this.f17945a).liveOuterCopyable();
            if (bVar != null && bVar.mo26058d()) {
                z2 = true;
            }
            liveOuterCopyable.mo5926a(Boolean.valueOf(z2));
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        DriveSpaceAttachmentMGPermissionVM cVar = (DriveSpaceAttachmentMGPermissionVM) viewModel(DriveSpaceAttachmentMGPermissionVM.class);
        C6891a.m27232a(this, new C6510a(cVar, aVar));
        cVar.livePerm().mo5923a(getLifecycleOwner(), new C6511b(aVar));
    }
}

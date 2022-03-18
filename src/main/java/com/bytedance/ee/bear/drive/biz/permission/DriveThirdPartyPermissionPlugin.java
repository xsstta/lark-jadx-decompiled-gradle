package com.bytedance.ee.bear.drive.biz.permission;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.permission.model.ThirdPartyAttachmentPermission;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/DriveThirdPartyPermissionPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveThirdPartyPermissionPlugin extends AbsDrivePlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/ThirdPartyAttachmentPermission;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.DriveThirdPartyPermissionPlugin$b */
    public static final class C6513b<T> implements AbstractC1178x<ThirdPartyAttachmentPermission> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f17948a;

        C6513b(DrivePluginHost aVar) {
            this.f17948a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(ThirdPartyAttachmentPermission thirdPartyAttachmentPermission) {
            boolean z;
            C1177w<Boolean> liveOuterExportVisible = C6891a.m27236d(this.f17948a).liveOuterExportVisible();
            boolean z2 = false;
            if (thirdPartyAttachmentPermission == null || thirdPartyAttachmentPermission.getExport() != 1) {
                z = false;
            } else {
                z = true;
            }
            liveOuterExportVisible.mo5926a(Boolean.valueOf(z));
            C1177w<Boolean> liveOuterCopyable = C6891a.m27236d(this.f17948a).liveOuterCopyable();
            if (thirdPartyAttachmentPermission != null && thirdPartyAttachmentPermission.getCopy() == 1) {
                z2 = true;
            }
            liveOuterCopyable.mo5926a(Boolean.valueOf(z2));
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        DriveThirdPartyPermissionVM dVar = (DriveThirdPartyPermissionVM) viewModel(DriveThirdPartyPermissionVM.class);
        C6891a.m27232a(this, new C6512a(dVar, aVar));
        dVar.livePerm().mo5923a(getLifecycleOwner(), new C6513b(aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.DriveThirdPartyPermissionPlugin$a */
    public static final class C6512a<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DriveThirdPartyPermissionVM f17946a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f17947b;

        C6512a(DriveThirdPartyPermissionVM dVar, DrivePluginHost aVar) {
            this.f17946a = dVar;
            this.f17947b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            if (networkState != null && networkState.mo20041b() && this.f17946a.livePerm().mo5927b() == null) {
                DriveThirdPartyPermissionVM dVar = this.f17946a;
                BaseOpenEntity openEntity = this.f17947b.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
                String fileId = openEntity.getFileId();
                BaseOpenEntity openEntity2 = this.f17947b.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity2, "host.driveViewModel.openEntity");
                String apiExtra = openEntity2.getApiExtra();
                BaseOpenEntity openEntity3 = this.f17947b.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity3, "host.driveViewModel.openEntity");
                dVar.fetchPermission(fileId, apiExtra, openEntity3.getMountPoint());
            }
        }
    }
}

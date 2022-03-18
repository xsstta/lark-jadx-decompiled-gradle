package com.bytedance.ee.bear.drive.biz.extra_info.meta;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/extra_info/meta/DriveMetaInfoPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveMetaInfoPlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27232a(this, new C6446a((DriveMetaInfoVM) viewModel(DriveMetaInfoVM.class), aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.meta.DriveMetaInfoPlugin$a */
    public static final class C6446a<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DriveMetaInfoVM f17811a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f17812b;

        C6446a(DriveMetaInfoVM aVar, DrivePluginHost aVar2) {
            this.f17811a = aVar;
            this.f17812b = aVar2;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            if (networkState != null && networkState.mo20041b() && this.f17811a.getLiveMetaInfo().mo5927b() == null) {
                DriveMetaInfoVM aVar = this.f17811a;
                BaseOpenEntity openEntity = this.f17812b.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
                String fileId = openEntity.getFileId();
                Intrinsics.checkExpressionValueIsNotNull(fileId, "host.driveViewModel.openEntity.fileId");
                aVar.fetchMetaInfo(fileId);
            }
        }
    }
}

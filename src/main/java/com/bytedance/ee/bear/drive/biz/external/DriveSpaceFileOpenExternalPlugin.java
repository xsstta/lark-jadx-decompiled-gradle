package com.bytedance.ee.bear.drive.biz.external;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.middleground_permission_export.model.IAuditApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/external/DriveSpaceFileOpenExternalPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFileOpenExternalPlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).liveInnerOpenExternal().mo5923a(getLifecycleOwner(), new C6411a(this, aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.external.DriveSpaceFileOpenExternalPlugin$a */
    public static final class C6411a<T> implements AbstractC1178x<Void> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFileOpenExternalPlugin f17720a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f17721b;

        C6411a(DriveSpaceFileOpenExternalPlugin driveSpaceFileOpenExternalPlugin, DrivePluginHost aVar) {
            this.f17720a = driveSpaceFileOpenExternalPlugin;
            this.f17721b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Void r12) {
            long j;
            AbstractC6947b a;
            Long l = null;
            BaseOpenEntity openEntity = this.f17721b.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            String fileId = openEntity.getFileId();
            Intrinsics.checkExpressionValueIsNotNull(fileId, "host.driveViewModel.openEntity.fileId");
            ((IAuditApi) KoinJavaComponent.m268613a(IAuditApi.class, null, null, 6, null)).mo37701a(3, 13, fileId);
            AbstractC6946a fileModel = this.f17721b.mo27261l().getFileModel();
            if (!(fileModel == null || (a = fileModel.mo27322a()) == null)) {
                l = Long.valueOf(a.f18787c);
            }
            BaseOpenEntity openEntity2 = this.f17721b.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity2, "host.driveViewModel.openEntity");
            C6418d a2 = C6418d.m25763a(openEntity2.getBizType(), this.f17720a.getContext(), ar.f14811a);
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            BaseOpenEntity openEntity3 = this.f17721b.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity3, "host.driveViewModel.openEntity");
            String fileId2 = openEntity3.getFileId();
            BaseOpenEntity openEntity4 = this.f17721b.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity4, "host.driveViewModel.openEntity");
            String apiExtra = openEntity4.getApiExtra();
            BaseOpenEntity openEntity5 = this.f17721b.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity5, "host.driveViewModel.openEntity");
            a2.mo25745a(j, fileId2, apiExtra, openEntity5.getMountPoint(), (C6414b) null);
            C6891a.m27229a(this.f17721b).mo27931b(this.f17721b.mo27261l().getFileModel(), "open_in_other_apps", "none");
        }
    }
}

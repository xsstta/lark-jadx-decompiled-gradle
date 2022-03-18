package com.bytedance.ee.bear.drive.biz.downgrade;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/downgrade/DrivePreviewDowngradePlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DrivePreviewDowngradePlugin extends AbsDrivePlugin {
    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).getliveInnerDowngrade().mo5923a(getLifecycleOwner(), new C6407a(aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.downgrade.DrivePreviewDowngradePlugin$a */
    public static final class C6407a<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f17712a;

        C6407a(DrivePluginHost aVar) {
            this.f17712a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            AbstractC6946a fileModel = this.f17712a.mo27261l().getFileModel();
            if (fileModel != null) {
                fileModel.mo27331c(1);
            }
            AbstractC6946a fileModel2 = this.f17712a.mo27261l().getFileModel();
            if (fileModel2 != null) {
                fileModel2.mo27357w();
            }
            C7128a b = C6891a.m27234b(this.f17712a);
            BaseOpenEntity openEntity = this.f17712a.mo27261l().getOpenEntity();
            Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
            b.mo27882a(openEntity.getFileId(), 3, "is_drive_downgrade", "true");
            C13479a.m54764b("DriveComponent", "start downgrade preview");
            this.f17712a.mo27262m().mo27307f();
        }
    }
}

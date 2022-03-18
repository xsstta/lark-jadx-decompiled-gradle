package com.bytedance.ee.bear.drive.biz.permission;

import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.view.p362a.C7207a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/DriveMGPermissionPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveMGPermissionPlugin extends AbsDrivePlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionPlugin$a */
    public static final class C6506a<T> implements AbstractC1178x<ConnectionService.NetworkState> {

        /* renamed from: a */
        final /* synthetic */ DriveMGPermissionVM f17937a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f17938b;

        C6506a(DriveMGPermissionVM aVar, DrivePluginHost aVar2) {
            this.f17937a = aVar;
            this.f17938b = aVar2;
        }

        /* renamed from: a */
        public final void onChanged(ConnectionService.NetworkState networkState) {
            if (networkState != null && networkState.mo20041b() && this.f17937a.livePerm().mo5927b() == null) {
                DriveMGPermissionVM aVar = this.f17937a;
                BaseOpenEntity openEntity = this.f17938b.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
                aVar.fetchPermission(openEntity.getFileId());
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        DriveMGPermissionVM aVar2 = (DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class);
        C6891a.m27232a(this, new C6506a(aVar2, aVar));
        aVar2.livePerm().mo5923a(getLifecycleOwner(), new C6507b(aVar));
        aVar2.getLiveTooManyRequestTips().mo5923a(getLifecycleOwner(), new C6508c(this, aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionPlugin$b */
    public static final class C6507b<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DrivePluginHost f17939a;

        C6507b(DrivePluginHost aVar) {
            this.f17939a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            boolean z;
            C1177w<Boolean> liveOuterExportVisible = C6891a.m27236d(this.f17939a).liveOuterExportVisible();
            boolean z2 = false;
            if (bVar == null || !bVar.mo26059e()) {
                z = false;
            } else {
                z = true;
            }
            liveOuterExportVisible.mo5926a(Boolean.valueOf(z));
            C1177w<Boolean> liveOuterCopyable = C6891a.m27236d(this.f17939a).liveOuterCopyable();
            if (bVar != null && bVar.mo26058d()) {
                z2 = true;
            }
            liveOuterCopyable.mo5926a(Boolean.valueOf(z2));
            if (bVar != null) {
                C13479a.m54764b("DriveComponent", "DriveMGPermissionPlugin#onChanged()... token= " + C13598b.m55197d(bVar.mo26055a()) + ", selfPermission = " + bVar.mo26056b() + ", previewStatusCode = " + bVar.mo26065k());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionPlugin$c */
    public static final class C6508c<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DriveMGPermissionPlugin f17940a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f17941b;

        C6508c(DriveMGPermissionPlugin driveMGPermissionPlugin, DrivePluginHost aVar) {
            this.f17940a = driveMGPermissionPlugin;
            this.f17941b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C13479a.m54775e("DriveComponent", "liveTooManyRequestTips receive v=" + bool);
            if (!(!Intrinsics.areEqual((Object) bool, (Object) true))) {
                C6920b f = C6920b.m27342f();
                Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                f.mo27178g().mo28224b(this.f17940a.getActivity(), null, this.f17940a.getResources().getString(R.string.Drive_Drive_OperationsTooFrequent), new C7207a.AbstractC7208a(this) {
                    /* class com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionPlugin.C6508c.C65091 */

                    /* renamed from: a */
                    final /* synthetic */ C6508c f17942a;

                    @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                    /* renamed from: a */
                    public void mo25758a() {
                        C6891a.m27235c(this.f17942a.f17941b);
                    }

                    @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                    /* renamed from: b */
                    public void mo25759b() {
                        C6891a.m27235c(this.f17942a.f17941b);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f17942a = r1;
                    }
                }).show();
            }
        }
    }
}

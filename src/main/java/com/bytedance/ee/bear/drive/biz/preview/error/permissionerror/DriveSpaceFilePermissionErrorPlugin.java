package com.bytedance.ee.bear.drive.biz.preview.error.permissionerror;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.DriveNoPerm;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6949c;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.service.C10917c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/permissionerror/DriveSpaceFilePermissionErrorPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveSpaceFilePermissionErrorPlugin extends AbsDrivePreviewPlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveSpaceFilePermissionErrorPlugin$b */
    public static final class RunnableC6600b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFilePermissionErrorPlugin f18095a;

        RunnableC6600b(DriveSpaceFilePermissionErrorPlugin driveSpaceFilePermissionErrorPlugin) {
            this.f18095a = driveSpaceFilePermissionErrorPlugin;
        }

        public final void run() {
            ((DriveMGPermissionVM) this.f18095a.viewModel(DriveMGPermissionVM.class)).fetchPermission(C6891a.m27230a((BasePlugin<DrivePluginHost>) this.f18095a));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveSpaceFilePermissionErrorPlugin$a */
    public static final class C6598a<T> implements AbstractC1178x<C6522b> {

        /* renamed from: a */
        final /* synthetic */ DriveSpaceFilePermissionErrorPlugin f18092a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18093b;

        C6598a(DriveSpaceFilePermissionErrorPlugin driveSpaceFilePermissionErrorPlugin, DrivePluginHost aVar) {
            this.f18092a = driveSpaceFilePermissionErrorPlugin;
            this.f18093b = aVar;
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/bytedance/ee/bear/drive/biz/preview/error/permissionerror/DriveSpaceFilePermissionErrorPlugin$onAttachToHost$1$1$1"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveSpaceFilePermissionErrorPlugin$a$a */
        public static final class RunnableC6599a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6598a f18094a;

            RunnableC6599a(C6598a aVar) {
                this.f18094a = aVar;
            }

            public final void run() {
                if (!this.f18094a.f18092a.isUIContainerDetached()) {
                    ((DriveMGPermissionVM) this.f18094a.f18092a.viewModel(DriveMGPermissionVM.class)).fetchPermission(C6891a.m27230a((BasePlugin<DrivePluginHost>) this.f18094a.f18092a));
                    this.f18094a.f18093b.mo27262m().mo27298b();
                }
            }
        }

        /* renamed from: a */
        public final void onChanged(C6522b bVar) {
            String str;
            if (bVar != null && !bVar.mo26063i()) {
                this.f18092a.removePreviewView();
                DriveNoPerm.Companion aVar = DriveNoPerm.f17950a;
                C10917c cVar = ar.f14811a;
                Intrinsics.checkExpressionValueIsNotNull(cVar, "ServiceHolder.serviceContext");
                FragmentActivity activity = this.f18092a.getActivity();
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
                RunnableC6599a aVar2 = new RunnableC6599a(this);
                boolean z = !this.f18093b.mo27261l().isVCFollowMode();
                AbstractC6949c iFileModel = this.f18093b.mo27261l().getIFileModel();
                if (iFileModel == null || (str = iFileModel.mo27373c()) == null) {
                    str = "";
                }
                aVar.mo26021a(cVar, supportFragmentManager, bVar, aVar2, -1, z, str, this.f18093b.mo27261l().isVCFollowMode());
                C6920b f = C6920b.m27342f();
                Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                f.mo27178g().mo28223a();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        ((DriveMGPermissionVM) viewModel(DriveMGPermissionVM.class)).livePerm().mo5923a(getLifecycleOwner(), new C6598a(this, aVar));
        addErrorHandler(new RunnableC6600b(this), ErrCode.PERMISSION_DENIED);
    }
}

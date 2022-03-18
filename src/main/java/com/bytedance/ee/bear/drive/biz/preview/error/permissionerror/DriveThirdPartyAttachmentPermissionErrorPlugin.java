package com.bytedance.ee.bear.drive.biz.preview.error.permissionerror;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.cache.CacheUtils;
import com.bytedance.ee.bear.drive.biz.permission.DriveNoPerm;
import com.bytedance.ee.bear.drive.biz.permission.DriveThirdPartyPermissionVM;
import com.bytedance.ee.bear.drive.biz.permission.model.ThirdPartyAttachmentPermission;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.util.io.C13672c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/permissionerror/DriveThirdPartyAttachmentPermissionErrorPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "handlePermissionError", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveThirdPartyAttachmentPermissionErrorPlugin extends AbsDrivePreviewPlugin {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveThirdPartyAttachmentPermissionErrorPlugin$a */
    public static final class RunnableC6601a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveThirdPartyAttachmentPermissionErrorPlugin f18096a;

        RunnableC6601a(DriveThirdPartyAttachmentPermissionErrorPlugin driveThirdPartyAttachmentPermissionErrorPlugin) {
            this.f18096a = driveThirdPartyAttachmentPermissionErrorPlugin;
        }

        public final void run() {
            this.f18096a.handlePermissionError();
        }
    }

    public final void handlePermissionError() {
        removePreviewView();
        String b = C13672c.m55481b(((DrivePluginHost) getHost()).mo27261l().getFileName());
        boolean isVCFollowMode = ((DrivePluginHost) getHost()).mo27261l().isVCFollowMode();
        DriveNoPerm.Companion aVar = DriveNoPerm.f17950a;
        FragmentActivity activity = getActivity();
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
        DriveNoPerm.Companion.m26135a(aVar, supportFragmentManager, 0, false, b, Boolean.valueOf(isVCFollowMode), 6, (Object) null);
        CacheUtils.Companion.m25412a(CacheUtils.f17530a, ((DrivePluginHost) getHost()).mo27261l(), null, 2, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/drive/biz/permission/model/ThirdPartyAttachmentPermission;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveThirdPartyAttachmentPermissionErrorPlugin$b */
    public static final class C6602b<T> implements AbstractC1178x<ThirdPartyAttachmentPermission> {

        /* renamed from: a */
        final /* synthetic */ DriveThirdPartyAttachmentPermissionErrorPlugin f18097a;

        C6602b(DriveThirdPartyAttachmentPermissionErrorPlugin driveThirdPartyAttachmentPermissionErrorPlugin) {
            this.f18097a = driveThirdPartyAttachmentPermissionErrorPlugin;
        }

        /* renamed from: a */
        public final void onChanged(ThirdPartyAttachmentPermission thirdPartyAttachmentPermission) {
            if (thirdPartyAttachmentPermission != null && thirdPartyAttachmentPermission.getView() != 1) {
                this.f18097a.handlePermissionError();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        addErrorHandler(new RunnableC6601a(this), ErrCode.PERMISSION_DENIED);
        ((DriveThirdPartyPermissionVM) viewModel(DriveThirdPartyPermissionVM.class)).livePerm().mo5923a(getLifecycleOwner(), new C6602b(this));
    }
}

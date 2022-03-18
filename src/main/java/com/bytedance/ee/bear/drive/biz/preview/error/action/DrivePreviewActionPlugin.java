package com.bytedance.ee.bear.drive.biz.preview.error.action;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.common.p341a.C6887a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drivesdk.action.ClosePreviewAction;
import com.bytedance.ee.bear.drivesdk.action.MenuConfigAction;
import com.bytedance.ee.bear.drivesdk.action.ShowErrorPageAction;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class DrivePreviewActionPlugin extends AbsDrivePreviewPlugin implements C6887a.AbstractC6889b<C6887a.C6888a<PreviewAction>> {
    private View mPreviewActionView;

    @Override // com.bytedance.ee.bear.drive.common.p341a.C6887a.AbstractC6889b
    public String getKey() {
        return "drivesdk_preview_action";
    }

    static /* synthetic */ void lambda$onReceived$1(Throwable th) throws Exception {
        C13479a.m54759a("DriveSdk", "DriveCacheManager.inst().remove error", th);
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        super.onAttachToHost(aVar);
        C6887a.m27207a().mo27122a(this);
    }

    static /* synthetic */ void lambda$onReceived$0(Boolean bool) throws Exception {
        C13479a.m54764b("DriveSdk", "DriveCacheManager.inst().remove result=" + bool);
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onDetachFromHost(DrivePluginHost aVar) {
        super.onDetachFromHost(aVar);
        C6887a.m27207a().mo27123b(this);
        if (this.mPreviewActionView != null && getUIContainer() != null) {
            getUIContainer().mo19594b(this, this.mPreviewActionView);
        }
    }

    public void onReceived(C6887a.C6888a<PreviewAction> aVar) {
        try {
            onReceived(aVar.mo27124a());
        } catch (Exception e) {
            C13479a.m54759a("DriveComponent", "DrivePreviewActionPlugin#onReceived() error", e);
        }
    }

    private void onReceived(PreviewAction previewAction) {
        C13479a.m54764b("DriveSdk", "DriveSdkPreviewActionPlugin#livePreviewAction receive action=" + previewAction);
        if (previewAction != null && !isUIContainerDetached()) {
            View view = this.mPreviewActionView;
            if (view != null) {
                view.setVisibility(8);
                getUIContainer().mo19594b(this, this.mPreviewActionView);
            }
            if (previewAction instanceof ClosePreviewAction) {
                C13479a.m54764b("DriveComponent", "received ClosePreviewAction() close it");
                ((DrivePluginHost) getHost()).mo19564f().finish();
            } else if (previewAction instanceof ShowErrorPageAction) {
                C13479a.m54764b("DriveComponent", "received ShowErrorPageAction() show error pages");
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.drive_sdk_preview_action_error_page, (ViewGroup) null);
                this.mPreviewActionView = inflate;
                ShowErrorPageAction showErrorPageAction = (ShowErrorPageAction) previewAction;
                SpaceEmptyState spaceEmptyState = (SpaceEmptyState) inflate.findViewById(R.id.drive_sdk_preview_action_error_empty_state);
                spaceEmptyState.setDesc(showErrorPageAction.mo29726c());
                if (showErrorPageAction.mo29725b() != 0) {
                    spaceEmptyState.setImageRes(Integer.valueOf(showErrorPageAction.mo29725b()));
                }
                removePreviewView();
                getUIContainer().mo19588a(this, this.mPreviewActionView);
                if (showErrorPageAction.mo29727d()) {
                    C13479a.m54764b("DriveComponent", "DriveSdkPreviewActionPlugin#livePreviewAction() clearMenus");
                    getTitleBar().mo19528h(false);
                }
                if (showErrorPageAction.mo29724a()) {
                    C13479a.m54764b("DriveSdk", "DriveSdkPreviewActionPlugin#livePreviewAction() isDeleteFileCache");
                    C6880a.m27065a().mo27088b(C6880a.m27075a(((DrivePluginHost) getHost()).mo27261l().getIFileModel())).mo238004b(C11678b.m48479c()).mo238001b($$Lambda$DrivePreviewActionPlugin$cA81hOVsHYH0UcPbj2lbNIKXlfg.INSTANCE, $$Lambda$DrivePreviewActionPlugin$Mibk14tVrso0YCQkd3FNNiyleHo.INSTANCE);
                }
            } else if (previewAction instanceof MenuConfigAction) {
                C13479a.m54764b("DriveSdk", "DriveSdkPreviewActionPlugin#livePreviewAction() menuConfigAction");
                ((DrivePluginHost) getHost()).mo27261l().getOpenEntity().setMoreMenuActions(((MenuConfigAction) previewAction).mo29716a());
            } else {
                C13479a.m54758a("DriveSdk", "DriveSdkPreviewActionPlugin#livePreviewAction() unsupport PreviewAction");
            }
        }
    }
}

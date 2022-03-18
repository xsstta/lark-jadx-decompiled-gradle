package com.bytedance.ee.bear.drive.biz.preview.vc;

import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import com.bytedance.ee.bear.browser.plugin.TitleBar;
import com.bytedance.ee.bear.drive.biz.docplugin.AbstractBinderC6405b;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/vc/DriveVCModePlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "Lcom/bytedance/ee/bear/facade/common/BackPressHandler;", "()V", "mCallback", "Lcom/bytedance/ee/bear/drive/biz/docplugin/ICallback;", "onAttachPreview", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "onBackPressed", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveVCModePlugin extends AbsDrivePreviewPlugin implements AbstractC7666d {
    private AbstractBinderC6405b mCallback;

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachPreview() {
        super.onAttachPreview();
        TitleBar titleBar = getTitleBar();
        Intrinsics.checkExpressionValueIsNotNull(titleBar, "titleBar");
        titleBar.mo19508a().setLeftClickListener(new View$OnClickListenerC6723a(this));
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        AbstractBinderC6405b bVar = this.mCallback;
        if (bVar == null) {
            return false;
        }
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        bVar.mo25711b(new AbstractBinderC6405b.C6406a(100));
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCModePlugin$a */
    static final class View$OnClickListenerC6723a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveVCModePlugin f18309a;

        View$OnClickListenerC6723a(DriveVCModePlugin driveVCModePlugin) {
            this.f18309a = driveVCModePlugin;
        }

        public final void onClick(View view) {
            if (!this.f18309a.onBackPressed()) {
                DrivePluginHost aVar = (DrivePluginHost) this.f18309a.getHost();
                Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
                C6891a.m27235c(aVar);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        IBinder iBinder;
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        try {
            Bundle args = aVar.mo27261l().getArgs();
            if (args != null) {
                iBinder = args.getBinder("drive_uistate_callback");
            } else {
                iBinder = null;
            }
            this.mCallback = (AbstractBinderC6405b) iBinder;
        } catch (Exception e) {
            C13479a.m54761a("DriveComponent", e);
        }
    }
}

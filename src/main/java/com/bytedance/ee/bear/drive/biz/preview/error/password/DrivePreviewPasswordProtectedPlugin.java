package com.bytedance.ee.bear.drive.biz.preview.error.password;

import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/password/DrivePreviewPasswordProtectedPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "encryptedView", "Lcom/bytedance/ee/bear/drive/biz/preview/error/password/DriveFileEncryptedView;", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "showPasswordProtectedErrorPage", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DrivePreviewPasswordProtectedPlugin extends AbsDrivePreviewPlugin {
    public DriveFileEncryptedView encryptedView;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.password.DrivePreviewPasswordProtectedPlugin$b */
    public static final class RunnableC6592b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DrivePreviewPasswordProtectedPlugin f18086a;

        RunnableC6592b(DrivePreviewPasswordProtectedPlugin drivePreviewPasswordProtectedPlugin) {
            this.f18086a = drivePreviewPasswordProtectedPlugin;
        }

        public final void run() {
            C13479a.m54764b("DriveComponent", "DrivePreviewPasswordProtectedPlugin() REQUEST_TRANSFORM_FILE_ENCRYPTION.");
            this.f18086a.showPasswordProtectedErrorPage();
        }
    }

    public final void showPasswordProtectedErrorPage() {
        DriveFileEncryptedView driveFileEncryptedView = new DriveFileEncryptedView(getContext());
        this.encryptedView = driveFileEncryptedView;
        if (driveFileEncryptedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("encryptedView");
        }
        driveFileEncryptedView.setOnOpenExternalClickListener(new View$OnClickListenerC6593c(this));
        DrivePluginHost aVar = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        C6891a.m27236d(aVar).liveOuterExportVisible().mo5923a(getLifecycleOwner(), new C6594d(this));
        DriveFileEncryptedView driveFileEncryptedView2 = this.encryptedView;
        if (driveFileEncryptedView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("encryptedView");
        }
        removeAndAddPreviewView(driveFileEncryptedView2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.password.DrivePreviewPasswordProtectedPlugin$a */
    public static final class C6591a<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ DrivePreviewPasswordProtectedPlugin f18085a;

        C6591a(DrivePreviewPasswordProtectedPlugin drivePreviewPasswordProtectedPlugin) {
            this.f18085a = drivePreviewPasswordProtectedPlugin;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            if (str != null) {
                C13479a.m54764b("DriveComponent", "liveInnerPasswordProtected() show error tips page.");
                this.f18085a.showPasswordProtectedErrorPage();
            }
        }
    }

    public static final /* synthetic */ DriveFileEncryptedView access$getEncryptedView$p(DrivePreviewPasswordProtectedPlugin drivePreviewPasswordProtectedPlugin) {
        DriveFileEncryptedView driveFileEncryptedView = drivePreviewPasswordProtectedPlugin.encryptedView;
        if (driveFileEncryptedView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("encryptedView");
        }
        return driveFileEncryptedView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.password.DrivePreviewPasswordProtectedPlugin$c */
    public static final class View$OnClickListenerC6593c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DrivePreviewPasswordProtectedPlugin f18087a;

        View$OnClickListenerC6593c(DrivePreviewPasswordProtectedPlugin drivePreviewPasswordProtectedPlugin) {
            this.f18087a = drivePreviewPasswordProtectedPlugin;
        }

        public final void onClick(View view) {
            C13479a.m54764b("DriveComponent", "DrivePreviewPasswordProtectedPlugin() open external");
            DrivePluginHost aVar = (DrivePluginHost) this.f18087a.getHost();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
            C6891a.m27236d(aVar).liveInnerOpenExternal().mo5926a((Void) null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.password.DrivePreviewPasswordProtectedPlugin$d */
    public static final class C6594d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DrivePreviewPasswordProtectedPlugin f18088a;

        C6594d(DrivePreviewPasswordProtectedPlugin drivePreviewPasswordProtectedPlugin) {
            this.f18088a = drivePreviewPasswordProtectedPlugin;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            C13479a.m54764b("DriveComponent", "liveOuterExportVisible() visible = " + bool);
            DriveFileEncryptedView access$getEncryptedView$p = DrivePreviewPasswordProtectedPlugin.access$getEncryptedView$p(this.f18088a);
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            access$getEncryptedView$p.setBtnOpenExternalVisible(bool.booleanValue());
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        C6891a.m27236d(aVar).liveInnerPasswordProtected().mo5923a(getLifecycleOwner(), new C6591a(this));
        addErrorHandler(new RunnableC6592b(this), ErrCode.REQUEST_TRANSFORM_FILE_ENCRYPTION);
    }
}

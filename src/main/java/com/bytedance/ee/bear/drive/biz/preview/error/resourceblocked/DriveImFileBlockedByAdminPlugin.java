package com.bytedance.ee.bear.drive.biz.preview.error.resourceblocked;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13726a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/resourceblocked/DriveImFileBlockedByAdminPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "showFileDeletedByAdminDialog", "strRes", "", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveImFileBlockedByAdminPlugin extends AbsDrivePreviewPlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/resourceblocked/DriveImFileBlockedByAdminPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.resourceblocked.DriveImFileBlockedByAdminPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/error/resourceblocked/DriveImFileBlockedByAdminPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onFailed", "", "code", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.resourceblocked.DriveImFileBlockedByAdminPlugin$b */
    public static final class C6604b extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ DriveImFileBlockedByAdminPlugin f18100a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6604b(DriveImFileBlockedByAdminPlugin driveImFileBlockedByAdminPlugin) {
            this.f18100a = driveImFileBlockedByAdminPlugin;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            Intrinsics.checkParameterIsNotNull(errCode, "code");
            int i = C6606a.f18102a[errCode.ordinal()];
            if (i == 1) {
                C13479a.m54764b("DriveImFileBlockedByAdminPlugin", "STATIC_RESOURCE_FROZEN_BY_ADMIN, showDialog");
                this.f18100a.showFileDeletedByAdminDialog(R.string.Drive_Sdk_FileNotFoundDialogResourceFrozen);
            } else if (i == 2) {
                C13479a.m54764b("DriveImFileBlockedByAdminPlugin", "STATIC_RESOURCE_SHREDDED_BY_ADMIN, showDialog");
                this.f18100a.showFileDeletedByAdminDialog(R.string.Drive_Sdk_FileNotFoundDialogResourceShredded);
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        aVar.mo27262m().mo27297a(new C6604b(this));
    }

    public final void showFileDeletedByAdminDialog(int i) {
        removePreviewView();
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        new BearUDDialogBuilder(context).mo45344a(R.string.Drive_Sdk_FileNotFoundDialogTitle).mo45362d(i).mo45351a(BearUDDialogBuilder.ActionBottomOrientation.VERTICAL).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_GotIt, new DialogInterface$OnClickListenerC6605c(this)).mo45355a().show();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.resourceblocked.DriveImFileBlockedByAdminPlugin$c */
    public static final class DialogInterface$OnClickListenerC6605c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DriveImFileBlockedByAdminPlugin f18101a;

        DialogInterface$OnClickListenerC6605c(DriveImFileBlockedByAdminPlugin driveImFileBlockedByAdminPlugin) {
            this.f18101a = driveImFileBlockedByAdminPlugin;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (C13726a.m55676b(this.f18101a.getActivity())) {
                this.f18101a.getActivity().finish();
            }
        }
    }
}

package com.bytedance.ee.bear.drive.biz.preview.error.net;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin;
import com.bytedance.ee.bear.drive.cache.C6880a;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import com.bytedance.ee.bear.drive.core.model.AbstractC6947b;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.drive.view.p362a.C7207a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13672c;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/net/DriveTrafficDownloadPlugin;", "Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "()V", "onAttachToHost", "", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveTrafficDownloadPlugin extends AbsDrivePreviewPlugin {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/error/net/DriveTrafficDownloadPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.net.DriveTrafficDownloadPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.error.net.DriveTrafficDownloadPlugin$b */
    public static final class RunnableC6579b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DriveTrafficDownloadPlugin f18072a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f18073b;

        RunnableC6579b(DriveTrafficDownloadPlugin driveTrafficDownloadPlugin, DrivePluginHost aVar) {
            this.f18072a = driveTrafficDownloadPlugin;
            this.f18073b = aVar;
        }

        public final void run() {
            long j;
            AbstractC6947b a;
            C7207a aVar = new C7207a();
            FragmentActivity activity = this.f18072a.getActivity();
            FragmentActivity activity2 = this.f18072a.getActivity();
            AbstractC6946a fileModel = this.f18073b.mo27261l().getFileModel();
            if (fileModel == null || (a = fileModel.mo27322a()) == null) {
                j = 0;
            } else {
                j = a.f18787c;
            }
            String a2 = C10539a.m43639a(activity, R.string.Drive_Drive_NetworkRemind, "size", C13672c.m55479a(activity2, j));
            String string = this.f18072a.getActivity().getString(R.string.Drive_Drive_NoWifi);
            Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(R.string.Drive_Drive_NoWifi)");
            aVar.mo28221a(this.f18072a.getContext(), string, a2, new C7207a.AbstractC7208a(this) {
                /* class com.bytedance.ee.bear.drive.biz.preview.error.net.DriveTrafficDownloadPlugin.RunnableC6579b.C65801 */

                /* renamed from: a */
                final /* synthetic */ RunnableC6579b f18074a;

                @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                /* renamed from: b */
                public void mo25759b() {
                    C13479a.m54764b("DriveTrafficDownloadPlugin", "User confirm mobile network download, start download");
                    C6880a.m27087a(true);
                    this.f18074a.f18073b.mo27262m().mo27307f();
                }

                @Override // com.bytedance.ee.bear.drive.view.p362a.C7207a.AbstractC7208a
                /* renamed from: a */
                public void mo25758a() {
                    C13479a.m54764b("DriveTrafficDownloadPlugin", "User cancel mobile network download");
                    C6920b f = C6920b.m27342f();
                    Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
                    C7128a b = f.mo27167b();
                    BaseOpenEntity openEntity = this.f18074a.f18073b.mo27261l().getOpenEntity();
                    Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
                    b.mo27889a("cancel", "DEC14", openEntity.getFileId(), 3);
                    C6891a.m27235c(this.f18074a.f18073b);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f18074a = r1;
                }
            }).show();
        }
    }

    @Override // com.bytedance.ee.bear.drive.core.AbsDrivePlugin
    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost(aVar);
        addErrorHandler(new RunnableC6579b(this, aVar), ErrCode.MOBILE_NETWORK_NOT_AUTHORIZATION);
    }
}

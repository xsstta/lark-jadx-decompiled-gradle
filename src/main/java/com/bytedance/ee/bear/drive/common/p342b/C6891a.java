package com.bytedance.ee.bear.drive.common.p342b;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.config.strategy.AbstractC6927d;
import com.bytedance.ee.bear.drive.config.strategy.C6932i;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.C6937b;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.report.C7128a;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13602d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0010\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00020\t\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fH\u0007\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\b*\u00020\u0017¨\u0006\u0018"}, d2 = {"closePage", "", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "driveDevReport", "Lcom/bytedance/ee/bear/drive/report/DriveDevPerformanceReport;", "driveReport", "Lcom/bytedance/ee/bear/drive/report/DriveReport;", "fileId", "", "Lcom/bytedance/ee/bear/browser/plugin/BasePlugin;", "isConnected", "", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "observeNetState", "ob", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/contract/ConnectionService$NetworkState;", "previewFileStrategy", "Lcom/bytedance/ee/bear/drive/config/strategy/IPreviewFileStrategy;", "Lcom/bytedance/ee/bear/drive/core/DriveViewModel;", "previewViewModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewViewModel;", "reportFileId", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/open/BaseOpenEntity;", "drive-impl_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.common.b.a */
public final class C6891a {
    /* renamed from: a */
    public static final AbstractC6927d m27228a(C6937b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "$this$previewFileStrategy");
        AbstractC6927d a = C6932i.m27446a(bVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "PreviewFileStrategyUtils…iveVM(\n        this\n    )");
        return a;
    }

    /* renamed from: a */
    public static final C7130c m27229a(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$driveReport");
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        C7130c a = f.mo27166a();
        Intrinsics.checkExpressionValueIsNotNull(a, "DriveConfigServiceImpl.getInstance().driveReport");
        return a;
    }

    /* renamed from: b */
    public static final C7128a m27234b(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$driveDevReport");
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        C7128a b = f.mo27167b();
        Intrinsics.checkExpressionValueIsNotNull(b, "DriveConfigServiceImpl.g…driveDevPerformanceReport");
        return b;
    }

    /* renamed from: d */
    public static final C7555f m27236d(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$previewViewModel");
        AbstractC1142af a = C4950k.m20478a(aVar, C7555f.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…iewViewModel::class.java)");
        return (C7555f) a;
    }

    /* renamed from: a */
    public static final String m27230a(BasePlugin<DrivePluginHost> basePlugin) {
        Intrinsics.checkParameterIsNotNull(basePlugin, "$this$fileId");
        BaseOpenEntity openEntity = basePlugin.getHost().mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
        String fileId = openEntity.getFileId();
        Intrinsics.checkExpressionValueIsNotNull(fileId, "host.driveViewModel.openEntity.fileId");
        return fileId;
    }

    /* renamed from: c */
    public static final void m27235c(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$closePage");
        if (aVar.mo27261l().isVCFollowMode()) {
            C13479a.m54764b("DriveComponent", "closePage()# is VC page, showRetry");
            m27236d(aVar).liveInnerShowRetryPage().mo5926a((Void) null);
            return;
        }
        C13479a.m54764b("DriveComponent", "closePage()# start finish");
        FragmentActivity f = aVar.mo19564f();
        if (f != null) {
            f.finish();
        }
    }

    /* renamed from: a */
    public static final String m27231a(BaseOpenEntity baseOpenEntity) {
        Intrinsics.checkParameterIsNotNull(baseOpenEntity, "$this$reportFileId");
        if (baseOpenEntity instanceof LocalOpenEntity) {
            return "local_" + C13602d.m55222a(((LocalOpenEntity) baseOpenEntity).getLocalFilePath());
        }
        String fileId = baseOpenEntity.getFileId();
        Intrinsics.checkExpressionValueIsNotNull(fileId, "fileId");
        return fileId;
    }

    /* renamed from: a */
    public static final boolean m27233a(AbsDrivePlugin absDrivePlugin) {
        ConnectionService.NetworkState b;
        Intrinsics.checkParameterIsNotNull(absDrivePlugin, "$this$isConnected");
        ConnectionService d = C5084ad.m20847d();
        if (d == null || (b = d.mo20038b()) == null || !b.mo20041b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final void m27232a(AbsDrivePlugin absDrivePlugin, AbstractC1178x<ConnectionService.NetworkState> xVar) {
        Intrinsics.checkParameterIsNotNull(absDrivePlugin, "$this$observeNetState");
        Intrinsics.checkParameterIsNotNull(xVar, "ob");
        LiveData<ConnectionService.NetworkState> a = C5084ad.m20847d().mo20037a();
        DrivePluginHost aVar = (DrivePluginHost) absDrivePlugin.getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "host");
        a.mo5923a(aVar.mo19566h(), xVar);
    }
}

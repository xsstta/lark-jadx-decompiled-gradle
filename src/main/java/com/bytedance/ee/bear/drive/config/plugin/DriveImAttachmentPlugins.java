package com.bytedance.ee.bear.drive.config.plugin;

import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.drive.biz.cache.DriveImFileCachePlugin;
import com.bytedance.ee.bear.drive.biz.cache.WpsFileCachePlugin;
import com.bytedance.ee.bear.drive.biz.download.DriveImFileDownloadPlugin;
import com.bytedance.ee.bear.drive.biz.external.DriveImFileOpenExternalPlugin;
import com.bytedance.ee.bear.drive.biz.fileinfo.DriveImFileInfoPlugin;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.biz.preview.banner.DriveBannerPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error._default.DriveImFailToRetryPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.net.DriveReConnectedPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.notfound.DriveFileNotFoundPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveImFilePermissionErrorPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.resourceblocked.DriveImFileBlockedByAdminPlugin;
import com.bytedance.ee.bear.drive.biz.preview.imattachment.DriveImAttachmentDefaultPreviewModelStatePlugin;
import com.bytedance.ee.bear.drive.biz.preview.loading.DriveDownloadingPlugin;
import com.bytedance.ee.bear.drive.biz.preview.loading.DriveGeneratingPlugin;
import com.bytedance.ee.bear.drive.biz.preview.more.DriveImFileMoreMenuPlugin;
import com.bytedance.ee.bear.drive.biz.preview.orientation.DriveOrientationPlugin;
import com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveCenterTitlePositionPlugin;
import com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveTitleBarPlugin;
import com.bytedance.ee.bear.drive.biz.save2space.DriveImFileSaveToSpacePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.report.DriveImFileReportPlugin;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/DriveImAttachmentPlugins;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.config.plugin.a */
public final class DriveImAttachmentPlugins {

    /* renamed from: a */
    public static final Companion f18705a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/DriveImAttachmentPlugins$Companion;", "", "()V", "create", "Lcom/bytedance/ee/bear/browser/plugin/PluginList;", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.config.plugin.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C4946h mo27232a(DrivePluginHost aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "host");
            C4946h a = C4946h.m20453a(C4946h.m20455b(new DrivePreviewContentPlugin()), C4946h.m20455b(new DriveImFilePermissionErrorPlugin()), C4946h.m20455b(new DriveImFileMoreMenuPlugin()), C4946h.m20455b(new DriveImFileDownloadPlugin()), C4946h.m20455b(new DriveImFileSaveToSpacePlugin()), C4946h.m20455b(new DriveOrientationPlugin()), C4946h.m20455b(new DriveTitleBarPlugin()), C4946h.m20445a(new DriveDownloadingPlugin(), DrivePluginLevel.Downloading), C4946h.m20455b(new DriveImFailToRetryPlugin()), C4946h.m20455b(new DriveFileNotFoundPlugin()), C4946h.m20455b(new DriveImFileInfoPlugin()), C4946h.m20455b(new DriveImAttachmentDefaultPreviewModelStatePlugin()), C4946h.m20455b(new DriveImFileBlockedByAdminPlugin()), C4946h.m20455b(new DriveImFileReportPlugin()), C4946h.m20455b(new DriveImFileOpenExternalPlugin()), C4946h.m20455b(new DriveImFileCachePlugin()), C4946h.m20455b(new DriveGeneratingPlugin()), C4946h.m20455b(new DriveReConnectedPlugin()), C4946h.m20455b(new WpsFileCachePlugin()), C4946h.m20455b(new DriveCenterTitlePositionPlugin()), C4946h.m20455b(new DriveBannerPlugin()));
            Intrinsics.checkExpressionValueIsNotNull(a, "PluginList.newList(\n    …erPlugin())\n            )");
            return a;
        }
    }
}

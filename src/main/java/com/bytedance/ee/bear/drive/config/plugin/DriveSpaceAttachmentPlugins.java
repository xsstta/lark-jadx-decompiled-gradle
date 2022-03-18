package com.bytedance.ee.bear.drive.config.plugin;

import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.drive.biz.cache.DriveSpaceFileCachePlugin;
import com.bytedance.ee.bear.drive.biz.cache.WpsFileCachePlugin;
import com.bytedance.ee.bear.drive.biz.external.DriveSpaceFileOpenExternalPlugin;
import com.bytedance.ee.bear.drive.biz.fileinfo.DriveSpaceFileInfoPlugin;
import com.bytedance.ee.bear.drive.biz.permission.DriveSpaceAttachmentMGPermissionPlugin;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.biz.preview.banner.DriveBannerPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error._default.DriveFailedToRetryPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.copy.DriveCoppingPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.copy.DriveCopyFailedPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.net.DriveReConnectedPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.notfound.DriveFileNotFoundPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveOwnerDeletedFilePlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveSpaceAttachmentPermissionErrorPlugin;
import com.bytedance.ee.bear.drive.biz.preview.loading.DriveDownloadingPlugin;
import com.bytedance.ee.bear.drive.biz.preview.loading.DriveGeneratingPlugin;
import com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceAttachmentMoreMenuPlugin;
import com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveTitleBarPlugin;
import com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin;
import com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCModePlugin;
import com.bytedance.ee.bear.drive.biz.preview.watermark.DriveWatermarkPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/DriveSpaceAttachmentPlugins;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.config.plugin.c */
public final class DriveSpaceAttachmentPlugins {

    /* renamed from: a */
    public static final Companion f18708a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/DriveSpaceAttachmentPlugins$Companion;", "", "()V", "create", "Lcom/bytedance/ee/bear/browser/plugin/PluginList;", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.config.plugin.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C4946h mo27235a(DrivePluginHost aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "host");
            C4946h a = C4946h.m20453a(C4946h.m20455b(new DrivePreviewContentPlugin()), C4946h.m20455b(new DriveWatermarkPlugin()), C4946h.m20445a(new DriveBannerPlugin(), DrivePluginLevel.Banner), C4946h.m20445a(new DriveDownloadingPlugin(), DrivePluginLevel.Downloading), C4946h.m20449a(new DriveVCFollowPlugin(), aVar.mo27261l().isVCFollowMode()), C4946h.m20455b(new DriveFailedToRetryPlugin()), C4946h.m20455b(new DriveFileNotFoundPlugin()), C4946h.m20455b(new DriveOwnerDeletedFilePlugin()), C4946h.m20455b(new DriveSpaceAttachmentPermissionErrorPlugin()), C4946h.m20455b(new DriveCopyFailedPlugin()), C4946h.m20455b(new DriveCoppingPlugin()), C4946h.m20455b(new DriveTitleBarPlugin()), C4946h.m20455b(new DriveSpaceAttachmentMoreMenuPlugin()), C4946h.m20455b(new DriveSpaceAttachmentMGPermissionPlugin()), C4946h.m20455b(new DriveSpaceFileInfoPlugin()), C4946h.m20455b(new DriveSpaceFileOpenExternalPlugin()), C4946h.m20455b(new DriveSpaceFileCachePlugin()), C4946h.m20455b(new DriveVCModePlugin()), C4946h.m20455b(new DriveReConnectedPlugin()), C4946h.m20455b(new WpsFileCachePlugin()), C4946h.m20455b(new DriveGeneratingPlugin()));
            Intrinsics.checkExpressionValueIsNotNull(a, "PluginList.newList(\n    …gPlugin())\n\n            )");
            return a;
        }
    }
}

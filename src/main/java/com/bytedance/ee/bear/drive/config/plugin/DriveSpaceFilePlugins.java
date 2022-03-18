package com.bytedance.ee.bear.drive.config.plugin;

import android.util.Log;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.contract.route.parcelable.WikiPluginsProvider;
import com.bytedance.ee.bear.drive.biz.ability.WikiDriveFileHostPlugin;
import com.bytedance.ee.bear.drive.biz.cache.DriveSpaceFileCachePlugin;
import com.bytedance.ee.bear.drive.biz.cache.WpsFileCachePlugin;
import com.bytedance.ee.bear.drive.biz.comment.DriveCommentPlugin;
import com.bytedance.ee.bear.drive.biz.external.DriveSpaceFileOpenExternalPlugin;
import com.bytedance.ee.bear.drive.biz.extra_info.DriveSpaceFileExtraInfoViewPlugin;
import com.bytedance.ee.bear.drive.biz.extra_info.liked.DriveLikePlugin;
import com.bytedance.ee.bear.drive.biz.extra_info.meta.DriveMetaInfoPlugin;
import com.bytedance.ee.bear.drive.biz.feed.DriveFeedPlugin;
import com.bytedance.ee.bear.drive.biz.fileinfo.DriveSpaceFileInfoPlugin;
import com.bytedance.ee.bear.drive.biz.memory.DriveMemoryOverLimitPlugin;
import com.bytedance.ee.bear.drive.biz.multitask.DriveMultiTaskPlugin;
import com.bytedance.ee.bear.drive.biz.permission.DriveMGPermissionPlugin;
import com.bytedance.ee.bear.drive.biz.permission.push.DriveSpaceFilePermissionPushPlugin;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.biz.preview.banner.DriveBannerPlugin;
import com.bytedance.ee.bear.drive.biz.preview.edit.DriveEditModeSwitchPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error._default.DriveFailedToRetryPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.copy.DriveCoppingPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.copy.DriveCopyFailedPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.net.DriveReConnectedPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.notfound.DriveSpaceFileNotFoundPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.ownerdeletefile.DriveSpaceOwnerDeleteFilePlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.permissionerror.DriveSpaceFilePermissionErrorPlugin;
import com.bytedance.ee.bear.drive.biz.preview.loading.DriveDownloadingPlugin;
import com.bytedance.ee.bear.drive.biz.preview.loading.DriveGeneratingPlugin;
import com.bytedance.ee.bear.drive.biz.preview.more.DriveSpaceFileMoreMenuPlugin;
import com.bytedance.ee.bear.drive.biz.preview.more.menu.delete.DriveSpaceFileDeleteMenuPlugin;
import com.bytedance.ee.bear.drive.biz.preview.presentation.DrivePresentationPlugin;
import com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveTitleBarPlugin;
import com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCFollowPlugin;
import com.bytedance.ee.bear.drive.biz.preview.vc.DriveVCModePlugin;
import com.bytedance.ee.bear.drive.biz.preview.watermark.DriveWatermarkPlugin;
import com.bytedance.ee.bear.drive.biz.versions.history.DriveHistoryModePlugin;
import com.bytedance.ee.bear.drive.biz.versions.push.DriveMultiVersionPlugin;
import com.bytedance.ee.bear.drive.biz.wps.DriveWPSPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.report.DriveSpaceFileReportPlugin;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/DriveSpaceFilePlugins;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.config.plugin.d */
public final class DriveSpaceFilePlugins {

    /* renamed from: a */
    public static final Companion f18709a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/DriveSpaceFilePlugins$Companion;", "", "()V", "TAG", "", "create", "Lcom/bytedance/ee/bear/browser/plugin/PluginList;", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.config.plugin.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C4946h mo27236a(DrivePluginHost aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "host");
            C4946h hVar = null;
            if (aVar.mo27261l().isTypeWiki()) {
                Log.i("DriveSpaceFilePlugins", "Create driveSpaceFilePlugins, add WikiPlugins. ");
                hVar = C4946h.m20451a(((WikiPluginsProvider) KoinJavaComponent.m268613a(WikiPluginsProvider.class, null, null, 6, null)).mo17011a(aVar), C4946h.m20453a(C4946h.m20455b(new WikiDriveFileHostPlugin())));
            }
            C4946h a = C4946h.m20453a(C4946h.m20455b(new DriveSpaceFileNotFoundPlugin()), C4946h.m20455b(new DriveWatermarkPlugin()), C4946h.m20455b(new DriveSpaceOwnerDeleteFilePlugin()), C4946h.m20449a(new DriveVCFollowPlugin(), aVar.mo27261l().isVCFollowMode()), C4946h.m20449a(new DrivePresentationPlugin(), aVar.mo27261l().isVCFollowMode()), C4946h.m20455b(new DriveSpaceFileInfoPlugin()), C4946h.m20455b(new DriveSpaceFileOpenExternalPlugin()), C4946h.m20455b(new DriveSpaceFileCachePlugin()), C4946h.m20455b(new DriveVCModePlugin()), C4946h.m20455b(new DriveGeneratingPlugin()), C4946h.m20455b(new WpsFileCachePlugin()), C4946h.m20455b(new DriveReConnectedPlugin()), C4946h.m20455b(new DriveSpaceFileMoreMenuPlugin()), C4946h.m20455b(new DrivePreviewContentPlugin()), C4946h.m20445a(new DriveBannerPlugin(), DrivePluginLevel.Banner), C4946h.m20445a(new DriveDownloadingPlugin(), DrivePluginLevel.Downloading), C4946h.m20455b(new DriveFailedToRetryPlugin()), C4946h.m20455b(new DriveCopyFailedPlugin()), C4946h.m20455b(new DriveCoppingPlugin()), C4946h.m20455b(new DriveTitleBarPlugin()), C4946h.m20455b(new DriveMGPermissionPlugin()), C4946h.m20445a(new DriveSpaceFileExtraInfoViewPlugin(), DrivePluginLevel.ExtraInfo), C4946h.m20455b(new DriveMetaInfoPlugin()), C4946h.m20455b(new DriveMultiVersionPlugin()), C4946h.m20455b(new DriveHistoryModePlugin()), C4946h.m20455b(new DriveCommentPlugin()), C4946h.m20455b(new DriveSpaceFilePermissionPushPlugin()), C4946h.m20455b(new DriveSpaceFilePermissionErrorPlugin()), C4946h.m20455b(new DriveFeedPlugin()), C4946h.m20455b(new DriveMultiTaskPlugin()), C4946h.m20455b(new DriveSpaceFileReportPlugin()), C4946h.m20455b(new DriveSpaceFileDeleteMenuPlugin()), C4946h.m20455b(new DriveLikePlugin()), C4946h.m20455b(new DriveEditModeSwitchPlugin()), C4946h.m20455b(new DriveWPSPlugin()), C4946h.m20455b(new DriveMemoryOverLimitPlugin()));
            if (hVar == null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "drivePlugins");
                return a;
            }
            C4946h a2 = C4946h.m20451a(hVar, a);
            Intrinsics.checkExpressionValueIsNotNull(a2, "PluginList.merge(wikiPlugins, drivePlugins)");
            return a2;
        }
    }
}

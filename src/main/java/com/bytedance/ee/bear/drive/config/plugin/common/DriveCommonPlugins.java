package com.bytedance.ee.bear.drive.config.plugin.common;

import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.drive.biz.downgrade.DrivePreviewDowngradePlugin;
import com.bytedance.ee.bear.drive.biz.magic.DriveMagicPlugin;
import com.bytedance.ee.bear.drive.biz.preview.configuration.DriveConfigurationPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.action.DrivePreviewActionPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.net.DriveTrafficDownloadPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.notsupport.DriveFileNotSupportPreviewPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.password.DrivePreviewPasswordProtectedPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.policy.DrivePolicyErrorPlugin;
import com.bytedance.ee.bear.drive.biz.preview.error.size.DriveFileSizeErrorPlugin;
import com.bytedance.ee.bear.drive.biz.preview.loading.DriveLoadingPlugin;
import com.bytedance.ee.bear.drive.biz.preview.route.DrivePreviewRoutePlugin;
import com.bytedance.ee.bear.drive.biz.preview.screen.DriveFullScreenImmersivePlugin;
import com.bytedance.ee.bear.drive.biz.preview.screen.DriveScreenStatePlugin;
import com.bytedance.ee.bear.drive.biz.preview.show.DrivePreviewShowResultPlugin;
import com.bytedance.ee.bear.drive.biz.preview.uicallback.DriveFileLoaderManagementPlugin;
import com.bytedance.ee.bear.drive.biz.preview.uicallback.DriveOpenLifecyclePlugin;
import com.bytedance.ee.bear.drive.biz.preview.viewfinder.DriveViewFinderPlugin;
import com.bytedance.ee.bear.drive.config.plugin.DrivePluginLevel;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.report.DriveReportPlugin;
import com.bytedance.ee.bear.drive.view.preview.ttreader.pdf.tron.PDFOutlinePlugin;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/common/DriveCommonPlugins;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.config.plugin.a.a */
public final class DriveCommonPlugins {

    /* renamed from: a */
    public static final Companion f18706a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/common/DriveCommonPlugins$Companion;", "", "()V", "create", "Lcom/bytedance/ee/bear/browser/plugin/PluginList;", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.config.plugin.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C4946h mo27233a(DrivePluginHost aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "host");
            C4946h a = C4946h.m20453a(C4946h.m20455b(new DriveViewFinderPlugin()), C4946h.m20455b(new DriveFileLoaderManagementPlugin()), C4946h.m20445a(new DriveLoadingPlugin(), DrivePluginLevel.Loading), C4946h.m20455b(new DriveFullScreenImmersivePlugin()), C4946h.m20455b(new DriveTrafficDownloadPlugin()), C4946h.m20455b(new DrivePolicyErrorPlugin()), C4946h.m20455b(new DriveOpenLifecyclePlugin()), C4946h.m20455b(new DriveReportPlugin()), C4946h.m20455b(new DrivePreviewRoutePlugin()), C4946h.m20455b(new DrivePreviewPasswordProtectedPlugin()), C4946h.m20455b(new DriveFileSizeErrorPlugin()), C4946h.m20455b(new DriveFileNotSupportPreviewPlugin()), C4946h.m20455b(new DrivePreviewDowngradePlugin()), C4946h.m20455b(new DriveConfigurationPlugin()), C4946h.m20455b(new DriveScreenStatePlugin()), C4946h.m20455b(new DriveMagicPlugin()), C4946h.m20455b(new DrivePreviewActionPlugin()), C4946h.m20455b(new DrivePreviewShowResultPlugin()), C4946h.m20455b(new PDFOutlinePlugin()));
            Intrinsics.checkExpressionValueIsNotNull(a, "PluginList.newList(\n    …nePlugin())\n            )");
            return a;
        }
    }
}

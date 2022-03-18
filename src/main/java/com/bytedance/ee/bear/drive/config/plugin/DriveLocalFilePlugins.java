package com.bytedance.ee.bear.drive.config.plugin;

import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.drive.biz.external.DriveLocalFileOpenExternalPlugin;
import com.bytedance.ee.bear.drive.biz.preview.DrivePreviewContentPlugin;
import com.bytedance.ee.bear.drive.biz.preview.more.DriveLocalFileMoreMenuPlugin;
import com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveCenterTitlePositionPlugin;
import com.bytedance.ee.bear.drive.biz.preview.titlebar.DriveTitleBarPlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/DriveLocalFilePlugins;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.config.plugin.b */
public final class DriveLocalFilePlugins {

    /* renamed from: a */
    public static final Companion f18707a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/plugin/DriveLocalFilePlugins$Companion;", "", "()V", "create", "Lcom/bytedance/ee/bear/browser/plugin/PluginList;", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.config.plugin.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final C4946h mo27234a(DrivePluginHost aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "host");
            C4946h a = C4946h.m20453a(C4946h.m20455b(new DriveTitleBarPlugin()), C4946h.m20455b(new DriveLocalFileMoreMenuPlugin()), C4946h.m20455b(new DrivePreviewContentPlugin()), C4946h.m20455b(new DriveCenterTitlePositionPlugin()), C4946h.m20455b(new DriveLocalFileOpenExternalPlugin()));
            Intrinsics.checkExpressionValueIsNotNull(a, "PluginList.newList(\n    …alPlugin())\n            )");
            return a;
        }
    }
}

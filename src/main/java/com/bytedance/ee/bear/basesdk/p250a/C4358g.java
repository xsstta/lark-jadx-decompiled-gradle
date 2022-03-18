package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.doc.screenshot.SnapshotPlugin;
import com.bytedance.ee.bear.doc.toolbar.DocToolbarPlugin;
import com.bytedance.ee.bear.document.EditPanelsPlugin;
import com.bytedance.ee.bear.document.analytic.AnalyticPlugin;
import com.bytedance.ee.bear.document.at.AtPlugin;
import com.bytedance.ee.bear.document.comment.CommentPlugin;
import com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin;
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;
import com.bytedance.ee.bear.document.loading.SmallLoadingPlugin;
import com.bytedance.ee.bear.document.menu.TitleMenuPlugin;
import com.bytedance.ee.bear.document.more.TitleMorePlugin;
import com.bytedance.ee.bear.document.orientation.PortraitOrientationPlugin;
import com.bytedance.ee.bear.document.pageview.PageviewPlugin;
import com.bytedance.ee.bear.document.search.SearchPlugin;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.document.share.SharePlugin;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.bear.reminder.export.ReminderPlugin;

/* renamed from: com.bytedance.ee.bear.basesdk.a.g */
class C4358g {

    /* renamed from: com.bytedance.ee.bear.basesdk.a.g$a */
    private enum EnumC4359a {
        Toolbar,
        SheetToolbar,
        SmallLoading,
        At,
        ImgViewer,
        Comment,
        Search,
        Reminder,
        Snapshot
    }

    /* renamed from: a */
    public static C4946h m17992a(C4943e eVar) {
        return C4946h.m20453a(C4946h.m20444a((AbstractC4941c<?>) new PortraitOrientationPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new TitlePlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new TitleMenuPlugin(), PluginMountStrategy.Immediate), C4946h.m20446a(new SearchPlugin(), EnumC4359a.Search, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new SharePlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new TitleMorePlugin(), PluginMountStrategy.Immediate), C4946h.m20446a(new ImageViewerPlugin(), EnumC4359a.ImgViewer, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new LoadingFailedPlugin(), PluginMountStrategy.Immediate), C4946h.m20446a(new DocToolbarPlugin(), EnumC4359a.Toolbar, PluginMountStrategy.Immediate), C4946h.m20446a(new AtPlugin(), EnumC4359a.At, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new AnalyticPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20446a(new CommentPlugin(), EnumC4359a.Comment, PluginMountStrategy.Immediate), C4946h.m20446a(new ReminderPlugin(), EnumC4359a.Reminder, PluginMountStrategy.Immediate), C4946h.m20446a(new SnapshotPlugin(), EnumC4359a.Snapshot, PluginMountStrategy.FirstJSCall), C4946h.m20444a((AbstractC4941c<?>) SelectionPlugin.create(eVar), PluginMountStrategy.Immediate), C4946h.m20446a(new SmallLoadingPlugin(), EnumC4359a.SmallLoading, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new PageviewPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new EditPanelsPlugin(), PluginMountStrategy.Immediate));
    }
}

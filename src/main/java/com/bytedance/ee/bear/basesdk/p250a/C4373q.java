package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.doc.screenshot.SnapshotPlugin;
import com.bytedance.ee.bear.document.analytic.AnalyticPlugin;
import com.bytedance.ee.bear.document.comment.CommentPlugin;
import com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfoPlugin;
import com.bytedance.ee.bear.document.feed.FeedPlugin;
import com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin;
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;
import com.bytedance.ee.bear.document.menu.TitleMenuPlugin;
import com.bytedance.ee.bear.document.more.TitleMorePlugin;
import com.bytedance.ee.bear.document.orientation.PortraitOrientationPlugin;
import com.bytedance.ee.bear.document.pageview.PageviewPlugin;
import com.bytedance.ee.bear.document.search.SearchPlugin;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.document.share.SharePlugin;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.bear.slide.SlidePlugin;
import com.bytedance.ee.bear.slide.common.export.SlideExportPlugin;
import com.bytedance.ee.bear.slide.common.font.SlideFontPlugin;

/* renamed from: com.bytedance.ee.bear.basesdk.a.q */
public class C4373q {

    /* renamed from: com.bytedance.ee.bear.basesdk.a.q$a */
    private enum EnumC4374a {
        ImgViewer,
        CustomHeader,
        Comment,
        Search,
        Snapshot
    }

    /* renamed from: a */
    public static C4946h m18020a(C4943e eVar) {
        return C4946h.m20453a(C4946h.m20444a((AbstractC4941c<?>) new PortraitOrientationPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new TitlePlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new TitleMenuPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new SharePlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new TitleMorePlugin(), PluginMountStrategy.Immediate), C4946h.m20446a(new SearchPlugin(), EnumC4374a.Search, PluginMountStrategy.Immediate), C4946h.m20446a(new ImageViewerPlugin(), EnumC4374a.ImgViewer, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new LoadingFailedPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new DocumentInfoPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new AnalyticPlugin(), PluginMountStrategy.LoadFinish), C4946h.m20446a(new CommentPlugin(), EnumC4374a.Comment, PluginMountStrategy.Immediate), C4946h.m20446a(new SnapshotPlugin(), EnumC4374a.Snapshot, PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new SlidePlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new SlideFontPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new SlideExportPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) SelectionPlugin.create(eVar), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new PageviewPlugin(), PluginMountStrategy.Immediate), C4946h.m20444a((AbstractC4941c<?>) new FeedPlugin(), PluginMountStrategy.Immediate), C4946h.m20446a(new CustomHeaderPlugin(), EnumC4374a.CustomHeader, PluginMountStrategy.FirstJSCall));
    }
}

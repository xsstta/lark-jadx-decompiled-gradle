package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.bitable.card.view.form.ShareFormPlugin;
import com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardPlugin;
import com.bytedance.ee.bear.bitable.fab.BitableFabPlugin;
import com.bytedance.ee.bear.bitable.panel.BitablePanelPlugin;
import com.bytedance.ee.bear.bitable.toast.BitableToastPlugin;
import com.bytedance.ee.bear.bitable.viewlist.BitableViewListPlugin;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.DocOpenConfig;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.EditPanelsPlugin;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.analytic.AnalyticPlugin;
import com.bytedance.ee.bear.document.comment.CommentPlugin;
import com.bytedance.ee.bear.document.comment.imageviewer.CommentImageViewerPlugin;
import com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfoPlugin;
import com.bytedance.ee.bear.document.documentinfo.WikiNavPlugin;
import com.bytedance.ee.bear.document.export.ExportPlugin;
import com.bytedance.ee.bear.document.feed.FeedPlugin;
import com.bytedance.ee.bear.document.icon.IconPlugin;
import com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin;
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;
import com.bytedance.ee.bear.document.loading.VCLoadingFailedPlugin;
import com.bytedance.ee.bear.document.menu.TitleMenuPlugin;
import com.bytedance.ee.bear.document.more.TitleMorePlugin;
import com.bytedance.ee.bear.document.pageview.PageviewPlugin;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.document.share.SharePlugin;
import com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.bear.sheet.attachment.AttachmentPlugin;
import com.bytedance.ee.bear.sheet.borderline.BorderLinePlugin;
import com.bytedance.ee.bear.sheet.cardmodetitlebar.SheetCardTitleBarPlugin;
import com.bytedance.ee.bear.sheet.celldropdown.SheetDropdownPlugin;
import com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertPlugin;
import com.bytedance.ee.bear.sheet.exportimage.exportshare.ExportSharePlugin;
import com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin;
import com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin;
import com.bytedance.ee.bear.sheet.fab.FabPlugin;
import com.bytedance.ee.bear.sheet.filter.FilterPlugin;
import com.bytedance.ee.bear.sheet.follow.SheetFollowPlugin;
import com.bytedance.ee.bear.sheet.inputbar.SheetEditPlugin;
import com.bytedance.ee.bear.sheet.orientation.SheetUnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.sheet.panel.oppanel.FabPanelPlugin;
import com.bytedance.ee.bear.sheet.reminder.SheetReminderPlugin;
import com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotObserverPlugin;
import com.bytedance.ee.bear.sheet.searchbar.SheetSearchPlugin;
import com.bytedance.ee.bear.sheet.tab.SheetTabPlugin;
import com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* renamed from: com.bytedance.ee.bear.basesdk.a.p */
public class C4371p {

    /* renamed from: com.bytedance.ee.bear.basesdk.a.p$a */
    private enum EnumC4372a {
        SheetTab,
        SheetCardTitleBar,
        CustomHeader,
        Search,
        BitableCard,
        FloatingActionButton,
        BitableFloatActionButton,
        ImgViewer,
        DiyIcon,
        Comment,
        CommentImageViewer,
        Toolkit,
        SheetReminder,
        SheetKeyboard,
        OrientationTip
    }

    /* renamed from: a */
    public static C4946h m18018a(C4943e eVar) {
        boolean z;
        AbstractC4941c cVar;
        PluginMountStrategy pluginMountStrategy;
        DocumentMetadata q = ((EditorAbility) eVar.mo19551b(EditorAbility.class)).mo24602q();
        if (q.getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) SelectionPlugin.create(eVar), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20445a(new SheetUnspecifiedOrientationPlugin(), EnumC4372a.OrientationTip));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SharePlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new PageviewPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new ImageViewerPlugin(), EnumC4372a.ImgViewer, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new SheetSearchPlugin(), EnumC4372a.Search, PluginMountStrategy.FirstJSCall));
        if (z) {
            cVar = new VCLoadingFailedPlugin();
        } else {
            cVar = new LoadingFailedPlugin();
        }
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) cVar, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new DocumentInfoPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new EditPanelsPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new AnalyticPlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new CommentPlugin(), EnumC4372a.Comment, PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new FabPanelPlugin(), EnumC4372a.Toolkit, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new SheetEditPlugin(), EnumC4372a.SheetKeyboard, PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new SheetTabPlugin(), EnumC4372a.SheetTab, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new FabPlugin(), EnumC4372a.FloatingActionButton, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new SheetCardTitleBarPlugin(), EnumC4372a.SheetCardTitleBar, PluginMountStrategy.FirstJSCall));
        FeedPlugin feedPlugin = new FeedPlugin();
        if (DocOpenConfig.m22773n()) {
            pluginMountStrategy = PluginMountStrategy.Immediate;
        } else {
            pluginMountStrategy = PluginMountStrategy.FirstJSCall;
        }
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) feedPlugin, pluginMountStrategy));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SheetDropdownPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new FilterPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new BitableViewListPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new BitableCardPlugin(), EnumC4372a.BitableCard, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new BitableToastPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new IconPlugin(), EnumC4372a.DiyIcon, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20450a(new SheetFollowPlugin(), z, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new BorderLinePlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new SheetReminderPlugin(), EnumC4372a.SheetReminder, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new CustomHeaderPlugin(), EnumC4372a.CustomHeader, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new CommentImageViewerPlugin(), EnumC4372a.CommentImageViewer, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new ScreenshotObserverPlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new ShareImageDataPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new ScreenshotImageAlertPlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SheetImagePreviewPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new ExportPlugin(), PluginMountStrategy.FirstFind));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new ExportSharePlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new AttachmentPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new BitableFabPlugin(), EnumC4372a.BitableFloatActionButton, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new BitablePanelPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new WikiNavPlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new ShareFormPlugin(), PluginMountStrategy.FirstJSCall));
        CommonPlugins.f12991a.mo17010a(q, new Function3(arrayList, q) {
            /* class com.bytedance.ee.bear.basesdk.p250a.$$Lambda$p$iHoExLgRvaDNxSyiDxVjbPD2MEE */
            public final /* synthetic */ List f$0;
            public final /* synthetic */ DocumentMetadata f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C4371p.m18019a(this.f$0, this.f$1, (Boolean) obj, (Boolean) obj2, (Boolean) obj3);
            }
        });
        return C4946h.m20452a(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m18019a(List list, DocumentMetadata qVar, Boolean bool, Boolean bool2, Boolean bool3) {
        list.add(C4946h.m20444a((AbstractC4941c<?>) new TitlePlugin(false, bool.booleanValue()), PluginMountStrategy.Immediate));
        if (!bool.booleanValue()) {
            list.add(C4946h.m20444a((AbstractC4941c<?>) new TitleMorePlugin(), PluginMountStrategy.FirstJSCall));
            list.add(C4946h.m20444a((AbstractC4941c<?>) new TitleMenuPlugin(), PluginMountStrategy.FirstJSCall));
        }
        if (bool2.booleanValue()) {
            list.add(C4946h.m20444a((AbstractC4941c<?>) new GroupTemplatePreviewPlugin(), PluginMountStrategy.LoadFinish));
        }
        if (!bool3.booleanValue()) {
            return null;
        }
        list.add(C4946h.m20444a((AbstractC4941c<?>) new CommonTemplatePreviewPlugin(qVar.getCommonTemplatePreviewType()), PluginMountStrategy.LoadFinish));
        return null;
    }
}

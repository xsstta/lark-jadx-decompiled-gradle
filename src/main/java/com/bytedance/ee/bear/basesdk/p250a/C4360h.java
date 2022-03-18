package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.DocPluginLevel;
import com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardPlugin;
import com.bytedance.ee.bear.bitable.fab.BitableFabPlugin;
import com.bytedance.ee.bear.bitable.panel.BitablePanelPlugin;
import com.bytedance.ee.bear.bitable.toast.BitableToastPlugin;
import com.bytedance.ee.bear.bitable.viewlist.BitableViewListPlugin;
import com.bytedance.ee.bear.block.codeblock.CodeBlockPlugin;
import com.bytedance.ee.bear.block.jira.JiraPlugin;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.p282f.C5171a;
import com.bytedance.ee.bear.doc.blockeditpanel.BlockEditPanelPlugin;
import com.bytedance.ee.bear.doc.cover.CoverPlugin;
import com.bytedance.ee.bear.doc.editmodeswitchplugin.EditModeSwitchPlugin;
import com.bytedance.ee.bear.doc.equation.EquationBlockPlugin;
import com.bytedance.ee.bear.doc.history.HistoryPlugin;
import com.bytedance.ee.bear.doc.okr.OkrBlockPlugin;
import com.bytedance.ee.bear.doc.partialloading.PartialLoadingPlugin;
import com.bytedance.ee.bear.doc.positionkeeper.PositionKeeperPlugin;
import com.bytedance.ee.bear.doc.screenshot.SnapshotPlugin;
import com.bytedance.ee.bear.doc.structure.StructurePlugin;
import com.bytedance.ee.bear.doc.toolbar.DocToolbarPlugin;
import com.bytedance.ee.bear.doc.toolbar.SlideHideKeyboardPlugin;
import com.bytedance.ee.bear.doc.toolbar2.DocToolbarV2Plugin;
import com.bytedance.ee.bear.doc.translate.TranslatePlugin;
import com.bytedance.ee.bear.document.DocOpenConfig;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.EditPanelsPlugin;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.analytic.AnalyticPlugin;
import com.bytedance.ee.bear.document.at.AtPlugin;
import com.bytedance.ee.bear.document.comment.CommentPlugin;
import com.bytedance.ee.bear.document.comment.imageviewer.CommentImageViewerPlugin;
import com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfoPlugin;
import com.bytedance.ee.bear.document.documentinfo.WikiNavPlugin;
import com.bytedance.ee.bear.document.feed.FeedPlugin;
import com.bytedance.ee.bear.document.follow.FollowPlugin;
import com.bytedance.ee.bear.document.icon.IconPlugin;
import com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin;
import com.bytedance.ee.bear.document.imageviewer.diagram.DiagramPlugin;
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;
import com.bytedance.ee.bear.document.loading.SmallLoadingPlugin;
import com.bytedance.ee.bear.document.loading.VCLoadingFailedPlugin;
import com.bytedance.ee.bear.document.menu.TitleMenuPlugin;
import com.bytedance.ee.bear.document.more.TitleMorePlugin;
import com.bytedance.ee.bear.document.orientation.PortraitOrientationPlugin;
import com.bytedance.ee.bear.document.pageview.PageviewPlugin;
import com.bytedance.ee.bear.document.search.SearchPlugin;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.document.share.SharePlugin;
import com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.bear.document.toolbar.file.SelectFilePlugin;
import com.bytedance.ee.bear.document.toolbar.selectcolor.SelectColorV2Plugin;
import com.bytedance.ee.bear.document.toolbar2.DocToolbarV2JsHandlerPlugin;
import com.bytedance.ee.bear.document.toolbar2.insertblock.InsertNewBlockPlugin;
import com.bytedance.ee.bear.drive.module.nativepreview.DriveSameRenderLifecyclePlugin;
import com.bytedance.ee.bear.lark.announcement.AnnouncePlugin;
import com.bytedance.ee.bear.lark.announcement.moredialog.MoreDialogPlugin;
import com.bytedance.ee.bear.lark.entityword.EntityWordsPlugin;
import com.bytedance.ee.bear.reminder.export.ReminderPlugin;
import com.bytedance.ee.bear.sheet.attachment.AttachmentPlugin;
import com.bytedance.ee.bear.sheet.celldropdown.SheetDropdownPlugin;
import com.bytedance.ee.bear.sheet.fab.FabPlugin;
import com.bytedance.ee.bear.sheet.reminder.SheetReminderPlugin;
import com.bytedance.ee.bear.sheet.toolbar2.SheetBlockToolbarV2Plugin;
import com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplatePlugin;
import com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplatePreviewPlugin;
import com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin;
import com.bytedance.ee.util.deviceinfo.C13653a;
import com.ss.android.lark.utils.LarkContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* renamed from: com.bytedance.ee.bear.basesdk.a.h */
public class C4360h {
    /* renamed from: a */
    public static C4946h m17994a(boolean z) {
        C4946h hVar;
        DocToolbarV2Plugin docToolbarV2Plugin = new DocToolbarV2Plugin();
        SheetBlockToolbarV2Plugin sheetBlockToolbarV2Plugin = new SheetBlockToolbarV2Plugin();
        OkrBlockPlugin okrBlockPlugin = new OkrBlockPlugin();
        DocToolbarV2JsHandlerPlugin docToolbarV2JsHandlerPlugin = new DocToolbarV2JsHandlerPlugin();
        if (z) {
            hVar = C4946h.m20453a(C4946h.m20444a((AbstractC4941c<?>) new EquationBlockPlugin(), PluginMountStrategy.LoadFinish));
        } else {
            hVar = C4946h.m20453a(new C4946h.C4947a[0]);
        }
        return C4946h.m20451a(C4946h.m20453a(C4946h.m20444a((AbstractC4941c<?>) docToolbarV2JsHandlerPlugin, PluginMountStrategy.LoadFinish), C4946h.m20444a((AbstractC4941c<?>) okrBlockPlugin, PluginMountStrategy.LoadFinish), C4946h.m20446a(docToolbarV2Plugin, DocPluginLevel.ToolbarV2, PluginMountStrategy.LoadFinish), C4946h.m20446a(sheetBlockToolbarV2Plugin, DocPluginLevel.SheetToolbarV2, PluginMountStrategy.LoadFinish), C4946h.m20446a(new InsertNewBlockPlugin(), DocPluginLevel.InsertNewBlock, PluginMountStrategy.LoadFinish), C4946h.m20446a(new DocToolbarPlugin(), DocPluginLevel.Toolbar, PluginMountStrategy.LoadFinish)), hVar);
    }

    /* renamed from: a */
    public static C4946h m17993a(C4943e eVar) {
        boolean z;
        AbstractC4941c cVar;
        PluginMountStrategy pluginMountStrategy;
        DocumentMetadata q = ((EditorAbility) eVar.mo19551b(EditorAbility.class)).mo24602q();
        if (q.getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        boolean e = C5171a.m21156e(q.getOriginBearUrl());
        boolean isAnnounceDoc = q.isAnnounceDoc();
        boolean i = DocOpenConfig.m22768i();
        boolean isAnnounceTemplatePreview = q.isAnnounceTemplatePreview();
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new PortraitOrientationPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20450a(new TitleMorePlugin(), !isAnnounceDoc, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SharePlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new SearchPlugin(), DocPluginLevel.Search, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new ImageViewerPlugin(), DocPluginLevel.ImgViewer, PluginMountStrategy.FirstJSCall));
        if (z) {
            cVar = new VCLoadingFailedPlugin();
        } else {
            cVar = new LoadingFailedPlugin();
        }
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) cVar, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new DocumentInfoPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20450a(new DriveSameRenderLifecyclePlugin(), !C13653a.m55399c(LarkContext.getApplication()), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new EditPanelsPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SelectColorV2Plugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new AtPlugin(), DocPluginLevel.At, PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new AnalyticPlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new CommentPlugin(), DocPluginLevel.Comment, PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new ReminderPlugin(), DocPluginLevel.Reminder, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new SnapshotPlugin(), DocPluginLevel.Snapshot, PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new HistoryPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20448a(new StructurePlugin(), DocPluginLevel.Structure, !isAnnounceDoc, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20448a(new AnnouncePlugin(), DocPluginLevel.AnnounceButton, isAnnounceDoc, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20450a(new AnnounceTemplatePlugin(), isAnnounceDoc, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20450a(new AnnounceTemplatePreviewPlugin(), isAnnounceTemplatePreview, PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new MoreDialogPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new FabPlugin(), DocPluginLevel.FloatActionButton, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) SelectionPlugin.create(eVar), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new TranslatePlugin(), DocPluginLevel.Translate, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new SmallLoadingPlugin(), DocPluginLevel.SmallLoading, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SlideHideKeyboardPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new PageviewPlugin(), PluginMountStrategy.FirstJSCall));
        FeedPlugin feedPlugin = new FeedPlugin();
        if (DocOpenConfig.m22773n()) {
            pluginMountStrategy = PluginMountStrategy.Immediate;
        } else {
            pluginMountStrategy = PluginMountStrategy.FirstJSCall;
        }
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) feedPlugin, pluginMountStrategy));
        arrayList.add(C4946h.m20446a(new CoverPlugin(), DocPluginLevel.Cover, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SheetDropdownPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20450a(new FollowPlugin(), z, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new BitableViewListPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new PositionKeeperPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20448a(new PartialLoadingPlugin(), DocPluginLevel.PartialLoading, !e, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new BitableCardPlugin(), DocPluginLevel.BitableCard, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new BitableToastPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new IconPlugin(), DocPluginLevel.DiyIcon, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new EditModeSwitchPlugin(), DocPluginLevel.EditModeSwitchButton, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new DiagramPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new CodeBlockPlugin(), DocPluginLevel.CodeBlock, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new SheetReminderPlugin(), DocPluginLevel.SheetReminder, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new CustomHeaderPlugin(), DocPluginLevel.CustomHeader, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new CommentImageViewerPlugin(), DocPluginLevel.CommentImageViewer, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SelectFilePlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new AttachmentPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new BitableFabPlugin(), DocPluginLevel.BitableFloatActionButton, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new BitablePanelPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new JiraPlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new BlockEditPanelPlugin(), DocPluginLevel.BlockEditMenu, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new WikiNavPlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new EntityWordsPlugin(), PluginMountStrategy.LoadFinish));
        CommonPlugins.f12991a.mo17010a(q, new Function3(arrayList, isAnnounceTemplatePreview, q) {
            /* class com.bytedance.ee.bear.basesdk.p250a.$$Lambda$h$EvirbuQyeZJVpqLTeHORyHDm_2I */
            public final /* synthetic */ List f$0;
            public final /* synthetic */ boolean f$1;
            public final /* synthetic */ DocumentMetadata f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C4360h.lambda$EvirbuQyeZJVpqLTeHORyHDm_2I(this.f$0, this.f$1, this.f$2, (Boolean) obj, (Boolean) obj2, (Boolean) obj3);
            }
        });
        return C4946h.m20451a(C4946h.m20452a(arrayList), m17994a(i));
    }

    /* renamed from: a */
    public static /* synthetic */ Unit m17995a(List list, boolean z, DocumentMetadata qVar, Boolean bool, Boolean bool2, Boolean bool3) {
        list.add(C4946h.m20444a((AbstractC4941c<?>) new TitlePlugin(!DocOpenConfig.m22774o(), bool.booleanValue()), PluginMountStrategy.Immediate));
        if (!bool.booleanValue()) {
            list.add(C4946h.m20444a((AbstractC4941c<?>) new TitleMenuPlugin(), PluginMountStrategy.FirstJSCall));
        }
        if (!z && bool2.booleanValue()) {
            list.add(C4946h.m20444a((AbstractC4941c<?>) new GroupTemplatePreviewPlugin(), PluginMountStrategy.LoadFinish));
        }
        if (!bool3.booleanValue()) {
            return null;
        }
        list.add(C4946h.m20444a((AbstractC4941c<?>) new CommonTemplatePreviewPlugin(qVar.getCommonTemplatePreviewType()), PluginMountStrategy.LoadFinish));
        return null;
    }
}

package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.doc.screenshot.SnapshotPlugin;
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
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;
import com.bytedance.ee.bear.document.loading.VCLoadingFailedPlugin;
import com.bytedance.ee.bear.document.more.TitleMorePlugin;
import com.bytedance.ee.bear.document.orientation.PortraitOrientationPlugin;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.document.share.SharePlugin;
import com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin;
import com.bytedance.ee.bear.document.titlebar.TitlePlugin;
import com.bytedance.ee.bear.mindnote.setting.MindNoteSettingPlugin;
import com.bytedance.ee.bear.mindnote.share.MindNoteSharePlugin;
import com.bytedance.ee.bear.mindnote.toolbar.MindNoteTitleMenuPlugin;
import com.bytedance.ee.bear.mindnote.toolbar.MindNoteToolbarPlugin;
import com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* renamed from: com.bytedance.ee.bear.basesdk.a.l */
public class C4364l {

    /* renamed from: com.bytedance.ee.bear.basesdk.a.l$a */
    private enum EnumC4365a {
        FollowTransCover,
        Toolbar,
        At,
        ImgViewer,
        DiyIcon,
        CustomHeader,
        Comment,
        CommentImageViewer,
        Snapshot
    }

    /* renamed from: a */
    public static C4946h m18006a(C4943e eVar) {
        boolean z;
        AbstractC4941c cVar;
        DocumentMetadata q = ((EditorAbility) eVar.mo19551b(EditorAbility.class)).mo24602q();
        if (q.getOpenSource() == DocsOpenSource.vc) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new PortraitOrientationPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SharePlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new MindNoteSharePlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20446a(new ImageViewerPlugin(), EnumC4365a.ImgViewer, PluginMountStrategy.Immediate));
        if (z) {
            cVar = new VCLoadingFailedPlugin();
        } else {
            cVar = new LoadingFailedPlugin();
        }
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) cVar, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new DocumentInfoPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new EditPanelsPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20446a(new MindNoteToolbarPlugin(), EnumC4365a.Toolbar, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20446a(new AtPlugin(), EnumC4365a.At, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new AnalyticPlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new CommentPlugin(), EnumC4365a.Comment, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20446a(new SnapshotPlugin(), EnumC4365a.Snapshot, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) SelectionPlugin.create(eVar), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new FeedPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new MindNoteSettingPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20446a(new IconPlugin(), EnumC4365a.DiyIcon, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20450a(new FollowPlugin(), z, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20446a(new CommentImageViewerPlugin(), EnumC4365a.CommentImageViewer, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20446a(new CustomHeaderPlugin(), EnumC4365a.CustomHeader, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new WikiNavPlugin(), PluginMountStrategy.LoadFinish));
        CommonPlugins.f12991a.mo17010a(q, new Function3(arrayList, q) {
            /* class com.bytedance.ee.bear.basesdk.p250a.$$Lambda$l$KSt65gFzggkHAZrkKjWMpdxqJY */
            public final /* synthetic */ List f$0;
            public final /* synthetic */ DocumentMetadata f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C4364l.m18007a(this.f$0, this.f$1, (Boolean) obj, (Boolean) obj2, (Boolean) obj3);
            }
        });
        return C4946h.m20452a(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m18007a(List list, DocumentMetadata qVar, Boolean bool, Boolean bool2, Boolean bool3) {
        list.add(C4946h.m20444a((AbstractC4941c<?>) new TitlePlugin(!C4511g.m18594d().mo17345F(), bool.booleanValue()), PluginMountStrategy.Immediate));
        if (!bool.booleanValue()) {
            list.add(C4946h.m20444a((AbstractC4941c<?>) new MindNoteTitleMenuPlugin(), PluginMountStrategy.Immediate));
            list.add(C4946h.m20444a((AbstractC4941c<?>) new TitleMorePlugin(), PluginMountStrategy.Immediate));
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

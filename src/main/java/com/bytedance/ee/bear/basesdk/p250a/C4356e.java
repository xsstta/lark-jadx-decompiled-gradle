package com.bytedance.ee.bear.basesdk.p250a;

import com.bytedance.ee.bear.bitable.card.view.form.ShareFormPlugin;
import com.bytedance.ee.bear.bitable.card.viewmodel.BitableCardPlugin;
import com.bytedance.ee.bear.bitable.fab.BitableFabPlugin;
import com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelPlugin;
import com.bytedance.ee.bear.bitable.panel.BitablePanelPlugin;
import com.bytedance.ee.bear.bitable.titlebar.BitableTitlePlugin;
import com.bytedance.ee.bear.bitable.toast.BitableToastPlugin;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.browser.plugin.lazy.PluginMountStrategy;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.EditPanelsPlugin;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.analytic.AnalyticPlugin;
import com.bytedance.ee.bear.document.comment.CommentPlugin;
import com.bytedance.ee.bear.document.comment.imageviewer.CommentImageViewerPlugin;
import com.bytedance.ee.bear.document.customheader.CustomHeaderPlugin;
import com.bytedance.ee.bear.document.documentinfo.DocumentInfoPlugin;
import com.bytedance.ee.bear.document.feed.FeedPlugin;
import com.bytedance.ee.bear.document.icon.IconPlugin;
import com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin;
import com.bytedance.ee.bear.document.loading.LoadingFailedPlugin;
import com.bytedance.ee.bear.document.loading.VCLoadingFailedPlugin;
import com.bytedance.ee.bear.document.menu.TitleMenuPlugin;
import com.bytedance.ee.bear.document.more.TitleMorePlugin;
import com.bytedance.ee.bear.document.orientation.PortraitOrientationPlugin;
import com.bytedance.ee.bear.document.pageview.PageviewPlugin;
import com.bytedance.ee.bear.document.selection.SelectionPlugin;
import com.bytedance.ee.bear.document.share.SharePlugin;
import com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin;
import com.bytedance.ee.bear.sheet.follow.SheetFollowPlugin;
import com.bytedance.ee.bear.sheet.orientation.SheetUnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.sheet.searchbar.SheetSearchPlugin;
import com.bytedance.ee.bear.templates.preview.single.CommonTemplatePreviewPlugin;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* renamed from: com.bytedance.ee.bear.basesdk.a.e */
public class C4356e {

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.basesdk.a.e$a */
    public enum EnumC4357a {
        CustomHeader,
        Search,
        BitableCard,
        BitableFloatActionButton,
        BitableToast,
        ImgViewer,
        DiyIcon,
        Comment,
        CommentImageViewer,
        OrientationTip
    }

    /* renamed from: a */
    public static C4946h m17989a(C4943e eVar) {
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
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) SelectionPlugin.create(eVar), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20445a(new SheetUnspecifiedOrientationPlugin(), EnumC4357a.OrientationTip));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new SharePlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new PageviewPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new ImageViewerPlugin(), EnumC4357a.ImgViewer, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new DocumentInfoPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new EditPanelsPlugin(), PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new AnalyticPlugin(), PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20446a(new CommentPlugin(), EnumC4357a.Comment, PluginMountStrategy.LoadFinish));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new FeedPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new BitableCardPlugin(), EnumC4357a.BitableCard, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new BitableToastPlugin(), EnumC4357a.BitableToast, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new IconPlugin(), EnumC4357a.DiyIcon, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20450a(new SheetFollowPlugin(), z, PluginMountStrategy.Immediate));
        if (z) {
            cVar = new VCLoadingFailedPlugin();
        } else {
            cVar = new LoadingFailedPlugin();
        }
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) cVar, PluginMountStrategy.Immediate));
        arrayList.add(C4946h.m20446a(new CustomHeaderPlugin(), EnumC4357a.CustomHeader, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new CommentImageViewerPlugin(), EnumC4357a.CommentImageViewer, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new BitableFabPlugin(), EnumC4357a.BitableFloatActionButton, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new BitablePanelPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new BitableManagerPanelPlugin(), PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20446a(new SheetSearchPlugin(), EnumC4357a.Search, PluginMountStrategy.FirstJSCall));
        arrayList.add(C4946h.m20444a((AbstractC4941c<?>) new ShareFormPlugin(), PluginMountStrategy.FirstJSCall));
        CommonPlugins.f12991a.mo17010a(q, new Function3(arrayList, q) {
            /* class com.bytedance.ee.bear.basesdk.p250a.$$Lambda$e$u5A92cB1f3ALMN9dxqL2dMHj0 */
            public final /* synthetic */ List f$0;
            public final /* synthetic */ DocumentMetadata f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return C4356e.m269081lambda$u5A92cB1f3ALMN9dxqL2dMHj0(this.f$0, this.f$1, (Boolean) obj, (Boolean) obj2, (Boolean) obj3);
            }
        });
        return C4946h.m20452a(arrayList);
    }

    /* renamed from: a */
    public static /* synthetic */ Unit m17990a(List list, DocumentMetadata qVar, Boolean bool, Boolean bool2, Boolean bool3) {
        list.add(C4946h.m20444a((AbstractC4941c<?>) new BitableTitlePlugin(bool.booleanValue()), PluginMountStrategy.Immediate));
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

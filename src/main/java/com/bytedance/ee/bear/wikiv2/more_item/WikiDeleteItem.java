package com.bytedance.ee.bear.wikiv2.more_item;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.wikiv2.browser.plugin.WikiDeletePlugin;
import com.bytedance.ee.bear.wikiv2.browser.plugin.WikiInfoPlugin;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.bean.TreeNode;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/more_item/WikiDeleteItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/IGridMoreItem;", "pluginHost", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "(Lcom/bytedance/ee/bear/browser/plugin/PluginHost;)V", "getPluginHost", "()Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "getIcon", "", "getIconTint", "getId", "", "getTitle", "getUnableTips", "isEnable", "", "isVisible", "needShowBadge", "onClick", "", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiDeleteItem extends BaseMoreItem implements IGridMoreItem {
    public static final Companion Companion = new Companion(null);
    private final C4943e pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_delete_trash_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "WikiDeleteItem";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/more_item/WikiDeleteItem$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.more_item.WikiDeleteItem$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final C4943e getPluginHost() {
        return this.pluginHost;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        WikNodePerm wikiPerm;
        WikiInfoPlugin wikiInfoPlugin = (WikiInfoPlugin) this.pluginHost.mo19540a(WikiInfoPlugin.class);
        if (wikiInfoPlugin == null || (wikiPerm = wikiInfoPlugin.getWikiPerm()) == null) {
            return false;
        }
        return wikiPerm.can_delete;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.ee.bear.wikiv2.more_item.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick() {
        /*
            r4 = this;
            com.bytedance.ee.bear.browser.plugin.e r0 = r4.pluginHost
            java.lang.Class<com.bytedance.ee.bear.wikiv2.browser.plugin.WikiDeletePlugin> r1 = com.bytedance.ee.bear.wikiv2.browser.plugin.WikiDeletePlugin.class
            com.bytedance.ee.bear.wikiv2.more_item.WikiDeleteItem$b r2 = com.bytedance.ee.bear.wikiv2.more_item.WikiDeleteItem.C12332b.INSTANCE
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            if (r2 == 0) goto L_0x0010
            com.bytedance.ee.bear.wikiv2.more_item.a r3 = new com.bytedance.ee.bear.wikiv2.more_item.a
            r3.<init>(r2)
            r2 = r3
        L_0x0010:
            com.bytedance.ee.bear.browser.plugin.d r2 = (com.bytedance.ee.bear.browser.plugin.AbstractC4942d) r2
            r0.mo19549a(r1, r2)
            com.bytedance.ee.bear.more.moreprotocol.a r0 = r4.getHost()
            r0.mo39166c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wikiv2.more_item.WikiDeleteItem.onClick():void");
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        TreeNode wikiMeta;
        WikiInfoPlugin wikiInfoPlugin = (WikiInfoPlugin) this.pluginHost.mo19540a(WikiInfoPlugin.class);
        if (wikiInfoPlugin == null || (wikiMeta = wikiInfoPlugin.getWikiMeta()) == null || !wikiMeta.isShortcut()) {
            return getString(R.string.Doc_Facade_Delete);
        }
        return getString(R.string.CreationMobile_Wiki_Shortcuts_DeleteShortcuts_Tooltip);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiDeletePlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.more_item.WikiDeleteItem$b */
    static final /* synthetic */ class C12332b extends FunctionReference implements Function1<WikiDeletePlugin, Unit> {
        public static final C12332b INSTANCE = new C12332b();

        C12332b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "delete";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(WikiDeletePlugin.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "delete()V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WikiDeletePlugin wikiDeletePlugin) {
            invoke(wikiDeletePlugin);
            return Unit.INSTANCE;
        }

        public final void invoke(WikiDeletePlugin wikiDeletePlugin) {
            Intrinsics.checkParameterIsNotNull(wikiDeletePlugin, "p1");
            wikiDeletePlugin.delete();
        }
    }

    public WikiDeleteItem(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginHost");
        this.pluginHost = eVar;
    }
}

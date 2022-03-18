package com.bytedance.ee.bear.wikiv2.more_item;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.wikiv2.browser.plugin.WikiInfoPlugin;
import com.bytedance.ee.bear.wikiv2.browser.plugin.WikiMakeCopyPlugin;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/more_item/WikiMakeCopyItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "pluginHost", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "documentName", "", "(Lcom/bytedance/ee/bear/browser/plugin/PluginHost;Ljava/lang/String;)V", "getDocumentName", "()Ljava/lang/String;", "getPluginHost", "()Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "getIcon", "", "getIconTint", "getId", "getTitle", "isEnable", "", "isVisible", "onClick", "", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiMakeCopyItem extends BaseMoreItem implements ITextMoreItem {
    public static final Companion Companion = new Companion(null);
    private final String documentName;
    private final C4943e pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_copy_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "WikiMakeCopyItem";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/more_item/WikiMakeCopyItem$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.more_item.WikiMakeCopyItem$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final C4943e getPluginHost() {
        return this.pluginHost;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Facade_MakeCopy);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return ITextMoreItem.C10238a.m42706b(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return ITextMoreItem.C10238a.m42707c(this);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        WikNodePerm wikiPerm;
        WikiInfoPlugin wikiInfoPlugin = (WikiInfoPlugin) this.pluginHost.mo19540a(WikiInfoPlugin.class);
        if (wikiInfoPlugin == null || (wikiPerm = wikiInfoPlugin.getWikiPerm()) == null) {
            return false;
        }
        return wikiPerm.can_clone;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        this.pluginHost.mo19549a(WikiMakeCopyPlugin.class, new C12333b(this));
        getHost().mo39166c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "plugin", "Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiMakeCopyPlugin;", "onPluginFound"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.more_item.WikiMakeCopyItem$b */
    static final class C12333b<P extends AbstractC4941c<C4943e>> implements AbstractC4942d<WikiMakeCopyPlugin> {

        /* renamed from: a */
        final /* synthetic */ WikiMakeCopyItem f33114a;

        C12333b(WikiMakeCopyItem wikiMakeCopyItem) {
            this.f33114a = wikiMakeCopyItem;
        }

        /* renamed from: a */
        public final void onPluginFound(WikiMakeCopyPlugin wikiMakeCopyPlugin) {
            Intrinsics.checkParameterIsNotNull(wikiMakeCopyPlugin, "plugin");
            wikiMakeCopyPlugin.makeCopy(this.f33114a.getDocumentName());
        }
    }

    public WikiMakeCopyItem(C4943e eVar, String str) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginHost");
        this.pluginHost = eVar;
        this.documentName = str;
    }
}

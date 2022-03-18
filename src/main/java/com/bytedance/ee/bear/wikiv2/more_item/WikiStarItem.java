package com.bytedance.ee.bear.wikiv2.more_item;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.route.parcelable.WikNodePerm;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.bear.wikiv2.browser.plugin.WikiFavoritePlugin;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/more_item/WikiStarItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/IGridMoreItem;", "pluginHost", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "(Lcom/bytedance/ee/bear/browser/plugin/PluginHost;)V", "isStared", "", "()Z", "getIcon", "", "getIconTint", "getId", "", "getTitle", "getUnableTips", "isEnable", "isVisible", "needShowBadge", "onClick", "", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiStarItem extends BaseMoreItem implements IGridMoreItem {
    public static final Companion Companion = new Companion(null);
    private final C4943e pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "WikiStarItem";
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/more_item/WikiStarItem$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.more_item.WikiStarItem$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        if (isStared()) {
            return R.drawable.ud_icon_cancel_collection_outlined;
        }
        return R.drawable.ud_icon_collection_outlined;
    }

    private final boolean isStared() {
        TreeNode wikiMeta;
        WikiInfoPlugin wikiInfoPlugin = (WikiInfoPlugin) this.pluginHost.mo19540a(WikiInfoPlugin.class);
        if (wikiInfoPlugin == null || (wikiMeta = wikiInfoPlugin.getWikiMeta()) == null) {
            return false;
        }
        return wikiMeta.is_star;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        int i;
        if (isStared()) {
            i = R.string.Doc_Facade_Remove_From_Favorites;
        } else {
            i = R.string.Doc_Facade_AddToFavorites;
        }
        return getString(i);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        WikNodePerm wikiPerm;
        WikiInfoPlugin wikiInfoPlugin = (WikiInfoPlugin) this.pluginHost.mo19540a(WikiInfoPlugin.class);
        if (wikiInfoPlugin == null || (wikiPerm = wikiInfoPlugin.getWikiPerm()) == null) {
            return false;
        }
        return wikiPerm.can_star;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.ee.bear.wikiv2.more_item.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick() {
        /*
            r4 = this;
            com.bytedance.ee.bear.browser.plugin.e r0 = r4.pluginHost
            java.lang.Class<com.bytedance.ee.bear.wikiv2.browser.plugin.WikiFavoritePlugin> r1 = com.bytedance.ee.bear.wikiv2.browser.plugin.WikiFavoritePlugin.class
            boolean r2 = r4.isStared()
            if (r2 == 0) goto L_0x000d
            com.bytedance.ee.bear.wikiv2.more_item.WikiStarItem$b r2 = com.bytedance.ee.bear.wikiv2.more_item.WikiStarItem.C12334b.INSTANCE
            goto L_0x000f
        L_0x000d:
            com.bytedance.ee.bear.wikiv2.more_item.WikiStarItem$c r2 = com.bytedance.ee.bear.wikiv2.more_item.WikiStarItem.C12335c.INSTANCE
        L_0x000f:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            if (r2 == 0) goto L_0x0019
            com.bytedance.ee.bear.wikiv2.more_item.b r3 = new com.bytedance.ee.bear.wikiv2.more_item.b
            r3.<init>(r2)
            r2 = r3
        L_0x0019:
            com.bytedance.ee.bear.browser.plugin.d r2 = (com.bytedance.ee.bear.browser.plugin.AbstractC4942d) r2
            r0.mo19549a(r1, r2)
            com.bytedance.ee.bear.more.moreprotocol.a r0 = r4.getHost()
            r0.mo39166c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wikiv2.more_item.WikiStarItem.onClick():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiFavoritePlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.more_item.WikiStarItem$b */
    static final /* synthetic */ class C12334b extends FunctionReference implements Function1<WikiFavoritePlugin, Unit> {
        public static final C12334b INSTANCE = new C12334b();

        C12334b() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "unfavorite";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(WikiFavoritePlugin.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "unfavorite()V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WikiFavoritePlugin wikiFavoritePlugin) {
            invoke(wikiFavoritePlugin);
            return Unit.INSTANCE;
        }

        public final void invoke(WikiFavoritePlugin wikiFavoritePlugin) {
            Intrinsics.checkParameterIsNotNull(wikiFavoritePlugin, "p1");
            wikiFavoritePlugin.unfavorite();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiFavoritePlugin;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.more_item.WikiStarItem$c */
    static final /* synthetic */ class C12335c extends FunctionReference implements Function1<WikiFavoritePlugin, Unit> {
        public static final C12335c INSTANCE = new C12335c();

        C12335c() {
            super(1);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "favorite";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(WikiFavoritePlugin.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "favorite()V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WikiFavoritePlugin wikiFavoritePlugin) {
            invoke(wikiFavoritePlugin);
            return Unit.INSTANCE;
        }

        public final void invoke(WikiFavoritePlugin wikiFavoritePlugin) {
            Intrinsics.checkParameterIsNotNull(wikiFavoritePlugin, "p1");
            wikiFavoritePlugin.favorite();
        }
    }

    public WikiStarItem(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginHost");
        this.pluginHost = eVar;
    }
}

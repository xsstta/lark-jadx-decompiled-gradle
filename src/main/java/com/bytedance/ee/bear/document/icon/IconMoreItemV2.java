package com.bytedance.ee.bear.document.icon;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.larksuite.suite.R;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.am;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconMoreItemV2;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "pluginHost", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "(Lcom/bytedance/ee/bear/document/DocumentPluginHost;)V", "getIcon", "", "getIconTint", "getId", "", "getTitle", "getUnableTips", "isEnable", "", "isVisible", "needShowBadge", "onClick", "", "openIconSetting", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class IconMoreItemV2 extends BaseMoreItem implements ITextMoreItem {
    public static final Companion Companion = new Companion(null);
    private static final Set<C8275a> sSupportDocumentTypes = am.m265689a((Object[]) new C8275a[]{C8275a.f22371d, C8275a.f22372e, C8275a.f22374g});
    private final C6095s pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_emoji_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "iconV2";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/document/icon/IconMoreItemV2$Companion;", "", "()V", "NAME", "", "sSupportDocumentTypes", "", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.IconMoreItemV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/icon/IconMoreItemV2$openIconSetting$1", "Lcom/bytedance/ee/bear/browser/plugin/PluginFindAction;", "Lcom/bytedance/ee/bear/document/icon/IconPlugin;", "onPluginFound", "", "plugin", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.icon.IconMoreItemV2$b */
    public static final class C5819b implements AbstractC4942d<IconPlugin> {
        C5819b() {
        }

        /* renamed from: a */
        public void onPluginFound(IconPlugin iconPlugin) {
            Intrinsics.checkParameterIsNotNull(iconPlugin, "plugin");
            iconPlugin.showIconSelectList();
            ((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38980b("iconV2");
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Doc_IconSettings);
    }

    private final void openIconSetting() {
        this.pluginHost.mo19549a(IconPlugin.class, new C5819b());
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null || !moreInfo.mo39049p()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        getHost().mo39166c();
        openIconSetting();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        String string = this.pluginHost.mo19562e().getString(R.string.Doc_Doc_IconNoPermission);
        Intrinsics.checkExpressionValueIsNotNull(string, "pluginHost.context.getSt…Doc_Doc_IconNoPermission)");
        return string;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return ((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38977a("iconV2");
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        int i;
        Set<C8275a> set = sSupportDocumentTypes;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            i = moreInfo.mo39036e();
        } else {
            C8275a aVar = C8275a.f22371d;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
            i = aVar.mo32555b();
        }
        boolean contains = set.contains(C8275a.m34052b(i));
        boolean isType = this.pluginHost.mo24598m().isType(C8275a.f22377j);
        if (!C4211a.m17514a().mo16536a("spacekit.mobile.docs_diy_icon", false) || !contains || isType) {
            return false;
        }
        return true;
    }

    public IconMoreItemV2(C6095s sVar) {
        Intrinsics.checkParameterIsNotNull(sVar, "pluginHost");
        this.pluginHost = sVar;
    }
}

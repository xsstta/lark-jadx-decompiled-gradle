package com.bytedance.ee.bear.document.share;

import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.guide.p396b.C7811a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class ShareMoreItemV2 extends BaseMoreItem implements IGridMoreItem {
    private C6095s pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_share_label_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "shareV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_More_Share);
    }

    private void startShare() {
        this.pluginHost.mo19549a(SharePlugin.class, $$Lambda$ShareMoreItemV2$zFmYdimajwSWij4inl3JuJu_4Y.INSTANCE);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public boolean needShowBadge() {
        if (getMoreInfo() == null) {
            return false;
        }
        if (((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38977a("shareV2") || C7811a.m31302a(this.pluginHost.mo24598m().isOwner())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IGridMoreItem
    public void onClick() {
        C13479a.m54764b("ShareItemV2", "onClick");
        startShare();
        if (getMoreInfo() instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), "share", "ccm_permission_share_view", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
        }
        getHost().mo39166c();
    }

    public ShareMoreItemV2(C6095s sVar) {
        this.pluginHost = sVar;
    }

    static /* synthetic */ void lambda$startShare$0(SharePlugin sharePlugin) {
        sharePlugin.getClass();
        C13742g.m55706a(new Runnable() {
            /* class com.bytedance.ee.bear.document.share.$$Lambda$ddkf2Sa7X7RPfj4J6JzIfGK9GnM */

            public final void run() {
                SharePlugin.this.startShare();
            }
        }, 300);
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38980b("shareV2");
    }
}

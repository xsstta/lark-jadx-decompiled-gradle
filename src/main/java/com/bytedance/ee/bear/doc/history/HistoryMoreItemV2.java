package com.bytedance.ee.bear.doc.history;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.doc.editmodeswitchplugin.EditModeSwitchPlugin;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class HistoryMoreItemV2 extends BaseMoreItem implements ITextMoreItem {
    private C6095s pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_history_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "historyV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_More_History);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return this.pluginHost.mo19562e().getString(R.string.Doc_Facade_MoreHistoryTips);
    }

    private void showHistory() {
        this.pluginHost.mo19549a(EditModeSwitchPlugin.class, $$Lambda$sG57CmsdiPxAB_iI6PN63OazAh0.INSTANCE);
        this.pluginHost.mo19549a(HistoryPlugin.class, new AbstractC4942d() {
            /* class com.bytedance.ee.bear.doc.history.$$Lambda$HistoryMoreItemV2$YHHukOW7DhZyQ8wiFxHiwMOffBE */

            @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
            public final void onPluginFound(AbstractC4941c cVar) {
                HistoryMoreItemV2.this.lambda$showHistory$0$HistoryMoreItemV2((HistoryPlugin) cVar);
            }
        });
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        IMoreInfo moreInfo = getMoreInfo();
        if (!isVisible() || moreInfo == null || !moreInfo.mo39049p()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        boolean z;
        boolean z2;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            return false;
        }
        if (moreInfo.mo39036e() == C8275a.f22371d.mo32555b()) {
            z = true;
        } else {
            z = false;
        }
        if (!C4211a.m17514a().mo16536a("spacekit.mobile.docx_history_enable", false) || moreInfo.mo39036e() != C8275a.f22378k.mo32555b()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        showHistory();
        if (getMoreInfo() instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), "history_version", "ccm_docs_history_page_view", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
        }
        getHost().mo39166c();
    }

    public HistoryMoreItemV2(C6095s sVar) {
        this.pluginHost = sVar;
    }

    public /* synthetic */ void lambda$showHistory$0$HistoryMoreItemV2(HistoryPlugin historyPlugin) {
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38972a(getMoreInfo(), "history_record");
        historyPlugin.showHistory();
    }
}

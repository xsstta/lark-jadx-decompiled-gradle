package com.bytedance.ee.bear.document.search;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

public class SearchMoreItemV2 extends BaseMoreItem implements ITextMoreItem {
    private C6095s pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_card_search_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "searchV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Facade_LookFor);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            return false;
        }
        if (moreInfo.mo39036e() == C8275a.f22371d.mo32555b() || moreInfo.mo39036e() == C8275a.f22372e.mo32555b() || moreInfo.mo39036e() == C8275a.f22373f.mo32555b()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null && moreInfo.mo39036e() == C8275a.f22372e.mo32555b() && ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38977a("searchV2")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        IMoreInfo moreInfo = getMoreInfo();
        C13479a.m54772d("SearchItemV2", "onItemClick: docInfoData = " + moreInfo);
        if (moreInfo != null) {
            startSearch(moreInfo);
        }
        if (getMoreInfo() instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), "find_replace", "ccm_doc_find_replace_panel_view", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
        }
        getHost().mo39166c();
    }

    public SearchMoreItemV2(C6095s sVar) {
        this.pluginHost = sVar;
    }

    private void startSearch(IMoreInfo dVar) {
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38972a(dVar, "search_replace");
        this.pluginHost.mo19549a(SearchPlugin.class, new AbstractC4942d() {
            /* class com.bytedance.ee.bear.document.search.$$Lambda$SearchMoreItemV2$VKwwciUK5_VJFO1mOuhmWFfEO1E */

            @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
            public final void onPluginFound(AbstractC4941c cVar) {
                SearchMoreItemV2.lambda$startSearch$0(IMoreInfo.this, (SearchPlugin) cVar);
            }
        });
    }

    static /* synthetic */ void lambda$startSearch$0(IMoreInfo dVar, SearchPlugin searchPlugin) {
        searchPlugin.getClass();
        C13742g.m55706a(new Runnable() {
            /* class com.bytedance.ee.bear.document.search.$$Lambda$IqTotoJJMYQaQyTqregyrxuZto */

            public final void run() {
                SearchPlugin.this.startSearch();
            }
        }, 300);
        if (dVar.mo39036e() == C8275a.f22372e.mo32555b()) {
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38980b("searchV2");
        }
    }
}

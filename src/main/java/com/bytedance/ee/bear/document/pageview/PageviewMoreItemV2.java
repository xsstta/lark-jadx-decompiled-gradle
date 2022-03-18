package com.bytedance.ee.bear.document.pageview;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.larksuite.suite.R;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

public class PageviewMoreItemV2 extends BaseMoreItem implements ITextMoreItem {
    private C4943e pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_info_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "pageviewV2";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        return "";
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        return true;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return false;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            return getString(R.string.Doc_Doc_DocumentDetails);
        }
        if (moreInfo.mo39036e() == C8275a.f22372e.mo32555b()) {
            return getString(R.string.Doc_Doc_SheetDetails);
        }
        if (moreInfo.mo39036e() == C8275a.f22373f.mo32555b()) {
            return getString(R.string.Doc_Doc_BitableDetails);
        }
        return getString(R.string.Doc_Doc_DocumentDetails);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            return false;
        }
        if (moreInfo.mo39036e() == C8275a.f22371d.mo32555b() || moreInfo.mo39036e() == C8275a.f22378k.mo32555b() || moreInfo.mo39036e() == C8275a.f22372e.mo32555b() || moreInfo.mo39036e() == C8275a.f22373f.mo32555b()) {
            return true;
        }
        return false;
    }

    private void reportShowDocDetails() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("module", "doc");
                jSONObject.put("sub_module", "null");
                jSONObject.put("file_id", C13598b.m55197d(moreInfo.mo39041h()));
                jSONObject.put("file_type", C8275a.m34050a(moreInfo.mo39036e()));
                jSONObject.put("sub_file_type", "null");
                jSONObject.put("container_id", "null");
                jSONObject.put("container_type", "null");
                jSONObject.put("app_form", "null");
                C5234y.m21391b().mo21081a("ccm_space_docs_details_view", jSONObject, "");
            } catch (Exception e) {
                C13479a.m54758a("PageviewMoreItemV2", "reportShowDocDetails()...error = " + e);
            }
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        this.pluginHost.mo19549a(PageviewPlugin.class, $$Lambda$iz5MRmkPYgDctGp7iRJLMB1Dcw.INSTANCE);
        ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38972a(getMoreInfo(), "reading_data");
        getHost().mo39166c();
        reportShowDocDetails();
        if (getMoreInfo() instanceof DocMoreInfo) {
            DocMoreInfo aVar = (DocMoreInfo) getMoreInfo();
            ((AbstractC10194a) KoinJavaComponent.m268610a(AbstractC10194a.class)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), "docs_details", "ccm_space_docs_details_view", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
        }
    }

    public PageviewMoreItemV2(C4943e eVar) {
        this.pluginHost = eVar;
    }
}

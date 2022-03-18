package com.ss.android.lark.search.impl.entity.viewdata;

import com.bytedance.lark.pb.basic.v1.Tag;
import java.util.List;

public class SearchHelpDeskViewData extends SearchBaseViewData {
    private static final long serialVersionUID = -6794364287487549953L;
    private String crossTagInfo;
    private String faqId;
    private String faqTitle;
    private String helpDeskId;
    private boolean isOfficialOnCall;
    private List<Tag> tags;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 10;
    }

    public String getCrossTagInfo() {
        return this.crossTagInfo;
    }

    public String getFaqId() {
        return this.faqId;
    }

    public String getFaqTitle() {
        return this.faqTitle;
    }

    public String getHelpDeskId() {
        return this.helpDeskId;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public boolean isOfficialOnCall() {
        return this.isOfficialOnCall;
    }

    public void setCrossTagInfo(String str) {
        this.crossTagInfo = str;
    }

    public void setFaqId(String str) {
        this.faqId = str;
    }

    public void setFaqTitle(String str) {
        this.faqTitle = str;
    }

    public void setHelpDeskId(String str) {
        this.helpDeskId = str;
    }

    public void setOfficialOnCall(boolean z) {
        this.isOfficialOnCall = z;
    }

    public void setTags(List<Tag> list) {
        this.tags = list;
    }
}

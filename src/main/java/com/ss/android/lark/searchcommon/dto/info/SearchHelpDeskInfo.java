package com.ss.android.lark.searchcommon.dto.info;

import com.bytedance.lark.pb.basic.v1.Tag;
import java.util.List;

public class SearchHelpDeskInfo extends SearchBaseInfo {
    private static final long serialVersionUID = -4021864670706611987L;
    private String crossTagInfo;
    private String faqId;
    private String faqTitle;
    private boolean isOfficialOnCall;
    private List<Tag> tags;

    @Override // com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo
    public String getResultTypeForReport() {
        return "helpdesk";
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

    public List<Tag> getTags() {
        return this.tags;
    }

    public boolean isOfficialOnCall() {
        return this.isOfficialOnCall;
    }

    public SearchHelpDeskInfo() {
        this.type = 10;
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

    public void setOfficialOnCall(boolean z) {
        this.isOfficialOnCall = z;
    }

    public void setTags(List<Tag> list) {
        this.tags = list;
    }
}

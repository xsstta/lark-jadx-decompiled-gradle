package com.ss.android.lark.search.impl.entity.viewdata;

import com.ss.android.lark.doc.entity.DocType;

public class SearchSpaceViewData extends SearchBaseViewData {
    private static final long serialVersionUID = -6806673208622696244L;
    private String docId;
    private DocType docType;
    private String docUrl;
    private String editUserName;
    private boolean isShowCrossTenantTag;
    private long lastOpenTime;
    private String ownerName;
    private int position;
    private String threadId;
    private int threadPosition;
    private long updateTime;

    @Override // com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData
    public int getSearchResultType() {
        return 6;
    }

    public String getDocId() {
        return this.docId;
    }

    public DocType getDocType() {
        return this.docType;
    }

    public String getDocUrl() {
        return this.docUrl;
    }

    public String getEditUserName() {
        return this.editUserName;
    }

    public long getLastOpenTime() {
        return this.lastOpenTime;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getPosition() {
        return this.position;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public int getThreadPosition() {
        return this.threadPosition;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public boolean isShowCrossTenantTag() {
        return this.isShowCrossTenantTag;
    }

    public void setDocId(String str) {
        this.docId = str;
    }

    public void setDocType(DocType docType2) {
        this.docType = docType2;
    }

    public void setDocUrl(String str) {
        this.docUrl = str;
    }

    public void setEditUserName(String str) {
        this.editUserName = str;
    }

    public void setLastOpenTime(long j) {
        this.lastOpenTime = j;
    }

    public void setOwnerName(String str) {
        this.ownerName = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setShowCrossTenantTag(boolean z) {
        this.isShowCrossTenantTag = z;
    }

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setThreadPosition(int i) {
        this.threadPosition = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }
}

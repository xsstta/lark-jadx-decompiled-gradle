package com.ss.android.lark.feed.app.entity;

import android.text.TextUtils;
import com.ss.android.lark.doc.entity.DocMessage;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.utils.C57782ag;
import java.util.HashMap;
import java.util.Map;

public class DocFeedPreview extends FeedPreview {
    private DocMessage.Type docMessageType;
    private DocType docType;
    private String docUrl;
    private String lastDocMessageId;

    public DocMessage.Type getDocMessageType() {
        return this.docMessageType;
    }

    public DocType getDocType() {
        return this.docType;
    }

    public String getDocUrl() {
        return this.docUrl;
    }

    public String getLastDocMessageId() {
        return this.lastDocMessageId;
    }

    public Map<String, String> buildExtra() {
        HashMap hashMap = new HashMap();
        hashMap.put("unread_badge_count", String.valueOf(getUnreadCount()));
        hashMap.put("doc_message_type", String.valueOf(getDocMessageType().getNumber()));
        hashMap.put("click_time", String.valueOf(System.currentTimeMillis()));
        return hashMap;
    }

    public Map<String, String> buildQuerys() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(getId())) {
            hashMap.put("docId", getId());
        }
        if (!TextUtils.isEmpty(getLastDocMessageId())) {
            hashMap.put("last_doc_message_id", getLastDocMessageId());
        }
        return hashMap;
    }

    public void setDocMessageType(DocMessage.Type type) {
        this.docMessageType = type;
    }

    public void setDocType(DocType docType2) {
        this.docType = docType2;
    }

    public void setDocUrl(String str) {
        this.docUrl = str;
    }

    public void setLastDocMessageId(String str) {
        this.lastDocMessageId = str;
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard, com.ss.android.lark.feed.app.entity.FeedPreview
    public boolean exactlyCompare(Object obj) {
        if (obj == null || !(obj instanceof DocFeedPreview)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        DocFeedPreview docFeedPreview = (DocFeedPreview) obj;
        if (docFeedPreview.docType == this.docType && docFeedPreview.docMessageType == this.docMessageType && TextUtils.equals(this.docUrl, docFeedPreview.docUrl) && C57782ag.m224242a(this.lastDocMessageId, docFeedPreview.lastDocMessageId)) {
            return super.exactlyCompare(obj);
        }
        return false;
    }
}

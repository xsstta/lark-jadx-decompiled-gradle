package com.ss.android.lark.doc.entity;

import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DocResult implements AbstractC26248b<DocResult>, Serializable {
    private Doc doc;
    private DocCard docCard;
    private List<String> messageIds;

    public DocResult() {
    }

    public Doc getDoc() {
        return this.doc;
    }

    public DocCard getDocCard() {
        return this.docCard;
    }

    public String getDocCardId() {
        DocCard docCard2 = this.docCard;
        if (docCard2 == null) {
            return "";
        }
        return docCard2.getDocId();
    }

    public List<String> getMessageIds() {
        List<String> list = this.messageIds;
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public int hashCode() {
        int i;
        Doc doc2 = this.doc;
        int i2 = 0;
        if (doc2 != null) {
            i = doc2.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        DocCard docCard2 = this.docCard;
        if (docCard2 != null) {
            i2 = docCard2.hashCode();
        }
        return i3 + i2;
    }

    public void setDoc(Doc doc2) {
        this.doc = doc2;
    }

    public void setDocCard(DocCard docCard2) {
        this.docCard = docCard2;
    }

    public void setMessageIds(List<String> list) {
        this.messageIds = list;
    }

    public boolean isContentSame(DocResult docResult) {
        if (docResult != null && C26247a.m94983b(this.doc, docResult.getDoc()) && C26247a.m94983b(this.docCard, docResult.getDocCard())) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DocResult docResult = (DocResult) obj;
        Doc doc2 = this.doc;
        if (doc2 == null ? docResult.doc != null : !doc2.equals(docResult.doc)) {
            return false;
        }
        DocCard docCard2 = this.docCard;
        DocCard docCard3 = docResult.docCard;
        if (docCard2 != null) {
            return docCard2.equals(docCard3);
        }
        if (docCard3 == null) {
            return true;
        }
        return false;
    }

    public boolean isItemSame(DocResult docResult) {
        if (this.docCard == null && (docResult == null || docResult.getDocCard() == null)) {
            return true;
        }
        String messageId = this.docCard.getMessageId();
        String str = "";
        if (!(docResult == null || docResult.getDocCard() == null)) {
            str = docResult.getDocCard().getMessageId();
        }
        if (TextUtils.equals(messageId, str)) {
            return true;
        }
        return false;
    }

    public DocResult(Doc doc2, DocCard docCard2) {
        this.doc = doc2;
        this.docCard = docCard2;
    }

    public DocResult(Doc doc2, DocCard docCard2, List<String> list) {
        this.doc = doc2;
        this.docCard = docCard2;
        this.messageIds = list;
    }
}

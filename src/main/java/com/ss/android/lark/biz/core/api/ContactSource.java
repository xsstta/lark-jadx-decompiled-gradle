package com.ss.android.lark.biz.core.api;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ContactSource implements Serializable {
    private static final long serialVersionUID = 6988230933246958495L;
    private String mFromTag;
    private String sender;
    private String senderId;
    private String sourceId;
    private String sourceName;
    private int sourceType;
    private String subSourceType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceType {
    }

    public ContactSource() {
    }

    public String getFromTag() {
        return this.mFromTag;
    }

    public String getSender() {
        return this.sender;
    }

    public String getSenderId() {
        return this.senderId;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public String getSubSourceType() {
        return this.subSourceType;
    }

    /* renamed from: com.ss.android.lark.biz.core.api.ContactSource$a */
    public static class C29531a {

        /* renamed from: a */
        public String f73830a;

        /* renamed from: b */
        public int f73831b;

        /* renamed from: c */
        public String f73832c;

        /* renamed from: d */
        public String f73833d;

        /* renamed from: e */
        public String f73834e;

        /* renamed from: f */
        public String f73835f;

        /* renamed from: g */
        public String f73836g;

        /* renamed from: a */
        public ContactSource mo104728a() {
            return new ContactSource(this);
        }

        /* renamed from: a */
        public C29531a mo104726a(int i) {
            this.f73831b = i;
            return this;
        }

        /* renamed from: b */
        public C29531a mo104729b(String str) {
            this.f73832c = str;
            return this;
        }

        /* renamed from: c */
        public C29531a mo104730c(String str) {
            this.f73834e = str;
            return this;
        }

        /* renamed from: d */
        public C29531a mo104731d(String str) {
            this.f73833d = str;
            return this;
        }

        /* renamed from: e */
        public C29531a mo104732e(String str) {
            this.f73835f = str;
            return this;
        }

        /* renamed from: f */
        public C29531a mo104733f(String str) {
            this.f73836g = str;
            return this;
        }

        /* renamed from: a */
        public C29531a mo104727a(String str) {
            this.f73830a = str;
            return this;
        }
    }

    public void setFromTag(String str) {
        this.mFromTag = str;
    }

    public void setSender(String str) {
        this.sender = str;
    }

    public void setSenderId(String str) {
        this.senderId = str;
    }

    public void setSourceId(String str) {
        this.sourceId = str;
    }

    public void setSourceName(String str) {
        this.sourceName = str;
    }

    public void setSourceType(int i) {
        this.sourceType = i;
    }

    public void setSubSourceType(String str) {
        this.subSourceType = str;
    }

    public ContactSource(C29531a aVar) {
        this.sender = aVar.f73830a;
        this.sourceType = aVar.f73831b;
        this.sourceName = aVar.f73832c;
        this.senderId = aVar.f73833d;
        this.sourceId = aVar.f73834e;
        this.subSourceType = aVar.f73835f;
        this.mFromTag = aVar.f73836g;
    }
}

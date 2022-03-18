package com.ss.android.lark.doc.entity;

import java.io.Serializable;
import java.util.List;

public class DocFeed implements Serializable {
    private long createTime;
    private List<String> docMessageIds;
    private String iconKey;
    private String id;
    private boolean isCrossTenant;
    private boolean isRemind;
    private String lastMessageId;
    private int newMessageCount;
    private String ownerId;
    private String title;
    private DocType type;
    private long updateTime;
    private String url;

    public long getCreateTime() {
        return this.createTime;
    }

    public List<String> getDocMessageIds() {
        return this.docMessageIds;
    }

    public String getIconKey() {
        return this.iconKey;
    }

    public String getId() {
        return this.id;
    }

    public String getLastMessageId() {
        return this.lastMessageId;
    }

    public int getNewMessageCount() {
        return this.newMessageCount;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getTitle() {
        return this.title;
    }

    public DocType getType() {
        return this.type;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isRemind() {
        return this.isRemind;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setDocMessageIds(List<String> list) {
        this.docMessageIds = list;
    }

    public void setIconKey(String str) {
        this.iconKey = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLastMessageId(String str) {
        this.lastMessageId = str;
    }

    public void setNewMessageCount(int i) {
        this.newMessageCount = i;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setRemind(boolean z) {
        this.isRemind = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(DocType docType) {
        this.type = docType;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocFeed)) {
            return false;
        }
        DocFeed docFeed = (DocFeed) obj;
        String str = this.id;
        if (str != null) {
            z = str.equals(docFeed.getId());
        } else if (docFeed.getId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        DocType docType = this.type;
        DocType type2 = docFeed.getType();
        if (docType != null) {
            return docType.equals(type2);
        }
        if (type2 == null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x005b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean exactlyCompare(com.ss.android.lark.doc.entity.DocFeed r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            if (r7 != r8) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r2 = r7.id
            if (r2 != 0) goto L_0x0016
            java.lang.String r2 = r8.getId()
            if (r2 != 0) goto L_0x0014
            r2 = 1
            goto L_0x001e
        L_0x0014:
            r2 = 0
            goto L_0x001e
        L_0x0016:
            java.lang.String r3 = r8.getId()
            boolean r2 = r2.equals(r3)
        L_0x001e:
            if (r2 != 0) goto L_0x0021
            return r0
        L_0x0021:
            long r2 = r7.updateTime
            long r4 = r8.updateTime
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x002b
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            if (r2 != 0) goto L_0x002f
            return r0
        L_0x002f:
            int r2 = r7.newMessageCount
            int r3 = r8.getNewMessageCount()
            if (r2 != r3) goto L_0x0039
            r2 = 1
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            if (r2 != 0) goto L_0x003d
            return r0
        L_0x003d:
            if (r2 == 0) goto L_0x0047
            boolean r2 = r7.isRemind
            boolean r3 = r8.isRemind
            if (r2 != r3) goto L_0x0047
            r2 = 1
            goto L_0x0048
        L_0x0047:
            r2 = 0
        L_0x0048:
            if (r2 == 0) goto L_0x005c
            com.ss.android.lark.doc.entity.DocType r2 = r7.type
            com.ss.android.lark.doc.entity.DocType r8 = r8.getType()
            if (r2 != 0) goto L_0x0055
            if (r8 != 0) goto L_0x005c
            goto L_0x005b
        L_0x0055:
            boolean r8 = r2.equals(r8)
            if (r8 == 0) goto L_0x005c
        L_0x005b:
            r0 = 1
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.doc.entity.DocFeed.exactlyCompare(com.ss.android.lark.doc.entity.DocFeed):boolean");
    }
}

package com.ss.android.lark.doc.entity;

import android.text.TextUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;

public class Doc implements AbstractC26248b<Doc>, Serializable {
    private String abstractUrl;
    private long createTime;
    private DocType docType;
    private Icon icon;
    private String iconKey;
    private String id;
    private String name;
    private String ownerId;
    private String ownerName;
    private ThumbnailDetail thumbnailDetail;
    private long updateTime;
    private String url;

    public String getAbstract() {
        return this.abstractUrl;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public DocType getDocType() {
        return this.docType;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public String getIconKey() {
        return this.iconKey;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public ThumbnailDetail getThumbnaimDetail() {
        return this.thumbnailDetail;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.id);
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.id;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.url;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.abstractUrl;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public void setAbstract(String str) {
        this.abstractUrl = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setDocType(DocType docType2) {
        this.docType = docType2;
    }

    public void setIcon(Icon icon2) {
        this.icon = icon2;
    }

    public void setIconKey(String str) {
        this.iconKey = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setOwnerName(String str) {
        this.ownerName = str;
    }

    public void setThumbnaimDetail(ThumbnailDetail thumbnailDetail2) {
        this.thumbnailDetail = thumbnailDetail2;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public boolean isItemSame(Doc doc) {
        String str;
        String str2 = this.id;
        if (doc == null) {
            str = "";
        } else {
            str = doc.getId();
        }
        return TextUtils.equals(str2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Doc doc = (Doc) obj;
        String str = this.id;
        if (str == null ? doc.id != null : !str.equals(doc.id)) {
            return false;
        }
        String str2 = this.url;
        if (str2 == null ? doc.url != null : !str2.equals(doc.url)) {
            return false;
        }
        String str3 = this.abstractUrl;
        String str4 = doc.abstractUrl;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public boolean isContentSame(Doc doc) {
        if (doc != null && TextUtils.equals(this.ownerName, doc.getOwnerName()) && TextUtils.equals(this.url, doc.getUrl()) && TextUtils.equals(this.name, doc.getName()) && TextUtils.equals(this.abstractUrl, doc.getAbstract()) && this.updateTime == doc.getUpdateTime()) {
            return true;
        }
        return false;
    }
}

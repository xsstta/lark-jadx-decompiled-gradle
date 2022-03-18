package com.bytedance.ee.bear.document.offline.sync.preloadexecutor;

import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.C8275a;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class SubBlockModel implements Serializable {
    private List<String> dataToken;
    private String objToken;
    private String ownerResKey;
    private SubBlockType subBlockType = SubBlockType.COMMENTS_DATA;
    private int type = C8275a.f22371d.mo32555b();
    private String url;

    public List<String> getDataToken() {
        return this.dataToken;
    }

    public String getObjToken() {
        return this.objToken;
    }

    public String getOwnerResKey() {
        return this.ownerResKey;
    }

    public SubBlockType getSubBlockType() {
        return this.subBlockType;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public SubBlockModel() {
    }

    public int hashCode() {
        return Objects.hash(this.objToken, this.dataToken, Integer.valueOf(this.type), this.subBlockType, this.url);
    }

    public String toString() {
        return "SubBlockModel{, type=" + this.type + ", subBlockType=" + this.subBlockType + '}';
    }

    public void setDataToken(List<String> list) {
        this.dataToken = list;
    }

    public void setObjToken(String str) {
        this.objToken = str;
    }

    public void setOwnerResKey(String str) {
        this.ownerResKey = str;
    }

    public void setSubBlockType(SubBlockType subBlockType2) {
        this.subBlockType = subBlockType2;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public SubBlockModel(String str) {
        this.url = str;
    }

    public boolean equals(Object obj) {
        SubBlockType subBlockType2;
        String str;
        String str2;
        List<String> list;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SubBlockModel subBlockModel = (SubBlockModel) obj;
            if (TextUtils.equals(this.objToken, subBlockModel.objToken) && (subBlockType2 = this.subBlockType) == subBlockModel.subBlockType) {
                if (subBlockType2 == SubBlockType.COMMENTS_DATA) {
                    return true;
                }
                if (this.subBlockType == SubBlockType.POLL_DATA) {
                    List<String> list2 = this.dataToken;
                    if (list2 == null || (list = subBlockModel.dataToken) == null || !list2.equals(list)) {
                        return false;
                    }
                    return true;
                } else if (this.subBlockType != SubBlockType.IMAGE_DATA || (str = this.url) == null || (str2 = subBlockModel.url) == null || !str.equals(str2)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public SubBlockModel(String str, int i, SubBlockType subBlockType2) {
        this.objToken = str;
        this.type = i;
        this.subBlockType = subBlockType2;
    }

    public SubBlockModel(String str, int i, SubBlockType subBlockType2, String str2) {
        this.objToken = str;
        this.url = str2;
        this.type = i;
        this.subBlockType = subBlockType2;
    }

    public SubBlockModel(String str, int i, SubBlockType subBlockType2, List<String> list) {
        this.objToken = str;
        this.dataToken = list;
        this.type = i;
        this.subBlockType = subBlockType2;
    }
}

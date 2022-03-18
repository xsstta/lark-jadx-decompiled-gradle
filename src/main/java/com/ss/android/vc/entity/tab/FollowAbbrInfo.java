package com.ss.android.vc.entity.tab;

import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.follow.FollowInfo;
import java.io.Serializable;
import java.util.List;

public class FollowAbbrInfo implements Serializable {
    private List<ByteviewUser> byteviewUsers;
    private String docLabelUrl;
    private FollowInfo.ShareSubType docSubType;
    private String docTitle;
    private String docToken;
    private String docUrl;

    public FollowAbbrInfo() {
    }

    public List<ByteviewUser> getByteviewUsers() {
        return this.byteviewUsers;
    }

    public String getDocLabelUrl() {
        return this.docLabelUrl;
    }

    public FollowInfo.ShareSubType getDocSubType() {
        return this.docSubType;
    }

    public String getDocTitle() {
        return this.docTitle;
    }

    public String getDocToken() {
        return this.docToken;
    }

    public String getDocUrl() {
        return this.docUrl;
    }

    public String toString() {
        return "FollowAbbrInfo{docToken='" + this.docToken + '\'' + ", docSubType=" + this.docSubType + '}';
    }

    public void setByteviewUsers(List<ByteviewUser> list) {
        this.byteviewUsers = list;
    }

    public void setDocLabelUrl(String str) {
        this.docLabelUrl = str;
    }

    public void setDocSubType(FollowInfo.ShareSubType shareSubType) {
        this.docSubType = shareSubType;
    }

    public void setDocTitle(String str) {
        this.docTitle = str;
    }

    public void setDocToken(String str) {
        this.docToken = str;
    }

    public void setDocUrl(String str) {
        this.docUrl = str;
    }

    public FollowAbbrInfo(String str, String str2, String str3, FollowInfo.ShareSubType shareSubType) {
        this.docToken = str;
        this.docUrl = str2;
        this.docTitle = str3;
        this.docSubType = shareSubType;
    }
}

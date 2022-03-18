package com.ss.android.lark.oncall.entity;

import android.text.TextUtils;
import java.io.Serializable;

public class OnCall implements Serializable, Comparable {
    private String avatarKey;
    private String description;
    private String id;
    private String name;
    private String namePinyin;
    private boolean needReportLocation;
    private String phoneNumber;

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNamePinyin() {
        return this.namePinyin;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean isNeedReportLocation() {
        return this.needReportLocation;
    }

    public OnCall setAvatarKey(String str) {
        this.avatarKey = str;
        return this;
    }

    public OnCall setDescription(String str) {
        this.description = str;
        return this;
    }

    public OnCall setId(String str) {
        this.id = str;
        return this;
    }

    public OnCall setName(String str) {
        this.name = str;
        return this;
    }

    public OnCall setNamePinyin(String str) {
        this.namePinyin = str;
        return this;
    }

    public void setNeedReportLocation(boolean z) {
        this.needReportLocation = z;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OnCall) {
            return getId().equals(((OnCall) obj).getId());
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof OnCall)) {
            return 0;
        }
        String str = this.name;
        if (!TextUtils.isEmpty(this.namePinyin) && !this.namePinyin.equals("#")) {
            str = this.namePinyin;
        }
        OnCall onCall = (OnCall) obj;
        String namePinyin2 = onCall.getNamePinyin();
        if (TextUtils.isEmpty(namePinyin2) || namePinyin2.equals("#")) {
            namePinyin2 = onCall.getName();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.compareToIgnoreCase(namePinyin2) == 0) {
            return this.id.compareTo(onCall.getId());
        }
        return str.compareToIgnoreCase(namePinyin2);
    }
}

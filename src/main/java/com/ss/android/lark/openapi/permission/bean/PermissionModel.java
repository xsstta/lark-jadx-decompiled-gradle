package com.ss.android.lark.openapi.permission.bean;

import android.text.TextUtils;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PermissionModel implements Serializable {
    private String mApiSession;
    private String mAppId;
    private long mExpireTime;
    private ArrayList<String> mJsApiList;
    private String mNonceStr;
    private String mSignature;
    private String mTenantId;
    private String mTimestamp;
    private String mUrl;

    public String getApiSession() {
        return this.mApiSession;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public long getExpireTime() {
        return this.mExpireTime;
    }

    public ArrayList<String> getJsApiList() {
        return this.mJsApiList;
    }

    public String getNonceStr() {
        return this.mNonceStr;
    }

    public String getSignature() {
        return this.mSignature;
    }

    public String getTenantId() {
        return this.mTenantId;
    }

    public String getTimestamp() {
        return this.mTimestamp;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public String getKey() {
        return buildKey(this.mAppId, this.mUrl);
    }

    public void setApiSession(String str) {
        this.mApiSession = str;
    }

    public void setAppId(String str) {
        this.mAppId = str;
    }

    public void setExpireTime(long j) {
        this.mExpireTime = j;
    }

    public void setJsApiList(ArrayList<String> arrayList) {
        this.mJsApiList = arrayList;
    }

    public void setNonceStr(String str) {
        this.mNonceStr = str;
    }

    public void setSignature(String str) {
        this.mSignature = str;
    }

    public void setTenantId(String str) {
        this.mTenantId = str;
    }

    public void setTimestamp(String str) {
        this.mTimestamp = str;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof PermissionModel) && !TextUtils.isEmpty(this.mUrl) && !TextUtils.isEmpty(this.mSignature) && !TextUtils.isEmpty(this.mTenantId) && !TextUtils.isEmpty(this.mAppId) && !TextUtils.isEmpty(this.mNonceStr)) {
            PermissionModel permissionModel = (PermissionModel) obj;
            if (this.mUrl.equals(permissionModel.mUrl) && this.mSignature.equals(permissionModel.mSignature) && this.mTenantId.equals(permissionModel.mTenantId) && this.mAppId.equals(permissionModel.mAppId) && this.mNonceStr.equals(permissionModel.mNonceStr) && this.mExpireTime == permissionModel.mExpireTime) {
                return equals(this.mJsApiList, permissionModel.mJsApiList);
            }
        }
        return false;
    }

    public static String buildKey(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        sb.append(str);
        sb.append(":");
        if (str2 != null) {
            str3 = URLEncoder.encode(str2);
        }
        sb.append(str3);
        return sb.toString();
    }

    private boolean equals(List<String> list, List<String> list2) {
        int i;
        int i2;
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.size();
        }
        if (i != i2) {
            return false;
        }
        HashMap hashMap = new HashMap();
        for (String str : list) {
            hashMap.put(str, str);
        }
        for (String str2 : list2) {
            if (TextUtils.isEmpty((CharSequence) hashMap.get(str2))) {
                return false;
            }
        }
        return true;
    }
}

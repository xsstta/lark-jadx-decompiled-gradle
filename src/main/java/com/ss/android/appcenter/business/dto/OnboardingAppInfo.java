package com.ss.android.appcenter.business.dto;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.net.dto.AvatarModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OnboardingAppInfo implements Serializable {
    @SerializedName("appId")
    String appId;
    @SerializedName("clauseUrl")
    String clauseUrl;
    @SerializedName("description")
    String description;
    private List<String> highLevelPermission;
    @SerializedName("icon")
    AvatarModel icon;
    @SerializedName("mobileAppstoreUrl")
    String mobileAppStoreUrl;
    @SerializedName("name")
    String name;
    private List<String> normalLevelPermission;
    @SerializedName("privacyPolicyUrl")
    String privacyPolicyUrl;
    @SerializedName("scopes")
    private List<PrivacyScopeInfo> scopeInfos;

    public String getAppId() {
        return this.appId;
    }

    public String getClauseUrl() {
        return this.clauseUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public AvatarModel getIcon() {
        return this.icon;
    }

    public String getMobileAppStoreUrl() {
        return this.mobileAppStoreUrl;
    }

    public String getName() {
        return this.name;
    }

    public String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public List<PrivacyScopeInfo> getScopeInfos() {
        return this.scopeInfos;
    }

    public List<String> getHighLevelPermission() {
        if (this.highLevelPermission == null) {
            this.highLevelPermission = parseScope("high");
        }
        return this.highLevelPermission;
    }

    public List<String> getNormalLevelPermission() {
        if (this.normalLevelPermission == null) {
            this.normalLevelPermission = parseScope("normal");
        }
        return this.normalLevelPermission;
    }

    public boolean hasHighPermission() {
        if (getHighLevelPermission() == null || getHighLevelPermission().size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean hasNormalPermission() {
        if (getNormalLevelPermission() == null || getNormalLevelPermission().size() <= 0) {
            return false;
        }
        return true;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setClauseUrl(String str) {
        this.clauseUrl = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setHighLevelPermission(List<String> list) {
        this.highLevelPermission = list;
    }

    public void setMobileAppStoreUrl(String str) {
        this.mobileAppStoreUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNormalLevelPermission(List<String> list) {
        this.normalLevelPermission = list;
    }

    public void setPrivacyPolicyUrl(String str) {
        this.privacyPolicyUrl = str;
    }

    public void setScopeInfos(List<PrivacyScopeInfo> list) {
        this.scopeInfos = list;
    }

    private List<String> parseScope(String str) {
        ArrayList arrayList = new ArrayList();
        List<PrivacyScopeInfo> list = this.scopeInfos;
        if (list != null && list.size() > 0) {
            for (PrivacyScopeInfo privacyScopeInfo : this.scopeInfos) {
                if (TextUtils.equals(privacyScopeInfo.getLevel(), str)) {
                    arrayList.add(privacyScopeInfo.getDesc());
                }
            }
        }
        return arrayList;
    }
}

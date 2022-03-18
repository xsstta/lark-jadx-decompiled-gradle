package com.ss.android.appcenter.business.net.operationconfig;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.ss.android.appcenter.business.dto.OnboardingAppInfo;
import java.io.Serializable;
import java.text.MessageFormat;
import java.util.List;

public class OperationalConfigData implements Serializable {
    @SerializedName("bubblePopup")
    private boolean bubblePopup;
    @SerializedName("isAdmin")
    private boolean isAdmin;
    @SerializedName("operationalApps")
    private List<OnboardingAppInfo> onboardingApps;
    @SerializedName("onboardingPopUp")
    private boolean onboardingPopUp;
    @SerializedName("operationalActivity")
    private OperationalActivity operationActivity;
    @SerializedName("operationalType")
    private String operationalType;

    public List<OnboardingAppInfo> getOnboardingApps() {
        return this.onboardingApps;
    }

    public String getOperationalType() {
        return this.operationalType;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public boolean showTipTitleButton() {
        return haveOperationData();
    }

    public OperationalActivity getOperationActivity() {
        OperationalActivity operationalActivity = this.operationActivity;
        if (operationalActivity == null) {
            return new OperationalActivity();
        }
        return operationalActivity;
    }

    public boolean showTipButtonBubble() {
        if (!this.bubblePopup || !haveOperationData()) {
            return false;
        }
        return true;
    }

    public boolean haveOperationActivity() {
        OperationalActivity operationalActivity;
        if (!TextUtils.equals("operationalActivity", this.operationalType) || (operationalActivity = this.operationActivity) == null || TextUtils.isEmpty(operationalActivity.getMobileUrl())) {
            return false;
        }
        return true;
    }

    public boolean haveOperationData() {
        if (haveRecommendAppsToInstall() || haveOperationActivity()) {
            return true;
        }
        return false;
    }

    public boolean haveRecommendAppsToInstall() {
        List<OnboardingAppInfo> list;
        if (!TextUtils.equals("operationalApps", this.operationalType) || (list = this.onboardingApps) == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean showOnboardingInstallApps() {
        List<OnboardingAppInfo> list;
        if (!this.onboardingPopUp || (list = this.onboardingApps) == null || list.size() <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return MessageFormat.format("OperationalConfigData'{'isAdmin={0}, operationalType=''{1}'', onboardingPopUp={2}'}'", Boolean.valueOf(this.isAdmin), this.operationalType, Boolean.valueOf(this.onboardingPopUp));
    }
}

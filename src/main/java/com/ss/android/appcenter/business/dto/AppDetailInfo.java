package com.ss.android.appcenter.business.dto;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.ss.android.appcenter.common.util.C28183g;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.io.Serializable;

public class AppDetailInfo implements Serializable {
    @SerializedName("can_apply_visibility")
    private boolean canApplyVisibility = true;
    @SerializedName("description")
    private String mAppDescription;
    @SerializedName("cli_id")
    private String mAppId;
    @SerializedName("name")
    private String mAppName;
    @SerializedName("app_scene_type")
    private int mAppSceneType;
    @SerializedName("app_type")
    private int mAppType;
    @SerializedName("app_url")
    private String mAppUrl;
    @SerializedName("app_version")
    private String mAppVersion;
    @SerializedName("avatar_key")
    private String mAvatarKey;
    @SerializedName("avatar_url")
    private String mAvatarUrl;
    @SerializedName("bot_id")
    private String mBotId;
    @SerializedName("bot_inviter_id")
    private String mBotInviterId;
    @SerializedName("bot_inviter_name")
    private String mBotInviterName;
    @SerializedName("chat_type")
    private int mChatType;
    @SerializedName("chatable")
    private boolean mChatable;
    @SerializedName("clause_url")
    private String mClauseUrl;
    @SerializedName("developer_id")
    private String mDeveloperId;
    @SerializedName("developer_info")
    private String mDeveloperName;
    @SerializedName("help_file")
    private String mHelpFile;
    @SerializedName("i18n_directions")
    private JsonObject mI18NUsageInfos;
    @SerializedName("i18n_descriptions")
    private JsonObject mI18nAppDescriptions;
    @SerializedName("i18n_names")
    private JsonObject mI18nAppNames;
    @SerializedName("i18n_bot_inviter_name")
    private JsonObject mI18nBotInviterName;
    @SerializedName("i18n_clause_urls")
    private JsonObject mI18nClauseUrl;
    @SerializedName("i18n_developer_info")
    private JsonObject mI18nDeveloperName;
    @SerializedName("i18n_help_file")
    private JsonObject mI18nHelpFiles;
    @SerializedName("i18n_privacy_urls")
    private JsonObject mI18nPrivacyUrl;
    @SerializedName("is_oncall")
    private boolean mIsOncall;
    @SerializedName("notification_type")
    private int mNotificationType;
    @SerializedName("oncall_id")
    private String mOnCallId;
    @SerializedName("privacy_url")
    private String mPrivacyUrl;
    @SerializedName(UpdateKey.STATUS)
    private int mStatus;
    @SerializedName("directions")
    private String mUsageInfo;
    @SerializedName("open_feedback")
    private boolean openFeedback;

    public enum AppSceneType {
        OWN(0),
        ISV(1),
        ISV_PERSONAL(2);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static AppSceneType getSource(int i) {
            if (i == 0) {
                return OWN;
            }
            if (i == 1) {
                return ISV;
            }
            if (i != 2) {
                return null;
            }
            return ISV_PERSONAL;
        }

        private AppSceneType(int i) {
            this.value = i;
        }
    }

    public enum ChatType {
        SUPPORT_PRICHAT_AND_INTERACTIVE(1),
        SUPPORT_PRICHAT_AND_JUST_NOTIFY(2),
        UNSUPPORT_PRICHAT(3),
        UNSUPPORT_PRICHAT_AND_HAS_HISTORY(4);
        
        int value;

        public int getValue() {
            return this.value;
        }

        public boolean canInteract() {
            if (this == SUPPORT_PRICHAT_AND_INTERACTIVE) {
                return true;
            }
            return false;
        }

        public boolean canOpenChat() {
            if (this != UNSUPPORT_PRICHAT) {
                return true;
            }
            return false;
        }

        public boolean hasHistory() {
            if (this == UNSUPPORT_PRICHAT_AND_HAS_HISTORY) {
                return true;
            }
            return false;
        }

        public static ChatType getSource(int i) {
            if (i == 1) {
                return SUPPORT_PRICHAT_AND_INTERACTIVE;
            }
            if (i == 2) {
                return SUPPORT_PRICHAT_AND_JUST_NOTIFY;
            }
            if (i == 3) {
                return UNSUPPORT_PRICHAT;
            }
            if (i != 4) {
                return UNSUPPORT_PRICHAT;
            }
            return UNSUPPORT_PRICHAT_AND_HAS_HISTORY;
        }

        private ChatType(int i) {
            this.value = i;
        }
    }

    public enum NotificationType {
        UNSUPPORT(0),
        ON(1),
        OFF(2);
        
        private int value;

        public int getValue() {
            return this.value;
        }

        public static NotificationType getSource(int i) {
            if (i == 0) {
                return UNSUPPORT;
            }
            if (i == 1) {
                return ON;
            }
            if (i != 2) {
                return UNSUPPORT;
            }
            return OFF;
        }

        private NotificationType(int i) {
            this.value = i;
        }
    }

    public String getAppId() {
        return this.mAppId;
    }

    public int getAppType() {
        return this.mAppType;
    }

    public String getAppUrl() {
        return this.mAppUrl;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getAvatarKey() {
        return this.mAvatarKey;
    }

    public String getAvatarUrl() {
        return this.mAvatarUrl;
    }

    public String getBotId() {
        return this.mBotId;
    }

    public String getBotInviterId() {
        return this.mBotInviterId;
    }

    public String getDeveloperId() {
        return this.mDeveloperId;
    }

    public JsonObject getI18nAppDescriptions() {
        return this.mI18nAppDescriptions;
    }

    public JsonObject getI18nAppNames() {
        return this.mI18nAppNames;
    }

    public JsonObject getI18nDeveloperName() {
        return this.mI18nDeveloperName;
    }

    public JsonObject getI18nHelpFiles() {
        return this.mI18nHelpFiles;
    }

    public String getOnCallId() {
        return this.mOnCallId;
    }

    public boolean isCanApplyVisibility() {
        return this.canApplyVisibility;
    }

    public boolean isChatable() {
        return this.mChatable;
    }

    public boolean isOncall() {
        return this.mIsOncall;
    }

    public boolean isOpenFeedback() {
        return this.openFeedback;
    }

    public AppSceneType getAppSceneType() {
        return AppSceneType.getSource(this.mAppSceneType);
    }

    public ChatType getChatType() {
        return ChatType.getSource(this.mChatType);
    }

    public Status getStatus() {
        return Status.fromValue(this.mStatus);
    }

    public NotificationType getmNotificationType() {
        return NotificationType.getSource(this.mNotificationType);
    }

    public boolean hasBot() {
        if ((this.mAppType & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasH5() {
        if ((this.mAppType & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean hasMicroApp() {
        if ((this.mAppType & 1) != 0) {
            return true;
        }
        return false;
    }

    public String getAppDescription() {
        String str;
        if (this.mI18nAppDescriptions == null || C27548m.m100547m().mo98218b() == null) {
            str = null;
        } else {
            str = C28183g.m103241a(this.mI18nAppDescriptions);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.mAppDescription;
    }

    public String getAppHelpFile() {
        String str;
        if (this.mI18nHelpFiles == null || C27548m.m100547m().mo98218b() == null) {
            str = null;
        } else {
            str = C28183g.m103241a(this.mI18nHelpFiles);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.mHelpFile;
    }

    public String getAppName() {
        String str;
        if (this.mI18nAppNames == null || C27548m.m100547m().mo98218b() == null) {
            str = null;
        } else {
            str = C28183g.m103241a(this.mI18nAppNames);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.mAppName;
    }

    public String getBotInviterName() {
        String str;
        if (this.mI18nBotInviterName == null || C27548m.m100547m().mo98218b() == null) {
            str = null;
        } else {
            str = C28183g.m103241a(this.mI18nBotInviterName);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.mBotInviterName;
    }

    public String getClauseUrl() {
        String str;
        if (this.mI18nClauseUrl == null || C27548m.m100547m().mo98218b() == null) {
            str = null;
        } else {
            str = C28183g.m103241a(this.mI18nClauseUrl);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.mClauseUrl;
    }

    public String getDeveloperName() {
        String str;
        if (this.mI18nDeveloperName == null || C27548m.m100547m().mo98218b() == null) {
            str = null;
        } else {
            str = C28183g.m103241a(this.mI18nDeveloperName);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.mDeveloperName;
    }

    public String getPrivacyUrl() {
        String str;
        if (this.mI18nPrivacyUrl == null || C27548m.m100547m().mo98218b() == null) {
            str = null;
        } else {
            str = C28183g.m103241a(this.mI18nPrivacyUrl);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.mPrivacyUrl;
    }

    public String getUsageInfo() {
        String str;
        if (this.mI18NUsageInfos == null || C27548m.m100547m().mo98218b() == null) {
            str = null;
        } else {
            str = C28183g.m103241a(this.mI18NUsageInfos);
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return this.mUsageInfo;
    }

    public void setAppDescription(String str) {
        this.mAppDescription = str;
    }

    public void setAppId(String str) {
        this.mAppId = str;
    }

    public void setAppName(String str) {
        this.mAppName = str;
    }

    public void setAppSceneType(int i) {
        this.mAppSceneType = i;
    }

    public void setAppType(int i) {
        this.mAppType = i;
    }

    public void setAvatarKey(String str) {
        this.mAvatarKey = str;
    }

    public void setBotId(String str) {
        this.mBotId = str;
    }

    public void setBotInviterId(String str) {
        this.mBotInviterId = str;
    }

    public void setBotInviterName(String str) {
        this.mBotInviterName = str;
    }

    public void setChatType(int i) {
        this.mChatType = i;
    }

    public void setDeveloperName(String str) {
        this.mDeveloperName = str;
    }

    public void setHelpFile(String str) {
        this.mHelpFile = str;
    }

    public void setI18nAppDescriptions(JsonObject jsonObject) {
        this.mI18nAppDescriptions = jsonObject;
    }

    public void setI18nAppNames(JsonObject jsonObject) {
        this.mI18nAppNames = jsonObject;
    }

    public void setI18nDeveloperName(JsonObject jsonObject) {
        this.mI18nDeveloperName = jsonObject;
    }

    public void setI18nHelpFiles(JsonObject jsonObject) {
        this.mI18nHelpFiles = jsonObject;
    }

    public void setOnCallId(String str) {
        this.mOnCallId = str;
    }

    public void setOncall(boolean z) {
        this.mIsOncall = z;
    }

    public void setOpenFeedback(boolean z) {
        this.openFeedback = z;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public void setUsageInfo(String str) {
        this.mUsageInfo = str;
    }

    public void setmNotificationType(int i) {
        this.mNotificationType = i;
    }
}

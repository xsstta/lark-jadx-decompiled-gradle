package com.ss.android.lark.maincore.dto;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.Objects;

public class TabAppInfo {
    private String appType;
    private Extra extra;
    @JSONField(name = "ID")
    private String id;
    private String key;
    private Logo logo;
    private Name name;
    private boolean primaryOnly;
    private boolean unmovable;

    public static class Extra {
        @JSONField(name = "app_id")
        private String appID;
        @JSONField(name = "mobile_url")
        private String url;

        public String getAppID() {
            return this.appID;
        }

        public String getUrl() {
            return this.url;
        }

        public void setAppID(String str) {
            this.appID = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public static class Logo {
        @JSONField(name = "primary_color_png")
        private String primaryColorPng;
        @JSONField(name = "primary_default")
        private String primaryDefault;
        @JSONField(name = "primary_selected")
        private String primarySelected;
        @JSONField(name = "secretary_bgcolor")
        private String secretaryBgColor;
        @JSONField(name = "secretary_default")
        private String secretaryDefault;

        public String getPrimaryColorPng() {
            return this.primaryColorPng;
        }

        public String getPrimaryDefault() {
            return this.primaryDefault;
        }

        public String getPrimarySelected() {
            return this.primarySelected;
        }

        public String getSecretaryBgColor() {
            return this.secretaryBgColor;
        }

        public String getSecretaryDefault() {
            return this.secretaryDefault;
        }

        public void setPrimaryColorPng(String str) {
            this.primaryColorPng = str;
        }

        public void setPrimaryDefault(String str) {
            this.primaryDefault = str;
        }

        public void setPrimarySelected(String str) {
            this.primarySelected = str;
        }

        public void setSecretaryBgColor(String str) {
            this.secretaryBgColor = str;
        }

        public void setSecretaryDefault(String str) {
            this.secretaryDefault = str;
        }
    }

    public static class Name {
        @JSONField(name = "zh_cn")
        private String cn;
        @JSONField(name = "ja_jp")

        /* renamed from: jp  reason: collision with root package name */
        private String f175452jp;
        @JSONField(name = "en_us")
        private String us;

        public String getCn() {
            return this.cn;
        }

        public String getJp() {
            return this.f175452jp;
        }

        public String getUs() {
            return this.us;
        }

        public void setCn(String str) {
            this.cn = str;
        }

        public void setJp(String str) {
            this.f175452jp = str;
        }

        public void setUs(String str) {
            this.us = str;
        }
    }

    public TabAppInfo() {
    }

    public String getAppType() {
        return this.appType;
    }

    public Extra getExtra() {
        return this.extra;
    }

    public String getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public Logo getLogo() {
        return this.logo;
    }

    public Name getName() {
        return this.name;
    }

    public boolean isPrimaryOnly() {
        return this.primaryOnly;
    }

    public boolean isUnmovable() {
        return this.unmovable;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.appType);
    }

    public void setAppType(String str) {
        this.appType = str;
    }

    public void setExtra(Extra extra2) {
        this.extra = extra2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLogo(Logo logo2) {
        this.logo = logo2;
    }

    public void setName(Name name2) {
        this.name = name2;
    }

    public void setPrimaryOnly(boolean z) {
        this.primaryOnly = z;
    }

    public void setUnmovable(boolean z) {
        this.unmovable = z;
    }

    public TabAppInfo(String str) {
        this.key = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TabAppInfo tabAppInfo = (TabAppInfo) obj;
        if (!Objects.equals(this.key, tabAppInfo.key) || !Objects.equals(this.appType, tabAppInfo.appType)) {
            return false;
        }
        return true;
    }
}

package com.tt.refer.impl.business.meta;

import com.tt.refer.common.meta.base.AbsMetaLoadEntity;

public class GadgetSchema {

    /* renamed from: com.tt.refer.impl.business.meta.GadgetSchema$Entity */
    public static class C67943Entity extends AbsMetaLoadEntity {
        private String icon;
        private String launchActionAbility;
        private String launchQuery;
        private String name;
        private String scene;
        private String shareTicket;
        private String startPage;
        private String subScene;
        private String token;

        public String getIcon() {
            return this.icon;
        }

        public String getLaunchActionAbility() {
            return this.launchActionAbility;
        }

        public String getLaunchQuery() {
            return this.launchQuery;
        }

        public String getName() {
            return this.name;
        }

        public String getScene() {
            return this.scene;
        }

        public String getShareTicket() {
            return this.shareTicket;
        }

        public String getStartPage() {
            return this.startPage;
        }

        public String getSubScene() {
            return this.subScene;
        }

        public String getToken() {
            return this.token;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(" Entity->");
            stringBuffer.append("appId:");
            stringBuffer.append(this.appId);
            stringBuffer.append("versionType:");
            stringBuffer.append(this.versionType);
            return stringBuffer.toString();
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setLaunchActionAbility(String str) {
            this.launchActionAbility = str;
        }

        public void setLaunchQuery(String str) {
            this.launchQuery = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setScene(String str) {
            this.scene = str;
        }

        public void setShareTicket(String str) {
            this.shareTicket = str;
        }

        public void setStartPage(String str) {
            this.startPage = str;
        }

        public void setSubScene(String str) {
            this.subScene = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        public C67943Entity(String str) {
            this.appId = str;
            setIdentifier(str);
        }
    }
}

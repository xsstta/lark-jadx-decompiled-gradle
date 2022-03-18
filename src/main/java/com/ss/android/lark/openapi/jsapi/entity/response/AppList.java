package com.ss.android.lark.openapi.jsapi.entity.response;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import java.util.List;

public class AppList implements BaseJSModel {
    List<AppCategory> appCategories;
    List<AppInfo> appInfos;
    List<String> frequencyAppIds;

    public static final class AppCategory implements BaseJSModel {
        String description;
        String id;
        String name;
        int weight;

        public AppCategory() {
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

        public int getWeight() {
            return this.weight;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setWeight(int i) {
            this.weight = i;
        }

        public AppCategory(String str, String str2, int i, String str3) {
            this.id = str;
            this.name = str2;
            this.weight = i;
            this.description = str3;
        }
    }

    public static final class AppInfo implements BaseJSModel {
        String categoryId;
        String description;
        String icon;
        String iconKey;
        String id;
        String name;
        String url;
        int weight;

        public AppInfo() {
        }

        public String getCategoryId() {
            return this.categoryId;
        }

        public String getDescription() {
            return this.description;
        }

        public String getIcon() {
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

        public String getUrl() {
            return this.url;
        }

        public int getWeight() {
            return this.weight;
        }

        public void setCategoryId(String str) {
            this.categoryId = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setIcon(String str) {
            this.icon = str;
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

        public void setUrl(String str) {
            this.url = str;
        }

        public void setWeight(int i) {
            this.weight = i;
        }

        public AppInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
            this.id = str;
            this.categoryId = str2;
            this.iconKey = str3;
            this.icon = str4;
            this.name = str5;
            this.url = str6;
            this.weight = i;
            this.description = str7;
        }
    }

    public AppList() {
    }

    public List<AppCategory> getAppCategories() {
        return this.appCategories;
    }

    public List<AppInfo> getAppInfos() {
        return this.appInfos;
    }

    public List<String> getFrequencyAppIds() {
        return this.frequencyAppIds;
    }

    public void setAppCategories(List<AppCategory> list) {
        this.appCategories = list;
    }

    public void setAppInfos(List<AppInfo> list) {
        this.appInfos = list;
    }

    public void setFrequencyAppIds(List<String> list) {
        this.frequencyAppIds = list;
    }

    public AppList(List<AppInfo> list, List<AppCategory> list2, List<String> list3) {
        this.appInfos = list;
        this.appCategories = list2;
        this.frequencyAppIds = list3;
    }
}

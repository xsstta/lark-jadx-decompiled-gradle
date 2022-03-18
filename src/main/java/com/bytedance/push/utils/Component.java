package com.bytedance.push.utils;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

public class Component {
    public String authorities;
    public List<IntentFilter> intentFilter = new ArrayList();
    public String name;
    public String permission;
    public String processName;

    public static class Builder {
        private Component component;

        public Component build() {
            return this.component;
        }

        public static Builder create(String str) {
            return new Builder(str);
        }

        public Builder setAuthorities(String str) {
            this.component.authorities = str;
            return this;
        }

        public Builder setPermission(String str) {
            this.component.permission = str;
            return this;
        }

        public Builder setProcess(String str) {
            this.component.processName = str;
            return this;
        }

        public Builder(String str) {
            this.component = new Component(str);
        }

        public Builder addIntentFilter(IntentFilter intentFilter) {
            if (intentFilter == null) {
                return this;
            }
            this.component.intentFilter.add(intentFilter);
            return this;
        }
    }

    public static class IntentFilter {
        List<String> actions;
        List<String> categories;
        Uri data;
        String mimeType;

        public int hashCode() {
            int i;
            int i2;
            int i3;
            List<String> list = this.actions;
            int i4 = 0;
            if (list != null) {
                i = list.hashCode();
            } else {
                i = 0;
            }
            int i5 = i * 31;
            List<String> list2 = this.categories;
            if (list2 != null) {
                i2 = list2.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            String str = this.mimeType;
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            Uri uri = this.data;
            if (uri != null) {
                i4 = uri.hashCode();
            }
            return i7 + i4;
        }

        public String toString() {
            return "IntentFilter{actions=" + this.actions + ", categories=" + this.categories + ", data=" + this.data + ", mimetype=" + this.mimeType + '}';
        }

        public IntentFilter(List<String> list) {
            this(list, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntentFilter)) {
                return false;
            }
            IntentFilter intentFilter = (IntentFilter) obj;
            List<String> list = this.actions;
            if (list == null ? intentFilter.actions != null : !list.equals(intentFilter.actions)) {
                return false;
            }
            List<String> list2 = this.categories;
            if (list2 == null ? intentFilter.categories != null : !list2.equals(intentFilter.categories)) {
                return false;
            }
            String str = this.mimeType;
            if (str == null ? intentFilter.mimeType != null : !str.equals(intentFilter.mimeType)) {
                return false;
            }
            Uri uri = this.data;
            Uri uri2 = intentFilter.data;
            if (uri != null) {
                return uri.equals(uri2);
            }
            if (uri2 == null) {
                return true;
            }
            return false;
        }

        public IntentFilter(List<String> list, List<String> list2) {
            this.actions = list;
            this.categories = list2;
        }

        public IntentFilter(List<String> list, List<String> list2, Uri uri) {
            this.actions = list;
            this.categories = list2;
            this.data = uri;
        }

        public IntentFilter(List<String> list, List<String> list2, String str) {
            this.actions = list;
            this.categories = list2;
            this.mimeType = str;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        List<IntentFilter> list = this.intentFilter;
        int i5 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str = this.name;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str2 = this.processName;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str3 = this.permission;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str4 = this.authorities;
        if (str4 != null) {
            i5 = str4.hashCode();
        }
        return i9 + i5;
    }

    public String toString() {
        return "Component{name='" + this.name + '\'' + ", intentFilter=" + this.intentFilter + ", processName='" + this.processName + '\'' + ", permission='" + this.permission + '\'' + ", authorities='" + this.authorities + '\'' + '}';
    }

    public Component(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Component)) {
            return false;
        }
        Component component = (Component) obj;
        List<IntentFilter> list = this.intentFilter;
        if (list == null ? component.intentFilter != null : !list.equals(component.intentFilter)) {
            return false;
        }
        String str = this.name;
        if (str == null ? component.name != null : !str.equals(component.name)) {
            return false;
        }
        String str2 = this.processName;
        if (str2 == null ? component.processName != null : !str2.equals(component.processName)) {
            return false;
        }
        String str3 = this.permission;
        if (str3 == null ? component.permission != null : !str3.equals(component.permission)) {
            return false;
        }
        String str4 = this.authorities;
        String str5 = component.authorities;
        if (str4 == null ? str5 == null : str4.equals(str5)) {
            return true;
        }
        return false;
    }

    private static boolean equalsInternal(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}

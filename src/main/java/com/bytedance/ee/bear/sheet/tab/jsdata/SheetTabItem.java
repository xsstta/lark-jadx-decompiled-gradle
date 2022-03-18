package com.bytedance.ee.bear.sheet.tab.jsdata;

import android.text.TextUtils;
import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

public class SheetTabItem implements NonProguard {
    private CustomIcon customIcon;
    private boolean enabled;
    private boolean hidden;
    private String id;
    private boolean locked;
    private String name;
    private boolean selected;

    public static class CustomIcon implements NonProguard {
        private String selectedUrl;
        private int type;
        private String unselectedUrl;

        @Retention(RetentionPolicy.SOURCE)
        public @interface CustomIconType {
        }

        public String getSelectedUrl() {
            return this.selectedUrl;
        }

        public int getType() {
            return this.type;
        }

        public String getUnselectedUrl() {
            return this.unselectedUrl;
        }

        public boolean isValidIconUrl() {
            if (TextUtils.isEmpty(this.selectedUrl) || TextUtils.isEmpty(this.unselectedUrl)) {
                return false;
            }
            return true;
        }

        public void setSelectedUrl(String str) {
            this.selectedUrl = str;
        }

        public void setType(int i) {
            this.type = i;
        }

        public void setUnselectedUrl(String str) {
            this.unselectedUrl = str;
        }
    }

    public CustomIcon getCustomIcon() {
        return this.customIcon;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean getSelected() {
        return this.selected;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public boolean isLocked() {
        return this.locked;
    }

    public SheetTabItem() {
        this(null, null);
    }

    public int hashCode() {
        String str = this.id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.format("SheetTabItem[%s] locked :%s; hidden: %s; selected: %s; enabled: %s", this.id, Boolean.valueOf(this.locked), Boolean.valueOf(this.hidden), Boolean.valueOf(this.selected), Boolean.valueOf(this.enabled));
    }

    public void setCustomIcon(CustomIcon customIcon2) {
        this.customIcon = customIcon2;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setHidden(boolean z) {
        this.hidden = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsSelected(boolean z) {
        setSelected(z);
    }

    public void setLocked(boolean z) {
        this.locked = z;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.id, ((SheetTabItem) obj).id);
    }

    public SheetTabItem(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public static boolean contentEquals(SheetTabItem sheetTabItem, SheetTabItem sheetTabItem2) {
        if (sheetTabItem == null || sheetTabItem2 == null || !TextUtils.equals(sheetTabItem.id, sheetTabItem2.id) || !TextUtils.equals(sheetTabItem.name, sheetTabItem2.name) || sheetTabItem.hidden != sheetTabItem2.hidden || sheetTabItem.locked != sheetTabItem2.locked || sheetTabItem.selected != sheetTabItem2.selected) {
            return false;
        }
        return true;
    }
}

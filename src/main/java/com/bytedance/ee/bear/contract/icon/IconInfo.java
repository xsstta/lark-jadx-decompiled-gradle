package com.bytedance.ee.bear.contract.icon;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Objects;

public class IconInfo implements NonProguard {
    private String fs_unit;
    private Integer id;
    private String key;
    private int type;

    public String getFs_unit() {
        return this.fs_unit;
    }

    public Integer getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.key, Integer.valueOf(this.type), this.fs_unit);
    }

    public String toString() {
        return "IconInfo{id=" + this.id + ", key='" + this.key + '\'' + ", type=" + this.type + ", fs_unit='" + this.fs_unit + '\'' + '}';
    }

    public void setFs_unit(String str) {
        this.fs_unit = str;
    }

    public void setId(Integer num) {
        this.id = num;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public static boolean isEmpty(IconInfo iconInfo) {
        if (iconInfo == null || iconInfo.key == null || iconInfo.fs_unit == null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IconInfo iconInfo = (IconInfo) obj;
        if (this.type != iconInfo.type || !Objects.equals(this.id, iconInfo.id) || !Objects.equals(this.key, iconInfo.key) || !Objects.equals(this.fs_unit, iconInfo.fs_unit)) {
            return false;
        }
        return true;
    }
}

package com.bytedance.ee.bear.document.more;

import android.text.TextUtils;
import com.bytedance.ee.bear.TableSimpleInfo;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.Arrays;

public class MoreModel implements NonProguard {
    private String[] badges;
    private Bitable bitable;
    private String[] disables;
    private String[] invisibles;

    public static class Bitable implements NonProguard {
        private boolean isPro;
        private ArrayList<TableSimpleInfo> tables;

        public boolean isPro() {
            return this.isPro;
        }

        public ArrayList<TableSimpleInfo> getTables() {
            ArrayList<TableSimpleInfo> arrayList = this.tables;
            if (arrayList == null) {
                return new ArrayList<>();
            }
            return arrayList;
        }

        public void setPro(boolean z) {
            this.isPro = z;
        }

        public void setTables(ArrayList<TableSimpleInfo> arrayList) {
            this.tables = arrayList;
        }
    }

    public String[] getBadges() {
        return this.badges;
    }

    public String[] getDisables() {
        return this.disables;
    }

    public String[] getInvisibles() {
        return this.invisibles;
    }

    public Bitable getBitable() {
        Bitable bitable2 = this.bitable;
        if (bitable2 == null) {
            return new Bitable();
        }
        return bitable2;
    }

    public String toString() {
        return "MoreData{badges=" + Arrays.toString(this.badges) + ", disable=" + Arrays.toString(this.disables) + '}';
    }

    public void setBadges(String[] strArr) {
        this.badges = strArr;
    }

    public void setBitable(Bitable bitable2) {
        this.bitable = bitable2;
    }

    public void setDisables(String[] strArr) {
        this.disables = strArr;
    }

    public void setInvisibles(String[] strArr) {
        this.invisibles = strArr;
    }

    public boolean isItemDisabled(String str) {
        String[] strArr = this.disables;
        if (strArr != null && strArr.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : this.disables) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isItemInvisible(String str) {
        String[] strArr = this.invisibles;
        if (strArr != null && strArr.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : this.invisibles) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean shouldShowBadges(String str) {
        String[] strArr = this.badges;
        if (strArr != null && strArr.length > 0 && !TextUtils.isEmpty(str)) {
            for (String str2 : this.badges) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}

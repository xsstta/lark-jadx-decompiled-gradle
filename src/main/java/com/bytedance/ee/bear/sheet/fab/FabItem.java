package com.bytedance.ee.bear.sheet.fab;

import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

public class FabItem implements NonProguard {
    private FabSheetItem[] data;

    public static class FabSheetItem extends SheetItem {
        private String dateType;
        private String format;
        private String rangeType;

        @Retention(RetentionPolicy.SOURCE)
        @interface CellType {
        }

        public String getDateType() {
            return this.dateType;
        }

        public String getFormat() {
            return this.format;
        }

        public String getRangeType() {
            return this.rangeType;
        }

        @Override // com.bytedance.ee.bear.sheet.panel.SheetItem
        public int hashCode() {
            int i;
            int i2;
            int hashCode = super.hashCode() * 31;
            int i3 = 0;
            if (getFormat() != null) {
                i = getFormat().hashCode();
            } else {
                i = 0;
            }
            int i4 = (hashCode + i) * 31;
            if (getDateType() != null) {
                i2 = getDateType().hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (i4 + i2) * 31;
            if (getRangeType() != null) {
                i3 = getRangeType().hashCode();
            }
            return i5 + i3;
        }

        @Override // com.bytedance.ee.bear.sheet.panel.SheetItem
        public String toString() {
            return "FabSheetItem{format='" + this.format + '\'' + ", dateType='" + this.dateType + '\'' + ", rangeType='" + this.rangeType + '\'' + '}';
        }

        public void setDateType(String str) {
            this.dateType = str;
        }

        public void setFormat(String str) {
            this.format = str;
        }

        public void setRangeType(String str) {
            this.rangeType = str;
        }

        @Override // com.bytedance.ee.bear.sheet.panel.SheetItem
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FabSheetItem) || !super.equals(obj)) {
                return false;
            }
            FabSheetItem fabSheetItem = (FabSheetItem) obj;
            if (getFormat() == null ? fabSheetItem.getFormat() != null : !getFormat().equals(fabSheetItem.getFormat())) {
                return false;
            }
            if (getDateType() == null ? fabSheetItem.getDateType() != null : !getDateType().equals(fabSheetItem.getDateType())) {
                return false;
            }
            if (getRangeType() != null) {
                return getRangeType().equals(fabSheetItem.getRangeType());
            }
            if (fabSheetItem.getRangeType() == null) {
                return true;
            }
            return false;
        }
    }

    public FabSheetItem[] getData() {
        return this.data;
    }

    public int hashCode() {
        return Arrays.hashCode(getData());
    }

    public void setData(FabSheetItem[] fabSheetItemArr) {
        this.data = fabSheetItemArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FabItem)) {
            return false;
        }
        return Arrays.equals(getData(), ((FabItem) obj).getData());
    }
}

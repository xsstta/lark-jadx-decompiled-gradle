package com.bytedance.ee.bear.sheet.inputbar.editor;

import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.SegmentStyle;
import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SheetInputData implements NonProguard {
    private InputData data;
    private boolean hideFAB;
    private SheetToolbarItem[] toolbarItems;

    public static class InputData implements NonProguard {
        private String dateType;
        private String format;
        private List<BaseSegment> segments;
        private SegmentStyle style;
        private String value;

        @Retention(RetentionPolicy.SOURCE)
        public @interface DateType {
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface FormatType {
        }

        public String getDateType() {
            return this.dateType;
        }

        public String getFormat() {
            return this.format;
        }

        public List<BaseSegment> getSegments() {
            return this.segments;
        }

        public SegmentStyle getStyle() {
            return this.style;
        }

        public String getValue() {
            return this.value;
        }

        public String toString() {
            return "InputData{format='" + this.format + '\'' + ", dateType='" + this.dateType + '\'' + ", segments=" + this.segments + ", style=" + this.style + '}';
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            if (getFormat() != null) {
                i = getFormat().hashCode();
            } else {
                i = 0;
            }
            int i5 = i * 31;
            if (getDateType() != null) {
                i2 = getDateType().hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (i5 + i2) * 31;
            if (getSegments() != null) {
                i3 = getSegments().hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            if (getStyle() != null) {
                i4 = getStyle().hashCode();
            }
            return i7 + i4;
        }

        public void setDateType(String str) {
            this.dateType = str;
        }

        public void setFormat(String str) {
            this.format = str;
        }

        public void setSegments(List<BaseSegment> list) {
            this.segments = list;
        }

        public void setStyle(SegmentStyle segmentStyle) {
            this.style = segmentStyle;
        }

        public void setValue(String str) {
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj;
            if (getFormat() == null ? inputData.getFormat() != null : !getFormat().equals(inputData.getFormat())) {
                return false;
            }
            if (getDateType() == null ? inputData.getDateType() != null : !getDateType().equals(inputData.getDateType())) {
                return false;
            }
            if (getSegments() == null ? inputData.getSegments() != null : !getSegments().equals(inputData.getSegments())) {
                return false;
            }
            if (getStyle() != null) {
                return getStyle().equals(inputData.getStyle());
            }
            if (inputData.getStyle() == null) {
                return true;
            }
            return false;
        }
    }

    public static class SheetToolbarItem implements NonProguard {
        private boolean hasSelectedState;
        private String id;
        private boolean isBadged;

        public String getId() {
            return this.id;
        }

        public boolean isBadged() {
            return this.isBadged;
        }

        public boolean isHasSelectedState() {
            return this.hasSelectedState;
        }

        public String toString() {
            return "SheetToolbarItemInfo{id='" + this.id + '\'' + ", hasSelectedState=" + this.hasSelectedState + ", isBadged=" + this.isBadged + '}';
        }

        public void setBadged(boolean z) {
            this.isBadged = z;
        }

        public void setHasSelectedState(boolean z) {
            this.hasSelectedState = z;
        }

        public void setId(String str) {
            this.id = str;
        }
    }

    public InputData getData() {
        return this.data;
    }

    public SheetToolbarItem[] getToolbarItems() {
        return this.toolbarItems;
    }

    public boolean isHideFAB() {
        return this.hideFAB;
    }

    public int hashCode() {
        return Objects.hash(this.data, Boolean.valueOf(this.hideFAB), this.toolbarItems);
    }

    public String toString() {
        return "SheetInputData{data=" + this.data + ", hideFAB=" + this.hideFAB + ", toolbarItems=" + Arrays.toString(this.toolbarItems) + '}';
    }

    public void setData(InputData inputData) {
        this.data = inputData;
    }

    public void setHideFAB(boolean z) {
        this.hideFAB = z;
    }

    public void setToolbarItems(SheetToolbarItem[] sheetToolbarItemArr) {
        this.toolbarItems = sheetToolbarItemArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SheetInputData)) {
            return false;
        }
        SheetInputData sheetInputData = (SheetInputData) obj;
        if (getData() == null ? sheetInputData.getData() == null : getData().equals(sheetInputData.getData())) {
            if (this.hideFAB != sheetInputData.hideFAB || !Arrays.deepEquals(this.toolbarItems, sheetInputData.toolbarItems)) {
                return false;
            }
            return true;
        }
        return false;
    }
}

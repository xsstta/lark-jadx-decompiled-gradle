package com.bytedance.ee.bear.sheet.inputbar.editor;

import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.util.io.NonProguard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public class SheetUpdateData implements NonProguard {
    private String dateType;
    private int editState;
    private String format;
    private List<BaseSegment> newValue;

    @Retention(RetentionPolicy.SOURCE)
    public @interface EditState {
    }

    public String getDateType() {
        return this.dateType;
    }

    public int getEditState() {
        return this.editState;
    }

    public String getFormat() {
        return this.format;
    }

    public List<BaseSegment> getNewValue() {
        return this.newValue;
    }

    public void setDateType(String str) {
        this.dateType = str;
    }

    public void setEditState(int i) {
        this.editState = i;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setNewValue(List<BaseSegment> list) {
        this.newValue = list;
    }

    public SheetUpdateData(int i, List<BaseSegment> list) {
        this.newValue = list;
        this.editState = i;
    }

    public SheetUpdateData(int i, List<BaseSegment> list, String str, String str2) {
        this.newValue = list;
        this.editState = i;
        this.format = str;
        this.dateType = str2;
    }
}

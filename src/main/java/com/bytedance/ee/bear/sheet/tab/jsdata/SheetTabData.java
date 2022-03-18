package com.bytedance.ee.bear.sheet.tab.jsdata;

import com.bytedance.ee.bear.sheet.tab.contract.ISheetTabModel;
import com.bytedance.ee.util.io.NonProguard;
import java.util.ArrayList;
import java.util.List;

public class SheetTabData implements ISheetTabModel, NonProguard {
    private List<SheetTabItem> data;
    private boolean editable;

    public SheetTabData() {
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabModel
    public boolean canEdit() {
        return this.editable;
    }

    public List<SheetTabItem> getData() {
        return this.data;
    }

    public boolean isEditable() {
        return this.editable;
    }

    @Override // com.bytedance.ee.bear.sheet.tab.contract.ISheetTabModel
    public ArrayList<SheetTabItem> getSheetTabData() {
        ArrayList<SheetTabItem> arrayList = new ArrayList<>();
        for (SheetTabItem sheetTabItem : this.data) {
            if (!sheetTabItem.isHidden()) {
                arrayList.add(sheetTabItem);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "SheetTabItems{ items=" + this.data + ", editable=" + this.editable + " }";
    }

    public void setData(List<SheetTabItem> list) {
        this.data = list;
    }

    public void setEditable(boolean z) {
        this.editable = z;
    }

    public SheetTabData(List<SheetTabItem> list) {
        this.data = list;
    }
}

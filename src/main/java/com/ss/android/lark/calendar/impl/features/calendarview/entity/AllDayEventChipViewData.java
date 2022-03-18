package com.ss.android.lark.calendar.impl.features.calendarview.entity;

public class AllDayEventChipViewData extends EventChipViewData {
    private static final long serialVersionUID = 1;
    private int mCol;
    private int mRow;

    public int getCol() {
        return this.mCol;
    }

    public int getRow() {
        return this.mRow;
    }

    public AllDayEventChipViewData(EventChipViewData eventChipViewData) {
        super(eventChipViewData);
    }

    public void setCol(int i) {
        this.mCol = i;
    }

    public void setRow(int i) {
        this.mRow = i;
    }
}

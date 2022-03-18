package com.ss.android.lark.calendar.impl.features.calendarview.entity;

public class MonthEventChipViewData extends ListEventChipViewData {
    private static final long serialVersionUID = 1;
    private int colum;
    private boolean hasDrawnMask;
    private int row;

    public int getColum() {
        return this.colum;
    }

    public int getRow() {
        return this.row;
    }

    public boolean isHasDrawnMask() {
        return this.hasDrawnMask;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.entity.ListEventChipViewData, com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData
    public String getEventTitle() {
        return getEventTitleActual();
    }

    public String getEventTitleForDayInstance() {
        return super.getEventTitle();
    }

    public MonthEventChipViewData(EventChipViewData eventChipViewData) {
        super(eventChipViewData);
    }

    public void setColum(int i) {
        this.colum = i;
    }

    public void setHasDrawnMask(boolean z) {
        this.hasDrawnMask = z;
    }

    public void setRow(int i) {
        this.row = i;
    }
}

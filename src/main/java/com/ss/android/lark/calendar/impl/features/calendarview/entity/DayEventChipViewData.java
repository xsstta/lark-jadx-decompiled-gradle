package com.ss.android.lark.calendar.impl.features.calendarview.entity;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.InstanceLayout;

public class DayEventChipViewData extends EventChipViewData {
    private static final long serialVersionUID = 1;
    private InstanceLayout layout;
    private boolean mIsSupportDrag;

    public InstanceLayout getLayout() {
        return this.layout;
    }

    public boolean isSupportDrag() {
        if (!this.mIsSupportDrag || !isEditable()) {
            return false;
        }
        return true;
    }

    public DayEventChipViewData(EventChipViewData eventChipViewData) {
        super(eventChipViewData);
    }

    public void setIsSupportDrag(boolean z) {
        this.mIsSupportDrag = z;
    }

    public void setLayout(InstanceLayout instanceLayout) {
        this.layout = instanceLayout;
    }
}

package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;
import java.util.List;

public class SearchMeetingRoom implements Serializable {
    List<CalendarBuilding> buildings;
    boolean hasMore;

    public List<CalendarBuilding> getBuildings() {
        return this.buildings;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setBuildings(List<CalendarBuilding> list) {
        this.buildings = list;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }
}

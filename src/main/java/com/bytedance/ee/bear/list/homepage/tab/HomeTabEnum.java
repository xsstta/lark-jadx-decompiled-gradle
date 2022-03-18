package com.bytedance.ee.bear.list.homepage.tab;

public enum HomeTabEnum {
    RECENT(0),
    PIN(1),
    MANUAL_OFFLINE(2),
    FAVORITE(3),
    MY_SPACE(4),
    SHARED_SPACE(5);
    
    public int id;

    private HomeTabEnum(int i) {
        this.id = i;
    }
}

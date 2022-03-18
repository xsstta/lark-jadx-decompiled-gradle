package com.bytedance.ee.bear.list.homepage.navigation;

public enum NavigationEnum {
    MY_SPACE(1),
    SHARED_SPACE(2),
    WIKI(3),
    FAVORITE(4),
    MANUAL_OFFLINE(5),
    TEMPLATE(6),
    TODO(7);
    
    public int id;

    private NavigationEnum(int i) {
        this.id = i;
    }
}

package com.ss.android.lark.feed.app.menu.entity;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.lark.feed.app.entity.IBadgeable;

public class MenuItem implements IBadgeable, Comparable<MenuItem> {

    /* renamed from: a */
    public MenuType f96555a;

    /* renamed from: b */
    public int f96556b;

    public enum MenuType {
        INBOX(1),
        DONE(2),
        CONTACT(3),
        NULL(4),
        FILTER_ALL(100),
        FILTER_MESSAGE(101),
        FILTER_DOC(103),
        FILTER_THREAD(104),
        FILTER_SECRET(CommonCode.StatusCode.API_CLIENT_EXPIRED),
        FILTER_CROSS_TENANT(1002);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public MenuType valueOf(int i) {
            return forNumber(i);
        }

        public MenuType forNumber(int i) {
            if (i == 1) {
                return INBOX;
            }
            if (i == 2) {
                return DONE;
            }
            if (i == 3) {
                return CONTACT;
            }
            if (i == 100) {
                return FILTER_ALL;
            }
            if (i == 101) {
                return FILTER_MESSAGE;
            }
            if (i == 103) {
                return FILTER_DOC;
            }
            if (i == 104) {
                return FILTER_THREAD;
            }
            if (i == 1001) {
                return FILTER_SECRET;
            }
            if (i != 1002) {
                return null;
            }
            return FILTER_CROSS_TENANT;
        }

        private MenuType(int i) {
            this.value = i;
        }
    }

    @Override // com.ss.android.lark.feed.app.entity.IBadgeable
    public int getBadgeCount() {
        return this.f96556b;
    }

    @Override // com.ss.android.lark.feed.app.entity.IBadgeable
    public boolean isRemind() {
        if (this.f96556b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(MenuItem menuItem) {
        MenuType menuType = menuItem.f96555a;
        MenuType menuType2 = this.f96555a;
        if (menuType == menuType2) {
            return 0;
        }
        if (menuType2.getNumber() < menuItem.f96555a.getNumber()) {
            return -1;
        }
        return 1;
    }

    public MenuItem(MenuType menuType, int i) {
        this.f96556b = i;
        this.f96555a = menuType;
    }
}

package com.ss.android.lark.feed.app.banner.base;

import com.ss.android.lark.feed.app.banner.base.C37316a;

public interface IBanner<T extends C37316a> {
    /* renamed from: a */
    BannerStyle mo137155a();

    /* renamed from: b */
    boolean mo137156b();

    /* renamed from: c */
    AbstractC37317b<T> mo137157c();

    /* renamed from: d */
    AbstractC37318c<T> mo137158d();

    public enum BannerStyle {
        UNKNOWN("Unknown", -1),
        NONE("None", 0),
        NOTIFICATION_OPEN_TIP("Notification_OPNE_TIP", 1);
        
        private String name;
        private int priority;

        public String getName() {
            return this.name;
        }

        public int getPriority() {
            return this.priority;
        }

        public static BannerStyle forNumber(int i) {
            if (i == -1) {
                return UNKNOWN;
            }
            if (i == 0) {
                return NONE;
            }
            if (i != 1) {
                return UNKNOWN;
            }
            return NOTIFICATION_OPEN_TIP;
        }

        private BannerStyle(String str, int i) {
            this.name = str;
            this.priority = i;
        }
    }
}

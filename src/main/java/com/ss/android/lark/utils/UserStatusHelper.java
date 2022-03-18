package com.ss.android.lark.utils;

import com.larksuite.suite.R;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserStatusHelper {

    /* renamed from: a */
    private static volatile UserStatusHelper f142253a;

    /* renamed from: b */
    private Map<Type, Integer> f142254b = new ConcurrentHashMap();

    public enum Type {
        DEFAULT(0),
        BUSINESS(1),
        LEAVE(2),
        MEETING(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return DEFAULT;
            }
            if (i == 1) {
                return BUSINESS;
            }
            if (i == 2) {
                return LEAVE;
            }
            if (i == 3) {
                return MEETING;
            }
            return null;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public static UserStatusHelper m224138a() {
        if (f142253a == null) {
            synchronized (UserStatusHelper.class) {
                if (f142253a == null) {
                    f142253a = new UserStatusHelper();
                }
            }
        }
        return f142253a;
    }

    /* renamed from: b */
    private synchronized void m224139b() {
        if (this.f142254b.isEmpty()) {
            this.f142254b.put(Type.DEFAULT, Integer.valueOf((int) R.drawable.ud_icon_chat_news_outlined));
            this.f142254b.put(Type.BUSINESS, Integer.valueOf((int) R.drawable.ud_icon_status_trip_outlined));
            this.f142254b.put(Type.LEAVE, Integer.valueOf((int) R.drawable.ud_icon_status_vacation_outlined));
            this.f142254b.put(Type.MEETING, Integer.valueOf((int) R.drawable.ud_icon_status_meeting_outlined));
        }
    }

    /* renamed from: a */
    public int mo195998a(int i) {
        m224139b();
        Integer num = this.f142254b.get(Type.forNumber(i));
        if (num != null) {
            return num.intValue();
        }
        return this.f142254b.get(Type.DEFAULT).intValue();
    }
}

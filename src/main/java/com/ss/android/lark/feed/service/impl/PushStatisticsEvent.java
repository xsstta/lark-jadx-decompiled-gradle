package com.ss.android.lark.feed.service.impl;

import java.util.Map;

public class PushStatisticsEvent {

    /* renamed from: a */
    private Type f97755a;

    /* renamed from: b */
    private Map<String, C38122a> f97756b;

    public enum Type {
        UNKNOWN(0),
        BOX(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i != 1) {
                return null;
            }
            return BOX;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public Type mo139451a() {
        return this.f97755a;
    }

    /* renamed from: b */
    public Map<String, C38122a> mo139452b() {
        return this.f97756b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder(64);
        sb.append("{\n");
        sb.append("  type = ");
        sb.append(this.f97755a);
        sb.append(" ,\n");
        Map<String, C38122a> map = this.f97756b;
        if (map == null) {
            sb.append("  BoxDataMap = null \n");
        } else {
            for (String str2 : map.keySet()) {
                if (this.f97756b.get(str2) != null) {
                    str = String.valueOf(this.f97756b.get(str2).f97757a);
                } else {
                    str = "BoxData is Null";
                }
                sb.append("  [ box id = ");
                sb.append(str2);
                sb.append(" , count = " + str + " ]\n");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: com.ss.android.lark.feed.service.impl.PushStatisticsEvent$a */
    public static class C38122a {

        /* renamed from: a */
        public final long f97757a;

        public C38122a(long j) {
            this.f97757a = j;
        }
    }

    public PushStatisticsEvent(Type type, Map<String, C38122a> map) {
        this.f97755a = type;
        this.f97756b = map;
    }
}

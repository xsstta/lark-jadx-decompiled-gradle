package com.ss.android.vc.entity;

public class LiveBindingData {

    /* renamed from: com.ss.android.vc.entity.LiveBindingData$a */
    public static class C60922a {

        /* renamed from: a */
        public BindingType f152448a;

        /* renamed from: b */
        public String f152449b;

        /* renamed from: c */
        public String f152450c;

        /* renamed from: d */
        public String f152451d;

        /* renamed from: e */
        public Boolean f152452e;

        /* renamed from: f */
        public String f152453f;

        /* renamed from: g */
        public String f152454g;

        /* renamed from: h */
        public String f152455h;
    }

    /* renamed from: com.ss.android.vc.entity.LiveBindingData$b */
    public static class C60923b {

        /* renamed from: a */
        public BindingType f152456a;

        /* renamed from: b */
        public String f152457b;

        /* renamed from: c */
        public String f152458c;

        /* renamed from: d */
        public String f152459d;

        /* renamed from: e */
        public String f152460e;

        /* renamed from: f */
        public Boolean f152461f;

        /* renamed from: g */
        public String f152462g;

        /* renamed from: h */
        public String f152463h;
    }

    public enum BindingType {
        UNKNOWN(0),
        DOUYIN(1),
        XIGUA(2),
        FACEBOOK(3),
        YOUTUBE(4);
        
        public Boolean deprecated = this.deprecated;
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static BindingType fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return DOUYIN;
            }
            if (i == 2) {
                return XIGUA;
            }
            if (i == 3) {
                return FACEBOOK;
            }
            if (i != 4) {
                return null;
            }
            return YOUTUBE;
        }

        private BindingType(int i) {
            this.value = i;
        }
    }
}

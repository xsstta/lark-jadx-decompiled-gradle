package com.ss.android.lark.biz.core.api.resource;

public class ResourceRequestBaseSet {

    /* renamed from: a */
    protected Type f74018a = Type.BASE;

    /* renamed from: b */
    String f74019b;

    /* renamed from: c */
    String f74020c;

    public enum Type {
        BASE(0),
        AVATAR(1);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 0) {
                return BASE;
            }
            if (i != 1) {
                return BASE;
            }
            return AVATAR;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public String mo105854a() {
        return this.f74019b;
    }

    /* renamed from: b */
    public String mo105855b() {
        return this.f74020c;
    }

    /* renamed from: c */
    public Type mo105856c() {
        return this.f74018a;
    }

    public ResourceRequestBaseSet(String str, String str2) {
        this.f74019b = str;
        this.f74020c = str2;
    }
}

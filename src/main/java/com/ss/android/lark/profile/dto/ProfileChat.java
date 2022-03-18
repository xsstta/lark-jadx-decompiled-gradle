package com.ss.android.lark.profile.dto;

public class ProfileChat {

    /* renamed from: a */
    private String f129589a;

    /* renamed from: b */
    private String f129590b;

    /* renamed from: c */
    private int f129591c;

    /* renamed from: d */
    private String f129592d;

    /* renamed from: e */
    private String f129593e;

    /* renamed from: f */
    private String f129594f;

    /* renamed from: g */
    private boolean f129595g;

    /* renamed from: h */
    private boolean f129596h;

    /* renamed from: i */
    private boolean f129597i;

    /* renamed from: j */
    private AddMemberApply f129598j;

    public enum AddMemberApply {
        UNKNOWN(0),
        NO_APPLY(1),
        NEED_APPLY(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static AddMemberApply valueOf(int i) {
            return forNumber(i);
        }

        public static AddMemberApply forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return NO_APPLY;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return NEED_APPLY;
        }

        private AddMemberApply(int i) {
            this.value = i;
        }
    }

    public enum Type {
        P2P(1),
        GROUP(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 1) {
                return P2P;
            }
            if (i != 2) {
                return null;
            }
            return GROUP;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public ProfileChat() {
    }

    /* renamed from: a */
    public String mo178838a() {
        return this.f129589a;
    }

    /* renamed from: b */
    public String mo178839b() {
        return this.f129590b;
    }

    /* renamed from: c */
    public int mo178840c() {
        return this.f129591c;
    }

    /* renamed from: d */
    public String mo178841d() {
        return this.f129592d;
    }

    /* renamed from: e */
    public String mo178842e() {
        return this.f129593e;
    }

    /* renamed from: f */
    public String mo178843f() {
        return this.f129594f;
    }

    /* renamed from: g */
    public boolean mo178844g() {
        return this.f129596h;
    }

    /* renamed from: h */
    public boolean mo178845h() {
        return this.f129597i;
    }

    public ProfileChat(String str, String str2, int i, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, AddMemberApply addMemberApply) {
        this.f129589a = str;
        this.f129590b = str2;
        this.f129591c = i;
        this.f129592d = str3;
        this.f129593e = str4;
        this.f129594f = str5;
        this.f129595g = z;
        this.f129596h = z3;
        this.f129597i = z2;
        this.f129598j = addMemberApply;
    }
}

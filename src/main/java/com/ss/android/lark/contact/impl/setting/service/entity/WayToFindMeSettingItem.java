package com.ss.android.lark.contact.impl.setting.service.entity;

public class WayToFindMeSettingItem {

    /* renamed from: a */
    private FindMeType f93206a;

    /* renamed from: b */
    private String f93207b;

    /* renamed from: c */
    private String f93208c;

    /* renamed from: d */
    private boolean f93209d;

    /* renamed from: e */
    private boolean f93210e;

    /* renamed from: f */
    private boolean f93211f;

    public enum FindMeType {
        UNKNOWN(0),
        MOBILE(1),
        EMAIL(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static FindMeType valueOf(int i) {
            return forNumber(i);
        }

        public static FindMeType forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return MOBILE;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return EMAIL;
        }

        private FindMeType(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public FindMeType mo132604a() {
        return this.f93206a;
    }

    /* renamed from: b */
    public String mo132605b() {
        return this.f93208c;
    }

    /* renamed from: c */
    public String mo132606c() {
        return this.f93207b;
    }

    /* renamed from: d */
    public boolean mo132607d() {
        return this.f93209d;
    }

    /* renamed from: e */
    public boolean mo132608e() {
        return this.f93210e;
    }

    /* renamed from: f */
    public boolean mo132609f() {
        return this.f93211f;
    }

    public WayToFindMeSettingItem(FindMeType findMeType, String str, String str2, boolean z, boolean z2) {
        this.f93207b = str;
        this.f93206a = findMeType;
        this.f93208c = str2;
        this.f93209d = z;
        this.f93210e = z2;
    }

    public WayToFindMeSettingItem(FindMeType findMeType, String str, String str2, boolean z, boolean z2, boolean z3) {
        this(findMeType, str, str2, z, z2);
        this.f93211f = z3;
    }
}

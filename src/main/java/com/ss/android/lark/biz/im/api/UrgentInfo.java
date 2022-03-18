package com.ss.android.lark.biz.im.api;

public class UrgentInfo implements Cloneable, Comparable {

    /* renamed from: a */
    private String f74154a;

    /* renamed from: b */
    private String f74155b;

    /* renamed from: c */
    private long f74156c;

    public enum Status {
        UNKNOWN(0),
        ME_CREATE(1),
        ME_ACK(2),
        URGENT_ME(3),
        ACK_ME(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status forNumber(int i) {
            if (i == 1) {
                return ME_CREATE;
            }
            if (i == 2) {
                return ME_ACK;
            }
            if (i == 3) {
                return URGENT_ME;
            }
            if (i != 4) {
                return UNKNOWN;
            }
            return ACK_ME;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public long mo106636a() {
        return this.f74156c;
    }

    /* renamed from: b */
    public void mo106639b(String str) {
        this.f74155b = str;
    }

    /* renamed from: a */
    public void mo106637a(long j) {
        this.f74156c = j;
    }

    /* renamed from: a */
    public void mo106638a(String str) {
        this.f74154a = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof UrgentInfo)) {
            return 0;
        }
        UrgentInfo urgentInfo = (UrgentInfo) obj;
        if (mo106636a() > urgentInfo.mo106636a()) {
            return -1;
        }
        if (mo106636a() == urgentInfo.mo106636a()) {
            return 0;
        }
        return 1;
    }
}

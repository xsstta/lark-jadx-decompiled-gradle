package com.ss.android.lark.mail.impl.entity;

public class SendStatusDetail {

    /* renamed from: a */
    private MailAddress f107002a;

    /* renamed from: b */
    private long f107003b;

    /* renamed from: c */
    private SendStatus f107004c;

    public enum SendStatus {
        UNKNOWN(0),
        DELIVERING(1),
        RETRY(2),
        DEFERRED(3),
        DELIVERED(4);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static SendStatus fromValue(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return DELIVERING;
            }
            if (i == 2) {
                return RETRY;
            }
            if (i == 3) {
                return DEFERRED;
            }
            if (i != 4) {
                return null;
            }
            return DELIVERED;
        }

        private SendStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public MailAddress mo151772a() {
        return this.f107002a;
    }

    /* renamed from: b */
    public long mo151773b() {
        return this.f107003b;
    }

    /* renamed from: c */
    public SendStatus mo151774c() {
        return this.f107004c;
    }

    /* renamed from: com.ss.android.lark.mail.impl.entity.SendStatusDetail$a */
    public static class C42083a {

        /* renamed from: a */
        public MailAddress f107005a;

        /* renamed from: b */
        public long f107006b;

        /* renamed from: c */
        public SendStatus f107007c;

        /* renamed from: a */
        public SendStatusDetail mo151779a() {
            return new SendStatusDetail(this);
        }

        /* renamed from: a */
        public C42083a mo151776a(long j) {
            this.f107006b = j;
            return this;
        }

        /* renamed from: a */
        public C42083a mo151777a(MailAddress mailAddress) {
            this.f107005a = mailAddress;
            return this;
        }

        /* renamed from: a */
        public C42083a mo151778a(SendStatus sendStatus) {
            this.f107007c = sendStatus;
            return this;
        }
    }

    public SendStatusDetail(C42083a aVar) {
        this.f107002a = aVar.f107005a;
        this.f107003b = aVar.f107006b;
        this.f107004c = aVar.f107007c;
    }
}

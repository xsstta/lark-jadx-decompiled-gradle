package com.huawei.hms.hatool;

import java.util.Calendar;
import java.util.UUID;

public class f0 {

    /* renamed from: a */
    public long f58197a = 1800000;

    /* renamed from: b */
    public volatile boolean f58198b = false;

    /* renamed from: c */
    public C23603a f58199c = null;

    /* renamed from: com.huawei.hms.hatool.f0$a */
    public class C23603a {

        /* renamed from: a */
        public String f58200a = UUID.randomUUID().toString().replace("-", "");

        /* renamed from: b */
        public boolean f58201b;

        /* renamed from: c */
        public long f58202c;

        public C23603a(long j) {
            this.f58200a += "_" + j;
            this.f58202c = j;
            this.f58201b = true;
            f0.this.f58198b = false;
        }

        /* renamed from: a */
        public void mo82998a(long j) {
            if (f0.this.f58198b) {
                f0.this.f58198b = false;
                mo83000b(j);
            } else if (mo83001b(this.f58202c, j) || mo82999a(this.f58202c, j)) {
                mo83000b(j);
            } else {
                this.f58202c = j;
                this.f58201b = false;
            }
        }

        /* renamed from: a */
        public final boolean mo82999a(long j, long j2) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j2);
            return (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) ? false : true;
        }

        /* renamed from: b */
        public final void mo83000b(long j) {
            C23625y.m85977c("hmsSdk", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.f58200a = uuid;
            this.f58200a = uuid.replace("-", "");
            this.f58200a += "_" + j;
            this.f58202c = j;
            this.f58201b = true;
        }

        /* renamed from: b */
        public final boolean mo83001b(long j, long j2) {
            return j2 - j >= f0.this.f58197a;
        }
    }

    /* renamed from: a */
    public String mo82995a() {
        C23603a aVar = this.f58199c;
        if (aVar != null) {
            return aVar.f58200a;
        }
        C23625y.m85982f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    /* renamed from: a */
    public void mo82996a(long j) {
        C23603a aVar = this.f58199c;
        if (aVar == null) {
            C23625y.m85977c("hmsSdk", "Session is first flush");
            this.f58199c = new C23603a(j);
            return;
        }
        aVar.mo82998a(j);
    }

    /* renamed from: b */
    public boolean mo82997b() {
        C23603a aVar = this.f58199c;
        if (aVar != null) {
            return aVar.f58201b;
        }
        C23625y.m85982f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}

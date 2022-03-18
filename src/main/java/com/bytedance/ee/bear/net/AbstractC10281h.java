package com.bytedance.ee.bear.net;

/* renamed from: com.bytedance.ee.bear.net.h */
public interface AbstractC10281h {
    /* renamed from: a */
    String mo39294a();

    /* renamed from: a */
    void mo39295a(String str);

    /* renamed from: b */
    boolean mo39296b();

    /* renamed from: com.bytedance.ee.bear.net.h$a */
    public static abstract class AbstractC10282a implements AbstractC10281h {

        /* renamed from: a */
        private String f27767a;

        /* renamed from: b */
        private boolean f27768b;

        @Override // com.bytedance.ee.bear.net.AbstractC10281h
        /* renamed from: a */
        public String mo39294a() {
            return this.f27767a;
        }

        @Override // com.bytedance.ee.bear.net.AbstractC10281h
        /* renamed from: b */
        public boolean mo39296b() {
            return this.f27768b;
        }

        @Override // com.bytedance.ee.bear.net.AbstractC10281h
        /* renamed from: a */
        public void mo39295a(String str) {
            this.f27767a = str;
        }

        /* renamed from: a */
        public void mo39297a(boolean z) {
            this.f27768b = z;
        }
    }

    /* renamed from: com.bytedance.ee.bear.net.h$b */
    public static class C10283b extends AbstractC10282a {
        public C10283b() {
            mo39295a("https://internal-api-space.feishu-boe.cn");
        }
    }

    /* renamed from: com.bytedance.ee.bear.net.h$c */
    public static class C10284c extends AbstractC10282a {
        public C10284c() {
            mo39295a("https://internal-api-space.feishu.cn");
        }
    }

    /* renamed from: com.bytedance.ee.bear.net.h$d */
    public static class C10285d extends AbstractC10282a {
        public C10285d() {
            mo39295a("https://internal-api-space.larksuite.com");
        }
    }

    /* renamed from: com.bytedance.ee.bear.net.h$e */
    public static class C10286e extends AbstractC10282a {
        public C10286e() {
            mo39295a("https://internal-api-space.larksuite-staging.com");
        }
    }

    /* renamed from: com.bytedance.ee.bear.net.h$f */
    public static class C10287f extends AbstractC10282a {
        public C10287f() {
            mo39295a("https://internal-api-space.feishu-staging.cn");
        }
    }
}

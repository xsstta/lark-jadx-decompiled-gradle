package com.ss.videoarch.liveplayer;

import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.d */
public interface AbstractC65627d {

    /* renamed from: com.ss.videoarch.liveplayer.d$a */
    public static class C65629a {

        /* renamed from: a */
        public final JSONObject f165189a;

        /* renamed from: b */
        public final String f165190b;

        /* renamed from: c */
        public final String f165191c;

        /* renamed from: d */
        public final Exception f165192d;

        /* renamed from: com.ss.videoarch.liveplayer.d$a$a */
        public static class C65630a {

            /* renamed from: a */
            JSONObject f165193a;

            /* renamed from: b */
            String f165194b;

            /* renamed from: c */
            String f165195c;

            /* renamed from: d */
            Exception f165196d;

            private C65630a() {
            }

            /* renamed from: a */
            public C65629a mo229645a() {
                return new C65629a(this);
            }

            /* renamed from: a */
            public C65630a mo229642a(Exception exc) {
                this.f165196d = exc;
                return this;
            }

            /* renamed from: b */
            public C65630a mo229646b(String str) {
                this.f165195c = str;
                return this;
            }

            /* renamed from: a */
            public C65630a mo229643a(String str) {
                this.f165194b = str;
                return this;
            }

            /* renamed from: a */
            public C65630a mo229644a(JSONObject jSONObject) {
                this.f165193a = jSONObject;
                return this;
            }
        }

        /* renamed from: a */
        public static C65630a m257258a() {
            return new C65630a();
        }

        private C65629a(C65630a aVar) {
            this.f165189a = aVar.f165193a;
            this.f165190b = aVar.f165194b;
            this.f165191c = aVar.f165195c;
            this.f165192d = aVar.f165196d;
        }
    }

    /* renamed from: a */
    C65629a mo142531a(String str, String str2);
}

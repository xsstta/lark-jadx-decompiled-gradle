package com.ss.android.lark.dto.chat;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ProfileSource {

    /* renamed from: a */
    public final int f94741a;

    /* renamed from: b */
    public final int f94742b;

    /* renamed from: c */
    public final String f94743c;

    /* renamed from: d */
    public final String f94744d;

    /* renamed from: e */
    public String f94745e;

    /* renamed from: f */
    public Boolean f94746f;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceChannel {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceType {
    }

    /* renamed from: com.ss.android.lark.dto.chat.ProfileSource$a */
    public static class C36868a {

        /* renamed from: a */
        public int f94747a;

        /* renamed from: b */
        public int f94748b = 1;

        /* renamed from: c */
        public String f94749c;

        /* renamed from: d */
        public String f94750d;

        /* renamed from: e */
        public String f94751e;

        /* renamed from: f */
        public Boolean f94752f;

        /* renamed from: a */
        public ProfileSource mo136063a() {
            return new ProfileSource(this);
        }

        /* renamed from: a */
        public C36868a mo136060a(int i) {
            this.f94748b = i;
            return this;
        }

        /* renamed from: b */
        public C36868a mo136064b(int i) {
            this.f94747a = i;
            return this;
        }

        /* renamed from: c */
        public C36868a mo136066c(String str) {
            this.f94751e = str;
            return this;
        }

        /* renamed from: a */
        public C36868a mo136061a(Boolean bool) {
            this.f94752f = bool;
            return this;
        }

        /* renamed from: b */
        public C36868a mo136065b(String str) {
            this.f94750d = str;
            return this;
        }

        /* renamed from: a */
        public C36868a mo136062a(String str) {
            this.f94749c = str;
            return this;
        }
    }

    /* renamed from: a */
    public void mo136058a(Boolean bool) {
        this.f94746f = bool;
    }

    /* renamed from: a */
    public void mo136059a(String str) {
        this.f94745e = str;
    }

    public ProfileSource(C36868a aVar) {
        this.f94741a = aVar.f94747a;
        this.f94742b = aVar.f94748b;
        this.f94745e = aVar.f94749c;
        this.f94743c = aVar.f94750d;
        this.f94744d = aVar.f94751e;
        this.f94746f = aVar.f94752f;
    }
}

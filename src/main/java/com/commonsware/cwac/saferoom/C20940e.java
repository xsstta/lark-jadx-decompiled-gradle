package com.commonsware.cwac.saferoom;

import android.content.Context;
import androidx.p038g.p039a.AbstractC1083c;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.commonsware.cwac.saferoom.e */
public class C20940e implements AbstractC1083c.AbstractC1087c {

    /* renamed from: a */
    private final byte[] f51273a;

    /* renamed from: b */
    private final C20942a f51274b;

    /* renamed from: com.commonsware.cwac.saferoom.e$a */
    public static class C20942a {

        /* renamed from: a */
        public final String f51275a;

        /* renamed from: b */
        public final String f51276b;

        /* renamed from: c */
        public final boolean f51277c;

        /* renamed from: com.commonsware.cwac.saferoom.e$a$a */
        public static class C20943a {

            /* renamed from: a */
            private String f51278a;

            /* renamed from: b */
            private String f51279b;

            /* renamed from: c */
            private boolean f51280c;

            private C20943a() {
                this.f51280c = true;
            }

            /* renamed from: a */
            public C20942a mo70794a() {
                return new C20942a(this.f51278a, this.f51279b, this.f51280c);
            }

            /* renamed from: a */
            public C20943a mo70792a(String str) {
                this.f51279b = str;
                return this;
            }

            /* renamed from: a */
            public C20943a mo70793a(boolean z) {
                this.f51280c = z;
                return this;
            }
        }

        /* renamed from: a */
        public static C20943a m76298a() {
            return new C20943a();
        }

        private C20942a(String str, String str2, boolean z) {
            this.f51275a = str;
            this.f51276b = str2;
            this.f51277c = z;
        }
    }

    /* renamed from: a */
    private void m76296a(char[] cArr) {
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = 0;
        }
    }

    @Override // androidx.p038g.p039a.AbstractC1083c.AbstractC1087c
    public AbstractC1083c create(AbstractC1083c.C1085b bVar) {
        return mo70791a(bVar.f4070a, bVar.f4071b, bVar.f4072c);
    }

    public C20940e(byte[] bArr, C20942a aVar) {
        this.f51273a = bArr;
        this.f51274b = aVar;
    }

    public C20940e(char[] cArr, C20942a aVar) {
        this(SQLiteDatabase.getBytes(cArr), aVar);
        if (aVar.f51277c) {
            m76296a(cArr);
        }
    }

    /* renamed from: a */
    public AbstractC1083c mo70791a(Context context, String str, AbstractC1083c.AbstractC1084a aVar) {
        return new C20935c(context, str, aVar, this.f51273a, this.f51274b);
    }
}

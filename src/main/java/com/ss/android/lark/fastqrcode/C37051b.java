package com.ss.android.lark.fastqrcode;

import android.util.Log;

/* renamed from: com.ss.android.lark.fastqrcode.b */
public class C37051b {

    /* renamed from: a */
    private static AbstractC37053a f95195a = new AbstractC37053a() {
        /* class com.ss.android.lark.fastqrcode.C37051b.C370521 */

        @Override // com.ss.android.lark.fastqrcode.C37051b.AbstractC37053a
        /* renamed from: a */
        public void mo136576a(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // com.ss.android.lark.fastqrcode.C37051b.AbstractC37053a
        /* renamed from: b */
        public void mo136577b(String str, String str2) {
            Log.d(str, str2);
        }

        @Override // com.ss.android.lark.fastqrcode.C37051b.AbstractC37053a
        /* renamed from: c */
        public void mo136578c(String str, String str2) {
            Log.e(str, str2);
        }
    };

    /* renamed from: com.ss.android.lark.fastqrcode.b$a */
    public interface AbstractC37053a {
        /* renamed from: a */
        void mo136576a(String str, String str2);

        /* renamed from: b */
        void mo136577b(String str, String str2);

        /* renamed from: c */
        void mo136578c(String str, String str2);
    }

    /* renamed from: a */
    public static void m146149a(AbstractC37053a aVar) {
        f95195a = aVar;
    }

    /* renamed from: a */
    public static void m146150a(String str, String str2) {
        f95195a.mo136576a(str, str2);
    }

    /* renamed from: b */
    public static void m146151b(String str, String str2) {
        f95195a.mo136577b(str, str2);
    }

    /* renamed from: c */
    public static void m146152c(String str, String str2) {
        f95195a.mo136578c(str, str2);
    }
}

package com.ss.android.lark.eetroublecapture.contentprovider;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.ss.android.lark.eetroublecapture.contentprovider.c */
class C36980c {

    /* renamed from: c */
    private static C36975a f95075c;

    /* renamed from: a */
    public final Uri f95076a;

    /* renamed from: b */
    public Context f95077b;

    /* renamed from: a */
    public C36981a mo136492a() {
        return new C36981a(this.f95077b);
    }

    /* renamed from: com.ss.android.lark.eetroublecapture.contentprovider.c$a */
    public final class C36981a {

        /* renamed from: b */
        private String f95079b;

        /* renamed from: c */
        private String f95080c;

        /* renamed from: a */
        public Uri mo136493a() {
            Uri.Builder buildUpon = C36980c.this.f95076a.buildUpon();
            buildUpon.appendPath("capture");
            String str = this.f95080c;
            if (str != null) {
                buildUpon.appendPath(str);
            }
            String str2 = this.f95079b;
            if (str2 != null) {
                buildUpon.appendPath(str2);
            }
            return buildUpon.build();
        }

        /* renamed from: a */
        public C36981a mo136494a(String str) {
            this.f95079b = str;
            return this;
        }

        /* renamed from: b */
        public C36981a mo136495b(String str) {
            this.f95080c = str;
            return this;
        }

        public C36981a(Context context) {
            C36980c.this.f95077b = context.getApplicationContext();
        }
    }

    public C36980c(Context context) {
        this.f95077b = context;
        if (f95075c == null) {
            f95075c = new C36975a(context);
        }
        this.f95076a = f95075c.mo136481b();
    }
}

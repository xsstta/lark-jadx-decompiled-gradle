package com.ss.android.lark.eetroublecapture.contentprovider;

import android.content.Context;
import android.net.Uri;

/* renamed from: com.ss.android.lark.eetroublecapture.contentprovider.a */
class C36975a {

    /* renamed from: a */
    private String f95062a;

    /* renamed from: b */
    private Uri f95063b = Uri.parse("content://" + this.f95062a);

    /* renamed from: c */
    private Uri f95064c = mo136481b().buildUpon().appendPath("capture").build();

    /* renamed from: d */
    private String f95065d = ("vnd.android.cursor.dir/" + mo136480a() + "/" + "capture");

    /* renamed from: e */
    private String f95066e = ("vnd.android.cursor.item/" + mo136480a() + "/" + "capture");

    /* renamed from: a */
    public String mo136480a() {
        return this.f95062a;
    }

    /* renamed from: b */
    public Uri mo136481b() {
        return this.f95063b;
    }

    /* renamed from: c */
    public String mo136482c() {
        return this.f95065d;
    }

    public C36975a(Context context) {
        this.f95062a = context.getPackageName() + ".eetroublecapture";
    }
}

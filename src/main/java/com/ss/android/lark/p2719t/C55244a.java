package com.ss.android.lark.p2719t;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.t.a */
public class C55244a {

    /* renamed from: a */
    private String f136326a;

    /* renamed from: b */
    private String f136327b;

    /* renamed from: c */
    private String f136328c;

    /* renamed from: d */
    private String f136329d;

    /* renamed from: e */
    private Bitmap f136330e;

    /* renamed from: f */
    private int f136331f;

    /* renamed from: g */
    private boolean f136332g;

    /* renamed from: a */
    public String mo188256a() {
        return this.f136326a;
    }

    /* renamed from: b */
    public String mo188258b() {
        return this.f136327b;
    }

    /* renamed from: c */
    public String mo188259c() {
        return this.f136328c;
    }

    /* renamed from: d */
    public String mo188260d() {
        return this.f136329d;
    }

    /* renamed from: f */
    public boolean mo188262f() {
        return this.f136332g;
    }

    /* renamed from: e */
    public Bitmap mo188261e() {
        if (this.f136330e == null) {
            int i = this.f136331f;
            if (i <= 0) {
                return null;
            }
            Drawable drawable = UIHelper.getDrawable(i);
            if (drawable instanceof BitmapDrawable) {
                this.f136330e = ((BitmapDrawable) drawable).getBitmap();
            }
            if (this.f136330e == null) {
                this.f136331f = -1;
            }
        }
        return this.f136330e;
    }

    /* renamed from: a */
    public void mo188257a(Bitmap bitmap) {
        this.f136330e = bitmap;
    }

    public C55244a(String str, String str2, String str3, String str4, int i, Boolean bool) {
        this.f136326a = str;
        this.f136327b = str2;
        this.f136328c = str3;
        this.f136329d = str4;
        this.f136331f = i;
        this.f136332g = bool.booleanValue();
    }

    public C55244a(String str, String str2, String str3, String str4, Bitmap bitmap, Boolean bool) {
        this.f136326a = str;
        this.f136327b = str2;
        this.f136328c = str3;
        this.f136329d = str4;
        this.f136330e = bitmap;
        this.f136332g = bool.booleanValue();
    }
}

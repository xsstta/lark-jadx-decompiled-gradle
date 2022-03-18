package com.tt.p3255a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import java.io.File;

/* renamed from: com.tt.a.c */
public class C65678c {

    /* renamed from: a */
    public Drawable f165473a;

    /* renamed from: b */
    public int f165474b;

    /* renamed from: c */
    public int f165475c;

    /* renamed from: d */
    public boolean f165476d;

    /* renamed from: e */
    public boolean f165477e;

    /* renamed from: f */
    public boolean f165478f;

    /* renamed from: g */
    public boolean f165479g;

    /* renamed from: h */
    public Bitmap.Config f165480h = Bitmap.Config.RGB_565;

    /* renamed from: i */
    public int f165481i;

    /* renamed from: j */
    public int f165482j;

    /* renamed from: k */
    public float f165483k;

    /* renamed from: l */
    public float f165484l;

    /* renamed from: m */
    public int f165485m;

    /* renamed from: n */
    public String f165486n;

    /* renamed from: o */
    public File f165487o;

    /* renamed from: p */
    public int f165488p;

    /* renamed from: q */
    public Uri f165489q;

    /* renamed from: r */
    public View f165490r;

    /* renamed from: s */
    public AbstractC65676a f165491s;

    /* renamed from: a */
    public C65678c mo229918a() {
        this.f165476d = true;
        return this;
    }

    /* renamed from: b */
    public C65678c mo229924b(int i) {
        this.f165475c = i;
        return this;
    }

    /* renamed from: a */
    public C65678c mo229919a(int i) {
        this.f165474b = i;
        return this;
    }

    public C65678c(Uri uri) {
        this.f165489q = uri;
    }

    public C65678c(File file) {
        this.f165487o = file;
    }

    /* renamed from: a */
    public C65678c mo229921a(Drawable drawable) {
        this.f165473a = drawable;
        return this;
    }

    public C65678c(String str) {
        this.f165486n = str;
    }

    /* renamed from: a */
    public C65678c mo229922a(View view) {
        this.f165490r = view;
        return this;
    }

    /* renamed from: a */
    public C65678c mo229923a(AbstractC65676a aVar) {
        this.f165491s = aVar;
        return this;
    }

    /* renamed from: a */
    public C65678c mo229920a(int i, int i2) {
        this.f165481i = i;
        this.f165482j = i2;
        return this;
    }
}

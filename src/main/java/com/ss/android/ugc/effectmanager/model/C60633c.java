package com.ss.android.ugc.effectmanager.model;

import android.net.Uri;
import com.ss.android.ugc.effectmanager.common.C60512d;
import java.io.File;

/* renamed from: com.ss.android.ugc.effectmanager.model.c */
public class C60633c {

    /* renamed from: a */
    private final Uri f151636a;

    /* renamed from: b */
    private String f151637b;

    /* renamed from: c */
    private String f151638c;

    /* renamed from: d */
    private int f151639d = -1;

    /* renamed from: e */
    private String f151640e;

    /* renamed from: f */
    private boolean f151641f;

    /* renamed from: f */
    public Uri mo208116f() {
        return this.f151636a;
    }

    public C60633c() {
    }

    /* renamed from: c */
    public boolean mo208112c() {
        return this.f151641f;
    }

    /* renamed from: b */
    public String mo208109b() {
        Uri uri;
        String str = this.f151638c;
        if ((str == null || str.isEmpty()) && (uri = this.f151636a) != null) {
            this.f151638c = m235629e(uri.getPath());
        }
        return this.f151638c;
    }

    /* renamed from: d */
    public int mo208113d() {
        Uri uri;
        if (this.f151639d == -1 && (uri = this.f151636a) != null) {
            this.f151639d = C60512d.m235169d(new File(uri.getPath()).getName());
        }
        return this.f151639d;
    }

    /* renamed from: a */
    public String mo208106a() {
        Uri uri;
        String str = this.f151637b;
        if ((str == null || str.isEmpty()) && (uri = this.f151636a) != null) {
            this.f151637b = C60512d.m235165a(new File(uri.getPath()).getName());
        }
        return this.f151637b;
    }

    /* renamed from: e */
    public String mo208115e() {
        Uri uri;
        String str = this.f151640e;
        if ((str == null || str.isEmpty()) && (uri = this.f151636a) != null) {
            this.f151640e = C60512d.m235168c(new File(uri.getPath()).getName());
        }
        return this.f151640e;
    }

    public String toString() {
        return "LocalModelInfo{name=" + mo208106a() + '\'' + ",version=" + mo208109b() + '\'' + ",size=" + mo208113d() + '\'' + ",md5=" + mo208115e() + '\'' + '}';
    }

    /* renamed from: a */
    public void mo208107a(int i) {
        this.f151639d = i;
    }

    /* renamed from: b */
    public void mo208110b(String str) {
        this.f151637b = str;
    }

    /* renamed from: c */
    public void mo208111c(String str) {
        this.f151638c = str;
    }

    /* renamed from: d */
    public void mo208114d(String str) {
        this.f151640e = str;
    }

    /* renamed from: a */
    public void mo208108a(boolean z) {
        this.f151641f = z;
    }

    private C60633c(Uri uri) {
        this.f151636a = uri;
    }

    /* renamed from: a */
    public static C60633c m235628a(String str) {
        return new C60633c(Uri.parse("file://" + str));
    }

    /* renamed from: e */
    private static String m235629e(String str) {
        int i;
        if (str == null) {
            return "1.0";
        }
        str.lastIndexOf("/");
        int lastIndexOf = str.lastIndexOf("_v");
        if (str.contains("size")) {
            i = str.lastIndexOf("_size");
        } else {
            i = str.lastIndexOf("_model");
        }
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 2, i).replace('_', '.');
        }
        return "1.0";
    }
}

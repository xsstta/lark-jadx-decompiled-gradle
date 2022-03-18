package com.ss.android.socialbase.downloader.network.p3029a;

import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.socialbase.downloader.network.a.a */
public class C60124a {

    /* renamed from: a */
    protected int f150037a;

    /* renamed from: b */
    private final Map<String, C60129c> f150038b;

    /* renamed from: c */
    private final Map<String, C60130d> f150039c;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.socialbase.downloader.network.a.a$a */
    public static final class C60126a {

        /* renamed from: a */
        public static final C60124a f150040a = new C60124a();
    }

    /* renamed from: a */
    public static C60124a m233655a() {
        return C60126a.f150040a;
    }

    private C60124a() {
        this.f150038b = new HashMap();
        this.f150039c = new LinkedHashMap(3);
        this.f150037a = 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo205427a(int i) {
        this.f150037a = i;
    }

    /* renamed from: a */
    public C60129c mo205426a(String str, List<HttpHeader> list) {
        C60129c remove;
        synchronized (this.f150038b) {
            remove = this.f150038b.remove(str);
        }
        if (remove == null) {
            return null;
        }
        if (C60161d.m233780a(remove.mo205433f(), list)) {
            try {
                remove.mo205430c();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (remove.mo205432e() && remove.mo205431d()) {
                return remove;
            }
        }
        try {
            remove.mo204947b();
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public C60130d mo205428b(String str, List<HttpHeader> list) {
        C60130d remove;
        synchronized (this.f150039c) {
            remove = this.f150039c.remove(str);
        }
        if (remove == null) {
            return null;
        }
        if (C60161d.m233780a(remove.mo205436f(), list)) {
            try {
                remove.mo205435e();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (remove.mo205438h() && remove.mo205437g()) {
                return remove;
            }
        }
        try {
            remove.mo204950d();
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}

package com.ss.android.vc.common.widget.globaldialog;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.ss.android.vc.common.widget.globaldialog.a */
public class C60862a {

    /* renamed from: a */
    private static C60862a f152369a;

    /* renamed from: b */
    private String f152370b;

    /* renamed from: c */
    private String f152371c;

    /* renamed from: d */
    private String f152372d;

    /* renamed from: e */
    private String f152373e;

    /* renamed from: f */
    private AbstractC60863a f152374f;

    /* renamed from: com.ss.android.vc.common.widget.globaldialog.a$a */
    public interface AbstractC60863a {
        /* renamed from: a */
        void mo208693a();

        /* renamed from: b */
        void mo208694b();
    }

    /* renamed from: b */
    public static void m236568b() {
        f152369a = null;
    }

    /* renamed from: c */
    public String mo208688c() {
        return this.f152370b;
    }

    /* renamed from: d */
    public String mo208689d() {
        return this.f152371c;
    }

    /* renamed from: e */
    public String mo208690e() {
        return this.f152372d;
    }

    /* renamed from: f */
    public String mo208691f() {
        return this.f152373e;
    }

    /* renamed from: g */
    public AbstractC60863a mo208692g() {
        return this.f152374f;
    }

    /* renamed from: a */
    public static C60862a m236567a() {
        if (f152369a == null) {
            f152369a = new C60862a();
        }
        return f152369a;
    }

    /* renamed from: a */
    public C60862a mo208684a(AbstractC60863a aVar) {
        C60862a aVar2 = f152369a;
        aVar2.f152374f = aVar;
        return aVar2;
    }

    /* renamed from: b */
    public C60862a mo208687b(String str) {
        C60862a aVar = f152369a;
        aVar.f152371c = str;
        return aVar;
    }

    /* renamed from: a */
    public C60862a mo208685a(String str) {
        C60862a aVar = f152369a;
        aVar.f152370b = str;
        return aVar;
    }

    /* renamed from: a */
    public void mo208686a(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, PopupDialogActivity.class);
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }
}

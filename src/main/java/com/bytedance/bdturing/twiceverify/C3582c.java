package com.bytedance.bdturing.twiceverify;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.bdturing.twiceverify.AbstractC3580b;
import com.bytedance.bdturing.verify.request.AbstractRequest;
import com.bytedance.bdturing.verify.request.EcafRequest;
import com.bytedance.bdturing.verify.request.InfoVerifyRequest;
import java.util.HashMap;

/* renamed from: com.bytedance.bdturing.twiceverify.c */
public class C3582c {

    /* renamed from: b */
    private static volatile C3582c f11320b;

    /* renamed from: a */
    public AbstractC3584a f11321a;

    /* renamed from: c */
    private AbstractC3580b f11322c;

    /* renamed from: d */
    private C3579a f11323d;

    /* renamed from: e */
    private AbstractRequest f11324e;

    /* renamed from: f */
    private AbstractC3580b.AbstractC3581a f11325f = new AbstractC3580b.AbstractC3581a() {
        /* class com.bytedance.bdturing.twiceverify.C3582c.C35831 */
    };

    /* renamed from: com.bytedance.bdturing.twiceverify.c$a */
    public interface AbstractC3584a {
        /* renamed from: a */
        void mo14356a();

        /* renamed from: a */
        void mo14357a(int i, String str);
    }

    /* renamed from: c */
    public AbstractC3580b mo14435c() {
        return this.f11322c;
    }

    /* renamed from: d */
    public C3579a mo14436d() {
        return this.f11323d;
    }

    /* renamed from: e */
    public AbstractC3584a mo14437e() {
        return this.f11321a;
    }

    /* renamed from: f */
    public AbstractRequest mo14438f() {
        return this.f11324e;
    }

    /* renamed from: b */
    public boolean mo14434b() {
        if (this.f11322c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void mo14439g() {
        this.f11321a = null;
        this.f11324e = null;
    }

    /* renamed from: a */
    public static C3582c m15126a() {
        if (f11320b == null) {
            synchronized (C3582c.class) {
                f11320b = new C3582c();
            }
        }
        return f11320b;
    }

    /* renamed from: a */
    public void mo14433a(AbstractC3580b bVar) {
        this.f11322c = bVar;
    }

    /* renamed from: a */
    public void mo14432a(AbstractRequest aVar, HashMap<String, String> hashMap, AbstractC3584a aVar2) {
        this.f11321a = aVar2;
        if (aVar instanceof InfoVerifyRequest) {
            mo14435c().mo14429a(hashMap, this.f11325f);
        } else if (aVar instanceof EcafRequest) {
            mo14435c().mo14431b(hashMap, this.f11325f);
        } else {
            this.f11324e = aVar;
            Intent intent = new Intent();
            Activity a = aVar.mo14338a();
            intent.setClass(a, TwiceVerifyWebActivity.class);
            a.startActivity(intent);
        }
    }
}

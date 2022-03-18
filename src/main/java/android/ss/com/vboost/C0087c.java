package android.ss.com.vboost;

import android.app.Application;
import android.os.Bundle;
import android.ss.com.vboost.p010a.AbstractC0083d;
import android.ss.com.vboost.p010a.C0080a;
import android.ss.com.vboost.p010a.C0082c;
import android.ss.com.vboost.p010a.C0084e;
import android.util.Log;
import android.util.SparseIntArray;

/* renamed from: android.ss.com.vboost.c */
public class C0087c {

    /* renamed from: a */
    private static volatile C0087c f173a;

    /* renamed from: b */
    private Application f174b;

    /* renamed from: c */
    private SparseIntArray f175c = new SparseIntArray();

    /* renamed from: d */
    private AbstractC0083d f176d = new C0082c();

    private C0087c() {
    }

    /* renamed from: a */
    public static C0087c m176a() {
        if (f173a == null) {
            synchronized (C0087c.class) {
                if (f173a == null) {
                    f173a = new C0087c();
                }
            }
        }
        return f173a;
    }

    /* renamed from: a */
    public boolean mo141a(Application application) {
        boolean z = false;
        try {
            this.f174b = application;
            if (RomUtils.m162a()) {
                this.f176d = new C0080a();
            } else if (RomUtils.m163b()) {
                this.f176d = new C0084e();
            } else {
                this.f176d = new C0082c();
            }
            z = this.f176d.mo137a(application, application.getPackageName());
            if (z) {
                Log.i("KitManager", "成功注册厂商sdk合作");
            } else {
                Log.i("KitManager", "不能注册厂商sdk合作");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo142a(AbstractC0086b bVar, Status status) {
        return mo143a(bVar, status, null);
    }

    /* renamed from: a */
    public synchronized boolean mo143a(AbstractC0086b bVar, Status status, Bundle bundle) {
        if (this.f176d == null) {
            Log.i("KitManager", "register fail");
            return false;
        }
        try {
            if (this.f175c.get(bVar.mo140a()) != status.getStatus()) {
                this.f175c.put(bVar.mo140a(), status.getStatus());
                return this.f176d.mo138a(bVar, status, bundle);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return false;
    }
}

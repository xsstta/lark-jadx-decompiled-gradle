package com.bytedance.ee.bear.facade.common.empty;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.bytedance.ee.bear.bizwidget.C4859a;
import com.bytedance.ee.bear.connection.C4974b;
import com.bytedance.ee.bear.connection.NetworkType;
import com.bytedance.ee.bear.net.CloudReqFun;
import com.bytedance.ee.log.C13479a;
import java.net.SocketTimeoutException;

/* renamed from: com.bytedance.ee.bear.facade.common.empty.e */
public class C7692e extends LiveData<C7695b> {

    /* renamed from: a */
    private AbstractC7696c f20807a;

    /* renamed from: com.bytedance.ee.bear.facade.common.empty.e$c */
    public interface AbstractC7696c {
        /* renamed from: a */
        C7695b mo30164a();

        /* renamed from: a */
        C7695b mo30165a(int i);

        /* renamed from: a */
        C7695b mo30167a(Throwable th);

        /* renamed from: a */
        C7695b mo30168a(boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.facade.common.empty.e$a */
    private static class C7694a implements AbstractC7696c {

        /* renamed from: a */
        private Context f20808a;

        /* renamed from: b */
        private C7695b f20809b;

        @Override // com.bytedance.ee.bear.facade.common.empty.C7692e.AbstractC7696c
        /* renamed from: a */
        public C7695b mo30164a() {
            return this.f20809b;
        }

        private C7694a(Context context) {
            this.f20809b = new C7695b(0);
            this.f20808a = context;
        }

        @Override // com.bytedance.ee.bear.facade.common.empty.C7692e.AbstractC7696c
        /* renamed from: a */
        public C7695b mo30168a(boolean z) {
            C13479a.m54772d("EmptyStateSource", "next: loading ");
            return mo30169a(z, false);
        }

        @Override // com.bytedance.ee.bear.facade.common.empty.C7692e.AbstractC7696c
        /* renamed from: a */
        public C7695b mo30165a(int i) {
            C13479a.m54772d("EmptyStateSource", "next: load data : " + i);
            return mo30166a(i, false);
        }

        @Override // com.bytedance.ee.bear.facade.common.empty.C7692e.AbstractC7696c
        /* renamed from: a */
        public C7695b mo30167a(Throwable th) {
            C13479a.m54759a("EmptyStateSource", "next: error", th);
            if (th != null) {
                if (this.f20809b.mo30170a() != 2) {
                    if (C4974b.m20620a(this.f20808a) == NetworkType.NETWORK_NO) {
                        this.f20809b = new C7695b(4);
                    } else if (C7692e.m30770c(th)) {
                        this.f20809b = new C7695b(7);
                    } else {
                        this.f20809b = new C7695b(3);
                    }
                }
                if (C7692e.m30769b(th)) {
                    this.f20809b = new C7695b(5);
                }
                this.f20809b.mo30171a(th);
            }
            return this.f20809b;
        }

        /* renamed from: a */
        public C7695b mo30169a(boolean z, boolean z2) {
            C13479a.m54772d("EmptyStateSource", "next: loading ，isForce=" + z2);
            if (z && this.f20809b.mo30170a() != 2) {
                if (z2 || this.f20809b.mo30170a() == 8) {
                    this.f20809b = new C7695b(8);
                } else {
                    this.f20809b = new C7695b(0);
                }
            }
            return this.f20809b;
        }

        /* renamed from: a */
        public C7695b mo30166a(int i, boolean z) {
            C13479a.m54772d("EmptyStateSource", "next: load data : " + i + " isForce=" + z);
            if (!z && this.f20809b.mo30170a() == 8) {
                return this.f20809b;
            }
            if (i <= 0) {
                this.f20809b = new C7695b(1);
            } else {
                this.f20809b = new C7695b(2);
            }
            return this.f20809b;
        }
    }

    /* renamed from: com.bytedance.ee.bear.facade.common.empty.e$b */
    public static class C7695b {

        /* renamed from: a */
        private Throwable f20810a;

        /* renamed from: b */
        private int f20811b;

        /* renamed from: a */
        public int mo30170a() {
            return this.f20811b;
        }

        /* renamed from: b */
        public Throwable mo30172b() {
            return this.f20810a;
        }

        public C7695b(int i) {
            this.f20811b = i;
        }

        /* renamed from: a */
        public void mo30171a(Throwable th) {
            this.f20810a = th;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: d */
    public void mo5931d() {
        super.mo5931d();
    }

    /* renamed from: g */
    public void mo30163g() {
        mo30161b(1);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: a */
    public void mo5920a() {
        mo5929b(this.f20807a.mo30164a());
        super.mo5920a();
    }

    /* renamed from: f */
    public void mo30162f() {
        mo5926a(this.f20807a.mo30168a(true));
    }

    public C7692e(Context context) {
        this.f20807a = new C7694a(context);
    }

    /* renamed from: b */
    public static boolean m30769b(Throwable th) {
        return C4859a.m20024a().mo19040a().isNotFound(th);
    }

    /* renamed from: c */
    public static boolean m30770c(Throwable th) {
        if (th instanceof CloudReqFun.OkHttpReqException) {
            return ((CloudReqFun.OkHttpReqException) th).exception.equals(SocketTimeoutException.class.getName());
        }
        return th instanceof SocketTimeoutException;
    }

    /* renamed from: a */
    public void mo30160a(Throwable th) {
        mo5926a(this.f20807a.mo30167a(th));
    }

    /* renamed from: b */
    public void mo30161b(int i) {
        mo5926a(this.f20807a.mo30165a(i));
    }
}

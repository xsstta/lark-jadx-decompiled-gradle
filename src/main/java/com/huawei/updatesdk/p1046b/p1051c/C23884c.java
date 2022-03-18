package com.huawei.updatesdk.p1046b.p1051c;

import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1039b.p1043c.C23862b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.updatesdk.b.c.c */
public final class C23884c {

    /* renamed from: a */
    private static C23884c f59126a = new C23884c();

    /* renamed from: b */
    private static AbstractC23882a f59127b = new C23885a();

    /* renamed from: com.huawei.updatesdk.b.c.c$a */
    static class C23885a implements AbstractC23882a {

        /* renamed from: a */
        private final List<AbstractC23883b> f59128a = new ArrayList();

        C23885a() {
        }

        @Override // com.huawei.updatesdk.p1046b.p1051c.AbstractC23882a
        /* renamed from: a */
        public void mo85678a(int i, C23862b bVar) {
            synchronized (this.f59128a) {
                for (AbstractC23883b bVar2 : this.f59128a) {
                    bVar2.mo85681a(i, bVar);
                }
            }
        }

        @Override // com.huawei.updatesdk.p1046b.p1051c.AbstractC23882a
        /* renamed from: a */
        public void mo85679a(AbstractC23883b bVar) {
            String str;
            String str2;
            synchronized (this.f59128a) {
                if (bVar != null) {
                    if (!this.f59128a.contains(bVar)) {
                        try {
                            this.f59128a.add(bVar);
                        } catch (UnsupportedOperationException unused) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver UnsupportedOperationException";
                        } catch (ClassCastException unused2) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver ClassCastException";
                        } catch (IllegalArgumentException unused3) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver IllegalArgumentException";
                        }
                    }
                }
                return;
            }
            C23834a.m87118b(str, str2);
        }

        @Override // com.huawei.updatesdk.p1046b.p1051c.AbstractC23882a
        /* renamed from: b */
        public void mo85680b(AbstractC23883b bVar) {
            synchronized (this.f59128a) {
                try {
                    this.f59128a.remove(bVar);
                } catch (UnsupportedOperationException unused) {
                    C23834a.m87118b("InstallObserverManager", "unRegisterObserver UnsupportedOperationException");
                }
            }
        }
    }

    private C23884c() {
    }

    /* renamed from: a */
    public static AbstractC23882a m87334a() {
        return f59127b;
    }

    /* renamed from: b */
    public static C23884c m87335b() {
        return f59126a;
    }

    /* renamed from: a */
    public void mo85682a(C23862b bVar) {
        f59127b.mo85678a(1, bVar);
    }

    /* renamed from: b */
    public void mo85683b(C23862b bVar) {
        f59127b.mo85678a(0, bVar);
    }

    /* renamed from: c */
    public void mo85684c(C23862b bVar) {
        f59127b.mo85678a(2, bVar);
    }
}

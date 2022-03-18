package com.ss.android.lark.mail.impl.service.data;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.p2223a.C43751a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class AbsDataManager<T> {

    /* renamed from: g */
    public static int f110204g = 0;

    /* renamed from: h */
    public static int f110205h = 1;

    /* renamed from: i */
    public static int f110206i = 2;

    /* renamed from: j */
    public static int f110207j = 3;

    /* renamed from: k */
    public C43849u.C43850a f110208k = new C43849u.C43850a(mo154935b() + "_LimitExecutor", LocationRequest.PRIORITY_HD_ACCURACY);

    /* renamed from: l */
    protected AtomicReference<LoadStatus> f110209l = new AtomicReference<>(LoadStatus.INIT);

    /* renamed from: m */
    protected C43751a<T> f110210m = new C43751a<>(new C1177w());

    /* renamed from: n */
    public final List<AbstractC43360b<T>> f110211n = new CopyOnWriteArrayList();

    /* renamed from: com.ss.android.lark.mail.impl.service.data.AbsDataManager$a */
    public interface AbstractC43359a {
        /* renamed from: a */
        void mo152970a();

        /* renamed from: b */
        void mo152971b();

        /* renamed from: c */
        void mo152972c();

        /* renamed from: d */
        void mo152973d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo154929a(AbstractC43360b<T> bVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo154930a(T t, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo154935b();

    public enum LoadStatus {
        INIT(0),
        SUCCESS(1),
        LOADING(2),
        FAILED(3),
        USER_STOP(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static LoadStatus valueOf(int i) {
            return forNumber(i);
        }

        public static LoadStatus forNumber(int i) {
            if (i == 1) {
                return SUCCESS;
            }
            if (i == 2) {
                return LOADING;
            }
            if (i == 3) {
                return FAILED;
            }
            if (i != 4) {
                return INIT;
            }
            return USER_STOP;
        }

        private LoadStatus(int i) {
            this.value = i;
        }
    }

    /* renamed from: P */
    public C43751a<T> mo155068P() {
        return this.f110210m;
    }

    /* renamed from: Q */
    public T mo155069Q() {
        return this.f110210m.mo5927b();
    }

    /* renamed from: h */
    public boolean mo154944h() {
        return mo155071b(null);
    }

    /* renamed from: O */
    public LoadStatus mo155067O() {
        return this.f110209l.get();
    }

    /* renamed from: c */
    public void mo154939c() {
        mo155072e("onCreate");
        mo155070a(LoadStatus.INIT);
    }

    /* renamed from: d */
    public void mo154940d() {
        mo155072e("onResume");
        mo155070a(LoadStatus.INIT);
        this.f110208k.mo156222a(false);
    }

    /* renamed from: e */
    public void mo154941e() {
        mo155072e("onDestroy");
        this.f110208k.mo156222a(false);
        mo155070a(LoadStatus.USER_STOP);
    }

    /* renamed from: a */
    public void mo155070a(LoadStatus loadStatus) {
        this.f110209l.set(loadStatus);
    }

    /* renamed from: b */
    public boolean mo155071b(AbstractC43360b<T> bVar) {
        return mo154933a((AbstractC43359a) null, bVar);
    }

    /* renamed from: com.ss.android.lark.mail.impl.service.data.AbsDataManager$b */
    public static abstract class AbstractC43360b<T> {
        /* renamed from: a */
        public abstract void mo152964a();

        /* renamed from: a */
        public abstract void mo152965a(ErrorResult errorResult);

        /* renamed from: a */
        public abstract void mo152967a(T t);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(getClass(), ((AbstractC43360b) obj).getClass());
        }
    }

    /* renamed from: e */
    public void mo155072e(String str) {
        C13479a.m54764b(mo154935b() + "_Base", str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo154938b(T t, int i) {
        String str;
        T Q = mo155069Q();
        boolean z = true;
        if (Q == null ? t == null : i != f110206i && Q.equals(t)) {
            z = false;
        }
        if (z) {
            mo155072e("updateData : changeType=" + i);
            if (C41816b.m166115a().mo150143j()) {
                StringBuilder sb = new StringBuilder();
                sb.append("data=");
                if (t != null) {
                    str = t.toString();
                } else {
                    str = "null";
                }
                sb.append(str);
                mo155072e(sb.toString());
            }
            mo154930a(t, i);
            this.f110210m.mo5929b((Object) t);
        } else {
            mo155072e("updateData : has not change, ignore");
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo154933a(final AbstractC43359a aVar, final AbstractC43360b<T> bVar) {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("reloadData class = ");
        if (bVar != null) {
            obj = bVar.getClass();
        } else {
            obj = "null";
        }
        sb.append(obj);
        mo155072e(sb.toString());
        if (mo155067O() == LoadStatus.USER_STOP) {
            mo155072e("reloadData ignore, case user stop");
            if (bVar == null) {
                return false;
            }
            bVar.mo152964a();
            bVar.mo152965a(new ErrorResult("user stop"));
            return false;
        }
        if (mo155067O() == LoadStatus.LOADING && System.currentTimeMillis() - this.f110208k.mo156221a() > 10000) {
            mo155072e("reloadData speed too long, reset executor");
            C13479a.m54762a(mo154935b() + " reset executor when reloadData", (Throwable) new RuntimeException("MailCustomException"), true);
            this.f110208k.mo156222a(true);
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        RunnableC433571 r1 = new Runnable() {
            /* class com.ss.android.lark.mail.impl.service.data.AbsDataManager.RunnableC433571 */

            public void run() {
                AbsDataManager.this.mo155072e("reloadData start");
                AbsDataManager.this.mo155070a(LoadStatus.LOADING);
                m172186a(bVar);
                AbstractC43359a aVar = aVar;
                if (aVar != null) {
                    aVar.mo152971b();
                }
                AbsDataManager.this.mo154929a(new AbstractC43360b<T>() {
                    /* class com.ss.android.lark.mail.impl.service.data.AbsDataManager.RunnableC433571.C433581 */

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    /* renamed from: a */
                    public void mo152964a() {
                    }

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    /* renamed from: a */
                    public void mo152965a(ErrorResult errorResult) {
                        AbsDataManager.this.mo155072e("reloadData onLoadError");
                        AbsDataManager.this.f110210m.mo5929b((Object) null);
                        AbsDataManager.this.mo155070a(LoadStatus.FAILED);
                        RunnableC433571 r0 = RunnableC433571.this;
                        r0.mo155073a(bVar, false, null, errorResult);
                    }

                    @Override // com.ss.android.lark.mail.impl.service.data.AbsDataManager.AbstractC43360b
                    /* renamed from: a */
                    public void mo152967a(T t) {
                        AbsDataManager.this.mo155072e("reloadData onSucceedLoad");
                        if (aVar != null) {
                            aVar.mo152972c();
                        }
                        AbsDataManager.this.mo155072e("reloadData onSucceedLoad, start updateData");
                        AbsDataManager.this.mo154938b(t, AbsDataManager.f110204g);
                        AbsDataManager.this.mo155072e("reloadData onSucceedLoad, finish");
                        AbsDataManager.this.mo155070a(LoadStatus.SUCCESS);
                        if (aVar != null) {
                            aVar.mo152973d();
                        }
                        RunnableC433571 r0 = RunnableC433571.this;
                        r0.mo155073a(bVar, true, t, null);
                    }
                });
            }

            /* renamed from: a */
            private void m172186a(AbstractC43360b bVar) {
                if (atomicInteger.get() != 0) {
                    ArrayList<AbstractC43360b> arrayList = new ArrayList();
                    synchronized (AbsDataManager.this.f110211n) {
                        arrayList.addAll(AbsDataManager.this.f110211n);
                    }
                    for (AbstractC43360b bVar2 : arrayList) {
                        if (bVar2 != null) {
                            bVar2.mo152964a();
                        }
                    }
                } else if (bVar != null) {
                    bVar.mo152964a();
                }
            }

            /* renamed from: a */
            public void mo155073a(AbstractC43360b bVar, boolean z, T t, ErrorResult errorResult) {
                if (atomicInteger.get() != 0) {
                    ArrayList<AbstractC43360b> arrayList = new ArrayList();
                    synchronized (AbsDataManager.this.f110211n) {
                        arrayList.addAll(AbsDataManager.this.f110211n);
                        AbsDataManager.this.f110211n.clear();
                    }
                    for (AbstractC43360b bVar2 : arrayList) {
                        if (z) {
                            bVar2.mo152967a((Object) t);
                        } else {
                            bVar2.mo152965a(errorResult);
                        }
                    }
                } else if (bVar != null) {
                    if (z) {
                        bVar.mo152967a((Object) t);
                    } else {
                        bVar.mo152965a(errorResult);
                    }
                }
            }
        };
        if (aVar != null) {
            aVar.mo152970a();
        }
        int a = C43849u.m173821a(this.f110208k, C43849u.m173828b(), r1);
        atomicInteger.set(a);
        mo155072e("reloadData postResult = " + a);
        if (!(bVar == null || a == 0)) {
            synchronized (this.f110211n) {
                if (this.f110211n.contains(bVar)) {
                    mo155072e("reloadData replace the same listener");
                    this.f110211n.remove(bVar);
                }
                this.f110211n.add(bVar);
            }
        }
        return true;
    }
}

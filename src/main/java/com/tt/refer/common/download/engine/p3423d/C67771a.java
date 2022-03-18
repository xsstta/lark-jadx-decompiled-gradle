package com.tt.refer.common.download.engine.p3423d;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.refer.common.download.engine.model.C67780a;
import com.tt.refer.common.download.engine.model.DownloadBean;
import com.tt.refer.common.download.engine.p3421c.AbstractC67762a;
import com.tt.refer.common.download.engine.p3421c.AbstractC67769b;
import com.tt.refer.common.download.engine.p3421c.AbstractC67770c;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tt.refer.common.download.engine.d.a */
public class C67771a<B extends DownloadBean> implements AbstractC67775c<B> {

    /* renamed from: a */
    public CopyOnWriteArrayList<AbstractC67769b<B>> f170678a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private volatile boolean f170679b = false;

    /* renamed from: c */
    private volatile boolean f170680c = true;

    /* renamed from: d */
    private LinkedList<C67780a<B>> f170681d = new LinkedList<>();

    /* renamed from: e */
    private LinkedList<C67780a<B>> f170682e = new LinkedList<>();

    /* renamed from: f */
    private C67771a<B>.C67773a f170683f = new C67773a();

    /* renamed from: g */
    private AbstractC67770c<B> f170684g = new AbstractC67770c<B>() {
        /* class com.tt.refer.common.download.engine.p3423d.C67771a.C677721 */

        @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67770c
        /* renamed from: a */
        public void mo235194a(B b) {
            C67780a<B> a = C67771a.this.mo235199a(b.getId());
            if (a != null) {
                a.mo235244a(b.getStatus());
            }
            Iterator<AbstractC67769b<B>> it = C67771a.this.f170678a.iterator();
            while (it.hasNext()) {
                it.next().mo235149c(b);
            }
        }

        @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67770c
        /* renamed from: b */
        public void mo235197b(B b) {
            C67780a<B> a = C67771a.this.mo235199a(b.getId());
            if (a != null) {
                a.mo235244a(b.getStatus());
            }
            Iterator<AbstractC67769b<B>> it = C67771a.this.f170678a.iterator();
            while (it.hasNext()) {
                AbstractC67769b<B> next = it.next();
                if (next != null) {
                    next.mo235140a(b);
                }
            }
        }

        @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67770c
        /* renamed from: c */
        public void mo235198c(B b) {
            C67780a<B> a = C67771a.this.mo235199a(b.getId());
            if (a != null) {
                a.mo235244a(3);
            }
            Iterator<AbstractC67769b<B>> it = C67771a.this.f170678a.iterator();
            while (it.hasNext()) {
                it.next().mo235147b(b);
            }
            if (a != null) {
                C67771a.this.mo235201a(a, false);
            }
        }

        @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67770c
        /* renamed from: a */
        public void mo235195a(B b, long j) {
            C67780a<B> a = C67771a.this.mo235199a(b.getId());
            if (a != null) {
                a.mo235244a(b.getStatus());
            }
            Iterator<AbstractC67769b<B>> it = C67771a.this.f170678a.iterator();
            while (it.hasNext()) {
                AbstractC67769b<B> next = it.next();
                if (next != null) {
                    next.mo235141a(b, j);
                }
            }
        }

        @Override // com.tt.refer.common.download.engine.p3421c.AbstractC67770c
        /* renamed from: a */
        public void mo235196a(B b, String str, String str2, boolean z) {
            C67780a<B> a = C67771a.this.mo235199a(b.getId());
            if (a != null) {
                a.mo235244a(b.getStatus());
            }
            Iterator<AbstractC67769b<B>> it = C67771a.this.f170678a.iterator();
            while (it.hasNext()) {
                it.next().mo235142a(b, str, str2);
            }
            if (a != null) {
                C67771a.this.mo235201a(a, z);
            }
        }
    };

    /* renamed from: h */
    private int f170685h;

    /* renamed from: i */
    private AbstractC67774b<B> f170686i;

    /* renamed from: c */
    private boolean m263704c() {
        if (this.f170681d.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m263705d() {
        if (this.f170681d.size() >= this.f170685h) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m263706e() {
        try {
            Iterator<C67780a<B>> it = this.f170681d.iterator();
            while (it.hasNext()) {
                C67780a<B> next = it.next();
                if (next.mo235246b() == 1) {
                    AppBrandLogger.m52830i("file_download_task", next.mo235243a(), " task is doing or starting");
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            AppBrandLogger.m52829e("file_download_task", "isAllStop exception:" + e.getMessage());
        }
        return true;
    }

    @Override // com.tt.refer.common.download.engine.p3423d.AbstractC67775c
    /* renamed from: a */
    public synchronized boolean mo235202a() {
        AbstractC67762a<B> a;
        AppBrandLogger.m52830i("file_download_task", "start task,parallel limit num:", Integer.valueOf(this.f170685h), "current task num:", Integer.valueOf(this.f170681d.size()));
        while (true) {
            if (m263705d()) {
                break;
            }
            C67780a<B> b = mo235204b();
            if (b == null) {
                break;
            }
            AppBrandLogger.m52830i("file_download_task", "start task,find next task:", b.mo235243a(), " status:", Integer.valueOf(b.mo235246b()));
            this.f170681d.offer(b);
        }
        if (m263704c()) {
            return false;
        }
        Iterator<C67780a<B>> it = this.f170681d.iterator();
        while (it.hasNext()) {
            C67780a<B> next = it.next();
            if (next.f170704a == null && (a = this.f170686i.mo235138a(next.mo235243a())) != null) {
                next.f170704a = a;
                next.f170704a.mo235174a(this.f170684g);
            }
            if (next.f170704a == null) {
                AppBrandLogger.m52829e("file_download_task", "start task, mDownloadTask create failed");
                return false;
            } else if (next.f170704a.mo235179c() == 1) {
                AppBrandLogger.m52830i("file_download_task", next.mo235243a(), " is doing or starting,continue downlaoding");
            } else if (1 != next.f170704a.mo235171a(new int[0])) {
                AppBrandLogger.m52830i("file_download_task", "start task failed, task id:", next.mo235243a());
                return false;
            } else {
                this.f170679b = true;
                next.mo235244a(1);
                AppBrandLogger.m52830i("file_download_task", "start task success,task id:", next.mo235243a());
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C67780a<B> mo235204b() {
        C67780a<B> aVar;
        try {
            AppBrandLogger.m52830i("file_download_task", "before sort:", this.f170682e.toString());
            Collections.sort(this.f170682e, this.f170683f);
            AppBrandLogger.m52830i("file_download_task", "after sort:", this.f170682e.toString());
            Iterator<C67780a<B>> it = this.f170682e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (aVar.mo235246b() == 0) {
                    AppBrandLogger.m52830i("file_download_task", "find next task, target:", aVar.mo235243a(), " status:", Integer.valueOf(aVar.mo235246b()));
                    break;
                }
                AppBrandLogger.m52830i("file_download_task", "find next task, skip:", aVar.mo235243a(), " status:", Integer.valueOf(aVar.mo235246b()));
            }
            if (aVar != null) {
                this.f170682e.remove(aVar);
                AppBrandLogger.m52830i("file_download_task", "next task:", aVar.toString());
            } else {
                AppBrandLogger.m52830i("file_download_task", "cannot find next task");
            }
            AppBrandLogger.m52830i("file_download_task", "***find next task end***");
            return aVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.tt.refer.common.download.engine.d.a$a */
    public class C67773a implements Comparator<C67780a<B>> {
        private C67773a() {
        }

        /* renamed from: a */
        public int compare(C67780a<B> aVar, C67780a<B> aVar2) {
            return aVar2.mo235248c() - aVar.mo235248c();
        }
    }

    @Override // com.tt.refer.common.download.engine.p3423d.AbstractC67775c
    /* renamed from: a */
    public void mo235200a(AbstractC67769b<B> bVar) {
        this.f170678a.add(bVar);
    }

    /* renamed from: b */
    private String m263703b(C67780a<B> aVar) {
        if (aVar != null) {
            return aVar.mo235243a();
        }
        return "";
    }

    @Override // com.tt.refer.common.download.engine.p3423d.AbstractC67775c
    /* renamed from: a */
    public synchronized boolean mo235203a(C67780a<B> aVar) {
        if (mo235199a(m263703b(aVar)) != null) {
            AppBrandLogger.m52830i("file_download_task", "add task, task id:", m263703b(aVar), " is duplicated");
            return false;
        }
        aVar.mo235245a(this);
        aVar.mo235244a(0);
        this.f170682e.offer(aVar);
        return true;
    }

    /* renamed from: a */
    public C67780a<B> mo235199a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Iterator<C67780a<B>> it = this.f170681d.iterator();
            while (it.hasNext()) {
                C67780a<B> next = it.next();
                if (str.equals(m263703b(next))) {
                    return next;
                }
            }
            Iterator<C67780a<B>> it2 = this.f170682e.iterator();
            while (it2.hasNext()) {
                C67780a<B> next2 = it2.next();
                if (str.equals(m263703b(next2))) {
                    return next2;
                }
            }
        } catch (ConcurrentModificationException e) {
            e.printStackTrace();
            AppBrandLogger.m52829e("file_download_task", "getTaskById->ConcurrentModificationException task is:", str);
        }
        return null;
    }

    public C67771a(AbstractC67774b<B> bVar, int i) {
        this.f170686i = bVar;
        this.f170685h = Math.max(i, 1);
    }

    /* renamed from: a */
    public synchronized void mo235201a(C67780a<B> aVar, boolean z) {
        AbstractC67762a<B> a;
        if (aVar == null) {
            AppBrandLogger.m52830i("file_download_task", "notify task finished, task is null");
        } else if (!this.f170681d.contains(aVar)) {
            AppBrandLogger.m52830i("file_download_task", "notify task finished, current excuted task not contains current task:", aVar.mo235243a());
            if (!z || aVar.mo235246b() != 0) {
                this.f170682e.remove(aVar);
            } else if (!this.f170682e.contains(aVar)) {
                this.f170682e.offer(aVar);
            }
        } else if (aVar.mo235246b() == 1) {
            AppBrandLogger.m52830i("file_download_task", "notify task finished, ", aVar.mo235243a(), " task status is illegal:", Integer.valueOf(aVar.mo235246b()));
        } else {
            this.f170681d.remove(aVar);
            C67780a<B> b = mo235204b();
            if (b != null) {
                this.f170681d.offer(b);
            }
            if (z && aVar.mo235246b() != 3 && !this.f170682e.contains(aVar)) {
                AppBrandLogger.m52830i("file_download_task", "notify task finished, addback to mTobeExecuted:", aVar.mo235243a());
                this.f170682e.offer(aVar);
            }
            AppBrandLogger.m52830i("file_download_task", "notify task finished,mIsWorking:", Boolean.valueOf(this.f170679b), " mAuto:", Boolean.valueOf(this.f170680c));
            if (!this.f170679b || !this.f170680c) {
                AppBrandLogger.m52830i("file_download_task", "notify task finished, mIsWorking or mAuto is illegal");
                if (m263706e()) {
                    AppBrandLogger.m52830i("file_download_task", "notify task finished, all task stoped");
                    Iterator<AbstractC67769b<B>> it = this.f170678a.iterator();
                    while (it.hasNext()) {
                        it.next().mo235139a();
                    }
                }
                return;
            }
            if (b != null) {
                if (b.f170704a == null && (a = this.f170686i.mo235138a(b.mo235243a())) != null) {
                    b.f170704a = a;
                    b.f170704a.mo235174a(this.f170684g);
                }
                if (b.f170704a != null) {
                    int a2 = b.f170704a.mo235171a(new int[0]);
                    if (1 == a2) {
                        AppBrandLogger.m52830i("file_download_task", "notify task finished,start success:", b.mo235243a());
                    } else {
                        AppBrandLogger.m52830i("file_download_task", "notify task finished,start fail:", b.mo235243a(), " status:", Integer.valueOf(a2));
                    }
                }
            } else if (m263704c() && this.f170682e.size() == 0) {
                this.f170679b = false;
                AppBrandLogger.m52830i("file_download_task", "notify task finished, mTobeExcuted is empty, callback onFinishAll");
                Iterator<AbstractC67769b<B>> it2 = this.f170678a.iterator();
                while (it2.hasNext()) {
                    it2.next().mo235146b();
                }
            }
        }
    }
}

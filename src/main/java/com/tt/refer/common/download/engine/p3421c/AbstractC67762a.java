package com.tt.refer.common.download.engine.p3421c;

import com.tt.refer.common.download.engine.model.DownloadBean;

/* renamed from: com.tt.refer.common.download.engine.c.a */
public abstract class AbstractC67762a<B extends DownloadBean> {

    /* renamed from: a */
    private volatile int f170650a;

    /* renamed from: b */
    private B f170651b;

    /* renamed from: c */
    private AbstractC67770c<B> f170652c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo235178b(String str, String str2, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo235182f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo235183g();

    /* renamed from: a */
    public B mo235172a() {
        return this.f170651b;
    }

    /* renamed from: b */
    public String mo235176b() {
        return this.f170651b.getId();
    }

    /* renamed from: c */
    public synchronized int mo235179c() {
        return this.f170650a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = r3.f170652c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        r0.mo235198c(mo235172a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return true;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo235180d() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.mo235179c()     // Catch:{ all -> 0x0024 }
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x000b
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            return r1
        L_0x000b:
            boolean r0 = r3.mo235183g()     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0013
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            return r1
        L_0x0013:
            r0 = 3
            r3.mo235173a(r0)     // Catch:{ all -> 0x0024 }
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            com.tt.refer.common.download.engine.c.c<B extends com.tt.refer.common.download.engine.model.DownloadBean> r0 = r3.f170652c
            if (r0 == 0) goto L_0x0023
            com.tt.refer.common.download.engine.model.DownloadBean r1 = r3.mo235172a()
            r0.mo235198c(r1)
        L_0x0023:
            return r2
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.common.download.engine.p3421c.AbstractC67762a.mo235180d():boolean");
    }

    /* renamed from: e */
    public void mo235181e() {
        if (this.f170652c != null) {
            if (mo235179c() != mo235172a().getStatus()) {
                mo235172a().setStatus(mo235179c());
            }
            this.f170652c.mo235197b(mo235172a());
        }
    }

    /* renamed from: a */
    public void mo235174a(AbstractC67770c<B> cVar) {
        this.f170652c = cVar;
    }

    public AbstractC67762a(B b) {
        this.f170651b = b;
        this.f170650a = b.getStatus();
    }

    /* renamed from: a */
    public synchronized void mo235173a(int i) {
        this.f170650a = i;
        this.f170651b.setStatus(i);
    }

    /* renamed from: b */
    public void mo235177b(long j) {
        if (this.f170652c != null) {
            if (mo235179c() != mo235172a().getStatus()) {
                mo235172a().setStatus(mo235179c());
            }
            this.f170652c.mo235195a(mo235172a(), j);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        r8 = r7.f170652c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        if (r8 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a4, code lost:
        r8.mo235194a(mo235172a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52830i("XBaseTaskExecutor", mo235176b() + " start task success:", java.lang.Integer.valueOf(mo235179c()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d3, code lost:
        return 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo235171a(int... r8) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.common.download.engine.p3421c.AbstractC67762a.mo235171a(int[]):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r0 = r4.f170652c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r0 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        r0.mo235196a(mo235172a(), r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger.m52830i("XBaseTaskExecutor", mo235176b() + " end error success");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo235175a(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.common.download.engine.p3421c.AbstractC67762a.mo235175a(java.lang.String, java.lang.String, boolean):boolean");
    }
}

package com.ss.android.socialbase.downloader.p3028e;

import android.os.Process;
import com.ss.android.socialbase.downloader.downloader.AbstractC60059i;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.C60050d;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.AbstractC60137g;

/* renamed from: com.ss.android.socialbase.downloader.e.b */
public class RunnableC60070b implements Runnable {

    /* renamed from: a */
    private static final String f149818a = "b";

    /* renamed from: b */
    private DownloadChunk f149819b;

    /* renamed from: c */
    private DownloadChunk f149820c;

    /* renamed from: d */
    private C60050d f149821d;

    /* renamed from: e */
    private final DownloadTask f149822e;

    /* renamed from: f */
    private DownloadInfo f149823f;

    /* renamed from: g */
    private final AbstractC60076e f149824g;

    /* renamed from: h */
    private AbstractC60137g f149825h;

    /* renamed from: i */
    private AbstractC60059i f149826i;

    /* renamed from: j */
    private volatile boolean f149827j;

    /* renamed from: k */
    private volatile boolean f149828k;

    /* renamed from: l */
    private boolean f149829l;

    /* renamed from: c */
    private String m233223c() {
        return this.f149823f.getConnectionUrl();
    }

    /* renamed from: d */
    private void m233224d() {
        AbstractC60137g gVar = this.f149825h;
        if (gVar != null) {
            gVar.mo204950d();
            this.f149825h = null;
        }
    }

    /* renamed from: e */
    private boolean m233225e() {
        if (this.f149827j || this.f149828k) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo204840a() {
        this.f149827j = true;
        C60050d dVar = this.f149821d;
        if (dVar != null) {
            dVar.mo204720b();
        }
    }

    /* renamed from: b */
    public void mo204842b() {
        this.f149828k = true;
        C60050d dVar = this.f149821d;
        if (dVar != null) {
            dVar.mo204721c();
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        Process.setThreadPriority(10);
        this.f149819b = this.f149820c;
        while (true) {
            try {
                this.f149819b.mo205000a(this);
                if (m233222a(this.f149819b)) {
                    this.f149819b.mo205003a(false);
                    if (!m233225e()) {
                        this.f149819b = this.f149824g.mo204846a(this.f149819b.mo205027s());
                        if (m233225e() || this.f149819b == null) {
                            break;
                        }
                        try {
                            Thread.sleep(50);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else {
                        break;
                    }
                } else {
                    this.f149819b.mo205003a(false);
                    break;
                }
            } catch (Throwable th2) {
                DownloadChunk downloadChunk = this.f149819b;
                if (downloadChunk != null) {
                    downloadChunk.mo205003a(false);
                }
                m233224d();
                this.f149824g.mo204848a(this);
                throw th2;
            }
        }
        DownloadChunk downloadChunk2 = this.f149819b;
        if (downloadChunk2 != null) {
            downloadChunk2.mo205003a(false);
        }
        m233224d();
        this.f149824g.mo204848a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01a9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01ad, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ae, code lost:
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01b3, code lost:
        if (m233225e() == false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01b8, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233765a(r0, "downloadChunkInner");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01c0, code lost:
        r30.f149824g.mo204857b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ca, code lost:
        r14 = r6;
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01d3, code lost:
        m233224d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01d6, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01db, code lost:
        if (com.ss.android.socialbase.downloader.utils.C60161d.m233794b(r0) != false) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x01dd, code lost:
        r30.f149824g.mo204849a(r0, r13);
        m233224d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01e5, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x01ec, code lost:
        if (r30.f149824g.mo204854a(r0) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01f2, code lost:
        if (com.ss.android.socialbase.downloader.utils.C60161d.m233774a(r0) != false) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01f4, code lost:
        r30.f149824g.mo204849a(r0, true);
        m233224d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01fc, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01fd, code lost:
        if (r5 != false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0201, code lost:
        if (r30.f149821d != null) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0209, code lost:
        if (com.ss.android.socialbase.downloader.utils.C60158a.m233738a(32) != false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x020b, code lost:
        r2 = r30.f149821d.mo204717a() - r30.f149821d.mo204723e();
        r4 = (r2 > 0 ? 1 : (r2 == 0 ? 0 : -1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x021a, code lost:
        if (r4 > 0) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x021c, code lost:
        m233221a(r31, r30.f149821d.mo204723e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0226, code lost:
        if (r4 < 0) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0229, code lost:
        r21 = r30.f149821d.mo204717a() - r14;
        m233221a(r31, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0235, code lost:
        r30.f149824g.mo204857b(r0);
        m233224d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x023d, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x023e, code lost:
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0246, code lost:
        if (com.ss.android.socialbase.downloader.utils.C60158a.m233738a(16) == false) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0248, code lost:
        r0 = r30.f149824g.mo204845a(r31, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x024f, code lost:
        r0 = r30.f149824g.mo204844a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0257, code lost:
        if (r0 != com.ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0259, code lost:
        m233224d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x025c, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x026e, code lost:
        if (r30.f149823f.isNeedChunkDowngradeRetry() == false) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0288, code lost:
        r30.f149824g.mo204859c(r0);
        m233224d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0290, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0291, code lost:
        r30.f149824g.mo204857b(r0);
        m233224d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0299, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x029a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x029b, code lost:
        m233224d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x029e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x016e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x016f, code lost:
        r5 = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01a9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:81:0x013b] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01ad A[ExcHandler: all (th java.lang.Throwable), Splitter:B:20:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01b5 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x025d A[LOOP:0: B:1:0x0004->B:171:0x025d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0259 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x01d3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x00f6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m233222a(com.ss.android.socialbase.downloader.model.DownloadChunk r31) {
        /*
        // Method dump skipped, instructions count: 671
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.p3028e.RunnableC60070b.m233222a(com.ss.android.socialbase.downloader.model.DownloadChunk):boolean");
    }

    /* renamed from: a */
    public void mo204841a(long j, long j2) {
        C60050d dVar = this.f149821d;
        if (dVar != null) {
            dVar.mo204718a(j, j2);
        }
    }

    /* renamed from: a */
    private void m233221a(DownloadChunk downloadChunk, long j) {
        DownloadChunk downloadChunk2;
        if (downloadChunk.mo205011d()) {
            downloadChunk2 = downloadChunk.mo205013e();
        } else {
            downloadChunk2 = downloadChunk;
        }
        if (downloadChunk2 != null) {
            if (downloadChunk2.mo205016h()) {
                this.f149826i.updateDownloadChunk(downloadChunk2.mo205019k(), downloadChunk2.mo205004b(), j);
            }
            downloadChunk2.mo205006b(j);
            this.f149826i.updateSubDownloadChunk(downloadChunk2.mo205019k(), downloadChunk2.mo205027s(), downloadChunk2.mo205004b(), j);
        } else if (downloadChunk.mo205011d()) {
            this.f149826i.updateDownloadChunk(downloadChunk.mo205019k(), downloadChunk.mo205027s(), j);
        }
    }

    public RunnableC60070b(DownloadChunk downloadChunk, DownloadTask downloadTask, AbstractC60076e eVar) {
        this.f149820c = downloadChunk;
        this.f149822e = downloadTask;
        if (downloadTask != null) {
            this.f149823f = downloadTask.getDownloadInfo();
        }
        this.f149824g = eVar;
        this.f149826i = C60046b.m233010t();
        this.f149820c.mo205000a(this);
    }

    public RunnableC60070b(DownloadChunk downloadChunk, DownloadTask downloadTask, AbstractC60137g gVar, AbstractC60076e eVar) {
        this(downloadChunk, downloadTask, eVar);
        this.f149825h = gVar;
    }
}

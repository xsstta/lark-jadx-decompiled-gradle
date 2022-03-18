package com.ss.android.socialbase.downloader.p3028e;

import android.os.Handler;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus;
import com.ss.android.socialbase.downloader.constants.RunStatus;
import com.ss.android.socialbase.downloader.depend.AbstractC60029g;
import com.ss.android.socialbase.downloader.depend.AbstractC60033k;
import com.ss.android.socialbase.downloader.depend.AbstractC60035m;
import com.ss.android.socialbase.downloader.downloader.AbstractC60057g;
import com.ss.android.socialbase.downloader.downloader.AbstractC60058h;
import com.ss.android.socialbase.downloader.downloader.AbstractC60059i;
import com.ss.android.socialbase.downloader.downloader.AbstractC60067q;
import com.ss.android.socialbase.downloader.downloader.C60046b;
import com.ss.android.socialbase.downloader.downloader.C60050d;
import com.ss.android.socialbase.downloader.downloader.C60052e;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadFileExistException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadOutOfSpaceException;
import com.ss.android.socialbase.downloader.exception.DownloadPauseReserveWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.ss.android.socialbase.downloader.exception.RetryCheckStatus;
import com.ss.android.socialbase.downloader.impls.AbstractC60081a;
import com.ss.android.socialbase.downloader.impls.C60095e;
import com.ss.android.socialbase.downloader.impls.C60109p;
import com.ss.android.socialbase.downloader.impls.C60110q;
import com.ss.android.socialbase.downloader.model.C60122a;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.AbstractC60123a;
import com.ss.android.socialbase.downloader.network.AbstractC60135e;
import com.ss.android.socialbase.downloader.network.AbstractC60137g;
import com.ss.android.socialbase.downloader.network.C60131b;
import com.ss.android.socialbase.downloader.network.p3029a.C60124a;
import com.ss.android.socialbase.downloader.network.p3029a.C60129c;
import com.ss.android.socialbase.downloader.network.p3029a.C60130d;
import com.ss.android.socialbase.downloader.p3025b.C59990a;
import com.ss.android.socialbase.downloader.p3026c.C59992a;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60158a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;

/* renamed from: com.ss.android.socialbase.downloader.e.c */
public class RunnableC60071c implements AbstractC60076e, Runnable {

    /* renamed from: a */
    private static final String f149830a = "c";

    /* renamed from: A */
    private AbstractC60029g f149831A;

    /* renamed from: B */
    private volatile int f149832B = 5;

    /* renamed from: C */
    private boolean f149833C = false;

    /* renamed from: D */
    private boolean f149834D = false;

    /* renamed from: E */
    private String f149835E;

    /* renamed from: F */
    private long f149836F;

    /* renamed from: G */
    private long f149837G;

    /* renamed from: H */
    private final C60148a f149838H;

    /* renamed from: b */
    private Future f149839b;

    /* renamed from: c */
    private final DownloadTask f149840c;

    /* renamed from: d */
    private volatile boolean f149841d;

    /* renamed from: e */
    private AtomicInteger f149842e;

    /* renamed from: f */
    private final ArrayList<RunnableC60070b> f149843f = new ArrayList<>();

    /* renamed from: g */
    private volatile C60050d f149844g;

    /* renamed from: h */
    private boolean f149845h;

    /* renamed from: i */
    private boolean f149846i;

    /* renamed from: j */
    private boolean f149847j;

    /* renamed from: k */
    private boolean f149848k;

    /* renamed from: l */
    private boolean f149849l;

    /* renamed from: m */
    private final AtomicBoolean f149850m;

    /* renamed from: n */
    private volatile RunStatus f149851n = RunStatus.RUN_STATUS_NONE;

    /* renamed from: o */
    private final AbstractC60059i f149852o;

    /* renamed from: p */
    private DownloadInfo f149853p;

    /* renamed from: q */
    private AbstractC60058h f149854q;

    /* renamed from: r */
    private final AbstractC60058h f149855r;

    /* renamed from: s */
    private AbstractC60057g f149856s;

    /* renamed from: t */
    private final AbstractC60057g f149857t;

    /* renamed from: u */
    private AbstractC60067q f149858u;

    /* renamed from: v */
    private final C60052e f149859v;

    /* renamed from: w */
    private volatile BaseException f149860w;

    /* renamed from: x */
    private AbstractC60137g f149861x;

    /* renamed from: y */
    private AbstractC60135e f149862y;

    /* renamed from: z */
    private AbstractC60033k f149863z;

    /* renamed from: H */
    private boolean m233236H() {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.socialbase.downloader.e.c$a */
    public class C60074a extends Throwable {
        private String errorMsg;

        public String getErrorMsg() {
            return this.errorMsg;
        }

        public void setErrorMsg(String str) {
            this.errorMsg = str;
        }

        public C60074a(String str) {
            super(str);
            this.errorMsg = str;
        }
    }

    /* renamed from: c */
    public DownloadTask mo204858c() {
        return this.f149840c;
    }

    /* renamed from: h */
    public Future mo204864h() {
        return this.f149839b;
    }

    /* renamed from: a */
    public void mo204847a() {
        this.f149851n = RunStatus.RUN_STATUS_PAUSE;
        if (this.f149844g != null) {
            this.f149844g.mo204720b();
        } else {
            m233262q();
            this.f149851n = RunStatus.RUN_STATUS_PAUSE;
            m233259n();
        }
        try {
            Iterator it = ((ArrayList) this.f149843f.clone()).iterator();
            while (it.hasNext()) {
                RunnableC60070b bVar = (RunnableC60070b) it.next();
                if (bVar != null) {
                    bVar.mo204840a();
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m233248a(String str, List<HttpHeader> list, long j) throws BaseException, C60074a {
        m233251b(str, list, j);
        AbstractC60135e eVar = this.f149862y;
        if (eVar != null) {
            try {
                m233245a(eVar, j);
            } catch (Throwable unused) {
                this.f149834D = true;
            }
        }
        if (this.f149862y == null || this.f149834D) {
            m233247a(str, list);
            m233245a(this.f149861x, j);
        }
    }

    /* renamed from: a */
    private void m233247a(String str, List<HttpHeader> list) throws BaseException, C60074a {
        AbstractC60137g gVar;
        if (this.f149861x == null) {
            C60130d dVar = null;
            if (this.f149853p.getChunkCount() == 1) {
                dVar = C60124a.m233655a().mo205428b(str, list);
            }
            if (dVar != null) {
                mo204850a(this.f149861x);
                this.f149853p.setPreconnectLevel(2);
                this.f149861x = dVar;
            } else {
                try {
                    gVar = C60046b.m232956a(this.f149853p.isNeedDefaultHttpServiceBackUp(), this.f149853p.getMaxBytes(), str, list, this.f149838H.mo205474b("net_lib_strategy"), this.f149838H.mo205470a("monitor_download_connect", 0) > 0, this.f149853p);
                    this.f149861x = gVar;
                } catch (BaseException e) {
                    throw e;
                } catch (Throwable th) {
                    mo204850a(this.f149861x);
                    throw th;
                }
                mo204850a(gVar);
            }
            if (this.f149861x == null) {
                throw new BaseException(1022, new IOException("download can't continue, firstConnection is null"));
            }
        }
    }

    /* renamed from: a */
    private void m233249a(List<DownloadChunk> list, long j) throws BaseException {
        long j2;
        for (DownloadChunk downloadChunk : list) {
            if (downloadChunk != null) {
                if (downloadChunk.mo205024p() == 0) {
                    j2 = j - downloadChunk.mo205022n();
                } else {
                    j2 = (downloadChunk.mo205024p() - downloadChunk.mo205022n()) + 1;
                }
                if (j2 > 0) {
                    downloadChunk.mo204998a(j2);
                    if (!this.f149853p.isNeedReuseFirstConnection() || this.f149861x == null || (this.f149853p.isHeadConnectionAvailable() && !this.f149834D)) {
                        this.f149843f.add(new RunnableC60070b(downloadChunk, this.f149840c, this));
                    } else if (downloadChunk.mo205027s() == 0) {
                        this.f149843f.add(new RunnableC60070b(downloadChunk, this.f149840c, this.f149861x, this));
                    } else if (downloadChunk.mo205027s() > 0) {
                        this.f149843f.add(new RunnableC60070b(downloadChunk, this.f149840c, this));
                    }
                }
            }
        }
        if (C60158a.m233738a(64)) {
            ArrayList arrayList = new ArrayList(this.f149843f.size());
            Iterator<RunnableC60070b> it = this.f149843f.iterator();
            while (it.hasNext()) {
                RunnableC60070b next = it.next();
                if (this.f149851n == RunStatus.RUN_STATUS_CANCELED) {
                    next.mo204842b();
                } else if (this.f149851n == RunStatus.RUN_STATUS_PAUSE) {
                    next.mo204840a();
                } else {
                    arrayList.add(next);
                }
            }
            try {
                List<Future> d = C60095e.m233375d(arrayList);
                for (Runnable runnable = (Runnable) arrayList.remove(0); runnable != null; runnable = C60095e.m233376e(d)) {
                    if (!m233265t()) {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    } else {
                        return;
                    }
                }
                if (!(d == null || d.isEmpty())) {
                    for (Future future : d) {
                        if (future != null && !future.isDone()) {
                            try {
                                future.get();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        } else {
            ArrayList arrayList2 = new ArrayList(this.f149843f.size());
            Iterator<RunnableC60070b> it2 = this.f149843f.iterator();
            while (it2.hasNext()) {
                RunnableC60070b next2 = it2.next();
                if (this.f149851n == RunStatus.RUN_STATUS_CANCELED) {
                    next2.mo204842b();
                } else if (this.f149851n == RunStatus.RUN_STATUS_PAUSE) {
                    next2.mo204840a();
                } else {
                    arrayList2.add(Executors.callable(next2));
                }
            }
            if (!m233265t()) {
                try {
                    C60095e.m233374c(arrayList2);
                } catch (InterruptedException e) {
                    throw new BaseException(1020, e);
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m233250a(int i, String str, String str2) {
        if (i == 412) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2) && (this.f149848k || this.f149847j)) {
            return true;
        }
        if ((i == 201 || i == 416) && this.f149853p.getCurBytes() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m233246a(String str, String str2) throws C60074a {
        this.f149852o.removeAllDownloadChunk(this.f149853p.getId());
        C60161d.m233759a(this.f149853p);
        this.f149846i = false;
        this.f149853p.resetDataForEtagEndure(str);
        this.f149852o.updateDownloadInfo(this.f149853p);
        throw new C60074a(str2);
    }

    /* renamed from: a */
    private void m233245a(AbstractC60135e eVar, long j) throws BaseException, C60074a {
        String str;
        long j2;
        if (eVar != null) {
            try {
                int a = eVar.mo204945a();
                String a2 = eVar.mo204946a("Accept-Ranges");
                String a3 = eVar.mo204946a("Content-Type");
                if (TextUtils.isEmpty(this.f149853p.getMimeType()) && !TextUtils.isEmpty(a3)) {
                    this.f149853p.setMimeType(a3);
                }
                this.f149847j = C60161d.m233770a(a, a2);
                this.f149848k = C60161d.m233803c(a);
                this.f149853p.setSupportPartial(this.f149847j);
                String str2 = this.f149853p.geteTag();
                String a4 = eVar.mo204946a("Etag");
                if (m233250a(a, str2, a4)) {
                    if (eVar instanceof AbstractC60137g) {
                        if (!TextUtils.isEmpty(str2) && str2.equals(a4)) {
                            a4 = "";
                        }
                        m233246a(a4, "eTag of server file changed");
                    } else {
                        throw new DownloadHttpException(1002, a, "");
                    }
                }
                if (this.f149847j || this.f149848k) {
                    if (this.f149848k && j > 0) {
                        if (eVar instanceof AbstractC60137g) {
                            m233246a("", "http head request not support");
                        } else {
                            throw new BaseException(1004, "isResponseFromBegin but firstOffset > 0");
                        }
                    }
                    long a5 = C60161d.m233743a(eVar);
                    if (TextUtils.isEmpty(this.f149853p.getName())) {
                        str = C60161d.m233746a(eVar, this.f149853p.getUrl());
                    } else {
                        str = "";
                    }
                    if (C60158a.m233738a(8)) {
                        this.f149849l = C60161d.m233805c(eVar);
                    } else {
                        this.f149849l = C60161d.m233792b(a5);
                    }
                    boolean z = this.f149849l;
                    if (z || a5 != 0 || (eVar instanceof AbstractC60137g)) {
                        if (!z) {
                            String b = C60161d.m233785b(eVar, "Content-Range");
                            j2 = (TextUtils.isEmpty(b) || !C60158a.m233738a(2)) ? j + a5 : C60161d.m233744a(b);
                        } else {
                            j2 = -1;
                        }
                        if (!m233265t()) {
                            if (this.f149853p.getExpectFileLength() <= 0 || C60148a.m233720a(this.f149853p.getId()).mo205474b("force_check_file_length") != 1 || this.f149853p.getExpectFileLength() == j2) {
                                this.f149859v.mo204727a(j2, a4, str);
                                return;
                            }
                            throw new BaseException(1070, "expectFileLength = " + this.f149853p.getExpectFileLength() + " , totalLength = " + j2);
                        }
                        return;
                    }
                    throw new BaseException(1004, "");
                } else if (a == 403) {
                    throw new BaseException(1047, "response code error : 403");
                } else {
                    throw new DownloadHttpException(1004, a, "response code error : " + a);
                }
            } catch (BaseException e) {
                throw e;
            } catch (C60074a e2) {
                throw e2;
            } catch (Throwable th) {
                C60161d.m233765a(th, "HandleFirstConnection");
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: a */
    public boolean mo204853a(long j) throws BaseException {
        if (this.f149836F > 0 && this.f149853p.getCurBytes() > this.f149836F) {
            m233230B();
        }
        return this.f149859v.mo204732a(j);
    }

    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: a */
    public boolean mo204854a(BaseException baseException) {
        if (C60161d.m233794b(baseException)) {
            if (this.f149845h && !this.f149841d) {
                C60161d.m233759a(this.f149853p);
                this.f149841d = true;
            }
            return true;
        }
        AtomicInteger atomicInteger = this.f149842e;
        if (((atomicInteger == null || atomicInteger.get() <= 0) && !this.f149853p.hasNextBackupUrl() && (baseException == null || ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f149853p.canReplaceHttpForRetry()))) || (baseException instanceof DownloadRetryNeedlessException)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: a */
    public void mo204849a(BaseException baseException, boolean z) {
        C59990a.m232838b(f149830a, "onAllChunkRetryWithReset");
        this.f149851n = RunStatus.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;
        this.f149860w = baseException;
        m233235G();
        if (!(z ? m233253d(baseException) : false)) {
            m233234F();
        }
    }

    /* renamed from: a */
    public void mo204851a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            this.f149853p.setForbiddenBackupUrls(list, this.f149851n == RunStatus.RUN_STATUS_WAITING_ASYNC_HANDLER);
            AbstractC60081a x = C60046b.m233014x();
            if (x != null) {
                x.mo204928l(this.f149853p.getId());
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: a */
    public RetryCheckStatus mo204845a(DownloadChunk downloadChunk, BaseException baseException, long j) {
        if (m233264s()) {
            return RetryCheckStatus.RETURN;
        }
        if (baseException != null && (baseException.getErrorCode() == 1047 || C60161d.m233822g(baseException))) {
            return mo204844a(baseException, j);
        }
        this.f149860w = baseException;
        this.f149853p.increaseCurBytes(-j);
        this.f149852o.updateDownloadInfo(this.f149853p);
        if (m233253d(baseException)) {
            return RetryCheckStatus.RETURN;
        }
        this.f149859v.mo204730a(downloadChunk, baseException, this.f149851n == RunStatus.RUN_STATUS_RETRY_DELAY);
        if (this.f149851n != RunStatus.RUN_STATUS_RETRY_DELAY && this.f149853p.isNeedRetryDelay()) {
            long y = m233270y();
            if (y > 0) {
                String str = f149830a;
                C59990a.m232839c(str, "onSingleChunkRetry with delay time " + y);
                try {
                    Thread.sleep(y);
                } catch (Throwable th) {
                    String str2 = f149830a;
                    C59990a.m232840d(str2, "onSingleChunkRetry:" + th.getMessage());
                }
            }
        }
        return RetryCheckStatus.CONTINUE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        if (m233253d(r8) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d8, code lost:
        return com.ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011a  */
    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.socialbase.downloader.exception.RetryCheckStatus mo204844a(com.ss.android.socialbase.downloader.exception.BaseException r8, long r9) {
        /*
        // Method dump skipped, instructions count: 285
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.p3028e.RunnableC60071c.mo204844a(com.ss.android.socialbase.downloader.exception.BaseException, long):com.ss.android.socialbase.downloader.exception.RetryCheckStatus");
    }

    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: a */
    public synchronized DownloadChunk mo204846a(int i) {
        DownloadChunk a;
        if (this.f149853p.getChunkCount() < 2) {
            return null;
        }
        List<DownloadChunk> downloadChunk = this.f149852o.getDownloadChunk(this.f149853p.getId());
        if (downloadChunk == null || downloadChunk.isEmpty()) {
            return null;
        }
        for (int i2 = 0; i2 < downloadChunk.size(); i2++) {
            DownloadChunk downloadChunk2 = downloadChunk.get(i2);
            if (!(downloadChunk2 == null || (a = m233239a(downloadChunk2, i)) == null)) {
                return a;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo204850a(com.ss.android.socialbase.downloader.network.AbstractC60135e r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001a
            int r2 = r2.mo204945a()     // Catch:{ all -> 0x0016 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f149853p     // Catch:{ all -> 0x0016 }
            r0.setHttpStatusCode(r2)     // Catch:{ all -> 0x0016 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f149853p     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = com.ss.android.socialbase.downloader.utils.C60159b.m233739a(r2)     // Catch:{ all -> 0x0016 }
            r0.setHttpStatusMessage(r2)     // Catch:{ all -> 0x0016 }
            r2 = 1
            goto L_0x001b
        L_0x0016:
            r2 = move-exception
            r2.printStackTrace()
        L_0x001a:
            r2 = 0
        L_0x001b:
            if (r2 != 0) goto L_0x002a
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f149853p
            r0 = -1
            r2.setHttpStatusCode(r0)
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f149853p
            java.lang.String r0 = ""
            r2.setHttpStatusMessage(r0)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.p3028e.RunnableC60071c.mo204850a(com.ss.android.socialbase.downloader.network.e):void");
    }

    /* renamed from: q */
    private void m233262q() {
        m233260o();
        m233261p();
    }

    /* renamed from: x */
    private void m233269x() {
        this.f149851n = RunStatus.RUN_STATUS_NONE;
    }

    /* renamed from: d */
    public boolean mo204860d() {
        return this.f149850m.get();
    }

    /* renamed from: o */
    private void m233260o() {
        AbstractC60135e eVar = this.f149862y;
        if (eVar != null) {
            eVar.mo204947b();
            this.f149862y = null;
        }
    }

    /* renamed from: p */
    private void m233261p() {
        AbstractC60137g gVar = this.f149861x;
        if (gVar != null) {
            gVar.mo204950d();
            this.f149861x = null;
        }
    }

    /* renamed from: e */
    public int mo204861e() {
        DownloadInfo downloadInfo = this.f149853p;
        if (downloadInfo != null) {
            return downloadInfo.getId();
        }
        return 0;
    }

    /* renamed from: f */
    public void mo204862f() {
        this.f149837G = System.currentTimeMillis();
        this.f149859v.mo204725a();
    }

    public void run() {
        C60046b.m232973a(this.f149840c, 3);
        m233257l();
        C60046b.m232985b(this.f149840c, 3);
    }

    /* renamed from: s */
    private boolean m233264s() {
        if (this.f149851n == RunStatus.RUN_STATUS_CANCELED || this.f149851n == RunStatus.RUN_STATUS_PAUSE) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private long m233270y() {
        return this.f149858u.mo204838a(this.f149853p.getCurRetryTimeInTotal(), this.f149853p.getTotalRetryCount());
    }

    /* renamed from: b */
    public void mo204855b() {
        this.f149851n = RunStatus.RUN_STATUS_CANCELED;
        if (this.f149844g != null) {
            this.f149844g.mo204721c();
        } else {
            m233262q();
            this.f149851n = RunStatus.RUN_STATUS_CANCELED;
            m233259n();
        }
        m233235G();
    }

    /* renamed from: g */
    public void mo204863g() {
        AbstractC60081a x;
        if (!m233265t() && (x = C60046b.m233014x()) != null) {
            x.mo204928l(this.f149853p.getId());
        }
    }

    /* renamed from: A */
    private boolean m233229A() {
        DownloadInfo downloadInfo = this.f149853p;
        if (downloadInfo == null) {
            return false;
        }
        if ((!this.f149846i || downloadInfo.getChunkCount() > 1) && !this.f149853p.isChunkDowngradeRetryUsed() && this.f149847j && !this.f149849l) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private void m233233E() {
        boolean z;
        long e = C60161d.m233814e(this.f149853p);
        this.f149853p.setCurBytes(e);
        if (e > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f149846i = z;
        if (!z) {
            this.f149852o.removeAllDownloadChunk(this.f149853p.getId());
            C60161d.m233759a(this.f149853p);
        }
    }

    /* renamed from: F */
    private void m233234F() {
        try {
            this.f149852o.removeAllDownloadChunk(this.f149853p.getId());
            C60161d.m233759a(this.f149853p);
            this.f149846i = false;
            this.f149853p.resetDataForEtagEndure("");
            this.f149852o.updateDownloadInfo(this.f149853p);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: G */
    private void m233235G() {
        try {
            Iterator it = ((ArrayList) this.f149843f.clone()).iterator();
            while (it.hasNext()) {
                RunnableC60070b bVar = (RunnableC60070b) it.next();
                if (bVar != null) {
                    bVar.mo204842b();
                }
            }
        } catch (Throwable th) {
            String str = f149830a;
            C59990a.m232839c(str, "cancelAllChunkRunnable: " + th.toString());
        }
    }

    /* renamed from: i */
    private void m233254i() {
        DownloadInfo downloadInfo = this.f149853p;
        if (downloadInfo != null) {
            int retryCount = downloadInfo.getRetryCount() - this.f149853p.getCurRetryTime();
            if (retryCount < 0) {
                retryCount = 0;
            }
            AtomicInteger atomicInteger = this.f149842e;
            if (atomicInteger == null) {
                this.f149842e = new AtomicInteger(retryCount);
            } else {
                atomicInteger.set(retryCount);
            }
        }
    }

    /* renamed from: j */
    private boolean m233255j() {
        int status = this.f149853p.getStatus();
        if (status == 1 || this.f149853p.canSkipStatusHandler()) {
            return true;
        }
        if (status == -2 || status == -4) {
            return false;
        }
        mo204857b(new BaseException(1000, "The download Task can't start, because its status is not prepare:" + status));
        return false;
    }

    /* renamed from: r */
    private void m233263r() throws BaseException {
        if (this.f149844g == null) {
            return;
        }
        if (this.f149851n == RunStatus.RUN_STATUS_CANCELED) {
            this.f149853p.setStatus(-4);
            this.f149844g.mo204721c();
        } else if (this.f149851n == RunStatus.RUN_STATUS_PAUSE) {
            this.f149853p.setStatus(-2);
            this.f149844g.mo204720b();
        } else {
            this.f149844g.mo204722d();
        }
    }

    /* renamed from: t */
    private boolean m233265t() {
        if (!m233264s() && this.f149853p.getStatus() != -2) {
            return false;
        }
        if (m233264s()) {
            return true;
        }
        if (this.f149853p.getStatus() == -2) {
            this.f149851n = RunStatus.RUN_STATUS_PAUSE;
            return true;
        } else if (this.f149853p.getStatus() != -4) {
            return true;
        } else {
            this.f149851n = RunStatus.RUN_STATUS_CANCELED;
            return true;
        }
    }

    /* renamed from: C */
    private void m233231C() throws DownloadRetryNeedlessException {
        if (this.f149853p.isOnlyWifi() && !C60161d.m233773a(C60046b.m232945G(), "android.permission.ACCESS_NETWORK_STATE")) {
            throw new DownloadRetryNeedlessException(1019, String.format("download task need permission:%s", "android.permission.ACCESS_NETWORK_STATE"));
        } else if (!this.f149853p.isDownloadWithWifiValid()) {
            throw new DownloadOnlyWifiException();
        } else if (!this.f149853p.isPauseReserveWithWifiValid()) {
            throw new DownloadPauseReserveWifiException();
        }
    }

    /* renamed from: D */
    private void m233232D() throws BaseException {
        if (TextUtils.isEmpty(this.f149853p.getSavePath())) {
            throw new BaseException(1028, "download savePath can not be empty");
        } else if (!TextUtils.isEmpty(this.f149853p.getName())) {
            File file = new File(this.f149853p.getSavePath());
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    throw new BaseException(1030, "download savePath directory can not created");
                }
            } else if (!file.isDirectory()) {
                throw new BaseException(1031, "download savePath is not a directory");
            }
        } else {
            throw new BaseException(1029, "download name can not be empty");
        }
    }

    /* renamed from: n */
    private void m233259n() {
        boolean z;
        boolean z2;
        boolean z3;
        int i = 0;
        if (this.f149851n == RunStatus.RUN_STATUS_PAUSE || this.f149851n == RunStatus.RUN_STATUS_CANCELED) {
            z = false;
        } else {
            z = true;
        }
        try {
            z3 = m233266u();
            z2 = false;
        } catch (Exception e) {
            if (e instanceof BaseException) {
                this.f149859v.mo204728a((BaseException) e);
            } else {
                this.f149859v.mo204728a(new BaseException(1046, e));
            }
            z3 = true;
            z2 = true;
        }
        if (z3 || z2) {
            this.f149850m.set(false);
            if (z) {
                try {
                    AbstractC60081a x = C60046b.m233014x();
                    if (x != null) {
                        x.mo204904a(this);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    AbstractC60035m monitorDepend = this.f149840c.getMonitorDepend();
                    DownloadInfo downloadInfo = this.f149853p;
                    BaseException baseException = new BaseException(1014, C60161d.m233788b(th, "removeDownloadRunnable"));
                    DownloadInfo downloadInfo2 = this.f149853p;
                    if (downloadInfo2 != null) {
                        i = downloadInfo2.getStatus();
                    }
                    C59992a.m232850a(monitorDepend, downloadInfo, baseException, i);
                }
            }
        } else {
            this.f149833C = true;
            C59990a.m232838b(f149830a, "jump to restart");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m233267v() {
        /*
            r7 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f149853p
            int r0 = r0.getChunkCount()
            r1 = 0
            r2 = 1
            if (r0 > r2) goto L_0x0028
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f149853p
            long r3 = r0.getCurBytes()
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f149853p
            long r3 = r0.getCurBytes()
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f149853p
            long r5 = r0.getTotalBytes()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            return r2
        L_0x0027:
            return r1
        L_0x0028:
            com.ss.android.socialbase.downloader.downloader.i r0 = r7.f149852o
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r7.f149853p
            int r3 = r3.getId()
            java.util.List r0 = r0.getDownloadChunk(r3)
            if (r0 == 0) goto L_0x0057
            int r3 = r0.size()
            if (r3 > r2) goto L_0x003d
            goto L_0x0057
        L_0x003d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0041:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r0.next()
            com.ss.android.socialbase.downloader.model.DownloadChunk r3 = (com.ss.android.socialbase.downloader.model.DownloadChunk) r3
            if (r3 == 0) goto L_0x0055
            boolean r3 = r3.mo205017i()
            if (r3 != 0) goto L_0x0041
        L_0x0055:
            return r1
        L_0x0056:
            return r2
        L_0x0057:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.p3028e.RunnableC60071c.m233267v():boolean");
    }

    /* renamed from: w */
    private boolean m233268w() {
        if (this.f149853p.isChunked()) {
            DownloadInfo downloadInfo = this.f149853p;
            downloadInfo.setTotalBytes(downloadInfo.getCurBytes());
        }
        if (this.f149853p.getCurBytes() > 0) {
            if (this.f149853p.isIgnoreDataVerify()) {
                return true;
            }
            if (this.f149853p.getTotalBytes() > 0 && this.f149853p.getCurBytes() == this.f149853p.getTotalBytes()) {
                return true;
            }
        }
        this.f149853p.setByteInvalidRetryStatus(ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.f149853p.reset();
        this.f149852o.updateDownloadInfo(this.f149853p);
        this.f149852o.removeAllDownloadChunk(this.f149853p.getId());
        C60161d.m233759a(this.f149853p);
        return false;
    }

    /* renamed from: B */
    private void m233230B() throws BaseException {
        long j;
        int a;
        try {
            j = C60161d.m233798c(this.f149853p.getTempPath());
        } catch (BaseException unused) {
            j = 0;
        }
        String str = f149830a;
        C59990a.m232839c(str, "checkSpaceOverflowInProgress: available = " + C60161d.m233741a(j) + "MB");
        if (j > 0) {
            long totalBytes = this.f149853p.getTotalBytes() - this.f149853p.getCurBytes();
            if (j < totalBytes && (a = C60148a.m233720a(this.f149853p.getId()).mo205470a("space_fill_min_keep_mb", 100)) > 0) {
                long j2 = j - (((long) a) * 1048576);
                C59990a.m232839c(str, "checkSpaceOverflowInProgress: minKeep  = " + a + "MB, canDownload = " + C60161d.m233741a(j2) + "MB");
                if (j2 > 0) {
                    this.f149836F = this.f149853p.getCurBytes() + j2 + 1048576;
                    return;
                } else {
                    this.f149836F = 0;
                    throw new DownloadOutOfSpaceException(j, totalBytes);
                }
            }
        }
        this.f149836F = 0;
    }

    /* renamed from: u */
    private boolean m233266u() {
        C60131b.m233679a().mo205440c();
        if (this.f149851n == RunStatus.RUN_STATUS_ERROR) {
            this.f149859v.mo204728a(this.f149860w);
        } else if (this.f149851n == RunStatus.RUN_STATUS_CANCELED) {
            this.f149859v.mo204734c();
        } else if (this.f149851n == RunStatus.RUN_STATUS_PAUSE) {
            this.f149859v.mo204735d();
        } else if (this.f149851n == RunStatus.RUN_STATUS_END_RIGHT_NOW) {
            try {
                this.f149859v.mo204739h();
            } catch (BaseException e) {
                this.f149859v.mo204728a(e);
            }
        } else if (this.f149851n == RunStatus.RUN_STATUS_END_FOR_FILE_EXIST) {
            try {
                this.f149859v.mo204731a(this.f149835E);
            } catch (BaseException e2) {
                this.f149859v.mo204728a(e2);
            }
        } else if (this.f149851n == RunStatus.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET) {
            this.f149859v.mo204729a(this.f149860w, false);
            return false;
        } else if (this.f149851n == RunStatus.RUN_STATUS_WAITING_ASYNC_HANDLER) {
            return true;
        } else {
            if (this.f149851n != RunStatus.RUN_STATUS_RETRY_DELAY || m233267v()) {
                try {
                    if (!m233268w()) {
                        return false;
                    }
                    this.f149859v.mo204737f();
                    C60110q.m233537c().mo204961d();
                } catch (Throwable th) {
                    mo204857b(new BaseException(1008, C60161d.m233788b(th, "doTaskStatusHandle onComplete")));
                }
            } else {
                C59990a.m232838b(f149830a, "doTaskStatusHandle retryDelay");
                m233269x();
                if (this.f149851n == RunStatus.RUN_STATUS_RETRY_DELAY) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    private void m233271z() throws C60074a, BaseException {
        AbstractC60081a x;
        int id = this.f149853p.getId();
        int a = C60046b.m232950a(this.f149853p);
        if (!this.f149853p.isDownloaded()) {
            DownloadInfo downloadInfo = this.f149852o.getDownloadInfo(a);
            if (!(downloadInfo == null || (x = C60046b.m233014x()) == null || downloadInfo.getId() == id || !downloadInfo.equalsTask(this.f149853p))) {
                if (!x.mo204907a(downloadInfo.getId())) {
                    List<DownloadChunk> downloadChunk = this.f149852o.getDownloadChunk(a);
                    C60161d.m233759a(this.f149853p);
                    this.f149852o.removeDownloadTaskData(a);
                    if (downloadInfo != null && downloadInfo.isBreakpointAvailable()) {
                        this.f149853p.copyFromCacheData(downloadInfo, false);
                        this.f149852o.updateDownloadInfo(this.f149853p);
                        if (downloadChunk != null) {
                            for (DownloadChunk downloadChunk2 : downloadChunk) {
                                downloadChunk2.mo205005b(id);
                                this.f149852o.addDownloadChunk(downloadChunk2);
                            }
                        }
                        throw new C60074a("retry task because id generator changed");
                    }
                    return;
                }
                this.f149852o.removeDownloadTaskData(id);
                throw new BaseException(1025, "another same task is downloading");
            }
            return;
        }
        throw new BaseException(1009, "file has downloaded");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f3, code lost:
        if (r9.f149838H.mo205473a("fix_file_exist_update_download_info") != false) goto L_0x00f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m233256k() throws com.ss.android.socialbase.downloader.exception.DownloadFileExistException {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.p3028e.RunnableC60071c.m233256k():void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001b */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m233257l() {
        /*
        // Method dump skipped, instructions count: 287
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.p3028e.RunnableC60071c.m233257l():void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    private void m233258m() {
        boolean z;
        long j;
        boolean z2;
        try {
            this.f149851n = RunStatus.RUN_STATUS_NONE;
            this.f149853p.updateStartDownloadTime();
            this.f149853p.resetRealStartDownloadTime();
            long currentTimeMillis = System.currentTimeMillis();
            this.f149853p.setFirstSpeedTime(-1);
            try {
                m233256k();
                z = false;
            } catch (DownloadFileExistException e) {
                String str = f149830a;
                C59990a.m232838b(str, "file exist " + e.getExistTargetFileName());
                this.f149835E = e.getExistTargetFileName();
                z = true;
            }
            if (!this.f149833C) {
                this.f149859v.mo204733b();
            }
            this.f149833C = false;
            if (!m233265t()) {
                if (TextUtils.isEmpty(this.f149835E) || !z) {
                    C60131b.m233679a().mo205439b();
                    while (!m233265t()) {
                        try {
                            m233232D();
                            m233271z();
                            m233231C();
                            List<DownloadChunk> downloadChunk = this.f149852o.getDownloadChunk(this.f149853p.getId());
                            m233233E();
                            String connectionUrl = this.f149853p.getConnectionUrl();
                            if (m233265t()) {
                                m233262q();
                                m233259n();
                                return;
                            }
                            if (this.f149846i) {
                                j = C60161d.m233808d(this.f149853p);
                            } else {
                                j = 0;
                            }
                            DownloadChunk c = m233252c(j);
                            List<HttpHeader> a = m233240a(c);
                            C60161d.m233766a(a, this.f149853p);
                            this.f149853p.setPreconnectLevel(0);
                            long currentTimeMillis2 = System.currentTimeMillis();
                            try {
                                m233248a(connectionUrl, a, j);
                                this.f149853p.increaseAllConnectTime(System.currentTimeMillis() - currentTimeMillis2);
                                if (m233265t()) {
                                    m233262q();
                                    m233259n();
                                    return;
                                }
                                long totalBytes = this.f149853p.getTotalBytes();
                                m233243a(totalBytes, this.f149853p.getTempPath(), this.f149853p.getTempName());
                                int a2 = m233237a(totalBytes, downloadChunk);
                                if (m233265t()) {
                                    m233262q();
                                    m233259n();
                                    return;
                                } else if (a2 > 0) {
                                    if (a2 == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    this.f149845h = z2;
                                    if (z2) {
                                        if (this.f149861x == null) {
                                            try {
                                                currentTimeMillis2 = System.currentTimeMillis();
                                                m233247a(connectionUrl, a);
                                            } finally {
                                                this.f149853p.increaseAllConnectTime(System.currentTimeMillis() - currentTimeMillis2);
                                            }
                                        }
                                        if (m233265t()) {
                                            m233262q();
                                            m233259n();
                                            return;
                                        }
                                        this.f149853p.setFirstSpeedTime(System.currentTimeMillis() - currentTimeMillis);
                                        m233244a(c, connectionUrl, this.f149861x);
                                    } else {
                                        if (!this.f149853p.isNeedReuseFirstConnection()) {
                                            m233261p();
                                        }
                                        if (m233265t()) {
                                            m233262q();
                                            m233259n();
                                            return;
                                        }
                                        this.f149853p.setFirstSpeedTime(System.currentTimeMillis() - currentTimeMillis);
                                        if (this.f149846i) {
                                            m233241a(a2, downloadChunk);
                                        } else {
                                            m233242a(totalBytes, a2);
                                        }
                                    }
                                    m233262q();
                                    m233259n();
                                    return;
                                } else {
                                    throw new BaseException(1032, "chunkCount is 0");
                                }
                            } catch (Throwable th) {
                                this.f149853p.increaseAllConnectTime(System.currentTimeMillis() - currentTimeMillis2);
                                throw th;
                            }
                        } catch (BaseException e2) {
                            String str2 = f149830a;
                            C59990a.m232840d(str2, "downloadInner: baseException = " + e2);
                            if (this.f149851n != RunStatus.RUN_STATUS_PAUSE) {
                                if (e2.getErrorCode() == 1025 || e2.getErrorCode() == 1009) {
                                    this.f149851n = RunStatus.RUN_STATUS_END_RIGHT_NOW;
                                    m233262q();
                                    m233259n();
                                    return;
                                } else if (mo204854a(e2)) {
                                    if (C60161d.m233774a(e2)) {
                                        m233234F();
                                    }
                                    if (mo204844a(e2, 0) == RetryCheckStatus.RETURN) {
                                        m233262q();
                                        m233259n();
                                        return;
                                    }
                                    m233262q();
                                } else {
                                    mo204857b(e2);
                                }
                            }
                        } catch (C60074a e3) {
                            String str3 = f149830a;
                            C59990a.m232840d(str3, "downloadInner: retry throwable for " + e3.getErrorMsg());
                            if (this.f149851n != RunStatus.RUN_STATUS_PAUSE) {
                                AtomicInteger atomicInteger = this.f149842e;
                                if (atomicInteger != null && atomicInteger.get() > 0) {
                                    this.f149853p.updateCurRetryTime(this.f149842e.decrementAndGet());
                                    this.f149853p.setStatus(5);
                                    m233262q();
                                } else if (this.f149842e == null) {
                                    mo204857b(new BaseException(1043, "retry for Throwable, but retain retry time is NULL, last error is" + e3.getErrorMsg()));
                                } else if (this.f149853p.trySwitchToNextBackupUrl()) {
                                    this.f149853p.setStatus(5);
                                    this.f149842e.set(this.f149853p.getRetryCount());
                                    this.f149853p.updateCurRetryTime(this.f149842e.get());
                                    m233262q();
                                } else {
                                    mo204857b(new BaseException(1018, String.format("retry for Throwable, but retry Time %s all used, last error is %s", String.valueOf(this.f149853p.getRetryCount()), e3.getErrorMsg())));
                                }
                            }
                        } catch (Throwable th2) {
                            m233262q();
                            throw th2;
                        }
                    }
                    m233259n();
                    return;
                }
                if (C60148a.m233727c().mo205475b("fix_end_for_file_exist_error", true)) {
                    if (this.f149835E.equals(this.f149853p.getName())) {
                        this.f149851n = RunStatus.RUN_STATUS_END_RIGHT_NOW;
                    } else {
                        this.f149851n = RunStatus.RUN_STATUS_END_FOR_FILE_EXIST;
                    }
                } else if (this.f149835E.equals(this.f149853p.getTargetFilePath())) {
                    this.f149851n = RunStatus.RUN_STATUS_END_RIGHT_NOW;
                } else {
                    this.f149851n = RunStatus.RUN_STATUS_END_FOR_FILE_EXIST;
                }
                m233259n();
            }
        } finally {
            m233259n();
        }
    }

    /* renamed from: a */
    public void mo204852a(Future future) {
        this.f149839b = future;
    }

    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: a */
    public void mo204848a(RunnableC60070b bVar) {
        if (!this.f149845h) {
            synchronized (this) {
                this.f149843f.remove(bVar);
            }
        }
    }

    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: c */
    public void mo204859c(BaseException baseException) {
        DownloadInfo downloadInfo = this.f149853p;
        if (downloadInfo != null) {
            downloadInfo.setChunkDowngradeRetryUsed(true);
        }
        mo204849a(baseException, false);
    }

    /* renamed from: a */
    private List<HttpHeader> m233240a(DownloadChunk downloadChunk) {
        return C60161d.m233756a(this.f149853p.getExtraHeaders(), this.f149853p.geteTag(), downloadChunk);
    }

    /* renamed from: a */
    private AbstractC60067q m233238a(DownloadTask downloadTask) {
        AbstractC60067q retryDelayTimeCalculator = downloadTask.getRetryDelayTimeCalculator();
        if (retryDelayTimeCalculator != null) {
            return retryDelayTimeCalculator;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            String retryDelayTimeArray = downloadInfo.getRetryDelayTimeArray();
            if (!TextUtils.isEmpty(retryDelayTimeArray)) {
                return new C60109p(retryDelayTimeArray);
            }
        }
        return C60046b.m232944F();
    }

    /* renamed from: c */
    private DownloadChunk m233252c(long j) {
        return new DownloadChunk.C60117a(this.f149853p.getId()).mo205033a(-1).mo205034a(0L).mo205040e(j).mo205037b(j).mo205038c(0).mo205039d(this.f149853p.getTotalBytes() - j).mo205036a();
    }

    /* renamed from: b */
    public void mo204856b(long j) {
        AbstractC60137g gVar = this.f149861x;
        if (gVar != null && (gVar instanceof AbstractC60123a)) {
            try {
                ((AbstractC60123a) gVar).mo205424a(j);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private boolean m233253d(BaseException baseException) {
        AtomicInteger atomicInteger = this.f149842e;
        boolean z = true;
        if (atomicInteger != null) {
            if (atomicInteger.get() <= 0 || (baseException != null && baseException.getErrorCode() == 1070)) {
                if (this.f149853p.trySwitchToNextBackupUrl()) {
                    this.f149842e.set(this.f149853p.getBackUpUrlRetryCount());
                    this.f149853p.updateCurRetryTime(this.f149842e.get());
                } else if (baseException == null || ((baseException.getErrorCode() != 1011 && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException))) || !this.f149853p.canReplaceHttpForRetry())) {
                    mo204857b(new BaseException(baseException.getErrorCode(), String.format("retry for exception, but current retry time : %s , retry Time %s all used, last error is %s", String.valueOf(this.f149842e), String.valueOf(this.f149853p.getRetryCount()), baseException.getErrorMessage())));
                    return true;
                } else {
                    this.f149842e.set(this.f149853p.getRetryCount());
                    this.f149853p.updateCurRetryTime(this.f149842e.get());
                    this.f149853p.setHttpsToHttpRetryUsed(true);
                }
                z = false;
            }
            if (this.f149851n != RunStatus.RUN_STATUS_RETRY_DELAY && z) {
                this.f149853p.updateCurRetryTime(this.f149842e.decrementAndGet());
            }
            return false;
        }
        mo204857b(new BaseException(1043, "retry for exception, but retain retry time is null, last error is :" + baseException.getErrorMessage()));
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.p3028e.AbstractC60076e
    /* renamed from: b */
    public void mo204857b(BaseException baseException) {
        String str = f149830a;
        C59990a.m232838b(str, "onError:" + baseException.getMessage());
        this.f149851n = RunStatus.RUN_STATUS_ERROR;
        this.f149860w = baseException;
        m233235G();
    }

    public RunnableC60071c(DownloadTask downloadTask, Handler handler) {
        this.f149840c = downloadTask;
        if (downloadTask != null) {
            this.f149853p = downloadTask.getDownloadInfo();
            this.f149854q = downloadTask.getChunkStrategy();
            this.f149856s = downloadTask.getChunkAdjustCalculator();
            this.f149863z = downloadTask.getForbiddenHandler();
            this.f149831A = downloadTask.getDiskSpaceHandler();
            this.f149858u = m233238a(downloadTask);
            this.f149838H = C60148a.m233720a(this.f149853p.getId());
        } else {
            this.f149838H = C60148a.m233727c();
        }
        m233254i();
        this.f149852o = C60046b.m233010t();
        this.f149855r = C60046b.m232941C();
        this.f149857t = C60046b.m232943E();
        this.f149859v = new C60052e(downloadTask, handler);
        this.f149850m = new AtomicBoolean(true);
    }

    /* renamed from: a */
    private void m233241a(int i, List<DownloadChunk> list) throws BaseException {
        if (list.size() == i) {
            m233249a(list, this.f149853p.getTotalBytes());
            return;
        }
        throw new BaseException(1033, new IllegalArgumentException());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (r9 <= 0) goto L_0x005e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m233237a(long r7, java.util.List<com.ss.android.socialbase.downloader.model.DownloadChunk> r9) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.p3028e.RunnableC60071c.m233237a(long, java.util.List):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        if (r9.mo205014f() != false) goto L_0x006e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.socialbase.downloader.model.DownloadChunk m233239a(com.ss.android.socialbase.downloader.model.DownloadChunk r9, int r10) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.p3028e.RunnableC60071c.m233239a(com.ss.android.socialbase.downloader.model.DownloadChunk, int):com.ss.android.socialbase.downloader.model.DownloadChunk");
    }

    /* renamed from: a */
    private void m233242a(long j, int i) throws BaseException {
        long j2 = j / ((long) i);
        int id = this.f149853p.getId();
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            DownloadChunk a = new DownloadChunk.C60117a(id).mo205033a(i2).mo205034a(j3).mo205040e(j3).mo205037b(j3).mo205038c(i2 == i - 1 ? 0 : (j3 + j2) - 1).mo205036a();
            arrayList.add(a);
            this.f149852o.addDownloadChunk(a);
            j3 += j2;
        }
        this.f149853p.setChunkCount(i);
        this.f149852o.updateChunkCount(id, i);
        m233249a(arrayList, j);
    }

    /* renamed from: b */
    private void m233251b(String str, List<HttpHeader> list, long j) throws BaseException, C60074a {
        C60129c a;
        boolean z = true;
        if (this.f149853p.getChunkCount() == 1 && (a = C60124a.m233655a().mo205426a(str, list)) != null) {
            this.f149862y = a;
            this.f149853p.setPreconnectLevel(1);
        }
        if (this.f149862y == null && !this.f149834D && this.f149853p.isHeadConnectionAvailable()) {
            try {
                int b = this.f149838H.mo205474b("net_lib_strategy");
                if (this.f149838H.mo205470a("monitor_download_connect", 0) <= 0) {
                    z = false;
                }
                this.f149862y = C60046b.m232953a(str, list, b, z, this.f149853p);
            } catch (Throwable th) {
                this.f149853p.setHeadConnectionException(C60161d.m233824i(th));
            }
        }
    }

    /* renamed from: a */
    private void m233243a(long j, String str, String str2) throws BaseException {
        C60122a aVar;
        Throwable th;
        long j2;
        boolean z;
        long j3 = j;
        if (!C60161d.m233792b(j)) {
            C60122a a = C60161d.m233745a(str, str2, -1);
            try {
                long length = new File(str, str2).length();
                long j4 = j3 - length;
                long c = C60161d.m233798c(str);
                C60148a a2 = C60148a.m233720a(this.f149853p.getId());
                if (a2.mo205470a("space_fill_part_download", 0) == 1) {
                    try {
                        this.f149836F = 0;
                        if (j4 <= 0) {
                            j4 = this.f149853p.getTotalBytes() - this.f149853p.getCurBytes();
                        }
                        if (c < j4) {
                            String str3 = f149830a;
                            C59990a.m232840d(str3, "checkSpaceOverflow: contentLength = " + C60161d.m233741a(j) + "MB, downloaded = " + C60161d.m233741a(length) + "MB, required = " + C60161d.m233741a(j4) + "MB, available = " + C60161d.m233741a(c) + "MB");
                            int i = (c > 0 ? 1 : (c == 0 ? 0 : -1));
                            if (i > 0) {
                                int a3 = a2.mo205470a("space_fill_min_keep_mb", 100);
                                if (a3 > 0) {
                                    long j5 = c - (((long) a3) * 1048576);
                                    C59990a.m232840d(str3, "checkSpaceOverflow: minKeep = " + a3 + "MB, canDownload = " + C60161d.m233741a(j5) + "MB");
                                    if (j5 > 0) {
                                        this.f149836F = this.f149853p.getCurBytes() + j5;
                                        j3 = j;
                                        c = j5;
                                    } else {
                                        throw new DownloadOutOfSpaceException(c, j4);
                                    }
                                } else {
                                    j3 = j;
                                }
                                if (length < j3) {
                                    j2 = c + length;
                                    if (j2 > j3) {
                                    }
                                    aVar = a;
                                    z = true;
                                    aVar.mo205422b(j3);
                                    C60161d.m233767a(aVar);
                                }
                            } else if (a2.mo205470a("download_when_space_negative", 0) == 1) {
                                j2 = j3;
                                aVar = a;
                                z = false;
                                aVar.mo205422b(j3);
                                C60161d.m233767a(aVar);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("availableSpace ");
                                sb.append(i == 0 ? ContainerUtils.KEY_VALUE_DELIMITER : "<");
                                sb.append(" 0");
                                throw new BaseException(1052, sb.toString());
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = a;
                        C60161d.m233767a(aVar);
                        throw th;
                    }
                } else {
                    int i2 = (c > 0 ? 1 : (c == 0 ? 0 : -1));
                    if (i2 <= 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("availableSpace ");
                        sb2.append(i2 == 0 ? ContainerUtils.KEY_VALUE_DELIMITER : "<");
                        sb2.append(" 0");
                        throw new BaseException(1052, sb2.toString());
                    } else if (c < j4) {
                        throw new DownloadOutOfSpaceException(c, j4);
                    }
                }
                j2 = j3;
                aVar = a;
                z = true;
                try {
                    aVar.mo205422b(j3);
                } catch (Throwable th3) {
                    String str4 = f149830a;
                    C59990a.m232841e(str4, "checkSpaceOverflow: setLength2 ex = " + th3 + ", mustSetLength = " + z);
                    if (z) {
                        throw new BaseException(1040, th3);
                    }
                }
                C60161d.m233767a(aVar);
            } catch (Throwable th4) {
                th = th4;
                aVar = a;
                C60161d.m233767a(aVar);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m233244a(DownloadChunk downloadChunk, String str, AbstractC60137g gVar) throws BaseException {
        downloadChunk.mo204998a(this.f149853p.getTotalBytes() - downloadChunk.mo205022n());
        this.f149853p.setChunkCount(1);
        this.f149852o.updateChunkCount(this.f149853p.getId(), 1);
        this.f149844g = new C60050d(this.f149853p, str, gVar, downloadChunk, this);
        m233263r();
    }
}

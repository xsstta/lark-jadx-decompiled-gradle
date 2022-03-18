package com.ss.android.socialbase.downloader.downloader;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.socialbase.downloader.db.SqlDownloadCache;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.C60090d;
import com.ss.android.socialbase.downloader.impls.C60103k;
import com.ss.android.socialbase.downloader.impls.C60104l;
import com.ss.android.socialbase.downloader.model.C60122a;
import com.ss.android.socialbase.downloader.model.DownloadChunk;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.AbstractC60134d;
import com.ss.android.socialbase.downloader.network.AbstractC60137g;
import com.ss.android.socialbase.downloader.p3024a.C59986a;
import com.ss.android.socialbase.downloader.p3026c.AbstractC59993b;
import com.ss.android.socialbase.downloader.p3026c.AbstractC59994c;
import com.ss.android.socialbase.downloader.p3027d.AbstractC60001c;
import com.ss.android.socialbase.downloader.p3027d.C59998a;
import com.ss.android.socialbase.downloader.p3027d.C60003e;
import com.ss.android.socialbase.downloader.p3028e.AbstractC60076e;
import com.ss.android.socialbase.downloader.setting.C60148a;
import com.ss.android.socialbase.downloader.utils.C60158a;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ss.android.socialbase.downloader.downloader.d */
public class C60050d {

    /* renamed from: b */
    private static String f149737b = "ResponseHandler";

    /* renamed from: A */
    private long f149738A;

    /* renamed from: B */
    private long f149739B;

    /* renamed from: C */
    private long f149740C;

    /* renamed from: D */
    private volatile long f149741D;

    /* renamed from: E */
    private volatile long f149742E;

    /* renamed from: a */
    public final AbstractC60137g f149743a;

    /* renamed from: c */
    private final DownloadInfo f149744c;

    /* renamed from: d */
    private final String f149745d;

    /* renamed from: e */
    private final DownloadChunk f149746e;

    /* renamed from: f */
    private AbstractC60059i f149747f;

    /* renamed from: g */
    private C60103k f149748g;

    /* renamed from: h */
    private AbstractC60068r f149749h;

    /* renamed from: i */
    private C60122a f149750i;

    /* renamed from: j */
    private BaseException f149751j;

    /* renamed from: k */
    private volatile boolean f149752k;

    /* renamed from: l */
    private volatile boolean f149753l;

    /* renamed from: m */
    private final AbstractC60076e f149754m;

    /* renamed from: n */
    private long f149755n;

    /* renamed from: o */
    private long f149756o;

    /* renamed from: p */
    private volatile long f149757p;

    /* renamed from: q */
    private volatile long f149758q;

    /* renamed from: r */
    private final boolean f149759r;

    /* renamed from: s */
    private final C60148a f149760s;

    /* renamed from: t */
    private final C59986a f149761t;

    /* renamed from: u */
    private final boolean f149762u;

    /* renamed from: v */
    private final long f149763v;

    /* renamed from: w */
    private final long f149764w;

    /* renamed from: x */
    private final boolean f149765x;

    /* renamed from: y */
    private boolean f149766y;

    /* renamed from: z */
    private long f149767z;

    /* renamed from: b */
    private boolean m233069b(long j, long j2) {
        return j > 65536 && j2 > 500;
    }

    /* renamed from: a */
    public long mo204717a() {
        return this.f149755n;
    }

    /* renamed from: e */
    public long mo204723e() {
        return this.f149741D;
    }

    /* renamed from: f */
    private boolean m233070f() {
        if (this.f149752k || this.f149753l) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo204720b() {
        if (!this.f149752k) {
            this.f149752k = true;
            m233071g();
        }
    }

    /* renamed from: g */
    private void m233071g() {
        ExecutorService k;
        if (this.f149743a != null && (k = C60046b.m233001k()) != null) {
            k.execute(new Runnable() {
                /* class com.ss.android.socialbase.downloader.downloader.C60050d.RunnableC600511 */

                public void run() {
                    try {
                        C60050d.this.f149743a.mo204950d();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public void mo204721c() {
        if (!this.f149753l) {
            synchronized (this.f149754m) {
                this.f149753l = true;
            }
            m233071g();
        }
    }

    /* renamed from: h */
    private void m233072h() {
        long j;
        boolean z;
        if (this.f149765x) {
            j = System.nanoTime();
        } else {
            j = 0;
        }
        boolean z2 = false;
        try {
            this.f149750i.mo205419a();
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            this.f149744c.updateRealDownloadTime(true);
            if (this.f149744c.getChunkCount() > 1) {
                z2 = true;
            }
            AbstractC60062l a = C60104l.m233401a(C60161d.m233791b());
            if (z2) {
                m233067a(this.f149749h);
                if (a != null) {
                    a.mo204809c(this.f149744c);
                } else {
                    this.f149749h.OnDownloadTaskProgress(this.f149744c.getId(), this.f149744c.getCurBytes());
                }
            } else if (a != null) {
                a.mo204809c(this.f149744c);
            } else {
                this.f149749h.OnDownloadTaskProgress(this.f149746e.mo205019k(), this.f149755n);
            }
            this.f149741D = this.f149755n;
        }
        if (this.f149765x) {
            this.f149739B += System.nanoTime() - j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x020c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x020e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0210, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0211, code lost:
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0213, code lost:
        r18 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0215, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0217, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0218, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x022e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x023a, code lost:
        throw new com.ss.android.socialbase.downloader.exception.BaseException(1054, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x023b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        ((com.ss.android.socialbase.downloader.network.AbstractC60123a) r22.f149743a).mo205425a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0268, code lost:
        r0 = r22.f149743a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x026a, code lost:
        if (r0 != null) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x026c, code lost:
        r0.mo204950d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x026f, code lost:
        if (r10 != null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0271, code lost:
        r10.mo204287b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0276, code lost:
        if (r22.f149759r != false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x027a, code lost:
        monitor-enter(r22.f149754m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x027d, code lost:
        if (r22.f149753l == false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x027f, code lost:
        m233067a(r22.f149748g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0286, code lost:
        if (r22.f149750i != null) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0288, code lost:
        m233072h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0290, code lost:
        m233067a(r22.f149748g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0297, code lost:
        if (r22.f149750i != null) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0299, code lost:
        m233072h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x029c, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233767a(r22.f149750i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02a9, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233767a(r22.f149750i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02b8, code lost:
        if (com.ss.android.socialbase.downloader.p3025b.C59990a.m232836a() != false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02ba, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233765a(r0, "ResponseHandler");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02c2, code lost:
        r0 = r22.f149743a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02c4, code lost:
        if (r0 != null) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02c6, code lost:
        r0.mo204950d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02c9, code lost:
        if (r10 != null) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02cb, code lost:
        r10.mo204287b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x02d0, code lost:
        if (r22.f149759r != false) goto L_0x02d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x02d4, code lost:
        monitor-enter(r22.f149754m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x02d7, code lost:
        if (r22.f149753l == false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x02d9, code lost:
        m233067a(r22.f149748g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x02e0, code lost:
        if (r22.f149750i != null) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x02e2, code lost:
        m233072h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x02ea, code lost:
        m233067a(r22.f149748g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x02f1, code lost:
        if (r22.f149750i != null) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x02f3, code lost:
        m233072h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x02f6, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233767a(r22.f149750i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x037e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x037f, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233767a(r22.f149750i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0389, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x038a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x038b, code lost:
        r22.f149751j = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x038d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x038e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x038f, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0390, code lost:
        com.ss.android.socialbase.downloader.p3025b.C59990a.m232840d(com.ss.android.socialbase.downloader.downloader.C60050d.f149737b, "handleResponse: BaseException e = " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x03ae, code lost:
        if (r22.f149760s.mo205473a("ignore_base_ex_on_stop_status") == false) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03b6, code lost:
        r0 = r22.f149743a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x03b8, code lost:
        if (r0 != null) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03ba, code lost:
        r0.mo204950d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03bd, code lost:
        if (r10 != null) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x03bf, code lost:
        r10.mo204287b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x03c4, code lost:
        if (r22.f149759r != false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x03c8, code lost:
        monitor-enter(r22.f149754m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x03cb, code lost:
        if (r22.f149753l == false) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x03cd, code lost:
        m233067a(r22.f149748g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x03d4, code lost:
        if (r22.f149750i != null) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x03d6, code lost:
        m233072h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x03de, code lost:
        m233067a(r22.f149748g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x03e5, code lost:
        if (r22.f149750i != null) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x03e7, code lost:
        m233072h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x03ea, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233767a(r22.f149750i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x03f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x03f7, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233767a(r22.f149750i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0401, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0406, code lost:
        if (com.ss.android.socialbase.downloader.p3025b.C59990a.m232836a() != false) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0408, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x040b, code lost:
        r22.f149751j = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x040d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x040e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x040f, code lost:
        r2 = r22.f149743a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0411, code lost:
        if (r2 != null) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0413, code lost:
        r2.mo204950d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0416, code lost:
        if (r10 != null) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0418, code lost:
        r10.mo204287b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x041d, code lost:
        if (r22.f149759r != false) goto L_0x041f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0421, code lost:
        monitor-enter(r22.f149754m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0424, code lost:
        if (r22.f149753l == false) goto L_0x0426;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0426, code lost:
        m233067a(r22.f149748g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x042d, code lost:
        if (r22.f149750i != null) goto L_0x042f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x042f, code lost:
        m233072h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0437, code lost:
        m233067a(r22.f149748g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x043e, code lost:
        if (r22.f149750i != null) goto L_0x0440;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0440, code lost:
        m233072h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0443, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233767a(r22.f149750i);
        r22.f149740C = java.lang.System.nanoTime() - r8;
        m233066a(((double) (r22.f149755n - r22.f149756o)) / 1048576.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0460, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0461, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0462, code lost:
        com.ss.android.socialbase.downloader.utils.C60161d.m233767a(r22.f149750i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x046c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ee, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0217 A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), Splitter:B:14:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0245 A[SYNTHETIC, Splitter:B:160:0x0245] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x031b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x038e A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), Splitter:B:7:0x002b] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo204722d() throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
        // Method dump skipped, instructions count: 1144
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.C60050d.mo204722d():void");
    }

    /* renamed from: a */
    private void m233068a(boolean z) {
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = uptimeMillis - this.f149742E;
        if (this.f149762u) {
            if (this.f149761t.mo204267b()) {
                j = this.f149763v;
            } else {
                j = this.f149764w;
            }
            if (j2 > j) {
                m233072h();
                this.f149742E = uptimeMillis;
                return;
            }
            return;
        }
        long j3 = this.f149755n - this.f149741D;
        if (z || m233069b(j3, j2)) {
            m233072h();
            this.f149742E = uptimeMillis;
        }
    }

    /* renamed from: a */
    private AbstractC60001c m233065a(InputStream inputStream) {
        int B = C60046b.m232940B();
        if (this.f149760s.mo205470a("rw_concurrent", 0) == 1 && this.f149744c.getChunkCount() == 1 && this.f149744c.getTotalBytes() > 20971520) {
            try {
                C59998a aVar = new C59998a(inputStream, B, this.f149760s.mo205470a("rw_concurrent_max_buffer_count", 4));
                this.f149766y = true;
                return aVar;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        C60003e eVar = new C60003e(inputStream, B);
        this.f149766y = false;
        return eVar;
    }

    /* renamed from: a */
    private void m233067a(AbstractC60059i iVar) {
        DownloadChunk downloadChunk;
        DownloadChunk downloadChunk2;
        if (iVar != null) {
            AbstractC60062l lVar = null;
            boolean z = iVar instanceof SqlDownloadCache;
            if (!z || (lVar = C60104l.m233401a(C60161d.m233791b())) != null) {
                if (this.f149746e.mo205011d()) {
                    downloadChunk = this.f149746e.mo205013e();
                } else {
                    downloadChunk = this.f149746e;
                }
                if (downloadChunk != null) {
                    downloadChunk.mo205006b(this.f149755n);
                    if (!z || lVar == null) {
                        downloadChunk2 = downloadChunk;
                        iVar.updateSubDownloadChunk(downloadChunk.mo205019k(), downloadChunk.mo205027s(), downloadChunk.mo205004b(), this.f149755n);
                    } else {
                        lVar.mo204780a(downloadChunk.mo205019k(), downloadChunk.mo205027s(), downloadChunk.mo205004b(), this.f149755n);
                        downloadChunk2 = downloadChunk;
                    }
                    if (downloadChunk2.mo205016h()) {
                        boolean z2 = false;
                        if (downloadChunk2.mo205017i()) {
                            long j = downloadChunk2.mo205018j();
                            if (j > this.f149755n) {
                                if (!z || lVar == null) {
                                    iVar.updateDownloadChunk(downloadChunk2.mo205019k(), downloadChunk2.mo205004b(), j);
                                } else {
                                    lVar.mo204781a(downloadChunk2.mo205019k(), downloadChunk2.mo205004b(), j);
                                }
                                z2 = true;
                            }
                        }
                        if (z2) {
                            return;
                        }
                        if (!z || lVar == null) {
                            iVar.updateDownloadChunk(downloadChunk2.mo205019k(), downloadChunk2.mo205004b(), this.f149755n);
                        } else {
                            lVar.mo204781a(downloadChunk2.mo205019k(), downloadChunk2.mo205004b(), this.f149755n);
                        }
                    }
                } else if (!this.f149746e.mo205011d()) {
                } else {
                    if (!z || lVar == null) {
                        iVar.updateDownloadChunk(this.f149746e.mo205019k(), this.f149746e.mo205027s(), this.f149755n);
                    } else {
                        lVar.mo204781a(this.f149746e.mo205019k(), this.f149746e.mo205027s(), this.f149755n);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m233066a(double d) {
        int i;
        String str;
        int i2;
        int i3;
        AbstractC59994c g;
        AbstractC59993b I;
        int i4;
        int a = this.f149760s.mo205470a("monitor_download_io", 0);
        if (a != 0) {
            double d2 = (double) this.f149740C;
            if (d2 > 0.0d) {
                try {
                    Uri parse = Uri.parse(this.f149745d);
                    String host = parse.getHost();
                    String path = parse.getPath();
                    String lastPathSegment = parse.getLastPathSegment();
                    if (!TextUtils.isEmpty(path) && !TextUtils.isEmpty(lastPathSegment)) {
                        try {
                            path = path.substring(0, path.length() - lastPathSegment.length());
                        } catch (Throwable unused) {
                        }
                    }
                    if (this.f149752k) {
                        str = null;
                        i = 1;
                    } else if (this.f149753l) {
                        str = null;
                        i = 2;
                    } else {
                        BaseException baseException = this.f149751j;
                        if (baseException != null) {
                            if (!C60161d.m233793b(C60046b.m232945G())) {
                                i4 = 1049;
                            } else {
                                i4 = baseException.getErrorCode();
                            }
                            str = baseException.getErrorMessage();
                            i = i4;
                        } else {
                            str = null;
                            i = 0;
                        }
                    }
                    AbstractC60137g gVar = this.f149743a;
                    if (gVar == null || !(gVar instanceof AbstractC60134d)) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    double nanos = d2 / ((double) TimeUnit.SECONDS.toNanos(1));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("setting_tag", this.f149760s.mo205476c("setting_tag"));
                    jSONObject.put("url_host", host);
                    jSONObject.put("url_path", path);
                    jSONObject.put("url_last_path_segment", lastPathSegment);
                    jSONObject.put("net_lib", i2);
                    jSONObject.put("status_code", i);
                    if (str != null) {
                        jSONObject.put("err_msg", C60161d.m233747a(str, this.f149760s.mo205470a("exception_msg_length", ParticipantRepo.f117150c)));
                    }
                    jSONObject.put("download_sec", nanos);
                    jSONObject.put("download_mb", d);
                    if (nanos > 0.0d) {
                        jSONObject.put("download_speed", d / nanos);
                    }
                    if (this.f149766y) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    jSONObject.put("rw_concurrent", i3);
                    if (this.f149765x) {
                        jSONObject.put("rw_read_time", ((double) this.f149767z) / d2);
                        jSONObject.put("rw_write_time", ((double) this.f149738A) / d2);
                        jSONObject.put("rw_sync_time", ((double) this.f149739B) / d2);
                    }
                    jSONObject.put("pkg_name", this.f149744c.getPackageName());
                    jSONObject.put("name", this.f149744c.getTitle());
                    if ((a == 1 || a == 3) && (g = C60046b.m232995g()) != null) {
                        g.mo204284a("download_io", jSONObject, null, null);
                    }
                    if ((a == 2 || a == 3) && (I = C60046b.m232947I()) != null) {
                        I.mo204283a(this.f149744c, "download_io", jSONObject);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo204718a(long j, long j2) {
        this.f149757p = j;
        this.f149758q = j2;
    }

    /* renamed from: a */
    public void mo204719a(long j, long j2, long j3) {
        this.f149755n = j;
        this.f149756o = j;
        this.f149757p = j2;
        this.f149758q = j3;
    }

    public C60050d(DownloadInfo downloadInfo, String str, AbstractC60137g gVar, DownloadChunk downloadChunk, AbstractC60076e eVar) {
        boolean z;
        this.f149744c = downloadInfo;
        this.f149745d = str;
        AbstractC60059i t = C60046b.m233010t();
        this.f149747f = t;
        if (t instanceof C60090d) {
            C60090d dVar = (C60090d) t;
            this.f149748g = dVar.mo204937a();
            this.f149749h = dVar.mo204938b();
        }
        this.f149743a = gVar;
        this.f149746e = downloadChunk;
        this.f149754m = eVar;
        long n = downloadChunk.mo205022n();
        this.f149755n = n;
        this.f149756o = n;
        boolean z2 = false;
        if (downloadChunk.mo205011d()) {
            this.f149758q = downloadChunk.mo205025q();
        } else {
            this.f149758q = downloadChunk.mo205008c(false);
        }
        this.f149757p = downloadChunk.mo205024p();
        this.f149761t = C59986a.m232821a();
        C60148a a = C60148a.m233720a(downloadInfo.getId());
        this.f149760s = a;
        if (a.mo205470a("sync_strategy", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f149762u = z;
        if (z) {
            this.f149763v = Math.max((long) a.mo205470a("sync_interval_ms_fg", 5000), 500L);
            this.f149764w = Math.max((long) a.mo205470a("sync_interval_ms_bg", 1000), 500L);
        } else {
            this.f149763v = 0;
            this.f149764w = 0;
        }
        this.f149765x = a.mo205474b("monitor_rw") == 1 ? true : z2;
        this.f149759r = C60158a.m233738a(65536);
    }
}

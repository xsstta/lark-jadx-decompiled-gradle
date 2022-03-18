package com.bytedance.ee.bear.doc.resupdate.download.p297a;

import com.bytedance.ee.bear.doc.resupdate.download.AbstractC5463c;
import com.bytedance.ee.log.C13479a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.bear.doc.resupdate.download.a.b */
public class C5456b {

    /* renamed from: a */
    public C5459c f15518a;

    /* renamed from: b */
    public long f15519b;

    /* renamed from: c */
    public volatile boolean f15520c;

    /* renamed from: d */
    public long[] f15521d;

    /* renamed from: e */
    public File f15522e;

    /* renamed from: f */
    public volatile boolean f15523f;

    /* renamed from: g */
    private final int f15524g = 3;

    /* renamed from: h */
    private AtomicInteger f15525h = new AtomicInteger(0);

    /* renamed from: i */
    private AtomicInteger f15526i = new AtomicInteger(0);

    /* renamed from: j */
    private C5461e f15527j;

    /* renamed from: k */
    private File[] f15528k;

    /* renamed from: l */
    private AbstractC5463c f15529l;

    /* renamed from: c */
    public AbstractC5463c mo21843c() {
        return this.f15529l;
    }

    /* renamed from: b */
    public void mo21842b() {
        this.f15523f = false;
        this.f15520c = false;
    }

    /* renamed from: a */
    public synchronized void mo21835a() {
        try {
            if (!this.f15520c) {
                this.f15520c = true;
                mo21836a(5);
                if (new File(this.f15518a.mo21846c(), this.f15518a.mo21844a()).exists()) {
                    AbstractC5463c cVar = this.f15529l;
                    if (cVar != null) {
                        cVar.mo21829a(false);
                    }
                    return;
                }
                this.f15527j.mo21849a(this.f15518a.mo21845b(), new Callback() {
                    /* class com.bytedance.ee.bear.doc.resupdate.download.p297a.C5456b.C54571 */

                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        C13479a.m54758a("DownloadTask", "start:Exception " + iOException.getMessage() + "\n" + C5456b.this.f15518a.mo21845b());
                        C5456b.this.mo21839a(iOException);
                        C5456b.this.mo21842b();
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws IOException {
                        C13479a.m54764b("DownloadTask", "start: " + response.code() + "\t isDownloading:" + C5456b.this.f15520c + "\t");
                        if (response.code() != 200) {
                            C5456b bVar = C5456b.this;
                            bVar.mo21839a(new IOException("getContentLength failed, code  = " + response.code() + ", msg = " + response.message()));
                            C5456b.this.mo21840a(response.body());
                            C5456b.this.mo21842b();
                            return;
                        }
                        C5456b.this.f15519b = response.body().contentLength();
                        C5456b.this.mo21840a(response.body());
                        C5456b bVar2 = C5456b.this;
                        String c = C5456b.this.f15518a.mo21846c();
                        bVar2.f15522e = new File(c, C5456b.this.f15518a.mo21844a() + ".tmp");
                        if (!C5456b.this.f15522e.getParentFile().exists()) {
                            C5456b.this.f15522e.getParentFile().mkdirs();
                        }
                        new RandomAccessFile(C5456b.this.f15522e, "rw").setLength(C5456b.this.f15519b);
                        long j = C5456b.this.f15519b / 3;
                        int i = 0;
                        while (i < 3) {
                            long j2 = ((long) i) * j;
                            int i2 = i + 1;
                            long j3 = (((long) i2) * j) - 1;
                            if (i == 2) {
                                j3 = C5456b.this.f15519b - 1;
                            }
                            C5456b.this.mo21837a(j2, j3, i);
                            i = i2;
                        }
                    }
                });
                return;
            }
            return;
        } catch (IOException e) {
            C13479a.m54759a("DownloadTask", "start download() fail: ", e);
            mo21839a(e);
            mo21842b();
        }
    }

    /* renamed from: a */
    public void mo21838a(AbstractC5463c cVar) {
        this.f15529l = cVar;
    }

    /* renamed from: a */
    private boolean m22122a(AtomicInteger atomicInteger) {
        if (atomicInteger.incrementAndGet() % 3 != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo21839a(Throwable th) {
        AbstractC5463c cVar = this.f15529l;
        if (cVar == null) {
            C13479a.m54758a("DownloadTask", "handleFail(): mListener == null");
        } else {
            cVar.mo21828a(th);
        }
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:311)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    /* renamed from: a */
    public void mo21840a(java.io.Closeable... r6) {
        /*
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L_0x0003:
            r3 = 0
            if (r2 >= r0) goto L_0x0027
            r4 = r6[r2]     // Catch:{ IOException -> 0x0014 }
            if (r4 == 0) goto L_0x000f
            r4 = r6[r2]     // Catch:{ IOException -> 0x0014 }
            r4.close()     // Catch:{ IOException -> 0x0014 }
        L_0x000f:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0012:
            r2 = move-exception
            goto L_0x001f
        L_0x0014:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x0012 }
        L_0x0018:
            if (r1 >= r0) goto L_0x002e
            r6[r1] = r3
            int r1 = r1 + 1
            goto L_0x0018
        L_0x001f:
            if (r1 >= r0) goto L_0x0026
            r6[r1] = r3
            int r1 = r1 + 1
            goto L_0x001f
        L_0x0026:
            throw r2
        L_0x0027:
            if (r1 >= r0) goto L_0x002e
            r6[r1] = r3
            int r1 = r1 + 1
            goto L_0x0027
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.resupdate.download.p297a.C5456b.mo21840a(java.io.Closeable[]):void");
    }

    /* renamed from: a */
    public void mo21836a(int i) {
        AbstractC5463c cVar = this.f15529l;
        if (cVar != null) {
            if (i == 1) {
                int length = this.f15521d.length;
                for (int i2 = 0; i2 < length; i2++) {
                    long j = this.f15521d[i2];
                }
            } else if (i != 2) {
                if (i != 3) {
                    if (i == 5) {
                        cVar.mo21826a();
                    }
                } else if (!m22122a(this.f15525h)) {
                    mo21842b();
                    this.f15521d = new long[3];
                }
            } else if (!m22122a(this.f15526i)) {
                this.f15522e.renameTo(new File(this.f15518a.mo21846c(), this.f15518a.mo21844a()));
                mo21842b();
                this.f15529l.mo21829a(true);
            }
        }
    }

    /* renamed from: a */
    public void mo21841a(File... fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            if (fileArr[i] != null) {
                fileArr[i].delete();
            }
        }
    }

    C5456b(C5459c cVar, AbstractC5463c cVar2) {
        this.f15518a = cVar;
        this.f15529l = cVar2;
        this.f15521d = new long[3];
        this.f15528k = new File[3];
        this.f15527j = C5461e.m22136a();
    }

    /* renamed from: a */
    public void mo21837a(final long j, long j2, final int i) throws IOException {
        final long j3;
        C13479a.m54764b("DownloadTask", "download: threadId = " + i);
        String c = this.f15518a.mo21846c();
        final File file = new File(c, "thread" + i + "_" + this.f15518a.mo21844a() + ".cache");
        this.f15528k[i] = file;
        final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        if (file.exists()) {
            String readLine = randomAccessFile.readLine();
            if (readLine != null) {
                try {
                    j3 = (long) Integer.parseInt(readLine);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                this.f15527j.mo21848a(this.f15518a.mo21845b(), j3, j2, new Callback() {
                    /* class com.bytedance.ee.bear.doc.resupdate.download.p297a.C5456b.C54582 */

                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        C5456b.this.f15520c = false;
                        C5456b.this.mo21839a(iOException);
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws IOException {
                        if (response.code() != 206) {
                            C13479a.m54775e("DownloadTask", "download: " + response.code() + "\t isDownloading:" + C5456b.this.f15520c + "\t");
                            C5456b bVar = C5456b.this;
                            bVar.mo21839a(new IOException("downloadFileByRange failed, code  = " + response.code() + ", msg = " + response.message()));
                            C5456b.this.mo21842b();
                            return;
                        }
                        InputStream byteStream = response.body().byteStream();
                        RandomAccessFile randomAccessFile = new RandomAccessFile(C5456b.this.f15522e, "rw");
                        randomAccessFile.seek(j3);
                        byte[] bArr = new byte[4096];
                        int i = 0;
                        while (true) {
                            int read = byteStream.read(bArr);
                            if (read <= 0) {
                                C5456b.this.mo21840a(randomAccessFile, byteStream, response.body());
                                C5456b.this.mo21841a(file);
                                C5456b.this.mo21836a(2);
                                return;
                            } else if (C5456b.this.f15523f) {
                                C5456b.this.mo21840a(randomAccessFile, byteStream, response.body());
                                C5456b.this.mo21841a(file);
                                C5456b.this.mo21836a(3);
                                return;
                            } else {
                                randomAccessFile.write(bArr, 0, read);
                                i += read;
                                long j = j3 + ((long) i);
                                randomAccessFile.seek(0);
                                RandomAccessFile randomAccessFile2 = randomAccessFile;
                                randomAccessFile2.write((j + "").getBytes("UTF-8"));
                                C5456b.this.f15521d[i] = j - j;
                                C5456b.this.mo21836a(1);
                            }
                        }
                    }
                });
            }
            C13479a.m54764b("DownloadTask", "download(): cacheFile.exists() but startIndexStr is null");
        }
        j3 = j;
        this.f15527j.mo21848a(this.f15518a.mo21845b(), j3, j2, new Callback() {
            /* class com.bytedance.ee.bear.doc.resupdate.download.p297a.C5456b.C54582 */

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                C5456b.this.f15520c = false;
                C5456b.this.mo21839a(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                if (response.code() != 206) {
                    C13479a.m54775e("DownloadTask", "download: " + response.code() + "\t isDownloading:" + C5456b.this.f15520c + "\t");
                    C5456b bVar = C5456b.this;
                    bVar.mo21839a(new IOException("downloadFileByRange failed, code  = " + response.code() + ", msg = " + response.message()));
                    C5456b.this.mo21842b();
                    return;
                }
                InputStream byteStream = response.body().byteStream();
                RandomAccessFile randomAccessFile = new RandomAccessFile(C5456b.this.f15522e, "rw");
                randomAccessFile.seek(j3);
                byte[] bArr = new byte[4096];
                int i = 0;
                while (true) {
                    int read = byteStream.read(bArr);
                    if (read <= 0) {
                        C5456b.this.mo21840a(randomAccessFile, byteStream, response.body());
                        C5456b.this.mo21841a(file);
                        C5456b.this.mo21836a(2);
                        return;
                    } else if (C5456b.this.f15523f) {
                        C5456b.this.mo21840a(randomAccessFile, byteStream, response.body());
                        C5456b.this.mo21841a(file);
                        C5456b.this.mo21836a(3);
                        return;
                    } else {
                        randomAccessFile.write(bArr, 0, read);
                        i += read;
                        long j = j3 + ((long) i);
                        randomAccessFile.seek(0);
                        RandomAccessFile randomAccessFile2 = randomAccessFile;
                        randomAccessFile2.write((j + "").getBytes("UTF-8"));
                        C5456b.this.f15521d[i] = j - j;
                        C5456b.this.mo21836a(1);
                    }
                }
            }
        });
    }
}

package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.android.play.core.splitcompat.C22662a;
import com.google.android.play.core.splitcompat.C22666e;
import com.google.android.play.core.splitcompat.C22679r;
import com.google.android.play.core.splitinstall.AbstractC22722t;
import com.google.android.play.core.splitinstall.AbstractC22727y;
import com.google.android.play.core.splitinstall.az;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.play.core.internal.ae */
public final class C22624ae implements AbstractC22727y {

    /* renamed from: a */
    private final Context f56020a;

    /* renamed from: b */
    private final C22666e f56021b;

    /* renamed from: c */
    private final C22625af f56022c;

    /* renamed from: d */
    private final Executor f56023d;

    /* renamed from: e */
    private final C22679r f56024e;

    public C22624ae(Context context, Executor executor, C22625af afVar, C22666e eVar, C22679r rVar) {
        this.f56020a = context;
        this.f56021b = eVar;
        this.f56022c = afVar;
        this.f56023d = executor;
        this.f56024e = rVar;
    }

    /* renamed from: a */
    private final Integer m82247a(List<Intent> list) {
        FileLock fileLock;
        try {
            FileChannel channel = new RandomAccessFile(this.f56021b.mo78985b(), "rw").getChannel();
            Integer num = null;
            try {
                fileLock = channel.tryLock();
            } catch (OverlappingFileLockException unused) {
                fileLock = null;
            }
            if (fileLock != null) {
                int i = 0;
                try {
                    Log.i("SplitCompat", "Copying splits.");
                    for (Intent intent : list) {
                        String stringExtra = intent.getStringExtra("split_id");
                        AssetFileDescriptor openAssetFileDescriptor = this.f56020a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                        File a = this.f56021b.mo78982a(stringExtra);
                        if (!a.exists() || a.length() == openAssetFileDescriptor.getLength()) {
                            if (a.exists()) {
                            }
                        }
                        if (!this.f56021b.mo78986b(stringExtra).exists()) {
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(openAssetFileDescriptor.createInputStream());
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(a);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = bufferedInputStream.read(bArr);
                                        if (read <= 0) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                    fileOutputStream.close();
                                    bufferedInputStream.close();
                                } catch (Throwable th) {
                                    bx.m82371a(th, th);
                                }
                            } catch (Throwable th2) {
                                bx.m82371a(th, th2);
                            }
                        }
                    }
                    Log.i("SplitCompat", "Splits copied.");
                    try {
                        if (this.f56022c.mo78864a()) {
                            try {
                                Log.i("SplitCompat", "Splits verified.");
                                num = Integer.valueOf(i);
                                fileLock.release();
                            } catch (Throwable th3) {
                                bx.m82371a(th, th3);
                            }
                        } else {
                            Log.e("SplitCompat", "Split verification failed.");
                            i = -11;
                            num = Integer.valueOf(i);
                            fileLock.release();
                        }
                    } catch (Exception e) {
                        Log.e("SplitCompat", "Error verifying splits.", e);
                    }
                } catch (Exception e2) {
                    Log.e("SplitCompat", "Error copying splits.", e2);
                    i = -13;
                }
            }
            if (channel != null) {
                channel.close();
            }
            return num;
            throw th;
            throw th;
            throw th;
        } catch (Exception e3) {
            Log.e("SplitCompat", "Error locking files.", e3);
            return -13;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m82248a(C22624ae aeVar, AbstractC22722t tVar) {
        try {
            if (C22662a.m82496c(az.m82612a(aeVar.f56020a))) {
                Log.i("SplitCompat", "Splits installed.");
                tVar.mo79039a();
                return;
            }
            Log.e("SplitCompat", "Emulating splits failed.");
            tVar.mo79040a(-12);
        } catch (Exception e) {
            Log.e("SplitCompat", "Error emulating splits.", e);
            tVar.mo79040a(-12);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m82249a(C22624ae aeVar, List list, AbstractC22722t tVar) {
        Integer a = aeVar.m82247a(list);
        if (a == null) {
            return;
        }
        if (a.intValue() == 0) {
            tVar.mo79041b();
        } else {
            tVar.mo79040a(a.intValue());
        }
    }

    @Override // com.google.android.play.core.splitinstall.AbstractC22727y
    /* renamed from: a */
    public final void mo78863a(List<Intent> list, AbstractC22722t tVar) {
        if (C22662a.m82488a()) {
            this.f56023d.execute(new RunnableC22623ad(this, list, tVar));
            return;
        }
        throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
    }
}

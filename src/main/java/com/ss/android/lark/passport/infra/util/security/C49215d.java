package com.ss.android.lark.passport.infra.util.security;

import com.ss.android.lark.passport.infra.util.C49201o;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.ss.android.lark.passport.infra.util.security.d */
public class C49215d {

    /* renamed from: a */
    private RandomAccessFile f123532a;

    /* renamed from: b */
    private FileLock f123533b;

    /* renamed from: a */
    public void mo171730a() {
        RandomAccessFile randomAccessFile = this.f123532a;
        if (randomAccessFile != null) {
            try {
                this.f123533b = randomAccessFile.getChannel().lock();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo171731b() {
        FileLock fileLock = this.f123533b;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f123533b.release();
                C49201o.m193966a(this.f123532a);
                RandomAccessFile randomAccessFile = this.f123532a;
                if (randomAccessFile != null) {
                    C49201o.m193966a(randomAccessFile.getChannel());
                }
            } catch (Exception e) {
                e.printStackTrace();
                C49201o.m193966a(this.f123532a);
                RandomAccessFile randomAccessFile2 = this.f123532a;
                if (randomAccessFile2 != null) {
                    C49201o.m193966a(randomAccessFile2.getChannel());
                }
            } catch (Throwable th) {
                C49201o.m193966a(this.f123532a);
                RandomAccessFile randomAccessFile3 = this.f123532a;
                if (randomAccessFile3 != null) {
                    C49201o.m193966a(randomAccessFile3.getChannel());
                }
                throw th;
            }
        }
    }

    public C49215d(File file) {
        if (file != null) {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                this.f123532a = new RandomAccessFile(file, "rw");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}

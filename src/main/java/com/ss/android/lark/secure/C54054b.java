package com.ss.android.lark.secure;

import com.ss.android.lark.utils.C57839i;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* renamed from: com.ss.android.lark.secure.b */
public class C54054b {

    /* renamed from: a */
    private RandomAccessFile f133854a;

    /* renamed from: b */
    private FileLock f133855b;

    /* renamed from: a */
    public void mo185050a() {
        RandomAccessFile randomAccessFile = this.f133854a;
        if (randomAccessFile != null) {
            try {
                this.f133855b = randomAccessFile.getChannel().lock();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public void mo185051b() {
        FileLock fileLock = this.f133855b;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f133855b.release();
                C57839i.m224502a(this.f133854a);
                RandomAccessFile randomAccessFile = this.f133854a;
                if (randomAccessFile != null) {
                    C57839i.m224502a(randomAccessFile.getChannel());
                }
            } catch (Exception e) {
                e.printStackTrace();
                C57839i.m224502a(this.f133854a);
                RandomAccessFile randomAccessFile2 = this.f133854a;
                if (randomAccessFile2 != null) {
                    C57839i.m224502a(randomAccessFile2.getChannel());
                }
            } catch (Throwable th) {
                C57839i.m224502a(this.f133854a);
                RandomAccessFile randomAccessFile3 = this.f133854a;
                if (randomAccessFile3 != null) {
                    C57839i.m224502a(randomAccessFile3.getChannel());
                }
                throw th;
            }
        }
    }

    public C54054b(File file) {
        if (file != null) {
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                this.f133854a = new RandomAccessFile(file, "rw");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}

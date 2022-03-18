package com.huawei.hms.availableupdate;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: com.huawei.hms.availableupdate.b */
public class C23463b extends OutputStream {

    /* renamed from: a */
    public RandomAccessFile f57871a;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f57871a.close();
    }

    /* renamed from: a */
    public void mo82111a(long j) throws IOException {
        this.f57871a.seek(j);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public C23463b(File file, int i) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            this.f57871a = randomAccessFile;
            randomAccessFile.setLength((long) i);
        } catch (FileNotFoundException unused) {
            HMSLog.m86964e("RandomFileOutputStream", "create  file stream failed");
        } catch (IOException unused2) {
            IOUtils.closeQuietly(this.f57871a);
            HMSLog.m86964e("RandomFileOutputStream", "create  file stream failed");
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.f57871a.write(bArr, i, i2);
    }
}

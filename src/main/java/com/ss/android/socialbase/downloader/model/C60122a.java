package com.ss.android.socialbase.downloader.model;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.utils.C60161d;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.ss.android.socialbase.downloader.model.a */
public class C60122a implements Closeable {

    /* renamed from: a */
    private BufferedOutputStream f150034a;

    /* renamed from: b */
    private FileDescriptor f150035b;

    /* renamed from: c */
    private RandomAccessFile f150036c;

    /* renamed from: a */
    public void mo205419a() throws IOException {
        BufferedOutputStream bufferedOutputStream = this.f150034a;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
        FileDescriptor fileDescriptor = this.f150035b;
        if (fileDescriptor != null) {
            fileDescriptor.sync();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C60161d.m233767a(this.f150036c, this.f150034a);
    }

    /* renamed from: a */
    public void mo205420a(long j) throws IOException {
        this.f150036c.seek(j);
    }

    /* renamed from: b */
    public void mo205422b(long j) throws IOException {
        this.f150036c.setLength(j);
    }

    public C60122a(File file, int i) throws BaseException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.f150036c = randomAccessFile;
            this.f150035b = randomAccessFile.getFD();
            if (i > 0) {
                if (i < 8192) {
                    i = 8192;
                } else if (i > 131072) {
                    i = 131072;
                }
                this.f150034a = new BufferedOutputStream(new FileOutputStream(this.f150036c.getFD()), i);
                return;
            }
            this.f150034a = new BufferedOutputStream(new FileOutputStream(this.f150036c.getFD()));
        } catch (IOException e) {
            throw new BaseException(1039, e);
        }
    }

    /* renamed from: a */
    public void mo205421a(byte[] bArr, int i, int i2) throws IOException {
        this.f150034a.write(bArr, i, i2);
    }
}

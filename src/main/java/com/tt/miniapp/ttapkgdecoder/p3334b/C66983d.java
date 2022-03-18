package com.tt.miniapp.ttapkgdecoder.p3334b;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import java.io.File;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.tt.miniapp.ttapkgdecoder.b.d */
public class C66983d extends C66981b {

    /* renamed from: c */
    private MappedByteBuffer f168910c;

    public C66983d(File file) {
        super(file);
        if (this.f168909b != null) {
            try {
                this.f168910c = this.f168909b.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());
            } catch (IOException e) {
                AppBrandLogger.m52829e("MappedByteBufferDiskSource", e);
            }
        }
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c, com.tt.miniapp.ttapkgdecoder.p3334b.C66981b
    /* renamed from: a */
    public void mo233014a(byte[] bArr) throws IOException {
        try {
            if (this.f168910c.position() != this.f168908a) {
                this.f168910c.position(this.f168908a);
            }
            this.f168910c.get(bArr);
            this.f168908a += bArr.length;
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("MappedByteBufferDiskSource", "readFully", e);
            super.mo233014a(bArr);
        }
    }

    @Override // com.tt.miniapp.ttapkgdecoder.p3334b.AbstractC66982c, com.tt.miniapp.ttapkgdecoder.p3334b.C66981b
    /* renamed from: a */
    public int mo233013a(byte[] bArr, int i, int i2) throws IOException {
        try {
            if (this.f168910c.position() != this.f168908a) {
                this.f168910c.position(this.f168908a);
            }
            this.f168910c.get(bArr, i, i2);
            this.f168908a += i2;
            return i2;
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("MappedByteBufferDiskSource", "read", e);
            return super.mo233013a(bArr, i, i2);
        }
    }
}

package com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.c */
public class C7337c {

    /* renamed from: a */
    private int f19630a;

    /* renamed from: b */
    private int f19631b;

    /* renamed from: c */
    private int f19632c;

    /* renamed from: d */
    private int f19633d;

    /* renamed from: e */
    private int f19634e;

    /* renamed from: f */
    private int f19635f;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.c$a */
    public interface AbstractC7338a {
        /* renamed from: a */
        void mo28594a(Exception exc);

        /* renamed from: a */
        void mo28595a(byte[] bArr, boolean z);
    }

    /* renamed from: b */
    private static boolean m29314b(int i) {
        if (i == 1) {
            return false;
        }
        return ((i >= 208 && i <= 215) || i == 217 || i == 216) ? false : true;
    }

    /* renamed from: a */
    public int mo28592a() {
        return this.f19634e;
    }

    /* renamed from: a */
    private void m29309a(int i) {
        int i2 = this.f19633d;
        if (i2 > 0) {
            this.f19635f = i;
        }
        this.f19633d = i2 + 1;
        this.f19634e = i2;
    }

    /* renamed from: a */
    private void m29310a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write(i);
    }

    /* renamed from: a */
    private void m29312a(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, 16384);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo28593a(InputStream inputStream, AbstractC7338a aVar) {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (this.f19630a != 6 && (read = bufferedInputStream.read()) != -1) {
            try {
                m29310a(byteArrayOutputStream, read);
                this.f19632c++;
                int i = this.f19630a;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    this.f19630a = 5;
                                } else if (i == 5) {
                                    int i2 = ((this.f19631b << 8) + read) - 2;
                                    m29313a(bufferedInputStream, byteArrayOutputStream, i2);
                                    this.f19632c += i2;
                                    this.f19630a = 2;
                                }
                            } else if (read == 255) {
                                this.f19630a = 3;
                            } else if (read == 0) {
                                this.f19630a = 2;
                            } else {
                                if (read == 218) {
                                    m29311a(byteArrayOutputStream, false, aVar);
                                } else if (read == 217) {
                                    m29311a(byteArrayOutputStream, true, aVar);
                                }
                                if (m29314b(read)) {
                                    this.f19630a = 4;
                                } else {
                                    this.f19630a = 2;
                                }
                            }
                        } else if (read == 255) {
                            this.f19630a = 3;
                        }
                    } else if (read == 216) {
                        this.f19630a = 2;
                    } else {
                        this.f19630a = 6;
                    }
                } else if (read == 255) {
                    this.f19630a = 1;
                } else {
                    this.f19630a = 6;
                }
                this.f19631b = read;
            } catch (IOException e) {
                if (aVar != null) {
                    aVar.mo28594a(e);
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        if (this.f19630a == 6) {
            m29312a(bufferedInputStream, byteArrayOutputStream);
            m29311a(byteArrayOutputStream, true, aVar);
        }
        try {
            bufferedInputStream.close();
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
    }

    /* renamed from: a */
    private void m29311a(ByteArrayOutputStream byteArrayOutputStream, boolean z, AbstractC7338a aVar) {
        m29309a(this.f19632c - 2);
        if (aVar == null) {
            return;
        }
        if (z || mo28592a() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (!z) {
                int length = byteArray.length;
                byte[] bArr = new byte[length];
                int i = length - 2;
                System.arraycopy(byteArray, 0, bArr, 0, i);
                System.arraycopy(new byte[]{-1, -39}, 0, bArr, i, 2);
                byteArray = bArr;
            }
            aVar.mo28595a(byteArray, z);
        }
    }

    /* renamed from: a */
    private void m29313a(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        byte[] bArr = new byte[16384];
        int i2 = 0;
        while (i - i2 > 16384) {
            int read = inputStream.read(bArr, 0, 16384);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                i2 += read;
            } else {
                return;
            }
        }
        while (i2 < i) {
            int read2 = inputStream.read(bArr, 0, i - i2);
            if (read2 != -1) {
                byteArrayOutputStream.write(bArr, 0, read2);
                i2 += read2;
            } else {
                return;
            }
        }
    }
}

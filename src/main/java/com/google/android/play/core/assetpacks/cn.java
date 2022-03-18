package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C22630b;
import com.google.android.play.core.internal.bx;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

final class cn {

    /* renamed from: a */
    private static final C22630b f55870a = new C22630b("SliceMetadataManager");

    /* renamed from: b */
    private final byte[] f55871b = new byte[8192];

    /* renamed from: c */
    private final C22614x f55872c;

    /* renamed from: d */
    private final String f55873d;

    /* renamed from: e */
    private final int f55874e;

    /* renamed from: f */
    private final long f55875f;

    /* renamed from: g */
    private final String f55876g;

    /* renamed from: h */
    private int f55877h;

    cn(C22614x xVar, String str, int i, long j, String str2) {
        this.f55872c = xVar;
        this.f55873d = str;
        this.f55874e = i;
        this.f55875f = j;
        this.f55876g = str2;
    }

    /* renamed from: e */
    private final File m82080e() {
        File f = this.f55872c.mo78844f(this.f55873d, this.f55874e, this.f55875f, this.f55876g);
        if (!f.exists()) {
            f.mkdirs();
        }
        return f;
    }

    /* renamed from: f */
    private final File m82081f() throws IOException {
        File c = this.f55872c.mo78834c(this.f55873d, this.f55874e, this.f55875f, this.f55876g);
        c.getParentFile().mkdirs();
        c.createNewFile();
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final cm mo78793a() throws IOException {
        File c = this.f55872c.mo78834c(this.f55873d, this.f55874e, this.f55875f, this.f55876g);
        if (c.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(c);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new ay("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f55877h = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C22580ae(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new ay("Slice checkpoint file corrupt.", e);
                }
            } catch (Throwable th) {
                bx.m82371a(th, th);
            }
        } else {
            throw new ay("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78794a(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(mo78800b().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f55877h));
        FileOutputStream fileOutputStream = new FileOutputStream(m82081f());
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78795a(InputStream inputStream, long j) throws IOException {
        int read;
        File b = mo78800b();
        b.getParentFile().mkdirs();
        RandomAccessFile randomAccessFile = new RandomAccessFile(b, "rw");
        randomAccessFile.seek(j);
        do {
            read = inputStream.read(this.f55871b);
            if (read > 0) {
                randomAccessFile.write(this.f55871b, 0, read);
            }
        } while (read == this.f55871b.length);
        randomAccessFile.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78796a(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f55877h));
        FileOutputStream fileOutputStream = new FileOutputStream(m82081f());
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78797a(byte[] bArr) throws IOException {
        File e = m82080e();
        int i = this.f55877h;
        this.f55877h = i + 1;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(e, String.format("%s-LFH.dat", Integer.valueOf(i))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                return;
            } catch (Throwable th) {
                bx.m82371a(th, th);
            }
            throw th;
        } catch (IOException e2) {
            throw new ay("Could not write metadata file.", e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78798a(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f55877h));
        FileOutputStream fileOutputStream = new FileOutputStream(m82081f());
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
        File d = this.f55872c.mo78839d(this.f55873d, this.f55874e, this.f55875f, this.f55876g);
        if (d.exists()) {
            d.delete();
        }
        FileOutputStream fileOutputStream2 = new FileOutputStream(d);
        fileOutputStream2.write(bArr);
        fileOutputStream2.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78799a(byte[] bArr, InputStream inputStream) throws IOException {
        File e = m82080e();
        int i = this.f55877h;
        this.f55877h = i + 1;
        FileOutputStream fileOutputStream = new FileOutputStream(new File(e, String.format("%s-NAM.dat", Integer.valueOf(i))));
        fileOutputStream.write(bArr);
        int read = inputStream.read(this.f55871b);
        while (read > 0) {
            fileOutputStream.write(this.f55871b, 0, read);
            read = inputStream.read(this.f55871b);
        }
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final File mo78800b() {
        return new File(m82080e(), String.format("%s-NAM.dat", Integer.valueOf(this.f55877h - 1)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo78801b(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f55877h));
        FileOutputStream fileOutputStream = new FileOutputStream(m82081f());
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo78802c() throws IOException {
        File c = this.f55872c.mo78834c(this.f55873d, this.f55874e, this.f55875f, this.f55876g);
        if (!c.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(c);
        Properties properties = new Properties();
        properties.load(fileInputStream);
        if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
            return -1;
        }
        if (properties.getProperty("previousChunk") != null) {
            return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
        }
        throw new ay("Slice checkpoint file corrupt.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo78803d() {
        File c = this.f55872c.mo78834c(this.f55873d, this.f55874e, this.f55875f, this.f55876g);
        if (c.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(c);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f55870a.mo78873b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (IOException e) {
                f55870a.mo78873b("Could not read checkpoint while checking if extraction finished. %s", e);
            }
        }
        return false;
    }
}

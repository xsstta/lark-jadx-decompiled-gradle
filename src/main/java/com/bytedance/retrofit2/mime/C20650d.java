package com.bytedance.retrofit2.mime;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.bytedance.retrofit2.mime.d */
public final class C20650d implements TypedOutput {

    /* renamed from: a */
    private final List<C20651a> f50377a;

    /* renamed from: b */
    private final byte[] f50378b;

    /* renamed from: c */
    private final String f50379c;

    /* renamed from: d */
    private long f50380d;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return this.f50380d;
    }

    /* renamed from: a */
    public int mo69482a() {
        return this.f50377a.size();
    }

    public C20650d() {
        this(UUID.randomUUID().toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.retrofit2.mime.d$a */
    public static final class C20651a {

        /* renamed from: a */
        private final TypedOutput f50381a;

        /* renamed from: b */
        private final String f50382b;

        /* renamed from: c */
        private final String f50383c;

        /* renamed from: d */
        private final boolean f50384d;

        /* renamed from: e */
        private final String f50385e;

        /* renamed from: f */
        private byte[] f50386f;

        /* renamed from: g */
        private byte[] f50387g;

        /* renamed from: h */
        private boolean f50388h;

        /* renamed from: b */
        private void m75086b() {
            if (!this.f50388h) {
                this.f50386f = C20650d.m75081a(this.f50385e, this.f50384d, false);
                this.f50387g = C20650d.m75082b(this.f50382b, this.f50383c, this.f50381a);
                this.f50388h = true;
            }
        }

        /* renamed from: a */
        public long mo69485a() {
            m75086b();
            if (this.f50381a.length() > -1) {
                return this.f50381a.length() + ((long) this.f50386f.length) + ((long) this.f50387g.length);
            }
            return -1;
        }

        /* renamed from: a */
        public void mo69486a(OutputStream outputStream) throws IOException {
            m75086b();
            outputStream.write(this.f50386f);
            outputStream.write(this.f50387g);
            this.f50381a.writeTo(outputStream);
        }

        public C20651a(String str, String str2, TypedOutput typedOutput, String str3, boolean z) {
            this.f50382b = str;
            this.f50383c = str2;
            this.f50381a = typedOutput;
            this.f50384d = z;
            this.f50385e = str3;
        }
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return "multipart/form-data; boundary=" + this.f50379c;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e A[SYNTHETIC, Splitter:B:21:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0035 A[SYNTHETIC, Splitter:B:25:0x0035] */
    @Override // com.bytedance.retrofit2.mime.TypedOutput
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String md5Stub() {
        /*
            r6 = this;
            long r0 = r6.f50380d
            r2 = 0
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x002a }
            r0.<init>()     // Catch:{ all -> 0x002a }
            r6.writeTo(r0)     // Catch:{ all -> 0x0028 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0028 }
            byte[] r3 = r0.toByteArray()     // Catch:{ all -> 0x0028 }
            r1.<init>(r3)     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = com.bytedance.retrofit2.mime.C20647a.m75075a(r1)     // Catch:{ all -> 0x0026 }
            r0.close()     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r1.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            return r2
        L_0x0026:
            goto L_0x002c
        L_0x0028:
            r1 = r2
            goto L_0x002c
        L_0x002a:
            r0 = r2
            r1 = r0
        L_0x002c:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ all -> 0x0032 }
            goto L_0x0033
        L_0x0032:
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.mime.C20650d.md5Stub():java.lang.String");
    }

    C20650d(String str) {
        this.f50377a = new LinkedList();
        this.f50379c = str;
        byte[] a = m75081a(str, false, true);
        this.f50378b = a;
        this.f50380d = (long) a.length;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        for (C20651a aVar : this.f50377a) {
            aVar.mo69486a(outputStream);
        }
        outputStream.write(this.f50378b);
    }

    /* renamed from: a */
    public void mo69483a(String str, TypedOutput typedOutput) {
        mo69484a(str, "binary", typedOutput);
    }

    /* renamed from: a */
    public static byte[] m75081a(String str, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder(str.length() + 8);
            if (!z) {
                sb.append("\r\n");
            }
            sb.append("--");
            sb.append(str);
            if (z2) {
                sb.append("--");
            }
            sb.append("\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart boundary", e);
        }
    }

    /* renamed from: b */
    public static byte[] m75082b(String str, String str2, TypedOutput typedOutput) {
        try {
            StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
            sb.append("Content-Disposition: form-data; name=\"");
            sb.append(str);
            String fileName = typedOutput.fileName();
            if (fileName != null) {
                sb.append("\"; filename=\"");
                sb.append(fileName);
            }
            sb.append("\"\r\nContent-Type: ");
            sb.append(typedOutput.mimeType());
            long length = typedOutput.length();
            if (length != -1) {
                sb.append("\r\nContent-Length: ");
                sb.append(length);
            }
            sb.append("\r\nContent-Transfer-Encoding: ");
            sb.append(str2);
            sb.append("\r\n\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e) {
            throw new RuntimeException("Unable to write multipart header", e);
        }
    }

    /* renamed from: a */
    public void mo69484a(String str, String str2, TypedOutput typedOutput) {
        Objects.requireNonNull(str, "Part name must not be null.");
        Objects.requireNonNull(str2, "Transfer encoding must not be null.");
        Objects.requireNonNull(typedOutput, "Part body must not be null.");
        C20651a aVar = new C20651a(str, str2, typedOutput, this.f50379c, this.f50377a.isEmpty());
        this.f50377a.add(aVar);
        long a = aVar.mo69485a();
        if (a == -1) {
            this.f50380d = -1;
            return;
        }
        long j = this.f50380d;
        if (j != -1) {
            this.f50380d = j + a;
        }
    }
}

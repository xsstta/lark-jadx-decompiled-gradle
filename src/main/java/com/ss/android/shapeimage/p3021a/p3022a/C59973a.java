package com.ss.android.shapeimage.p3021a.p3022a;

import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.lark.log.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.shapeimage.a.a.a */
public class C59973a {

    /* renamed from: a */
    private static final String f149507a = C59982i.f149529a;

    /* renamed from: b */
    private final InputStream f149508b;

    /* renamed from: c */
    private ByteArrayOutputStream f149509c;

    /* renamed from: a */
    public ByteArrayInputStream mo204230a() {
        return new ByteArrayInputStream(this.f149509c.toByteArray());
    }

    /* renamed from: b */
    private void m232758b() throws IOException {
        this.f149509c = new ByteArrayOutputStream();
        byte[] bArr = new byte[DynamicModule.f58006b];
        while (true) {
            int read = this.f149508b.read(bArr);
            if (-1 != read) {
                this.f149509c.write(bArr, 0, read);
            } else {
                this.f149509c.flush();
                return;
            }
        }
    }

    public C59973a(InputStream inputStream) {
        this.f149508b = inputStream;
        try {
            m232758b();
        } catch (IOException e) {
            String str = f149507a;
            Log.m165397w(str, "IOException in CopyInputStream " + e.toString());
        }
    }
}

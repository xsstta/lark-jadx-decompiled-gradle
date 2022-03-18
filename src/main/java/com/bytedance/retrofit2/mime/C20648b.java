package com.bytedance.retrofit2.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Objects;

/* renamed from: com.bytedance.retrofit2.mime.b */
public final class C20648b implements TypedOutput {

    /* renamed from: a */
    final ByteArrayOutputStream f50375a = new ByteArrayOutputStream();

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return (long) this.f50375a.size();
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        return C20647a.m75076a(this.f50375a.toByteArray());
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f50375a.toByteArray());
    }

    /* renamed from: a */
    public void mo69480a(String str, String str2) {
        mo69481a(str, true, str2, true);
    }

    /* renamed from: a */
    public void mo69481a(String str, boolean z, String str2, boolean z2) {
        Objects.requireNonNull(str, "name");
        Objects.requireNonNull(str2, "value");
        if (this.f50375a.size() > 0) {
            this.f50375a.write(38);
        }
        if (z) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (z2) {
            str2 = URLEncoder.encode(str2, "UTF-8");
        }
        this.f50375a.write(str.getBytes("UTF-8"));
        this.f50375a.write(61);
        this.f50375a.write(str2.getBytes("UTF-8"));
    }
}

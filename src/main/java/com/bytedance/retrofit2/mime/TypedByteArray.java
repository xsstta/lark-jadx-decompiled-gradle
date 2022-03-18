package com.bytedance.retrofit2.mime;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Objects;

public class TypedByteArray implements TypedInput, TypedOutput {
    private final byte[] bytes;
    private final String fakeFileName;
    private final String mimeType;

    public byte[] getBytes() {
        return this.bytes;
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput, com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return this.mimeType;
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public InputStream in() throws IOException {
        return new ByteArrayInputStream(this.bytes);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput, com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return (long) this.bytes.length;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        if (TextUtils.isEmpty(this.fakeFileName)) {
            return null;
        }
        return this.fakeFileName;
    }

    public int hashCode() {
        return (this.mimeType.hashCode() * 31) + Arrays.hashCode(this.bytes);
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        byte[] bArr = this.bytes;
        if (bArr == null) {
            return null;
        }
        return C20647a.m75076a(bArr);
    }

    public String toString() {
        return "TypedByteArray[length=" + length() + "]";
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.bytes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TypedByteArray typedByteArray = (TypedByteArray) obj;
        if (Arrays.equals(this.bytes, typedByteArray.bytes) && this.mimeType.equals(typedByteArray.mimeType)) {
            return true;
        }
        return false;
    }

    public TypedByteArray(String str, byte[] bArr, String... strArr) {
        String str2;
        if (strArr == null || strArr.length <= 0) {
            str2 = null;
        } else {
            str2 = strArr[0];
        }
        if (str == null) {
            if (TextUtils.isEmpty(str2)) {
                str = "application/unknown";
            } else {
                str = "application/octet-stream";
            }
        }
        Objects.requireNonNull(bArr, "bytes");
        this.mimeType = str;
        this.bytes = bArr;
        this.fakeFileName = str2;
    }
}

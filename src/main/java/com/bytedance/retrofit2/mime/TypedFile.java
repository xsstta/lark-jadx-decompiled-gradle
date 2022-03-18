package com.bytedance.retrofit2.mime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

public class TypedFile implements TypedInput, TypedOutput {
    private final File file;
    private final String mimeType;

    public File file() {
        return this.file;
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput, com.bytedance.retrofit2.mime.TypedOutput
    public String mimeType() {
        return this.mimeType;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String fileName() {
        return this.file.getName();
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput
    public InputStream in() throws IOException {
        return new FileInputStream(this.file);
    }

    @Override // com.bytedance.retrofit2.mime.TypedInput, com.bytedance.retrofit2.mime.TypedOutput
    public long length() {
        return this.file.length();
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public String md5Stub() {
        if (this.file == null) {
        }
        return null;
    }

    public String toString() {
        return this.file.getAbsolutePath() + " (" + mimeType() + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TypedFile) {
            return this.file.equals(((TypedFile) obj).file);
        }
        return false;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                fileInputStream.close();
            }
        }
    }

    public void moveTo(TypedFile typedFile) throws IOException {
        if (!mimeType().equals(typedFile.mimeType())) {
            throw new IOException("Type mismatch.");
        } else if (!this.file.renameTo(typedFile.file())) {
            throw new IOException("Rename failed!");
        }
    }

    public TypedFile(String str, File file2) {
        str = str == null ? "application/octet-stream" : str;
        Objects.requireNonNull(file2, "file");
        this.mimeType = str;
        this.file = file2;
    }
}

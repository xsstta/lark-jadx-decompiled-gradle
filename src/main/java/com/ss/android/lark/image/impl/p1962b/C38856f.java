package com.ss.android.lark.image.impl.p1962b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.b.f */
class C38856f implements AbstractC38858h {

    /* renamed from: a */
    private File f99841a;

    @Override // com.ss.android.lark.image.impl.p1962b.AbstractC38858h
    /* renamed from: a */
    public InputStream mo142364a() throws IOException {
        return new FileInputStream(this.f99841a);
    }

    @Override // com.ss.android.lark.image.impl.p1962b.AbstractC38858h
    /* renamed from: b */
    public String mo142365b() {
        return this.f99841a.getAbsolutePath();
    }

    @Override // com.ss.android.lark.image.impl.p1962b.AbstractC38858h
    /* renamed from: c */
    public String mo142366c() {
        return String.format("%s_%s_%s", this.f99841a.getPath(), Long.valueOf(this.f99841a.length()), Long.valueOf(this.f99841a.lastModified()));
    }

    public C38856f(File file) {
        this.f99841a = file;
    }
}

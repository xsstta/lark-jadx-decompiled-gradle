package com.ss.android.lark.diskmanage.p1807a;

import com.ss.android.lark.diskmanage.cipher.DecryptException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

/* renamed from: com.ss.android.lark.diskmanage.a.f */
public interface AbstractC36802f {

    /* renamed from: com.ss.android.lark.diskmanage.a.f$a */
    public interface AbstractC36803a {
        /* renamed from: a */
        boolean mo10731a(File file);
    }

    /* renamed from: a */
    File mo135508a(String str) throws IOException;

    /* renamed from: a */
    void mo135520a() throws IOException;

    /* renamed from: a */
    void mo135521a(long j);

    /* renamed from: a */
    void mo135515a(String str, AbstractC36803a aVar) throws IOException;

    /* renamed from: a */
    void mo135516a(String str, File file) throws IOException;

    /* renamed from: a */
    void mo135518a(String str, Serializable serializable) throws IOException;

    /* renamed from: b */
    File mo135522b();

    /* renamed from: b */
    File mo135519b(String str) throws IOException, DecryptException;

    /* renamed from: c */
    long mo135523c();

    /* renamed from: c */
    InputStream mo135524c(String str) throws IOException, DecryptException;

    /* renamed from: d */
    <T extends Serializable> T mo135525d(String str) throws IOException, DecryptException;
}

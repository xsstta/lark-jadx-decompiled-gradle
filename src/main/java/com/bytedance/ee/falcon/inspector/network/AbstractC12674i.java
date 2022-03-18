package com.bytedance.ee.falcon.inspector.network;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.ee.falcon.inspector.network.i */
public interface AbstractC12674i {

    /* renamed from: com.bytedance.ee.falcon.inspector.network.i$a */
    public interface AbstractC12675a {
        /* renamed from: a */
        String mo48005a(int i);

        /* renamed from: a */
        String mo48006a(String str);

        /* renamed from: b */
        String mo48008b(int i);

        /* renamed from: g */
        int mo48013g();
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.network.i$b */
    public interface AbstractC12676b extends AbstractC12677c {
        /* renamed from: c */
        Integer mo48009c();

        /* renamed from: d */
        String mo48010d();

        /* renamed from: e */
        String mo48011e();

        /* renamed from: f */
        byte[] mo48012f() throws IOException;
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.network.i$c */
    public interface AbstractC12677c extends AbstractC12675a {
        /* renamed from: a */
        String mo48004a();

        /* renamed from: b */
        String mo48007b();
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.network.i$d */
    public interface AbstractC12678d extends AbstractC12679e {
        /* renamed from: b */
        String mo48015b();

        /* renamed from: e */
        boolean mo48018e();

        /* renamed from: f */
        int mo48019f();

        /* renamed from: h */
        boolean mo48020h();
    }

    /* renamed from: com.bytedance.ee.falcon.inspector.network.i$e */
    public interface AbstractC12679e extends AbstractC12675a {
        /* renamed from: a */
        String mo48014a();

        /* renamed from: c */
        int mo48016c();

        /* renamed from: d */
        String mo48017d();
    }

    /* renamed from: a */
    InputStream mo48054a(String str, String str2, String str3, InputStream inputStream, AbstractC12686o oVar);

    /* renamed from: a */
    void mo48055a(AbstractC12676b bVar);

    /* renamed from: a */
    void mo48056a(AbstractC12678d dVar);

    /* renamed from: a */
    void mo48057a(String str);

    /* renamed from: a */
    void mo48058a(String str, int i, int i2);

    /* renamed from: a */
    void mo48059a(String str, String str2);

    /* renamed from: a */
    boolean mo48060a();

    /* renamed from: b */
    String mo48061b();

    /* renamed from: b */
    void mo48062b(String str, int i, int i2);

    /* renamed from: b */
    void mo48063b(String str, String str2);
}

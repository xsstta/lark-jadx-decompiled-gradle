package com.bytedance.ee.bear.facade.glide.p383a.p386c.p387a;

import android.text.TextUtils;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.facade.glide.p383a.p386c.AbstractC7761e;
import com.bytedance.ee.bear.facade.glide.p383a.p386c.C7758b;
import com.bytedance.ee.bear.facade.glide.p383a.p386c.C7759c;
import com.bytedance.ee.bear.facade.glide.p383a.p386c.C7760d;
import com.bytedance.ee.bear.facade.glide.p383a.p386c.C7762f;
import com.bytedance.ee.bear.facade.glide.p383a.p386c.C7763g;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.bear.facade.glide.a.c.a.a */
public class C7756a implements AbstractC7757b {
    @Override // com.bytedance.ee.bear.facade.glide.p383a.p386c.p387a.AbstractC7757b
    /* renamed from: a */
    public boolean mo30398a(Response response) throws IOException {
        if (response == null) {
            return false;
        }
        return TextUtils.equals(response.header("access-new-default-thumbnail"), "true");
    }

    @Override // com.bytedance.ee.bear.facade.glide.p383a.p386c.p387a.AbstractC7757b
    /* renamed from: a */
    public InputStream mo30397a(C7754c cVar, Response response) throws IOException {
        AbstractC7761e eVar;
        if (TextUtils.equals(cVar.mo30389q(), "chat")) {
            eVar = new C7759c();
        } else if (TextUtils.equals(cVar.mo30389q(), "announcement")) {
            eVar = new C7758b();
        } else if (TextUtils.equals(cVar.mo30389q(), "template")) {
            eVar = new C7762f();
        } else if (TextUtils.equals(cVar.mo30389q(), "vc")) {
            eVar = new C7763g();
        } else {
            eVar = new C7760d();
        }
        return eVar.mo30399a(cVar, response);
    }
}

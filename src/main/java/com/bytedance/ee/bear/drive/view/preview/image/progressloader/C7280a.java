package com.bytedance.ee.bear.drive.view.preview.image.progressloader;

import com.bytedance.ee.bear.drive.view.preview.image.progressloader.decode.AbstractC7336b;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p368a.C7285c;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.a */
public class C7280a {

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.a$a */
    public static class C7281a {

        /* renamed from: a */
        private final C7341e f19520a;

        /* renamed from: b */
        public void mo28456b() {
            this.f19520a.mo28598c();
        }

        /* renamed from: a */
        public void mo28455a() {
            this.f19520a.mo28597b();
            this.f19520a.mo28598c();
        }

        public C7281a(AbstractC7322c cVar, C7341e eVar) {
            this.f19520a = eVar;
        }
    }

    /* renamed from: a */
    public <R, S> C7281a mo28454a(C7285c cVar, AbstractC7336b<R, S> bVar, AbstractC7322c<R, S> cVar2, int i, int i2) {
        C13479a.m54764b("ProgressiveImageLoader", "start loader job...");
        C7341e eVar = new C7341e(cVar, bVar, cVar2, i, i2);
        eVar.mo28596a();
        return new C7281a(cVar2, eVar);
    }
}

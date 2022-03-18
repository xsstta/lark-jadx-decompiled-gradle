package com.ss.android.lark.image.impl.p1968h;

import com.bumptech.glide.load.p085b.C2241r;
import com.bytedance.lark.sdk.LarkNet;
import com.ss.android.lark.image.api.AbstractC38809a;
import com.ss.android.lark.image.api.AbstractC38814e;
import com.ss.android.lark.image.api.AbstractC38815f;
import com.ss.android.lark.image.api.C38813d;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.h.b */
public class C38907b implements AbstractC38814e<C38813d, InputStream> {

    /* renamed from: a */
    private LarkNet f99985a;

    /* renamed from: com.ss.android.lark.image.impl.h.b$a */
    public static class C38908a implements AbstractC38815f<C38813d, InputStream> {

        /* renamed from: a */
        private LarkNet f99986a = new LarkNet();

        @Override // com.ss.android.lark.image.api.AbstractC38815f
        /* renamed from: a */
        public void mo142241a() {
        }

        @Override // com.ss.android.lark.image.api.AbstractC38815f
        /* renamed from: a */
        public AbstractC38814e<C38813d, InputStream> mo142240a(C2241r rVar) {
            return new C38907b(this.f99986a);
        }
    }

    public C38907b(LarkNet eVar) {
        this.f99985a = eVar;
    }

    /* renamed from: a */
    public AbstractC38809a<InputStream> mo142239a(C38813d dVar, int i, int i2) {
        return new C38909c(this.f99985a, dVar.mo142235a(), dVar.mo142236b(), i, i2);
    }
}

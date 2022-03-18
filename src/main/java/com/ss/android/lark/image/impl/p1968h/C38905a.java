package com.ss.android.lark.image.impl.p1968h;

import com.bumptech.glide.load.p085b.C2219g;
import com.bumptech.glide.load.p085b.C2241r;
import com.bytedance.lark.sdk.LarkNet;
import com.ss.android.lark.image.api.AbstractC38809a;
import com.ss.android.lark.image.api.AbstractC38814e;
import com.ss.android.lark.image.api.AbstractC38815f;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.h.a */
public class C38905a implements AbstractC38814e<C2219g, InputStream> {

    /* renamed from: a */
    private LarkNet f99983a;

    /* renamed from: com.ss.android.lark.image.impl.h.a$a */
    public static class C38906a implements AbstractC38815f<C2219g, InputStream> {

        /* renamed from: a */
        private LarkNet f99984a = new LarkNet();

        @Override // com.ss.android.lark.image.api.AbstractC38815f
        /* renamed from: a */
        public void mo142241a() {
        }

        @Override // com.ss.android.lark.image.api.AbstractC38815f
        /* renamed from: a */
        public AbstractC38814e<C2219g, InputStream> mo142240a(C2241r rVar) {
            return new C38905a(this.f99984a);
        }
    }

    public C38905a(LarkNet eVar) {
        this.f99983a = eVar;
    }

    /* renamed from: a */
    public AbstractC38809a<InputStream> mo142239a(C2219g gVar, int i, int i2) {
        return new C38909c(this.f99983a, gVar.mo10576b(), gVar.mo10577c(), i, i2);
    }
}

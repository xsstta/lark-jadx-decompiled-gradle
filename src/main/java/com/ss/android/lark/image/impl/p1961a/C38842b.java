package com.ss.android.lark.image.impl.p1961a;

import com.bumptech.glide.load.p085b.C2241r;
import com.ss.android.lark.image.api.AbstractC38809a;
import com.ss.android.lark.image.api.AbstractC38814e;
import com.ss.android.lark.image.api.AbstractC38815f;
import com.ss.android.lark.image.entity.AvatarImage;
import java.io.InputStream;

/* renamed from: com.ss.android.lark.image.impl.a.b */
public class C38842b implements AbstractC38814e<AvatarImage, InputStream> {

    /* renamed from: com.ss.android.lark.image.impl.a.b$a */
    public static class C38843a implements AbstractC38815f<AvatarImage, InputStream> {
        @Override // com.ss.android.lark.image.api.AbstractC38815f
        /* renamed from: a */
        public void mo142241a() {
        }

        @Override // com.ss.android.lark.image.api.AbstractC38815f
        /* renamed from: a */
        public AbstractC38814e<AvatarImage, InputStream> mo142240a(C2241r rVar) {
            return new C38842b();
        }
    }

    /* renamed from: a */
    public AbstractC38809a<InputStream> mo142239a(AvatarImage avatarImage, int i, int i2) {
        return new C38841a(avatarImage);
    }
}

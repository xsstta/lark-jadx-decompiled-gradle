package com.bumptech.glide.load.engine.p088b;

import androidx.core.util.Pools;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.util.C2564g;
import com.bumptech.glide.util.C2567j;
import com.bumptech.glide.util.C2568k;
import com.bumptech.glide.util.p097a.AbstractC2554c;
import com.bumptech.glide.util.p097a.C2545a;
import com.ss.android.lark.log.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bumptech.glide.load.engine.b.k */
public class C2323k {

    /* renamed from: a */
    private AbstractC2325a f7705a;

    /* renamed from: b */
    private final C2564g<AbstractC2265c, String> f7706b = new C2564g<>(1000);

    /* renamed from: c */
    private final Pools.AbstractC0839a<C2326b> f7707c = C2545a.m10851a(10, new C2545a.AbstractC2549a<C2326b>() {
        /* class com.bumptech.glide.load.engine.p088b.C2323k.C23241 */

        /* renamed from: a */
        public C2326b mo10754b() {
            try {
                return new C2326b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    });

    /* renamed from: com.bumptech.glide.load.engine.b.k$a */
    public interface AbstractC2325a {
        /* renamed from: a */
        boolean mo10755a(AbstractC2265c cVar);

        /* renamed from: b */
        boolean mo10756b(AbstractC2265c cVar);

        /* renamed from: c */
        String mo10757c(AbstractC2265c cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.engine.b.k$b */
    public static final class C2326b implements C2545a.AbstractC2551c {

        /* renamed from: a */
        final MessageDigest f7709a;

        /* renamed from: b */
        private final AbstractC2554c f7710b = AbstractC2554c.m10866a();

        @Override // com.bumptech.glide.util.p097a.C2545a.AbstractC2551c
        public AbstractC2554c e_() {
            return this.f7710b;
        }

        C2326b(MessageDigest messageDigest) {
            this.f7709a = messageDigest;
        }
    }

    public C2323k() {
    }

    public C2323k(AbstractC2325a aVar) {
        this.f7705a = aVar;
    }

    /* renamed from: a */
    public String mo10752a(AbstractC2265c cVar) {
        String c;
        synchronized (this.f7706b) {
            c = this.f7706b.mo11252c(cVar);
        }
        if (c == null) {
            c = m9901b(cVar);
        }
        synchronized (this.f7706b) {
            this.f7706b.mo11250b(cVar, c);
        }
        return c;
    }

    /* renamed from: b */
    private String m9901b(AbstractC2265c cVar) {
        AbstractC2325a aVar = this.f7705a;
        if (aVar == null || !aVar.mo10755a(cVar)) {
            C2326b bVar = (C2326b) C2567j.m10894a(this.f7707c.acquire());
            try {
                cVar.updateDiskCacheKey(bVar.f7709a);
                return C2568k.m10906a(bVar.f7709a.digest());
            } finally {
                this.f7707c.release(bVar);
            }
        } else {
            Log.m165389i("SafeKeyGenerator", "Get: Calculated safe key for data cache key: " + cVar);
            return this.f7705a.mo10757c(cVar);
        }
    }
}

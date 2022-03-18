package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.engine.p087a.AbstractC2278b;
import com.bumptech.glide.util.C2564g;
import com.bumptech.glide.util.C2568k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.w */
public final class C2385w implements AbstractC2265c {

    /* renamed from: b */
    private static final C2564g<Class<?>, byte[]> f7911b = new C2564g<>(50);

    /* renamed from: c */
    private final AbstractC2278b f7912c;

    /* renamed from: d */
    private final AbstractC2265c f7913d;

    /* renamed from: e */
    private final AbstractC2265c f7914e;

    /* renamed from: f */
    private final int f7915f;

    /* renamed from: g */
    private final int f7916g;

    /* renamed from: h */
    private final Class<?> f7917h;

    /* renamed from: i */
    private final C2390f f7918i;

    /* renamed from: j */
    private final AbstractC2393i<?> f7919j;

    /* renamed from: a */
    public AbstractC2265c mo10892a() {
        return this.f7913d;
    }

    /* renamed from: b */
    private byte[] m10117b() {
        C2564g<Class<?>, byte[]> gVar = f7911b;
        byte[] c = gVar.mo11252c(this.f7917h);
        if (c != null) {
            return c;
        }
        byte[] bytes = this.f7917h.getName().getBytes(f7599a);
        gVar.mo11250b(this.f7917h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        int hashCode = (((((this.f7913d.hashCode() * 31) + this.f7914e.hashCode()) * 31) + this.f7915f) * 31) + this.f7916g;
        AbstractC2393i<?> iVar = this.f7919j;
        if (iVar != null) {
            hashCode = (hashCode * 31) + iVar.hashCode();
        }
        return (((hashCode * 31) + this.f7917h.hashCode()) * 31) + this.f7918i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f7913d + ", signature=" + this.f7914e + ", width=" + this.f7915f + ", height=" + this.f7916g + ", decodedResourceClass=" + this.f7917h + ", transformation='" + this.f7919j + '\'' + ", options=" + this.f7918i + '}';
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (!(obj instanceof C2385w)) {
            return false;
        }
        C2385w wVar = (C2385w) obj;
        if (this.f7916g != wVar.f7916g || this.f7915f != wVar.f7915f || !C2568k.m10912a(this.f7919j, wVar.f7919j) || !this.f7917h.equals(wVar.f7917h) || !this.f7913d.equals(wVar.f7913d) || !this.f7914e.equals(wVar.f7914e) || !this.f7918i.equals(wVar.f7918i)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f7912c.mo10672b(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f7915f).putInt(this.f7916g).array();
        this.f7914e.updateDiskCacheKey(messageDigest);
        this.f7913d.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        AbstractC2393i<?> iVar = this.f7919j;
        if (iVar != null) {
            iVar.updateDiskCacheKey(messageDigest);
        }
        this.f7918i.updateDiskCacheKey(messageDigest);
        messageDigest.update(m10117b());
        this.f7912c.mo10671a(bArr);
    }

    C2385w(AbstractC2278b bVar, AbstractC2265c cVar, AbstractC2265c cVar2, int i, int i2, AbstractC2393i<?> iVar, Class<?> cls, C2390f fVar) {
        this.f7912c = bVar;
        this.f7913d = cVar;
        this.f7914e = cVar2;
        this.f7915f = i;
        this.f7916g = i2;
        this.f7919j = iVar;
        this.f7917h = cls;
        this.f7918i = fVar;
    }
}
